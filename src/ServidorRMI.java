import java.rmi.Naming;

public class ServidorRMI {
    public static void main(String[] args) {
        try {
            CalculadoraRemotaImpl calculadora = new CalculadoraRemotaImpl();
            Naming.rebind("Calculadora", calculadora);
            System.out.println("Servidor RMI de la Calculadora en ejecución...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
