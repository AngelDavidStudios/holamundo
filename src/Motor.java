public class Motor {
    
    private int cilindraje;
    private int valvulas;
    private String combustible;
    private int serie;

    public Motor(int cilindraje, int valvulas, String combustible) {
        this.cilindraje = cilindraje;
        this.valvulas = valvulas;
        this.combustible = combustible;
    }

    public Motor(int serie) {
        this.serie = serie;
    }

    double fuerza() {
        double fuerzaNw = 0;

        if (combustible.equals("Gasolina")) { 
            fuerzaNw = cilindraje * valvulas;
        
        } else if ( combustible.equals("Diesel")) {
            
            fuerzaNw = cilindraje * valvulas * 1.5;
        }

        return fuerzaNw;
    }

    public int getSerie() {
        return serie;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getValvulas() {
        return valvulas;
    }

    public void setValvulas(int valvulas) {
        this.valvulas = valvulas;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

}