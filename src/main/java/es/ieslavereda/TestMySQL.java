package es.ieslavereda;

public class TestMySQL {
    public static void main(String[] args) {
        MydataSource.conectarMySQL();
        AlmacenDatosDB empleados = new EmpleadoDB();
        System.out.println(empleados.getEmpleados());
    }
}
