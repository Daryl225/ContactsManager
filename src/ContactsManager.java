public class ContactsManager {
        Contact[] contacts;
        int count;

        public ContactsManager() {
            contacts = new Contact[100];
            count = 0;
        }

        public void addContact(Contact contact) {
            contacts[count] = contact;
            count++;
        }

        public Contact searchContact(String name) {
            for (int i = 0; i < count; i++) {
                if (contacts[i].name.equalsIgnoreCase(name)) {
                    return contacts[i];
                }
            }
            return null;
        }
    }

