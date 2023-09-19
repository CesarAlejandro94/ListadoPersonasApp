import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        //Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        //Empezamos Menu
        var salir = false;
        while (!salir){
            mostrarMenu();
            try{
                salir = ejecutarOperacion(consola, personas);
            } catch(Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }

            System.out.println();
        }
    }
    private static void mostrarMenu(){
        System.out.print("""
                ****Listado Personas App***
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Teclea el numero de la opcion: ");
    }
    private static boolean ejecutarOperacion(Scanner consola, List<Persona> personas){
        var opcion =  Integer.parseInt(consola.nextLine());
        var salir = false;
        //Revisamos la opcion tecleada
        switch (opcion){
            case 1 ->{//Agregar Persona
                System.out.print("Proporciona Nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Proporciona Telefono: ");
                var tel = consola.nextLine();
                System.out.print("Proporciona Email: ");
                var email = consola.nextLine();
                //Crear Objeto Persona
                var persona = new Persona(nombre,tel,email);
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " registros");
            }
            case 2 ->{ //Listar Personas
                System.out.println("Listado de personas: ");
                //Mejora usando lambda y metodo de referencia
                //personas.forEach(persona -> System.out.println(persona));
                personas.forEach(System.out::println); //Esta es la forma mas simplificada,usando metodos de referencia
            }
            case 3 ->{
                System.out.println("Hasta la vista baby...");
                salir = true;
            }
            default -> System.out.println("Opcion erronea: " + opcion);
        }
        return salir;
    }
}