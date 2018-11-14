/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stand;

import java.util.ArrayList;

public class StandModel {

    
    ArrayList<Automovel> carros = new ArrayList<>(6);
    
Automovel toyota;
Automovel seat;
Automovel mercedes;
Automovel fiat;
Automovel hiundai;
Automovel volvo;
    
    public void gerirCarros() {
        
    carros.add(new Automovel("toyota", 1996,1200,6.5,3000));
    carros.add(new Automovel("seat", 1997,1350,7.2,3200));
    carros.add(new Automovel("mercedes", 2004,2100,5.5,8000));
    carros.add(new Automovel("fiat", 2000,1600,6.8,4200));
    carros.add(new Automovel("hiundai", 2006,1450,5.8,3200));
    carros.add(new Automovel("volvo", 1994,1750,7.5,2500));
        
    }
    
}
