
package com.mycompany.antojitosmc;

import java.util.Map;
import java.util.Random;


public class Lineal {
    int clientes;
    String[] menu = {};
    Map<String, Map<String, Integer>> recetas;
    public Lineal(String[] menu, Map<String, Map<String, Integer>> recetas) {
        this.menu = menu;
        this.recetas = recetas;
        this.clientes = 0;
        process();
    }
    
      private void process(){
         
        NewCliente newCliente = new NewCliente();
        newCliente.start();
          
        while (true) {     
            
            System.out.println("@Total Clientes: " + clientes);
            System.out.println("");
            
            if (clientes > 0) {
                
                String clientePedido = clientPedido(menu);
                processPedido(clientePedido);
                --clientes;
                System.out.println("###UnCliente Completado###");
                
            }
            
            try {
                    Thread.sleep(2000); // Espera por 2 segundos (2000 milisegundos)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            clientes += newCliente.getNewClients();

        }
        

    }
      
    private String clientPedido(String[] menu){
        int indexMenu;
        String indexPlatillo = "";
        Random rand = new Random();
        indexMenu = rand.nextInt(5);
        for (int i = 0; i < menu.length; i++) {
            if (indexMenu == i) {
                indexPlatillo = menu[i];
            }
        }
        System.out.println("\n||    "+ indexPlatillo+"  ||");
        return indexPlatillo;
    }
    private void processPedido(String clientePedido){
          for (Map.Entry<String, Map<String, Integer>> platillos : recetas.entrySet()) {
                String platillo = platillos.getKey();
                if (clientePedido == platillo) {
                    System.out.println("#Pasos: ");
                     Map<String, Integer> pasoPlatillos = platillos.getValue();
                    for (Map.Entry<String, Integer> pasos : pasoPlatillos.entrySet()) {
                        String paso = pasos.getKey();
                        int tiempo = pasos.getValue();
                        try {
                            System.out.println(paso +" | Tiempo: " + tiempo);
                            Thread.sleep(tiempo*1000); // Espera por 2 segundos (2000 milisegundos)
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
            

                    }
                }
               
            }
    }
}
