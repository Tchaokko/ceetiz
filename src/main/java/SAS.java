import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SAS implements entreprise {
    private int SIRET;
    private String denomination;
    private String adresseSocial;

    public double calculImpot(double CA) {
        return 33 *(CA / 100);
    }
}
