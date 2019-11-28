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
public class Main {
    
    
    public static void main(String[] args) {
        
        MembroEmail monitorEmail = new MembroEmail();
        MembrosWhatsApp monitorWpp = new MembrosWhatsApp();
        
        CaixaEntradaGrupo caixaEntrada = new CaixaEntradaGrupo();
        caixaEntrada.addObserver(monitorEmail);
        caixaEntrada.addObserver(monitorWpp);
 
        
        caixaEntrada.setMensagem("bom dia");
        
        
    }
    
}
