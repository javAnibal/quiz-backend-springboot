# Quiz


## Descripción del Proyecto
API REST desarrollada en Spring Boot para la gestión de quizzes educativos.
Este sistema permite crear, administrar y realizar trivias con preguntas de opción múltiple.
Ideal para plataformas de aprendizaje, evaluaciones educativas.

### Características Principales

- **Gestión de Quizzes:** Crear, leer, actualizar y eliminar quizzes
- **Preguntas Múltiples:** Cada quiz contiene múltiples preguntas
- **Respuestas de Opción Múltiple:** Opciones A, B, C, D con una respuesta correcta
- **Categorización:** Organización por categorías educativas
- **Base de Datos PostgreSQL:** Persistencia de datos
- **Dockerizado:** Despliegue con Docker Compose
- **API REST:** Endpoints completos para integración frontend

### Arquitectura del Proyecto -> MVC

``` 
quiz-backend-springboot/
├── 📁 config/
├── 📁 controller/ 
├── 📁 model/ 
├── 📁 repository/ 
├── 📁 service/ 
├── 📁 enums/ 
└── 📄 application.properties
``` 

### Categorías Disponibles

- **FUNDAMENTOS** - Conceptos básicos
- **OBJETOS** - Programación orientada a objetos
- **HERENCIA** - Herencia y composición
- **POLIMORFISMO** - Polimorfismo e interfaces

---

### Tecnologías Utilizadas

- Java 21 
- Spring Boot 3.x
- Spring Data JPA
- PostgreSQL
- Lombok
- Docker
- Maven

---

### Pre-Requisitos

- Java 21 o superior
- PostgreSQL 15
- Maven 3.6+
- Docker 

--- 

### Configuración e Instalación

```
 La aplicación estará disponible en: http://localhost:8080
 ```

###  Clonar 

``` 
  git clone https://github.com/tu-usuario/quiz-backend-springboot.git
  cd quiz-backend-springboot
  docker-compose up --build
```

```
 # Ejecutar PostgreSQL en puerto 5433
   docker run --name quiz-db -e POSTGRES_DB=quiz_backend_db \
   -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=admin \
   -p 5433:5432 -d postgres:15
 ```

```
# Ejecutar y compilar
  mvn clean package
  java -jar target/quiz-0.0.1-SNAPSHOT.jar
```

#### Quizzes
```
GET /api/quizzes - Obtener todos los quizzes
GET /api/quizzes/{id} - Obtener quiz por ID
POST /api/quizzes - Crear nuevo quiz
PUT /api/quizzes/{id} - Actualizar quiz
DELETE /api/quizzes/{id} - Eliminar quiz
```
--- 
#### Preguntas
```
GET /api/preguntas - Obtener todas las preguntas
GET /api/preguntas/{id} - Obtener pregunta por ID
POST /api/preguntas - Crear nueva pregunta
PUT /api/preguntas/{id} - Actualizar pregunta
DELETE /api/preguntas/{id} - Eliminar pregunta
```
---
#### Respuestas

```
GET /api/respuestas - Obtener todas las respuestas
GET /api/respuestas/{id} - Obtener respuesta por ID
POST /api/respuestas - Crear nueva respuesta
PUT /api/respuestas/{id} - Actualizar respuesta
DELETE /api/respuestas/{id} - Eliminar respuesta
```
---
### Autor: Anibal Solano

- GitHub: [@javAnibal](https://github.com/javAnibal)
- LinkedIn: [Mi perfil](https://www.linkedin.com/in/https://www.linkedin.com/in/anibal-solano-f//)
- Email: [a88anibal@gmail.com](mailto:a88anibal@gmail.com)

