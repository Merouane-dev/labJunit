package labJunitApp;

public class Main {
	public static void main(String[] args) {
		Calculatrice c = new Calculatrice();
		
		double s = c.somme(10, 20);
		System.out.println("La somme de 10 et 20 : "+s);
		
		double p = c.produit(10, 20);
		System.out.println("Le produit de 10 et 20 : "+p);
		CompteBancaire monCompte = new CompteBancaire(1000.0);
        System.out.println("Solde initial : " + monCompte.getSolde());

        monCompte.crediterSolde(500.0);
        monCompte.debiterSolde(200.0);
        monCompte.debiterSolde(1500.0); // Tentative de débit avec un montant supérieur au solde
    }
	}

