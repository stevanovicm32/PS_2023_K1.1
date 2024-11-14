/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baza;

import domain.Predmet;
import domain.Rok;
import java.util.List;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class DBBroker {

    public List<Rok> vratiListuRokova() {
        List<Rok> listaRokova=new ArrayList<>();
        try {
            String upit="SELECT * FROM ROK";
            Statement st=Komunikacija.getInstance().getConnection().createStatement();
            ResultSet rs=st.executeQuery(upit);
            while(rs.next())
            {
                int id=rs.getInt("id");
                String naziv=rs.getString("naziv");
                Timestamp ts=rs.getTimestamp("datump");
                LocalDateTime datump=ts.toLocalDateTime();
                Timestamp ts1=rs.getTimestamp("datumz");
                LocalDateTime datumz=ts1.toLocalDateTime();
                Rok r=new Rok(id, naziv, datump, datumz);
                listaRokova.add(r);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaRokova;
    }

    public List<Predmet> vratiSelektovanuListuPredmeta(Rok rok) {
        List<Predmet> listaPredmeta = new ArrayList<>();
        try {
            String upit="SELECT * FROM PREDMET P JOIN ROKPREDMET RP ON P.ID=RP.IDP JOIN ROK R ON R.ID=RP.IDR WHERE R.ID=? ORDER BY RP.DATUM ASC";
            PreparedStatement ps=Komunikacija.getInstance().getConnection().prepareStatement(upit);
            ps.setString(1, rok.getId()+"");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                int id=rs.getInt("P.id");
                String naziv=rs.getString("p.naziv");
                int espb=rs.getInt("p.espb");
                Timestamp ts=rs.getTimestamp("rp.datum");
                LocalDateTime datum=ts.toLocalDateTime();
                Predmet p=new Predmet(id, naziv, espb, datum);
                listaPredmeta.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaPredmeta;
    }

    public void dodajNoviPredmet(Rok r, String naziv, LocalDateTime datum, int espb) {
        try {
            String prvi="SELECT MAX(id) AS idm FROM PREDMET";
            Statement st=Komunikacija.getInstance().getConnection().createStatement();
            ResultSet rs=st.executeQuery(prvi);
            int max=1;
            while(rs.next())
            {
                max=rs.getInt("idm");
            }
            max++;
            
            String upit="INSERT INTO PREDMET(id ,naziv, espb) VALUES (?,?,?)";
            PreparedStatement ps=Komunikacija.getInstance().getConnection().prepareStatement(upit);
            ps.setInt(1, max);
            ps.setString(2, naziv);
            ps.setInt(3, espb);
            ps.executeUpdate();
            Komunikacija.getInstance().getConnection().commit();
            
            
            String drugi="INSERT INTO ROKPREDMET(idp, idr, datum) VALUES(?,?,?)";
            PreparedStatement ps1=Komunikacija.getInstance().getConnection().prepareStatement(drugi);
            ps1.setInt(1, max);
            ps1.setInt(2, r.getId());
            LocalDate ls=datum.toLocalDate();
            Date d=Date.valueOf(ls);
            ps1.setDate(3, d);
            ps1.executeUpdate();
            Komunikacija.getInstance().getConnection().commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void obrisiPredmet(Predmet p) {
        try {
            String upit1="DELETE FROM ROKPREDMET WHERE idp=?";
            PreparedStatement ps1=Komunikacija.getInstance().getConnection().prepareStatement(upit1);
            ps1.setInt(1, p.getId());
            ps1.executeUpdate();
            Komunikacija.getInstance().getConnection().commit();
        } catch (SQLException ex) {
            Logger.getLogger(DBBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
