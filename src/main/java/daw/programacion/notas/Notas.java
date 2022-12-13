package daw.programacion.notas;

public class Notas {

    // notas transforma notas numéricas en Suspenso, Aprobado, Notable,
    // Sobresaliente, Matrícula de Honor
    public String notaTexto(double notaNumerica) {
        String notaTextual;
        if (notaNumerica < 0) {
            notaTextual = "La nota no puede ser menor que 0";
        } else if (notaNumerica < 5) {
            notaTextual = "Suspenso";
        } else if (notaNumerica < 7) {
            notaTextual = "Aprobado";
        } else if (notaNumerica < 9) {
            notaTextual = "Notable";
        } else if (notaNumerica < 10) {
            notaTextual = "Sobresaliente";
        } else if (notaNumerica == 10) {
            notaTextual = "Matrícula de Honor";
        } else {
            notaTextual = "La nota no puede ser mayor de 10";
        }
        return notaTextual;
    }

} // Notas
