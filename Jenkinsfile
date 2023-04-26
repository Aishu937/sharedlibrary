@Library('sharedlibrary') _
pipeline{
  agent {
    label 'masternodes'}
  stages {
    stage("demo") {
      steps {
        sharedlibrary_demo()
      }
    }
  }
}
