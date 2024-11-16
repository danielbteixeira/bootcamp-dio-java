import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Golang");
        curso2.setDescricao("Descrição Curso Golang");
        curso2.setCargaHoraria(6);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Daniel:" + devDaniel.getConteudosInscritos());
        devDaniel.progredir();
        devDaniel.progredir();
        devDaniel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Daniel:" + devDaniel.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Daniel:" + devDaniel.getConteudosConcluidos());
        System.out.println("XP:" + devDaniel.calcularTotalXP());

        System.out.println("------");

        Dev devFernanda = new Dev();
        devFernanda.setNome("Fernanda");
        devFernanda.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Fernanda:" + devFernanda.getConteudosInscritos());
        devFernanda.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Fernanda:" + devFernanda.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Fernanda:" + devFernanda.getConteudosConcluidos());
        System.out.println("XP:" + devFernanda.calcularTotalXP());






    }
}