# Usar la imagen base de Java 17
FROM adoptopenjdk:17-jre-hotspot

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR de la aplicación a la imagen
COPY target/my-application.jar /app

# Puerto en el que la aplicación expone su servicio
EXPOSE 8080

# Comando para ejecutar la aplicación al iniciar el contenedor
CMD ["java", "-jar", "my-application.jar"]

