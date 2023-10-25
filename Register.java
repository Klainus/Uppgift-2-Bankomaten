//import java.util.HashSet;
//import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Register {
    //private Set<Integer> existingAccounts = new HashSet<>();
    private Map<Integer, Double> kontoSaldo = new HashMap<>();

    public boolean doesAccountExist(int kontoNr) {
        return kontoSaldo.containsKey(kontoNr);
    }
    
    public void addAccount(int kontoNr, double initialSaldo) {
        kontoSaldo.put(kontoNr, initialSaldo);
    }

    public double checkSaldo(int kontoNr) {
        if (doesAccountExist(kontoNr)) {
            return kontoSaldo.get(kontoNr);
        }
        return 0.0;
    }
    
    public void insättning(int kontoNr, double amount) {
        if (doesAccountExist(kontoNr)) {
            double currentSaldo = kontoSaldo.get(kontoNr);
            kontoSaldo.put(kontoNr, currentSaldo + amount);
        }
    }

    public void uttag(int kontoNr, double amount) {
        if (doesAccountExist(kontoNr)) {
            double currentSaldo = kontoSaldo.get(kontoNr);
            if (currentSaldo >= amount) {
                kontoSaldo.put(kontoNr, currentSaldo - amount);
            } else {
                System.out.println("Otillräckligt med pengar på kontot!");
            }
        }
    }
    



}
