pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh './gradlew assemble'
            }
        }

        stage('deploy') {
            steps {
              sh 'scp build/libs/*.jar root@test:/home'
            }
        }
    }
}