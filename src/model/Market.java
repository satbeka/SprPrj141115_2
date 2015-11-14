package model;

import java.sql.Date;

public class Market {
    private Buyer buyer;
    private Seller seller;
    private Date period_date;
    private Date period_date_begin;
    private Date period_date_end;
    private Double price;
    private Integer volume;
    private Akcia akcia;
    private Obligation obligation;

    public String getKase_registrator() {
        return kase_registrator;
    }

    public void setKase_registrator(String kase_registrator) {
        this.kase_registrator = kase_registrator;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Date getPeriod_date() {
        return period_date;
    }

    public void setPeriod_date(Date period_date) {
        this.period_date = period_date;
    }

    public Date getPeriod_date_begin() {
        return period_date_begin;
    }

    public void setPeriod_date_begin(Date period_date_begin) {
        this.period_date_begin = period_date_begin;
    }

    public Date getPeriod_date_end() {
        return period_date_end;
    }

    public void setPeriod_date_end(Date period_date_end) {
        this.period_date_end = period_date_end;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Akcia getAkcia() {
        return akcia;
    }

    public void setAkcia(Akcia akcia) {
        this.akcia = akcia;
    }

    public Obligation getObligation() {
        return obligation;
    }

    public void setObligation(Obligation obligation) {
        this.obligation = obligation;
    }

    private String kase_registrator;

}
