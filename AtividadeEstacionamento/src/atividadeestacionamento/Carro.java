/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeestacionamento;

/**
 *
 * @author 0040482022028
 */
public class Carro {

    private String placa;
    private String ano;
    private String modelo;
    private Float valorDaCompra;
    private Float valorParaVenda;
    private Boolean disponibilidade;
    private String vendedor;
    private Double porcentagem;
    // DEPOIS QUE O CARRO FOR VENDIDO FICARÁ INDISPONIVEL
    //E DEVE TER O NOME DO VENDEDOR E VALOR DA VENDA ARMAZENADOS.

    public Carro() {
        this.placa = placa;
        this.ano = ano;
        this.modelo = modelo;
        this.valorDaCompra = valorDaCompra;
        this.disponibilidade = true;
        this.vendedor = "";
    }

    
    
    
    
    // <METODOS>
    //Retorna true se o carro está disponível, ou seja, ainda não foi vendido.
    //Retorna false se o carro já foi vendido.
    //Quando é criada uma instancia de um carro, ele começa disponível e o nome do vendedor fica em branco.
    public boolean disponivel() {
        return disponibilidade;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
    public boolean oferta(double valorParaVenda) {

        if(valorParaVenda > valorDaCompra) {
            //Retorna true se o valor ofertado para o carro é aceitável.
            //Um valor é aceitável se for pelo menos 10% maior que o preço de compra.
            return true;
        } else {
            return false;
        }
    }

    public boolean venderCarro(String vendedor, Double valorParaVenda) {
        
        /*
        Vende o carro. O carro passa a ser marcado como vendido (não disponível)
        e o nome do vendedor e o valor de venda são armazenados. Retorna false (e não faz nada) se:
        1) O valor de venda não é aceitável.
        2) O carro já tinha sido vendido antes.
         */
        return true;
    }
    
    public double comissao(Double porcentagem){
        /*
        Apenas para carros já vendidos. Retorna a comissão do vendedor.
        A comissão é calculada aplicando a porcentagem indicada no
        parâmetro na diferença entre o preço de venda e o preço de compra.
        Se o carro ainda não foi vendido, retorna zero
        */ 
        
        return 5;
    }
    
    public void impremirRelatorio(){
        /*
        Imprime todos os atributos do carro na saída padrão.
        Deve informar também se o carro está disponível ou se foi vendido.
        Caso o carro já tenha sido vendido, informar também o
        nome do vendedor e a comissão que tem direit
        */
    }
}
