import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso: Java");
        curso1.setDescricao("Curso java iniciante");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso: JavaScript");
        curso2.setDescricao("Curso javaScript e seus metodos");
        curso2.setCargaHoraria(4);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso: Banco de Dados");
        curso3.setDescricao("Curso DB básico");
        curso3.setCargaHoraria(12);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Os primeiros passos em java");
        mentoria.setData(LocalDateTime.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Java Developer Iniciante");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);

        Dev devAnna = new Dev();
        devAnna.setNome("Anna");
        devAnna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Anna" + devAnna.getConteudosInscritos());
        devAnna.progredir();
        devAnna.progredir();
        devAnna.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Inscritos Anna" + devAnna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Anna" + devAnna.getConteudosConcluidos());
        System.out.println("XP:" + devAnna.calcularTotalXp());

        System.out.println("----------");

        Dev devPaula = new Dev();
        devPaula.setNome("Paula");
        devPaula.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Paula" + devPaula.getConteudosInscritos());
        devPaula.progredir();
        devPaula.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Paula" + devPaula.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Paula" + devPaula.getConteudosConcluidos());
        System.out.println("XP:" + devPaula.calcularTotalXp());

        System.out.println("----------");

        Dev devAmanda = new Dev();
        devAmanda.setNome("Amanda");
        devAmanda.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Amanda" + devAmanda.getConteudosInscritos());
        devAmanda.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Amanda" + devAmanda.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Amanda" + devAmanda.getConteudosConcluidos());
        System.out.println("XP:" + devAmanda.calcularTotalXp());
    }
}
