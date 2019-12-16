public abstract class Members implements Observer{

    private String id;
    private String name;
    private int age;
    private String gender;

    private String phone;
    private String address;

    public Members(String id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public void update(String name, int cnt) {
        if (cnt == 1) {
            System.out.println( this.name +": "+name + " is added!!!");
        } else if (cnt == 2) {
            System.out.println( name + " left!!!");
        }
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public static class Builder{
        Members members;

        public Builder(Members members) {
            this.members = members;
        }

        public Builder setPhone(String phone){
            members.phone=phone;
            return this;
        }

        public Builder setAddress(String address){
            members.address=address;
            return this;
        }

        public Members build(){
            return members;
        }
    }
}
