public abstract class ModeloBaseDeCarro {

    private int potenciaDeCavalos;
    private String fonteDeCombustivel;
    private String cor;

    public ModeloBaseDeCarro(int potenciaDeCavalos, String fonteDeCombustivel, String cor) {

        this.potenciaDeCavalos = potenciaDeCavalos;
        this.fonteDeCombustivel = fonteDeCombustivel;
        this.cor = cor;

    }

    public void darPartida(){
        System.out.println("O veículo foi ligado com " + fonteDeCombustivel + " como combustivel, e agora está pronto para utilizar " + potenciaDeCavalos + " cavalos de potência");
    }
    public void limpar(){
        System.out.println("O carro foi limpo, e também pintado de " + cor.toLowerCase());
    }
    public void checarMecanica(){
        System.out.println("O carro foi devidamente checkado e avaliado");
    }
    public void abastecerVeiculo(){
        System.out.println("O carro foi abastecido com " + fonteDeCombustivel.toLowerCase());
    }

}
