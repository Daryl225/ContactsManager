public class Main {
    public static void main(String[] args) {

         try {
            ContactsManager myContactsManager = new ContactsManager();

            Contact c1 = new Contact();
            c1.name = "Alicia";
            c1.phoneNumber = "0711223344";
            myContactsManager.addContact(c1);

            Contact c2 = new Contact();
            c2.name = "Ada";
            c2.phoneNumber = "0112147585";
            myContactsManager.addContact(c2);

            Contact c3 = new Contact();
            c3.name = "Charle";
            c3.phoneNumber = "0733445566";
            myContactsManager.addContact(c3);

            Contact c4 = new Contact();
            c4.name = "Denver";
            c4.phoneNumber = "0540576879";
            myContactsManager.addContact(c4);

            Contact c5 = new Contact();
            c5.name = "Ethan";
            c5.phoneNumber = "0155667788";
            myContactsManager.addContact(c5);

            String nomRecherche = "Denver";
            Contact resultat = myContactsManager.searchContact(nomRecherche);

            if (resultat != null) {
                System.out.println("Numéro de " + nomRecherche + " : " + resultat.phoneNumber);
            } else {
                System.out.println(nomRecherche + " n'est pas dans le carnet.");
            }

        } catch (Exception e) {
            System.out.println("Une erreur est survenue : " + e.getMessage());
        }
    }
}
