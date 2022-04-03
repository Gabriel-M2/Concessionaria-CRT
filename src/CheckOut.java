import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckOut {

    static JPanel jpCheckOut, jpEntrega, jpCarrinho, jpTitulo1;

    static JTextField tfNome, tfSobreNome, tfEndereco, tfCidade, tfEstado, tfCEP, tfEmail, tfTelefone;

    static JLabel lbCheckOut;

    static JLabel lbTitulo, lbNome, lbSobreNome, lbEndereco, lbCidade, lbEstado, lbCEP, lbEmail, lbTelefone;

    static JRadioButton rbCredito, rbDebito, rbPix;
    static ButtonGroup btgRB;

    static  JTextField tfNum = new JTextField();

    static JButton btnProsseguir, btnVoltar;

    static ImageIcon imgFinalizar, imgVoltar3;
    


    public static void TlCheckOut(){

        try {
            imgFinalizar = new ImageIcon(CheckOut.class.getResource("img/btnFinalizar.png"));
            imgVoltar3 = new ImageIcon(CheckOut.class.getResource("img/btnVoltar3.png"));
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        jpCheckOut = new JPanel(null);
        jpCheckOut.setBounds(0,0,1200,700);
        jpCheckOut.setBackground(Color.WHITE);

        lbCheckOut = new JLabel("CHECKOUT");
        lbCheckOut.setBounds(444,46,280,53);
        lbCheckOut.setForeground(Color.BLACK);
        lbCheckOut.setFont(new Font("Poppins",Font.BOLD,48));
        jpCheckOut.add(lbCheckOut);


        jpEntrega = new JPanel(null);
        jpEntrega.setBounds(38,130,800,516);
        jpEntrega.setBackground(Color.WHITE);
        jpEntrega.setBorder(BorderFactory.createMatteBorder(0,2,2,2,new Color(97, 94, 94,92)));
        jpCheckOut.add(jpEntrega);

        jpTitulo1 = new JPanel(null);
        jpTitulo1.setBounds(0,0,800,68);
        jpTitulo1.setBackground(new Color(56,53,53));
        jpEntrega.add(jpTitulo1);

        tfNome = new JTextField();
        tfNome.setBounds(26,141,374,49);
        tfNome.setBorder(BorderFactory.createMatteBorder(2,2,2,2,new Color(97, 94, 94,92)));
        jpEntrega.add(tfNome);
        tfNome.setFont(new Font("Arial",Font.PLAIN,18));

        lbNome = new JLabel("Primeiro Nome");
        lbNome.setBounds(26,120,92,11);
        lbNome.setForeground(new Color(197,192,192));
        lbNome.setFont(new Font("Poppins",Font.PLAIN,14));
        jpEntrega.add(lbNome);

        tfSobreNome = new JTextField();
        tfSobreNome.setBounds(408,141,374,49);
        tfSobreNome.setBorder(BorderFactory.createMatteBorder(2,2,2,2,new Color(97, 94, 94,92)));
        tfSobreNome.setFont(new Font("Arial",Font.PLAIN,18));
        jpEntrega.add(tfSobreNome);

        lbSobreNome = new JLabel("Último Nome/Sobrenome");
        lbSobreNome.setBounds(408,120,155,11);
        lbSobreNome.setForeground(new Color(197,192,192));
        lbSobreNome.setFont(new Font("Poppins",Font.PLAIN,14));
        jpEntrega.add(lbSobreNome);

        tfEndereco = new JTextField();
        tfEndereco.setBounds(26,229,756,49);
        tfEndereco.setBorder(BorderFactory.createMatteBorder(2,2,2,2,new Color(97, 94, 94,92)));
        tfEndereco.setFont(new Font("Poppins",Font.PLAIN,14));
        jpEntrega.add(tfEndereco);

        lbEndereco = new JLabel("Endereço");
        lbEndereco.setBounds(26,204,92,11);
        lbEndereco.setForeground(new Color(197,192,192));
        lbEndereco.setFont(new Font("Poppins",Font.PLAIN,14));
        jpEntrega.add(lbEndereco);

        tfCidade = new JTextField();
        tfCidade.setBounds(26,317,223,49);
        tfCidade.setBorder(BorderFactory.createMatteBorder(2,2,2,2,new Color(97, 94, 94,92)));
        tfCidade.setFont(new Font("Poppins",Font.PLAIN,14));
        jpEntrega.add(tfCidade);

        lbCidade = new JLabel("Cidade");
        lbCidade.setBounds(26,292,92,11);
        lbCidade.setForeground(new Color(197,192,192));
        lbCidade.setFont(new Font("Poppins",Font.PLAIN,14));
        jpEntrega.add(lbCidade);

        tfEstado = new JTextField();
        tfEstado.setBounds(298,317,223,49);
        tfEstado.setBorder(BorderFactory.createMatteBorder(2,2,2,2,new Color(97, 94, 94,92)));
        tfEstado.setFont(new Font("Poppins",Font.PLAIN,14));
        jpEntrega.add(tfEstado);

        lbEstado = new JLabel("Estado");
        lbEstado.setBounds(298,292,92,11);
        lbEstado.setForeground(new Color(197,192,192));
        lbEstado.setFont(new Font("Poppins",Font.PLAIN,14));
        jpEntrega.add(lbEstado);

        tfCEP = new JTextField();
        tfCEP.setBounds(566,317,223,49);
        tfCEP.setBorder(BorderFactory.createMatteBorder(2,2,2,2,new Color(97, 94, 94,92)));
        tfCEP.setFont(new Font("Poppins",Font.PLAIN,14));
        jpEntrega.add(tfCEP);

        lbCEP = new JLabel("CEP");
        lbCEP.setBounds(566,292,92,11);
        lbCEP.setForeground(new Color(197,192,192));
        lbCEP.setFont(new Font("Poppins",Font.PLAIN,14));
        jpEntrega.add(lbCEP);

        tfEmail = new JTextField();
        tfEmail.setBounds(26,405,374,49);
        tfEmail.setBorder(BorderFactory.createMatteBorder(2,2,2,2,new Color(97, 94, 94,92)));
        jpEntrega.add(tfEmail);

        lbEmail = new JLabel("Email");
        lbEmail.setBounds(26,380,92,11);
        lbEmail.setForeground(new Color(197,192,192));
        lbEmail.setFont(new Font("Poppins",Font.PLAIN,14));
        jpEntrega.add(lbEmail);

        tfTelefone = new JTextField();
        tfTelefone.setBounds(408,405,374,49);
        tfTelefone.setBorder(BorderFactory.createMatteBorder(2,2,2,2,new Color(97, 94, 94,92)));
        jpEntrega.add(tfTelefone);

        lbTelefone = new JLabel("Telefone");
        lbTelefone.setBounds(412,380,92,11);
        lbTelefone.setForeground(new Color(197,192,192));
        lbTelefone.setFont(new Font("Poppins",Font.PLAIN,14));
        jpEntrega.add(lbTelefone);

        lbTitulo = new JLabel("1 - Entrega");
        lbTitulo.setBounds(12,20,290,29);
        lbTitulo.setForeground(Color.WHITE);
        lbTitulo.setFont(new Font("Poppins",Font.BOLD,20));
        jpTitulo1.add(lbTitulo);

        rbCredito = new JRadioButton("Crédito");
        rbCredito.setBounds(32,480,138,26);
        rbCredito.setFont(new Font("Poppins",Font.BOLD, 20));
        rbCredito.setBackground(Color.WHITE);
        jpEntrega.add(rbCredito);

        rbDebito = new JRadioButton("Débito");
        rbDebito.setBounds(217,480,138,26);
        rbDebito.setFont(new Font("Poppins",Font.BOLD, 20));
        rbDebito.setBackground(Color.WHITE);
        jpEntrega.add(rbDebito);

        rbPix = new JRadioButton("Pix");
        rbPix.setBounds(398,480,138,26);
        rbPix.setFont(new Font("Poppins",Font.BOLD, 20));
        rbPix.setBackground(Color.WHITE);
        jpEntrega.add(rbPix);

        ButtonGroup btgPag = new ButtonGroup();

       btgPag.add(rbCredito);
       btgPag.add(rbDebito);
       btgPag.add(rbPix);


        tfNum = new JTextField();
        tfNum.setBounds(552,475,216,49);
        tfNum.setBorder(BorderFactory.createMatteBorder(2,2,2,2,new Color(97, 94, 94,92)));
        tfNum.setFont(new Font("Poppins",Font.PLAIN,14));
        jpEntrega.add(tfNum);
        tfNum.setVisible(false);




        btnProsseguir = new JButton(imgFinalizar);
        btnProsseguir.setBounds(893,262,262,50);
        btnProsseguir.setContentAreaFilled(false);
        btnProsseguir.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        btnProsseguir.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jpCheckOut.add(btnProsseguir);

        btnVoltar = new JButton(imgVoltar3);
        btnVoltar.setBounds(893,468,262,50);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        btnVoltar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jpCheckOut.add(btnVoltar);

       Eventos();
    }

    public static void Eventos(){
       rbCredito.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               tfNum.setVisible(true);
           }
       });

        rbDebito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfNum.setVisible(true);
            }
        });

        rbPix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        btnProsseguir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selecionado = "";

                if (rbCredito.isSelected()){
                    selecionado = "Crédito";
                }else if (rbDebito.isSelected()){
                    selecionado = "Débito";
                }else if (rbPix.isSelected()){
                    selecionado = "Pix";
                }


                if (tfNum.getText() != "" && tfNome.getText() != "" && tfSobreNome.getText() != "" && tfEndereco.getText() != "" && tfCidade.getText() != "" && tfEstado.getText() != "" && tfCEP.getText() != "" && tfEmail.getText() != "" && tfTelefone.getText() != ""){
                    JOptionPane.showMessageDialog(null,"" +
                            "Nome: "+tfNome.getText() + tfSobreNome.getText()+"\n" +
                            "Endereço: "+tfEndereco.getText()+"\n" +
                            "Cidade e Estado:"+tfEstado.getText()+" " + tfCidade.getText()+"\n" +
                            "CEP: "+tfCEP.getText()+"\n" +
                            "Email: "+tfEmail.getText()+"\n" +
                            "Telefone: "+tfTelefone.getText()+"\n" +
                            "Método de Pag. :"+selecionado);
                }
            }
        });

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpCheckOut.setVisible(false);
                Catalogo.Carro1.setVisible(true);
            }
        });

    }


}
