import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // VARIABLES
        String password, pin;
        double saldo = 2500.00, cuotaPrestamo;
        int optionMenu;

        // PASSWORD AND PIN:
        System.out.println("Bienvenido al sistema de Banca Móvil del Banco de América");
        System.out.println("=========================================================\n");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la contraseña: ");
        password = String.valueOf(sc.nextLine());

        while (!password.equals("*551#")) {
            System.out.println("ERROR: Código incorrecto.");
            System.out.print("Ingrese la contraseña: ");
            password = String.valueOf(sc.nextLine());
        } ;

        System.out.print("Ingrese el PIN de acceso: ");
        pin = String.valueOf(sc.nextLine());

        if (!pin.equals("1234")) {
            System.out.println("PIN Incorrecto. Se cerrará la aplicación.");
            return;
        }

        // MENU
        System.out.println("\nInformación de la operadora\n MULTIRED EN CONSOLA \n");
        System.out.println("El saldo Disponible de su Cta. es: S/" + 2500.00 + ".\n");
        System.out.println("Opciones disponibles:\n");
        System.out.println("[1] Consulta");
        System.out.println("[2] Recargas");
        System.out.println("[3] Retiro");
        System.out.println("[4] Préstamo");
/*      System.out.println("[12] meses:\n" + "Cuota = [Monto * (0.085x (1 + 0.085) ^ 12)] / [(1 + 0.085) ^ 12) – 1]");
        System.out.println("[36]meses:\n" + "Cuota = [Monto * (0.105x (1 + 0.105) ^36)] / [(1 + 0.105) ^ 36) – 1]");
        System.out.println("[48]meses\n" + "Cuota = [Monto * (0.105x (1 + 0.125) ^48)] / [(1 + 0.125) ^ 48) – 1]");*/
        System.out.println("[0] Salir \n");
        System.out.print("Seleccione una opción: ");

        optionMenu = Integer.valueOf(sc.nextLine());
        switch (optionMenu) {
            case 1:
                // Consulta
                System.out.println("Ha seleccionado la opción CONSULTA \n");
                System.out.println("El monto disponible es S/" + saldo);
                return;
            case 2:
                // Recarga
                System.out.println("Ha seleccionado la opción RECARGA \n");
                System.out.print("Escriba cuanto desea recargar: S/");
                double montoRecarga = Double.valueOf(sc.nextLine());
                System.out.println("Salto anterior: S/" + saldo);
                System.out.println("Saldo de recarga: S/" + montoRecarga);
                saldo += montoRecarga;
                System.out.println("Saldo actualizado: S/" + saldo);
                return;
            case 3:
                // Retiro
                System.out.println("Ha seleccionado la opción RETIRO \n");
                System.out.print("Escriba cuanto desea retirar: S/");
                double montoRetiro = Double.valueOf(sc.nextLine());
                System.out.println("Salto anterior: S/" + saldo);
                System.out.println("Saldo de recarga: S/" + montoRetiro);
                saldo -= montoRetiro;
                System.out.println("Saldo actualizado: S/" + saldo);
                return;
            case 4:
                // Préstamo
                System.out.println("Ha seleccionado la opción PRÉSTAMO \n");
                System.out.print("Escriba el monto que desea prestar: S/");
                double montoPrestamo = Double.valueOf(sc.nextLine());
                System.out.println("Periodos de préstamo disponibles:");
                System.out.println("[1] 12 meses");
                System.out.println("[2] 24 meses");
                System.out.println("[3] 48 meses");
                System.out.print("Escriba la opción del periodo para el préstamo: ");
                int opcionTiempo = Integer.valueOf(sc.nextLine());
                switch (opcionTiempo) {
                    case 1:
                        double parcial1 = 1 + 0.085;
                        cuotaPrestamo = (montoPrestamo * (0.085 * Math.pow(parcial1, 12)) / (Math.pow(parcial1, 12) - 1 ));
                        System.out.println("Para el monto S/" + montoPrestamo + ", su cuota será: S/" + cuotaPrestamo + ".");
                        break;
                    case 2:
                        double parcial2 = 1 + 0.105;
                        cuotaPrestamo = (montoPrestamo * (0.105 * Math.pow(parcial2, 24)) / (Math.pow(parcial2, 24) - 1 ));
                        System.out.println("Para el monto S/" + montoPrestamo + ", su cuota será: S/" + cuotaPrestamo + ".");
                        break;
                    case 3:
                        double parcial3 = 1 + 0.125;
                        cuotaPrestamo = (montoPrestamo * (0.105 * Math.pow(parcial3, 48)) / (Math.pow(parcial3, 48) - 1 ));
                        System.out.println("Para el monto S/" + montoPrestamo + ", su cuota será: S/" + cuotaPrestamo + ".");
                        break;
                    default:
                        System.out.print("Opción incorrecta. Elija nuevamente una opción válida: ");
                        return;
                }
            case 0:
                // Salir
                System.out.println("Ha seleccionado la opción SALIR. \n");
                break;
            default:
                System.out.print("Opción incorrecta. Elija nuevamente una opción válida: ");
        }

    }
}
