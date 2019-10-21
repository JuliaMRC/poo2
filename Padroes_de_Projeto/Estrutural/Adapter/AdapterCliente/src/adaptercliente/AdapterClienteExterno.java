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
    private ICliente cliente;
    
    private String nome;
    private String sobrenome;
    private String nomeCompleto;
    private String celularCompleto;
    
    AdapterClienteExterno(ClienteExterno ce){
        this.nome = ce.getNome();
        this.sobrenome = ce.getSobreNome();
        this.nomeCompleto = this.nome + this.sobrenome;
                
        this.cliente.setNomeCompleto(nomeCompleto);
        //this.cliente.setCelular(ce.getDddCelular() + ce.getCelular());
    }

}
