
package com.mycompany.antojitosmc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Tacos implements Recetas{

    @Override
    public Map<String, Integer> recetaPasos() {
        Map<String, Integer> platilloPasos = new LinkedHashMap<>();
        platilloPasos.put("Preparas las tortillas", 3);
        platilloPasos.put("Preparas los guizos", 4);
        platilloPasos.put("Preparas las salsas", 2);
        platilloPasos.put("Armar la orden", 2);
        return platilloPasos;
    }
    
    
}
