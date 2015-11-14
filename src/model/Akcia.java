package model;

public class Akcia extends Paper {
    public Integer getPrivilig_notPrivilig() {
        return privilig_notPrivilig;
    }

    public void setPrivilig_notPrivilig(Integer privilig_notPrivilig) {
        this.privilig_notPrivilig = privilig_notPrivilig;
    }

    private Integer privilig_notPrivilig; //1:0
}
