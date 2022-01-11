package gui07351;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class DataGui07351 extends ComponentGui07351{
    JTable tabelpendaftar07351 = new JTable();
    JScrollPane sppendaftar07351 = new JScrollPane(tabelpendaftar07351);
    JTextField textpilih07351 = new JTextField();
    
    public DataGui07351(){
        initComponent07351();
    }
    
    void initComponent07351(){
        setTitle("View Data Kursus");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        sppendaftar07351.setBounds(20, 50, 500, 350);
        tabelpendaftar07351.setModel(AllObjController07351.pendaftarController.daftarPendaftar07531());
        add(sppendaftar07351);
        
        labeljudul07351.setText("DAFTAR DATA SISWA KURSUS");
        labeljudul07351.setBounds(180, 10, 400, 25);
        labeljudul07351.setFont(new Font("Segoe Print",1,20));
        add(labeljudul07351);
        
        deletebtn07351.setBounds(540, 50, 110, 25);
        deletebtn07351.setText("DELETE");
        deletebtn07351.setFocusPainted(false);
        deletebtn07351.setBackground(Color.black);
        deletebtn07351.setForeground(Color.white);
        deletebtn07351.setCursor(new Cursor(12));
        add(deletebtn07351);
        
        ubahbtn07351.setBounds(540, 90, 110, 25);
        ubahbtn07351.setText("UBAH DATA");
        ubahbtn07351.setFocusPainted(false);
        ubahbtn07351.setBackground(Color.black);
        ubahbtn07351.setForeground(Color.white);
        ubahbtn07351.setCursor(new Cursor(12));        
        add(ubahbtn07351);
        
        backbtn07351.setBounds(25, 10, 80, 25);
        backbtn07351.setText("<<BACK");
        backbtn07351.setBackground(Color.white);
        backbtn07351.setFocusPainted(false);
        backbtn07351.setBorder(null);
        backbtn07351.setCursor(new Cursor(12));                
        add(backbtn07351);
        
        tabelpendaftar07351.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                int i07351 = tabelpendaftar07351.getSelectedRow();
                textpilih07351.setText(AllObjController07351.pendaftarController.daftarPendaftar07531().getValueAt(i07351, 0).toString());
            }
        });
        
        deletebtn07351.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int kode07351 = Integer.parseInt(textpilih07351.getText());
                AllObjController07351.pendaftarController.delete07351(kode07351);
                tabelpendaftar07351.setModel(AllObjController07351.pendaftarController.daftarPendaftar07531());
                JOptionPane.showMessageDialog(null, "Berhasil Hapus Data");
            }
        });
        
        deletebtn07351.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                deletebtn07351.setForeground(Color.yellow);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                deletebtn07351.setForeground(Color.white);
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
        
        ubahbtn07351.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                int kode07351 = Integer.parseInt(textpilih07351.getText());
                UbahDataGui07351 ubahdatagui07351 = new UbahDataGui07351(kode07351);
                ubahdatagui07351.setVisible(true);
            }
        });
        
        ubahbtn07351.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                ubahbtn07351.setForeground(Color.yellow);
            }
            
            @Override
            public void mouseExited(MouseEvent e){
                ubahbtn07351.setForeground(Color.white);
            }
        });
    }
}
