/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab7;

import java.awt.*;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author ADMIN
 */
public class Lab7 extends JFrame {

    private Store store = Store.getInstance();
    public static CDTable cdTable;

    public Lab7() {
        init();
    }

    public void init() {
        setLayout(new FlowLayout());
        setTitle("CD Store");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(570, 700));
        setLocationRelativeTo(null);
        setResizable(true);
        cdTable = new CDTable();
        add(new ButtonPanel());
        add(cdTable);
        add(new SearchPanel(), BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            new Lab7().setVisible(true);
        });
    }
}
}
