
# QUIZ -> BACKEND CON SPRING BOOT

**Quiz Backend Spring Boot** es una API REST desarrollada en **Java** utilizando **Spring Boot**, **Hibernate/JPA**, **Lombok** y **PostgreSQL**.  

El objetivo:
Construir backend de una aplicación **quiz multiplataforma**, 
que permita gestionar preguntas, respuestas y resultados de usuarios.

Este proyecto forma parte de mi portfolio como estudiante de 2º de DAM,
enfocado en el desarrollo backend profesional con Java.

---

## TECNOLOGÍAS UTILIZADAS
- **Java 17**
- **Spring Boot**
- **Spring Data JPA / Hibernate**
- **PostgreSQL**
- **Lombok**
- **Maven**
- **Git / GitHub**
- **Hibernate**
- *(DevTools para recarga automática)*

---

## ARQUITECTURA
**MVC (Model-View-Controller)** 

La API expone endpoints REST que devuelven y reciben datos en formato **JSON**.  
El sistema gestiona entidades como:
    - Usuario 
    - Pregunta 
    - Respuesta 
    - Resultado 

---

## ESTRUCTURA DEL PROYECTO

quiz-backend-springboot/
│
├── src/
│ ├── main/
│ │ ├── java/com/javAnibal/quiz/
│ │ │ ├── controller/
│ │ │ ├── service/
│ │ │ ├── repository/
│ │ │ └── model/
│ │ └── resources/
│ │ ├── application.yml
│ │ └── data/
│ └── test/java/com/javAnibal/quiz/
│
├── docs/architecture.md
├── pom.xml
└── README.md


---

# Clonar el repositorio
git clone https://github.com/javAnibal/quiz-backend-springboot.git

# Ejecutar aplicación (desde IDE o terminal)
// mvn spring-boot:run


# quiz-backend-springboot
Quiz - sistema de preguntas y respuestas + API REST backend que gestiona usuarios, preguntas, respuestas y resultados.

