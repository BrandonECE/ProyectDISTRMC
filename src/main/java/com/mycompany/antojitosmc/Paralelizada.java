
package com.mycompany.antojitosmc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class Paralelizada {
    int clientes;
    String[] menu;
    Map<String, Map<String, Integer>> recetas;
    public Paralelizada(String[] menu, Map<String, Map<String, Integer>> recetas) {
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
        return indexPlatillo;
    }
     private void processPedido(String clientePedido){
          for (Map.Entry<String, Map<String, Integer>> platillos : recetas.entrySet()) {
                String platillo = platillos.getKey();
                if (clientePedido == platillo) {
                    int cont = 1;
                    List<Thread> hilos = new ArrayList<>();
                    System.out.println("#Pasos: ");
                     Map<String, Integer> pasoPlatillos = platillos.getValue();
                    for (Map.Entry<String, Integer> pasos : pasoPlatillos.entrySet()) {
                        String paso = pasos.getKey();
                        int tiempo = pasos.getValue();
//                        
                        if (cont < pasoPlatillos.size()) {
                            HiloPasos hiloPasos = new HiloPasos(paso, tiempo);
                            hilos.add(hiloPasos);
                            hiloPasos.start();
                        }else{
                            //Verificar que todos los hilos hayan terminado
                            while (true) {
                                       boolean allFinish = true;

                                       for (Thread hilo : hilos) {
                                           if (hilo.isAlive()) {
                                               allFinish = false;
                                               break;
                                           }
                                       }

                                       if (allFinish) {
                                           break;
                                       }
                                   }            
                            
                            try {
                            System.out.println(paso +" | Tiempo: " + tiempo);
                            Thread.sleep(tiempo*1000); 
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            
                            
                        }
                        
                        ++cont;
                        
                    }
                }
               
            }
    }
}
