/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jetkeo
 */
public class Cookie extends DessertItem{
    private int number;
    private int pricePer12;
    
    public Cookie(String name, int number, int pricePer12)
    {
     super(name);
     this.number = number;
     this.pricePer12 = pricePer12;
     
    }

    
    public String toString()
    {
        
        String fromCookie = number + " @ $" + DessertShoppe.cents2dollarsAndCents(pricePer12) + " /dz.";
        fromCookie += "\n" + super.getName();
        for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH - (DessertShoppe.cents2dollarsAndCents(getCost()).length() + super.getName().length()); i++){
            fromCookie += " ";
        }
        fromCookie += DessertShoppe.cents2dollarsAndCents(getCost());
        
        return fromCookie;
    }

    @Override
    public int getCost() {
        double num = pricePer12 / 12.0;
        return (int)Math.round(num * number);
        
    }
    
}
