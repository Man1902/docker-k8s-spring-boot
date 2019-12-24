FROM openjdk:8
ADD target/docker-k8s-spring-boot-0.0.1-SNAPSHOT.jar docker-k8s-spring-boot.jar
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "docker-k8s-spring-boot.jar"]