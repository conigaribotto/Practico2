
package testMain;

import entity.Persona;
import entity.RelojFit;

public class Main {

    public static void main(String[] args) {
        //4_ Desde la java main class, llamar a los metodos de unReloj, accediendo desde objeto unaPersona
        // Llamar los metodos de todas las clasess
        
        RelojFit relojFit = new RelojFit("Jueves", "19:10hs", "Slim", 1234567, 3,3);
        
        Persona persona = new Persona("Paola", "Argento", 18, 1.65, relojFit);
        
        // Llamar a los métodos de la clase RelojFit a través del objeto Persona
        System.out.println("Coordenadas del reloj Fit: x=" + relojFit.getX() + ", y=" + relojFit.getY());

        System.out.println("Día del reloj: " + relojFit.getDia());
        System.out.println("Hora del reloj: " + relojFit.getHora());
    }

}
