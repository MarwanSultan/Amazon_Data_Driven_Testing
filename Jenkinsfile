pipeline {
    agent any

    environment {
        MAVEN_HOME = tool name: 'Maven 3', type: 'Tool'
        JAVA_HOME = tool name: 'JDK 11', type: 'Tool'
        // Define the location of your IntelliJ IDEA installation if needed
        //IDEA_HOME = '/path/to/intellij' // Optional if you need IntelliJ IDE setup
    }

    stages {
        stage('Checkout') {
            steps {
                // Clone the repository from GitHub
                git 'https://github.com/MarwanSultan/Amazon---Data-Driven-Testing.git'
            }
        }

        stage('Setup') {
            steps {
                // Setup Maven and Java environments
                script {
                    echo "Setting up the build environment"
                    sh 'echo $JAVA_HOME'
                    sh 'echo $MAVEN_HOME'
                }
            }
        }

        stage('Build') {
            steps {
                // Use Maven to build the project
                script {
                    echo "Building the project using Maven"
                    sh "'${MAVEN_HOME}/bin/mvn' clean install"
                }
            }
        }

        stage('Run Selenium Tests') {
            steps {
                // Execute the Selenium tests with Maven
                script {
                    echo "Running Selenium WebDriver tests"
                    sh "'${MAVEN_HOME}/bin/mvn' test"
                }
            }
        }

        stage('Publish Test Results') {
            steps {
                // Publish the results (Optional, to generate test reports)
                junit '**/target/test-*.xml'  // Adjust if necessary based on your test report location
            }
        }
    }

    post {
        always {
            echo "Cleaning up workspace"
            cleanWs() // Clean up the workspace after the job finishes
        }

        success {
            echo "Build and tests completed successfully!"
        }

        failure {
            echo "Build or tests failed. Please check the logs."
        }
    }
}
