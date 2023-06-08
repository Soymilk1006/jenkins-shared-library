#!/usr/bin/env groovy

def call () {
echo "building the docker image..."
withCredentials([usernamePassword(credentialsId: 'docker-hub-credential', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
    sh 'docker build -t legendlight/docker_image:jma-2.0 .'
    sh "echo $PASS | docker login -u $USER --password-stdin"
    sh 'docker push legendlight/docker_image:jma-2.0'
    }
}
