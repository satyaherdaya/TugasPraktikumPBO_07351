package gui07351;

import javax.swing.*;

public class ComponentGui07351 extends JFrame{
    public JButton viewbtn07351 = new JButton();
    public JButton deletebtn07351 = new JButton();
    public JButton updatebtn07351 = new JButton();
    public JButton tambahbtn07351 = new JButton();
    public JButton ubahbtn07351 = new JButton();
    public JButton regisbtn07351 = new JButton();
    public JButton exitbtn07351 = new JButton();
    public JButton backbtn07351 = new JButton();
    public JLabel labeljudul07351 = new JLabel();
    public JLabel labelid07351 = new JLabel("ID");
    public JLabel labelnama07351 = new JLabel("NAMA");
    public JLabel labelalamat07351 = new JLabel("ALAMAT");
    public JLabel labelnoTelp07351 = new JLabel("NO TELP");
    public JTextField tfid07351 = new JTextField();
    public JTextField tfnama07351 = new JTextField();
    public JTextField tfalamat07351 = new JTextField();
    public JTextField tfnoTelp07351 = new JTextField();
    
    
    public void kosong07351(){
        tfid07351.setText(null);
        tfnama07351.setText(null);
        tfalamat07351.setText(null);
        tfnoTelp07351.setText(null);
    }
}
