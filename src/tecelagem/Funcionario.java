/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tecelagem;

/**
 *
 * @author Perrotti
 */

// Classe ancestral para todas as outras
public abstract class Funcionario {
   protected String nome, RG;
   protected double salBase;

   // construtor
   public Funcionario(String nome, String RG, double salBase){
     this.nome = nome;
     this.RG = RG;
     this.salBase = salBase;
   }

   // métodos abstratos
   public abstract double salarioLiquido();
   public abstract void novoMes();

   // método com implementação parcial
   public void hollerith(){
     println("+--- Hollerith mensal ---+");
     println("Nome: " + nome);
     println("RG: " + RG);
     println("Salário base: " + salBase);
     println("Salário líquido: " + salarioLiquido());
   }
   
   // métodos auxiliares
   protected void println(String ln){
     System.out.println(ln);
   }
}
