

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso JavaScript");
        curso2.setDescricao("descrição curso JavaScript");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Qualidade de Software");
        mentoria.setDescricao("descrição Qualidade de Software");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp GFT QA para Mulheres");
        bootcamp.setDescricao("Descrição Bootcamp GFT QA para Mulheres");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev devCaroline = new Dev();
        devCaroline.setNome("Caroline");
        devCaroline.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Caroline:" + devCaroline.getConteudosInscritos());
        devCaroline.progredir();
        devCaroline.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Caroline:" + devCaroline.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Caroline:" + devCaroline.getConteudosConcluidos());
        System.out.println("XP:" + devCaroline.calcularTotalXp());

        System.out.println("-------");

        Dev devTiago = new Dev();
        devTiago.setNome("Tiago");
        devTiago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Tiago:" + devTiago.getConteudosInscritos());
        devTiago.progredir();
        devTiago.progredir();
        devTiago.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Tiago:" + devTiago.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Tiago:" + devTiago.getConteudosConcluidos());
        System.out.println("XP:" + devTiago.calcularTotalXp());

    }

}

