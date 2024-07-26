import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class ChatBot extends JFrame{
    private JTextArea ca = new JTextArea();
    private JTextField cf = new JTextField();
    private JButton b = new JButton();
    private JLabel l = new JLabel();

    ChatBot(){
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setVisible(true);
        f.setLayout(null);
        f.setSize(400,400);
        f.getContentPane().setBackground(Color.yellow);
        f.setTitle("Chatbot");

        f.add(ca);
        f.add(cf);

        ca.setSize(350,310);
        ca.setLocation(1,1);
        ca.setBackground(Color.BLACK);
        ca.setForeground(Color.white);
        cf.setSize(300,20);
        cf.setLocation(1,320);
        f.add(b);
        l.setText("SEND");
        b.add(l);
        b.setBackground(Color.green);
        b.setSize(100,20);
        b.setLocation(300,320);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==b) {
                    String text = cf.getText().toLowerCase();
                    ca.append("You--->" + text + "\n");
                    cf.setText("");

                    if (text.contains("hi")) {
                        reply("hi there");

                    } else if (text.contains("how are you")) {
                        reply("I'm good. Thank you for asking. What about you");

                    } else if (text.contains("what is your name")) {
                        reply("I'm the trending BIANCO");
                    }
                    else if (text.contains("gender")) {
                        reply("I'm female. Don't flirt me , you fell in love ");
                    }
                    else if (text.contains("love you")) {
                        reply("I'm feeling shy, love you to ");
                    }
                    else if (text.contains("bye")) {
                        reply("Too soon:(Anyways"+"\n STAY HOME, STAY SAFE ");
                    }
                    else{
                        reply("I can't understand");
                    }




                }

            }
        });

    }
    public void reply(String s){
        ca.append("Chatbot--->"+s+"\n");
    }
}


public class Main {
    public static void main(String[] arg){
new ChatBot();
    }
}
