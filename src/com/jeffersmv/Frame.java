package com.jeffersmv;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jeff on 15.02.2016.
 */
public class Frame extends JFrame {
    private String title;
    private Dimension dimension;

    public static PanelButtons panelButtons = new PanelButtons();

    public Frame(String title, Dimension dimension) throws HeadlessException {
        this.title = title;
        this.dimension = dimension;
        initFrame();
    }

    protected void initFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle(title);
        setSize(dimension);
        setLocationRelativeTo(null);
        setResizable(false);

//        setBounds(200, 100, 300, 300);
//        createMenu();
//        add(panelButtons);
//        panelButtons.setVisible(true);
        getContentPane().add(panelButtons);

//        Container container = getContentPane();
//        panelButtons.setDoubleBuffered(true);
//        container.add(panelButtons);
//        removeAll();


    }
}