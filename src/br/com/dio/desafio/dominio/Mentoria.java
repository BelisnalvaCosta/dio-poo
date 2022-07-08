package br.com.dio.desafio.dominio;

import java.time.LocalDateTime;

public class Mentoria extends Conteudo implements calcularXp {

    private LocalDateTime data;

    public Mentoria() {
    }

    public double caluclarXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDateTime getData(Object now) {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public void calcularXp(double multiplicarXp) {

    }
}