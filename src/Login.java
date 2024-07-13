import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends  JFrame{
    private JButton verificarButton;
    private JTextField user;
    private JTextField pass;
    private JPanel panel1;

    public Login(){
        setTitle("Verificacion: Datos quemados");
        setSize(500,500);
        //hara que mi JFrame se ponga en medio de cualquier pantalla
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panel1);
        panel1.setBackground(Color.LIGHT_GRAY);

        //Cambio el color del fondo del boton
        verificarButton.setBackground(Color.WHITE);
        //Cambio el color de las letras del boton
        verificarButton.setForeground(Color.red);


        verificarButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String u="Ariel Catucuamba";
                String c="1234";

                String usaurio=user.getText();
                String contra=pass.getText();
                if (u.equals(usaurio) && c.equals(contra)){
                    JOptionPane.showMessageDialog(null,"Contraseña y Usuario correcto");
                    Login2 l2=new Login2();
                    l2.Iniciar();
                    dispose();

                }else{
                    JOptionPane.showMessageDialog(null,"Contraseña o usuario incorrecto");
                    user.setText("");
                    pass.setText("");
                }
            }
        });
    }

    public void Iniciar(){
        setVisible(true);
        setTitle("Verificacion: Datos quemados");
        setSize(500,500);
        //hara que mi JFrame se ponga en medio de cualquier pantalla
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }






}
