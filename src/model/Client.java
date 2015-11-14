package model;


public abstract class Client {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public Integer getPers_jurd() {
        return pers_jurd;
    }

    public void setPers_jurd(Integer pers_jurd) {
        this.pers_jurd = pers_jurd;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    private String name;
    private String inn;
    private String bin;
    private Integer pers_jurd; //1:0
    private String addres;

}
