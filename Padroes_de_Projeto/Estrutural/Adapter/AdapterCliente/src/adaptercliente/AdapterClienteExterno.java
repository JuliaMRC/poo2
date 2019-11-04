/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptercliente;

import adaptercliente.model.Cliente;
import adaptercliente.model.ICliente;
import lib.ClienteExterno;

/**
 *
 * @author 20171BSI0162
 */
public class AdapterClienteExterno extends Cliente{
    
    
    AdapterClienteExterno(ClienteExterno ce){
        this.setNomeCompleto(ce.getNome() + ' ' + ce.getSobreNome());   
        this.setCelular(ce.getDddCelular() + ' ' + ce.getCelular());
        this.setTelefone(ce.getDddTelefone() + ' ' + ce.getTelefone());
        this.setEmail(ce.getEmail());
    
    }
    

}
