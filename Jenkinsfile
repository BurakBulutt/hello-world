pipeline {
    agent any
    triggers {
        githubPush()
    }
    environment {
        WORKDIR = '/home/ubuntu/hello-world'
    }
    tools {
        maven 'maven3.9.9'
    }
    stages {
        stage('Pull Latest') {
            steps {
                dir(WORKDIR) {
                    sh 'git fetch'
                    sh 'git checkout dev'
                    sh 'git pull'
                }
            }
        }
        stage('Build with Maven') {
            steps {
                dir(WORKDIR) {
                    sh 'mvn clean package'
                }
            }
        }
        stage('Deploy with Docker') {
            steps {
                dir(WORKDIR) {
                    sh 'bash deploy.sh'
                }
            }
        }
    }
    post {
        success {
            echo 'Deployment completed.'
        }
        failure {
            echo 'Deployment failed.'
        }
    }
}
