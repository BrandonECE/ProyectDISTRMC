
package com.mycompany.antojitosmc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Burritos implements Recetas{

    @Override
    public Map<String, Integer> recetaPasos() {
        Map<String, Integer> platilloPasos = new LinkedHashMap<>();
        platilloPasos.put("Calentar la tortilla", 3);
        platilloPasos.put("Preparar el guizo", 3);
        platilloPasos.put("Preparar la salsa", 3);
        platilloPasos.put("Armar el burritos", 2);
        return platilloPasos;
    }
    
}
