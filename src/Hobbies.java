import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hobbies extends JFrame {

    private JButton volverALaBibliografiaButton;
    private JButton button2;
    private JLabel txt;
    private JPanel panel1;
    private JLabel txt1;
    private JLabel txt2;
    private JLabel txt3;
    private JLabel txt4;

    public Hobbies(){
        setContentPane(panel1);
        panel1.setLayout(null);

        txt.setText("Hobbies de Ariel Catucuamba");
        txt.setBounds(5,5,500,30);
        txt.setForeground(Color.blue);
        txt.setHorizontalAlignment(SwingConstants.CENTER);

        txt1.setText("Hobbie1: Jugar Futbol");
        txt1.setBounds(20,35,210,30);
        txt1.setHorizontalAlignment(SwingConstants.CENTER);

        ImageIcon imagen=new ImageIcon("C:\\Users\\OMEN\\IdeaProjects\\Aplicacion\\src\\futbol.jpg");
        JLabel dise2=new JLabel();
        dise2.setOpaque(true);
        dise2.setBounds(20,60,210,210);
        dise2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(dise2.getWidth(),dise2.getHeight(), Image.SCALE_SMOOTH)));
        dise2.setBackground(Color.WHITE);
        panel1.add(dise2);

        txt2.setText("Hobbie2: Salir a trotar");
        txt2.setBounds(249,35,210,30);
        txt2.setHorizontalAlignment(SwingConstants.CENTER);

        ImageIcon imagen1=new ImageIcon("C:\\Users\\OMEN\\IdeaProjects\\Aplicacion\\src\\trotar.jpg");
        JLabel dise3=new JLabel();
        dise3.setOpaque(true);
        dise3.setBounds(249,60,210,210);
        dise3.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(dise2.getWidth(),dise2.getHeight(), Image.SCALE_SMOOTH)));
        dise3.setBackground(Color.WHITE);
        panel1.add(dise3);


        volverALaBibliografiaButton.setBounds(150,350,200,30);

        volverALaBibliografiaButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Biografia b2=new Biografia();
                b2.Iniciar();
                dispose();
            }
        });
    }






    public void Iniciar(){
        setVisible(true);
        setTitle("Hobbies de Ariel");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
