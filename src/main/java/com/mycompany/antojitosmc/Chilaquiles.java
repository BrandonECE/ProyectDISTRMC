
package com.mycompany.antojitosmc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class Chilaquiles implements Recetas{

    @Override
    public Map<String, Integer> recetaPasos() {
        Map<String, Integer> platilloPasos = new LinkedHashMap<>();
        platilloPasos.put("Cortar las tortillas", 2);
        platilloPasos.put("Dorar las tortillas", 3);
        platilloPasos.put("Preparar la salsa", 3);
        platilloPasos.put("Rayar el queso", 2);
        platilloPasos.put("Armar los chilaquiles", 2);
        return platilloPasos;
    }
    
}
