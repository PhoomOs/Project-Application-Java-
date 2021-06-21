package projectjava;

import java.sql.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
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

public class Book extends javax.swing.JFrame {

    public Book() {
        setTitle("Books Product");
        initComponents();

    }

    public void setHeightText(String HeightText) {
        this.HeightText.setText(HeightText);
    }

    public void setISBNText(String ISBNText) {
        this.ISBNText.setText(ISBNText);
    }

    public void setPaymentsText(String PaymentsText) {
        this.PaymentsText.setText(PaymentsText);
    }

    public void setPromotionText(String PromotionText) {
        this.PromotionText.setText(PromotionText);
    }

    public void setWidthText(String WidthText) {
        this.WidthText.setText(WidthText);
    }

    public void setAuthorText(String authorText) {
        this.authorText.setText(authorText);
    }

    public void setPaperTypeText(String paperTypeText) {
        this.paperTypeText.setText(paperTypeText);
    }

    public void setPriceText(String priceText) {
        this.priceText.setText(priceText);
    }

    public void setPublicationDateText(String publicationDateText) {
        try {
            java.util.Date a = new SimpleDateFormat("MMM dd yyyy").parse(publicationDateText);
            publicationDateTextt.setDate(a);
        } catch (Exception e) {
            System.out.print(e);
        }

    }

    public void setSubjectText(String subjectText) {
        this.subjectText.setText(subjectText);
    }

    public void setSynopsisText(String synopsisText) {
        this.synopsisText.setText(synopsisText);
    }

    public void setWeightText(String weightText) {
        this.weightText.setText(weightText);
    }

    public static void theQuery(String query) {
        Connection con = null;
        Statement st = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/projectjava", "root", "");
            st = con.createStatement();
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Query Executed");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public JTextField getSubjectText() {
        return subjectText;
    }

    public JTextField getISBNText() {
        return ISBNText;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        subject = new javax.swing.JLabel();
        subjectText = new javax.swing.JTextField();
        synopsis = new javax.swing.JLabel();
        author = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        synopsisText = new javax.swing.JTextArea();
        authorText = new javax.swing.JTextField();
        ISBN = new javax.swing.JLabel();
        ISBNText = new javax.swing.JTextField();
        paperType = new javax.swing.JLabel();
        paperTypeText = new javax.swing.JTextField();
        price = new javax.swing.JLabel();
        priceText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        weight = new javax.swing.JLabel();
        weightText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        publicationDate = new javax.swing.JLabel();
        Dimensions = new javax.swing.JLabel();
        Height = new javax.swing.JLabel();
        Width = new javax.swing.JLabel();
        HeightText = new javax.swing.JTextField();
        WidthText = new javax.swing.JTextField();
        Promotion = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        PromotionText = new javax.swing.JTextArea();
        Payments = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PaymentsText = new javax.swing.JTextArea();
        ComboBox = new javax.swing.JComboBox<>();
        currency = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        publicationDateTextt = new com.toedter.calendar.JDateChooser();

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
        setMaximumSize(null);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setForeground(java.awt.Color.green);

        jLabel1.setBackground(java.awt.Color.pink);
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 28)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sound/BkBookss.png"))); // NOI18N
        jLabel1.setText("Bookstore");

        subject.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        subject.setForeground(java.awt.Color.green);
        subject.setText("Subject : ");

