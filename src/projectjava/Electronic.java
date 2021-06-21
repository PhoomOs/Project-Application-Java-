package projectjava;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;
import static projectjava.Book.theQuery;
import sun.audio.*;

public class Electronic extends javax.swing.JFrame {

    public Electronic() {
        setTitle("Books Product");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Brand = new javax.swing.JLabel();
        BrandText = new javax.swing.JTextField();
        Model = new javax.swing.JLabel();
        Watt = new javax.swing.JLabel();
        WattText = new javax.swing.JTextField();
        Ampere = new javax.swing.JLabel();
        AmpereText = new javax.swing.JTextField();
        Voltage = new javax.swing.JLabel();
        VoltageText = new javax.swing.JTextField();
        price = new javax.swing.JLabel();
        priceText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        weight = new javax.swing.JLabel();
        WeightText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Color = new javax.swing.JLabel();
        ColorText = new javax.swing.JTextField();
        Size = new javax.swing.JLabel();
        Height = new javax.swing.JLabel();
        Width = new javax.swing.JLabel();
        HeightText = new javax.swing.JTextField();
        WidthText = new javax.swing.JTextField();
        ProductWarranty = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ProductWarrantyText = new javax.swing.JTextArea();
        Description = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DescriptionText = new javax.swing.JTextArea();
        ComboBox = new javax.swing.JComboBox<>();
        currency = new javax.swing.JLabel();
        ModelText = new javax.swing.JTextField();
        Payment = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PaymentText = new javax.swing.JTextArea();
        Product = new javax.swing.JLabel();
        ProductText = new javax.swing.JTextField();

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(120, 120, 120));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(700, 300));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setForeground(java.awt.Color.green);

        jLabel1.setBackground(new java.awt.Color(44, 80, 120));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 28)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sound/brandd.png"))); // NOI18N
        jLabel1.setText("Electronic");

        Brand.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        Brand.setForeground(java.awt.Color.green);
        Brand.setText("Brand :");

        BrandText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandTextActionPerformed(evt);
            }
        });

        Model.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        Model.setForeground(java.awt.Color.green);
        Model.setText("Model : ");

        Watt.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        Watt.setForeground(java.awt.Color.green);
        Watt.setText("Watt (W) :");

        Ampere.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        Ampere.setForeground(java.awt.Color.green);
        Ampere.setText("Ampere (A) :");

        Voltage.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        Voltage.setForeground(java.awt.Color.green);
        Voltage.setText("Voltage (V) :");

        price.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        price.setForeground(java.awt.Color.green);
        price.setText("Price :");

        jButton1.setBackground(new java.awt.Color(0, 168, 130));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(java.awt.Color.white);
        jButton1.setText("Create QR-code");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        weight.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        weight.setForeground(java.awt.Color.green);
        weight.setText("Weight :");

        WeightText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeightTextActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(java.awt.Color.green);
        jLabel10.setText("kg.");

        Color.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        Color.setForeground(java.awt.Color.green);
        Color.setText("Color :");

        Size.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Size.setForeground(java.awt.Color.green);
        Size.setText("Size :");

        Height.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        Height.setForeground(java.awt.Color.cyan);
        Height.setText("Height");

        Width.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        Width.setForeground(java.awt.Color.cyan);
        Width.setText("Width");

        ProductWarranty.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        ProductWarranty.setForeground(java.awt.Color.green);
        ProductWarranty.setText("Product warranty :");

        ProductWarrantyText.setColumns(20);
        ProductWarrantyText.setRows(5);
        jScrollPane3.setViewportView(ProductWarrantyText);

        Description.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        Description.setForeground(java.awt.Color.green);
        Description.setText("Description: ");

        DescriptionText.setColumns(20);
        DescriptionText.setRows(5);
        jScrollPane2.setViewportView(DescriptionText);

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "THB", "USD", "HKD", "JPY" }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });

        currency.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        currency.setForeground(java.awt.Color.cyan);
        currency.setText("THB");

        ModelText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModelTextActionPerformed(evt);
            }
        });

        Payment.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        Payment.setForeground(java.awt.Color.green);
        Payment.setText("Payment :");

        PaymentText.setColumns(20);
        PaymentText.setRows(5);
        jScrollPane1.setViewportView(PaymentText);

        Product.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        Product.setForeground(java.awt.Color.green);
        Product.setText("Product of ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Height)
                .addGap(18, 18, 18)
                .addComponent(HeightText, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Width)
                .addGap(18, 18, 18)
                .addComponent(WidthText, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Watt)
                    .addComponent(Ampere)
                    .addComponent(price)
                    .addComponent(Brand)
                    .addComponent(weight)
                    .addComponent(Color)
                    .addComponent(Voltage)
                    .addComponent(Model)
                    .addComponent(Product))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BrandText, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(WattText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AmpereText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ColorText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ModelText)
                            .addComponent(VoltageText, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(Size))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Description)
                                                .addComponent(ProductWarranty)
                                                .addComponent(Payment))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(36, 36, 36)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                            .addComponent(jScrollPane3)
                                            .addComponent(jScrollPane1)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(WeightText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(priceText, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(ProductText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(currency, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Brand)
                    .addComponent(BrandText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Size))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Height)
                    .addComponent(HeightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Width)
                    .addComponent(WidthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Model)
                        .addComponent(ModelText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Voltage)
                                .addComponent(VoltageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Description))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Watt)
                    .addComponent(WattText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ProductWarranty)
                                .addGap(73, 73, 73))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Ampere)
                                    .addComponent(AmpereText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Color)
                            .addComponent(ColorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Payment)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weight)
                            .addComponent(WeightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Product)
                            .addComponent(ProductText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currency)
                    .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BrandTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrandTextActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    public void setAmpereText(String AmpereText) {
        this.AmpereText.setText(AmpereText);
    }

    public void setWattText(String WattText) {
        this.WattText.setText(WattText);
    }

    public void setPriceText(String priceText) {
        this.priceText.setText(priceText);
    }

    public void setBrandText(String BrandText) {
        this.BrandText.setText(BrandText);
    }

    public JTextField getModelText() {
        return ModelText;
    }

    public void setColorText(String ColorText) {
        this.ColorText.setText(ColorText);
    }

    public void setDescriptionText(String DescriptionText) {
        this.DescriptionText.setText(DescriptionText);
    }

    public void setHeightText(String HeightText) {
        this.HeightText.setText(HeightText);
    }

    public void setModelText(String ModelText) {
        this.ModelText.setText(ModelText);
    }

    public void setPaymentText(String PaymentText) {
        this.PaymentText.setText(PaymentText);
    }

    public void setProductText(String ProductText) {
        this.ProductText.setText(ProductText);
    }

    public void setProductWarrantyText(String ProductWarrantyText) {
        this.ProductWarrantyText.setText(ProductWarrantyText);
    }

    public void setVoltageText(String VoltageText) {
        this.VoltageText.setText(VoltageText);
    }

    public void setWeightText(String WeightText) {
        this.WeightText.setText(WeightText);
    }

    public void setWidthText(String WidthText) {
        this.WidthText.setText(WidthText);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        File file = new File("E:\\NetBeansProjects\\EX\\ProjectJAVA\\src\\projectjava\\Click.wav");
        Clip clip = null;
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            Logger.getLogger(ProjectJAVA.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            clip.open(AudioSystem.getAudioInputStream(file));
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(ProjectJAVA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProjectJAVA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(ProjectJAVA.class.getName()).log(Level.SEVERE, null, ex);
        }
        clip.start();

        try {
            Thread.sleep(clip.getMicrosecondPosition());
        } catch (InterruptedException ex) {
            Logger.getLogger(ProjectJAVA.class.getName()).log(Level.SEVERE, null, ex);
        }

        JFileChooser fc = new JFileChooser();
        fc.showSaveDialog(this);

        String a = Brand.getText() + "    " + BrandText.getText() + "\n\n" + Model.getText() + "    " + ModelText.getText() + "\n\n" + Voltage.getText() + "    " + VoltageText.getText() + "\n\n" + Watt.getText() + "    " + WattText.getText() + "\n\n" + Ampere.getText() + "  " + AmpereText.getText() + "\n\n" + Color.getText() + "    " + ColorText.getText() + "\n\n" + weight.getText() + "    " + WeightText.getText() + " kg.\n\n" + Product.getText() + ProductText.getText() + "\n\n" + price.getText() + "    " + priceText.getText() + "    " + currency.getText() + "\n\n" + Size.getText() + "    " + HeightText.getText() + "  x  " + WidthText.getText() + " mm." + "\n\n" + Description.getText() + "    " + DescriptionText.getText() + "\n\n" + ProductWarranty.getText() + "    " + ProductWarrantyText.getText() + "\n\n" + Payment.getText() + "    " + PaymentText.getText();
        ByteArrayOutputStream out = QRCode.from(a).to(ImageType.JPG).stream();

        File f = fc.getSelectedFile();
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Electronic.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            fos.write(out.toByteArray());
        } catch (IOException ex) {
            Logger.getLogger(Electronic.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fos.flush();
        } catch (IOException ex) {
            Logger.getLogger(Electronic.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "Create Complete!!");
        setVisible(false);

        String aaa = String.format("insert into electronic(brand,model,voltage,watt,ampare,color,weight,product,price,hieght,width,description,productWarranty,payment) values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')", BrandText.getText(),
                 ModelText.getText(), VoltageText.getText(), WattText.getText(), AmpereText.getText(), ColorText.getText(),
                 WeightText.getText(), ProductText.getText(), priceText.getText(), HeightText.getText(), WidthText.getText(), DescriptionText.getText(), ProductWarrantyText.getText(), PaymentText.getText());
        try {
            theQuery(aaa);//"insert into bookstore(subject,synopsis,paper,author,isbn,publication,weight,price,height,width,payment,promotion));//values('"+subjectText.getText()+"','"
            //+synopsisText.getText()+"','"+paperTypeText.getText()+"','"+authorText.getText()+"','"+ISBNText.getText()+"','"+publicationDateText.getText()+"','"
            //+weightText.getText()+"','"+priceText.getText()+"','"+HeightText.getText()+"','"+WidthText.getText()+"','"+PaymentsText.getText()+"',"+PromotionText.getText()+")");
        } catch (Exception e) {

        }
        ElecDb.showDataFrom();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void WeightTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WeightTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WeightTextActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
        String msg = (String) ComboBox.getSelectedItem();
        switch (msg) {
            case "THB":
                currency.setText("THB");
                break;
            case "USD":
                currency.setText("USD");
                break;
            case "HKD":
                currency.setText("HKD");
                break;
            case "JPY":
                currency.setText("JPY");
                break;
        }


    }//GEN-LAST:event_ComboBoxActionPerformed

    private void ModelTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModelTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModelTextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Electronic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Electronic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Electronic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Electronic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Electronic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ampere;
    private javax.swing.JTextField AmpereText;
    private javax.swing.JLabel Brand;
    private javax.swing.JTextField BrandText;
    private javax.swing.JLabel Color;
    private javax.swing.JTextField ColorText;
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JLabel Description;
    private javax.swing.JTextArea DescriptionText;
    private javax.swing.JLabel Height;
    private javax.swing.JTextField HeightText;
    private javax.swing.JLabel Model;
    private javax.swing.JTextField ModelText;
    private javax.swing.JLabel Payment;
    private javax.swing.JTextArea PaymentText;
    private javax.swing.JLabel Product;
    private javax.swing.JTextField ProductText;
    private javax.swing.JLabel ProductWarranty;
    private javax.swing.JTextArea ProductWarrantyText;
    private javax.swing.JLabel Size;
    private javax.swing.JLabel Voltage;
    private javax.swing.JTextField VoltageText;
    private javax.swing.JLabel Watt;
    private javax.swing.JTextField WattText;
    private javax.swing.JTextField WeightText;
    private javax.swing.JLabel Width;
    private javax.swing.JTextField WidthText;
    private javax.swing.JLabel currency;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel price;
    private javax.swing.JTextField priceText;
    private javax.swing.JLabel weight;
    // End of variables declaration//GEN-END:variables
}
