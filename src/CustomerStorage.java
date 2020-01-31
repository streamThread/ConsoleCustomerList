import java.util.HashMap;


public class CustomerStorage {
    private HashMap<String, Customer> storage;
    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) throws IllegalArgumentException {
        String[] components = data.split("\\s+");
        if (components.length != 4) {
            throw new IllegalArgumentException("Invalid argument format. Correct format: " +
                    "\nВасилий Петров vasily.petrov@gmail.com +79215637722");
        }
        if (!components[0].toLowerCase().matches("^[а-я]+$") && !components[1].toLowerCase().matches("^[а-я]+$")) {
            throw new IllegalArgumentException("Invalid input name's format. Correct format: Василий Петров");
        }
        if (!components[2].toLowerCase().matches(".+@.+\\..+")) {
            throw new IllegalArgumentException("Invalid input e'mail's format. Correct format: vasily.petrov@gmail.com");
        }
        if (!components[3].matches("^\\+7\\d{10}$")) {
            throw new IllegalArgumentException("Invalid input phone's format. Correct format: +79215637722");
        }
        String name = components[0] + " " + components[1];
        storage.put(name, new Customer(name, components[3], components[2]));
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) throws IllegalArgumentException {
        if (!name.toLowerCase().matches("^[а-я]+\\s[а-я]+$")){
            throw new IllegalArgumentException("Invalid input name's format. Correct format: Василий Петров");
        }
        storage.remove(name);
    }

    public int getCount() {
        return storage.size();
    }
}