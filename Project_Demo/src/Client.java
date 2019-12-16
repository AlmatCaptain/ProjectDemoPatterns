import Strategy.Strategy;

public class Client extends Members implements Observer {

    private String phone;
    private String address;
    private Strategy strategy;

    public Client(String id, String name, int age, String gender) {
        super(id, name, age, gender);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(){
        strategy.doTrain(this.getName());
    }

    public static Builder builder(String id, String name, int age, String gender) {
        Client client = new Client(id, name, age, gender);
        return new Builder(client);
    }

    public static class Builder extends Members.Builder {

        public Builder(Members members) {
            super(members);
        }

        public Client build() {
            return (Client) super.build();
        }
    }

}
