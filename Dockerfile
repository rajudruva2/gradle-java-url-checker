FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY . .
RUN gradle --no-daemon build
CMD ["gradle","run"]
