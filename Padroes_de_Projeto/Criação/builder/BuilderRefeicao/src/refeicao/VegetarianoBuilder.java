

package refeicao;

/**
 *
 * @author felipe
 */
public class VegetarianoBuilder extends RefeicaoBuilder{
    
    public VegetarianoBuilder(Refeicao refeicao){
        this.refeicao = refeicao;
    }        
    public void preparaHamburgerVegetariano(){
        System.out.println("cria hamburger vegetariano");
        this.refeicao.setHamburger(new HamburgerVegetariano());                
    }  
    
    public void preparaBatata(){
        System.out.println("cria batata");
        this.refeicao.setBatata(new Batata());
    }
}


