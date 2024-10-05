package Exercicio2;

public class Veiculo {
    private String tipo = "";
    private String cor = "";
    private String qntRodas = "";

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setQntRodas(String qntRodas) {
        this.qntRodas = qntRodas;
    }

    @Override
    public String toString() {
        return "Tipo: " + this.tipo + " " +
                " Cor: " + this.cor + " " +
                " Quantidade de Rodas: " + this.qntRodas + " ";
    }
}
