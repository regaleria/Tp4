class Persona  {
  private String nombre;  
  private String apellido;  
  private int dni;
  private String domicilio;
public Persona () {

  }
public Persona (String nombre, String apellido, int dni, String domicilio){
this.nombre = nombre;
this.apellido = apellido;
this.dni = dni;
this.domicilio = domicilio;
}
public String mostrarDatos (){
    System.out.println("Nombre: " + this.nombre + this.apellido);
    System.out.println("DNI: " + this.dni);
    System.out.println("Domicilio: " + this.domicilio);
  }

} 