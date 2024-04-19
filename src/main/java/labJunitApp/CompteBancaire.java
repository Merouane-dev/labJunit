package labJunitApp;

public class CompteBancaire {
	 private double solde;

	    // Constructeur
	    public CompteBancaire(double soldeInitial) {
	        this.solde = soldeInitial;
	    }

	    // Méthode pour récupérer le solde
	    public double getSolde() {
	        return solde;
	    }

	    // Méthode pour débiter un montant du solde
	    public void debiterSolde(double montant) {
	        if (montant > 0 && montant <= solde) {
	            solde -= montant;
	            System.out.println("Débit de " + montant + " effectué. Nouveau solde : " + solde);
	        } else {
	            System.out.println("Montant invalide pour le débit ou solde insuffisant.");
	        }
	    }

	    // Méthode pour créditer un montant sur le solde
	    public void crediterSolde(double montant) {
	        if (montant > 0) {
	            solde += montant;
	            System.out.println("Crédit de " + montant + " effectué. Nouveau solde : " + solde);
	        } else {
	            System.out.println("Montant invalide pour le crédit.");
	        }
	    }

}
