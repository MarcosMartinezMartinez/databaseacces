package es.ieslavereda;
import java.sql.Date;

public class TestMySQL {
    public static void main(String[] args) {
        MydataSource.conectarMySQL();
        AlmacenDatosDB empleados = new EmpleadoDB();
        System.out.println(empleados.getEmpleados());

        //Empleado empleado= empleados.getEmpleados().get(0);
        //empleado.setCargo("superjefe");
        //System.out.println(empleados.updateEmpleado(empleado));
        //System.out.println(empleados.getEmpleados());
       // System.out.println(empleados.deleteEmpleado("3x"));
        //System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");

        //Empleado empleado1 = new Empleado(1,"8X","Jesús","Aray Jesús","46888","empleados@empleado.es",new Date(2000,10,5),"jefes","su casa,55");
        //System.out.println(empleados.addEmpleado(empleado1));
        //System.out.println(empleados.getEmpleados());
        //System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println(empleados.authenticate("7X","1111"));
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");

      /*  System.out.println(empleados.authenticate("7X","1' OR PASSWORD != '1"));
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
*/
        System.out.println(empleados.getEmpleadosPorCargo("jefes"));
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println(empleados.getEmpleado("2x"));



        MydataSource.conectarOracleDataSource();
    }
}
