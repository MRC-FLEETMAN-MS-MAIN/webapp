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
       
    
    
}
