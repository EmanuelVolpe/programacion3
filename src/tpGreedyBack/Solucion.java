package tpGreedyBack;

import java.util.ArrayList;

public class Solucion {
    private ArrayList<Empleado> subgrupo;
    private int fuerzaTrabajoTotal;

    public Solucion(){
        this.subgrupo= new ArrayList<Empleado>();
        this.fuerzaTrabajoTotal=0;
    }

    public void agregarEmpleado(Empleado empleado){
        this.subgrupo.add(empleado);
        fuerzaTrabajoTotal+=empleado.getFuerzaTrabajo();
    }

    public ArrayList<Empleado> getSubgrupo(){
        ArrayList<Empleado>aux= new ArrayList<Empleado>(subgrupo);
        return aux;
    }

    public void quitarEmpleado(int pos){
        fuerzaTrabajoTotal-=this.subgrupo.remove(pos).getFuerzaTrabajo();
    }

    public int getFuerzaTrabajoTotal(){
        return this.fuerzaTrabajoTotal;
    }
}
