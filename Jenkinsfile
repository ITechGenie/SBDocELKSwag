pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn -B -DskipTests clean package'
      }
    }
    stage('Test') {
      steps {
        sh 'echo date'
      }
    }
    stage('Install') {
      steps {
        sh 'mvn -DskipTests install'
      }
      post {
        always {
           sh 'pwd'
           sh 'echo date'
        }
      }
    }
    stage('StartApps') {
    	steps {
	       sh 'pwd'
       }
    }
  }
}