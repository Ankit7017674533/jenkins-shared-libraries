// vars/trivy_scan.groovy
def call() {
    sh '''
    trivy fs --exit-code 1 --severity HIGH,CRITICAL .
    '''
}
