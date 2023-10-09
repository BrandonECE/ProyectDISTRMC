
package com.mycompany.antojitosmc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AntojitosMC {
    

    public static void main(String[] args) {       
       
        int decision;
        String[] menu;
        Platillos platillos = new Platillos();
        Map<String, Map<String, Integer>> recetas = new LinkedHashMap<>();
        recetas = platillos.getPasosPlatillos();
        menu = platillos.getMenu();
        decision = new AntojitosMC().userDecision();
        if(decision == 1) new Lineal(menu, recetas);
        else new Paralelizada(menu, recetas);
            
      
        
    }
    
        public int userDecision(){
        Scanner scanner = new Scanner(System.in);
        int decision;
        
            do {          
                    System.out.println("");
                    System.out.println("Ingrese el modo de programa: ");
                    System.out.println("1 -> Lineal ");
                    System.out.println("2 -> Paralelizado ");
                    System.out.print("Opcion: ");
                    decision = scanner.nextInt();
            } while (decision > 2 || decision < 1);

        return decision;
    }
}
