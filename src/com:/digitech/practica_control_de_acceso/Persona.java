
package com.digitech.practica_control_de_acceso;

public class Persona {
        private String nombre;
    private String apellido;
    private String calle;
    private String telefono;
    private String[] aficiones;
    
    public Persona(){
        
    }
    
    public Persona(String nombre, String apellido, String calle, String telefono, String[] aficiones){
        this.nombre=nombre;
        this.apellido=apellido;
        this.calle=calle;
        this.telefono=telefono;
        this.aficiones=aficiones;
    }

public String getNombre(){
return nombre;
}
public void setNombre(String nombre){
if(nombre.matches(".*\\d.*")){
                System.out.println("Error. El nombre no puede contener números.");
            }else{
                this.nombre = nombre;
            }
}

public String getApellido(){
return apellido;
}
public void setApellido(String apellido){
if(apellido.matches(".*\\d.*")){
                System.out.println("Error. El apellido no puede contener números.");
            }else{
                this.apellido = apellido;
            }
}

public String getCalle(){
return calle;
}
public void setCalle(String calle){
this.calle=calle;
}

public String getTelefono(){
return telefono;
}
public void setTelefono(String telefono){
this.telefono=telefono;
}

public String[] getAficiones(){
return aficiones;
}
public void setAficiones(String[] aficiones){
this.aficiones=aficiones;
}

}
