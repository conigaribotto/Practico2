/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author julan
 */
public class Reloj {

    protected String dia, hora, modelo;
    protected long numSerie;
    private static final Locale xxx = new Locale ("es","AR");

    public Reloj() {
        LocalDate obj= LocalDate.now();
        dia=obj.getDayOfWeek().toString();
        
    }

    public String getDia() {
        return DayOfWeek.valueOf(dia).getDisplayName(TextStyle.FULL, xxx );
    }

    public String getHora() {
        return hora;
    }

    public void incrementarDia() {
        /*este metodo incrementa el dia por ejemplo, lunes a martes.
        Usando LocalDate*/
        DayOfWeek dianom= DayOfWeek.valueOf(dia);
        dianom=dianom.plus(1);
        dia=dianom.toString();
    }

    public void incrementarHora() {
        /*este metodo incrementa la hora
         usando LocalDate, parsear hora de string a LocalDate*/
    }

    public void limpiarPantalla() {
        //consultar que hace este metodo.
    }

    @Override
    public String toString() {
        return "Reloj{" + "dia=" + dia + ", hora=" + hora + ", modelo=" + modelo + ", numSerie=" + numSerie + '}';
    }
}
