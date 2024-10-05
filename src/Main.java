import Exercicio1.Pizza;
import Exercicio1.PizzaBuilder;
import Exercicio2.Veiculo;
import Exercicio2.VeiculoBuilder;
import Exercicio3.Relatorio;
import Exercicio3.RelatorioBuilder;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercicio 1");
        Exercicio1();
        System.out.println("\n\nExercicio 2");
        Exercicio2();
        System.out.println("\n\nExercicio 3");
        Exercicio3();
    }

    public static void Exercicio1(){

        Pizza marguerita = new PizzaBuilder()
                .setMassa("Integral")
                .addIngrediente("Queijo, Mussarela, Tomate e Manjericão")
                .setTamanho("Grande")
                .build();

        Pizza calabresa = new PizzaBuilder()
                .setMassa("Integral")
                .addIngrediente("Queijo, Mussarela, Calabresa e Cebola")
                .setTamanho("Pequena")
                .build();

        System.out.println(marguerita.toString());
        System.out.println(calabresa.toString());
    }

    public static void Exercicio2(){

        Veiculo Stillo = new VeiculoBuilder()
                .setTipo("Carro")
                .setCor("Vermelho")
                .setQntRodas("4")
                .build();

        Veiculo Bis = new VeiculoBuilder()
                .setTipo("Moto")
                .setCor("Preto")
                .setQntRodas("2")
                .build();

        System.out.println(Stillo.toString());
        System.out.println(Bis.toString());
    }

    public static void Exercicio3(){

        Relatorio relatorio = new RelatorioBuilder()
                .setTitulo("Era uma vez")
                .setCorpo("Uma pequena aldeia cercada por montanhas verdes e um rio cristalino.")
                .setRodape("Fim")
                .build();

        System.out.println(relatorio.toString());
    }


}