/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tecelagem;

/**
 *
 * @author Perrotti
 */
public class FuncProd extends Funcionario{
   protected int horDn, horNt;

   public FuncProd(String nome, String RG, double salBase){
     super(nome, RG, salBase);
     horDn = 0;
     horNt = 0;
   }

   public void novoMes(){
     horDn = 0;
     horNt = 0;
   }

   protected double valorHrDn(){
       return (horDn * salBase);
   }
   
   protected double valorHrNt(){
       return (horNt * salBase * 1.3);
   }
   
   public double salarioLiquido(){
     return valorHrDn() + valorHrNt();
   }

   public void RegistrarHorasDiurnas(int horas){
     horDn += horas;
   }
   public void RegistrarHorasNoturnas(int horas){
     horNt += horas;
   }

   @Override
   public void hollerith(){
     super.hollerith();
     println("Horas trabalhadas:");
     println("   Diurnas : " + horDn);
     println("   Valor   : " + valorHrDn());
     println("   Noturnas: " + horNt);
     println("   Valor   : " + valorHrNt());
   }
}
