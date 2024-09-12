/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escuelaing.edu.co.parcialarep;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author camilo.murcia-e
 */
public class ReflexCalculator {
    
    private double a;
    private double b;
    
    public ReflexCalculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public List<Integer> bubbleSort(List<Integer> numeros){
        for(int i = 0; i < numeros.size();i++){
            if (numeros.get(i) > numeros.get(i+1)){
                int aux = numeros.get(i);
                int aux2 = numeros.get(i+1);
                numeros.set(i, aux2);
                numeros.set(i+1, aux);
            }
        }
        
        return numeros;
    }
    
    public double suma(){
        return a + b;
    }
    
    public double resta(){
        return a-b;
    }
    
    public double mult(){
        return a*b;
    }
    
    public void main(String[] args){
        ReflexCalculator rc = new ReflexCalculator(7, 8);
        System.out.print(rc.suma());
    }
}
