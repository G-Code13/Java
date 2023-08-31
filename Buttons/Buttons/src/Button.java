import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class Button extends JFrame implements ActionListener{
    
   public Button(){
       JFrame frame = new JFrame();
       frame.setTitle("My Button");
       frame.setSize(500 ,400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       JButton button = new JButton("Click Here!");
       button.addActionListener(this);
       
       frame.setLayout(new FlowLayout());
       frame.add(button);
       frame.setVisible(true);

   }
   @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Thank you for the click!");
    }
}