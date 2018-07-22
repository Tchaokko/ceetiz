import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AutoEntreprise implements entreprise {

    private int SIRET;
    private String denomination;

    public double calculImpot(double CA) {

        return 25 * (CA /100);
    }
}
