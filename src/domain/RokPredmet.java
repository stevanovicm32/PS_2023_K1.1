/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.time.LocalDateTime;

/**
 *
 * @author Lenovo
 */
public class RokPredmet {
    private int idr;
    private int idp;
    private LocalDateTime datum;

    public RokPredmet() {
    }

    public RokPredmet(int idr, int idp, LocalDateTime datum) {
        this.idr = idr;
        this.idp = idp;
        this.datum = datum;
    }

    public int getIdr() {
        return idr;
    }

    public void setIdr(int idr) {
        this.idr = idr;
    }

    public int getIdp() {
        return idp;
    }

    public void setIdp(int idp) {
        this.idp = idp;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public void setDatum(LocalDateTime datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "RokPredmet{" + "idr=" + idr + ", idp=" + idp + ", datum=" + datum + '}';
    }
    
    
}
