
package practicajava;


public class VehiculoTurismo extends Vehiculo{
    
    private String credito ;

    public VehiculoTurismo(String credito) {
        this.credito = credito;
    }

    public VehiculoTurismo() {
    }

    public VehiculoTurismo(String color, int kilomatraje, String modelo, String marca, String Npuertas, String Nllantas) {
        super(color, kilomatraje, modelo, marca, Npuertas, Nllantas);
    }

    public String getCredito() {
        return credito;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getKilomatraje() {
        return kilomatraje;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getNpuertas() {
        return Npuertas;
    }

    @Override
    public String getNllantas() {
        return Nllantas;
    }
    
    @Override
    public String mostrarDato(){
    
        return "\ncolor:" + color + "\nKilometraje:" + kilomatraje+ "\nmodelo:" +modelo+ "\nmarca:" + marca + "\nNpuertas:" + Npuertas + "\nNllantas:" + Nllantas + "\ncredito:" + credito;
    }
    
    
}
