public class FabricaDeTerceiros extends Fabrica {

    @Override
    ModeloBaseDeCarro retrieveCar(String requestedGrade) {
        switch (requestedGrade){
            case "Burguesia":
                return new Audi(800, "gasolina", "vermelho");
            case "Plebe":
                return new Volkswagem(100, "gasolina", "branco");
            default:
                System.out.println("Sua requisição foi invalida, favor verificar.");
                return null;
        }
    }
}
