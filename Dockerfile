FROM maven:3-openjdk-11-slim
 MAINTAINER yury.sadouskiy@gmail.com
 RUN apt-get update && \
     apt-get upgrade -y && \
     apt-get install -y git
 WORKDIR app
 EXPOSE 8080
 RUN git clone https://github.com/SadouskiYury/Spring-Web-Application.git
 RUN mvn install -f Spring-Web-Application/pom.xml
 WORKDIR Spring-Web-Application/target
 CMD ["java","-jar","spring-web_app-1.0.jar"]
