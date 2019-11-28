/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupoemail;

/**
 *
 * @author 20171BSI0162
 */
public class MembroEmail implements Observer{
    private String email;
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void update(Observable obs) {
        System.out.println("vc recebeu uma msg email");
    }
    
    
}
