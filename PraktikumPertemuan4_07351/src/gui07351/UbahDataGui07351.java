package gui07351;

import entity07351.PendaftarEntity07351;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class UbahDataGui07351 extends ComponentGui07351{
    int id07351;
    String nama07351,alamat07351,noTelp07351;
    JButton ubahnamabtn07351 = new JButton("UBAH");
    JButton ubahalamatbtn07351 = new JButton("UBAH");
    JButton ubahnoTelpbtn07351 = new JButton("UBAH");
    
    public UbahDataGui07351(int kode07351){
        initComponent07351(kode07351);
    }
    void initComponent07351(int kode07351){
        for(PendaftarEntity07351 pendaftar07351 : AllObjController07351.pendaftarController.getDataById(kode07351)){
            this.id07351=pendaftar07351.getId07351();
            this.nama07351=pendaftar07351.getNama07351();
            this.alamat07351=pendaftar07351.getAlamat07351();
            this.noTelp07351=pendaftar07351.getNoTelp07351();
        }
        
        setTitle("Ubah Data Kursus");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        labeljudul07351.setText("UBAH DATA SISWA KURSUS");
        labeljudul07351.setBounds(100, 10, 400, 25);
        labeljudul07351.setFont(new Font("Segoe Print",1,14));
        add(labeljudul07351);
        
        backbtn07351.setBounds(300, 220, 80, 25);
        backbtn07351.setBackground(Color.black);
        backbtn07351.setForeground(Color.white);
        backbtn07351.setCursor(new Cursor(12));
        backbtn07351.setFocusPainted(false);
        backbtn07351.setCursor(new Cursor(12));
        backbtn07351.setText("<<BACK");
        add(backbtn07351);
        
        labelid07351.setBounds(25,60,80,25);
        add(labelid07351);
        tfid07351.setBounds(120,60,150,25);
        tfid07351.setText(Integer.toString(id07351));
        tfid07351.setEditable(false);
        add(tfid07351);
        
        labelnama07351.setBounds(25,100,80,25);
        add(labelnama07351);
        tfnama07351.setBounds(120,100,150,25);
        tfnama07351.setText(nama07351);
        tfnama07351.setEditable(false);
        add(tfnama07351);
        
        labelalamat07351.setBounds(25,140,80,25);
        add(labelalamat07351);
        tfalamat07351.setBounds(120,140,150,25);
        tfalamat07351.setText(alamat07351);
        tfalamat07351.setEditable(false);
        add(tfalamat07351);
        
        labelnoTelp07351.setBounds(25,180,80,25);
        add(labelnoTelp07351);
        tfnoTelp07351.setBounds(120,180,150,25);
        tfnoTelp07351.setText(noTelp07351);
        tfnoTelp07351.setEditable(false);
        add(tfnoTelp07351);
        
        ubahnamabtn07351.setBounds(300, 100, 80, 25);
        ubahnamabtn07351.setCursor(new Cursor(12));
        ubahnamabtn07351.setFocusPainted(false);
        ubahalamatbtn07351.setBounds(300, 140, 80, 25);
        ubahalamatbtn07351.setCursor(new Cursor(12));
        ubahalamatbtn07351.setFocusPainted(false);
        ubahnoTelpbtn07351.setBounds(300, 180, 80, 25);
        ubahnoTelpbtn07351.setCursor(new Cursor(12));
        ubahnoTelpbtn07351.setFocusPainted(false);
        add(ubahnamabtn07351);
        add(ubahalamatbtn07351);
        add(ubahnoTelpbtn07351);
        
        backbtn07351.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                DataGui07351 datagui07351 = new DataGui07351();
                datagui07351.setVisible(true);
            }
                
        });
        
        ubahnamabtn07351.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String inputnama07351 = JOptionPane.showInputDialog("Masukkan Nama Baru");
                    if(inputnama07351.length()>0){
                        AllObjController07351.pendaftarController.update07351(1, kode07351, inputnama07351);
                        tfnama07351.setText(inputnama07351);
                    }else{
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                }catch(Exception exSatya){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
        
        ubahalamatbtn07351.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String inputalamat07351 = JOptionPane.showInputDialog("Masukkan alamat Baru");
                    if(inputalamat07351.length()>0){
                        AllObjController07351.pendaftarController.update07351(2, kode07351, inputalamat07351);
                        tfalamat07351.setText(inputalamat07351);
                    }else{
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                }catch(Exception exSatya){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
        
        ubahnoTelpbtn07351.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    String inputnoTelp07351 = JOptionPane.showInputDialog("Masukkan Nomor Telepon Baru");
                    if(inputnoTelp07351.length()>0){
                        AllObjController07351.pendaftarController.update07351(3, kode07351,inputnoTelp07351);
                        tfnoTelp07351.setText(inputnoTelp07351);
                    }else{
                        JOptionPane.showMessageDialog(null, "Data Kosong");
                    }
                }catch(Exception exSatya){
                    JOptionPane.showMessageDialog(null, "Cancelled");
                }
            }
        });
     
    }
}
