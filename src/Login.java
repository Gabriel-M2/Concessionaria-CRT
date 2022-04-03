import com.mysql.jdbc.log.Log;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Login extends JPanel {


    static JPanel jpPrincipal;
    static JPanel Login;

    static ImageIcon imgLogin, imgBtn;
    static JLabel lbLogin;

    static JLabel CRT;

    static JTextField tfLogin2, tfPass2;
    static ImageIcon imgBtn2;
    static JButton btnNaoTenhoLogin;

    static JButton btnSigIn;
    static ImageIcon imgBtnLogin;


    public static void TlLogin(){
        jpPrincipal = new JPanel(null);
        Login = new JPanel(null);
        Login.setBounds(0,0,1200,700);
        jpPrincipal.add(Login);

        try {
            imgLogin = new ImageIcon(Login.class.getResource("img/bugatti.png"));

            imgBtn2 = new ImageIcon(Login.class.getResource("img/imgBtn.png"));

            imgBtnLogin = new ImageIcon(Login.class.getResource("img/imgBotao.png"));
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        lbLogin = new JLabel(imgLogin);
        lbLogin.setBounds(0,0,763,700);
        Login.add(lbLogin);

        Login.setBackground(new Color(1,38,65));

        CRT = new JLabel("CRT");
        CRT.setBounds(958,79,90,30);
        CRT.setFont(new Font("Poppins",Font.BOLD,36));
        CRT.setForeground(Color.WHITE);
        Login.add(CRT);

        tfPass2 = new JPasswordField("Senha");
        tfPass2.setBounds(848,289,294,30);
        tfPass2.setBackground(new Color(1,38,65));
        tfPass2.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.WHITE));
        tfPass2.setForeground(Color.WHITE);
        tfPass2.setFont(new Font("Poppins",Font.PLAIN,16));
        Login.add(tfPass2);


        tfLogin2 = new JTextField("Nome/E-Mail");
        tfLogin2.setBounds(848,226,294,30);
        tfLogin2.setBackground(new Color(1,38,65));
        tfLogin2.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.WHITE));
        tfLogin2.setFont(new Font("Poppins",Font.PLAIN,16));
        tfLogin2.setForeground(Color.WHITE);
        tfLogin2.setToolTipText("Nome/E-Mail");
        Login.add(tfLogin2);



        btnNaoTenhoLogin = new JButton(imgBtn2);
        btnNaoTenhoLogin.setBounds(872,577,262,19);
        btnNaoTenhoLogin.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        btnNaoTenhoLogin.setContentAreaFilled(false);
        Login.add(btnNaoTenhoLogin);

        btnSigIn = new JButton(imgBtnLogin);
        btnSigIn.setBounds(911,472,165,52);
        btnSigIn.setContentAreaFilled(false);
        btnSigIn.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        Login.add(btnSigIn);
    }

    public static void Eventos(){
        btnSigIn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnNaoTenhoLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnNaoTenhoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.jpCadastro.setVisible(true);
                Login.setVisible(false);
            }
        });

        btnSigIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

//                Usuarios usuario = new Usuarios();
//                if (tfLogin2.getText().equalsIgnoreCase(usuario.getUser()) && tfPass2.getText().equalsIgnoreCase(usuario.getSenha())){
//                    Login.setVisible(false);
//                    jpPrincipal.add(Catalogo.Carro1);
//                }else{
//                    JOptionPane.showMessageDialog(null,"Usuário ou senha inválidos");
//                }
            }
        });
    }




    public static void main(String[] args) {
        System.out.println("");
        JFrame frame = new JFrame("Login");
        frame.getContentPane().add(new Login());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 1200, 2100);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);



    }
}
