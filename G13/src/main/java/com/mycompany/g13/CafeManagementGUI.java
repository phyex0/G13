package com.mycompany.g13;

import static com.mycompany.g13.SystemClass.*;
import static com.mycompany.g13.kasayikapat.collectedData;
import com.mycompany.g13.repository.ClientRepository;
import com.mycompany.g13.Model.Client;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


@SpringBootApplication
public class CafeManagementGUI extends javax.swing.JFrame{
    //succes or failed messages come with error JFrame
   public static JFrame error;
   String order_Text = "";
   ArrayList<JCheckBox> checkboxes = new ArrayList<JCheckBox>();
   
   
   



    /**
     * Creates new form CafeManagementGUI
     */
    public CafeManagementGUI() {
        initComponents();
        setAllDefault();
        order.setText(SystemClass.displayOrder(givenOrder));
        calculation.setText(SystemClass.displayCalculation());

        kucuk.setActionCommand("Küçük,0");
        orta.setActionCommand("Orta,2");
        buyuk.setActionCommand("Büyük,3");
        yagli.setActionCommand("Yağlı,0");
        yagsiz.setActionCommand("Yağsız,0");
        yarimyagli.setActionCommand("Yarım Yağlı,0");
        laktozsuz.setActionCommand("Laktozsuz,2");
        bademsutu.setActionCommand("Badem Sütlü,2");
        soyasutu.setActionCommand("Soya Sütlü,2");
        
        buttonGroup1.add(kucuk);
        buttonGroup1.add(orta);
        buttonGroup1.add(buyuk);
        buttonGroup2.add(yagli);
        buttonGroup2.add(yagsiz);
        buttonGroup2.add(yarimyagli);
        buttonGroup2.add(laktozsuz);
        buttonGroup2.add(bademsutu);
        buttonGroup2.add(soyasutu);
        


        karamel.setActionCommand("Karamelli,2");
        cikolata.setActionCommand("Çikolatalı,2");
        beyazcikolata.setActionCommand("Beyaz Çikolatalı,2");
        hindistancevizi.setActionCommand("Hindistan Cevizli,2");
        vanilya.setActionCommand("Vanilyalı,2");
        findik.setActionCommand("Findikli,2");
        cilek.setActionCommand("Çilekli,2");
        ahududu.setActionCommand("Ahududulu,2");
        
        checkboxes.add(karamel);
        checkboxes.add(cikolata);
        checkboxes.add(beyazcikolata);
        checkboxes.add(hindistancevizi);
        checkboxes.add(vanilya);
        checkboxes.add(findik);
        checkboxes.add(cilek);
        checkboxes.add(ahududu);
        
        
      
    }
    
    public void setAllDefault()
    {
        size.setEnabled(false);
        milk.setEnabled(false);
        syrup.setEnabled(false);
        
        kucuk.setSelected(true);
        yagli.setSelected(true);
        karamel.setSelected(false);
        cikolata.setSelected(false);
        beyazcikolata.setSelected(false);
        hindistancevizi.setSelected(false);
        vanilya.setSelected(false);
        findik.setSelected(false);
        cilek.setSelected(false);
        ahududu.setSelected(false);
    }
   
    
    public void actionPerformed(Products product)
    {
        
        if(givenOrder.isEmpty() || (!(SystemClass.isMatched("Espresso")) && !(SystemClass.isMatched("Frappucino")) && !(SystemClass.isMatched("Çay"))))
        {
            product.calculate_and_add();
            order.setText(SystemClass.displayOrder(givenOrder));
            calculation.setText(SystemClass.displayCalculation());
            setAllDefault();
        }
        
    }
    
    public void menuchange(JPanel panel)
    {  
        jLayeredPane1.removeAll();
        jLayeredPane1.add(panel);
        jLayeredPane1.repaint();
        jLayeredPane1.validate();   
    }
    public void menuchangefood(JPanel panel)
    {
    
        panefood.removeAll();
        panefood.add(panel);
        panefood.repaint();
        panefood.validate();
    }
    
    public void LayeredPanelChange(JLayeredPane panel){
        jLayeredPane1.removeAll();
        jLayeredPane1.add(panel);
        jLayeredPane1.repaint();
        jLayeredPane1.validate();   
    }
    public void menuchangedrink(JPanel panel)
    {
    
        panedrink.removeAll();
        panedrink.add(panel);
        panedrink.repaint();
        panedrink.validate();
    }
    
    public static void packedcafchange(JPanel panel){
    
        girispan.removeAll();
        girispan.add(panel);
        girispan.repaint();
        girispan.validate();
    
    
    }
    
