import static org.junit.jupiter.api.Assertions.*;


class autoEntrepriseTest {

    @org.junit.jupiter.api.Test
    void calculImpot() {
        AutoEntreprise autoEntreprise = new AutoEntreprise();
        assertEquals(autoEntreprise.calculImpot(100),25);
    }
}