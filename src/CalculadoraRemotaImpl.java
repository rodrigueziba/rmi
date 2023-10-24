import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraRemotaImpl extends UnicastRemoteObject implements CalculadoraRemota {
    public CalculadoraRemotaImpl() throws RemoteException {
        // Constructor vacío necesario
    }

    public double sumar(double a, double b) throws RemoteException {
        return a + b;
    }

    public double restar(double a, double b) throws RemoteException {
        return a - b;
    }

    public double multiplicar(double a, double b) throws RemoteException {
        return a * b;
    }

    public double dividir(double a, double b) throws RemoteException {
        if (b == 0) {
            throw new RemoteException("No se puede dividir por cero");
        }
        return a / b;
    }
}
