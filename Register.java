import java.util.HashSet;
import java.util.Set;

public class Register {
    private Set<Integer> existingAccounts = new HashSet<>();

    public boolean doesAccountExist(int kontoNr) {
        return existingAccounts.contains(kontoNr);
    }
    
    public void addAccount(int kontoNr) {
        existingAccounts.add(kontoNr);
    }

}
