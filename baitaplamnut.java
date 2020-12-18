
import javax.swing.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class baitaplamnut extends JFrame implements ActionListener {
    JLabel l, cpr; // khai bao cac nhan

    JCheckBox cb1, cb2, cb3, cb4; // khai bao cac checbox (yes/no)

    JComboBox cbb1, cbb2, cbb3, cbb4;// khai bao cac combobox (chua ds cac gia tri

    JButton b; // khai bao nut lenh

    // String country[]={"India","Aus","U.S.A","England","Newzealand"};
    String num[] = { "1", "2", "3", "4", "5" }; // khai bao mang cac gia tri (string)de tao combobox
    // JComboBox cb=new JComboBox(country);
    // cb.setBounds(50, 50,90,20);

    baitaplamnut() { // tao ham dung (constructor)
        setTitle("ORDER FOOD SYSTEM OF VKU");// dat ten cho Frame

        l = new JLabel("Food Ordering System"); // tao nhan
        l.setBounds(50, 50, 300, 20); // x,y,w,h

        cb1 = new JCheckBox("Pizza cost 50USD"); // tao checBox
        cb1.setBounds(50, 100, 150, 20);

        cbb1 = new JComboBox(num); // tao combobox
        cbb1.setBounds(300, 100, 100, 20);//

        cb2 = new JCheckBox("Burger cost 30USD");
        cb2.setBounds(50, 150, 150, 20);

        cbb2 = new JComboBox(num);
        cbb2.setBounds(300, 150, 100, 20);

        cb3 = new JCheckBox("Tea cost 10USD");
        cb3.setBounds(50, 200, 150, 20);
        cbb3 = new JComboBox(num);
        cbb3.setBounds(300, 200, 100, 20);

        cb4 = new JCheckBox("Milk cost 5USD");
        cb4.setBounds(50, 250, 150, 20);
        cbb4 = new JComboBox(num);
        cbb4.setBounds(300, 250, 100, 20);

        b = new JButton("Order");
        b.setBounds(200, 300, 80, 30);

        cpr = new JLabel("Coppy right @ VKU");
        cpr.setBounds(100, 350, 300, 20); // x,y,w,h

        b.addActionListener(this);
        add(l);
        add(cb1);
        add(cb2);
        add(cb4);
        add(cb3);
        add(b);
        add(cbb1);
        add(cbb4);
        add(cbb2);
        add(cbb3);
        add(cpr);

        setSize(500, 500);
        // pack();// fix size
        setLayout(null); // khong thiet lap bo cuc
        setVisible(true); // cho phép hien thu frame
        setResizable(false);// no change size
        setDefaultCloseOperation(EXIT_ON_CLOSE); //

        // Get current value
        // Object obj = cbb1.getSelectedItem();
        // cbb1.getItemAt(cbb1.getSelectedIndex());

        // String variable = cbb1.getSelectedItem().toString();

        int index = cbb1.getSelectedIndex();// get index
        String St = cbb1.getSelectedItem().toString();// get value string

        // String data = "Programming language Selected: "
        // + cbb1.getItemAt(cbb1.getSelectedIndex());

        // l.setText(data1);
    }

    public void actionPerformed(ActionEvent e) {
        float amount1 = 0, amount2 = 0, amount3 = 0, amount4 = 0, amount = 0;
        String msg = "";
        if (cb1.isSelected()) {
            String data1 = "" + cbb1.getItemAt(cbb1.getSelectedIndex());
            double re = Double.parseDouble(data1);
            // l.setText(data1);
            // if(cbb1.getItemAt(cbb1.getSelectedIndex())) {
            amount1 += 100 * re;
            msg = "Pizza: 100 x " + re + " = " + amount1 + "\n";
        }
        if (cb2.isSelected()) {
            String data2 = "" + cbb2.getItemAt(cbb2.getSelectedIndex());
            double re2 = Double.parseDouble(data2);
            // l.setText(data2);
            amount2 += 30 * re2;
            msg += "Burger x " + re2 + " = " + amount2 + "\n";
        }
        if (cb3.isSelected()) {
            String data3 = "" + cbb3.getItemAt(cbb3.getSelectedIndex());
            double re3 = Double.parseDouble(data3);
            // l.setText(data3);
            amount3 += 10 * re3;
            msg += "Tea x " + re3 + " = " + amount3 + "\n";
        }
        if (cb4.isSelected()) {
            String data4 = "" + cbb4.getItemAt(cbb4.getSelectedIndex());
            double re4 = Double.parseDouble(data4);
            // l.setText(data4);
            amount4 += 5 * re4;
            msg += "Milk x " + re4 + " = " + amount4 + "\n";
        }
        amount = amount1 + amount2 + amount3 + amount4;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        msg += "-----------------\n";
        // String d = now();
        LocalDateTime now = LocalDateTime.now();

        JOptionPane.showMessageDialog(this, msg + " Total: " + amount + "\n date :" + dtf.format(now));
    }

    public static void main(String[] args) {
        new baitaplamnut();
    }
}