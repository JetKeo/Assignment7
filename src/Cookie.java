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
        
    }

    @Override
    public int getCost() {
        
    }
    
}
