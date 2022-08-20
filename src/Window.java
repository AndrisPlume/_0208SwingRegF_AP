import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends fields{

        public void registration(){

            jframe.setTitle("Registration form");
            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jframe.setVisible(true);
            jframe.setBounds(100, 100, 600, 700);

        jframe.add(jpanel);
        jpanel.setLayout(null);
        jpanel.setBackground(Color.LIGHT_GRAY);

        // adding Labels and setting poitions on panel

        jpanel.add(username);
        username.setBounds(100,100,100,20);
        jpanel.add(email);
        email.setBounds(100,135,100,20);
        jpanel.add(phone);
        phone.setBounds(100,170,100,20);
        jpanel.add(country);
        country.setBounds(100,205,100,20);
        jpanel.add(city);
        city.setBounds(100,240,100,20);
        jpanel.add(street);
        street.setBounds(100,285,100,20);
        jpanel.add(gender);
        gender.setBounds(100,320,100,20);
        jpanel.add(password);
        password.setBounds(100, 355,100,20);

        //adding Textfields and setting poitions on panel
        jpanel.add(Username);
        Username.setBounds(230,100,130,20);
        jpanel.add(Email);
        Email.setBounds(230,135,130,20);
        jpanel.add(Phone);
        Phone.setBounds(230,170,130,20);
        jpanel.add(Country);
        Country.setBounds(230,205,130,20);
        jpanel.add(City);
        City.setBounds(230,240,130,20);
        jpanel.add(Street);
        Street.setBounds(230,285,130,20);
        jpanel.add(Gender);
        Gender.setBounds(230,320,130,20);
        jpanel.add(Password);
        Password.setBounds(230,355,130,20);
        jpanel.add(submit);
        submit.setBounds(150,400,130,20);

// setting function for button, delivering entered values on display

        submit.addActionListener(new ActionListener() {
                @Override

                public void actionPerformed(ActionEvent e) {
                        jpanel.add(yourinfo);
                        jpanel.add(printinfoonpanel);
                        yourinfo.setBounds(30,430,500,20);
                        printinfoonpanel.setBounds(30,450,550,20);
                 //printing information on panel
                        printinfoonpanel.setText(Username.getText()+" ,"+Email.getText()+" ,"+Phone.getText()+" ,"+Country.getText()+" ,"+City.getText()+" ,"+Street.getText()+" ,"+Gender.getSelectedItem());

                }
        });

        }

    }

