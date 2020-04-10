pipeline {
   agent any
   
   triggers {
        cron('* 10 * * *')
    }
   
   
   tools {
      // Install the Maven version configured as "M3" and add it to the path.
      maven "mavenl"
      jdk 'jdkl'
      
   }
   

   
   
   stages {
      stage('Build') {
         steps {
            // Get some code from a GitHub repository
         https://github.com/shivamlatiyan98/finaltrigger.git

            echo 'Triggering at 10 am'

            // To run Maven on a Windows agent, use
             bat "mvn -Dmaven.test.failure.ignore=true clean package"
         }

         post {
            // If Maven was able to run the tests, even if some of the test
            // failed, record the test results and archive the jar file.
            success {
               junit '**/target/surefire-reports/TEST-*.xml'
               archiveArtifacts 'target/*.jar'
            }
         }
      }
   }
}
