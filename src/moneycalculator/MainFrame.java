package moneycalculator;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

    public MainFrame() throws HeadlessException {
        setTitle("Money Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(400,400));
        this.setMenuBar(menuBar());
        setVisible(true);
    }

    private MenuBar menuBar() {
        MenuBar menuBar = new MenuBar();
        menuBar.add(calculate());
        return menuBar;
    }

    private Menu calculate() {
        Menu menu = new Menu("File");
        menu.add(NewExchange());
        return menu;
    }

    private MenuItem NewExchange() {
        MenuItem menuItem = new MenuItem("New");
        menuItem.addActionListener(doNewExchange());
        return menuItem;
    }

    private ActionListener doNewExchange() {
        return new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("PULSÉ EN NEW");
            }
            
        };
    }
    
}
