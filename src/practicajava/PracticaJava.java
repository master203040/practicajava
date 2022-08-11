//main
package practicajava;


public class PracticaJava {

    
    public static void main(String[] args) {
        
        Vehiculo vehiculos[]=new Vehiculo[3];
        
        vehiculos [0] = new Vehiculo("blanco", 52845,"2016","chevrolet","4","4");
        vehiculos[1]=new VehiculoTurismo("verde",1254854,"2018","toyota","4","4","si");
        vehiculos[2] = new VehiculoTodoterreno("amarillo",2356895,"2019", "mazda","4","4","no");
        
        
        for(Vehiculo vehiculo:vehiculos){
        
            System.out.println(vehiculo.mostrarDato());
            System.out.println("---------------------");
        }
    }
    
}
