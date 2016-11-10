package moneycalculator;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneycalculator.ui.swing.SwingMoneyDisplay;

public class MainFrame extends JFrame {
    private int index = 0;

    public MainFrame() throws HeadlessException {
        setTitle("Money Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(400,400));
        this.setMenuBar(menuBar());
        setLayout(new BorderLayout());
        add(label(),BorderLayout.NORTH);
        add(label(),BorderLayout.SOUTH);
        add(label(),BorderLayout.WEST);
        add(label(),BorderLayout.EAST);
        add(moneyDisplay());
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
        menu.add(Close());
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

    private MenuItem Close() {
        MenuItem menuItem = new MenuItem("Close");
        menuItem.addActionListener(doClose());
        return menuItem;
    }

    private ActionListener doClose() {
        return new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("PULSÉ EN CLOSE");
            }
            
        };
    }

    private JPanel label() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(new JLabel("A" + index++ ));
        return panel;
    }

    private JPanel moneyDisplay() {
        SwingMoneyDisplay swingMoneyDisplay = new SwingMoneyDisplay();
        return swingMoneyDisplay;
                
    }
    
}
