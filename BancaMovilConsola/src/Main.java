import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password, pin;
        System.out.println("Bienvenido al sistema de Banca Móvil del Banco de América");
        System.out.println("=========================================================\n");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        // CONTRASEÑA:
        System.out.print("Ingrese la contraseña: ");
        password = String.valueOf(sc.nextLine());

        do {
            System.out.println("ERROR: Código incorrecto.");
            System.out.print("Ingrese la contraseña: ");
            password = String.valueOf(sc.nextLine());
        } while (!password.equals("*551#"));

        System.out.print("Ingrese el PIN de acceso: ");
        pin = String.valueOf(sc.nextLine());

        if (!pin.equals("1234")) {
            System.out.println("PIN Incorrecto. Se cerrará la aplicación.");
            return;
        }

        System.out.println("\tInformación de la operadora\n MULTIRED EN CONSOLA");

    }
}
