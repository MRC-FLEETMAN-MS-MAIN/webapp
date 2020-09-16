node {
    
    stage('Preparation') { 
      
        git 'https://github.com/MRC-FLEETMAN-MS-MAIN/webapp'
      
    }
    stage('Build') {
                sh "mvn package"
            
    }
    stage('Results') {
        junit '**/target/surefire-reports/TEST-*.xml'
        archiveArtifacts 'target/*.war'
    } 
    
     stage('Deploy'){
        
        withCredentials([[$class: 'AmazonWebServicesCredentialsBinding', accessKeyVariable: 'AWS_ACCESS_KEY_ID', credentialsId: 'awscreds', secretKeyVariable: 'AWS_SECRET_ACCESS_KEY']]) {
    ansiblePlaybook credentialsId: 'sshcred', installation: 'ansible-installation', playbook: 'deploy.yaml'
}
        
       
    }
       
    
    
}
