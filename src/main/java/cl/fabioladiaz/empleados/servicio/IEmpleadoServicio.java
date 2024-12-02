package cl.fabioladiaz.empleados.servicio;

import cl.fabioladiaz.empleados.modelo.Empleado;

import java.util.List;

public interface IEmpleadoServicio {

    public List<Empleado> listarEmpleados();
    public Empleado buscarEmpleadoporId(Integer idEmpleado);
    public void guardarEmpleado(Empleado empleado);
    public void eliminarEmpleado(Empleado empleado);
}
