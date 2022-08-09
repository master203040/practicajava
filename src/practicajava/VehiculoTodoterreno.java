
package practicajava;


public class VehiculoTodoterreno extends Vehiculo{

    public VehiculoTodoterreno() {
    }

    public VehiculoTodoterreno(String color, int kilomatraje, String modelo, String marca, String Npuertas, String Nllantas) {
        super(color, kilomatraje, modelo, marca, Npuertas, Nllantas);
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

    
    public String mostrarDato(){
    
        return "\ncolor:" + color + "\nKilometraje:" + kilomatraje + "\nmodelo:" + modelo + "\nmarca:" +marca+ "\nNpuertas:" +Npuertas+ "\nNllantas:" +Nllantas;
    }
    
}
