package model;

public abstract class Paper {

    public String getNin() {
        return nin;
    }

    public void setNin(String nin) {
        this.nin = nin;
    }



    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    private String nin;

    private Double price;
    private Owner owner;

    public Double getNominal() {
        return nominal;
    }

    public void setNominal(Double nominal) {
        this.nominal = nominal;
    }

    private Double nominal;

}
