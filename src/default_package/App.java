package default_package;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class App {
    public static BufferedReader entrada = new BufferedReader((new InputStreamReader(System.in)));

    public static void main(String[] args) throws Exception {
        HashSet<Integer> empleados = new HashSet<Integer>();
        int IdEmpleado = 0;

        while(true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Registrar ingreso");
            System.out.println("2. Registrar salida");
            System.out.println("3. Finalizar (mostrar resumen)");

            System.out.print("Ingresa una opción: ");
            int opcion = Integer.parseInt(entrada.readLine());

            switch(opcion) {
                case 1:
                    System.out.print("Ingresa el número de empleado: ");
                    IdEmpleado = Integer.parseInt(entrada.readLine());
                    empleados.add(IdEmpleado);
                    break;

                case 2:
                    System.out.print("Ingresa el número de empleado: ");
                    IdEmpleado = Integer.parseInt(entrada.readLine());
                    empleados.add(IdEmpleado);
                    break;

                default:
                    System.out.println("Opcion ingresada inválida");
                    break;
            }

            if (opcion == 3) {
                System.out.println(empleados);
                System.out.println("Empleados diferentes: " + empleados.size());
                break;
            }
        }
    }
}
