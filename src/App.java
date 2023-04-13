import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("#######################################################");
        // Hyundai
        Persona mipersona = new Persona("Angel", "Rueda", 25, "Male", "Canada", "08876786", "david@hotmail.com", 234);
        Motor miMotor = new Motor( 2000, 100, "Diesel");
        Auto miCarro = new Auto( "White", 4, "PDX34", "Hyundai", 4, miMotor, mipersona);
        
        miCarro.printAtrr();

        //Corsa
        Persona mipersona2 = new Persona("David", "Sanchez", 25, "Male", "France", "0976532", "davishoki@hotmail.com", 2322);
        Motor miMotor2 = new Motor( 3000, 500, "Super");
        Auto miCorsa = new Auto( "Black", 3, "PDX14", "Corsa", 4, miMotor2, mipersona2);

        System.out.println("#######################################################");
        miCorsa.printAtrr();
        //Chevrolet
        Persona mipersona3 = new Persona("Christian", "Carrera", 23, "Male", "USA", "67452454", "Chris@hotmail.com", 7654);
        Motor miMotor3 = new Motor( 9000, 300, "Super");
        Auto miChevrolet = new Auto( "Red", 5, "PDZ34", "Chevrolet", 4, miMotor3, mipersona3);

        System.out.println("#######################################################");
        miChevrolet.printAtrr();

        Persona miPerson = new Persona("Aioros", 4938745);
        Motor motors = new Motor(4325454);
        Auto mycar = new Auto(motors, miPerson);


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el modelo del auto");
        String modelo = sc.next();

        System.out.println("Ingrese la placa del auto");
        String placa = sc.next();

        System.out.println("Ingrese el color del auto");
        String color = sc.next();

        System.out.println("Ingrese las valvulas del auto");
        int Valvulas = sc.nextInt();

        System.out.println("Ingrese el combustible del auto");
        String Combustible = sc.next();

        mycar.setModel(modelo);
        mycar.setColor(color);
        mycar.setPlaca(placa);
        mycar.getMotor().setValvulas(Valvulas);
        mycar.getMotor().setCombustible(Combustible);

        System.out.println("#######################################################");
        mycar.printAtrr();


        
    }
}