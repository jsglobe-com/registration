# Registration Service
 
 A small containerized service including database and rest-service api



# How to 

* clone repo
```bash
 git clone https://github.com/jsglobe-com/registration.git
 cd registration
```

* Run it locally on **docker**

```bash
 docker-compose up
```

* build/run locally via **gradle**
```bash
  ./gradlew clean build bootRun
```

* run via **java** and a local **mysql**
```bash
./gradlew build 
java -jar ./build/lib/registration-0.0.1.jar
```
