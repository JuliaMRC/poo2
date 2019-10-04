
package leitura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class LeCsv {
        
     public LinkedList<Cliente> leCsvClientes() throws IOException{         
      
        LinkedList<Cliente> clientes = new  LinkedList<Cliente>();             
        String current = new java.io.File( "." ).getCanonicalPath();        
        File inputFile = new File(current + "\\src\\arquivo.csv");                
        FileReader in = new FileReader(inputFile);
        BufferedReader inArq = new BufferedReader(in);
        
        int c;
        char a;
        String linha = inArq.readLine();
        
        ArrayList<String> linhas = new ArrayList();
        
        while (linha != null) {
            linha = inArq.readLine();
            if (linha != null){linhas.add(linha);}  
        }       
        in.close();
        
        for(int i=0; i<linhas.size(); i++){
            Cliente cliente = new Cliente();
            
            String linhaAtual = linhas.get(i);
            
            String[] linhaSplit = linhaAtual.split(";");
            
            cliente.setId(linhaSplit[0]);
            cliente.setNome(linhaSplit[1]);
            cliente.setEmail(linhaSplit[2]);
            cliente.setTelefone(linhaSplit[4]);
            cliente.setTotalCompras(Double.parseDouble(linhaSplit[5]));
            
            clientes.add(cliente);
        }
        
        //complete o codigo para ler o csv e criar as instancias de cliente.
        //rode o teste MainReadCsvTest.java para testar o seu código.
        
        return clientes;
     }
}
