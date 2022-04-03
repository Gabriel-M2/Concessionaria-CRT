import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Revisao extends JPanel {

    static ImageIcon imgCarro;
    static JLabel lbCarro;
    static JPanel jpRevisao;

    static JLabel lbtitulo;

    static JRadioButton rbBanco, rbRodas, rbMotor1, rbMotor2, rbMotor3;
    static ButtonGroup btgGroup;

    static JPanel[] jpLinha = new JPanel[6];

    static JLabel lbPrecoBase;
    static JLabel lbSubTotal;

    static int num;
    static float preco;
    static float subTotal;

    static ImageIcon imgBtnVoltar;
    static ImageIcon imgbtnCarrinho;
    static JButton btnVoltar;
    static JButton btnCarrinho;



    static boolean verif1 = false;
    static boolean verif2  = false;
    boolean verif3  = false;
    static boolean verif4  = false;
    static boolean verif5  = false;

    static int qntdCarro1 = 10;
    static int qntdCarro2 = 10;
    static int qntdCarro3 = 10;

    static String auxCarro;

    static String Carro = "";



    static Carrinho carrinho = new Carrinho();

    static DefaultTableModel dtm = (DefaultTableModel) carrinho.table.getModel();



    public  static void TlRevisao(String carro, String titulo, String Motor1, String Motor2, String Motor3){

        Carro = titulo;
        auxCarro = carro;

        switch (carro) {
            case "NISSAN":
                num = 1;
                preco = 450000.00f;
                subTotal = preco;
                break;
            case "FUSCA":
                num = 2;
                preco = 22000.00f;
                subTotal = preco;
                break;
            case "JEEP":
                preco = 120000.00f;
                subTotal = preco;
                num = 3;
                break;
        }
        try {
            imgCarro = new ImageIcon(Revisao.class.getResource("img/carro"+num+"F.png"));

            imgBtnVoltar = new ImageIcon(Revisao.class.getResource("img/imgBtnVoltar.png"));
            imgbtnCarrinho = new ImageIcon(Revisao.class.getResource("img/imgbtnCarrinho.png"));

        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        jpRevisao = new JPanel(null);
        jpRevisao.setBounds(0,0,1200,700);
        jpRevisao.setBackground(Color.WHITE);

        lbCarro = new JLabel(imgCarro);
        lbCarro.setBounds(53,269,518,329);
        jpRevisao.add(lbCarro);

        lbtitulo = new JLabel(titulo);
        lbtitulo.setBounds(422,53,500,53);
        lbtitulo.setFont(new Font("Poppins",Font.BOLD,64));
        jpRevisao.add(lbtitulo);

        rbBanco = new JRadioButton("Banco de Couro");
        rbBanco.setBounds(655,212,130,16);
        rbBanco.setFont(new Font("Poppins",Font.BOLD,16));
        rbBanco.setBackground(Color.WHITE);
        rbBanco.setForeground(Color.BLACK);
        jpRevisao.add(rbBanco);

        rbRodas = new JRadioButton("Rodas de Liga Leve");
        rbRodas.setBounds(655,290,130,16);
        rbRodas.setFont(new Font("Poppins",Font.BOLD,16));
        rbRodas.setBackground(Color.WHITE);
        rbRodas.setForeground(Color.BLACK);
        jpRevisao.add(rbRodas);

        rbMotor1 = new JRadioButton("Motor "+Motor1);
        rbMotor1.setBounds(655,368,130,16);
        rbMotor1.setFont(new Font("Poppins",Font.BOLD,16));
        rbMotor1.setBackground(Color.WHITE);
        rbMotor1.setForeground(Color.BLACK);
        rbMotor1.setSelected(true);
        jpRevisao.add(rbMotor1);

        rbMotor2= new JRadioButton("Motor "+Motor2);
        rbMotor2.setBounds(655,446,130,16);
        rbMotor2.setFont(new Font("Poppins",Font.BOLD,16));
        rbMotor2.setBackground(Color.WHITE);
        rbMotor2.setForeground(Color.BLACK);
        jpRevisao.add(rbMotor2);

        rbMotor3 = new JRadioButton("Motor "+Motor3);
        rbMotor3.setBounds(655,524,130,16);
        rbMotor3.setFont(new Font("Poppins",Font.BOLD,16));
        rbMotor3.setBackground(Color.WHITE);
        rbMotor3.setForeground(Color.BLACK);
        jpRevisao.add(rbMotor3);


        jpLinha[0] = new JPanel();
        jpLinha[1] = new JPanel();
        jpLinha[2] = new JPanel();
        jpLinha[3] = new JPanel();
        jpLinha[4] = new JPanel();
        jpLinha[5] = new JPanel();

        jpLinha[0].setBounds(600,181,530,3);
        jpLinha[1].setBounds(600,259,530,3);
        jpLinha[2].setBounds(600,337,530,3);
        jpLinha[3].setBounds(600,415,530,3);
        jpLinha[4].setBounds(600,493,530,3);
        jpLinha[5].setBounds(600,571,530,3);

        jpLinha[0].setBackground(Color.BLACK);
        jpLinha[1].setBackground(Color.BLACK);
        jpLinha[2].setBackground(Color.BLACK);
        jpLinha[3].setBackground(Color.BLACK);
        jpLinha[4].setBackground(Color.BLACK);
        jpLinha[5].setBackground(Color.BLACK);

        jpRevisao.add(jpLinha[0]);
        jpRevisao.add(jpLinha[1]);
        jpRevisao.add(jpLinha[2]);
        jpRevisao.add(jpLinha[3]);
        jpRevisao.add(jpLinha[4]);
        jpRevisao.add(jpLinha[5]);

        jpLinha[0].setCursor(new Cursor(Cursor.HAND_CURSOR));
        jpLinha[1].setCursor(new Cursor(Cursor.HAND_CURSOR));
        jpLinha[2].setCursor(new Cursor(Cursor.HAND_CURSOR));
        jpLinha[3].setCursor(new Cursor(Cursor.HAND_CURSOR));
        jpLinha[4].setCursor(new Cursor(Cursor.HAND_CURSOR));
        jpLinha[5].setCursor(new Cursor(Cursor.HAND_CURSOR));

        ButtonGroup btgGroup = new ButtonGroup();

        btgGroup.add(rbMotor1);
        btgGroup.add(rbMotor2);
        btgGroup.add(rbMotor3);

        lbPrecoBase = new JLabel("Preço Base: R$"+preco);
        lbPrecoBase.setBounds(33,613,269,61);
        lbPrecoBase.setFont(new Font("Poppins",Font.BOLD,16));
        jpRevisao.add(lbPrecoBase);


        lbSubTotal = new JLabel("SubTotal: R$"+subTotal);
        lbSubTotal.setBounds(936,613,195,61);
        lbSubTotal.setFont(new Font("Poppins",Font.BOLD,16));
        jpRevisao.add(lbSubTotal);
        Calc(0);

        btnVoltar = new JButton(imgBtnVoltar);
        btnVoltar.setBounds(681,614,197,40);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        btnVoltar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jpRevisao.add(btnVoltar);

        btnCarrinho = new JButton(imgbtnCarrinho);
        btnCarrinho.setBounds(385,614,241,40);
        btnCarrinho.setContentAreaFilled(false);
        btnCarrinho.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        btnCarrinho.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jpRevisao.add(btnCarrinho);


        Eventos();
    }


    public static void Calc(int valor) {

        subTotal+= valor;

        lbSubTotal.setText("SubTotal: R$"+subTotal+"0");
    }

    public static void Eventos(){
        rbBanco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

               if (verif1 == false){
                   if (rbBanco.isSelected()){
                       Calc(1100);
                   }else{
                       Calc(-1100);
                   }
                   verif1 = true;
               }else{

               }

                verif2 = false;
                verif4 = false;
                verif5 = false;

            }
        });

        rbRodas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (verif2 == false){
                    if (rbRodas.isSelected()){
                        Calc(2000);
                    }else{
                        Calc(-2000);
                    }
                    verif2 = true;
                }else{

                }
                verif1 = false;
                verif4 = false;
                verif5 = false;
            }
        });

        rbMotor1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calc(0);
            }
        });

        rbMotor2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (verif4 == false){
                    if (rbMotor2.isSelected()){
                        Calc(3100);
                    }else{
                        Calc(-3100);
                    }
                    verif4 = true;
                }else{

                }
                verif2 = false;
                verif1 = false;
                verif5 = false;
            }

        });

        rbMotor3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (verif5 == false){
                    if (rbMotor3.isSelected()){
                        Calc(5300);
                    }else{
                        Calc(-5300);
                    }
                    verif5 = true;
                }else{

                }
                verif2 = false;
                verif1 = false;
                verif4 = false;
            }
        });

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpRevisao.setVisible(false);
                Catalogo.Carro1.setVisible(true);

            }
        });

        btnCarrinho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int qntd = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade que deseja: "));

                switch (auxCarro) {
                    case "NISSAN":
                        if (qntd <= qntdCarro1){
                            Carrinho.TlCarrinho();
                            Main.jpPrincipal.add(carrinho.jpCarrinho);
                            carrinho.jpCarrinho.setVisible(true);
                            jpRevisao.setVisible(false);


                            dtm.addRow(new Object[] {Carro,qntd,subTotal,(qntd * subTotal )});// linhas 114 a 116 adicionam uma linha na tabela

                            qntdCarro1 -= qntd;
                        }else {
                            JOptionPane.showMessageDialog(null,"Infelizmento só temos "+qntdCarro1+" desse modelo :(");
                        }

                        break;
                    case "FUSCA":
                        if (qntd <= qntdCarro2){
                            Carrinho.TlCarrinho();
                            Main.jpPrincipal.add(carrinho.jpCarrinho);
                            carrinho.jpCarrinho.setVisible(true);
                            jpRevisao.setVisible(false);

                            DefaultTableModel dtm = (DefaultTableModel) Carrinho.table.getModel();
                            dtm.addRow(new Object[] {Carro,qntd,subTotal,(qntd * subTotal )});// linhas 114 a 116 adicionam uma linha na tabela

                            qntdCarro2 -= qntd;
                        }else {
                            JOptionPane.showMessageDialog(null,"Infelizmento só temos "+qntdCarro1+" desse modelo :(");
                        }
                        break;
                    case "JEEP":
                        if (qntd <= qntdCarro3){
                            Carrinho.TlCarrinho();
                            Main.jpPrincipal.add(carrinho.jpCarrinho);
                            carrinho.jpCarrinho.setVisible(true);
                            jpRevisao.setVisible(false);

//                            DefaultTableModel dtm = (DefaultTableModel) Carrinho.table.getModel();
                            dtm.addRow(new Object[] {Carro,qntd,subTotal,(qntd * subTotal )});// linhas 114 a 116 adicionam uma linha na tabela

                            qntdCarro3 -= qntd;
                        }else {
                            JOptionPane.showMessageDialog(null,"Infelizmento só temos "+qntdCarro1+" desse modelo :(");
                        }
                        break;
                }

            }
        });

    }

    public static void main(String[] args) {
//        System.out.println("Iniciando...");
        JFrame frame = new JFrame("Main");
        frame.getContentPane().add(new Revisao());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 1200, 700);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);


    }




}
