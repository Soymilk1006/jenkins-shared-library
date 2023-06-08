#!/usr/bin/en groovy
def call (){
    echo "building the application..."
    sh 'mvn package'
}