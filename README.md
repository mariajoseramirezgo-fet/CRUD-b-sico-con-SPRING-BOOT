# Sistema de Gestión de Biblioteca
Este proyecto es un sistema sencillo para manejar libros en una biblioteca.  
Fue hecho en Java con Spring Boot y nos permite agregar, consultar, actualizar y eliminar libros.

## Tecnologías usadas
- Java 17
- Spring Boot   
- Spring Data JPA  
- H2 Database   
## Integrantes y responsabilidades
-**Integrante 1**

-Crear la entidad Libro en el paquete model.
-Crear el LibroRepository en el paquete repository.
-Completar el README.md y subir ejemplos de pruebas al repo.

**Integrante 2**

-Crear el controlador LibroController en el paquete controller.
-Manejar los endpoints del CRUD.
-Probar con Postman la parte de actualizar y eliminar libros.

**Integrante 3**
-Implementar el servicio (LibroService) en el paquete service.
-Probar con Postman la parte de crear, listar y obtener libros.

## Entidad principal: Libro
Cada libro tiene:  
- `id` → número único que se genera automáticamente.  
- `titulo` → nombre del libro.  
- `autor` → autor del libro.  
- `anioPublicacion` → año en que se publicó.  
- `disponible` → si el libro está disponible o no.
- 
## Funcionalidades del sistema
1. Crear libro
2. Listar todos los libros  
3. Obtener libro por ID  
4. Actualizar libro  
5. Eliminar libro 

##  Cómo ejecutar el proyecto
1. Clonar este repositorio con Git.  
   ```bash
   git clone 
