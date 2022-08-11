//padre
package practicajava;


public class Vehiculo {
    
    protected String color;
    protected int kilomatraje;
    protected String modelo;
    protected String marca;
    protected String Npuertas;
    protected String Nllantas;

    public Vehiculo() {
    }

    public Vehiculo(String color, int kilomatraje, String modelo, String marca, String Npuertas, String Nllantas) {
        this.color = color;
        this.kilomatraje = kilomatraje;
        this.modelo = modelo;
        this.marca = marca;
        this.Npuertas = Npuertas;
        this.Nllantas = Nllantas;
    }

    public String getColor() {
        return color;
    }

    public int getKilomatraje() {
        return kilomatraje;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getNpuertas() {
        return Npuertas;
    }

    public String getNllantas() {
        return Nllantas;
    }
    
    public String mostrarDato(){
        
       return "\ncolor:" + color + "\nKilometraje:" + kilomatraje+ "\nmodelo:" + modelo + "\nmarca:" + marca + "\nNpuertas:" + Npuertas + "\nNllantas:" + Nllantas;
    }
}
