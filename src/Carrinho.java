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
    static JPanel pnTable;
    static JScrollPane scrollTable;

    static JButton btnVoltar, btnProsseguir;
    static ImageIcon imgBtnVoltar2, imgBtnProsseguir2;

    public static void TlCarrinho(){

        jpCarrinho = new JPanel(null);
        jpCarrinho.setBounds(0,0,1200,700);
        jpCarrinho.setBackground(Color.WHITE);

        pnTable = new JPanel(new BorderLayout());
        pnTable.setBorder(new TitledBorder("Itens do Pedido"));//linhas 64 e 65 definem a borda do painel , com o nome dele (nesse caso itens do pedido)
        scrollTable = new JScrollPane();

        DefaultTableModel tableModel = new DefaultTableModel(
                new String[] {"Produto", "Qtde", "Preço Un.", "Total" },0) { //cria o layout da tabela , os itens do vetor são os nomes da coluna, o 0 indica que a tabela saíra sem nenhuma linha
            public boolean isCellEditable(int row, int col) { //método para dizer se a celula será editavel ou não
                if (col == 3) {
                    return false;
                }
                return true;
            }

        };

        table = new JTable(tableModel);//instancia a tabela e adiciona o modelo de tabela criado anteriomente a ela
        DefaultTableCellRenderer alinhaDireita = new DefaultTableCellRenderer();
//        alinhaDireita.setHorizontalAlignment(SwingConstants.RIGHT);//a variável alinhaDireita alinha o conteudo da tabela a direita
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

        scrollTable.setViewportView(table);
        pnTable.add(scrollTable);
        pnTable.setBounds(156 ,147, 911, 403);

        pnTable.setBackground(Color.WHITE);

        jpCarrinho.add(pnTable);

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
