def call() {
    stage('Static Analysis with SonarQube') {
        script {
            withSonarQubeEnv('SonarQube') {
                sh "${tool 'maven'}/bin/mvn clean package -Dmaven.test.skip=true sonar:sonar"
            }
        }
    }
}
