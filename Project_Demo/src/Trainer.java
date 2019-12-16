public class Trainer extends Members implements Observer {

    private String phone;
    private String address;

    public Trainer(String id, String name, int age, String gender) {
        super(id, name, age, gender);
    }


    public static Builder builder(String id, String name, int age, String gender){
        Trainer trainer = new Trainer(id, name, age, gender);
        return new Builder(trainer);
    }

    public static class Builder extends Members.Builder{

        public Builder(Members members) {
            super(members);
        }
        public Trainer build(){
            return (Trainer) super.build();
        }
    }

}
