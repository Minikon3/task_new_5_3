import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main extends JFrame {
    int win_width = 500;
    int win_height = 349;
    JPanel default_panel = new JPanel();
    Main(){
        super("Картинка");
        setSize(win_width, win_height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        add(default_panel);
    }
    public void setDefault_panel(JPanel jp){
        default_panel=jp;
    }
    public static void main(String[] args) throws InterruptedException {
        Image img= Toolkit.getDefaultToolkit().getImage(args[0]);
        JPanel jp = new JPanel(){
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawImage(img,0,0,null);
            }
        };
        Main app = new Main();
        app.setDefault_panel(jp);
        app.setContentPane(jp);
        app.setVisible(true);
        while (true){
            app.repaint();
        }
    }
}