package exestacionamento;

/**
 *
 * @author Sabrina Silva
 */
public class Carro {

    private String placaDoCarro, anoDeFabricacao, modeloDoCarro, nomeDoVendedor;
    private Double valorDeCompra, valorOfertadoParaVenda, porcentagemComissao;
    private Boolean disponibilidadeDoCarro;

    public Carro(String placaDoCarro, String anoDeFabricacao, String modeloDoCarro, Double valorDeCompra, Boolean disponibilidadeDoCarro) {
        this.placaDoCarro = placaDoCarro;
        this.anoDeFabricacao = anoDeFabricacao;
        this.modeloDoCarro = modeloDoCarro;
        this.valorDeCompra = valorDeCompra;
        this.disponibilidadeDoCarro = disponibilidadeDoCarro;
        porcentagemComissao = 0.0;
    }

    public Boolean disponibilidadeParaVenda() {
        return disponibilidadeDoCarro ? true : false;
    }

    public Boolean ofertaParaVenda() {
        //Um valor é aceitável se for pelo menos 10% maior que o preço de compra.
        return valorOfertadoParaVenda > valorDeCompra + (valorDeCompra * 0.10);
    }

    public Boolean venderCarro(String vendedor, Double ofertaParaVenda) {
        valorOfertadoParaVenda = ofertaParaVenda;
        if (disponibilidadeDoCarro && ofertaParaVenda()) {
            disponibilidadeDoCarro = false;
            nomeDoVendedor = vendedor;
            return true;
        } else {
            return false;
        }
    }

    public Double valorDaComissao(Double porcentagemComissao) {
        this.porcentagemComissao = (valorOfertadoParaVenda - valorDeCompra) * porcentagemComissao;
        return porcentagemComissao;
    }

    public void imprimirDados() {
        if (disponibilidadeDoCarro) {
            System.out.println(
                    "Modelo do carro: " + this.modeloDoCarro + "\n"
                    + "Placa: " + this.placaDoCarro + "\n"
                    + "Ano: " + this.anoDeFabricacao + "\n"
                    + "Valor que foi comprado: R$" + this.valorDeCompra + "\n"
                    + "Disponível para venda? " + disponibilidadeDoCarro + "\n"
            );
        }
        if (!disponibilidadeDoCarro) {
            System.out.println(
                    "Modelo do carro: " + this.modeloDoCarro + "\n"
                    + "Placa: " + this.placaDoCarro + "\n"
                    + "Ano: " + this.anoDeFabricacao + "\n"
                    + "Valor que foi comprado: R$" + this.valorDeCompra + "\n"
                    + "Disponível para venda? " + disponibilidadeDoCarro + "\n"
                    + "Valor que foi vendido: R$" + valorOfertadoParaVenda + "\n"
                    + "Vendedor: " + this.nomeDoVendedor + "\n"
                    + "Comissão: R$" + this.porcentagemComissao
            );
        }

    }

}
