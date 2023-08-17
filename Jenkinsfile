pipeline {
    agent any
    tools{
        maven 'Maven_3.9.2'
    }
    stages{
        stage('Build Project'){
            steps{
                checkout([
                        $class: 'GitSCM',
                        branches: [[name: 'master']],
                        doGenerateSubmoduleConfigurations: false,
                        extensions: [[$class: 'CleanCheckout']],
                        submoduleCfg: [],
                        userRemoteConfigs: [[credentialsId: 'gitCredentials', url: 'https://github.com/nhandn-devops/swiggy']]
                    ])
                sh 'mvn clean install'
            }
        }
    }
}