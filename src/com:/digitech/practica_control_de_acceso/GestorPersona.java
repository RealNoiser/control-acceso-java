
package com.digitech.practica_control_de_acceso;

import java.util.Scanner;
import java.text.Normalizer;

public class GestorPersona {
    private Persona persona;
    private Scanner scanner;
    
    public GestorPersona(){
        persona = new Persona();
        scanner = new Scanner(System.in);
    }
    
    public void cargarDatos(){
        System.out.println("Nombre: ");
        persona.setNombre(scanner.nextLine());
        
        System.out.println("Apellido: ");
        persona.setApellido(scanner.nextLine());
        
        System.out.println("Calle: ");
        persona.setCalle(scanner.nextLine());
        
        System.out.println("Teléfono: ");
        persona.setTelefono(scanner.nextLine());
        
        String[] aficiones = new String[3];
        for(int i=0;i<3;i++){
            System.out.println("Afición " + (i+1) + ": ");
            aficiones[i]=scanner.nextLine();
        }
        persona.setAficiones(aficiones);          
    }
    
    public void mostrarDatos(){
        System.out.println("\n-DATOS-");
        System.out.println("");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Calle: " + persona.getCalle());
        System.out.println("Teléfono: " + persona.getTelefono());
        System.out.println("Aficiones: ");
        
        for (String aficion : persona.getAficiones()){
            System.out.println(" - " + aficion);
        }
        System.out.println("-----------------------\n");
    }
    
    public void cambiarDatos(){
        int opc;
        

        System.out.println("\n¿Qué campo quieres cambiar?");
        System.out.println("1 - Nombre");
        System.out.println("2 - Apellido");
        System.out.println("3 - Calle");
        System.out.println("4 - Teléfono");
        System.out.println("5 - Aficiones");
        System.out.println("6 - Nada");
        
        opc = Integer.parseInt(scanner.nextLine());
        
        switch(opc){
            case 1:
                System.out.print("Nuevo nombre: ");
                persona.setNombre(scanner.nextLine());
                break;
            case 2:
                System.out.print("Nuevo apellido: ");
                persona.setApellido(scanner.nextLine());
                break;
            case 3:
                System.out.print("Nueva calle: ");
                persona.setCalle(scanner.nextLine());
                break;
            case 4:
                System.out.print("Nuevo teléfono: ");
                persona.setTelefono(scanner.nextLine());
                break;
            case 5:
                String[] aficiones = new String[3];
                for (int i = 0; i < 3; i++) {
                    System.out.print("Nueva afición " + (i+1) + ": ");
                    aficiones[i] = scanner.nextLine();
                }
                persona.setAficiones(aficiones);
                break;
            default:
                System.out.println("No se modifica nada.");
        } 
        
    }
    
    public static String quitaAcentos(String texto) {
    // 1) Descompone caracteres con acento en su forma base + marca diacrítica
    String normalized = Normalizer.normalize(texto, Normalizer.Form.NFD);
    // 2) Elimina todas las marcas diacríticas (p. ej. la tilde)
    return normalized.replaceAll("\\p{M}", "");
}
}
