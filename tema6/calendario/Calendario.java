/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.calendario;

/**
 *
 * @author Macarena
 */
public class Calendario {

    int dia;
    int mes;
    int anyo;

    Calendario() {
        this.dia = 1;
        this.mes = 1;
        this.anyo = 1990;
    }

    Calendario(int dia, int mes, int anyo) {
        if (dia > 31 || dia < 1) {
            this.dia = 1;
        } else {
            this.dia = dia;
        }

        if (mes > 12 || mes < 1) {
            this.mes = 1;
        } else {
            this.mes = mes;
        }

        if (anyo > 2023 || anyo < 1990) {
            this.anyo = 1990;
        } else {
            this.anyo = anyo;
        }
    }

    void incrementarDia() {
        this.dia = this.dia + 1;
        if (this.dia == 32) {
            this.dia = 1;
            this.mes = this.mes + 1;
            if (this.mes == 13) {
                this.mes = 1;
                this.anyo = this.anyo + 1;
            }
        }
    }

    void incrementaMes() {
        if (this.mes == 13) {
            this.mes = 1;
            this.anyo = this.anyo + 1;
        }
    }

    void incrementaAnyo(int cantidad) {
        this.anyo = this.anyo + cantidad;
    }

    String mostrar() {
        return this.dia + "/" + this.mes + "/" + this.anyo;
    }

    boolean iguales(Calendario otraFecha) {
        boolean res = false;
        if (this.dia == otraFecha.dia && this.mes == otraFecha.mes && this.anyo == otraFecha.anyo) {
            res = true;
        }
        return res;
    }

}
