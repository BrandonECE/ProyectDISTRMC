
package com.mycompany.antojitosmc;


public class HiloPasos extends Thread{
        String paso;
        int tiempo;    

    public HiloPasos(String paso, int tiempo) {
        this.paso = paso;
        this.tiempo = tiempo;
    }

    @Override
    public void run() {
        process();
    }
    
    private void process(){
        try {
                            System.out.println(paso +" | Tiempo: " + tiempo);
                            Thread.sleep(tiempo*1000); 
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
    }
    
        
    
}
