
package com.mycompany.antojitosmc;

import java.util.LinkedHashMap;
import java.util.Map;

public class Platillos {
    
    Tacos tacos;
    Hamburguesa hamburguesa;
    Chilaquiles chilaquiles;        
    Burritos burritos;
    Mole mole;

    public Platillos() {
        this.tacos = new Tacos();
        this.hamburguesa = new Hamburguesa();
        this.chilaquiles = new Chilaquiles();        
        this.burritos = new Burritos();
        this.mole = new Mole();
    }
    
    public Map<String, Map<String, Integer>> getPasosPlatillos(){
        Map<String, Map<String, Integer>> recetas = new LinkedHashMap<>();
        recetas.put("Tacos", tacos.recetaPasos());
        recetas.put("Hamburguesa", hamburguesa.recetaPasos());
        recetas.put("Chilaquiles", chilaquiles.recetaPasos());
        recetas.put("Burritos", burritos.recetaPasos());
        recetas.put("Mole", mole.recetaPasos());
        return recetas;
    }
    
    public String[] getMenu(){
       String[] menu = {"Tacos", "Hamburguesa", "Chilaquiles", "Burritos", "Mole"};
       return menu;
    }
    
}
