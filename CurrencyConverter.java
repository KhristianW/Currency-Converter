import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CurrencyConverter extends JFrame implements ItemListener, ActionListener
{
    //initializes all the GUI components
    JComboBox<String> convertFrom, convertTo;
    JTextField txtFrom, txtTo;
    JButton compute, exit;
    JLabel from, to;
    JLabel lblFrom, lblTo;
    double input = 0;
    double result = 0;

    public CurrencyConverter() {
        //add all the GUI components
        super("Welcome to the Currency Converter.");
        setSize(430,370);
        setLayout(null);
        setLocationRelativeTo(null);
        setBackground(Color.lightGray);

        //lvlFrom and lvlTo are just the labels that appear above the drop-down list where you choose the currencies.
        lblFrom = new JLabel("From:");
        lblFrom.setBounds(30,45,250,30);
        lblFrom.setForeground(Color.RED);
        add(lblFrom);

        lblTo = new JLabel("To:");
        lblTo.setBounds(230,45,250,30);
        lblTo.setForeground(Color.RED);
        add(lblTo);

        //convertFrom is a JComboBox or a drop-down list where the user can choose which currency to convert from
        convertFrom = new JComboBox<>();
        convertFrom.setBounds(30,70,150,30);
        convertFrom.addItem("US Dollar");
        convertFrom.addItem("Philippine Peso");
        convertFrom.addItem("Japan Yen");
        convertFrom.addItem("Euro");
        convertFrom.addItem("South Korean Won");
        convertFrom.addItem("Pound Sterling");
        add(convertFrom);

        //convertTo is pretty much identical to convertFrom, but you choose what currency to convert to.
        convertTo = new JComboBox<>();
        convertTo.setBounds(230,70,150,30);
        convertTo.addItem("US Dollar");
        convertTo.addItem("Philippine Peso");
        convertTo.addItem("Japan Yen");
        convertTo.addItem("Euro");
        convertTo.addItem("South Korean Won");
        convertTo.addItem("Pound Sterling");
        add(convertTo);

        //from is the label that asks you how much you want to convert.
        //to is the label that tells you how much was converted.
        from = new JLabel("Enter Amount to Convert:");
        from.setBounds(50,110,300,30);
        add(from);

        to = new JLabel("Total Amount Converted:");
        to.setBounds(50,170,300,30);
        add(to);

        //txtFrom is the text field where you enter the amount you want to convert.
        //txtTo is the text field that tells you how the amount converted.
        txtFrom = new JTextField(15);
        txtFrom.setBounds(50,140,300,30);
        add(txtFrom);

        txtTo = new JTextField(15);
        txtTo.setBounds(50,200,300,30);
        txtTo.setEditable(false);
        txtTo.setForeground(Color.RED);
        add(txtTo);

        //compute and exit are just buttons you press to either compute the conversion or exit the program.
        compute = new JButton("Compute");
        compute.setBounds(100,250,100,30);
        add(compute);

        exit = new JButton("Exit");
        exit.setBounds(210,250,100,30);
        add(exit);

        //register all the GUI components that will listen or invoke the methods
        convertFrom.addItemListener(this);
        convertTo.addItemListener(this);
        compute.addActionListener(this);
        txtFrom.addActionListener(this);
        exit.addActionListener(this);

        //this will close the window if the user clicked the exit button
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                exit();
            }
        });
    }
    //the exit method
    public void exit()
    {
        setVisible(false);
        dispose();
        System.exit(0);
    }
    //show or make the window frame visible
    public static void main(String[] args)
    {
        CurrencyConverter w = new CurrencyConverter();
        w.setVisible(true);
    }

    //method that converts the U.S. Dollar to the other currencies.
    public void ConvertDollar()
    {
        if(convertTo.getSelectedItem() == "US Dollar")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem() == "Philippine Peso")
        {
            result = (input * 56.08);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem() == "Japan Yen")
        {
            result = (input * 139.72);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem() == "Euro")
        {
            result = (input * .93);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem() == "South Korean Won")
        {
            result = (input * 1286.13);
            txtTo.setText(""+result);
        }
        else
        {
            result = (input * 0.80);
            txtTo.setText(""+result);
        }
    }

    //method that converts the Philippine Peso to the other currencies.
    public void ConvertPeso()
    {
        if(convertTo.getSelectedItem() == "US Dollar")
        {
            result = (input * 0.018);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem() == "Philippine Peso")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem() == "Japan Yen")
        {
            result = (input * 2.49);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem() == "Euro")
        {
            result = (input * 0.017);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem() == "South Korean Won")
        {
            result = (input * 22.93);
            txtTo.setText(""+result);
        }
        else
        {
            result = (input * 0.014);
            txtTo.setText(""+result);
        }
    }

    //method that converts the Japanese Yen to the other currencies.
    public void ConvertYen()
    {
        if(convertTo.getSelectedItem() == "US Dollar")
        {
            result = (input * 0.0072);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem() == "Philippine Peso")
        {
            result = (input * 0.40);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem() == "Japan Yen")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem() == "Euro")
        {
            result = (input * 0.0067);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem() == "South Korean Won")
        {
            result = (input * 9.20);
            txtTo.setText(""+result);
        }
        else
        {
            result = (input * 0.0057);
            txtTo.setText(""+result);
        }
    }

    //method that converts the Euro to the other currencies.
    public void ConvertEuro()
    {
        if(convertTo.getSelectedItem() == "US Dollar")
        {
            result = (input * 1.07);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem() == "Philippine Peso")
        {
            result = (input * 60.26);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem() == "Japan Yen")
        {
            result = (input * 150.15);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem() == "Euro")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem() == "South Korean Won")
        {
            result = (input * 1382.01);
            txtTo.setText(""+result);
        }
        else
        {
            result = (input * 0.86);
            txtTo.setText(""+result);
        }
    }

    //method that converts the Korean Won to the other currencies.
    public void ConvertKoreanWon()
    {
        if(convertTo.getSelectedItem() == "US Dollar")
        {
            result = (input * 0.00078);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem() == "Philippine Peso")
        {
            result = (input * 0.044);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem() == "Japanese Yen")
        {
            result = (input * 0.11);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem() == "Euro")
        {
            result = (input * 0.00072);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem() == "South Korean Won")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else
        {
            result = (input * 0.0000062);
            txtTo.setText(""+result);
        }
    }

    //method that converts the British Pound to the other currencies.
    public void ConvertBritishPound()
    {
        if(convertTo.getSelectedItem() == "US Dollar")
        {
            result = (input * 1.25);
            txtTo.setText("" + result);
        }
        else if(convertTo.getSelectedItem() == "Philippine Peso")
        {
            result = (input * 70.06);
            txtTo.setText("" + result);
        }
        else if(convertTo.getSelectedItem() == "Japanese Yen")
        {
            result = (input * 174.60);
            txtTo.setText("" + result);
        }
        else if(convertTo.getSelectedItem() == "Euro")
        {
            result = (input * 1.16);
            txtTo.setText("" + result);
        }
        else if(convertTo.getSelectedItem() == "South Korean Won")
        {
            result = (input * 1606.94);
            txtTo.setText("" + result);
        }
        else
        {
            result = (input);
            txtTo.setText("" + result);
        }
    }

    //method to get which button the user has selected.
    public void actionPerformed(ActionEvent e)
    {
        input = Double.parseDouble(txtFrom.getText());

        if(e.getSource() == compute)
        {
            if(convertFrom.getSelectedItem() == "US Dollar")
            {
                ConvertDollar();
            }
            else if(convertFrom.getSelectedItem() == "Philippine Peso")
            {
                ConvertPeso();
            }
            else if(convertFrom.getSelectedItem() == "Japan Yen")
            {
                ConvertYen();
            }
            else if(convertFrom.getSelectedItem() == "Euro")
            {
                ConvertEuro();
            }
            else if(convertFrom.getSelectedItem() == "South Korean Won")
            {
                ConvertKoreanWon();
            }
            else
            {
                ConvertBritishPound();
            }

        }
        //this will ask the user to exit or not
        else
        {
            //this will display a confirm dialog box
            int choice = JOptionPane.showConfirmDialog(null,"Do you really want to quit?","Exit",JOptionPane.YES_NO_OPTION);
            if(choice==0) {
                dispose();
                System.exit(0);
            }
        }
    }

    public void itemStateChanged(ItemEvent e)
    {

    }
}
