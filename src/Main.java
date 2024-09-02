import entidades.Animal;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        LinkedList<Animal> animais = new LinkedList<>();
        Animal animal = new Animal();
        int opcao;

        do {
            System.out.println("--------MENU ZOO--------");
            System.out.println("1 - CADASTRAR");
            System.out.println("2 - LISTAR ANIMAIS");
            System.out.println("3 - SAIR");
            System.out.print("INFORME A OPÇÃO: ");
            opcao = le.nextInt();
            le.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("CADASTRAR NOVO ANIMAL");
                    System.out.print("INFORME O NOME: ");
                    animal.setNome(le.nextLine());
                    System.out.print("INFORME A ESPECIE: ");
                    animal.setEspecie(le.nextLine());
                    System.out.print("INFORME A IDADE: ");
                    animal.setIdade(le.nextInt());
                    System.out.print("INFORME O PESO: ");
                    animal.setPeso(le.nextFloat());
                    System.out.print("INFORME O TAMANHO: ");
                    animal.setTamanho(le.nextFloat());
                    le.nextLine();
                    System.out.print("INFORME A COR: ");
                    animal.setCor(le.nextLine());
                    System.out.print("INFORME O HABITAT: ");
                    animal.setHabitat(le.nextLine());
                    System.out.print("INFORME A DIETA: ");
                    animal.setDieta(le.nextLine());
                    System.out.print("INFORME A EXPECTATIVA DE VIDA: ");
                    animal.setExpectativaDeVida(le.nextInt());
                    le.nextLine();
                    System.out.print("INFORME A ORIGEM GEOGRAFICA: ");
                    animal.setOrigemGeografica(le.nextLine());
                    animais.add(animal);
                    System.out.println("ANIMAL CADASTRADO COM SUCESSO");
                    break;
                case 2:
                    System.out.println("LISTA DE ANIMAIS CADASTRADOS");
                    for (int i = 0; i <= animais.size(); i++) {
                        System.out.println(animais.size());
                        System.out.println("ANIMAL " + i);
                        System.out.println("NOME: " + animais.get(i).getNome());
                        System.out.println("ESPECIE: " + animais.get(i).getEspecie());
                        System.out.println("IDADE: " + animais.get(i).getIdade());
                        System.out.println("PESO: " + animais.get(i).getPeso());
                        System.out.println("TAMANHO: " + animais.get(i).getTamanho());
                        System.out.println("COR: " + animais.get(i).getCor());
                        System.out.println("HABITAT: " + animais.get(i).getHabitat());
                        System.out.println("DIETA: " + animais.get(i).getDieta());
                        System.out.println("EXPECTATIVA DE VIDA: " + animais.get(i).getExpectativaDeVida());
                        System.out.println("ORIGEM GEOGRAFICA: " + animais.get(i).getOrigemGeografica());
                        System.out.println("-------------------------------");
                    }
                    break;
                case 3:
                    System.out.println("PROGRAMA FINALIZADO");
                    break;
                default:
                    System.out.println("OPCÃO INVALIDA!!!");
            }
        } while (opcao != 3);

    }
}