// vars/sonarqube_code_quality.groovy
def call() {
    timeout(time: 5, unit: 'MINUTES') {
        waitForQualityGate abortPipeline: true
    }
}
