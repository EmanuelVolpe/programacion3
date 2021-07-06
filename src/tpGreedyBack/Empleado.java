package tpGreedyBack;

public class Empleado implements Comparable<Empleado> {

      private String nombre;
      private String apellido;
      private int edad;
      private int fuerzaTrabajo;
      private boolean ingresado;

      public Empleado(String nombre, String apellido, int edad, int fuerzaTrabajo) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
            this.fuerzaTrabajo = fuerzaTrabajo;
            this.ingresado = false;
      }

      public String getNombre() {
            return nombre;
      }

      public void setNombre(String nombre) {
            this.nombre = nombre;
      }

      public String getApellido() {
            return apellido;
      }

      public void setApellido(String apellido) {
            this.apellido = apellido;
      }

      public int getEdad() {
            return edad;
      }

      public void setEdad(int edad) {
            this.edad = edad;
      }

      public int getFuerzaTrabajo() {
            return fuerzaTrabajo;
      }

      public void setFuerzaTrabajo(int fuerzaTrabajo) {
            this.fuerzaTrabajo = fuerzaTrabajo;
      }

      public void setIngresado(boolean a) {
            this.ingresado = a;
      }

      public boolean getIngresado() {
            return ingresado;
      }

      @Override
      public int compareTo(Empleado empleado) {
            return this.getFuerzaTrabajo() - empleado.getFuerzaTrabajo();
      }
}
