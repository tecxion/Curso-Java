import java.util.*;
import javax.swing.*;

public class program1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectánculo  \n3: Triángulo \n4: Círculo");

        int figura = entrada.nextInt();

        switch (figura) {
            case 1:

                int lado = Integer.parseInt(JOptionPane.showInputDialog("introduce el valor del lado del cuadrado"));
                System.out.println("El area del cuadrado es " + (lado * lado));
                break;

            case 2:

                int base = Integer
                        .parseInt(JOptionPane.showInputDialog("introduce el valor de la base del rectángulo"));
                int altura = Integer.parseInt(JOptionPane.showInputDialog("introduce la altura: "));
                System.out.println("El area del rectángulo es: " + (base * altura));
                break;

            case 3:
                int basetri = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del triángulo"));
                int alturatri = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del triánulo:"));
                System.out.println("El area del triángulo es: " + basetri * alturatri);
                break;

            case 4:
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del circulo"));
                System.out.print("El area del círculo es: ");
                System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
                break;

            default:
                System.out.println("La Opción no es correcta");

        }

        entrada.close();

    }
}