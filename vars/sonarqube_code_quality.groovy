// vars/sonarqube_code_quality.groovy
def call() {
    timeout(time: 1, unit: 'MINUTES') {
        waitForQualityGate abortPipeline: false
    }
}
