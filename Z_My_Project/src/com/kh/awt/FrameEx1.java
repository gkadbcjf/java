package com.kh.awt;
import java.awt.CheckboxGroup;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameEx1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("버튼테스트");
        frame.setSize(300, 400);
        frame.setLocation(300, 300);

        JPanel panel = new JPanel();

        JButton button1 = new JButton("입력");
        JButton button2 = new JButton("출력");
        JButton button3 = new JButton("정렬");
        JButton button4 = new JButton("순위");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        
      
        JCheckBox radio1 =new JCheckBox("고졸",false);
        JCheckBox radio2 =new JCheckBox("대졸",false);
        JCheckBox radio3 =new JCheckBox("석사",false);
        JCheckBox radio4 =new JCheckBox("박사",false);
        
        panel.add(radio1);
        panel.add(radio2);
        panel.add(radio3);
        panel.add(radio4);
        frame.add(panel);

        // 프레임을 닫을 때 프로그램 종료
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}
