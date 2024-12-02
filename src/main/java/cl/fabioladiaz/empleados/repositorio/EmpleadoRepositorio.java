package cl.fabioladiaz.empleados.repositorio;

import cl.fabioladiaz.empleados.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {
}
