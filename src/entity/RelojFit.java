/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author julan
 */
public class RelojFit extends Reloj {

    private int x, y;

    public RelojFit(String dia, String hora, String modelo, long numSerie, int x, int y) {
        super(dia, hora, modelo, numSerie);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int cuentaPasos(int x, int y) {
        int pasos = 0;
        /*este metodo calcula la cantidad de pasos desde (x,y) inicial
        hasta la coordenada (x,y) que llega por parametro.*/
        return pasos;
    }
      public double cuentaPasos(int x1, int y1, int x2, int y2) {
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }

    public int frecuenciaCardiaca() {
        int frecuencia = (int) (Math.random() * 41) + 60; // Frecuencia cardíaca entre 60 y 100
        return frecuencia;
    }
    @Override
    public String toString() {
        return "RelojFit{" + super.toString() + "Coordenadas: x=" + x + ", y=" + y + '}';
    }
}
