// vars/trivy_scan.groovy
def call() {
    try {
        sh 'trivy fs --exit-code 1 --severity HIGH,CRITICAL .'
    } catch (Exception e) {
        error "Trivy scan failed: ${e.message}"
    }
}
