
package com.mycompany.antojitosmc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class Mole implements Recetas{

    @Override
    public Map<String, Integer> recetaPasos() {  
        Map<String, Integer> platilloPasos = new LinkedHashMap<>();
        platilloPasos.put("Cocinar el pollo", 4);
        platilloPasos.put("Preparar la Salsa", 4);
        platilloPasos.put("Armar el Mole", 2);
        return platilloPasos;
        
    }
    
}
