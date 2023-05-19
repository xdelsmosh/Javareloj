/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.ArrayList;

/**
 *
 * @author mainc
 */
public class Lista {
    ArrayList<Op> list = new ArrayList<>();

    public Lista() {
        
    }
    public void añadirReloj(Op x){
        list.add(x);
    }
    public void borrarReloj(int x){
        list.remove(x);
    }
    public int getHora(int x){
        return list.get(x).getHora();
    }
    public int getMin(int x){
        return list.get(x).getMin();
    }
    public int getSeg(int x){
        return list.get(x).getSeg();
    }
    public void actualizarSegundosItems(int x){
        list.get(x).Sseg();
    }
    public void test(int x){
        System.out.println(list.get(x).getHora()+":"+list.get(x).getMin()+":"+list.get(x).getSeg());
    }
    public ArrayList getList(){
        return list;
    }
     public void Modificar(int id,int hora,int minuto,int segundo){
        list.get(id).setHora(hora);
        list.get(id).setMin(minuto);
        list.get(id).setSeg(segundo);   
    }
    
}
