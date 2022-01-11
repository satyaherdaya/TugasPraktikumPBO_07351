package gui07351;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class MenuGui07351 extends ComponentGui07351{
    public MenuGui07351(){
        initComponent07351();
    }
    
    void initComponent07351(){
        setTitle("Menu Pendaftaran Kurusus");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,480);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        setVisible(true);
        
        labeljudul07351.setText("MENU PENDATARAN KURSUS");
        labeljudul07351.setBounds(180, 50, 400, 25);
        labeljudul07351.setFont(new Font("Segoe Print",1,20));
        add(labeljudul07351);
        
        exitbtn07351.setText("<<EXIT");
        exitbtn07351.setBounds(580, 50, 80, 25);
        exitbtn07351.setBackground(Color.black);
        exitbtn07351.setForeground(Color.white);
        exitbtn07351.setFocusPainted(false);
        exitbtn07351.setCursor(new Cursor(12));
        add(exitbtn07351);
        
        regisbtn07351.setText("Register Data");
        regisbtn07351.setBounds(160, 150, 150, 100);
        regisbtn07351.setBackground(Color.black);
        regisbtn07351.setForeground(Color.white);
        regisbtn07351.setCursor(new Cursor(12));
        regisbtn07351.setFocusPainted(false);
        regisbtn07351.setFont(new Font("Segoe Print",1,14));
        add(regisbtn07351);
        
        viewbtn07351.setText("View Data");
        viewbtn07351.setBounds(360, 150, 150, 100);
        viewbtn07351.setBackground(Color.black);
        viewbtn07351.setCursor(new Cursor(12));        
        viewbtn07351.setForeground(Color.white);
        viewbtn07351.setFocusPainted(false);
        viewbtn07351.setFont(new Font("Segoe Print",1,14));
        add(viewbtn07351);
        
        exitbtn07351.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        exitbtn07351.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                exitbtn07351.setBackground(Color.white);
                exitbtn07351.setForeground(Color.blue);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                exitbtn07351.setBackground(Color.black);
                exitbtn07351.setForeground(Color.white);
            }
            
        });
        
        regisbtn07351.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                RegisGui07351 regisgui07351 = new RegisGui07351();
                regisgui07351.setVisible(true);
            }
        });
        
        regisbtn07351.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                regisbtn07351.setBackground(Color.white);
                regisbtn07351.setForeground(Color.blue);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                regisbtn07351.setBackground(Color.black);
                regisbtn07351.setForeground(Color.white);
            }
            
        });
        
        viewbtn07351.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                DataGui07351 datagui07351 = new DataGui07351();
                datagui07351.setVisible(true);
            }
        });
        
        viewbtn07351.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e) {
                viewbtn07351.setBackground(Color.white);
                viewbtn07351.setForeground(Color.blue);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewbtn07351.setBackground(Color.black);
                viewbtn07351.setForeground(Color.white);
            }
            
        });
    }
}
