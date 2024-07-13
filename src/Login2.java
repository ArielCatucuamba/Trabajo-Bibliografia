import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login2 extends  JFrame{
    private JButton segundaVerificacionButton;
    private JTextField user;
    private JTextField pass;
    private JPanel panel1;

    public Login2(){
        setVisible(true);
        setTitle("Verificacion: Datos quemados de una bdd");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(panel1);


        segundaVerificacionButton.setBackground(Color.WHITE);
        segundaVerificacionButton.setForeground(Color.red);

        segundaVerificacionButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    VerificarDb();
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });


    }

    public void Iniciar(){
        setVisible(true);
        setTitle("Verificacion: Datos quemados de una bdd");
        panel1.setBackground(Color.LIGHT_GRAY);
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public void VerificarDb() throws SQLException {
        // 1 llamo a la funcion conexion
        Connection conecta=conexion();

        //2Traigo la inf de los JTextfielfd
        String usaurio=user.getText();
        String contra=pass.getText();

        //Hago mi consulta
        String sql="select * from bio where usuario=? and conta=?";
        PreparedStatement pstmt =conecta.prepareStatement(sql);

        pstmt.setString(1,usaurio);
        pstmt.setString(2,contra);

        ResultSet rs=pstmt.executeQuery();

        if (rs.next()){
            JOptionPane.showMessageDialog(null,"Datos correctos");
            Biografia b1=new Biografia();
            b1.Iniciar();
            dispose();
        }
        else{
            JOptionPane.showMessageDialog(null,"Datos incorrectos");
            user.setText("");
            pass.setText("");
        }

        // cierro todo
        rs.close();
        pstmt.close();
        conecta.close();

    }

    public Connection conexion() throws SQLException {
        String url="jdbc:mysql://localhost:3306/Biografia";
        String user="root";
        String password="123456";

        return DriverManager.getConnection(url,user,password);
    }

}

