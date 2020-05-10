package observer.v2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author z
 * @date 2020-05-10 19:37
 */
public class AwtFrame extends Frame {

    public void launch() {
        Button button = new Button("按一下");
        button.addActionListener(new MyActionListener());
        button.addActionListener(new HisActionListener());

        this.add(button);
        this.pack();

        //this.addWindowListener((WindowAdapter) windowClosing(e)-> { System.exit(0);});
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setLocation(1000, 1000);
        this.setVisible(true);

    }

    public class MyActionListener implements ActionListener {

        /**
         * Invoked when an action occurs.
         *
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("我知道你按了一下");
        }
    }

    public class HisActionListener implements ActionListener {

        /**
         * Invoked when an action occurs.
         *
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("他知道你按了一下");
        }
    }

    public static void main(String[] args) {
        new AwtFrame().launch();
    }
}
