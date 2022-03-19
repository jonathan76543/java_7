public class Prueba_1{

    public static void main(String[] args) {

        Empleados trabajador1=new Empleados("Paco rico");

        Empleados trabajador2=new Empleados("Ana");

        Empleados trabajador3=new Empleados("lucas");

        Empleados trabajador4=new Empleados("pepe");

        trabajador1.cambiaSeccion("RRHH");

        trabajador3.cambiaSeccion("operario");

        trabajador4.cambiaSeccion("coordinador");

        System.out.println(trabajador1.devuelveDatos());

        System.out.println(trabajador2.devuelveDatos());

        System.out.println(trabajador3.devuelveDatos());

        System.out.println(trabajador4.devuelveDatos());



    }
}



class Empleados<string>{

    public Empleados(String nom){

        nombre=nom;

        seccion="Administracion";

        Id=IdSiguiente;

        IdSiguiente++;
    }

   
    public void cambiaSeccion(String seccion){//setter

       this.seccion=seccion;

    }   
    public <string> String devuelveDatos(){

        return "El nombre es:"+ nombre +"//la seccion es:"+ seccion +"//y el Id=" +Id;
 
     }   


    private final String nombre;

    private String seccion;

    private int Id;

    private static int IdSiguiente=1;

    

}   