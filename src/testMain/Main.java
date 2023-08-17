
package testMain;

public class Main {

    public static void main(String[] args) {
        //4_ Desde la java main class, llamar a los metodos de unReloj, accediendo desde objeto unaPersona
        // Llamar los metodos de todas las clasess
        
        RelojFit relojFit = new RelojFit("Jueves", "19:10hs", "Slim", 1234567, 3,3);
        
        Persona persona = new Persona("Paola", "Argento", 18, 1.65, relojFit);
        
    }

}
