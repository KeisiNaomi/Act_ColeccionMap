package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEjemplo {
    public static void main(String[] args) {
        // Crear un HashMap para almacenar edades de personas
        Map<String, Integer> edades = new HashMap<>();

        // Agregar elementos al HashMap
        edades.put("Kitty", 18);
        edades.put("Ana", 20);
        edades.put("Luis", 22);
        edades.put("Marta", 20);

        System.out.println("=============== HashMap Ejemplo ===============");
        // Mostrar el contenido del HashMap
        System.out.println("Contenido: " + edades);

        // Mostrar el tamaño del HashMap
        System.out.println("Tamaño del HashMap: " + edades.size());

        // Obtener y mostrar la edad de Luis
        System.out.println("Busqueda por clave - Edad de Luis: " + edades.get("Luis"));

        // Eliminar a Luis del HashMap
        edades.remove("Luis");
        System.out.println("Despues de usar remove(clave): " + edades);

        System.out.println("--------------- Iterando HashMap ---------------");
        System.out.println("Por clave:");
        // Iterar sobre las claves del HashMap
        for (String i : edades.keySet()) {
            System.out.print(i + " ");
        }

        System.out.println("\nPor valor:");
        // Iterar sobre los valores del HashMap
        for (Integer i : edades.values()) {
            System.out.print(i + " ");
        }

        System.out.println("\nPor clave y valor:");
        // Iterar sobre las entradas del HashMap
        for (String i : edades.keySet()) {
            System.out.println(i + " - " + edades.get(i));
        }
    }
}