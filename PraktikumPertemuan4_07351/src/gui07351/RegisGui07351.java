package gui07351;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class RegisGui07351 extends ComponentGui07351{
    public RegisGui07351(){
        initComponent07351();
    }
    
    void initComponent07351(){
        setTitle("Regster Data Kursus");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        labeljudul07351.setBounds(140, 50, 150, 25);
        labeljudul07351.setText("TAMBAH DATA");
        labeljudul07351.setFont(new Font("Calibri",1,18));
        add(labeljudul07351);
        labelnama07351.setBounds(35, 100, 40, 25);
        add(labelnama07351);
        tfnama07351.setBounds(130, 100, 150, 25);
        add(tfnama07351);
        
        labelalamat07351.setBounds(35, 140, 80, 25);
        add(labelalamat07351);
        tfalamat07351.setBounds(130, 140, 150, 25);
        add(tfalamat07351);
        
        labelnoTelp07351.setBounds(35,180,80,25);
        add(labelnoTelp07351);
        tfnoTelp07351.setBounds(130,180,150,25);
        add(tfnoTelp07351);
        
        tambahbtn07351.setBounds(130, 230, 150, 25);
        tambahbtn07351.setBackground(Color.black);
        tambahbtn07351.setForeground(Color.white);
        tambahbtn07351.setCursor(new Cursor(12));
        tambahbtn07351.setText("Daftar");
        add(tambahbtn07351);
        
        backbtn07351.setBounds(300, 50, 80, 25);
        backbtn07351.setBackground(Color.white);
        backbtn07351.setCursor(new Cursor(12));
        backbtn07351.setBorder(null);
        backbtn07351.setFocusPainted(false);
        backbtn07351.setText("<<BACK");
        add(backbtn07351);
        
        tambahbtn07351.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                tambahbtn07351.setForeground(Color.white);
                tambahbtn07351.setBackground(Color.blue);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                tambahbtn07351.setForeground(Color.white);
                tambahbtn07351.setBackground(Color.black);
            }
        });
        
        tambahbtn07351.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama07351 = tfnama07351.getText();
                String alamat07351 = tfalamat07351.getText();
                String noTelp07351 = tfnoTelp07351.getText();
                
                if(nama07351.length()!=0 && alamat07351.length()!=0 && noTelp07351.length()!=0){
                    AllObjController07351.pendaftarController.insert07351(nama07351, alamat07351, noTelp07351);
                    JOptionPane.showMessageDialog(null, "Data Berhasil Dibuat");
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
                    kosong07351();
                }
            }
                
        });
        
        backbtn07351.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MenuGui07351 menugui07351 = new MenuGui07351();
                menugui07351.setVisible(true);
            }
                
        });
    }
}
