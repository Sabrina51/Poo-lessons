package atividadeestacionamento;

/**
 *
 * @author 0040482022028
 */
public class AtividadeEstacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carroNumeroUm = new Carro();
 
        carroNumeroUm.venderOCarro("Romario", 100.00);
        carroNumeroUm.calculoDaComissao(10.0);
        carroNumeroUm.mostrarRelatorio();
        
        
        
        
    }
    
}
