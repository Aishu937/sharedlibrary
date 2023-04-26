@Library('sharedLibrary') _

pipeline {
  agent {
    label 'node1'
  }

  stages {
    stage('Print Variable') {
      steps {
        script {
          sharedlib()
        }
      }
    }
  }
}
