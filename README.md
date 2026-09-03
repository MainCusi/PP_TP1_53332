# Trabajo Práctico N°1 - Paradigmas de Programación (UTN FRM)

## Descripción general
Este proyecto implementa los **Ejercicios 1, 2 y 3** del Trabajo Práctico N°1 de la materia **Programación Orientada a Objetos (POO)** en Java.  
El objetivo es modelar un sistema para administrar eventos universitarios, aplicando los principios de **encapsulamiento, relaciones entre clases, herencia y polimorfismo**.

---

## Estructura del proyecto
El código está organizado en clases que representan las entidades y relaciones del modelo:

| Clase | Descripción |
|-------|--------------|
| `EventoUniversitario` | Clase principal del sistema. Gestiona los datos del evento, su sala y las actividades asociadas. |
| `Sala` | Representa la sala asignada al evento (relación de **agregación**). |
| `Actividad` | Clase **abstracta** base para las actividades del evento. Define comportamiento común y métodos polimórficos. |
| `Charla` | Subclase concreta de `Actividad`. Representa una charla gratuita. |
| `Taller` | Subclase concreta de `Actividad`. Representa un taller con costo variable según uso de notebook. |
| `Estudiante` | Representa a los alumnos que pueden inscribirse en actividades. |
| `Inscripcion` | Modela la inscripción de un estudiante en una actividad, con fecha y estado. |
| `App` | Clase con el método `main` que ejecuta el programa y prueba todas las funcionalidades. |

---

## Ejecución
Para probar el proyecto:

1. Abrir el proyecto en **IntelliJ IDEA**.
2. Ejecutar la clase `App.java`.
3. Observar en la consola:
   - Creación de eventos y actividades.
   - Inscripción de estudiantes.
   - Cálculo de costos y resumen polimórfico.

---

## Ejercicios implementados

### Ejercicio 1
- Implementación de la clase `EventoUniversitario` con atributos encapsulados.
- Constructores (principal y de copia).
- Métodos para calcular costo, mostrar datos y contar eventos creados.

### Ejercicio 2
- Incorporación de relaciones entre clases (`Sala`, `Actividad`, `Estudiante`, `Inscripcion`).
- Uso de **agregación** y **composición**.
- Creación de actividades y registro de inscripciones.

### Ejercicio 3
- Transformación de `Actividad` en clase **abstracta**.
- Implementación de subclases `Charla` y `Taller` con comportamiento polimórfico.
- Cálculo de costos específicos por tipo de actividad.
- Método `mostrarIdentificacion()` declarado como `final` para evitar redefinición.
- Ejecución polimórfica desde `EventoUniversitario`.

---

## Resultado esperado
Al ejecutar el programa, se muestran:
- Los datos del evento y sus actividades.
- Las inscripciones de cada estudiante.
- El costo total del evento con impuestos.
- El contador de eventos creados.

---

## Autor
**Nombre:** Santiago Gabriel Cusimano  
**Legajo:** 53332  
**Carrera:** Ingeniería en Sistemas de Información  
**Universidad:** UTN - Facultad Regional Mendoza

---

