package edu.ub.pis2018.ldoehndo17.groupal;

/**
 * Created by alexdickson on 28/3/18.
 */

public class Grupo {
    String titulo;
    String numAsistentes;
    int linkPortada;

    public Grupo(String titulo, String numAsistentes, int linkPortada) {
        this.titulo = titulo;
        this.numAsistentes = numAsistentes;
        this.linkPortada = linkPortada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNumAsistentes() {
        return numAsistentes;
    }

    public void setNumAsistentes(String numAsistentes) {
        this.numAsistentes = numAsistentes;
    }

    public int getLinkPortada() {
        return linkPortada;
    }

    public void setLinkPortada(int linkPortada) {
        this.linkPortada = linkPortada;
    }
}
