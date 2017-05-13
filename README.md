# STELEKS web application 

[Backend: Java Spring](https://github.com/esensar/steleks_backend)  
[Frontend: Angular 2](https://github.com/dizda13/steleks_frontend)

## STELEKS Backend

To run first run **config server**

    ./gradlew config_server:bootRun

After that run **eureka server**

    ./gradlew eureka-service:bootRun

After that we can run **all services**

    ./gradlew users:bootRun
    ./gradlew events:bootRun
    ./gradlew teams:bootRun

After that optionally run **proxy**

    ./gradlew steleks-proxy:bootRun
