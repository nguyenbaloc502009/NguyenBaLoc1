public class Goods {
    private String name;
    private String shopName;
    private String imageGoods;

    public Goods(String name, String shopName, String imageGoods) {
        this.name = name;
        this.shopName = shopName;
        this.imageGoods = imageGoods;
    }

    public String getName() {
        return name;
    }

    public String getShopName() {
        return shopName;
    }

    public String getImageGoods() {
        return imageGoods;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setImageGoods(String imageGoods) {
        this.imageGoods = imageGoods;
    }
}
