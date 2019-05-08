/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beer;

/**
 *
 * @author Kadjal
 */
import java.util.List;
import java.util.ArrayList;
public class BeerExpert {
 
 public List getBrands(String color) {
 List<String> brands = new ArrayList();
 if (color.equalsIgnoreCase("amber")) {
     brands.add("Jail Pale Ale");
     brands.add("Gout Stout");
 }
 else {
     brands.add("Jack Amber");
     brands.add("Red Moose");
 }
 return(brands);
 }
}
