
package neu.edu.csye6200;

import neu.edu.csye6200.controller.MainController;
import neu.edu.csye6200.userInterface.LoginJFrame;
import neu.edu.csye6200.userInterface.MainJFrame;

/**
 *
 * @author Vivek
 */
public class App {
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginJFrame view = new LoginJFrame();
                // Alternatively, you can use setPreferredSize and pack
                view.setPreferredSize(new java.awt.Dimension(1240, 830));
                view.pack();
                view.setVisible(true);
                // MainController controller = new MainController(view);
            }
        });
    }

}