        subjectText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectTextActionPerformed(evt);
            }
        });

        synopsis.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        synopsis.setForeground(java.awt.Color.green);
        synopsis.setText("Synopsis :");

        author.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        author.setForeground(java.awt.Color.green);
        author.setText("Author :");

        synopsisText.setColumns(20);
        synopsisText.setRows(5);
        jScrollPane1.setViewportView(synopsisText);

        ISBN.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        ISBN.setForeground(java.awt.Color.green);
        ISBN.setText("ISBN : ");

        paperType.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        paperType.setForeground(java.awt.Color.green);
        paperType.setText("Paper Type :");

        price.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
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

        weight.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        weight.setForeground(java.awt.Color.green);
        weight.setText("Weight :");

        weightText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightTextActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel10.setForeground(java.awt.Color.green);
        jLabel10.setText("g.");

        publicationDate.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        publicationDate.setForeground(java.awt.Color.green);
        publicationDate.setText("Publication Date :");

        Dimensions.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 15)); // NOI18N
        Dimensions.setForeground(java.awt.Color.green);
        Dimensions.setText("Dimensions : ");

        Height.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        Height.setForeground(java.awt.Color.cyan);
        Height.setText("Height");

        Width.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        Width.setForeground(java.awt.Color.cyan);
        Width.setText("Width");

        Promotion.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        Promotion.setForeground(java.awt.Color.green);
        Promotion.setText("Promotion :");

        PromotionText.setColumns(20);
        PromotionText.setRows(5);
        jScrollPane3.setViewportView(PromotionText);

        Payments.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        Payments.setForeground(java.awt.Color.green);
        Payments.setText("Payments :");

        PaymentsText.setColumns(20);
        PaymentsText.setRows(5);
        jScrollPane2.setViewportView(PaymentsText);

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "THB", "USD", "HKD", "JPY" }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });

        currency.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        currency.setForeground(java.awt.Color.cyan);
        currency.setText("THB");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("mm.");

        publicationDateTextt.setDateFormatString("MMM dd yyyy");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paperType)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(synopsis, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(author)
                                .addComponent(ISBN))
                            .addComponent(price)
                            .addComponent(subject)
                            .addComponent(weight)
                            .addComponent(publicationDate))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subjectText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(authorText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paperTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ISBNText, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(95, 95, 95)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Dimensions)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(Height)
                                        .addGap(18, 18, 18)
                                        .addComponent(HeightText, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(Width)
                                        .addGap(18, 18, 18)
                                        .addComponent(WidthText, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(Promotion)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jScrollPane3))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(Payments)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(currency, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(publicationDateTextt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(weightText, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subject)
                    .addComponent(subjectText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dimensions))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(synopsis)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paperTypeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paperType))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(author)
                                    .addComponent(authorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Promotion))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ISBN)
                                    .addComponent(ISBNText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Height)
                            .addComponent(HeightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Width)
                            .addComponent(WidthText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Payments)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(publicationDate)
                    .addComponent(publicationDateTextt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weight)
                    .addComponent(weightText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currency))
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subjectTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectTextActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        //////////SOUND///////////
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

        String a = subject.getText() + "    " + subjectText.getText() + "\n\n" + synopsis.getText() + "    " + synopsisText.getText() + "\n\n" + paperType.getText() + "    " + paperTypeText.getText() + "\n\n" + author.getText() + "    " + authorText.getText() + "\n\n" + ISBN.getText() + "    " + ISBNText.getText() + "\n\n" + publicationDate.getText() + "    " + ((JTextField) publicationDateTextt.getDateEditor().getUiComponent()).getText() + "\n\n" + weight.getText() + "    " + weightText.getText() + " g.\n\n" + price.getText() + "    " + priceText.getText() + "    " + currency.getText() + "\n\n" + Dimensions.getText() + "    " + HeightText.getText() + "  x  " + WidthText.getText() + " mm." + "\n\n" + Payments.getText() + "    " + PaymentsText.getText() + "\n\n" + Promotion.getText() + "    " + PromotionText.getText();
        ByteArrayOutputStream out = QRCode.from(a).to(ImageType.JPG).stream();
        //////Select Save File///////
        JFileChooser fc = new JFileChooser();
        fc.showSaveDialog(this);

        File f = fc.getSelectedFile();//new File(str);
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            fos.write(out.toByteArray());
        } catch (IOException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            fos.flush();
        } catch (IOException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "Create Complete!!");
        setVisible(false);

        String aaa = String.format("insert into bookstore(subject,synopsis,paper,author,isbn,publication,weight,price,height,width,payment,promotion) values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s')", subjectText.getText(),
                 synopsisText.getText(), paperTypeText.getText(), authorText.getText(), ISBNText.getText(), ((JTextField) publicationDateTextt.getDateEditor().getUiComponent()).getText(),
                 weightText.getText(), priceText.getText(), HeightText.getText(), WidthText.getText(), PaymentsText.getText(), PromotionText.getText());
        try {
            theQuery(aaa);
        } catch (Exception e) {

        }

        listDb.showDataFrom();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void weightTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightTextActionPerformed

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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JLabel Dimensions;
    private javax.swing.JLabel Height;
    private javax.swing.JTextField HeightText;
    private javax.swing.JLabel ISBN;
    private javax.swing.JTextField ISBNText;
    private javax.swing.JLabel Payments;
    private javax.swing.JTextArea PaymentsText;
    private javax.swing.JLabel Promotion;
    private javax.swing.JTextArea PromotionText;
    private javax.swing.JLabel Width;
    private javax.swing.JTextField WidthText;
    private javax.swing.JLabel author;
    private javax.swing.JTextField authorText;
    private javax.swing.JLabel currency;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel paperType;
    private javax.swing.JTextField paperTypeText;
    private javax.swing.JLabel price;
    private javax.swing.JTextField priceText;
    private javax.swing.JLabel publicationDate;
    private com.toedter.calendar.JDateChooser publicationDateTextt;
    private javax.swing.JLabel subject;
    private javax.swing.JTextField subjectText;
    private javax.swing.JLabel synopsis;
    private javax.swing.JTextArea synopsisText;
    private javax.swing.JLabel weight;
    private javax.swing.JTextField weightText;
    // End of variables declaration//GEN-END:variables
}
