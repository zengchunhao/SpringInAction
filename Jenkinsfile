pipeline {
    agent {
      label 'docker'
    }
    stages {
        stage('build') {
            agent {
               docker {
                 label 'docker'
                 image 'gradle:jdk17-alpine'
               }
            }
            steps {
                sh 'gradle --version'
            }
        }
    }
}