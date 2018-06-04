/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import javax.swing.JLabel;

/**
 *
 * @author LN710Q
 */
public class AnimalThread extends Thread {
    private String nombre;
    private int limite;
    private JLabel animal;
    private int x;
    private int y;
    private int k;
    private boolean flag=false;
    
    public AnimalThread(){}
    
    public AnimalThread(String nombre, int x, int y, int limite, JLabel animal,int k){
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.limite = limite;
        this.animal = animal;
        this.k = k;
    }
    
    public AnimalThread(String nombre, int x, int y, int limite, JLabel animal){
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.limite = limite;
        this.animal = animal;
    }
    
    @Override
    public void run(){
        for(int i=x; i<=this.limite;i+=10){
            System.out.println(this.nombre+" avanza");
            this.animal.setLocation(i,y);
            try{
                sleep(20);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(this.nombre+" ha llegado a la meta");
        setFlag(true);
        animal.
        /*try{
            sleep(900);
            Volver();
            sleep(500);
            run();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        */
        
        yield();
    }
    
    public void Volver(){
        this.animal.setLocation(0,y);
        System.out.println("vuelve");
        setFlag(false);
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    
    
    

}
