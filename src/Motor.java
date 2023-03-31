public class Motor {
    
    int cilindraje;
    int valvulas;
    String combustible;

    double fuerza() {
        double fuerzaNw = 0;

        if (combustible.equals("Gasolina")) { 
            fuerzaNw = cilindraje * valvulas;
        
        } else if ( combustible.equals("Diesel")) {
            
            fuerzaNw = cilindraje * valvulas * 1.5;
        }

        return fuerzaNw;
    }
}