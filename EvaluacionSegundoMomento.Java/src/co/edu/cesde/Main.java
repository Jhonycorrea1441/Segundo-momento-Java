package co.edu.cesde;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);

    // Crear arreglos

        List <Accountant> contadora = new ArrayList<>();
        List <Watchman> vigilante = new ArrayList<>();
        List <CleaningStaff> limpieza = new ArrayList<>();
        List <Admin> administrador = new ArrayList<>();


    // Crear menú de perfiles
        System.out.println("Que perfil desea crear? ");
        System.out.println(" 1 (Admin)" );
        System.out.println(" 2 (Watchman)" );
        System.out.println(" 3 (CleaningStaff)" );
        System.out.println(" 4 (Accountant)" );

        System.out.println("Ingrese su opción:  ");
        int opcion = opcion = inputData.nextInt();

// Crear perfil Admin
        if (opcion == 1){
            String detener = "NO";
            while (detener.equalsIgnoreCase("NO")) {

                System.out.println("Digite el nombre: ");
                Admin admon =new Admin();
                admon.setName(inputData.nextLine());
                System.out.println("Digite la ientificación: ");
                admon.setIdentification(inputData.nextLine());
                System.out.println("Digite la edad: ");
                admon.setAge(inputData.nextInt());
                administrador.add(admon);
                System.out.println("Digite la edad: ");
                admon.setAge(inputData.nextInt());
                administrador.add(admon);
                System.out.println("Cual va a ser el Rol?: ");
                admon.setLeader(inputData.nextLine());
                administrador.add(admon);
                System.out.println("Tiene asignado parqueadero?: ");
                admon.setParking(inputData.nextLine());
                administrador.add(admon);

            } else {
                // Crear perfil Watchman
                if (opcion == 2){
                    System.out.println("Digite el nombre: ");
                    Watchman vigilantes =new Watchman();
                    vigilantes.setName(inputData.nextLine());
                    System.out.println("Digite la ientificación: ");
                    vigilantes.setIdentification(inputData.nextLine());
                    System.out.println("Digite la edad: ");
                    vigilantes.setAge(inputData.nextInt());
                    System.out.println("Digite la edad: ");
                    vigilantes.setAge(inputData.nextInt());
                    System.out.println("Cual va a ser el Rol?: ");
                    vigilantes.setLeader(inputData.nextLine());
                    System.out.println("Tiene asignado parqueadero?: ");
                    vigilantes.setParking(inputData.nextLine());
                    vigilante.add(vigilantes);
                }
            }
        }

    }
}
