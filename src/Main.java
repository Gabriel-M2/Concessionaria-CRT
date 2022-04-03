import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class Main extends JPanel {
    int numUsers = 0;
    String[] Users = new String[900];

    static JPanel jpPrincipal;
    static JPanel jpCadastro;

    ImageIcon imgCadastro, imgBtn, imgBtnSigIn, imgBtnLogin;
    JLabel lbCadastro;

    JLabel lbCRT;

    JTextField tfLogin, tfPass, tfCPass;

    JButton btnSigIn;

    JButton btnJaTenhoLogin;

//    static JTable table;

    static JPanel pnTable;
    static JScrollPane scrollTable;

    static DefaultTableModel tableModel = new DefaultTableModel(
            new String[] {"Produto", "Qtde", "Preço Un.", "Total" },0) { //cria o layout da tabela , os itens do vetor são os nomes da coluna, o 0 indica que a tabela saíra sem nenhuma linha
        public boolean isCellEditable(int row, int col) { //método para dizer se a celula será editavel ou não
            if (col == 3) {
                return false;
            }
            return true;
        }

    };
    static JTable table = new JTable(tableModel);
    static DefaultTableModel dtm = (DefaultTableModel) table.getModel();

    public Main() {
        inicializar();
        Eventos();
        Login.TlLogin();
        Login.Eventos();
        Catalogo.TlCatalogo();
        Catalogo.Eventos();
        CheckOut.TlCheckOut();


    }

    public void inicializar() {
        setLayout(null);

        jpPrincipal = new JPanel(null);
        jpPrincipal.setBounds(0,0,1200,700);
        add(jpPrincipal);

        jpCadastro = new JPanel(null);
        jpCadastro.setBounds(0,0,1200,700);
        jpPrincipal.add(jpCadastro);

        try {
            imgCadastro = new ImageIcon(getClass().getResource("img/BMW.png"));
            imgBtn = new ImageIcon(getClass().getResource("img/JaTenhoCadastro.png"));

            imgBtnLogin = new ImageIcon(getClass().getResource("img/imgBotao.png"));
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        lbCadastro = new JLabel(imgCadastro);
        lbCadastro.setBounds(0,0,763,700);
        jpCadastro.add(lbCadastro);

        jpCadastro.setBackground(new Color(1,38,65));

        lbCRT = new JLabel("CRT");
        lbCRT.setBounds(958,79,90,30);
        lbCRT.setFont(new Font("Poppins",Font.BOLD,36));
        lbCRT.setForeground(Color.WHITE);
        jpCadastro.add(lbCRT);


        tfLogin = new JTextField("Nome/E-Mail");
        tfLogin.setBounds(848,226,294,30);
        tfLogin.setBackground(new Color(1,38,65));
        tfLogin.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.WHITE));
        tfLogin.setFont(new Font("Poppins",Font.PLAIN,16));
        tfLogin.setForeground(Color.WHITE);
        tfLogin.setToolTipText("Nome/E-Mail");
        jpCadastro.add(tfLogin);

        tfPass = new JPasswordField("Senha");
        tfPass.setBounds(848,289,294,30);
        tfPass.setBackground(new Color(1,38,65));
        tfPass.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.WHITE));
        tfPass.setForeground(Color.WHITE);
        tfPass.setFont(new Font("Poppins",Font.PLAIN,16));
        jpCadastro.add(tfPass);

        tfCPass = new JPasswordField("Sweenha");
        tfCPass.setBounds(848,344,294,30);
        tfCPass.setBackground(new Color(1,38,65));
        tfCPass.setBorder(BorderFactory.createMatteBorder(0,0,1,0,Color.WHITE));
        tfCPass.setForeground(Color.WHITE);
        tfCPass.setFont(new Font("Poppins",Font.PLAIN,16));
        jpCadastro.add(tfCPass);



        btnSigIn = new JButton(imgBtnLogin);
        btnSigIn.setBounds(911,472,165,52);
        btnSigIn.setContentAreaFilled(false);
        btnSigIn.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        jpCadastro.add(btnSigIn);



        btnJaTenhoLogin = new JButton(imgBtn);
        btnJaTenhoLogin.setBounds(872,577,262,19);
        btnJaTenhoLogin.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        btnJaTenhoLogin.setContentAreaFilled(false);
        jpCadastro.add(btnJaTenhoLogin);


        pnTable = new JPanel(new BorderLayout());
        pnTable.setBorder(new TitledBorder("Itens do Pedido"));//linhas 64 e 65 definem a borda do painel , com o nome dele (nesse caso itens do pedido)
        scrollTable = new JScrollPane();


        DefaultTableCellRenderer alinhaDireita = new DefaultTableCellRenderer();


        table.getColumnModel().getColumn(0).setPreferredWidth(250); //define o tamanho da coluna
        table.getColumnModel().getColumn(0).setResizable(false);//define se a coluna é editavel ou não ;
        table.getColumnModel().getColumn(1).setPreferredWidth(50);
        table.getColumnModel().getColumn(1).setResizable(false);
        table.getColumnModel().getColumn(1).setCellRenderer(alinhaDireita);//alinha o conteúdo da ceula a direita;
        table.getColumnModel().getColumn(2).setPreferredWidth(250);
        table.getColumnModel().getColumn(2).setResizable(false);
        table.getColumnModel().getColumn(2).setCellRenderer(alinhaDireita);
        table.getColumnModel().getColumn(3).setPreferredWidth(250);
        table.getColumnModel().getColumn(3).setResizable(false);
        table.getColumnModel().getColumn(3).setCellRenderer(alinhaDireita);
        table.getTableHeader().setReorderingAllowed(false);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);// linhas 97 e 98 define que as colunas não podem ser reorganizadas com arraste e solte

        scrollTable.setViewportView(Main.table);
        pnTable.add(scrollTable);
        pnTable.setBounds(156 ,147, 911, 403);

        pnTable.setBackground(Color.WHITE);




    }

    public void Eventos() {

        btnSigIn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnJaTenhoLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnSigIn.addActionListener(e -> {

            if (tfLogin.getText().equalsIgnoreCase("Nome/E-Mail") || tfPass.getText().equalsIgnoreCase("Senha")) {
                JOptionPane.showMessageDialog(null, "    Tente escrever algo ;)");
            } else {
                if (tfPass.getText().length() <8){
                    JOptionPane.showMessageDialog(null,"A senha deve ter ao menos 8 caracteres!");
                }else {
                    if (tfPass.getText().equalsIgnoreCase(tfCPass.getText())) {
                        jpCadastro.setVisible(false);
                        Login.Login.setVisible(true);
                        jpPrincipal.add(Login.Login);

                        NewUser(tfLogin.getText(), tfCPass.getText());

                    } else {
                        JOptionPane.showMessageDialog(null, "As senhas devem ser iguais!");
                    }
                }
            }


            Catalogo.btnSetaBaixoC1.addActionListener(f -> {
                jpCadastro.setVisible(false);
                Login.Login.setVisible(false);
                Catalogo.Carro1.setVisible(false);
                Catalogo.Carro2.setVisible(true);
                jpPrincipal.add(Catalogo.Carro2);
            });

            Catalogo.btnSetaCimaC2.addActionListener(g -> {
                jpCadastro.setVisible(false);
                Login.Login.setVisible(false);
                Catalogo.Carro2.setVisible(false);
                Catalogo.Carro1.setVisible(true);
                jpPrincipal.add(Catalogo.Carro1);
            });

            Catalogo.btnSetaBaixoC2.addActionListener(h -> {
                jpCadastro.setVisible(false);
                Login.Login.setVisible(false);
                Catalogo.Carro2.setVisible(false);
                Catalogo.Carro3.setVisible(true);

                jpPrincipal.add(Catalogo.Carro3);
            });

            Catalogo.btnSetaCimaC3.addActionListener(i -> {
                jpCadastro.setVisible(false);
                Login.Login.setVisible(false);
                Catalogo.Carro3.setVisible(false);
                jpPrincipal.add(Catalogo.Carro2);
                Catalogo.Carro2.setVisible(true);
                Catalogo.Carro3.setVisible(false
                );
            });
        });

        btnJaTenhoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpPrincipal.add(Login.Login);
                jpCadastro.setVisible(false);
            }
        });



    }

    public void NewUser(String user, String senha){

        Usuarios usuario = new Usuarios();

        usuario.setUser(user);
        usuario.setSenha(senha);

    }

    public void VirificaUser(Usuarios usuario, String user,String senha){
        if (usuario.getUser().equals(user) && usuario.getSenha().equals(senha)){

        }else{
            JOptionPane.showMessageDialog(null,"Usuário ou senha incorretos");
        }
    }



    public static void main(String[] args) {

        JFrame frame = new JFrame("CRT");
        frame.getContentPane().add(new Main());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 1200, 700);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        

    }
}



