package pckg_banka;

public class Customer {

    private String name;
    private int id;
    private static int cntrID = 40;

    public Customer(String name){
        this.id = cntrID++;
        this.name = name;

    }
    @Override
    public String toString() {
        return "Customer{" +
                "Name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
