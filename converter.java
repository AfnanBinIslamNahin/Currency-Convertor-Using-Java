import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class converter extends JFrame {


        JLabel taka,dollar;
        JTextField taka_t, dollar_d;
        JButton b1, b2, b3;

    public  converter()
    {
        super("CONVERTER");

        taka = new JLabel("Takas:");
        taka.setBounds(20, 40, 60, 30);
        taka_t = new JTextField();
        taka_t.setBounds(80, 40, 80, 30);

        dollar = new JLabel("Dollars:");
        dollar.setBounds(180, 40, 60, 30);
        dollar_d = new JTextField();
        dollar_d.setBounds(240, 40, 80, 30);

        b1 = new JButton("Taka");
        b1.setBounds(50, 80, 100, 15);

        b2 = new JButton("Dollar");
        b2.setBounds(190, 80, 100, 15);

        b3 = new JButton("close");
        b3.setBounds(150, 150, 100, 30);


        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                float d = Float.valueOf(taka_t.getText());
                // Converting taka to dollars
                float d1 = (d /107.05f);

                String A1 = String.valueOf(d1);
                dollar_d.setText(A1);
            }
        });

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {

                double d2 = Double.valueOf(dollar_d.getText());
                // Converting dollar to taka
                double d3 = (d2 * 107.05);
                String str2 = String.valueOf(d3);
                taka_t.setText(str2);
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                dispose();
            }
        });
        add(taka);
        add(dollar);
        add(taka_t);
       add(dollar_d);
        add(b1);
       add(b2);
       add(b3);
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(null);
        setSize(400, 300);
        setVisible(true);
   }
    public static void main(String args[])
    {
        new converter();
    }
}