    public void filterpan(JPanel panel){
    
        paketkahvepan.removeAll();
        paketkahvepan.add(panel);
        paketkahvepan.repaint();
        paketkahvepan.validate();
    
    
    
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        MainPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        girispan = new javax.swing.JLayeredPane();
        buttonpan = new javax.swing.JPanel();
        uyeg = new javax.swing.JButton();
        yenig = new javax.swing.JButton();
        userpan = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        userData = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        order = new java.awt.TextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        siparisreset = new javax.swing.JButton();
        yenisiparis = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jButton104 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        calculation = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        kahvelerb = new javax.swing.JButton();
        yiyecekb = new javax.swing.JButton();
        icecekb = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        hediyelik = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton_Kupa = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        panefood = new javax.swing.JLayeredPane();
        sandavic = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        bpasta = new javax.swing.JButton();
        bsandavic = new javax.swing.JButton();
        bkurabiye = new javax.swing.JButton();
        bsalata = new javax.swing.JButton();
        jButton_ReyhanliTost = new javax.swing.JButton();
        jButton_Fiesta = new javax.swing.JButton();
        jButton_EzineliSandvic = new javax.swing.JButton();
        jButton_MozarellaSandvic = new javax.swing.JButton();
        kurabiye = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButton49 = new javax.swing.JButton();
        jButton_MistoCookie = new javax.swing.JButton();
        jButton_DopdoluFitCookie = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        bpasta1 = new javax.swing.JButton();
        bsandavic1 = new javax.swing.JButton();
        bkurabiye4 = new javax.swing.JButton();
        bsalata1 = new javax.swing.JButton();
        pasta = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jButton_BrownieCheesecake = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        bpasta2 = new javax.swing.JButton();
        bsandavic2 = new javax.swing.JButton();
        bkurabiye2 = new javax.swing.JButton();
        bsalata2 = new javax.swing.JButton();
        jButton_KremalıHavucluKek = new javax.swing.JButton();
        jButton_LimonluCheesecake = new javax.swing.JButton();
        jButton_ProfiterolluPasta = new javax.swing.JButton();
        salata = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        bpasta3 = new javax.swing.JButton();
        bsandavic3 = new javax.swing.JButton();
        bkurabiye3 = new javax.swing.JButton();
        bsalata3 = new javax.swing.JButton();
        jButton_KinoalıSalata = new javax.swing.JButton();
        jButton_IzgaraTavukluSalata = new javax.swing.JButton();
        jButton_MeyveliveYogurtluParfe = new javax.swing.JButton();
        jButton_AnanaslıChiaPuding = new javax.swing.JButton();
        panedrink = new javax.swing.JLayeredPane();
        panespresso = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        panfrapp = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jButton59 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        pancay = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        panturkkahve = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        pansise = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        jButton101 = new javax.swing.JButton();
        jButton102 = new javax.swing.JButton();
        jButton103 = new javax.swing.JButton();
        paketkahvepan = new javax.swing.JLayeredPane();
        allpan = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton105 = new javax.swing.JButton();
        jButton106 = new javax.swing.JButton();
        jButton107 = new javax.swing.JButton();
        jButton108 = new javax.swing.JButton();
        jButton109 = new javax.swing.JButton();
        blondepan = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton115 = new javax.swing.JButton();
        jButton116 = new javax.swing.JButton();
        mediumpan = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jButton110 = new javax.swing.JButton();
        jButton111 = new javax.swing.JButton();
        jButton112 = new javax.swing.JButton();
        jButton113 = new javax.swing.JButton();
        jButton114 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton44 = new javax.swing.JButton();
        darkpan = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jButton117 = new javax.swing.JButton();
        jButton118 = new javax.swing.JButton();
        jButton119 = new javax.swing.JButton();
        jButton120 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        kucuk = new javax.swing.JRadioButton();
        orta = new javax.swing.JRadioButton();
        buyuk = new javax.swing.JRadioButton();
        size = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        yagli = new javax.swing.JRadioButton();
        yagsiz = new javax.swing.JRadioButton();
        yarimyagli = new javax.swing.JRadioButton();
        laktozsuz = new javax.swing.JRadioButton();
        bademsutu = new javax.swing.JRadioButton();
        soyasutu = new javax.swing.JRadioButton();
        milk = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        karamel = new javax.swing.JCheckBox();
        cikolata = new javax.swing.JCheckBox();
        beyazcikolata = new javax.swing.JCheckBox();
        hindistancevizi = new javax.swing.JCheckBox();
        vanilya = new javax.swing.JCheckBox();
        findik = new javax.swing.JCheckBox();
        cilek = new javax.swing.JCheckBox();
        ahududu = new javax.swing.JCheckBox();
        syrup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("G13 - COSMIC COFFEE CO");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        MainPanel.setBackground(new java.awt.Color(249, 244, 244));
        MainPanel.setForeground(new java.awt.Color(249, 244, 244));
        MainPanel.setPreferredSize(new java.awt.Dimension(1318, 830));

        jPanel1.setBackground(new java.awt.Color(249, 244, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(0, 102, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText(" ★\n➜Yapmış olduğunuz her \nalışverişin %10u kadar yıldız\nkazanırsınız\n");
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(0, 102, 51));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("20 ★\n➜Yiyecek bölümünden\nsatın alındığında");
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(0, 102, 51));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setText("50 ★\n➜Paketli Çekirdek Kahve \nalımında");
        jScrollPane4.setViewportView(jTextArea4);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(0, 102, 51));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setText("100  ★\n➜Hediyelik bölümünden ürün \nalındığında");
        jScrollPane3.setViewportView(jTextArea3);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 102, 51));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("ÖDÜLLER");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        jLabel4.setToolTipText("");

        girispan.setLayout(new java.awt.CardLayout());

        buttonpan.setBackground(new java.awt.Color(247, 242, 242));

        uyeg.setBackground(new java.awt.Color(102, 51, 255));
        uyeg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        uyeg.setForeground(new java.awt.Color(255, 255, 255));
        uyeg.setText("Üye girişi");
        uyeg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyegActionPerformed(evt);
            }
        });

        yenig.setBackground(new java.awt.Color(102, 51, 255));
        yenig.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yenig.setForeground(new java.awt.Color(255, 255, 255));
        yenig.setText("Yeni Üye");
        yenig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yenigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonpanLayout = new javax.swing.GroupLayout(buttonpan);
        buttonpan.setLayout(buttonpanLayout);
        buttonpanLayout.setHorizontalGroup(
            buttonpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonpanLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(buttonpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(yenig, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uyeg, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        buttonpanLayout.setVerticalGroup(
            buttonpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonpanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(yenig, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uyeg, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        girispan.add(buttonpan, "card3");

        userpan.setBackground(new java.awt.Color(247, 242, 242));
        userpan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel28.setBackground(new java.awt.Color(247, 242, 242));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/user.png"))); // NOI18N

        userData.setEditable(false);
        userData.setColumns(20);
        userData.setLineWrap(true);
        userData.setRows(2);
        userData.setTabSize(2);
        jScrollPane5.setViewportView(userData);

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addContainerGap())
        );

        userpan.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, -1));

        girispan.add(userpan, "card2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4)
                    .addComponent(jTextField1)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(girispan))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(girispan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jPanel2.setBackground(new java.awt.Color(249, 244, 244));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        order.setBackground(new java.awt.Color(253, 253, 235));
        order.setEditable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ara Toplam:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Vergi:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("TOPLAM TUTAR");

        siparisreset.setBackground(new java.awt.Color(255, 51, 51));
        siparisreset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        siparisreset.setForeground(new java.awt.Color(255, 255, 255));
        siparisreset.setText("TEMİZLE");
        siparisreset.setActionCommand("SİPARİŞİ TEMİZLE");
        siparisreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siparisresetActionPerformed(evt);
            }
        });

        yenisiparis.setBackground(new java.awt.Color(0, 153, 51));
        yenisiparis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yenisiparis.setForeground(new java.awt.Color(255, 255, 255));
        yenisiparis.setText("YENİ SİPARİŞ");
        yenisiparis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yenisiparisActionPerformed(evt);
            }
        });

        jScrollPane6.setBackground(new java.awt.Color(232, 230, 191));
        jScrollPane6.setForeground(new java.awt.Color(232, 230, 191));

        jTextArea6.setEditable(false);
        jTextArea6.setBackground(new java.awt.Color(232, 230, 191));
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Impact", 1, 28)); // NOI18N
        jTextArea6.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea6.setLineWrap(true);
        jTextArea6.setRows(1);
        jTextArea6.setTabSize(0);
        jTextArea6.setBorder(null);
        jTextArea6.setCaretColor(new java.awt.Color(232, 230, 191));
        jTextArea6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea6.setMargin(new java.awt.Insets(20, 20, 20, 20));
        jScrollPane6.setViewportView(jTextArea6);

        jButton104.setBackground(new java.awt.Color(255, 51, 51));
        jButton104.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton104.setForeground(new java.awt.Color(255, 255, 255));
        jButton104.setText("sil ×");
        jButton104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton104ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/star-menub.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(3, 115, 115));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("ÖDEME YAP");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/time.png"))); // NOI18N

        jButton4.setBackground(new java.awt.Color(0, 102, 51));
        jButton4.setForeground(new java.awt.Color(249, 244, 244));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lock.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        calculation.setEditable(false);
        calculation.setColumns(20);
        calculation.setLineWrap(true);
        calculation.setRows(5);
        jScrollPane7.setViewportView(calculation);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/github.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton104, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                .addComponent(siparisreset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(yenisiparis)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
                            .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton104)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(siparisreset, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(yenisiparis, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(82, 82, 82))
        );

        order.getAccessibleContext().setAccessibleName("");

        jPanel3.setBackground(new java.awt.Color(249, 244, 244));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("HEDİYELİK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 130, 34));

        kahvelerb.setBackground(new java.awt.Color(0, 102, 51));
        kahvelerb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        kahvelerb.setForeground(new java.awt.Color(255, 255, 255));
        kahvelerb.setText("PAKET KAHVELER");
        kahvelerb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kahvelerbActionPerformed(evt);
            }
        });
        jPanel3.add(kahvelerb, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 10, 160, 34));

        yiyecekb.setBackground(new java.awt.Color(0, 102, 51));
        yiyecekb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yiyecekb.setForeground(new java.awt.Color(255, 255, 255));
        yiyecekb.setText("YİYECEK");
        yiyecekb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yiyecekbActionPerformed(evt);
            }
        });
        jPanel3.add(yiyecekb, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 100, 34));

        icecekb.setBackground(new java.awt.Color(0, 102, 51));
        icecekb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        icecekb.setForeground(new java.awt.Color(255, 255, 255));
        icecekb.setText("İÇECEK");
        icecekb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icecekbActionPerformed(evt);
            }
        });
        jPanel3.add(icecekb, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 100, 34));

        jLayeredPane1.setBackground(new java.awt.Color(236, 231, 231));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(635, 400));
        jLayeredPane1.setLayout(new java.awt.CardLayout());

        hediyelik.setBackground(new java.awt.Color(236, 231, 231));
        hediyelik.setPreferredSize(new java.awt.Dimension(650, 400));
        hediyelik.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(236, 231, 231));
        jPanel4.setPreferredSize(new java.awt.Dimension(650, 400));

        jButton_Kupa.setBackground(new java.awt.Color(14, 30, 21));
        jButton_Kupa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Kupa.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Kupa.setText("KUPA");
        jButton_Kupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KupaActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(14, 30, 21));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("TERMOS");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Kupa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                .addContainerGap(499, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Kupa, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        hediyelik.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 400));

        jLayeredPane1.add(hediyelik, "card2");

        panefood.setMinimumSize(new java.awt.Dimension(610, 400));
        panefood.setPreferredSize(new java.awt.Dimension(635, 400));
        panefood.setLayout(new java.awt.CardLayout());

        sandavic.setBackground(new java.awt.Color(236, 231, 231));
        sandavic.setPreferredSize(new java.awt.Dimension(635, 400));
        sandavic.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(236, 231, 231));
        jPanel6.setPreferredSize(new java.awt.Dimension(650, 400));

        jPanel13.setBackground(new java.awt.Color(234, 229, 229));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bpasta.setBackground(new java.awt.Color(0, 153, 51));
        bpasta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bpasta.setForeground(new java.awt.Color(255, 255, 255));
        bpasta.setText("PASTA");
        bpasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpastaActionPerformed(evt);
            }
        });

        bsandavic.setBackground(new java.awt.Color(0, 153, 51));
        bsandavic.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bsandavic.setForeground(new java.awt.Color(255, 255, 255));
        bsandavic.setText("SANDVİÇ");
        bsandavic.setPreferredSize(new java.awt.Dimension(110, 23));
        bsandavic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsandavicActionPerformed(evt);
            }
        });

        bkurabiye.setBackground(new java.awt.Color(0, 153, 51));
        bkurabiye.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bkurabiye.setForeground(new java.awt.Color(255, 255, 255));
        bkurabiye.setText("KURABİYE");
        bkurabiye.setPreferredSize(new java.awt.Dimension(110, 23));
        bkurabiye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkurabiyeActionPerformed(evt);
            }
        });

        bsalata.setBackground(new java.awt.Color(0, 153, 51));
        bsalata.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bsalata.setForeground(new java.awt.Color(255, 255, 255));
        bsalata.setText("SALATA");
        bsalata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bsandavic, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bkurabiye, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bpasta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bsalata, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bpasta, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(bkurabiye, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(bsandavic, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(bsalata, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton_ReyhanliTost.setBackground(new java.awt.Color(14, 30, 21));
        jButton_ReyhanliTost.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_ReyhanliTost.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ReyhanliTost.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reyhanli-Peynirli-Tost_tcm95-38143_w1024_n.png"))); // NOI18N
        jButton_ReyhanliTost.setText("Reyhanlı Peynirli Tost");
        jButton_ReyhanliTost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReyhanliTostActionPerformed(evt);
            }
        });

        jButton_Fiesta.setBackground(new java.awt.Color(14, 30, 21));
        jButton_Fiesta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Fiesta.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Fiesta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fiesta_tcm95-19156_w1024_n.png"))); // NOI18N
        jButton_Fiesta.setText("Fiesta");
        jButton_Fiesta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_Fiesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FiestaActionPerformed(evt);
            }
        });

        jButton_EzineliSandvic.setBackground(new java.awt.Color(14, 30, 21));
        jButton_EzineliSandvic.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_EzineliSandvic.setForeground(new java.awt.Color(255, 255, 255));
        jButton_EzineliSandvic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ezine-Peynirli-Sandvic_tcm95-65689_w1024_n.png"))); // NOI18N
        jButton_EzineliSandvic.setText("Ezine Peynirli Sandviç");
        jButton_EzineliSandvic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_EzineliSandvicActionPerformed(evt);
            }
        });

        jButton_MozarellaSandvic.setBackground(new java.awt.Color(14, 30, 21));
        jButton_MozarellaSandvic.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_MozarellaSandvic.setForeground(new java.awt.Color(255, 255, 255));
        jButton_MozarellaSandvic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mozzarella-Sandvic_tcm95-19154_w1024_n.png"))); // NOI18N
        jButton_MozarellaSandvic.setText("Mozzarella Sandviç");
        jButton_MozarellaSandvic.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_MozarellaSandvic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MozarellaSandvicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_EzineliSandvic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_MozarellaSandvic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_Fiesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton_ReyhanliTost)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_ReyhanliTost, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton_Fiesta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_EzineliSandvic, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_MozarellaSandvic, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        sandavic.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 635, 400));

        panefood.add(sandavic, "card2");

        kurabiye.setBackground(new java.awt.Color(236, 231, 231));
        kurabiye.setMinimumSize(new java.awt.Dimension(610, 400));
        kurabiye.setPreferredSize(new java.awt.Dimension(650, 400));
        kurabiye.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(236, 231, 231));
        jPanel10.setPreferredSize(new java.awt.Dimension(650, 400));

        jButton49.setBackground(new java.awt.Color(14, 30, 21));
        jButton49.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton49.setForeground(new java.awt.Color(255, 255, 255));
        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Triple-Chocolate-Cookie_tcm95-19171_w1024_n.png"))); // NOI18N
        jButton49.setText("Triple Chocolate Cookie");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });

        jButton_MistoCookie.setBackground(new java.awt.Color(14, 30, 21));
        jButton_MistoCookie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_MistoCookie.setForeground(new java.awt.Color(255, 255, 255));
        jButton_MistoCookie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Misto-Cookie_tcm95-19172_w1024_n.png"))); // NOI18N
        jButton_MistoCookie.setText("Misto Cookie");
        jButton_MistoCookie.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_MistoCookie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MistoCookieActionPerformed(evt);
            }
        });

        jButton_DopdoluFitCookie.setBackground(new java.awt.Color(14, 30, 21));
        jButton_DopdoluFitCookie.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_DopdoluFitCookie.setForeground(new java.awt.Color(255, 255, 255));
        jButton_DopdoluFitCookie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dopdolu-Fit-Cookie_tcm95-49850_w1024_n.png"))); // NOI18N
        jButton_DopdoluFitCookie.setText("Dopdolu Fit Cookie");
        jButton_DopdoluFitCookie.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_DopdoluFitCookie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DopdoluFitCookieActionPerformed(evt);
            }
        });

        jPanel21.setBackground(new java.awt.Color(234, 229, 229));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bpasta1.setBackground(new java.awt.Color(0, 153, 51));
        bpasta1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bpasta1.setForeground(new java.awt.Color(255, 255, 255));
        bpasta1.setText("PASTA");
        bpasta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpasta1ActionPerformed(evt);
            }
        });

        bsandavic1.setBackground(new java.awt.Color(0, 153, 51));
        bsandavic1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bsandavic1.setForeground(new java.awt.Color(255, 255, 255));
        bsandavic1.setText("SANDVİÇ");
        bsandavic1.setPreferredSize(new java.awt.Dimension(110, 23));
        bsandavic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsandavic1ActionPerformed(evt);
            }
        });

        bkurabiye4.setBackground(new java.awt.Color(0, 153, 51));
        bkurabiye4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bkurabiye4.setForeground(new java.awt.Color(255, 255, 255));
        bkurabiye4.setText("KURABİYE");
        bkurabiye4.setPreferredSize(new java.awt.Dimension(110, 23));
        bkurabiye4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkurabiye4ActionPerformed(evt);
            }
        });

        bsalata1.setBackground(new java.awt.Color(0, 153, 51));
        bsalata1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bsalata1.setForeground(new java.awt.Color(255, 255, 255));
        bsalata1.setText("SALATA");
        bsalata1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalata1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bsandavic1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bkurabiye4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bpasta1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bsalata1, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bpasta1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(bkurabiye4, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(bsandavic1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(bsalata1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_MistoCookie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_DopdoluFitCookie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 386, Short.MAX_VALUE))
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_MistoCookie, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_DopdoluFitCookie, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        kurabiye.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 635, 400));

        panefood.add(kurabiye, "card3");

        pasta.setBackground(new java.awt.Color(236, 231, 231));
        pasta.setMinimumSize(new java.awt.Dimension(560, 400));
        pasta.setPreferredSize(new java.awt.Dimension(650, 400));
        pasta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(236, 231, 231));
        jPanel11.setPreferredSize(new java.awt.Dimension(635, 400));

        jButton_BrownieCheesecake.setBackground(new java.awt.Color(14, 30, 21));
        jButton_BrownieCheesecake.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_BrownieCheesecake.setForeground(new java.awt.Color(255, 255, 255));
        jButton_BrownieCheesecake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Brownie-Cheesecake_tcm95-19177_w1024_n.png"))); // NOI18N
        jButton_BrownieCheesecake.setText("Brownie Cheesecake");
        jButton_BrownieCheesecake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BrownieCheesecakeActionPerformed(evt);
            }
        });

        jPanel15.setBackground(new java.awt.Color(234, 229, 229));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bpasta2.setBackground(new java.awt.Color(0, 153, 51));
        bpasta2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bpasta2.setForeground(new java.awt.Color(255, 255, 255));
        bpasta2.setText("PASTA");
        bpasta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpasta2ActionPerformed(evt);
            }
        });

        bsandavic2.setBackground(new java.awt.Color(0, 153, 51));
        bsandavic2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bsandavic2.setForeground(new java.awt.Color(255, 255, 255));
        bsandavic2.setText("SANDVİÇ");
        bsandavic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsandavic2ActionPerformed(evt);
            }
        });

        bkurabiye2.setBackground(new java.awt.Color(0, 153, 51));
        bkurabiye2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bkurabiye2.setForeground(new java.awt.Color(255, 255, 255));
        bkurabiye2.setText("KURABİYE");
        bkurabiye2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkurabiye2ActionPerformed(evt);
            }
        });

        bsalata2.setBackground(new java.awt.Color(0, 153, 51));
        bsalata2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bsalata2.setForeground(new java.awt.Color(255, 255, 255));
        bsalata2.setText("SALATA");
        bsalata2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalata2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bsandavic2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bkurabiye2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bpasta2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bsalata2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bpasta2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(bkurabiye2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(bsandavic2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(bsalata2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton_KremalıHavucluKek.setBackground(new java.awt.Color(14, 30, 21));
        jButton_KremalıHavucluKek.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_KremalıHavucluKek.setForeground(new java.awt.Color(255, 255, 255));
        jButton_KremalıHavucluKek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kremali-Havuclu-Kek_tcm95-56052_w1024_n.png"))); // NOI18N
        jButton_KremalıHavucluKek.setText("Kremalı Havuçlu Kek");
        jButton_KremalıHavucluKek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KremalıHavucluKekActionPerformed(evt);
            }
        });

        jButton_LimonluCheesecake.setBackground(new java.awt.Color(14, 30, 21));
        jButton_LimonluCheesecake.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_LimonluCheesecake.setForeground(new java.awt.Color(255, 255, 255));
        jButton_LimonluCheesecake.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Limonlu-Cheesecake_tcm95-19178_w1024_n.png"))); // NOI18N
        jButton_LimonluCheesecake.setText("Limonlu Cheesecake");
        jButton_LimonluCheesecake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LimonluCheesecakeActionPerformed(evt);
            }
        });

        jButton_ProfiterolluPasta.setBackground(new java.awt.Color(14, 30, 21));
        jButton_ProfiterolluPasta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_ProfiterolluPasta.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ProfiterolluPasta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Profiterollu-Pasta_tcm95-59589_w1024_n.png"))); // NOI18N
        jButton_ProfiterolluPasta.setText("Profiterollü Pasta");
        jButton_ProfiterolluPasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ProfiterolluPastaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_BrownieCheesecake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_LimonluCheesecake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_KremalıHavucluKek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_ProfiterolluPasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 177, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_BrownieCheesecake, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_KremalıHavucluKek, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_LimonluCheesecake, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ProfiterolluPasta, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pasta.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));

        panefood.add(pasta, "card4");

        salata.setBackground(new java.awt.Color(236, 231, 231));
        salata.setMinimumSize(new java.awt.Dimension(610, 400));
        salata.setPreferredSize(new java.awt.Dimension(650, 400));
        salata.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(236, 231, 231));
        jPanel12.setPreferredSize(new java.awt.Dimension(650, 400));

        jPanel16.setBackground(new java.awt.Color(234, 229, 229));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bpasta3.setBackground(new java.awt.Color(0, 153, 51));
        bpasta3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bpasta3.setForeground(new java.awt.Color(255, 255, 255));
        bpasta3.setText("PASTA");
        bpasta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpasta3ActionPerformed(evt);
            }
        });

        bsandavic3.setBackground(new java.awt.Color(0, 153, 51));
        bsandavic3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bsandavic3.setForeground(new java.awt.Color(255, 255, 255));
        bsandavic3.setText("SANDVİÇ");
        bsandavic3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsandavic3ActionPerformed(evt);
            }
        });

        bkurabiye3.setBackground(new java.awt.Color(0, 153, 51));
        bkurabiye3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bkurabiye3.setForeground(new java.awt.Color(255, 255, 255));
        bkurabiye3.setText("KURABİYE");
        bkurabiye3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkurabiye3ActionPerformed(evt);
            }
        });

        bsalata3.setBackground(new java.awt.Color(0, 153, 51));
        bsalata3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bsalata3.setForeground(new java.awt.Color(255, 255, 255));
        bsalata3.setText("SALATA");
        bsalata3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalata3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bsandavic3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bkurabiye3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bpasta3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bsalata3, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bpasta3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(bkurabiye3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(bsandavic3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(bsalata3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton_KinoalıSalata.setBackground(new java.awt.Color(14, 30, 21));
        jButton_KinoalıSalata.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_KinoalıSalata.setForeground(new java.awt.Color(255, 255, 255));
        jButton_KinoalıSalata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Kinoali-Salata_tcm95-59737_w1024_n.png"))); // NOI18N
        jButton_KinoalıSalata.setText("Kinoalı Salata");
        jButton_KinoalıSalata.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_KinoalıSalata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KinoalıSalataActionPerformed(evt);
            }
        });

        jButton_IzgaraTavukluSalata.setBackground(new java.awt.Color(14, 30, 21));
        jButton_IzgaraTavukluSalata.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_IzgaraTavukluSalata.setForeground(new java.awt.Color(255, 255, 255));
        jButton_IzgaraTavukluSalata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Izgara-Tavuklu-Salata_tcm95-49795_w1024_n.png"))); // NOI18N
        jButton_IzgaraTavukluSalata.setText("Izgara Tavuklu Salata");
        jButton_IzgaraTavukluSalata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_IzgaraTavukluSalataActionPerformed(evt);
            }
        });

        jButton_MeyveliveYogurtluParfe.setBackground(new java.awt.Color(14, 30, 21));
        jButton_MeyveliveYogurtluParfe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_MeyveliveYogurtluParfe.setForeground(new java.awt.Color(255, 255, 255));
        jButton_MeyveliveYogurtluParfe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Meyveli-ve-Yogurtlu-Parfe_tcm95-65729_w1024_n.png"))); // NOI18N
        jButton_MeyveliveYogurtluParfe.setText("Meyveli ve Yoğurtlu Parfe");
        jButton_MeyveliveYogurtluParfe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_MeyveliveYogurtluParfeActionPerformed(evt);
            }
        });

        jButton_AnanaslıChiaPuding.setBackground(new java.awt.Color(14, 30, 21));
        jButton_AnanaslıChiaPuding.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_AnanaslıChiaPuding.setForeground(new java.awt.Color(255, 255, 255));
        jButton_AnanaslıChiaPuding.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ananasli-Chia-Puding_tcm95-66286_w1024_n.png"))); // NOI18N
        jButton_AnanaslıChiaPuding.setText("Ananaslı Chia Puding");
        jButton_AnanaslıChiaPuding.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton_AnanaslıChiaPuding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AnanaslıChiaPudingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_IzgaraTavukluSalata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_KinoalıSalata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_MeyveliveYogurtluParfe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_AnanaslıChiaPuding, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_KinoalıSalata, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_MeyveliveYogurtluParfe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_IzgaraTavukluSalata, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_AnanaslıChiaPuding, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        salata.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 635, 400));

        panefood.add(salata, "card5");

        jLayeredPane1.add(panefood, "card6");

        panedrink.setPreferredSize(new java.awt.Dimension(635, 400));
        panedrink.setLayout(new java.awt.CardLayout());

        panespresso.setBackground(new java.awt.Color(236, 231, 231));
        panespresso.setPreferredSize(new java.awt.Dimension(635, 400));
        panespresso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(236, 231, 231));
        jPanel22.setMinimumSize(new java.awt.Dimension(660, 400));
        jPanel22.setPreferredSize(new java.awt.Dimension(635, 400));

        jButton35.setBackground(new java.awt.Color(14, 30, 21));
        jButton35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gingerbread-latte_tcm95-66840_w1024_n.png"))); // NOI18N
        jButton35.setText("Gingerbread Latte");
        jButton35.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setBackground(new java.awt.Color(14, 30, 21));
        jButton36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton36.setForeground(new java.awt.Color(255, 255, 255));
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toffeeNutLattee50px.png"))); // NOI18N
        jButton36.setText("Toffee Nut Latte");
        jButton36.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton36.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setBackground(new java.awt.Color(14, 30, 21));
        jButton37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton37.setForeground(new java.awt.Color(255, 255, 255));
        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caffe-latte_tcm95-64101_w1024_n.png"))); // NOI18N
        jButton37.setText("Caffè Latte");
        jButton37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton37.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton37.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });

        jButton38.setBackground(new java.awt.Color(14, 30, 21));
        jButton38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton38.setForeground(new java.awt.Color(255, 255, 255));
        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flat-white_tcm95-64105_w1024_n.png"))); // NOI18N
        jButton38.setText("Flat White");
        jButton38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton38.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setBackground(new java.awt.Color(14, 30, 21));
        jButton39.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton39.setForeground(new java.awt.Color(255, 255, 255));
        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caffe-mocha_tcm95-64107_w1024_n.png"))); // NOI18N
        jButton39.setText("Caffè Mocha");
        jButton39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton39.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setBackground(new java.awt.Color(14, 30, 21));
        jButton40.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton40.setForeground(new java.awt.Color(255, 255, 255));
        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iced-caffe-mocha_tcm95-64108_w1024_n.png"))); // NOI18N
        jButton40.setText("Buzlu Caffè Mocha");
        jButton40.setMargin(new java.awt.Insets(2, 2, 2, 7));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.setBackground(new java.awt.Color(14, 30, 21));
        jButton41.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton41.setForeground(new java.awt.Color(255, 255, 255));
        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/espresso_tcm95-64118_w1024_n.png"))); // NOI18N
        jButton41.setText("Espresso");
        jButton41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton41.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jButton42.setBackground(new java.awt.Color(14, 30, 21));
        jButton42.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton42.setForeground(new java.awt.Color(255, 255, 255));
        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/espresso-con-panna_tcm95-65451_w1024_n.png"))); // NOI18N
        jButton42.setText("Espresso Con Panna");
        jButton42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton42.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jButton43.setBackground(new java.awt.Color(14, 30, 21));
        jButton43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton43.setForeground(new java.awt.Color(255, 255, 255));
        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/espresso-macchiato_tcm95-65452_w1024_n.png"))); // NOI18N
        jButton43.setText("Espresso Macchiato");
        jButton43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton43.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jPanel23.setBackground(new java.awt.Color(234, 229, 229));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton60.setBackground(new java.awt.Color(0, 153, 51));
        jButton60.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton60.setForeground(new java.awt.Color(255, 255, 255));
        jButton60.setText("ESPRESSO");
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });

        jButton61.setBackground(new java.awt.Color(0, 153, 51));
        jButton61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton61.setForeground(new java.awt.Color(255, 255, 255));
        jButton61.setText("FRAPPUCİNO");
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });

        jButton62.setBackground(new java.awt.Color(0, 153, 51));
        jButton62.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton62.setForeground(new java.awt.Color(255, 255, 255));
        jButton62.setText("ÇAY");
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });

        jButton63.setBackground(new java.awt.Color(0, 153, 51));
        jButton63.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton63.setForeground(new java.awt.Color(255, 255, 255));
        jButton63.setText("TÜRK KAHVESİ");
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });

        jButton64.setBackground(new java.awt.Color(0, 153, 51));
        jButton64.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton64.setForeground(new java.awt.Color(255, 255, 255));
        jButton64.setText("ŞİŞELENMİŞ");
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButton60, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton37, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton36, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panespresso.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 635, 400));

        panedrink.add(panespresso, "card2");

        panfrapp.setBackground(new java.awt.Color(236, 231, 231));
        panfrapp.setMinimumSize(new java.awt.Dimension(630, 400));
        panfrapp.setPreferredSize(new java.awt.Dimension(635, 400));
        panfrapp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(236, 231, 231));
        jPanel17.setPreferredSize(new java.awt.Dimension(635, 400));

        jButton59.setBackground(new java.awt.Color(14, 30, 21));
        jButton59.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton59.setForeground(new java.awt.Color(255, 255, 255));
        jButton59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gingerbread-frappuccino.png"))); // NOI18N
        jButton59.setText("Gingerbread Frappuccino");
        jButton59.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton59.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        jPanel24.setBackground(new java.awt.Color(234, 229, 229));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton66.setBackground(new java.awt.Color(0, 153, 51));
        jButton66.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton66.setForeground(new java.awt.Color(255, 255, 255));
        jButton66.setText("FRAPPUCİNO");
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });

        jButton67.setBackground(new java.awt.Color(0, 153, 51));
        jButton67.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton67.setForeground(new java.awt.Color(255, 255, 255));
        jButton67.setText("ÇAY");
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });

        jButton68.setBackground(new java.awt.Color(0, 153, 51));
        jButton68.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton68.setForeground(new java.awt.Color(255, 255, 255));
        jButton68.setText("TÜRK KAHVESİ");
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });

        jButton69.setBackground(new java.awt.Color(0, 153, 51));
        jButton69.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton69.setForeground(new java.awt.Color(255, 255, 255));
        jButton69.setText("ŞİŞELENMİŞ");
        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });

        jButton65.setBackground(new java.awt.Color(0, 153, 51));
        jButton65.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton65.setForeground(new java.awt.Color(255, 255, 255));
        jButton65.setText("ESPRESSO");
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton65, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton66, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton67, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton68, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton69, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton65, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton70.setBackground(new java.awt.Color(14, 30, 21));
        jButton70.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton70.setForeground(new java.awt.Color(255, 255, 255));
        jButton70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toffeenut-frappuccino.png"))); // NOI18N
        jButton70.setText("Toffee Nut Frappuccino");
        jButton70.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton70.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });

        jButton71.setBackground(new java.awt.Color(14, 30, 21));
        jButton71.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton71.setForeground(new java.awt.Color(255, 255, 255));
        jButton71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/caramel-cream-frappuccino.png"))); // NOI18N
        jButton71.setText("Caramel Frappuccino");
        jButton71.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton71.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });

        jButton72.setBackground(new java.awt.Color(14, 30, 21));
        jButton72.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton72.setForeground(new java.awt.Color(255, 255, 255));
        jButton72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vanilla-cream-frappuccino.png"))); // NOI18N
        jButton72.setText("Vanilla Cream Frappuccino");
        jButton72.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton72.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });

        jButton73.setBackground(new java.awt.Color(14, 30, 21));
        jButton73.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton73.setForeground(new java.awt.Color(255, 255, 255));
        jButton73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/strawberries-cream-frappuccino.png"))); // NOI18N
        jButton73.setText("Strawberries & Cream Frappuccino");
        jButton73.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton73.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });

        jButton74.setBackground(new java.awt.Color(14, 30, 21));
        jButton74.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton74.setForeground(new java.awt.Color(255, 255, 255));
        jButton74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chai-cream-frap.png"))); // NOI18N
        jButton74.setText("Chai Cream Frappuccino");
        jButton74.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton74.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panfrapp.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 635, 400));

        panedrink.add(panfrapp, "card3");

        pancay.setBackground(new java.awt.Color(236, 231, 231));
        pancay.setPreferredSize(new java.awt.Dimension(635, 400));
        pancay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(236, 231, 231));
        jPanel18.setPreferredSize(new java.awt.Dimension(635, 400));

        jPanel25.setBackground(new java.awt.Color(234, 229, 229));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton76.setBackground(new java.awt.Color(0, 153, 51));
        jButton76.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton76.setForeground(new java.awt.Color(255, 255, 255));
        jButton76.setText("FRAPPUCİNO");
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });

        jButton77.setBackground(new java.awt.Color(0, 153, 51));
        jButton77.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton77.setForeground(new java.awt.Color(255, 255, 255));
        jButton77.setText("ÇAY");
        jButton77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton77ActionPerformed(evt);
            }
        });

        jButton78.setBackground(new java.awt.Color(0, 153, 51));
        jButton78.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton78.setForeground(new java.awt.Color(255, 255, 255));
        jButton78.setText("TÜRK KAHVESİ");
        jButton78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton78ActionPerformed(evt);
            }
        });

        jButton79.setBackground(new java.awt.Color(0, 153, 51));
        jButton79.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton79.setForeground(new java.awt.Color(255, 255, 255));
        jButton79.setText("ŞİŞELENMİŞ");
        jButton79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton79ActionPerformed(evt);
            }
        });

        jButton75.setBackground(new java.awt.Color(0, 153, 51));
        jButton75.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton75.setForeground(new java.awt.Color(255, 255, 255));
        jButton75.setText("ESPRESSO");
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton76, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton77, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton78, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton79, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton75, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton80.setBackground(new java.awt.Color(14, 30, 21));
        jButton80.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton80.setForeground(new java.awt.Color(255, 255, 255));
        jButton80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teavana-english-breakfast.png"))); // NOI18N
        jButton80.setText("English Breakfast");
        jButton80.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton80.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });

        jButton81.setBackground(new java.awt.Color(14, 30, 21));
        jButton81.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton81.setForeground(new java.awt.Color(255, 255, 255));
        jButton81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/teavana-earl-grey.png"))); // NOI18N
        jButton81.setText("Earl Grey");
        jButton81.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton81.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton81ActionPerformed(evt);
            }
        });

        jButton82.setBackground(new java.awt.Color(14, 30, 21));
        jButton82.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton82.setForeground(new java.awt.Color(255, 255, 255));
        jButton82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hibiscus.png"))); // NOI18N
        jButton82.setText("Hibiscus");
        jButton82.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton82.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton82ActionPerformed(evt);
            }
        });

        jButton83.setBackground(new java.awt.Color(14, 30, 21));
        jButton83.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton83.setForeground(new java.awt.Color(255, 255, 255));
        jButton83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/youthberry.png"))); // NOI18N
        jButton83.setText("Youthberry ");
        jButton83.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton83.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton83ActionPerformed(evt);
            }
        });

        jButton84.setBackground(new java.awt.Color(14, 30, 21));
        jButton84.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton84.setForeground(new java.awt.Color(255, 255, 255));
        jButton84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iced-shaken-peach-green-tea-lemonade.png"))); // NOI18N
        jButton84.setText("Peach Green Tea & Lemonade");
        jButton84.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton84.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton84ActionPerformed(evt);
            }
        });

        jButton85.setBackground(new java.awt.Color(14, 30, 21));
        jButton85.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton85.setForeground(new java.awt.Color(255, 255, 255));
        jButton85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iced-shaken-black-tea.png"))); // NOI18N
        jButton85.setText("Iced Shaken Black Tea");
        jButton85.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton85.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton85ActionPerformed(evt);
            }
        });

        jButton86.setBackground(new java.awt.Color(14, 30, 21));
        jButton86.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton86.setForeground(new java.awt.Color(255, 255, 255));
        jButton86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iced-shaken-green-tea.png"))); // NOI18N
        jButton86.setText("Iced Shaken Green Tea");
        jButton86.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton86.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton86ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 163, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton82, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton86, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pancay.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 635, 400));

        panedrink.add(pancay, "card4");

        panturkkahve.setBackground(new java.awt.Color(236, 231, 231));
        panturkkahve.setPreferredSize(new java.awt.Dimension(635, 400));
        panturkkahve.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(236, 231, 231));
        jPanel19.setPreferredSize(new java.awt.Dimension(635, 400));

        jPanel26.setBackground(new java.awt.Color(234, 229, 229));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton88.setBackground(new java.awt.Color(0, 153, 51));
        jButton88.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton88.setForeground(new java.awt.Color(255, 255, 255));
        jButton88.setText("FRAPPUCİNO");
        jButton88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton88ActionPerformed(evt);
            }
        });

        jButton89.setBackground(new java.awt.Color(0, 153, 51));
        jButton89.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton89.setForeground(new java.awt.Color(255, 255, 255));
        jButton89.setText("ÇAY");
        jButton89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton89ActionPerformed(evt);
            }
        });

        jButton90.setBackground(new java.awt.Color(0, 153, 51));
        jButton90.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton90.setForeground(new java.awt.Color(255, 255, 255));
        jButton90.setText("TÜRK KAHVESİ");
        jButton90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton90ActionPerformed(evt);
            }
        });

        jButton91.setBackground(new java.awt.Color(0, 153, 51));
        jButton91.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton91.setForeground(new java.awt.Color(255, 255, 255));
        jButton91.setText("ŞİŞELENMİŞ");
        jButton91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton91ActionPerformed(evt);
            }
        });

        jButton87.setBackground(new java.awt.Color(0, 153, 51));
        jButton87.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton87.setForeground(new java.awt.Color(255, 255, 255));
        jButton87.setText("ESPRESSO");
        jButton87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton87ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton88, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton89, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton90, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton91, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton87, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton92.setBackground(new java.awt.Color(14, 30, 21));
        jButton92.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton92.setForeground(new java.awt.Color(255, 255, 255));
        jButton92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/turk-kahvesi.png"))); // NOI18N
        jButton92.setText("Türk Kahvesi");
        jButton92.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton92.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton92ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jButton92)
                        .addGap(0, 452, Short.MAX_VALUE))
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton92, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 267, Short.MAX_VALUE)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panturkkahve.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 635, 400));

        panedrink.add(panturkkahve, "card5");

        pansise.setBackground(new java.awt.Color(236, 231, 231));
        pansise.setPreferredSize(new java.awt.Dimension(635, 400));
        pansise.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(236, 231, 231));
        jPanel20.setPreferredSize(new java.awt.Dimension(635, 400));

        jPanel27.setBackground(new java.awt.Color(234, 229, 229));
        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton94.setBackground(new java.awt.Color(0, 153, 51));
        jButton94.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton94.setForeground(new java.awt.Color(255, 255, 255));
        jButton94.setText("FRAPPUCİNO");
        jButton94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton94ActionPerformed(evt);
            }
        });

        jButton95.setBackground(new java.awt.Color(0, 153, 51));
        jButton95.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton95.setForeground(new java.awt.Color(255, 255, 255));
        jButton95.setText("ÇAY");
        jButton95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton95ActionPerformed(evt);
            }
        });

        jButton96.setBackground(new java.awt.Color(0, 153, 51));
        jButton96.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton96.setForeground(new java.awt.Color(255, 255, 255));
        jButton96.setText("TÜRK KAHVESİ");
        jButton96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton96ActionPerformed(evt);
            }
        });

        jButton97.setBackground(new java.awt.Color(0, 153, 51));
        jButton97.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton97.setForeground(new java.awt.Color(255, 255, 255));
        jButton97.setText("ŞİŞELENMİŞ");
        jButton97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton97ActionPerformed(evt);
            }
        });

        jButton93.setBackground(new java.awt.Color(0, 153, 51));
        jButton93.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton93.setForeground(new java.awt.Color(255, 255, 255));
        jButton93.setText("ESPRESSO");
        jButton93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton93ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton93, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton94, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton95, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton96, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton97, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton93, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton98.setBackground(new java.awt.Color(14, 30, 21));
        jButton98.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton98.setForeground(new java.awt.Color(255, 255, 255));
        jButton98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Hayat-Su.png"))); // NOI18N
        jButton98.setText(" Su");
        jButton98.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton98.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton98ActionPerformed(evt);
            }
        });

        jButton99.setBackground(new java.awt.Color(14, 30, 21));
        jButton99.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton99.setForeground(new java.awt.Color(255, 255, 255));
        jButton99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Feel-More-Karisik-Meyve-Suyu.png"))); // NOI18N
        jButton99.setText("Karışık Meyve Suyu");
        jButton99.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton99.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton99ActionPerformed(evt);
            }
        });

        jButton100.setBackground(new java.awt.Color(14, 30, 21));
        jButton100.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton100.setForeground(new java.awt.Color(255, 255, 255));
        jButton100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Feel-More-Portakal-Suyu_.png"))); // NOI18N
        jButton100.setText("Portakal Suyu");
        jButton100.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton100.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton100ActionPerformed(evt);
            }
        });

        jButton101.setBackground(new java.awt.Color(14, 30, 21));
        jButton101.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton101.setForeground(new java.awt.Color(255, 255, 255));
        jButton101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Feel-More-Limonata.png"))); // NOI18N
        jButton101.setText("Limonata");
        jButton101.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton101.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton101ActionPerformed(evt);
            }
        });

        jButton102.setBackground(new java.awt.Color(14, 30, 21));
        jButton102.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton102.setForeground(new java.awt.Color(255, 255, 255));
        jButton102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/San-Pellegrino-Portakalli-Gazli-icecek.png"))); // NOI18N
        jButton102.setMnemonic(' ');
        jButton102.setText("Portakallı Gazlı İçecek");
        jButton102.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton102.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton102ActionPerformed(evt);
            }
        });

        jButton103.setBackground(new java.awt.Color(14, 30, 21));
        jButton103.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton103.setForeground(new java.awt.Color(255, 255, 255));
        jButton103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/San-Pellegrino-Limonlu-Gazli-icecek.png"))); // NOI18N
        jButton103.setMnemonic(' ');
        jButton103.setText("Limonlu Gazlı İçecek");
        jButton103.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton103.setMargin(new java.awt.Insets(2, 2, 2, 14));
        jButton103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton103ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton103, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton102, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton101, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pansise.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 635, 400));

        panedrink.add(pansise, "card6");

        jLayeredPane1.add(panedrink, "card6");

        paketkahvepan.setLayout(new java.awt.CardLayout());

        allpan.setBackground(new java.awt.Color(234, 229, 229));
        allpan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel33.setBackground(new java.awt.Color(234, 229, 229));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TAMAMI", "BLONDE", "MEDIUM", "DARK" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton28.setBackground(new java.awt.Color(14, 30, 21));
        jButton28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("Blonde Espresso");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(14, 30, 21));
        jButton29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText("VERANDA BLEND");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(14, 30, 21));
        jButton30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("COLOMBİA NARİNO");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton31.setBackground(new java.awt.Color(14, 30, 21));
        jButton31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("ETHİOPİA");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setBackground(new java.awt.Color(14, 30, 21));
        jButton32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setText("PIKE PLACE ROAST");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton33.setBackground(new java.awt.Color(14, 30, 21));
        jButton33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton33.setForeground(new java.awt.Color(255, 255, 255));
        jButton33.setText("KENYA");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setBackground(new java.awt.Color(14, 30, 21));
        jButton34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton34.setForeground(new java.awt.Color(255, 255, 255));
        jButton34.setText("HOUSE BLEND");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton105.setBackground(new java.awt.Color(14, 30, 21));
        jButton105.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton105.setForeground(new java.awt.Color(255, 255, 255));
        jButton105.setText("GUATEMALA ANTIGUA");
        jButton105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton105ActionPerformed(evt);
            }
        });

        jButton106.setBackground(new java.awt.Color(14, 30, 21));
        jButton106.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton106.setForeground(new java.awt.Color(255, 255, 255));
        jButton106.setText("CAFFE VERONA");
        jButton106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton106ActionPerformed(evt);
            }
        });

        jButton107.setBackground(new java.awt.Color(14, 30, 21));
        jButton107.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton107.setForeground(new java.awt.Color(255, 255, 255));
        jButton107.setText("DECAF ESPRESSO ROAST");
        jButton107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton107ActionPerformed(evt);
            }
        });

        jButton108.setBackground(new java.awt.Color(14, 30, 21));
        jButton108.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton108.setForeground(new java.awt.Color(255, 255, 255));
        jButton108.setText("ESPRESSO ROAST");
        jButton108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton108ActionPerformed(evt);
            }
        });

        jButton109.setBackground(new java.awt.Color(14, 30, 21));
        jButton109.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton109.setForeground(new java.awt.Color(255, 255, 255));
        jButton109.setText("SUMATRA");
        jButton109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton109ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel33Layout.createSequentialGroup()
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton30))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton107, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton105, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton106, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton105, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton106, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton107, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton108, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton109, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        allpan.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 400));

        paketkahvepan.add(allpan, "card2");

        blondepan.setBackground(new java.awt.Color(234, 229, 229));
        blondepan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setBackground(new java.awt.Color(234, 229, 229));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TAMAMI", "BLONDE", "MEDIUM", "DARK" }));
        jComboBox2.setSelectedIndex(1);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton115.setBackground(new java.awt.Color(14, 30, 21));
        jButton115.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton115.setForeground(new java.awt.Color(255, 255, 255));
        jButton115.setText("Blonde Espresso");
        jButton115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton115ActionPerformed(evt);
            }
        });

        jButton116.setBackground(new java.awt.Color(14, 30, 21));
        jButton116.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton116.setForeground(new java.awt.Color(255, 255, 255));
        jButton116.setText("VERANDA BLEND");
        jButton116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton116ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton115, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton116, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(445, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton115, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton116, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        blondepan.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 400));

        paketkahvepan.add(blondepan, "card3");

        mediumpan.setBackground(new java.awt.Color(234, 229, 229));
        mediumpan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel30.setBackground(new java.awt.Color(234, 229, 229));

        jButton110.setBackground(new java.awt.Color(14, 30, 21));
        jButton110.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton110.setForeground(new java.awt.Color(255, 255, 255));
        jButton110.setText("KENYA");
        jButton110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton110ActionPerformed(evt);
            }
        });

        jButton111.setBackground(new java.awt.Color(14, 30, 21));
        jButton111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton111.setForeground(new java.awt.Color(255, 255, 255));
        jButton111.setText("COLOMBİA NARİNO");
        jButton111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton111ActionPerformed(evt);
            }
        });

        jButton112.setBackground(new java.awt.Color(14, 30, 21));
        jButton112.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton112.setForeground(new java.awt.Color(255, 255, 255));
        jButton112.setText("HOUSE BLEND");
        jButton112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton112ActionPerformed(evt);
            }
        });

        jButton113.setBackground(new java.awt.Color(14, 30, 21));
        jButton113.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton113.setForeground(new java.awt.Color(255, 255, 255));
        jButton113.setText("GUATEMALA ANTIGUA");
        jButton113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton113ActionPerformed(evt);
            }
        });

        jButton114.setBackground(new java.awt.Color(14, 30, 21));
        jButton114.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton114.setForeground(new java.awt.Color(255, 255, 255));
        jButton114.setText("PIKE PLACE ROAST");
        jButton114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton114ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TAMAMI", "BLONDE", "MEDIUM", "DARK" }));
        jComboBox3.setSelectedIndex(2);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jButton44.setBackground(new java.awt.Color(14, 30, 21));
        jButton44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton44.setForeground(new java.awt.Color(255, 255, 255));
        jButton44.setText("ETHİOPİA");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton110, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton113, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton114, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton112, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton111, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton110, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mediumpan.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 400));

        paketkahvepan.add(mediumpan, "card4");

        darkpan.setBackground(new java.awt.Color(234, 229, 229));
        darkpan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel31.setBackground(new java.awt.Color(234, 229, 229));

        jButton117.setBackground(new java.awt.Color(14, 30, 21));
        jButton117.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton117.setForeground(new java.awt.Color(255, 255, 255));
        jButton117.setText("CAFFE VERONA");
        jButton117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton117ActionPerformed(evt);
            }
        });

        jButton118.setBackground(new java.awt.Color(14, 30, 21));
        jButton118.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton118.setForeground(new java.awt.Color(255, 255, 255));
        jButton118.setText("DECAF ESPRESSO ROAST");
        jButton118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton118ActionPerformed(evt);
            }
        });

        jButton119.setBackground(new java.awt.Color(14, 30, 21));
        jButton119.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton119.setForeground(new java.awt.Color(255, 255, 255));
        jButton119.setText("ESPRESSO ROAST");
        jButton119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton119ActionPerformed(evt);
            }
        });

        jButton120.setBackground(new java.awt.Color(14, 30, 21));
        jButton120.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton120.setForeground(new java.awt.Color(255, 255, 255));
        jButton120.setText("SUMATRA");
        jButton120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton120ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TAMAMI", "BLONDE", "MEDIUM", "DARK" }));
        jComboBox4.setSelectedIndex(3);
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton118, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton120, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton119)))
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton118, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton119, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton120, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton117, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        darkpan.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 400));

        paketkahvepan.add(darkpan, "card5");

        jLayeredPane1.add(paketkahvepan, "card6");

        jPanel3.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 52, 635, -1));

        jPanel7.setBackground(new java.awt.Color(232, 230, 191));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BOY", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        kucuk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        kucuk.setText("KÜÇÜK");
        kucuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kucukActionPerformed(evt);
            }
        });

        orta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        orta.setText("ORTA");

        buyuk.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        buyuk.setText("BÜYÜK");

        size.setText("OK");
        size.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buyuk, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(orta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kucuk, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(kucuk)
                .addGap(37, 37, 37)
                .addComponent(orta)
                .addGap(37, 37, 37)
                .addComponent(buyuk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 470, 160, 320));

        jPanel8.setBackground(new java.awt.Color(232, 230, 191));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SÜT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        yagli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        yagli.setText("YAĞLI ");

        yagsiz.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        yagsiz.setText("YAĞSIZ");

        yarimyagli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        yarimyagli.setText("YARIM YAĞLI");

        laktozsuz.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        laktozsuz.setText("LAKTOZSUZ");

        bademsutu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bademsutu.setText("BADEM SÜTÜ");

        soyasutu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        soyasutu.setText("SOYA SÜTÜ");

        milk.setText("OK");
        milk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(soyasutu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bademsutu)
                    .addComponent(laktozsuz, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yagli, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yagsiz)
                    .addComponent(yarimyagli))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(milk, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(yagli)
                .addGap(18, 18, 18)
                .addComponent(yagsiz)
                .addGap(18, 18, 18)
                .addComponent(yarimyagli)
                .addGap(18, 18, 18)
                .addComponent(laktozsuz)
                .addGap(18, 18, 18)
                .addComponent(bademsutu)
                .addGap(18, 18, 18)
                .addComponent(soyasutu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(milk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 190, 320));

        jPanel9.setBackground(new java.awt.Color(232, 230, 191));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ŞURUP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        karamel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        karamel.setText("Karamel");

        cikolata.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cikolata.setText("Çikolata");

        beyazcikolata.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        beyazcikolata.setText("Beyaz Çikolata");

        hindistancevizi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        hindistancevizi.setText("Hindistan Cevizi");

        vanilya.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        vanilya.setText("Vanilya");

        findik.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        findik.setText("Fındık");

        cilek.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cilek.setText("Çilek");

        ahududu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ahududu.setText("Ahududu");

        syrup.setText("OK");
        syrup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syrupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(syrup, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cilek, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ahududu, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(findik, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hindistancevizi, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vanilya, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(beyazcikolata, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cikolata, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(karamel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(karamel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cikolata, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(beyazcikolata)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(vanilya)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hindistancevizi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(findik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cilek)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ahududu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(syrup, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 230, 320));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void uyegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyegActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(error,"Kayıtlı telefon numarasını başında 0 olmadan giriniz (ör:5550001234)");
        new Uyegiris().setVisible(true);  
       
    }//GEN-LAST:event_uyegActionPerformed

    private void yenigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yenigActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(error,"Telefon numarası 0 olmadan 10 haneli olmak zorundadr (5551110036)\nİsim ve soy isim İngiliz alfabesine uygun olmalıdır(ü-ğ-ö-ç gibi harfler geçersiz)");
       new YeniUye().setVisible(true);
      
        
    }//GEN-LAST:event_yenigActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        menuchange(hediyelik);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void kahvelerbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kahvelerbActionPerformed
        // TODO add your handling code here:
        LayeredPanelChange(paketkahvepan);
         
    }//GEN-LAST:event_kahvelerbActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void bkurabiye2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkurabiye2ActionPerformed
        // TODO add your handling code here:
         menuchangefood(kurabiye);
    }//GEN-LAST:event_bkurabiye2ActionPerformed

    private void bkurabiye3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkurabiye3ActionPerformed
        // TODO add your handling code here:
         menuchangefood(kurabiye);
    }//GEN-LAST:event_bkurabiye3ActionPerformed

    private void bsandavic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsandavic2ActionPerformed
        // TODO add your handling code here:
        menuchangefood(sandavic);
    }//GEN-LAST:event_bsandavic2ActionPerformed

    private void bpasta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpasta2ActionPerformed
        // TODO add your handling code here:
          menuchangefood(pasta);
    }//GEN-LAST:event_bpasta2ActionPerformed

    private void bsalata2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalata2ActionPerformed
        // TODO add your handling code here:
          menuchangefood(salata);
    }//GEN-LAST:event_bsalata2ActionPerformed

    private void bsandavic3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsandavic3ActionPerformed
        // TODO add your handling code here:
        menuchangefood(sandavic);
    }//GEN-LAST:event_bsandavic3ActionPerformed

    private void bpasta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpasta3ActionPerformed
        // TODO add your handling code here:
           menuchangefood(pasta);
    }//GEN-LAST:event_bpasta3ActionPerformed

    private void bsalata3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalata3ActionPerformed
        // TODO add your handling code here:
            menuchangefood(salata);
    }//GEN-LAST:event_bsalata3ActionPerformed

    private void yiyecekbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yiyecekbActionPerformed
        // ikinci layered panel buttonu
        LayeredPanelChange(panefood);
    }//GEN-LAST:event_yiyecekbActionPerformed

    private void bsalataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalataActionPerformed
        // TODO add your handling code here:
        menuchangefood(salata);
    }//GEN-LAST:event_bsalataActionPerformed

    private void bkurabiyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkurabiyeActionPerformed
        // TODO add your handling code here:
        menuchangefood(kurabiye);
    }//GEN-LAST:event_bkurabiyeActionPerformed

    private void bsandavicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsandavicActionPerformed
        // TODO add your handling code here:
        menuchangefood(sandavic);
    }//GEN-LAST:event_bsandavicActionPerformed

    private void bpastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpastaActionPerformed
        // TODO add your handling code here:
        menuchangefood(pasta);
    }//GEN-LAST:event_bpastaActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        // TODO add your handling code here:
        menuchangedrink(panfrapp);
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        // TODO add your handling code here:
        menuchangedrink(pancay);
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        // TODO add your handling code here:
        menuchangedrink(panturkkahve);
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        // TODO add your handling code here:
        menuchangedrink(pansise);
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        // TODO add your handling code here:
        menuchangedrink(panfrapp);
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        // TODO add your handling code here:
                menuchangedrink(pancay);
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        // TODO add your handling code here:
         menuchangedrink(panturkkahve);
    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        // TODO add your handling code here:
         menuchangedrink(pansise);
    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        // TODO add your handling code here:
        menuchangedrink(panfrapp);
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jButton77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton77ActionPerformed
        // TODO add your handling code here:
        menuchangedrink(pancay);
    }//GEN-LAST:event_jButton77ActionPerformed

    private void jButton78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton78ActionPerformed
        // TODO add your handling code here:
        menuchangedrink(panturkkahve);
    }//GEN-LAST:event_jButton78ActionPerformed

    private void jButton79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton79ActionPerformed
        // TODO add your handling code here:
         menuchangedrink(pansise);
    }//GEN-LAST:event_jButton79ActionPerformed

    private void jButton88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton88ActionPerformed
        // TODO add your handling code here:
         menuchangedrink(panfrapp);
    }//GEN-LAST:event_jButton88ActionPerformed

    private void jButton89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton89ActionPerformed
        // TODO add your handling code here:
        menuchangedrink(pancay);
    }//GEN-LAST:event_jButton89ActionPerformed

    private void jButton90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton90ActionPerformed
        // TODO add your handling code here:
         menuchangedrink(panturkkahve);
    }//GEN-LAST:event_jButton90ActionPerformed

    private void jButton91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton91ActionPerformed
        // TODO add your handling code here:
         menuchangedrink(pansise);
    }//GEN-LAST:event_jButton91ActionPerformed

    private void jButton94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton94ActionPerformed
        // TODO add your handling code here:
                 menuchangedrink(panfrapp);
    }//GEN-LAST:event_jButton94ActionPerformed

    private void jButton95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton95ActionPerformed
                  menuchangedrink(pancay);        
    }//GEN-LAST:event_jButton95ActionPerformed

    private void jButton96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton96ActionPerformed
        // TODO add your handling code here:
        menuchangedrink(panturkkahve);
    }//GEN-LAST:event_jButton96ActionPerformed

    private void jButton97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton97ActionPerformed
        // TODO add your handling code here:
         menuchangedrink(pansise);
    }//GEN-LAST:event_jButton97ActionPerformed

    private void icecekbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icecekbActionPerformed
        // TODO add your handling code here:
        LayeredPanelChange(panedrink);
    }//GEN-LAST:event_icecekbActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        // TODO add your handling code here:
        menuchangedrink(panespresso);
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        // TODO add your handling code here:
        menuchangedrink(panespresso);
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        // TODO add your handling code here:
         menuchangedrink(panespresso);
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton87ActionPerformed
        // TODO add your handling code here:
         menuchangedrink(panespresso);
    }//GEN-LAST:event_jButton87ActionPerformed

    private void jButton93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton93ActionPerformed
        // TODO add your handling code here:
         menuchangedrink(panespresso);
    }//GEN-LAST:event_jButton93ActionPerformed

    private void jButton104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton104ActionPerformed
        // TODO add your handling code here:
        if(givenOrder.size() != 0)
        {
            if(SystemClass.isMatched("Size"))
            {
                size.setEnabled(true);
                milk.setEnabled(false);
                syrup.setEnabled(false);
            }
        
            else if(SystemClass.isMatched("Milk"))
            {
                size.setEnabled(false);
                milk.setEnabled(true);
                syrup.setEnabled(false);
            }
        
            else if(SystemClass.isMatched("Syrup"))
            {
                size.setEnabled(false);
                milk.setEnabled(false);
                syrup.setEnabled(true);
            }
            
            else if(givenOrder.size() == 0 || (SystemClass.isMatched("Espresso")) || (SystemClass.isMatched("Frappucino")) || (SystemClass.isMatched("Çay")))
            {   
                setAllDefault();    
            }
            SystemClass.removeLastConditionStar();
            SystemClass.removeLastOrder();
           
            order.setText(SystemClass.displayOrder(givenOrder));
            calculation.setText(SystemClass.displayCalculation());
        }

    }//GEN-LAST:event_jButton104ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Frappucino", 12, "Gingerbread Frappuccino");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(loginClient !=null)
            new star().setVisible(true);
        else
             JOptionPane.showMessageDialog(error,"Üye girişi yapılana kadar Yıldız menüsü açılamaz..");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        if(loginClient!= null && loginClient.getStar()< SystemClass.totalStar(givenOrder))
                JOptionPane.showMessageDialog(error,"Yeterli yıldızınız yok.\nYıldız menüsünden eklenen ürünü siliniz...");
        else
            new odeme().setVisible(true);
          
        
       
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void yenisiparisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yenisiparisActionPerformed
        // TODO add your handling code here:
        packedcafchange(buttonpan);
        loginClient = null;
        SystemClass.clear();
        order.setText(SystemClass.displayOrder(givenOrder));
        calculation.setText(SystemClass.displayCalculation());
        setAllDefault();
        
        
        
    }//GEN-LAST:event_yenisiparisActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Espresso" ,6 ,"Espresso");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("House Blend", "Medium", 30);
         
        actionPerformed(packetedProducts);
        addConditionStar();
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton112ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("House Blend", "Medium", 30);
         
        actionPerformed(packetedProducts);
        addConditionStar();
    }//GEN-LAST:event_jButton112ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedIndex()==0){
        jComboBox1.setSelectedIndex(0);
            filterpan(allpan);
        
            }
        else if(jComboBox1.getSelectedIndex()==1){
         jComboBox1.setSelectedIndex(0);
            filterpan(blondepan);
          
            }
        else if(jComboBox1.getSelectedIndex()==2){
         jComboBox1.setSelectedIndex(0);
            filterpan(mediumpan);
          
            }
        else if(jComboBox1.getSelectedIndex()==3){
        jComboBox1.setSelectedIndex(0);
            filterpan(darkpan);
          
            }
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
         if(jComboBox2.getSelectedIndex()==0){
       jComboBox2.setSelectedIndex(1);
             filterpan(allpan);
        
            }
        else if(jComboBox2.getSelectedIndex()==1){
           jComboBox2.setSelectedIndex(1);
            filterpan(blondepan);
       
            }
        else if(jComboBox2.getSelectedIndex()==2){
        jComboBox2.setSelectedIndex(1);
            filterpan(mediumpan);
         
            }
        else if(jComboBox2.getSelectedIndex()==3){
        jComboBox2.setSelectedIndex(1);
            filterpan(darkpan);
          
            }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
         if(jComboBox3.getSelectedIndex()==0){
          jComboBox3.setSelectedIndex(2);
             filterpan(allpan);
           
            }
        else if(jComboBox3.getSelectedIndex()==1){
        jComboBox3.setSelectedIndex(2);
            filterpan(blondepan);
         
            }
        else if(jComboBox3.getSelectedIndex()==2){
         jComboBox3.setSelectedIndex(2);
            filterpan(mediumpan);
         
            }
        else if(jComboBox3.getSelectedIndex()==3){
          jComboBox3.setSelectedIndex(2);
            filterpan(darkpan);
        
            }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
         if(jComboBox4.getSelectedIndex()==0){
       jComboBox4.setSelectedIndex(3);
             filterpan(allpan);
        
            }
        else if(jComboBox4.getSelectedIndex()==1){
         jComboBox4.setSelectedIndex(3);
            filterpan(blondepan);
         
            }
        else if(jComboBox4.getSelectedIndex()==2){
         jComboBox4.setSelectedIndex(3);
            filterpan(mediumpan);
         
            }
        else if(jComboBox4.getSelectedIndex()==3){
         jComboBox4.setSelectedIndex(3);
            filterpan(darkpan);
         
            }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton_KupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KupaActionPerformed
        // TODO add your handling code here:
        Gifts gift = new Gifts(90.0, "Kupa", "Aladdin");
        actionPerformed(gift);
        addConditionStar();
    }//GEN-LAST:event_jButton_KupaActionPerformed

    private void kucukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kucukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kucukActionPerformed

    private void jButton_FiestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FiestaActionPerformed
        // TODO add your handling code here:
        Food food = new Food("Sandviç", 16.0, "Fiesta", "452kcal");
         
        actionPerformed(food);
        addConditionStar();
    }//GEN-LAST:event_jButton_FiestaActionPerformed

    private void jButton_ReyhanliTostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ReyhanliTostActionPerformed
        // TODO add your handling code here:
        Food food = new Food("Sandviç", 13.0, "Reyhanlı Peynirli Tost", "415kcal");     
        actionPerformed(food); 
        addConditionStar();
    }//GEN-LAST:event_jButton_ReyhanliTostActionPerformed

    private void jButton_EzineliSandvicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_EzineliSandvicActionPerformed
        // TODO add your handling code here:
        Food food = new Food("Sandviç", 12.50, "Ezine Peynirli Sandviç", "376kcal");
        actionPerformed(food);
        addConditionStar();
    }//GEN-LAST:event_jButton_EzineliSandvicActionPerformed

    private void jButton_MozarellaSandvicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MozarellaSandvicActionPerformed
        // TODO add your handling code here:
        Food food = new Food("Sandviç", 12.50, "Mozzarella Sandviç", "390kcal");
        actionPerformed(food);
        addConditionStar();
    }//GEN-LAST:event_jButton_MozarellaSandvicActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        // TODO add your handling code here:
        Food food = new Food("Kurabiye", 8.0, "Triple Chocolate Cookie", "370kcal");
        actionPerformed(food);
        addConditionStar();
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton_MistoCookieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MistoCookieActionPerformed
        // TODO add your handling code here:
        Food food = new Food("Kurabiye", 11.0, "Misto Cookie", "309kcal");
        actionPerformed(food);
        addConditionStar();
    }//GEN-LAST:event_jButton_MistoCookieActionPerformed

    private void jButton_DopdoluFitCookieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DopdoluFitCookieActionPerformed
        // TODO add your handling code here:
        Food food = new Food("Kurabiye", 13.0, "Dopdolu Fit Cookie", "249kcal");
         actionPerformed(food);
         addConditionStar();

    }//GEN-LAST:event_jButton_DopdoluFitCookieActionPerformed

    private void jButton_BrownieCheesecakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BrownieCheesecakeActionPerformed
        // TODO add your handling code here:
        Food food = new Food("Pasta", 14.0, "Brownie Cheesecake", "759kcal");
        
        actionPerformed(food); 
        addConditionStar();
    }//GEN-LAST:event_jButton_BrownieCheesecakeActionPerformed

    private void jButton_KremalıHavucluKekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KremalıHavucluKekActionPerformed
        // TODO add your handling code here:
        Food food = new Food("Pasta", 15.75, "Kremalı Havuçlu Kek", "326kcal");
         
        actionPerformed(food);
        addConditionStar();
    }//GEN-LAST:event_jButton_KremalıHavucluKekActionPerformed

    private void jButton_ProfiterolluPastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ProfiterolluPastaActionPerformed
        // TODO add your handling code here:
        Food food = new Food("Pasta", 13.50, "Profiterollü Pasta", "316kcal");
        
        actionPerformed(food); 
        addConditionStar();
    }//GEN-LAST:event_jButton_ProfiterolluPastaActionPerformed

    private void jButton_LimonluCheesecakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimonluCheesecakeActionPerformed
        // TODO add your handling code here:
        Food food = new Food("Pasta", 14.25, "Limonlu Cheesecake", "516kcal");
        
        actionPerformed(food); 
        addConditionStar();
    }//GEN-LAST:event_jButton_LimonluCheesecakeActionPerformed

    private void jButton_KinoalıSalataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KinoalıSalataActionPerformed
        // TODO add your handling code here:
        Food food = new Food("Salata", 22.0, "Kinoalı Salata", "382kcal");
        
        actionPerformed(food);
        addConditionStar();
    }//GEN-LAST:event_jButton_KinoalıSalataActionPerformed

    private void jButton_MeyveliveYogurtluParfeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_MeyveliveYogurtluParfeActionPerformed
        // TODO add your handling code here:
        Food food = new Food("Salata", 16.75, "Meyveli ve Yoğurtlu Parfe", "450kcal");
       
        actionPerformed(food); 
        addConditionStar();
    }//GEN-LAST:event_jButton_MeyveliveYogurtluParfeActionPerformed

    private void jButton_IzgaraTavukluSalataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_IzgaraTavukluSalataActionPerformed
        // TODO add your handling code here:
        Food food = new Food("Salata", 18.50, "Izgara Tavuklu Salata", "124kcal");
       
        actionPerformed(food);
        addConditionStar();
    }//GEN-LAST:event_jButton_IzgaraTavukluSalataActionPerformed

    private void jButton_AnanaslıChiaPudingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AnanaslıChiaPudingActionPerformed
        // TODO add your handling code here:
        Food food = new Food("Salata", 17.0, "Ananaslı Chia Salata", "270kcal");
        
        actionPerformed(food); 
        addConditionStar();
    }//GEN-LAST:event_jButton_AnanaslıChiaPudingActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Blonde Espresso", "Blonde", 35);
         
        actionPerformed(packetedProducts);
        addConditionStar();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void siparisresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siparisresetActionPerformed
        // TODO add your handling code here:
        SystemClass.clear();
        conditionStar.clear();
        order.setText(SystemClass.displayOrder(givenOrder));
        calculation.setText(SystemClass.displayCalculation());
        setAllDefault();
    }//GEN-LAST:event_siparisresetActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Espresso" ,16 ,"Gingerbread Latte");
        actionPerformed(drink);
        size.setEnabled(true);

    }//GEN-LAST:event_jButton35ActionPerformed

    private void bpasta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpasta1ActionPerformed
        // TODO add your handling code here:
         menuchangefood(pasta);
    }//GEN-LAST:event_bpasta1ActionPerformed

    private void bsandavic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsandavic1ActionPerformed
        // TODO add your handling code here:
        menuchangefood(sandavic);
        
        
    }//GEN-LAST:event_bsandavic1ActionPerformed

    private void bkurabiye4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkurabiye4ActionPerformed
        // TODO add your handling code here:
         menuchangefood(kurabiye);
    }//GEN-LAST:event_bkurabiye4ActionPerformed

    private void bsalata1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsalata1ActionPerformed
        // TODO add your handling code here:
         menuchangefood(salata);
    }//GEN-LAST:event_bsalata1ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Espresso", 14, "Coffee Mocha");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Espresso", 17, "Toffee Nut Latte");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        
        //oppening urls do not modify -Burak
        
         try {
            // TODO add your handling code here:
            final URI uri = new URI("https://github.com/phyex0");
            final URI uri1 = new URI("https://github.com/melisalpkaya");
            final URI uri2 = new URI("https://github.com/Xerewulf");
            final URI uri3 = new URI("https://github.com/Mansur74");
            open(uri);
            open(uri1);
            open(uri2);
            open(uri3);
            
        } catch (URISyntaxException ex) {
            Logger.getLogger(CafeManagementGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        Gifts gift = new Gifts(229.99, "Termos", "Stanley");
         
        actionPerformed(gift);
        addConditionStar();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton105ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Guatemala Antigua", "Medium", 35);
        
        actionPerformed(packetedProducts);
        addConditionStar();
    }//GEN-LAST:event_jButton105ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Verande Blende", "Blonde", 38);
         
        actionPerformed(packetedProducts);
        addConditionStar();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton106ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Caffe Verona", "Dark", 33);
         
        actionPerformed(packetedProducts);
        addConditionStar();
    }//GEN-LAST:event_jButton106ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       new kasayikapat().setVisible(true);
       collectedData.setText(SystemClass.displayOrder(allOrders));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton107ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Decaff Espresso", "Dark", 33);
       
        actionPerformed(packetedProducts); 
        addConditionStar();
    }//GEN-LAST:event_jButton107ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Colombia Narino", "Medium", 35);
        
        actionPerformed(packetedProducts);
        addConditionStar();
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Kenya", "Medium", 34);
         
        actionPerformed(packetedProducts);
        addConditionStar();
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton108ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Espresso Roast", "Dark", 33);
       
        actionPerformed(packetedProducts);
        addConditionStar();
    }//GEN-LAST:event_jButton108ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Ethiopia", "Medium", 36);
       
        actionPerformed(packetedProducts); 
        addConditionStar();
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Pike Place Roast", "Medium", 34);
        
        actionPerformed(packetedProducts); 
        addConditionStar();
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton109ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Sumatra", "Dark", 33);
        
        actionPerformed(packetedProducts);
        addConditionStar();
    }//GEN-LAST:event_jButton109ActionPerformed

    private void jButton115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton115ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Blonde Espresso", "Blonde", 37);
        
        actionPerformed(packetedProducts);
        addConditionStar();
    }//GEN-LAST:event_jButton115ActionPerformed

    private void jButton116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton116ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Veranda Blend", "Blonde", 37);
        
        actionPerformed(packetedProducts);
        addConditionStar();
    }//GEN-LAST:event_jButton116ActionPerformed

    private void jButton113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton113ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Guatemala Antigua", "Medium", 38);
        
        actionPerformed(packetedProducts); 
        addConditionStar();
    }//GEN-LAST:event_jButton113ActionPerformed

    private void jButton114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton114ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Pike Place Roast", "Medium", 37);
         
        actionPerformed(packetedProducts);
        addConditionStar();
    }//GEN-LAST:event_jButton114ActionPerformed

    private void jButton111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton111ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Colombia Narino", "Medium", 35);
       
        actionPerformed(packetedProducts);  
        addConditionStar();
    }//GEN-LAST:event_jButton111ActionPerformed

    private void jButton110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton110ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Kenya", "Medium", 35);
         
        actionPerformed(packetedProducts);
        addConditionStar();
    }//GEN-LAST:event_jButton110ActionPerformed

    private void jButton118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton118ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Decaff Espresso", "Dark", 40);
        
        actionPerformed(packetedProducts); 
        addConditionStar();
    }//GEN-LAST:event_jButton118ActionPerformed

    private void jButton119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton119ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Espresso Roast", "Dark", 39);
       
        actionPerformed(packetedProducts);  
        addConditionStar();
    }//GEN-LAST:event_jButton119ActionPerformed

    private void jButton117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton117ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Caffe Verona", "Dark", 38);
        
        actionPerformed(packetedProducts); 
        addConditionStar();
    }//GEN-LAST:event_jButton117ActionPerformed

    private void jButton120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton120ActionPerformed
        // TODO add your handling code here:
        PacketedProducts packetedProducts = new PacketedProducts("Sumatra", "Dark", 38);
      
        actionPerformed(packetedProducts);
        addConditionStar();
    }//GEN-LAST:event_jButton120ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Espresso", 17, "Buzlu Caffè Mocha");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Espresso", 7, "Espresso Con Panna");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Espresso", 13, "Caffe Latte");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Espresso", 12, "Espresso Macchiato");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Espresso", 17, "Flat White");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton98ActionPerformed
        // TODO add your handling code here:
        Drinks drink = new Drinks("Bottled", 5, "Su");
        actionPerformed(drink);
    }//GEN-LAST:event_jButton98ActionPerformed

    private void jButton99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton99ActionPerformed
        // TODO add your handling code here:
        Drinks drink = new Drinks("Bottled", 8, "Karışık Meyve Suyu");
        actionPerformed(drink);
    }//GEN-LAST:event_jButton99ActionPerformed

    private void jButton103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton103ActionPerformed
        // TODO add your handling code here:
        Drinks drink = new Drinks("Bottled", 13, "Limonlu Gazlı İçecek");
        actionPerformed(drink);
    }//GEN-LAST:event_jButton103ActionPerformed

    private void jButton100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton100ActionPerformed
        // TODO add your handling code here:
        Drinks drink = new Drinks("Bottled", 11, "Portakal Suyu");
        actionPerformed(drink);

    }//GEN-LAST:event_jButton100ActionPerformed

    private void jButton102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton102ActionPerformed
        // TODO add your handling code here:
        Drinks drink = new Drinks("Bottled", 13, "Portakallı Gazlı İçecek");
        actionPerformed(drink);
    }//GEN-LAST:event_jButton102ActionPerformed

    private void jButton101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton101ActionPerformed
        // TODO add your handling code here:
        Drinks drink = new Drinks("Bottled", 16, "Limonata");
        actionPerformed(drink);
    }//GEN-LAST:event_jButton101ActionPerformed

    private void jButton92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton92ActionPerformed
        // TODO add your handling code here:
        Drinks drink = new Drinks("Espresso", 12, "Türk Kahvesi");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton92ActionPerformed

    private void sizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeActionPerformed
        // TODO add your handling code here:
        
        if(SystemClass.isMatched("Çay"))
        {
            this.size.setEnabled(false);
        }
        
        else
        {
            this.size.setEnabled(false);
            milk.setEnabled(true);
        }

        String size[] = new String[2];
        size = buttonGroup1.getSelection().getActionCommand().split(",", 2);
        Property choosenSize = new Property("Size", size[0], Integer.parseInt(size[1]));
        
        choosenSize.calculate_and_add();
        
        order.setText(SystemClass.displayOrder(givenOrder));
        calculation.setText(SystemClass.displayCalculation());
         


    }//GEN-LAST:event_sizeActionPerformed

    private void milkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milkActionPerformed
        // TODO add your handling code here:

        String milk[] = new String[2];
        milk = buttonGroup2.getSelection().getActionCommand().split(",", 2);
        Property choosenMilk = new Property("Milk", milk[0], Integer.parseInt(milk[1]));
        
        choosenMilk.calculate_and_add();
        
        order.setText(SystemClass.displayOrder(givenOrder));
        calculation.setText(SystemClass.displayCalculation());
        
        this.milk.setEnabled(false);
        this.syrup.setEnabled(true);
            
    }//GEN-LAST:event_milkActionPerformed

    private void syrupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syrupActionPerformed
        // TODO add your handling code here:

        String syrup[] = new String[2];
        
        for ( JCheckBox checkbox : checkboxes ) 
        {
            if( checkbox.isSelected() )
            {
                syrup = checkbox.getActionCommand().split(",", 2);
                Property choosenSyrup = new Property("Syrup", syrup[0], Integer.parseInt(syrup[1]));
                choosenSyrup.calculate_and_add();
                
            }
        }
        
        order.setText(SystemClass.displayOrder(givenOrder));
        calculation.setText(SystemClass.displayCalculation());
        
        this.syrup.setEnabled(false);

    }//GEN-LAST:event_syrupActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Frappucino" , 18,"Vanilla Cream Frappuccino");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton72ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Frappucino" , 20,"Toffee Nut Frappuccino");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Frappucino" , 19, "Strawberries & Cream Frappuccino");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Frappucino" , 17,"Caramel Frappuccino");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Frappucino" , 17,"Chai Cream Frappuccino");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Çay" ,12 ,"English Breakfast");
        actionPerformed(drink);
        size.setEnabled(true);
        
    }//GEN-LAST:event_jButton80ActionPerformed

    private void jButton84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton84ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Çay", 19, "Peach Green Tea & Lemonade");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton84ActionPerformed

    private void jButton81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton81ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Çay", 12, "Earl Grey");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton81ActionPerformed

    private void jButton85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton85ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Çay", 17, "Iced Shaken Black Tea");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton85ActionPerformed

    private void jButton82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton82ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Çay", 17, "Hibiscus");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton82ActionPerformed

    private void jButton86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton86ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Çay", 17, "Hibiscus");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton86ActionPerformed

    private void jButton83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton83ActionPerformed
        // TODO add your handling code here:
        Drinks drink= new Drinks("Çay", 17, "Youthberry");
        actionPerformed(drink);
        size.setEnabled(true);
    }//GEN-LAST:event_jButton83ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
          PacketedProducts packetedProducts = new PacketedProducts("Ethiopia", "Medium", 36);
       
        actionPerformed(packetedProducts); 
        addConditionStar();
    }//GEN-LAST:event_jButton44ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static  Client loginClient = null;
    public static ClientRepository repo;
    
    public static void main(String args[]) {
        //starting db issues do not modify -Burak
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(CafeManagementGUI.class,args);
        repo = configurableApplicationContext.getBean(ClientRepository.class);
        
        error= new JFrame();
        loadData(repo);
        SystemClass sClass= new SystemClass();
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CafeManagementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CafeManagementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CafeManagementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CafeManagementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CafeManagementGUI().setVisible(true);
                sClass.setTime();
                
                
                
            }
        });
    }
    
    //it opens our github profiles. do not modify -Burak
   private static void open(URI uri) {
    if (Desktop.isDesktopSupported()) {
      try {
        Desktop.getDesktop().browse(uri);
      } catch (IOException e) { /* TODO: error handling */ }
    } else { /* TODO: error handling */ }
  }
   
   //if there is no data it'll create fake sample for Evren Hoca - Burak
   private static void loadData( ClientRepository  clientRepository){
      
     if(clientRepository.findAll().isEmpty() ){
            Client c = new Client("5462188698","Halit Burak Yeşildal", 250);
            clientRepository.save(c);
            Client c2= new Client("5436684264","Melis Alpkaya",500);
            clientRepository.save(c2);
            Client c3 = new Client("5538067619","Ali Er",0);
            clientRepository.save(c3);
            Client c4= new Client("5350517263","Behlül Mansur Çıldır",10);
           clientRepository.save(c4);
    } 
   
     
   
   
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JCheckBox ahududu;
    private javax.swing.JPanel allpan;
    private javax.swing.JRadioButton bademsutu;
    private javax.swing.JCheckBox beyazcikolata;
    private javax.swing.JButton bkurabiye;
    private javax.swing.JButton bkurabiye2;
    private javax.swing.JButton bkurabiye3;
    private javax.swing.JButton bkurabiye4;
    private javax.swing.JPanel blondepan;
    private javax.swing.JButton bpasta;
    private javax.swing.JButton bpasta1;
    private javax.swing.JButton bpasta2;
    private javax.swing.JButton bpasta3;
    private javax.swing.JButton bsalata;
    private javax.swing.JButton bsalata1;
    private javax.swing.JButton bsalata2;
    private javax.swing.JButton bsalata3;
    private javax.swing.JButton bsandavic;
    private javax.swing.JButton bsandavic1;
    private javax.swing.JButton bsandavic2;
    private javax.swing.JButton bsandavic3;
    public javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel buttonpan;
    private javax.swing.JRadioButton buyuk;
    private javax.swing.JTextArea calculation;
    private javax.swing.JCheckBox cikolata;
    private javax.swing.JCheckBox cilek;
    private javax.swing.JPanel darkpan;
    private javax.swing.JCheckBox findik;
    private static javax.swing.JLayeredPane girispan;
    private javax.swing.JPanel hediyelik;
    private javax.swing.JCheckBox hindistancevizi;
    private javax.swing.JButton icecekb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton103;
    private javax.swing.JButton jButton104;
    private javax.swing.JButton jButton105;
    private javax.swing.JButton jButton106;
    private javax.swing.JButton jButton107;
    private javax.swing.JButton jButton108;
    private javax.swing.JButton jButton109;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton110;
    private javax.swing.JButton jButton111;
    private javax.swing.JButton jButton112;
    private javax.swing.JButton jButton113;
    private javax.swing.JButton jButton114;
    private javax.swing.JButton jButton115;
    private javax.swing.JButton jButton116;
    private javax.swing.JButton jButton117;
    private javax.swing.JButton jButton118;
    private javax.swing.JButton jButton119;
    private javax.swing.JButton jButton120;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JButton jButton_AnanaslıChiaPuding;
    private javax.swing.JButton jButton_BrownieCheesecake;
    private javax.swing.JButton jButton_DopdoluFitCookie;
    private javax.swing.JButton jButton_EzineliSandvic;
    private javax.swing.JButton jButton_Fiesta;
    private javax.swing.JButton jButton_IzgaraTavukluSalata;
    private javax.swing.JButton jButton_KinoalıSalata;
    private javax.swing.JButton jButton_KremalıHavucluKek;
    private javax.swing.JButton jButton_Kupa;
    private javax.swing.JButton jButton_LimonluCheesecake;
    private javax.swing.JButton jButton_MeyveliveYogurtluParfe;
    private javax.swing.JButton jButton_MistoCookie;
    private javax.swing.JButton jButton_MozarellaSandvic;
    private javax.swing.JButton jButton_ProfiterolluPasta;
    private javax.swing.JButton jButton_ReyhanliTost;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    public static javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    public static javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton kahvelerb;
    private javax.swing.JCheckBox karamel;
    private javax.swing.JRadioButton kucuk;
    private javax.swing.JPanel kurabiye;
    private javax.swing.JRadioButton laktozsuz;
    private javax.swing.JPanel mediumpan;
    private javax.swing.JButton milk;
    public static java.awt.TextArea order;
    private javax.swing.JRadioButton orta;
    private javax.swing.JLayeredPane paketkahvepan;
    private javax.swing.JPanel pancay;
    private javax.swing.JLayeredPane panedrink;
    private javax.swing.JLayeredPane panefood;
    private javax.swing.JPanel panespresso;
    private javax.swing.JPanel panfrapp;
    private javax.swing.JPanel pansise;
    private javax.swing.JPanel panturkkahve;
    private javax.swing.JPanel pasta;
    private javax.swing.JPanel salata;
    private javax.swing.JPanel sandavic;
    private javax.swing.JButton siparisreset;
    private javax.swing.JButton size;
    private javax.swing.JRadioButton soyasutu;
    private javax.swing.JButton syrup;
    public static javax.swing.JTextArea userData;
    public static javax.swing.JPanel userpan;
    private javax.swing.JButton uyeg;
    private javax.swing.JCheckBox vanilya;
    private javax.swing.JRadioButton yagli;
    private javax.swing.JRadioButton yagsiz;
    private javax.swing.JRadioButton yarimyagli;
    private javax.swing.JButton yenig;
    private javax.swing.JButton yenisiparis;
    private javax.swing.JButton yiyecekb;
    // End of variables declaration//GEN-END:variables
  
    
}
