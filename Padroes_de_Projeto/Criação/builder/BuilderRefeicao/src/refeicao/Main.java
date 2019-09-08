
package refeicao;

/**
 *
 * @author felipe
 */
public class Main {
    
    public static void main(String[] args) {
        
        DiretorRefeicao criaRefeicao = new DiretorRefeicao();      
        //controi uma refeicao.
        System.out.println("Refeição 1 - não vegetariana: ");
        Refeicao refeicao1 = criaRefeicao.preparaNaoVegetariana("laranja", "suco", true); 
        System.out.println("\n\nRefeição 2 - vegetariana: ");
        Refeicao refeicao2 = criaRefeicao.preparaVegetariana("guarana", "refrigerante", false);       
    }    
}
