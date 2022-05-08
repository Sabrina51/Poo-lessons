package exestacionamento;

/**
 *
 * @author Sabrina Silva
 */
public class ExEstacionamento {

    public static void main(String[] args) {
        Carro carro1 = new Carro("ASD-1234", "2000", "z500", 2000.00, true);

        carro1.venderCarro("Tonny Santos", 1000.00);
        carro1.valorDaComissao(0.10);
        carro1.imprimirDados();
    }

}
