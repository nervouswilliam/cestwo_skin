package id.ac.binus.cestwo_skin.model;

public class Users {
    private String name;
    private Orders order;

    public Users(String name, Orders order) {
        this.name = name;
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public Orders getOrder() {
        return order;
    }
}
