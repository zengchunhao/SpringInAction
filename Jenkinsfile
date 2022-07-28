pipeline {
    agent any
    stages {
//         stage('test'){
//           steps {
//               sh './gradlew bootBuildImage --imageName=zh/spring-boot-docker'
//           }
//         }

        stage('build') {
            steps {
                sh './gradlew bootJar'
            }
        }

        stage('deploy') {
            steps {
              sh 'scp build/libs/*.jar zh@tc:/home/zh/java'
            }
        }
    }
}