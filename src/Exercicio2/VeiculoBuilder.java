package Exercicio2;

public class VeiculoBuilder {

    Veiculo veiculo = new Veiculo();

    public VeiculoBuilder setTipo(String tipo) {
        this.veiculo.setTipo(tipo);
        return this;
    }

    public VeiculoBuilder setCor(String cor) {
        this.veiculo.setCor(cor);
        return this;
    }

    public VeiculoBuilder setQntRodas(String qntRodas) {
        this.veiculo.setQntRodas(qntRodas);
        return this;
    }
    public Veiculo build(){return this.veiculo;}
}

