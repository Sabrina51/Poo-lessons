/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tecelagem;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        FuncAdm test = new FuncAdm("test", "151515", 0);
        
        test.funcAdmVetor[0] = 2;
        
        System.out.println(test.funcAdmVetor[0]);
        
        for(int i = 0; i < test.funcAdmVetor1.length; i++){
            System.out.println(test.funcAdmVetor1[i]);        
        }
    }
}
