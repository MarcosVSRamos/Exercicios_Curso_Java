public class FabricaDaCompania extends Fabrica{


    @Override
    ModeloBaseDeCarro retrieveCar(String requestedGrade) {
        switch (requestedGrade){
            case "Burguesia":
                return new Tesla(1000, "gasolina", "Azul");
            case "Plebe":
                return new Fiat(79, "gasolina", "Prata");
            default:
                System.out.println("A sua solicitação foi invalida, verifique seu pedido!");
                return null;
        }
    }
}
