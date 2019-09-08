/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica.abstrata.botoes;

import javax.swing.JButton;

/**
 *
 * @author Julia
 */
public class FabricaBotoesIcones implements FabricaAbstrataBotoes{

    @Override
    public JButton criaBotaoOK() {
        JButton ok = new ButtonOK();
        ok.setText("OK");
        return ok;
    }

    @Override
    public JButton criaBotaoCancel() {
        JButton cancel = new ButtonCancel();
        cancel.setText("Cancelar");
        return cancel;
    }
    
}
