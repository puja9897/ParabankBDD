pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from GitHub repository
                git 'https://github.com/puja9897/ParabankBDD.git'
            }
        }

        stage('Build and Test') {
            steps {
                // Run Maven build and tests
                bat 'mvn clean install'
                bat 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                // Placeholder for deploy actions
                echo 'Deploying Parabank Application'
            }
        }
    }

    post {
        always {
            // Clean workspace after each build
            cleanWs()
        }
    }
}
