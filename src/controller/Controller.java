/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import baza.DBBroker;
import domain.Predmet;
import domain.Rok;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Controller {
    private List<Rok> rok=new ArrayList<>(); 
    private DBBroker dbb;
    private static Controller instance;
    public static Controller getInstance()
    {
        if(instance==null)
        {
            instance=new Controller();
        }
        return instance;
    }
    
    private Controller()
    {
        dbb=new DBBroker();
    }

    public List<Rok> getRok() {
        return rok;
    }

    public void setRok(List<Rok> rok) {
        this.rok = rok;
    }

    public List<Rok> vratiListuRokova() {
        return dbb.vratiListuRokova();
    }

    public List<Predmet> vratiSelektovanuListuPredmeta(Rok rok) {
        return dbb.vratiSelektovanuListuPredmeta(rok);
    }

    public void dodajNoviPredmet(Rok r, String naziv, LocalDateTime datum, int espb) {
        dbb.dodajNoviPredmet(r, naziv, datum, espb);
    }

    public void obrisiPredmet(Predmet p) {
        dbb.obrisiPredmet(p);
    }
    
}
