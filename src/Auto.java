public class Auto {

    String color;
    int puertas;
    String placa;
    String modelo;
    int numllantas;

    Motor mimotor;
    Persona propietario;


    double velocidadAuto() {
        double velocidadKm = 0;
        
        velocidadKm = mimotor.fuerza() * numllantas;

        return velocidadKm;

    }
}
