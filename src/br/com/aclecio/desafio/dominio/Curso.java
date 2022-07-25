package br.com.aclecio.desafio.dominio;

public class Curso extends Conteudo {


    private int cargaHoraria;


    public Curso() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\n"+ " -- Curso -- " + "\n" +
                "Titulo: " + getTitulo() + "\n" +
                "Descricao: " + getDescricao() + "\n" +
                "CargaHoraria: " + cargaHoraria +
                "          ---------          ";
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }
}
