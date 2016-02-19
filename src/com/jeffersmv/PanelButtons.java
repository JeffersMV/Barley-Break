package com.jeffersmv;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Jeff on 14.02.2016.
 */
public class PanelButtons extends JPanel {
    private ArrayList<Integer> arrayList;
    private int[][] numbers = new int[4][4];

    public PanelButtons() {
        setLayout(new GridLayout(4, 4, 0, 0));
        if (getArrayList() == null) {
            setArrayList(randomButtons());
        } else {
            System.out.println(getArrayList());
            removeAll();
            System.out.println(getArrayList());
        }
        initButtons(getArrayList());
//        removeAll();
    }

    public PanelButtons(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
        setLayout(new GridLayout(4,4,0,0));
        removeAll();
        initButtons(getArrayList());

        repaint();
    }

    public PanelButtons(LayoutManager layoutManager) {

    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    private ArrayList randomButtons() {
        Random random;
        int inject;
        ArrayList<Integer> arrayListRandomButtons = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            random = new Random();
            inject = random.nextInt(16);
            if (!arrayListRandomButtons.contains(inject)) {
                arrayListRandomButtons.add(inject);
            } else {
                i--;
            }
        }
        return arrayListRandomButtons;
    }

    public void initButtons(ArrayList<Integer> arrayList) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                numbers[i][j] = arrayList.get(i * 4 + j);
//                System.out.print(arrayList.get(i * 4 + j) + "; ");
                JButton button = new JButton(Integer.toString(numbers[i][j]));
                button.setFocusable(false);
                add(button);
                if (numbers[i][j] == 0) {
                    button.setVisible(false);
                } else
                    button.addActionListener(new ActionListenerButtons(arrayList));
            }
        }


    }
}



