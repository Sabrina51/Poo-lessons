package atividadeestacionamento;

/**
 *
 * @author 0040482022028
 */
public class Carro {

    // QUE COISAS EU TENHO? (ATRIBUTOS)
    private String placa, modelo, nomeDoVendedor;
    private Integer anoDeFabricacao;
    private Double valorQueALojaComprou, valorOfertadoParaComprarDaLoja, porcentagemParaComissao;
    private Boolean disponibilidade;

    // QUE COISAS EU FAÇO? (MÉTODOS)
    public Boolean estouDisponivel() {
        return disponibilidade;
    }

    public Carro() {
        this.placa = placa;
        this.modelo = modelo;
        this.nomeDoVendedor = "";
        this.anoDeFabricacao = anoDeFabricacao;
        this.valorQueALojaComprou = valorQueALojaComprou;
        this.valorOfertadoParaComprarDaLoja = valorOfertadoParaComprarDaLoja;
        this.porcentagemParaComissao = porcentagemParaComissao;
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
            return valorOfertadoParaComprarDaLoja - valorQueALojaComprou * porcentagemParaComissao;
        } else {
            return 0.0;
        }
    }
    
    public void mostrarRelatorio() {
        System.out.println(
            "Placa do carro:" + placa + "/n" +
            "Modelo do carro:" + modelo + "/n" +
            "Ano de fabricação:" + anoDeFabricacao + "/n" +
            "Valor pago na aquisição pela loja" + valorQueALojaComprou + "/n" +
            "Disponibilidade do veículo: " + disponibilidade
        );
    }
}
