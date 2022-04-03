import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Catalogo extends JPanel {


//    static JPanel jpPrincipal;
    static JPanel Carro1, Carro2, Carro3;

    static ImageIcon imgCarro1, imgCarro2, imgCarro3;
    static JLabel lbCarro1, lbCarro2, lbCarro3;

    static JLabel lbNissan,lb350z, lbFusca, lbJeep;
    static JLabel lbModelo1, lbModelo2, lbModelo3;

    static FlowLayout layout;

    static JButton btnTenhoInteresseC1, btnTenhoInteresseC2, btnTenhoInteresseC3;

    static ImageIcon imgBtn;

    static JComboBox jcbModelo1, jcbModelo2, jcbModelo3;

    static String[] vetorJcb1 = new String[3];
    static String[] vetorJcb2 = new String[3];
    static String[] vetorJcb3 = new String[3];

    static JButton btnSetaBaixoC1;
    static JButton btnSetaBaixoC2;
    static JButton btnSetaCimaC2, btnSetaCimaC3;

    static ImageIcon imgBtnSeta, imgBtnSetaCima;

    static ImageIcon imgCarro1PQ,imgCarro2PQ,imgCarro3PQ;

    static ImageIcon imgCarrinho;
    static JButton btnCarrinho,btnCarrinho2,btnCarrinho3;

    static Carrinho carrinho = new Carrinho();

    public static void TlCatalogo(){

         vetorJcb1[0] = "Nissan 2.0";
         vetorJcb1[1] = "Nissan 2.4";
         vetorJcb1[2] = "Nissan 3.0";

         vetorJcb2[0] = "Fusca 1.2";
         vetorJcb2[1] = "Fusca 1.3";
         vetorJcb2[2] = "Fusca 1.5";

         vetorJcb3[0] = "Jeep 2.0";
         vetorJcb3[1] = "Jeep 2.8";
         vetorJcb3[2] = "Jeep 3.6";

        try {
            imgCarro1 = new ImageIcon(Login.class.getResource("img/carro1.png"));
            imgCarro2 = new ImageIcon(Login.class.getResource("img/carro2.png"));
            imgCarro3 = new ImageIcon(Login.class.getResource("img/carro3.png"));

            imgBtn = new ImageIcon(Login.class.getResource("img/Btn.png"));

            imgBtnSeta = new ImageIcon(Login.class.getResource("img/Seta.png"));
            imgBtnSetaCima = new ImageIcon(Login.class.getResource("img/SetaCima.png"));

            imgCarro1PQ = new ImageIcon(Login.class.getResource("img/carro1PQ.png"));
            imgCarro2PQ = new ImageIcon(Login.class.getResource("img/carro2PQ.png"));
            imgCarro3PQ = new ImageIcon(Login.class.getResource("img/carro3PQ.png"));

            imgCarrinho = new ImageIcon(Login.class.getResource("img/carrinho.png"));


        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        Carro1 = new JPanel(null);
        Carro2 = new JPanel(null);
        Carro3 = new JPanel(null);


        lbNissan = new JLabel("Nissan");
        lb350z = new JLabel("350z");
        lbFusca = new JLabel("VW Fusca");
        lbJeep = new JLabel("JEEP");

        Carro1.add(lbNissan);
        Carro1.add(lb350z);
        Carro2.add(lbFusca);
        Carro3.add(lbJeep);

        lbNissan.setBounds(884,68,256,51);
        lb350z.setBounds(923,161,163,52);
        lbFusca.setBounds(840,68,350,51);
        lbJeep.setBounds(884,68,256,51);

        lbNissan.setForeground(Color.WHITE);
        lb350z.setForeground(Color.WHITE);
        lbFusca.setForeground(Color.WHITE);
        lbJeep.setForeground(Color.WHITE);


        lbNissan.setForeground(Color.BLACK);
        lb350z.setForeground(Color.BLACK);
        lbFusca.setForeground(Color.BLACK);
        lbJeep.setForeground(Color.BLACK);

        lbNissan.setFont(new Font("Poppins",Font.BOLD,64));
        lb350z.setFont(new Font("Poppins",Font.BOLD,64));
        lbFusca.setFont(new Font("Poppins",Font.BOLD,64));
        lbJeep.setFont(new Font("Poppins",Font.BOLD,64));


        btnTenhoInteresseC1 = new JButton();
        btnTenhoInteresseC2 = new JButton();
        btnTenhoInteresseC3 = new JButton();

        btnTenhoInteresseC1.setIcon(imgBtn);
        btnTenhoInteresseC2.setIcon(imgBtn);
        btnTenhoInteresseC3.setIcon(imgBtn);

        Carro1.add(btnTenhoInteresseC1);
        Carro2.add(btnTenhoInteresseC2);
        Carro3.add(btnTenhoInteresseC3);


        btnTenhoInteresseC1.setBounds(889,277,231,68);
        btnTenhoInteresseC2.setBounds(889,277,231,68);
        btnTenhoInteresseC3.setBounds(889,277,231,68);

        btnTenhoInteresseC1.setContentAreaFilled(false);
        btnTenhoInteresseC2.setContentAreaFilled(false);
        btnTenhoInteresseC3.setContentAreaFilled(false);

        btnTenhoInteresseC1.setBackground(new Color(0,0,0,12));
        btnTenhoInteresseC2.setBackground(new Color(0,0,0,12));
        btnTenhoInteresseC3.setBackground(new Color(0,0,0,12));


        btnTenhoInteresseC1.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        btnTenhoInteresseC2.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        btnTenhoInteresseC3.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));




        lbModelo1 = new JLabel("Modelo: ");
        lbModelo2 = new JLabel("Modelo: ");
        lbModelo3 = new JLabel("Modelo: ");
        Carro1.add(lbModelo1);
        Carro2.add(lbModelo2);
        Carro3.add(lbModelo3);


        lbModelo1.setBounds(865,413,97,19);
        lbModelo2.setBounds(865,413,97,19);
        lbModelo3.setBounds(865,413,97,19);

        lbModelo1.setFont(new Font("Poppins",Font.BOLD,20));
        lbModelo2.setFont(new Font("Poppins",Font.BOLD,20));
        lbModelo3.setFont(new Font("Poppins",Font.BOLD,20));

        lbModelo1.setForeground(Color.WHITE);
        lbModelo2.setForeground(Color.WHITE);
        lbModelo3.setForeground(Color.WHITE);



        Carro1.setBounds(0,0,1200,2100);
        Carro2.setBounds(0,0,1200,2100);
        Carro3.setBounds(0,0,1200,2100);

        Carro1.setBackground(new Color(1,38,65));
        Carro2.setBackground(new Color(1,38,65));
        Carro3.setBackground(new Color(1,38,65));


        lbCarro1 = new JLabel(imgCarro1);
        lbCarro2 = new JLabel(imgCarro2);
        lbCarro3 = new JLabel(imgCarro3);

        lbCarro1.setBounds(0,0,807,700);
        lbCarro2.setBounds(0,0,807,700);
        lbCarro3.setBounds(0,0,807,700);

        Carro1.add(lbCarro1);
        Carro2.add(lbCarro2);
        Carro3.add(lbCarro3);

        jcbModelo1 = new JComboBox(vetorJcb1);
        jcbModelo1.setBounds(993,410,135,26);

        jcbModelo2 = new JComboBox(vetorJcb2);
        jcbModelo2.setBounds(993,410,135,26);

        jcbModelo3 = new JComboBox(vetorJcb3);
        jcbModelo3.setBounds(993,410,135,26);


        Carro1.add(jcbModelo1);
        Carro2.add(jcbModelo2);
        Carro3.add(jcbModelo3);


        btnSetaBaixoC1 = new JButton(imgBtnSeta);
        btnSetaCimaC2 = new JButton(imgBtnSetaCima);
        btnSetaBaixoC2 = new JButton(imgBtnSeta);
        btnSetaCimaC3 = new JButton(imgBtnSetaCima);

        btnSetaBaixoC1.setBounds(1114,580,51,51);
        btnSetaBaixoC2.setBounds(1114,580,51,51);

        btnSetaCimaC2.setBounds(1060,580,51,51);
        btnSetaCimaC3.setBounds(1114,580,51,51);

        btnSetaBaixoC1.setContentAreaFilled(false);
        btnSetaBaixoC2.setContentAreaFilled(false);
        btnSetaCimaC2.setContentAreaFilled(false);
        btnSetaCimaC3.setContentAreaFilled(false);

        btnSetaBaixoC1.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        btnSetaBaixoC2.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        btnSetaCimaC2.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        btnSetaCimaC3.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));

        btnCarrinho = new JButton(imgCarrinho);
        btnCarrinho.setBounds(1119,12,51,51);
        btnCarrinho.setContentAreaFilled(false);
        btnCarrinho.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));

        btnCarrinho2 = new JButton(imgCarrinho);
        btnCarrinho2.setBounds(1119,12,51,51);
        btnCarrinho2.setContentAreaFilled(false);
        btnCarrinho2.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));

        btnCarrinho3 = new JButton(imgCarrinho);
        btnCarrinho3.setBounds(1119,12,51,51);
        btnCarrinho3.setContentAreaFilled(false);
        btnCarrinho3.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));

        Carro1.add(btnCarrinho);
        Carro2.add(btnCarrinho2);
        Carro3.add(btnCarrinho3);

        Carro1.add(btnSetaBaixoC1);
        Carro2.add(btnSetaCimaC2);
        Carro2.add(btnSetaBaixoC2);
        Carro3.add(btnSetaCimaC3);

        btnCarrinho.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCarrinho2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCarrinho3.setCursor(new Cursor(Cursor.HAND_CURSOR));


    }

    public static void  Eventos(){

        btnTenhoInteresseC1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnTenhoInteresseC2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnTenhoInteresseC3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnSetaBaixoC1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSetaCimaC2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSetaBaixoC2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSetaCimaC3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnTenhoInteresseC1.addActionListener(e -> {
            Revisao.TlRevisao("NISSAN","NISSAN 350Z","2.0","2.4","3.0");

            Carro1.setVisible(false);
            Revisao revisao = new Revisao();
            Main.jpPrincipal.add(revisao.jpRevisao);
        });
        btnTenhoInteresseC2.addActionListener(e -> {
            Revisao.TlRevisao("FUSCA","VW FUSCA","1.2","1.3","1.5");
            Carro2.setVisible(false);
            Revisao revisao = new Revisao();
            Main.jpPrincipal.add(revisao.jpRevisao);
        });
        btnTenhoInteresseC3.addActionListener(e -> {
            Revisao.TlRevisao("JEEP","JEEP","2.0","2.8","3.6");
            Carro3.setVisible(false);
            Revisao revisao = new Revisao();
            Main.jpPrincipal.add(revisao.jpRevisao);
            Revisao.jpRevisao.setVisible(true);
        });

        btnCarrinho.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Carro1.setVisible(false);
                Carrinho carrinho = new Carrinho();
                carrinho.TlCarrinho();
                carrinho.jpCarrinho.setVisible(true);
                Main.jpPrincipal.add(carrinho.jpCarrinho);
            }
        });

        btnCarrinho2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Carro2.setVisible(false);
                Carrinho carrinho = new Carrinho();
                carrinho.TlCarrinho();
                carrinho.jpCarrinho.setVisible(true);
                Main.jpPrincipal.add(carrinho.jpCarrinho);
            }
        });

        btnCarrinho3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Carro3.setVisible(false);
                Carrinho carrinho = new Carrinho();
                carrinho.TlCarrinho();
                carrinho.jpCarrinho.setVisible(true);
                Main.jpPrincipal.add(carrinho.jpCarrinho);
            }
        });




    }


}
