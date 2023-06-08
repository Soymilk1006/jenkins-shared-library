#!/usr/bin/en groovy

def call (){
    echo "building the application... branch $BRANCH_NAME "
    sh 'mvn package'
}