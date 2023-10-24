import java.rmi.Naming;
import java.util.Scanner;

public class ClienteCalculadora {
    public static void main(String[] args) {
        try {
            String nombreServidor = "rmi://localhost/Calculadora"; // Cambia localhost por la dirección del servidor si es necesario
            CalculadoraRemota calculadora = (CalculadoraRemota) Naming.lookup(nombreServidor);

            Scanner scanner = new Scanner(System.in);
            int opcion;
            double a, b;
            do {
                System.out.println("Calculadora RMI");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("0. Salir");
                System.out.print("Selecciona una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el primer número: ");
                        a = scanner.nextDouble();
                        System.out.print("Ingrese el segundo número: ");
                        b = scanner.nextDouble();
                        double suma = calculadora.sumar(a, b);
                        System.out.println("Resultado: " + a + " + " + b + " = " + suma);
                        break;
                    case 2:
                        System.out.print("Ingrese el primer número: ");
                        a = scanner.nextDouble();
                        System.out.print("Ingrese el segundo número: ");
                        b = scanner.nextDouble();
                        double resta = calculadora.restar(a, b);
                        System.out.println("Resultado: " + a + " - " + b + " = " + resta);
                        break;
                    case 3:
                        System.out.print("Ingrese el primer número: ");
                        a = scanner.nextDouble();
                        System.out.print("Ingrese el segundo número: ");
                        b = scanner.nextDouble();
                        double multiplicacion = calculadora.multiplicar(a, b);
                        System.out.println("Resultado: " + a + " * " + b + " = " + multiplicacion);
                        break;
                    case 4:
                        System.out.print("Ingrese el primer número: ");
                        a = scanner.nextDouble();
                        System.out.print("Ingrese el segundo número: ");
                        b = scanner.nextDouble();
                        if (b == 0) {
                            System.out.println("No se puede dividir por cero.");
                        } else {
                            double division = calculadora.dividir(a, b);
                            System.out.println("Resultado: " + a + " / " + b + " = " + division);
                        }
                        break;
                    case 0:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } while (opcion != 0);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
