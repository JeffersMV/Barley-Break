package com.jeffersmv;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Jeff on 14.02.2016.
 */
public class ActionListenerButtons implements ActionListener {
    PanelButtons panelButtons;
    private ArrayList<Integer> arrayListAction;

    public ActionListenerButtons(ArrayList<Integer> arrayListAction) {
        this.arrayListAction = arrayListAction;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
//        button.setVisible(false);

        String nameButton = button.getText();
        System.out.println(nameButton);
        changeButton(Integer.parseInt(nameButton), arrayListAction);

//        JButton button = (JButton) e.getSource();
//        button.setVisible(false);
//        String name = button.getText();
//        change(Integer.parseInt(name));
    }

    public void changeButton(int numButton, ArrayList<Integer> arrayList) {
        int index = arrayList.indexOf(numButton);
        int inndex0 = arrayList.indexOf(0);
        arrayList.set(inndex0, numButton);
        arrayList.set(index, 0);
        panelButtons= new PanelButtons(arrayList);
        panelButtons.removeAll();
        System.out.println(arrayList);

//        panelButtons.setArrayList(arrayList);
//        buttons = new Buttons(arrayList);


    }




}