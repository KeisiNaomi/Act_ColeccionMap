# Actividad Colecciones en Java

## Descripción

Esta actividad tiene como objetivo comprender el funcionamineto de la interfaz `Map` en Java y conocer tres de sus implementaciones más utilizadas: `HashMap`, `TreeMap`y `LinkedHashMap`.

Mediante ejemplos prácticos, se demuestra cómo almacenar infomación en pares clave-valor, consultar elementos, conocer el tamaño de una colección, eliminar registros y recorrer sus claves y valores.

## Objetivos

  - Comprender el funcionamiento de la interfaz `Map`.
  - Identificar las características de `HashMap`, `TreeMap`y `LinkedHashMap`.
  - Practicar el uso de los métodos `put()}`, `get()`, `remove()`, `size()`, `keySet()` y `values()`.
  - Reconocer las diferencias en la organizaión de los elementos de cada estructura.

## Conceptos aplicados

### HashMap

Utiliza una tabla hash para almacenar pares clave-valor. No garantiza un orden específico de los elementos, pero permite realizar operaciones de búsqueda, inserción y eliminación de manera eficiente en condiciones habituales.

En el ejemplo `HashMapEjemplo.java` se almacenan las edades de varias personas, se consulta la edad de Luis y posteriormente se elimina el registro.

### TreeMap

Mantiene las claves ordenadas de acuerdo con su orden natural o un comparador personalizado.

En el ejemplo `TreeMapEjemplo.java` se relacionan las matrículas de los alumnos con sus nombres. Aunque los registros se agregran en un orden diferente, las claves se muestran ordendas de menor a mayor.

### LinkedHashMap

Conserva el orden de inserción de las entradas, a diferencia de `HashMap`, que no garantiza un orden específico.

En el ejemplo `LinkedHashMapEjemplo.java` se almacenan productos mediante códigos numerícos, lo que permite observar cómo se conserva el orden en que fueron registrados.

## Conclusión

La realización de estos ejemplos permite comprender que, aunque `HashMap`,  `TreeMap` y `LinkedHasMap` implementan la misma interfaz, cada estructura presenta diferencias importantes en la organización de sus elementos.

## Uso de inteligecia artificial

Se utilizó inteligencia artificial como herramineta de apoyo para comprender los conceptos de las colecciones en Java, aclarar las diferencias entre las implementaciones de `Map` y revisar la lógica de los ejemplos. Su uso estuvo orientado al aprendizaje y a la comprensión del cógido, complementando el trabajo realizado durante la actividad.

## Enlace de la presentación

Para una mayor información sobre el tema, puede consultar el siguiente material: [https://github.com/KeisiNaomi/Act_ColeccionMap.git](https://github.com/KeisiNaomi/Act_ColeccionMap.git)