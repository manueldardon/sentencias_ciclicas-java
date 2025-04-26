import java.time.LocalDate;
import java.util.Scanner; //importamos la clase Scanner para leer los datos de entrada

public class Tarea_2 {
    public static void evaluar_numero() { //declaramos metodo para evaluar el numero
        Scanner scanner = new Scanner(System.in); //se crea un objeto scanner para leer los datos de entrada del usuario
        
        System.out.println("Ingrese un número entero:"); //se solicita un número al usuario
        
        if (scanner.hasNextInt()) { //verifica si el dato de entrada es un número antes de leerla
            int numero = scanner.nextInt(); //se lee el número ingresado por el usuario
            
            //se evalua si el número es positivo, negativo o cero
            if (numero > 0) {
                System.out.println("El número es positivo.");
            } else if (numero < 0) {
                System.out.println("El número es negativo.");
            } else {
                System.out.println("El número es cero.");
            }
        } 
        
        else {
            System.out.println("Entrada no válida. Debe ingresar un número entero."); //mensaje de error si el dato de entrada no es válido
        }

        scanner.close(); //se cierra el scanner para liberar recursos
    }

    public static void verificaraño() { //declaramos metodo para verificar el año
        Scanner scanner = new Scanner(System.in); //se crea un objeto scanner para leer los datos de entrada del usuario
        
        System.out.println("Ingrese un año:"); //se solicita el año al usuario

        if (scanner.hasNextInt()) { //verifica si el dato de entrada es un número entero
            int año = scanner.nextInt(); //se lee el año ingresado

            //condición para determinar si el año es bisiesto
            if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                System.out.println(año + " es un año bisiesto.");
            } else {
                System.out.println(año + " no es un año bisiesto.");
            }
        } 
        
        else {
            System.out.println("Entrada no válida. Debe ingresar un número entero."); //mensaje de error si el dato de entrada no es válido
        }

        scanner.close(); //se cierra el scanner para liberar recursos
    }

    public static void dia_semana() { //declaramos metodo que obtiene el día de la semana según el numero ingresado
        Scanner scanner = new Scanner(System.in); //se crea un objeto scanner para leer los datos de entrada del usuario
        
        System.out.println("Ingrese un número del 1 al 7 para conocer el día de la semana:"); //se solicita un número al usuario
        
        if (scanner.hasNextInt()) { //verifica si el dato de entrada es un número entero
            int numero = scanner.nextInt(); //se lee el número ingresado

            //switch para determinar el día de la semana
            switch (numero) {
                case 1 -> System.out.println("Lunes");
                case 2 -> System.out.println("Martes");
                case 3 -> System.out.println("Miércoles");
                case 4 -> System.out.println("Jueves");
                case 5 -> System.out.println("Viernes");
                case 6 -> System.out.println("Sábado");
                case 7 -> System.out.println("Domingo");
                default -> System.out.println("Número fuera de rango. Debe ser entre 1 y 7."); //mensaje si el número no está en el rango
            }
        } 
        
        else {
            System.out.println("Entrada no válida. Debe ingresar un número entero."); //mensaje si la entrada no es un número
        }

        scanner.close(); //se cierra el scanner para liberar recursos
    }

    public static void menu() { //declaramos metodo para seleccionar las opciones del menu
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("=== MENÚ DE OPCIONES ===");
        System.out.println("1. Mostrar mensaje de bienvenida");
        System.out.println("2. Mostrar la fecha actual");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");

        if (scanner.hasNextInt()) { //verifica si el dato de entrada es un número entero
                opcion = scanner.nextInt();

                //switch para manejar las opciones del menú
                switch (opcion) {
                    case 1 -> System.out.println("¡Bienvenido usuario!");
                    case 2 -> System.out.println("La fecha actual es: " + LocalDate.now());
                    case 3 -> System.out.println("Salir del programa");
                    default -> System.out.println("Opción no válida. Por favor, ingrese un número entre 1 y 3.");
                }
            } 
            
            else {
                System.out.println("Entrada no válida. Debe ingresar un número."); //mensaje si la entrada no es un número
            }

            scanner.close(); //se cierra el scanner para liberar recursos
    }

    public static void sumarwhile() { //declaramos metodo que suma los número que ingresos hasta ingresar un número negativo
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        //bucle while para pedir números y sumarlos hasta que se ingrese un número negativo
        while (true) {
            System.out.print("Ingrese un número (ingrese un número negativo para terminar): ");
            numero = scanner.nextInt();

            if (numero < 0) {
                break; // Salir del bucle si el número es negativo
            }

            suma += numero; // Sumar el número a la variable suma
        }

        // Mostrar el resultado de la suma
        System.out.println("La suma total es: " + suma);
        
        scanner.close(); // Cerrar el Scanner
    }

    public static void repetirAccion() { //declaramos metodo que repite una acción hasta donde lo desee el usuario
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        int contador = 0;

        //bucle while que pregunta si el usuario quiere continuar
        while (true) {
            // Mostrar el mensaje y contar las repeticiones
            System.out.println("El Barca es mejor que el Real Madrid");
            contador++;

            //preguntar al usuario si desea continuar
            System.out.println("¿Desea repetir la acción? (si/no): ");
            respuesta = scanner.nextLine();

            //si el usuario responde "no", termina el bucle
            if (respuesta.equalsIgnoreCase("no")) {
                break;
            }
        }

        //mostrar cuántas veces se repitió la acción
        System.out.println("La acción fue repetida " + contador + " veces.");
        scanner.close(); // Cerrar el scanner
    }

    public static void imprimir_numeros() {
        //usamos un bucle for para iterar desde 1 hasta 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i); // Imprime el valor de i en cada iteración
        }
    }

    public static void sumafor() {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int N;

        System.out.println("Ingresa un número entero");
        N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            suma += i;
        }

        System.out.println("El resultado de la suma es: " + suma);

        scanner.close();
    }

    public static void main(String[] args) {
        sumafor();  //llamar al método para ejecutar el programa
    }
}
