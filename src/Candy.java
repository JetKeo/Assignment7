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
        
        String fromCandy = weight + " lbs.";
        fromCandy += " @ $" + DessertShoppe.cents2dollarsAndCents(pricePerLbs) + " /lb.";
        fromCandy += "\n" + super.getName();
        for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH - (DessertShoppe.cents2dollarsAndCents(getCost()).length() + super.getName().length()); i++){
            fromCandy += " ";
        }
        fromCandy += DessertShoppe.cents2dollarsAndCents(getCost());
    
        
        return fromCandy;
                
       
    }

    @Override
    public int getCost() {
    return (int)weight * pricePerLbs;
        
    }
}
