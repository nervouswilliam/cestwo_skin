package id.ac.binus.cestwo_skin.model;

public class Orders {
    private String skinName, skinPrice, skinPoster, skinSoB;
    private int image, orderId;

    public Orders(String skinName, String skinPrice, String skinPoster, String skinSoB, int image, int orderId) {
        this.skinName = skinName;
        this.skinPrice = skinPrice;
        this.skinPoster = skinPoster;
        this.skinSoB = skinSoB;
        this.image = image;
        this.orderId = orderId;
    }

    public String getSkinName() {
        return skinName;
    }

    public String getSkinPrice() {
        return skinPrice;
    }

    public String getSkinPoster() {
        return skinPoster;
    }

    public String getSkinSoB() {
        return skinSoB;
    }

    public int getImage() {
        return image;
    }

    public int getOrderId() {
        return orderId;
    }
}
