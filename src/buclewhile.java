import javax.swing.*;

public class buclewhile {

    public static void main(String[] args) {
        int numero = 1;

        while (numero <= 10) {
            System.out.println("Imprimiendo un número 10 veces - " + numero);
            numero = numero + 1;

        }

        String clave = "Montero";
        String pass = "";

        while (clave.equals(pass) == false) {
            pass = JOptionPane.showInputDialog("Introduce la contraseña: ");
            if (clave.equals(pass) == false) {
                System.out.println("Contraseña Incorrecta");
            }
        }

        System.out.println("Contraseña correcta, Acceso permitido.");
    }
}