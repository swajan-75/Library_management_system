import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Library_managemnet_system_GUI extends JFrame implements ActionListener{
    JPanel Panal ;
    ImageIcon backgroundImage , company_logo;
    JLabel backgroundLable , textLable , company_lable ;
    JButton logiButton , registerButton  , search_button;
    JTextField search_bar ;
    Font title_font ;

    static ImageIcon image_resizer(String location, int height , int width ){
        ImageIcon imageIcon = new ImageIcon(location);
        Image image = new ImageIcon(location).getImage();
        Image newimg = image.getScaledInstance(width, height,  java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        return imageIcon ;
        
    }


    Library_managemnet_system_GUI(){
        Panal = new JPanel();
        Panal.setVisible(true);
        Panal.setBounds(100, 120, 1000, 550);
        Panal.setLayout(null);
        Panal.setBackground(new Color(1.0f,1.0f,1.0f,0.3f));
        
        search_bar = new JTextField("Find Book....");
        search_bar.setBounds(Panal.getX(),(Panal.getHeight()/4)+150,800,50);
        Panal.add(search_bar);

        search_button = new JButton("Search");
        search_button.setBounds((search_bar.getWidth()/2)+50,search_bar.getY()+100,100,50);
        search_button.addActionListener(this);


        search_bar.addMouseListener(new MouseAdapter() {
            int i =0;
            @Override
           
            public void mouseClicked(MouseEvent e) {
                if(i<1){
                    search_bar.setText("");
                    i++;
                }
                
            }
        });


        textLable = new JLabel("American International University-Bangladesh");
        textLable.setBounds(search_bar.getX()-20,search_bar.getY()-70,search_bar.getWidth()+50,50);
        
        title_font = textLable.getFont();
        float size = title_font.getSize()+25.0f ;
        Font newfont = title_font.deriveFont(size);
        textLable.setFont(newfont);

        company_logo = new ImageIcon();
        company_logo = image_resizer("Media/company_logo.png", 150, 150);
        company_lable = new JLabel();
        company_lable.setBounds((textLable.getWidth()/2)+20,textLable.getY()-150,150,150);
        company_lable.setIcon(company_logo);

        Panal.add(search_button);
        Panal.add(textLable);
        Panal.add(company_lable);

        logiButton = new JButton("Log In");
        logiButton.setBounds(950,10,100,40);
        logiButton.addActionListener(this);

        registerButton = new JButton("Register");
        registerButton.setBounds(1050,10,100,40);
        registerButton.addActionListener(this);

        backgroundImage = new ImageIcon("Media/Background.jpg");
        backgroundLable = new JLabel();
        backgroundLable.setBounds(0,0,1200,800);
        backgroundLable.setIcon(backgroundImage);
        backgroundLable.add(logiButton);
        backgroundLable.add(registerButton);

        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200,800);
        this.setLayout(null);
        this.add(Panal);
        this.add(backgroundLable);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==logiButton){
            System.out.println("Log in Button ");
        }else if(e.getSource()==registerButton){
            System.out.println("Register Button");
        }else if(e.getSource()==search_button){
            System.out.println("Search Button");
        }
    }
    
    public static void main(String[] args) {
        //System.out.println("test_1");
     Library_managemnet_system_GUI obj = new Library_managemnet_system_GUI() ;
        
        
    }   
}
