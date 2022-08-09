
package practicajava;


public class PracticaJava {

    
    public static void main(String[] args) {
        
        Vehiculo vehiculos[]=new Vehiculo[3];
        
        vehiculos [0] = new Vehiculo("blanco", 52845,"2016","chevrolet","4","4");
        vehiculos[1]=new VehiculoTurismo("verde", 45212,"2020","mercedez", "4", "4");
        vehiculos[2] = new VehiculoTodoterreno("rojo",258754,"2015","mazda","4","4");
        
        for(Vehiculo vehiculo:vehiculos){
        
            System.out.println(vehiculo.mostrarDato());
            System.out.println("---------------------");
        }
    }
    
}
