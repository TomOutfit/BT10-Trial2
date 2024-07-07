public class SpecUser extends User {
    private String address;

    public SpecUser() {
        super();
    }

    public SpecUser(String name, int status, String address) {
        super(name, status);
        this.address = address;
    }
    @Override
    public String toString() {
        return super.name + "," + address + "," + super.status;
    }
    
    public void setData(String address) {
            setName(getName()+" "+address);
        }
    public String GetValue() {
        if (getStatus() == 1) {
            return getName() + "admin";
        } else {
            return getName() + "user";
        }
    }
}
