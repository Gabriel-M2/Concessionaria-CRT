import javax.swing.*;
import java.awt.*;
import java.awt.Window.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Splash_GUI extends JPanel {
    static JFrame frame = new JFrame("Splash");
    JProgressBar progresso;

    ImageIcon img = new ImageIcon(getClass().getResource("img/splash.png"));
    JLabel fundo;

    public Splash_GUI(){
    Splash();
    }

    public void Splash(){
        setLayout(null);

        fundo = new JLabel(img);
        fundo.setBounds(0,0,800,400);
        add(fundo);

        progresso = new JProgressBar();
        progresso.setBounds(0,385,1000,5);
        progresso.setBorder(BorderFactory.createMatteBorder(0,0,0,0,new Color(0,0,0,0)));
        progresso.setForeground(Color.orange);
        progresso.setBackground(new Color(0,0,0,0));
        add(progresso);

        new Thread(){

            public void run() {



                for (int i=0; i<101; i++){
                    try {
                        sleep(50);
                        progresso.setValue(i);
                        if(progresso.getValue() == 10){
                            sleep(1000);
                        }else if (progresso.getValue() <=30){
                            sleep(50);
                        } else if (progresso.getValue() <=99){
                        }else{
                            sleep(3000);
                            String[] vetor = new String[1];
                            Main.main(vetor);
                            frame.dispose();
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(Splash_GUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        }.start();

    }
    public static void main(String[] args) {
        System.out.println("Iniciando...");
        frame.getContentPane().add(new Splash_GUI());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 800, 390);
        frame.setResizable(false);
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
//
    }


}
