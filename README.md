# Company Microservice

## Overview
This microservice is part of the JobApp project. It handles company-related operations.

## Tech Stack
- Java 17 / Spring Boot
- Maven
- Docker

## Running Locally
### Prerequisites
- JDK 17
- Maven
- Docker

### Build
```bash
mvn clean package -DskipTests
```

GitHub Actions builds the app, pushes the Docker image to Docker Hub, and updates the GitOps repo automatically.

Workflow file: .github/workflows/ci-cd.yml
