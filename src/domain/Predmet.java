/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Lenovo
 */
public class Predmet {
    private int id;
    private String naziv;
    private int espb;
    private LocalDateTime datum;

    public Predmet() {
    }

    public Predmet(int id, String naziv, int espb)
    {
        this.id=id;
        this.naziv=naziv;
        this.espb=espb;
    }
    
    public Predmet(int id, String naziv, int espb, LocalDateTime datum) {
        this.id = id;
        this.naziv = naziv;
        this.espb = espb;
        this.datum=datum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getEspb() {
        return espb;
    }

    public void setEspb(int espb) {
        this.espb = espb;
    }

    public LocalDateTime getDatum() {
        return datum;
    }

    public void setDatum(LocalDateTime datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return naziv+" "+espb+" "+datum.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
    
    
}
