package atividadeestacionamento;

/**
 *
 * @author 0040482022028
 */
public class Carro {

    // QUE COISAS EU TENHO? (ATRIBUTOS)
    private String placa, modelo, nomeDoVendedor;
    private Integer anoDeFabricacao;
    private Double valorQueALojaComprou, valorOfertadoParaComprarDaLoja, porcentagemParaComissao, valorDaComissao;
    private Boolean disponibilidade;

    // QUE COISAS EU FAÇO? (MÉTODOS)
    public Boolean estouDisponivel() {
        return disponibilidade;
    }

    public Carro() {
        this.placa = "ABC-1234";
        this.modelo = "1001ex";
        this.anoDeFabricacao = 2012;
        this.valorQueALojaComprou = 500.00;
        this.disponibilidade = true;
    }
    
    public Boolean ofertaParaMecomprarOCarro(Double valorOfertadoParaComprarDaLoja) {
        return valorOfertadoParaComprarDaLoja > (valorQueALojaComprou + valorQueALojaComprou * 0.10) ? true : false;
    }

    public Boolean venderOCarro(String nomeDoVendedor, Double valorOfertadoParaComprarDaLoja) {
        if (!disponibilidade || !ofertaParaMecomprarOCarro(valorOfertadoParaComprarDaLoja)) {
            return false;
        } else {
            this.nomeDoVendedor = nomeDoVendedor;
            this.valorOfertadoParaComprarDaLoja = valorOfertadoParaComprarDaLoja;
            this.disponibilidade = false;
            return true;
        }
    }
    
    public Double calculoDaComissao(Double porcentagemParaComissao) {
        if (!disponibilidade) {
            valorDaComissao = (valorOfertadoParaComprarDaLoja - valorQueALojaComprou) * porcentagemParaComissao / 100;
            return valorDaComissao;
        } else {
            return valorDaComissao = 0.0;
        }
    }
    
    public void mostrarRelatorio() {
        if (disponibilidade) {
            System.out.println(
            "Placa do carro: " + this.placa + "\n" +
            "Modelo do carro: " + modelo + "\n" +
            "Ano de fabricação: " + anoDeFabricacao + "\n" +
            "Valor pago na aquisição: R$" + valorQueALojaComprou + "\n" +
            "Disponibilidade do veículo: " + disponibilidade
            );
        }
        if (!disponibilidade) {
            System.out.println(
            "Placa do carro: " + placa + "\n" +
            "Modelo do carro: " + modelo + "\n" +
            "Ano de fabricação: " + anoDeFabricacao + "\n" +
            "Valor pago na aquisição pela loja: R$" + valorQueALojaComprou + "\n" +
            "Valor da venda: R$" + valorOfertadoParaComprarDaLoja + "\n" +  
            "Nome do Vendedor: " + nomeDoVendedor + "\n" +  
            "Comissão: RS" + valorDaComissao + "\n" +  
            "Disponibilidade do veículo: " + disponibilidade
            );
        }
        
    }
}
