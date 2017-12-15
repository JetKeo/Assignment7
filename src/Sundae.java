/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jetkeo
 */
public class Sundae extends IceCream{
    private String toppingName;

    
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
    {
     super(icName, icCost + toppingCost);
     this.toppingName = toppingName;
     
    }
    

    
    public String toString()
    {
        
        String fromSundae = toppingName + " Sundae with";
        fromSundae += "\n" + getName();
        for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH - (DessertShoppe.cents2dollarsAndCents(getCost()).length() + super.getName().length()); i++){
            fromSundae += " ";
        }
        fromSundae += DessertShoppe.cents2dollarsAndCents(getCost());
        
        return fromSundae;
    }
    
}
