import java.util.Scanner;

public class Konto {
        
    private Register register = new Register();
    private Scanner scanner = new Scanner(System.in);
    
    public void mainMenu() {
        boolean runMenu = true;
        do {

            
            
            
            System.out.println("****HUVUDMENY****");
            System.out.println("1. Skapa konto");
            System.out.println("2. Administrera konto");
            System.out.println("3. Avsluta");

            int menuChoice = scanner.nextInt();

            switch (menuChoice) {
                case 1:
                addKonto();    
                    break;
                case 2:
                adminKonto();
                    break;
                case 3:
                runMenu = false;
                break;   
            default:
            System.out.println("Fel: välj alternativ 1-3"); 
        }   
    }   while (runMenu); 
    
    }

    private void addKonto() {

        System.out.println("Ange kontonummer: ");
        
        int kontoNr = scanner.nextInt();

        if (register.doesAccountExist(kontoNr)) {
            System.out.println("Kontonummer upptaget!");
        } else {
            register.addAccount(kontoNr, 0.0);
            System.out.println("Kontot " + kontoNr + " Har skapats");
        }

    }

    private void adminKonto() {

        System.out.println("Ange kontonummer: ");
        int kontoNr = scanner.nextInt();

        if (!register.doesAccountExist(kontoNr)) {
            System.out.println("Kontot finns inte");
            return;
        }
        
        boolean iKontoMeny = true;

    while (iKontoMeny) {
        System.out.println("****KONTOMENY - konto: " + kontoNr + " ****");
        System.out.println("1. Ta ut pengar");
        System.out.println("2. Sätt in pengar");
        System.out.println("3. Visa saldo");
        System.out.println("4. Avsluta");

        int adminVal = scanner.nextInt();

            switch (adminVal) {
                case 1:
                    System.out.println("Hur mycket vill du ta ut?: ");
                    double uttagMängd = scanner.nextDouble();
                    register.uttag(kontoNr, uttagMängd);
                    break;
                case 2:
                    System.out.println("Hur mycket vill du sätta in?: ");
                    double insättningsMängd = scanner.nextDouble();
                    register.insättning(kontoNr, insättningsMängd);
                    break;
                case 3:
                    double saldo = register.checkSaldo(kontoNr);
                    System.out.println("Ditt saldo är: " + saldo);
                    break;
                case 4:
                    iKontoMeny = false;
                    break;
                default: 
                    System.out.println("Fel: välj 1-4!");
                    break;
            }
        }
    }

}
