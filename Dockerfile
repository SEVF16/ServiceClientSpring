# Etapa de construcción
FROM maven:3.8.4-openjdk-17 AS builder

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo pom.xml para descargar las dependencias
COPY pom.xml .

# Descargar las dependencias del proyecto (esto se realizará en una capa separada para aprovechar la caché de Docker)
RUN mvn dependency:go-offline

# Copiar el resto del código fuente
COPY src src/

# Compilar el proyecto y generar el archivo JAR
RUN mvn package

# Etapa de ejecución
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR generado desde la etapa de construcción al contenedor de ejecución
COPY --from=builder /app/target/serviceClient.jar app.jar

# Puerto en el que la aplicación expone su servicio
EXPOSE 8080

# Comando para ejecutar la aplicación al iniciar el contenedor
ENTRYPOINT ["java", "-jar", "app.jar"]


