import javax.swing.*;

public class fields {
    JFrame jframe = new JFrame();
    JPanel jpanel = new JPanel();


    JLabel username = new JLabel("Username");
    JLabel email = new JLabel("email adress");
    JLabel phone = new JLabel("phone");
    JLabel country= new JLabel("Country");
    JLabel city= new JLabel("City");
    JLabel street= new JLabel("Street");
    JLabel gender= new JLabel("Gender");
    JLabel password= new JLabel("Password");
    JLabel yourinfo= new JLabel("Your Information:");
    JLabel printinfoonpanel = new JLabel();


    JTextField Username= new JTextField();
    JTextField Email= new JTextField();
    JTextField Phone= new JTextField();
    JTextField Country= new JTextField();
    JTextField City= new JTextField();
    JTextField Street= new JTextField();

    //Gender selection list
    String [] genderSelect = {"- Select -", "Male", "Female", "Other"};
    JComboBox Gender = new JComboBox<>(genderSelect);

    //PasswordField used to have hidden credentials in the Textfield
    JPasswordField Password= new JPasswordField();


    // Submit button
    JButton submit = new JButton("Submit");

}
