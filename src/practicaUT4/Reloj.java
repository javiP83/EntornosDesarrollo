/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaUT4;

/**
 *
 * @author usuario
 */
public class Reloj {

    //Atributos de la clase Reloj
    private int HH;
    //Atributos de la clase Reloj
    private int MM;
    //Atributos de la clase Reloj
    private int SS;
    private int dia;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    private int mes;

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }


    //Constructor con parámetros
    public Reloj(int hora, int minuto, int segundo) {
        this.HH = hora;
        this.MM = minuto;
        this.SS = segundo;
    }
    //Métodos para asignar valores a los atributos hora, minuto y segundo
    
    public void asignarHora(int hora) {
        this.setHH(hora);
    }

    public int getHH() {
        return HH;
    }

    public void setHH(int HH) {
        this.HH = HH;
    }

    public int getMM() {
        return MM;
    }

    public void setMM(int MM) {
        this.MM = MM;
    }

    public int getSS() {
        return SS;
    }

    public void setSS(int SS) {
        this.SS = SS;
    }

    public void asignarMinuto(int minuto) {
        this.setMM(minuto);
    }

    
    public void asignarSegundo(int segundo) {    
        this.setSS(segundo);
    }
 //Métodos para devolver valores de los atributos hora, minuto y segundo

    public int obtenerHora() {
        return getHH();
    }

    public int obtenerMinuto() {
        return getMM();
    }

    public int obtenerSegundo() {
        return getSS();
    }
    
    //Método que incrementa 1 segundo la hora
    public void incrementa() {
        boolean cambio_m, cambio_h;
        cambio_m = (getSS() + 1 > 59) ? true : false;
        cambio_h = ((cambio_m) && (getMM() + 1 > 59)) ? true : false;
        setMM((cambio_m) ? getMM() + 1 : getMM());
        setMM((getMM() > 59) ? 0 : getMM());
        setHH((cambio_h) ? getHH() + 1 : getHH());
        setHH((getHH() > 23) ? 0 : getHH());
        setSS((getSS() + 1 > 59) ? 0 : getSS() + 1);
    }
    //Método que decrementa un segundo la hora
    public void decrementa() {
        boolean cambio_m, cambio_h;

        cambio_m = (getSS() - 1 < 0) ? true : false;
        cambio_h = ((cambio_m) && (getMM() - 1 < 0)) ? true : false;

        setMM((cambio_m) ? getMM() - 1 : getMM());
        setMM((getMM() < 0) ? 59 : getMM());
        setHH((cambio_h) ? getHH() - 1 : getHH());
        setHH((getHH() < 0) ? 23 : getHH());

        setSS((getSS() - 1 < 0) ? 59 : getSS() - 1);

    }
    //Método que da la hora en formato 12H
    public String hora12() {
        
        String mediodia, cadena;
        int hora12;
        mediodia = (getHH() >= 12) ? "PM" : "AM";
        hora12 = (getHH() > 12) ? getHH() - 12 : getHH();

    //Forma de poner un 0 en los minutos y segundos si es menor de 10
        cadena = hora12 + ":";
        cadena += (getMM() < 10) ? "0" : "";
        cadena += getMM() + ":";
        cadena += (getSS() < 10) ? "0" : "";
        cadena += getSS();
        cadena += " " + mediodia;
        return cadena;

    }
    //Método que da la hora en formato 24H
    public String hora24() {
        
        String cadena;

        //Forma de poner un 0 en los minutos y segundos si es menor de 10
        cadena = getHH() + ":";
        cadena += (getMM() < 10) ? "0" : "";
        cadena += getMM() + ":";
        cadena += (getSS() < 10) ? "0" : "";
        cadena += getSS();
        return cadena;

    }
}
