package guia4.ex2;

public class ClaseGestora {
    public ClaseGestora() {
    }
    public float calcularSueldo(Empleado empleado) {
        float retorno = 0;

        if (empleado instanceof EAsalariado) {
            int antiguedad = 2023 - empleado.getAñoIngreso();
            retorno = ((EAsalariado) empleado).getSalarioBase();
            if (antiguedad >= 2 && antiguedad <= 3) {
                retorno += retorno * 0.05;
            } else if (antiguedad >= 4 && antiguedad <= 7) {
                retorno += retorno * 0.1;
            } else if (antiguedad >= 8 && antiguedad <= 15) {
                retorno += retorno * 0.2;
            }
        } else if (empleado instanceof EComision) {
            retorno = ((EComision) empleado).getcCaptados() * ((EComision) empleado).getPrecioXCliente();
            if (retorno < 750)
                retorno = 750;
        }
        System.out.println(empleado.getNombre() + ' ' + empleado.getApellido() +
                ' ' + retorno);
        return retorno;
    }
    public void sueldoMayor(Empleado[] empleados) {
        float i = 0;
        Empleado richest = null;
        for (Empleado e :empleados) {
            if (e instanceof EAsalariado) {
                if (i < calcularSueldo(e)) {
                    i = calcularSueldo(e);
                    richest = e;
                }
            } else if (e instanceof EComision) {
                if (i < calcularSueldo(e)) {
                    i = calcularSueldo(e);
                    richest = e;
                }
            }
        }
        System.out.println("El mayor sueldo es de " + richest.getNombre() + ' ' +
                richest.getApellido() + " con un monto de $" + i);
    }
    public void mostrarTodos(Empleado[] empleados) {
        int i = 0;
        for (Empleado e :empleados) {
            if (e instanceof EAsalariado) {
                System.out.println(e.toString());
            } else if (e instanceof EComision) {
                System.out.println(e.toString());
            }
        }
    }
}
