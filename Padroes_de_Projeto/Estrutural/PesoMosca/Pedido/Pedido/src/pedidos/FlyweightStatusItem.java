/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedidos;

import java.util.HashMap;
import pedidos.StatusItem.Estado;

/**
 *
 * @author Julia
 */
public class FlyweightStatusItem {

    private static HashMap<Estado,StatusItem> cache = new HashMap<>();
    

    static StatusItem get(StatusItem.Estado estado) {
        return (StatusItem)cache.get(estado);
    }
    
    
    
}
