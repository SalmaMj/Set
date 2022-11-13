/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prositset;

/**
 *
 * @author User
 */
public class Enseignant {
    int id;
    String nom;
    String prenom;
    
    public Enseignant (){
     }
    public Enseignant (int id,String nom,String prenom)
    {
      this.id=id;
      this.nom=nom;
      this.prenom=prenom;
    }
      public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o instanceof Enseignant) {
            final Enseignant e = (Enseignant) o;
            if (e.getId() == this.getId()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Enseignant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + "}\n";
    }
    
}
