/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jetkeo
 */
public class IceCream extends DessertItem{
    private int cost;

    public IceCream(String name, int cost)
    {
        super(name);
        this.cost = cost;
    }

  
    public String toString()
    {
     
        String fromIceCream = super.getName();
        for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH - (DessertShoppe.cents2dollarsAndCents(getCost()).length() + super.getName().length()); i++){
            fromIceCream += " ";
        }
        fromIceCream += DessertShoppe.cents2dollarsAndCents(cost);
        
        return fromIceCream;
       
    }

    @Override
    public int getCost() {
        return cost;
       
    }
    
}
