import java.util.Scanner;

public class Konto {
        
    
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

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange kontonummer: ");
        
        int kontoNr = scanner.nextInt();
        
        Register register = new Register();

        if (register.doesAccountExist(kontoNr)) {
            System.out.println("Kontonummer upptaget!");
        } else {
            register.addAccount(kontoNr);
            System.out.println("Kontot " + kontoNr + " Har skapats");
        }

    }

    private void adminKonto() {

    }

}
