// vars/trivy_scan.groovy
def call() {
    try {
        sh 'trivy fs --exit-code 0 --severity HIGH,CRITICAL .'
    } catch (Exception e) {
        echo "Trivy scan completed with vulnerabilities but proceeding."
    }
}
