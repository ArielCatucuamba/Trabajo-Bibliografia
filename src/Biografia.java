import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Biografia extends JFrame{
    private JButton VerHobbis;
    private JPanel panel1;
    private JLabel txt;
    private JLabel titulo;
    private JLabel txt1;
    private JLabel txt2;
    private JLabel txt3;
    private JLabel txt4;
    private JLabel txt5;
    private JLabel txt6;
    private JLabel txt7;
    private JLabel txt8;
    private JLabel txt9;
    private JLabel txt10;
    private JLabel txt11;
    private JLabel txt12;

    public Biografia(){
        setContentPane(panel1);

        //Debo quitarle las coordenadas por default al panel para poder poner la imagen
        panel1.setLayout(null);

        titulo.setBounds(5,5,500,30);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setForeground(Color.red);

        ImageIcon imagen=new ImageIcon("C:\\Users\\OMEN\\IdeaProjects\\untitled1\\src\\bibliografia.jpeg");
        JLabel dise2=new JLabel();
        dise2.setOpaque(true);
        dise2.setBounds(5,50,200,210);
        dise2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(dise2.getWidth(),dise2.getHeight(), Image.SCALE_SMOOTH)));
        dise2.setBackground(Color.WHITE);
        panel1.add(dise2);

        txt.setBounds(210,120,270,30);
        txt.setText("Ariel Catucuamba nacio el 28 de diciembre del");
        txt.setHorizontalAlignment(SwingConstants.LEFT);

        txt1.setBounds(210,140,270,30);
        txt1.setText("2004 en Ecuador especificamente en Sangolqui ");
        txt1.setHorizontalAlignment(SwingConstants.LEFT);

        txt2.setBounds(210,160,280,30);
        txt2.setText("Hijo de Jimena Diaz y Fausto Catucuamba desde");
        txt2.setHorizontalAlignment(SwingConstants.LEFT);

        txt6.setBounds(210,180,270,30);
        txt6.setText("pequeño mostro una gran pasion por el futbol y ");
        txt6.setHorizontalAlignment(SwingConstants.LEFT);

        txt7.setBounds(210,200,270,30);
        txt7.setText("Comenzo sus estudios en la Unidad gotitas de  ");
        txt7.setHorizontalAlignment(SwingConstants.LEFT);


        //DESDE AQUI
        txt8.setBounds(210,220,500,30);
        txt8.setText("amor y los culmino en la Unidad Educativa Juan");
        txt8.setHorizontalAlignment(SwingConstants.LEFT);

        txt9.setBounds(210,240,500,30);
        txt9.setText("de Salinas, ademas de que logro conseguir algunos");
        txt9.setHorizontalAlignment(SwingConstants.LEFT);

        txt10.setBounds(5,260,500,30);
        txt10.setText("reconocimiento por su desempeño futbolistico y academico.Es un gran amente de los" );
        txt10.setHorizontalAlignment(SwingConstants.LEFT);

        txt11.setBounds(5,280,500,30);
        txt11.setText("animales en especial de los perros y gatos ya que desde pequeño se crio con sus 2");
        txt11.setHorizontalAlignment(SwingConstants.LEFT);

        txt12.setBounds(5,300,500,30);
        txt12.setText("abuelos los cuales se dedicaban a la agricultura y ganaderia desde pequeños");
        txt12.setHorizontalAlignment(SwingConstants.LEFT);



        txt3.setBounds(210,50,270,30);
        txt3.setText("NOMBRE: Ariel David Catucuamba Diaz");
        txt3.setHorizontalAlignment(SwingConstants.LEFT);

        txt4.setBounds(210,70,270,30);
        txt4.setText("FECHA DE NACIMIENTO: 28/12/2004");
        txt4.setHorizontalAlignment(SwingConstants.LEFT);

        txt5.setBounds(210,90,270,30);
        txt5.setText("LUGAR DE NACIMIENTO: Ecuador - Sangolqui");
        txt5.setHorizontalAlignment(SwingConstants.LEFT);


        VerHobbis.setBounds(150,350,200,30);

        VerHobbis.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Hobbies h1 = new Hobbies();
                h1.Iniciar();
                dispose();
            }
        });
    }
    public void Iniciar(){
        setVisible(true);
        setTitle("Bibliografia");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
