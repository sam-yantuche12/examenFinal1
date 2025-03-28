import java.util.Scanner;

public class examenFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un número para la ecuación x + 2x: ");
        int x1 = scanner.nextInt();
        int resultado1 = x1 + 2 * x1;
        System.out.println("Resultado de x + 2x: " + resultado1);

        
        int x2 = 5;
        int resultado2 = (x2 * x2) - (3 * x2);
        System.out.println("Resultado de 2 - 3x - x = 5: " + resultado2);

        
        System.out.print("Ingrese el primer número (a): ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número (b): ");
        int b = scanner.nextInt();
        System.out.print("Ingrese el tercer número (c): ");
        int c = scanner.nextInt();
        double resultado3 = (a + b + c) / 3.0; 
        System.out.println("Resultado del promedio (a + b + c) / 3: " + resultado3);

        
        System.out.print("Ingrese un número para la ecuación 2 + 2(x + 1): ");
        int num1 = scanner.nextInt();
        int resultado4 = (num1 * num1) + 2 * (num1 + 1);
        System.out.println("Resultado de 2 + 2(x + 1): " + resultado4);

        
        int opcion;
        do {
            System.out.println("\n+-------------+");
            System.out.println("[ 1 ] Calcular la moda (No implementado)");
            System.out.println("[ 2 ] La mitad de un número");
            System.out.println("[ 3 ] Decir 'Hola Mundo'");
            System.out.println("[ 4 ] Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Función para calcular la moda");
                
                    break;
                case 2:
                    System.out.print("Ingrese un número: ");
                    double numero = scanner.nextDouble();
                    System.out.println("La mitad de " + numero + "" + (numero / 2));
                    break;
                case 3:
                    System.out.println("¡Hola Mundo!");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
