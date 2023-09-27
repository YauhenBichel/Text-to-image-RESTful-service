# REST-API-for-Stable-Diffusion-model
REST API service for images generation using Stable Diffusion model based on prompt and receiving a link to a generated image

## How to run

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
