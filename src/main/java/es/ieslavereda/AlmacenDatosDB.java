package es.ieslavereda;

import java.util.List;

public interface AlmacenDatosDB {

    List<Empleado> getEmpleados();
    int updateEmpleado(Empleado empleado);
    int deleteEmpleado(String dni);
    Empleado addEmpleado(Empleado empleado);
    Empleado getEmpleado(String dni);
    boolean authenticate(String dni, String passwd);
    List<Empleado> getEmpleadosPorCargo(String cargo);

}
