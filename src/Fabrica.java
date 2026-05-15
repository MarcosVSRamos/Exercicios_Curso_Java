public abstract class Fabrica {

    public ModeloBaseDeCarro create(String requestedGrade) {
        ModeloBaseDeCarro carro = retrieveCar(requestedGrade);
        carro = prepareCar(carro);
        return carro;
    }
    private ModeloBaseDeCarro prepareCar(ModeloBaseDeCarro carro){
        carro.limpar();
        carro.checarMecanica();
        carro.abastecerVeiculo();
        return carro;
    }

    abstract ModeloBaseDeCarro retrieveCar(String requestedGrade);

}
