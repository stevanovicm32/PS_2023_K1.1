/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.Controller;
import domain.Predmet;
import domain.Rok;
import java.security.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class FormaRokovi extends javax.swing.JDialog {
Rok r;
    /**
     * Creates new form FormaRokovi
     */
    public FormaRokovi(java.awt.Frame parent, boolean modal, Rok rok) {
        super(parent, modal);
        initComponents();
        ModelTabelePredmet mtp=new ModelTabelePredmet(Controller.getInstance().vratiSelektovanuListuPredmeta(rok));
        jTable1.setModel(mtp);
        r=rok;
        jTextFieldNaziv.setText(rok.getNaziv());
        jTextFieldDatumP.setText(rok.getDatump().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")).toString());
        jTextFieldDatumZ.setText(rok.getDatumz().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")).toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldNaziv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDatumP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDatumZ = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldNazivP = new javax.swing.JTextField();
        jTextFieldESPB = new javax.swing.JTextField();
        jTextFieldDatum = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Naziv");

        jTextFieldNaziv.setEditable(false);

        jLabel2.setText("DatumPocetka");

        jTextFieldDatumP.setEditable(false);

        jLabel3.setText("DatumZavrsetka");

        jTextFieldDatumZ.setEditable(false);
        jTextFieldDatumZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDatumZActionPerformed(evt);
            }
        });

        jLabel4.setText("Predmeti");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextFieldESPB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldESPBActionPerformed(evt);
            }
        });

        jLabel5.setText("Naziv");

        jLabel6.setText("ESPB");

        jLabel7.setText("Datum");

        jButton1.setText("Dodaj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Obrisi");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldDatumP))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(68, 68, 68)
                                    .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDatumZ, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNazivP)
                            .addComponent(jTextFieldESPB)
                            .addComponent(jTextFieldDatum, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNazivP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(5, 5, 5)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextFieldDatumP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)))
                                .addGap(1, 1, 1))
                            .addComponent(jTextFieldESPB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldDatumZ, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton3)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDatumZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDatumZActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDatumZActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int espb=Integer.parseInt(jTextFieldESPB.getText());
        String naziv=jTextFieldNazivP.getText();
        LocalDate dateTime = LocalDate.parse(jTextFieldDatum.getText(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDateTime datum = dateTime.atStartOfDay();
        int odgovor=JOptionPane.showConfirmDialog(this, "DA LI STE SIGURNI?", "PITANJE", JOptionPane.YES_NO_OPTION);
        if(odgovor==0)
        {
            Controller.getInstance().dodajNoviPredmet(r, naziv, datum, espb);
            JOptionPane.showMessageDialog(this, "PREDMET DODAT", "OBAVESTENJE", JOptionPane.INFORMATION_MESSAGE);
            ModelTabelePredmet mtp=new ModelTabelePredmet(Controller.getInstance().vratiSelektovanuListuPredmeta(r));
            jTable1.setModel(mtp);
            
        }
        else
        {
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldESPBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldESPBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldESPBActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int selektovaniRed=jTable1.getSelectedRow();
        Predmet p=new Predmet();
        if(selektovaniRed==-1)
        {
            JOptionPane.showMessageDialog(this, "MORATE SELEKTOVATI RED", "OBAVESTENJE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else
        {
            p=Controller.getInstance().vratiSelektovanuListuPredmeta(r).get(selektovaniRed);
            int odgovor=JOptionPane.showConfirmDialog(this, "DA LI STE SIGURNI?", "PITANJE", JOptionPane.YES_NO_OPTION);
            if(odgovor==0)
            {
                Controller.getInstance().obrisiPredmet(p);
                JOptionPane.showMessageDialog(this, "PREDMET OBRISAN", "OBAVESTENJE", JOptionPane.INFORMATION_MESSAGE);
                ModelTabelePredmet mtp=new ModelTabelePredmet(Controller.getInstance().vratiSelektovanuListuPredmeta(r));
                jTable1.setModel(mtp);
            }
            else
            {
                this.dispose();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldDatum;
    private javax.swing.JTextField jTextFieldDatumP;
    private javax.swing.JTextField jTextFieldDatumZ;
    private javax.swing.JTextField jTextFieldESPB;
    private javax.swing.JTextField jTextFieldNaziv;
    private javax.swing.JTextField jTextFieldNazivP;
    // End of variables declaration//GEN-END:variables
}