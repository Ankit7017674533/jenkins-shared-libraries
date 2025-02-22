def call(String Project, String ImageTag, String dockerhubuser) {
    withCredentials([usernamePassword(credentialsId: 'docker', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerHubUser')]) {
        sh """
            echo "\$dockerhubpass" | docker login -u "\$dockerhubuser" --password-stdin
        """
    }
    sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
