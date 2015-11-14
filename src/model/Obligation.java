package model;

import java.sql.Date;

public class Obligation {

    private Date dt_begin;
    private Date dt_end;

    public Date getDt_beign() {
        return dt_begin;
    }

    public void setDt_beign(Date dt_begin) {
        this.dt_begin = dt_begin;
    }

    public Date getDt_end() {
        return dt_end;
    }

    public void setDt_end(Date dt_end) {
        this.dt_end = dt_end;
    }
}
