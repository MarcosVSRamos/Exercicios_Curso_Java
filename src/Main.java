//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Customer customerOne = new Customer("Plebe", true);
        Fabrica fabrica = getCarFactory(customerOne);
        ModeloBaseDeCarro carroUm = fabrica.create((customerOne.getGradeRequest()));
        carroUm.darPartida();

    }

    private  static  Fabrica getCarFactory(Customer customer) {
        if(customer.hasCompanyContract()){
            return new FabricaDaCompania();
        }else {
            return new FabricaDeTerceiros();
        }
    }
}