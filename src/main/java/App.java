import java.awt.EventQueue;


public class App {

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable(){
            public void run() {

                Button button1 = new Button();
                button1.setVisible(true);
            }
        });
    }
}
