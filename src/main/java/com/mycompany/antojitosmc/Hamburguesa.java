
package com.mycompany.antojitosmc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class Hamburguesa implements Recetas{

    @Override
    public Map<String, Integer> recetaPasos() {
        Map<String, Integer> platilloPasos = new LinkedHashMap<>();
        platilloPasos.put("Cocinar la carne", 5);
        platilloPasos.put("Dorar el pan", 3);
        platilloPasos.put("Preparar los condimentos", 3);
        platilloPasos.put("Armar la hamburguesa", 2);
        return platilloPasos;
    }
    
}
