node{
    stage('Clone Repository'){
        git credentialsId: 'Git-Creds', url: 'https://github.com/Saleem313/SpringBootRest-App.git'
    }
    stage('Build'){
        def mavenHome = tool name: "Maven-3.8.7", type: "maven"
        def mavenCMD = "${mavenHome}/bin/mvn"
        sh "${mavenCMD} clean package"
    }
    stage('Build image'){
        sh 'docker build -t saleem786/spring-boot-rest-img .'
    }
    stage('Push Docker image'){
       withCredentials([string(credentialsId: 'Docker_Creds', variable: 'Docker_Creds')]) {
          sh 'docker login -u saleem786 -p ${Docker_Creds}'
          sh 'docker push saleem786/spring-boot-rest-img'
          sh 'docker rmi saleem786/spring-boot-rest-img'
        }
    }
    stage('Deploy on k8s Cluster'){
        withCredentials([kubeconfigContent(credentialsId: 'KubeConfig', variable: 'KUBECONFIG_CONTENT')]) {
          sh 'kubectl delete deployment springboot-rest-app-deployment'
          sh 'kubectl apply -f k8-components/deployment.yml'
          sh 'kubectl apply -f k8-components/service.yml'
        }
    }
}