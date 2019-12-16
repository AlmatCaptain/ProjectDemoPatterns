import java.util.ArrayList;
import java.util.List;

public class Gym {

    public static Gym instance;
    private List<Observer> observers = new ArrayList();
    private String name;
    private String address;
    private static List<Client> clientList = new ArrayList<>();

    private Gym(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static Gym getInstance(String name, String address) {
        if (instance == null) {
            instance = new Gym(name, address);
        }
        return instance;
    }

    public void addObs(Observer o) {
        observers.add(o);
    }

    public void addClient(Client client) {
        clientList.add(client);
        notifyObs(1, client);
    }

    public void remBook(Client client) {
        clientList.remove(client);
        notifyObs(2, client);
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Client> getBooksList() {
        return clientList;
    }

    public String getName() {
        return name;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public String getAddress() {
        return address;
    }

    public static List<Client> getClientList() {
        return clientList;
    }


    public void notifyObs(int cnt, Client book) {
        for (Observer o : observers) {
            o.update(book.getName(), cnt);
        }
    }
}
