/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jetkeo
 */
public class Candy extends DessertItem {
    private double weight;
    private int pricePerLbs;
    
 public Candy(String name, double weight, int pricePerLbs)
    {
     super(name);
     this.weight = weight;
     this.pricePerLbs = pricePerLbs;
     
    }   
    

 
    
    public String toString()
    {
       
    }

    @Override
    public int getCost() {
        
    }
}
