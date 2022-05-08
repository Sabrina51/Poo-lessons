/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tecelagem;

/**
 *
 * @author Perrotti
 */
public class Vendedor extends Funcionario{
  protected double totalVendas;

   public Vendedor(String nome, String RG, double salBase){
     super(nome, RG, salBase);
     totalVendas = 0;
   }

   @Override
   public void novoMes(){
     totalVendas = 0;
   }

   protected double valorComissao(){
       return totalVendas * 0.03;
   }
   
   @Override
   public double salarioLiquido(){
     return salBase + valorComissao();
   }

   public void registrarVenda(double valor){
     totalVendas += valor;
   }

   @Override
   public void hollerith(){
     super.hollerith();
     System.out.println(
        "Vendas no mês:" + totalVendas + "\n" +
        "Comissão: " + valorComissao() + "\n" +
        "Salário líquido: " + salarioLiquido() + "\n" +
        "+-----------------------------------+\n");
   }
}
