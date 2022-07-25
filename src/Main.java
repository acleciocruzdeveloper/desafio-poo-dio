import br.com.aclecio.desafio.dominio.Bootcamp;
import br.com.aclecio.desafio.dominio.Curso;
import br.com.aclecio.desafio.dominio.Dev;
import br.com.aclecio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição cursa Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

/*        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println(" ------- Bootcamp DIO ------- ");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println(" -- RESUMO DE ATIVIDADES -- ");
        System.out.println("Conteúdos concluídos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP's conquistados Camila: " + devCamila.calcularXP());devCamila.progredir();
        System.out.println(" -- RESUMO DE ATIVIDADES -- ");
        System.out.println("Conteúdos concluídos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos inscritos Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("XP's conquistados Camila: " + devCamila.calcularXP());

        System.out.println("");
        System.out.println(" ------- Bootcamp DIO ------- ");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println(" -- RESUMO DE ATIVIDADES -- ");
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP's conquistados João: " + devJoao.calcularXP());


    }
}
