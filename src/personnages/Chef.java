package personnages;

public class Chef {
    private String nom;
    private int force;
    private int effetPotion = 1;
    private Village village;
    
    public Chef(String nom, int force,  Village village) {
        super();
        this.nom = nom;
        this.force = force;
        this.village = village;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void parler(String texte) {
        System.out.println(prendreParole(getNom()) +  texte);
    }

    private String prendreParole(String nom) {
        return "Le chef " + nom + " du village " + village.getNom() + " : ";
    }
    
    public void frapper(Romain romain) {
        System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
        romain.recevoirCoup(force/3);
    }
    
    public void boirePotion(Druide druide) {
        effetPotion = druide.getForcePotion();
        parler("« Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée. »");
    }
}