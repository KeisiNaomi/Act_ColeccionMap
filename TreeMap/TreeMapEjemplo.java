package TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEjemplo {
    public static void main(String[] args) {
        // Crear un TreeMap para almacenar alumnos con su matricula
        Map<Integer, String> alumnos = new TreeMap<>();

        // Agregar elementos al TreeMap
        alumnos.put(100, "Kitty");
        alumnos.put(103, "Tenshi");
        alumnos.put(101, "Lumine");
        alumnos.put(102, "Aether");

        System.out.println("=============== TreeMap Ejemplo ===============");
        // Mostrar el contenido del TreeMap
        System.out.println("Contenido: " + alumnos);

        // Mostrar el tamaño del TreeMap
        System.out.println("Tamaño del TreeMap: " + alumnos.size());

        // Obtener y mostrar el nombre del alumno con matricula 101
        System.out.println("Busqueda por clave - Alumno con matricula 101: " + alumnos.get(101));

        // Eliminar al alumno con matricula 101 del TreeMap
        alumnos.remove(101);
        System.out.println("Despues de usar remove(clave): " + alumnos);

        System.out.println("--------------- Iterando TreeMap ---------------");
        System.out.println("Por clave:");
        // Iterar sobre las claves del TreeMap
        for (Integer i : alumnos.keySet()) {
            System.out.print(i + " ");
        }

        System.out.println("\nPor valor:");
        // Iterar sobre los valores del TreeMap
        for (String i : alumnos.values()) {
            System.out.print(i + " ");
        }

        System.out.println("\nPor clave y valor:");
        // Iterar sobre las entradas del TreeMap
        for (Integer i : alumnos.keySet()) {
            System.out.println(i + " - " + alumnos.get(i));
        }
    }
}