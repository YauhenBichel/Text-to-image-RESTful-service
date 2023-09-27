# REST-API-for-Stable-Diffusion-model
REST API service for images generation using Stable Diffusion model based on prompt and receiving a link to a generated image

## How to run
>gradle build


## Overview
Generative AI is widely used in many applications for text generation, speech to text, text
to image, image to text and many other different transformations. One of possible areas for
using generative AI is creating some demonstration of features or design of some game rooms
or areas, for example, in game development or movies making.
The purpose of this project is to provide an API for generating images using text. For that
I am going to use text-to-image model Stable Diffusion.
The model will be used by TensorFlow serving, which is placed in Flask RESTful
service. The components of the applications are connected via the Kafka message system. The
generated images should be saved in AWS S3 storage. The links to the images are in the
database.

## Core features
- Generate image based on text
- Receiving link to the generated image
- The links to corresponding generated images are active during 24 hours.
- An application for finding expired links and removing these links with corresponding
  images. The application needs to have a command line interface for running.
###  Technical implementation:
- Flask Restful service with TF serving and Stable Diffusion model
- Database for storing links to generated images
- Storage for generated images
- AWS storage for generated images
- A command line interface application for removing expired links and corresponding
  images.
- Unit tests

## Optional features
- Configuration of images lifetime
- The application for removing expired links needs to run by scheduling at 12 am every 24
  hours.
- Provides asynchronous API, because image generation can be a long request.
###  Technical implementation:
- Kafka as a message broker for keeping long handling asynchronous messages
- A scheduled job for removing image and link to them with reference to ending of their
  lifetime
- Integration tests

### Languages and Tools
Java 17, Spring Boot, AWS S3 Storage, Redis, Kafka, Python, TensorFlow, Keras

### References
- [https://blog.tensorflow.org/2023/04/serving-with-tf-and-gke-stable-diffusion.html](https://blog.tensorflow.org/2023/04/serving-with-tf-and-gke-stable-diffusion.html)
- [https://flask.palletsprojects.com/en/2.3.x/](https://flask.palletsprojects.com/en/2.3.x/)
- [https://github.com/CompVis/stable-diffusion](https://github.com/CompVis/stable-diffusion)

### References to Tools
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.4/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.4/gradle-plugin/reference/html/#build-image)
* [Spring Security](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#web.security)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Spring for Apache Kafka](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#messaging.kafka)
* [Spring Data Redis (Access+Driver)](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#data.nosql.redis)

### Guides
The following guides illustrate how to use some features concretely:

* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
- build an image
>docker build -t texttoimage/myapp .

- run the app using docker
>docker run -p 8080:8080 texttoimage/myapp
