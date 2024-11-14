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
public class Rok {
    private int id;
    private String naziv;
    private LocalDateTime datump;
    private LocalDateTime datumz;

    public Rok() {
    }

    public Rok(int id, String naziv, LocalDateTime datump, LocalDateTime datumz) {
        this.id = id;
        this.naziv = naziv;
        this.datump = datump;
        this.datumz = datumz;
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

    public LocalDateTime getDatump() {
        return datump;
    }

    public void setDatump(LocalDateTime datump) {
        this.datump = datump;
    }

    public LocalDateTime getDatumz() {
        return datumz;
    }

    public void setDatumz(LocalDateTime datumz) {
        this.datumz = datumz;
    }

    @Override
    public String toString() {
        return "Rok{" + "naziv=" + naziv + ", datump=" + datump + ", datumz=" + datumz + '}';
    }
    
    
}
