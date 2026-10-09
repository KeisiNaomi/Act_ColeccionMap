package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEjemplo {
    public static void main (String[] args) {
        // Crear un LinkedHashMap para almacenar productos
        Map<Integer, String> productos = new LinkedHashMap<>();

        // Agregar elementos al LinkedHashMap
        productos.put(4, "Regla");
        productos.put(5, "Marcador");
        productos.put(3, "Cuaderno");
        productos.put(1, "Lápiz");
        productos.put(2, "Borrador");

        System.out.println("=============== LinkedHashMap Ejemplo ===============");
        // Mostrar el contenido del LinkedHashMap
        System.out.println("Contenido: " + productos);

        // Mostrar el tamaño del LinkedHashMap
        System.out.println("Tamaño del LinkedHashMap: " + productos.size());

        // Obtener y mostrar el nombre del producto con clave 3
        System.out.println("Busqueda por clave - Producto con clave 3: " + productos.get(3));

        // Eliminar el producto con clave 3 del LinkedHashMap
        productos.remove(3);
        System.out.println("Despues de usar remove(clave): " + productos);

        System.out.println("--------------- Iterando LinkedHashMap ---------------");
        System.out.println("Por clave:");
        // Iterar sobre las claves del LinkedHashMap
        for (Integer i : productos.keySet()) {
            System.out.print(i + " ");
        }

        System.out.println("\nPor valor:");
        // Iterar sobre los valores del LinkedHashMap
        for (String i : productos.values()) {
            System.out.print(i + " ");
        }

        System.out.println("\nPor clave y valor:");
        // Iterar sobre las entradas del LinkedHashMap
        for (Integer i : productos.keySet()) {
            System.out.println(i + " - " + productos.get(i));
        }
    }
}