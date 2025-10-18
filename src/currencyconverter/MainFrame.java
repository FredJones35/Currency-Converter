package currencyconverter;

import javax.swing.*;

public class MainFrame extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainFrame.class.getName());


    public MainFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        convertFromTextField = new javax.swing.JTextField();
        convertFromComboBox = new javax.swing.JComboBox<>();
        convertToTextField = new javax.swing.JTextField();
        convertToComboBox = new javax.swing.JComboBox<>();
        convertButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("mainFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(290, 255));
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon img = new ImageIcon("C:\\Users\\ernkr\\IdeaProjects\\CurrencyConverter\\src\\currencyconverter\\Frame_Icon.png");
        setIconImage(img.getImage());

        mainPanel.setName("mainPanel"); // NOI18N
        mainPanel.setPreferredSize(new java.awt.Dimension(270, 230));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("CURRENCY CONVERTER");
        titleLabel.setName("titleLabel"); // NOI18N
        mainPanel.add(titleLabel);

        convertFromTextField.setText("Enter_amount");
        convertFromTextField.setName("convertFromTextField"); // NOI18N
        convertFromTextField.setPreferredSize(new java.awt.Dimension(90, 25));
        convertFromTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                convertFromTextFieldKeyTyped(evt);
            }
        });
        mainPanel.add(convertFromTextField);

        convertFromComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD","EUR","JPY","GBP","AUD","CAD","CHF","CNY","HKD","NZD","SEK","KRW","SGD","NOK","MXN","INR","RUB","ZAR","TRY","BRL","TWD","DKK","PLN","THB","IDR","HUF","CZK","ILS","CLP","PHP","AED","COP","SAR","MYR","RON","VND","PKR","BDT","NGN","KES","EGP","QAR","KWD","BHD","OMR","LKR","MMK","UAH","MAD","ARS","PEN","DZD","JOD","IRR","IQD","TND","ETB","UGX","GHS","XOF","XAF","XPF","BGN","HRK","ISK","RSD","MKD","GEL","AMD","AZN","BYN","KZT","MNT","LAK","NPR","MOP","BOB","PYG","UYU","CRC","GTQ","HNL","NIO","SVC","JMD","BBD","TTD","BSD","KYD","BZD","FJD","PGK","WST","TOP","VUV","SCR","MUR","MVR","LSL","SZL","BWP","NAD","ZMW","MWK","XCD","TZS"
        }));
        convertFromComboBox.setName("convertFromComboBox"); // NOI18N
        convertFromComboBox.setPreferredSize(new java.awt.Dimension(75, 25));
        mainPanel.add(convertFromComboBox);

        convertToTextField.setEditable(false);
        convertToTextField.setText("Converted amount");
        convertToTextField.setName("convertToTextField"); // NOI18N
        convertToTextField.setPreferredSize(new java.awt.Dimension(115, 25));
        mainPanel.add(convertToTextField);

        convertToComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD","EUR","JPY","GBP","AUD","CAD","CHF","CNY","HKD","NZD","SEK","KRW","SGD","NOK","MXN","INR","RUB","ZAR","TRY","BRL","TWD","DKK","PLN","THB","IDR","HUF","CZK","ILS","CLP","PHP","AED","COP","SAR","MYR","RON","VND","PKR","BDT","NGN","KES","EGP","QAR","KWD","BHD","OMR","LKR","MMK","UAH","MAD","ARS","PEN","DZD","JOD","IRR","IQD","TND","ETB","UGX","GHS","XOF","XAF","XPF","BGN","HRK","ISK","RSD","MKD","GEL","AMD","AZN","BYN","KZT","MNT","LAK","NPR","MOP","BOB","PYG","UYU","CRC","GTQ","HNL","NIO","SVC","JMD","BBD","TTD","BSD","KYD","BZD","FJD","PGK","WST","TOP","VUV","SCR","MUR","MVR","LSL","SZL","BWP","NAD","ZMW","MWK","XCD","TZS"
        }));
        convertToComboBox.setName("convertToComboBox"); // NOI18N
        convertToComboBox.setPreferredSize(new java.awt.Dimension(75, 25));
        mainPanel.add(convertToComboBox);

        convertButton.setText("Convert");
        convertButton.setName("convertButton"); // NOI18N
        convertButton.setPreferredSize(new java.awt.Dimension(100, 30));
        convertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButtonActionPerformed(evt);
            }
        });
        mainPanel.add(convertButton);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private void convertFromTextFieldKeyTyped(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if(!Character.isDigit(c) && c != '.') {
            evt.consume();
        }

    }
    private void convertButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String text = convertFromTextField.getText();
        Double valF = Double.valueOf(text); //get amount

        int currencyT = convertToComboBox.getSelectedIndex();
        Currency ct = Converter.intToCurr(currencyT); //get currency and convert to enum

        int currencyf = convertFromComboBox.getSelectedIndex();
        Currency cf = Converter.intToCurr(currencyf); //get currency and convert to enum

        Double convertedVal = Converter.convert(valF, cf, ct);
        text = String.format("%.4f",convertedVal);//convertedVal.toString();
        convertToTextField.setText(text);
    }


    // Variables declaration - do not modify
    private javax.swing.JButton convertButton;
    private javax.swing.JComboBox<String> convertFromComboBox;
    private javax.swing.JTextField convertFromTextField;
    private javax.swing.JComboBox<String> convertToComboBox;
    private javax.swing.JTextField convertToTextField;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration
}
