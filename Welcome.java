//Pop up message dialogue
import javax.swing.*;  
public class Welcome {  
JFrame f;  
Welcome(){  
    f=new JFrame();  
    JOptionPane.showMessageDialog(f,"Hello, Welcome to Javatpoint.");  
}  
public static void main(String[] args) {  
    new Welcome();  
}  
}  