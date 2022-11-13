/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prositset;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author User
 */
public class EspritHashSet implements GestionEnseignant {
    Set enseignants=new HashSet();
   
     public EspritHashSet(){ 
     this.enseignants=new HashSet();
    }
     public void ajouterEnseignant(Enseignant e){
         enseignants.add(e);
   }
     public boolean rechercherEnseignant (Enseignant e){
       return enseignants.contains(e);  
        
     }
      public boolean rechercherEnseignant (int id)
      {
          for (Object e : enseignants){
     if( e.getId().equals(id))
             return true;
        }
return false ;
    }
      
    public void supprimerEnseignant (Enseignant e){
             enseignants.remove(e);
        
    }
    public void displayEnseignants()  {
       System.out.println(enseignants);
    }
    
}
