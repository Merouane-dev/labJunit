package labJunitApp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompteBancaireTest {

	@Test
    void testDebiterSoldeMontantValide() {
        CompteBancaire compte = new CompteBancaire(1000.0);
        compte.debiterSolde(500.0);
        assertEquals(500.0, compte.getSolde());
    }

    @Test
    void testDebiterSoldeMontantInvalide() {
        CompteBancaire compte = new CompteBancaire(1000.0);
        compte.debiterSolde(1500.0);
        assertEquals(1000.0, compte.getSolde());
    }

    @Test
    void testCrediterSoldeMontantValide() {
        CompteBancaire compte = new CompteBancaire(1000.0);
        compte.crediterSolde(500.0);
        assertEquals(1500.0, compte.getSolde());
    }

    @Test
    void testCrediterSoldeMontantInvalide() {
        CompteBancaire compte = new CompteBancaire(1000.0);
        compte.crediterSolde(-200.0);
        assertEquals(1000.0, compte.getSolde());
    }
}
}
