
package com.mycompany.antojitosmc;

import java.util.Random;

public class NewCliente extends Thread{
    int clientes;
    public NewCliente() {
        this.clientes = 0;
    }

    @Override
    public void run() {
        waitingForClient();
    }
    
 
    
    private void waitingForClient(){
        while (true) {      
            
            Random rand = new Random();
            int numeroRandom = rand.nextInt(10) + 1; 
            
            if(numeroRandom % 2 == 0){
                ++clientes;
                System.out.println("\n¡NuevoCliente!: "+clientes+"\n");
            }
            
             try {
                    Thread.sleep(3000); // Espera por 3 segundos (3000 milisegundos)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
    
    public int getNewClients(){
        int newClientes = clientes;
        clientes = 0;
        return newClientes;
    }
    
        
    
}
