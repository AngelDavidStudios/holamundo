public class Auto { //Es una plantila del objeto

    private String color;
    private int puertas;
    private String placa;
    private String modelo;
    private int numllantas;

    private Motor mimotor;
    public Persona propietario;

    //Constructor con parametros
    public Auto(String color, int puertas, String placa, String modelo, int numllantas, Motor mimotor, Persona propietario) {
        //paramtros posicionales

        this.color = color; //this hace referencia a la clase.
        this.puertas = puertas;
        this.placa = placa;
        this.modelo = modelo;
        this.numllantas = numllantas;
        this.mimotor = mimotor;
        this.propietario = propietario;
    } // sobrecarga de datos con metodos.

    public Auto(Motor mymotor, Persona people) {
        this.mimotor = mymotor;
        this.propietario = people;
    }

    //Metodo que devuelve la velocidad del auto
    double velocidadAuto() {
        double velocidadKm = 0;
        
        velocidadKm = mimotor.fuerza() * numllantas;

        return velocidadKm;

    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return puertas;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModel() {
        return modelo;
    }

    public Motor getMotor() {
        return mimotor;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int puertas) {
        this.puertas = puertas;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModel(String modelo) {
        this.modelo = modelo;
    }

    public void setMotor(Motor motor) {
        this.mimotor = motor;
    }

    public void printAtrr() {
        System.out.println("La placa del auto es:" + placa);
        System.out.println("El modelo del auto es:" + modelo);
        System.out.println("El color del auto es:" + color);
        System.out.println("La velocidad del auto es:" + velocidadAuto());
        System.out.println("El numero de puertas es:" + puertas);
        System.out.println("El cilindraje del motor es:" + mimotor.getCilindraje());
        System.out.println("La serie del motor es: " + mimotor.getSerie());
    }
}