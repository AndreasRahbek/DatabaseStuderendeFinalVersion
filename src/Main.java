import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DbSql db = new DbSql();
        System.out.println(db.studerendeOplysninger(1));

        System.out.println("1. opret studerende");
        System.out.println("2. opret fag");
        System.out.println("3. tildmeld studerende til fag");
        System.out.println("4. frameld studerende fra fag");
        System.out.println("5. Udskriv alle studerende");
        System.out.println("6. Udskriv alle fag");
        System.out.println("7. Søg oplysninger om en studerende");
        System.out.println("Indtast dit valg:");

        int valg = scanner.nextInt();

        int id;
        int stdnr;
        int fagid;
        int karakter;
        String fnavn;
        String enavn;
        String adresse;
        String postnr;
        String mobil;
        String klasse;

        switch (valg) {
            case 1:
                System.out.println("Indtast stdnr, fnavn, enavn, adresse, postnr, mobil og klasse: ");
                 stdnr = scanner.nextInt();
                 fnavn = scanner.next();
                 enavn = scanner.next();
                 adresse = scanner.next();
                 adresse+=" " + scanner.next();
                 postnr = scanner.next();
                 mobil = scanner.next();
                 klasse = scanner.next();

                db.opretStuderende(stdnr,fnavn,enavn,adresse,postnr,mobil,klasse);
                System.out.println("Studerende oprettet!");
                break;

            case 2:
                System.out.println("Indtast fagId og navn");
                fagid = scanner.nextInt();
                String fagNavn = scanner.next();
                db.opretFag(fagid,fagNavn);
                System.out.println("Fag er blevet oprettet!");
                break;

            case 3:
                System.out.println("Indtast id, stdnr, fagId og karakter: ");
                id = scanner.nextInt();
                stdnr = scanner.nextInt();
                fagid = scanner.nextInt();
                karakter = scanner.nextInt();
                db.tildmeldStuderendeFag(id,stdnr,fagid,karakter);
                System.out.println("Student tildmeldt fag!");
                break;

            case 4:
                System.out.println("Indtast stdnr og fagid");
                stdnr = scanner.nextInt();
                fagid = scanner.nextInt();
                db.frameldStuderendeFag(stdnr,fagid);
                System.out.println("Studerende frameldt fag!");
                break;

            case 5:
                System.out.println("Udskriver alle studerende: ");
                db.alleStuderende();
                break;


            case 6:
                System.out.println("Udskriver alle fag: ");
                db.alleFag();
                break;

            case 7:
                System.out.println("Indtast det stdnr du vil søge oplysninger om: ");
                stdnr = scanner.nextInt();
                System.out.println(db.studerendeOplysninger(stdnr));
                break;

        }

    }

}