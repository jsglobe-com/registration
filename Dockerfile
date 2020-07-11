FROM gradle as builder

WORKDIR /home

COPY build.gradle.kts build.gradle.kts
COPY settings.gradle.kts settings.gradle.kts

COPY src src

RUN gradle build

FROM openjdk:16-slim as release

RUN mkdir -p /home/app
WORKDIR /home/app
COPY --from=builder /home/build/libs/registration-0.0.1.jar /home/app/registration.jar

ENTRYPOINT ["java", "-jar", "/home/app/registration.jar"]