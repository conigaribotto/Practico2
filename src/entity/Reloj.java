/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author julan
 */
public class Reloj {

    protected String dia, hora, modelo;
    protected long numSerie;

    public Reloj(String dia, String hora, String modelo, long numSerie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }

    public void incrementarDia() {
        /*este metodo incrementa el dia por ejemplo, lunes a martes.
        Usando LocalDate*/
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
