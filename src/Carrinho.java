import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Carrinho extends JPanel {

    static JPanel jpCarrinho;

    static JTable table;


    static JButton btnVoltar, btnProsseguir;
    static ImageIcon imgBtnVoltar2, imgBtnProsseguir2;

    public static void TlCarrinho(){

        jpCarrinho = new JPanel(null);
        jpCarrinho.setBounds(0,0,1200,700);
        jpCarrinho.setBackground(Color.WHITE);



        jpCarrinho.add(Main.pnTable);

        try {
            imgBtnProsseguir2 = new ImageIcon(Carrinho.class.getResource("img/imgBtnProsseguir2.png"));
            imgBtnVoltar2 = new ImageIcon(Carrinho.class.getResource("img/imgBtnVoltar2.png"));

        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        btnProsseguir = new JButton(imgBtnProsseguir2);
        btnProsseguir.setBounds(656,610,241,50);
        btnProsseguir.setContentAreaFilled(false);
        btnProsseguir.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        btnProsseguir.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jpCarrinho.add(btnProsseguir);

        btnVoltar = new JButton(imgBtnVoltar2);
        btnVoltar.setBounds(303,610,241,50);
        btnVoltar.setContentAreaFilled(false);
        btnVoltar.setBorder(BorderFactory.createMatteBorder(0,0,0,0,Color.WHITE));
        btnVoltar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jpCarrinho.add(btnVoltar);

        Eventos();
    }
    public static void Eventos(){

        btnVoltar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpCarrinho.setVisible(false);
                Catalogo.Carro1.setVisible(true);
            }
        });

        btnProsseguir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpCarrinho.setVisible(false);
                CheckOut checkout = new CheckOut();
                Main.jpPrincipal.add(checkout.jpCheckOut);
                checkout.jpCheckOut.setVisible(true);
            }
        });
    }

}
