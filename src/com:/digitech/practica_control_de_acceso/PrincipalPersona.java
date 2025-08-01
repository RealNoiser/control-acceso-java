
package com.digitech.practica_control_de_acceso;

import java.util.Scanner;



public class PrincipalPersona {
    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);
        
        Persona pers = new Persona();
        
        GestorPersona gp = new GestorPersona();
        gp.cargarDatos();
        gp.mostrarDatos();
        
        System.out.println("¿Quieres cambiar algún dato? Responde 'Sí' o 'No'");
        String respuesta=datos.nextLine();
        
        while(GestorPersona.quitaAcentos(respuesta).equalsIgnoreCase("si")){

        gp.cambiarDatos();
        gp.mostrarDatos();
        
        System.out.println("¿Quieres cambiar algún dato más? Responde 'Sí' o 'No'");
        respuesta=datos.nextLine();
        
        }
        System.out.println("¡¡Happy WorldWideWeb Day!!");
    }
}
