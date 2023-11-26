# SchoolManagementSystem

Este proyecto desarrollado en Java implementa un sistema académico que gestiona estudiantes y cursos.

## Ramas

Se ha creado una nueva rama llamada `feature-students-system-model` para trabajar los cambios en ella.

## Clases

### Estudiante

- Atributos: id, nombre, apellido, fecha de nacimiento y estado (matriculado, inactivo, graduado).

### Curso

- Atributos: id, nombre, descripción, número de créditos y versión.

### GestorAcademico

- Utiliza estructuras de datos como ArrayList para almacenar estudiantes, otro ArrayList para cursos y un HashMap para mantener la lista de estudiantes inscritos en cada curso.

## Implementación de Interfaz ServiciosAcademicosI

Se han definido comportamientos para la administración de cursos y estudiantes con los siguientes métodos:

- matricularEstudiante(Estudiante estudiante): Agrega un estudiante a la lista si no está matriculado.
- agregarCurso(Curso curso): Añade un nuevo curso a la lista si no está creado.
- inscribirEstudianteCurso(Estudiante estudiante, int idCurso): Inscribir a un estudiante en un curso, lanzando EstudianteYaInscritoException si ya está inscrito.
- desinscribirEstudianteCurso(int idEstudiante, int idCurso): Desinscribir a un estudiante de un curso, lanzando EstudianteNoInscritoEnCursoException si no está inscrito o el ID del curso no es válido.

## Implementación en GestorAcademico

- Se ha hecho que GestorAcademico implemente ServiciosAcademicosI.
- Se han implementado los métodos definidos en la interfaz ServiciosAcademicosI.

## Herencia con la Clase Persona

- Se ha creado la clase Persona para trasladar la información común de Estudiante.
- Estudiante ahora extiende de Persona.

## Ejecución y Verificación

Se ha implementado una clase main para ejecutar la aplicación y verificar su funcionamiento. Se han creado instancias de Estudiante y Curso, se ha instanciado GestorAcademico y se han probado las funcionalidades implementadas.

## Repositorio

El repositorio con el proyecto funcional se ha compartido al finalizar el desarrollo.

---

Este archivo README.md proporciona una visión general del proyecto y su implementación. Para detalles específicos de implementación, se recomienda revisar el código y la estructura del repositorio.

