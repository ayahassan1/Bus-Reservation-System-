/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static Bus_Reservation_System.Bus_Reservation_System.*;
import static Bus_Reservation_System.Bus_Reservation_System.upload_customers_data;
import Person.Admin;
import Person.Customer;
import Person.Driver;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.UnsupportedLookAndFeelException;


public class Login_form extends javax.swing.JFrame {

    public Login_form() {
        initComponents();   
         ImageIcon myimage4=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Capture26.jpg")));    
        Image img9=myimage4.getImage();
           Image img10=img9.getScaledInstance(slidershow4.getWidth(), slidershow4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon IMG4=new ImageIcon(img10);
        slidershow4.setIcon(IMG4);
        
       Show_SignUp.setBackground(new Color(1, 50, 67,110));

       SignUp_SignIn1.setVisible(false);
       enterData_SignUp.setVisible(false);
       nameerror.setVisible(false);  passworderror.setVisible(false);
       ageerror.setVisible(false);
       mailerror.setVisible(false);        
       mailerror.setVisible(false);        
       usernameerror.setVisible(false);
       phoneerror.setVisible(false);
       nationaliderror.setVisible(false);
       visanumerror.setVisible(false);
       visapassworderror.setVisible(false);
       locationerror.setVisible(false);
     
       sign_UPBTN2.setEnabled(false);
       forgetpasswordpanel.setVisible(false);
       sign_inBTN1.setEnabled(false);
              finalsend.setEnabled(false);       finalsend2.setEnabled(false); 
       slideshow_imges();
        
    }
 public void slideshow_imges(){
    
    new Thread(){
        int count;
    @Override
    public  void run(){
    
    try{
        while (true){
              Thread.sleep(2000);
                         ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Capture25.jpg")));
        Image img1=myimage.getImage();
           Image img2=img1.getScaledInstance(slidershow.getWidth(), slidershow.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon IMG=new ImageIcon(img2);
        slidershow.setIcon(IMG);  Thread.sleep(1000);
        slidershow.setVisible(true);
        Thread.sleep(2000);
        
             ImageIcon myimage1=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Capture28.jpg")));
        Image img3=myimage1.getImage();
           Image img4=img3.getScaledInstance(slidershow1.getWidth(), slidershow1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon IMG1=new ImageIcon(img4);  Thread.sleep(1000);
        slidershow1.setIcon(IMG1);
           Thread.sleep(2000);
        slidershow1.setVisible(true);
       slidershow.setVisible(false);
          slidershow2.setVisible(false);    slidershow3.setVisible(false);    slidershow4.setVisible(false);    slidershow5.setVisible(false);
           
             Thread.sleep(2000);
         ImageIcon myimage2=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Capture21.PNG")));
        Image img5=myimage2.getImage();
           Image img6=img5.getScaledInstance(slidershow2.getWidth(), slidershow2.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon IMG2=new ImageIcon(img6);
        slidershow2.setIcon(IMG2);  Thread.sleep(1000);
               slidershow1.setVisible(false);
        slidershow.setVisible(false);
           slidershow2.setVisible(true);    slidershow3.setVisible(false);    slidershow4.setVisible(false);    slidershow5.setVisible(false);
        
                     Thread.sleep(2000);

         ImageIcon myimage3=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Capture19.PNG")));
        
        Image img7=myimage3.getImage();
           Image img8=img7.getScaledInstance(slidershow3.getWidth(), slidershow3.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon IMG3=new ImageIcon(img8);
        slidershow3.setIcon(IMG3);
         Thread.sleep(1000);
                          slidershow1.setVisible(false);
        slidershow.setVisible(false);
           slidershow2.setVisible(false);    slidershow3.setVisible(true);    slidershow4.setVisible(false);    slidershow5.setVisible(false);
    Thread.sleep(2000);
     
         ImageIcon myimage5=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Capture23.PNG")));
        
        Image img11=myimage5.getImage();
           Image img12=img11.getScaledInstance(slidershow5.getWidth(), slidershow5.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon IMG5=new ImageIcon(img12);
        slidershow5.setIcon(IMG5);
Thread.sleep(1000);
               slidershow1.setVisible(false);
        slidershow.setVisible(false);
           slidershow2.setVisible(false);    slidershow3.setVisible(false);    slidershow4.setVisible(false);    slidershow5.setVisible(true);
             Thread.sleep(2000);
          
         ImageIcon myimage4=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Capture26.jpg")));    
        Image img9=myimage4.getImage();
           Image img10=img9.getScaledInstance(slidershow4.getWidth(), slidershow4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon IMG4=new ImageIcon(img10);
        slidershow4.setIcon(IMG4);    Thread.sleep(1000);
               slidershow1.setVisible(false);
        slidershow.setVisible(false);
           slidershow2.setVisible(false);    slidershow3.setVisible(false);    slidershow4.setVisible(true);    slidershow5.setVisible(false);
             Thread.sleep(2000);
           
           
       
         ImageIcon myimage7=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Capture7.PNG")));    
        Image img13=myimage7.getImage();
           Image img14=img13.getScaledInstance(slidershow6.getWidth(), slidershow6.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon IMG15=new ImageIcon(img14);
        slidershow6.setIcon(IMG15);
    Thread.sleep(1000);
               slidershow1.setVisible(false);
        slidershow.setVisible(false);
           slidershow2.setVisible(false);    slidershow3.setVisible(false);    slidershow4.setVisible(false);    slidershow5.setVisible(false);  slidershow6.setVisible(true);
      Thread.sleep(2000);
        }
    
    }catch(Exception ex){
    
    
    }
    }
   }.start();
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterData_SignUp = new javax.swing.JPanel();
        email = new javax.swing.JLabel();
        mailtxt2 = new javax.swing.JTextField();
        agelbl2 = new javax.swing.JLabel();
        mailseparator = new javax.swing.JSeparator();
        visanumberseparator = new javax.swing.JSeparator();
        phonesys2 = new javax.swing.JLabel();
        mailsys2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        privacylbl2 = new javax.swing.JLabel();
        sign_UPBTN2 = new javax.swing.JButton();
        facebooklink2 = new javax.swing.JLabel();
        twitterlink2 = new javax.swing.JLabel();
        Gpluslink2 = new javax.swing.JLabel();
        phonelbl3 = new javax.swing.JLabel();
        visaPassword = new javax.swing.JPasswordField();
        phoneseparator = new javax.swing.JSeparator();
        phonetxt = new javax.swing.JTextField();
        namelbl = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        nameerror = new javax.swing.JLabel();
        nameseparator = new javax.swing.JSeparator();
        usernamelbl2 = new javax.swing.JLabel();
        usernametxt5 = new javax.swing.JTextField();
        usernameseparator4 = new javax.swing.JSeparator();
        gender = new javax.swing.JComboBox<>();
        nationalidibi = new javax.swing.JLabel();
        nationalid1 = new javax.swing.JTextField();
        nationalidseparator = new javax.swing.JSeparator();
        locationlbl6 = new javax.swing.JLabel();
        location = new javax.swing.JTextField();
        locationseparator = new javax.swing.JSeparator();
        visapasswordlbl4 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        ageseparator = new javax.swing.JSeparator();
        passwordlbl2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        passwordseparator4 = new javax.swing.JSeparator();
        Visanumlbl = new javax.swing.JLabel();
        visanum = new javax.swing.JTextField();
        visapasswordseparator5 = new javax.swing.JSeparator();
        passworderror = new javax.swing.JLabel();
        mailerror = new javax.swing.JLabel();
        usernameerror = new javax.swing.JLabel();
        ageerror = new javax.swing.JLabel();
        visanumerror = new javax.swing.JLabel();
        visapassworderror = new javax.swing.JLabel();
        phoneerror = new javax.swing.JLabel();
        nationaliderror = new javax.swing.JLabel();
        locationerror = new javax.swing.JLabel();
        SignUp_SignIn1 = new javax.swing.JPanel();
        Show_SignUp1 = new javax.swing.JPanel();
        hellofriends3 = new javax.swing.JLabel();
        Intro1 = new javax.swing.JLabel();
        Intro3 = new javax.swing.JLabel();
        bustra3 = new javax.swing.JLabel();
        SigninBTN1 = new javax.swing.JButton();
        slidershow11 = new javax.swing.JLabel();
        slidershow7 = new javax.swing.JLabel();
        slidershow9 = new javax.swing.JLabel();
        slidershow12 = new javax.swing.JLabel();
        slidershow10 = new javax.swing.JLabel();
        slidershow8 = new javax.swing.JLabel();
        slidershow13 = new javax.swing.JLabel();
        SignUp_SignIn = new javax.swing.JPanel();
        Show_SignUp = new javax.swing.JPanel();
        hellofriends2 = new javax.swing.JLabel();
        Intro = new javax.swing.JLabel();
        Intro2 = new javax.swing.JLabel();
        bustra2 = new javax.swing.JLabel();
        SignupBTN = new javax.swing.JButton();
        slidershow = new javax.swing.JLabel();
        slidershow1 = new javax.swing.JLabel();
        slidershow2 = new javax.swing.JLabel();
        slidershow3 = new javax.swing.JLabel();
        slidershow4 = new javax.swing.JLabel();
        slidershow5 = new javax.swing.JLabel();
        slidershow6 = new javax.swing.JLabel();
        enterData_SignIn = new javax.swing.JPanel();
        passwordlbl = new javax.swing.JLabel();
        passwordseparator = new javax.swing.JSeparator();
        passwordtxt = new javax.swing.JPasswordField();
        phonesys = new javax.swing.JLabel();
        mailsys = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        privacylbl = new javax.swing.JLabel();
        facebooklink = new javax.swing.JLabel();
        twitterlink = new javax.swing.JLabel();
        Gpluslink = new javax.swing.JLabel();
        forgetpassword = new javax.swing.JCheckBox();
        usernameorpassworderrorsignin1 = new javax.swing.JLabel();
        usernameloginlbl1 = new javax.swing.JLabel();
        usernametxt1 = new javax.swing.JTextField();
        usernameseparator1 = new javax.swing.JSeparator();
        forgetpasswordpanel = new javax.swing.JPanel();
        emaillblforgetpassword1 = new javax.swing.JLabel();
        emailtxtforgetpassword = new javax.swing.JTextField();
        emailseparatorfogetpassword = new javax.swing.JSeparator();
        newpasswordlbl1 = new javax.swing.JLabel();
        newpasswordtxt1 = new javax.swing.JPasswordField();
        newpassworderror = new javax.swing.JLabel();
        newpasswordseparator1 = new javax.swing.JSeparator();
        emailrrorsignin = new javax.swing.JLabel();
        finalsend = new javax.swing.JButton();
        finalsend2 = new javax.swing.JButton();
        backlbl = new javax.swing.JLabel();
        sign_inBTN1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterData_SignUp.setBackground(new java.awt.Color(255, 255, 255));
        enterData_SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterData_SignUp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email.setFont(new java.awt.Font("Traditional Arabic", 0, 25)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 51));
        email.setText("E-mail");
        enterData_SignUp.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 100, 40));

        mailtxt2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        mailtxt2.setForeground(new java.awt.Color(0, 0, 102));
        mailtxt2.setBorder(null);
        mailtxt2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mailtxt2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mailtxt2FocusLost(evt);
            }
        });
        mailtxt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mailtxt2MouseClicked(evt);
            }
        });
        mailtxt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailtxt2ActionPerformed(evt);
            }
        });
        mailtxt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mailtxt2KeyReleased(evt);
            }
        });
        enterData_SignUp.add(mailtxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 290, 40));

        agelbl2.setBackground(new java.awt.Color(255, 255, 255));
        agelbl2.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        agelbl2.setForeground(new java.awt.Color(0, 0, 51));
        agelbl2.setText("Age");
        enterData_SignUp.add(agelbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 60, 50));

        mailseparator.setBackground(new java.awt.Color(204, 204, 204));
        mailseparator.setForeground(new java.awt.Color(204, 204, 204));
        enterData_SignUp.add(mailseparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 290, 10));

        visanumberseparator.setBackground(new java.awt.Color(204, 204, 204));
        visanumberseparator.setForeground(new java.awt.Color(204, 204, 204));
        enterData_SignUp.add(visanumberseparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 290, 10));

        phonesys2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phonesys2.setForeground(new java.awt.Color(153, 153, 153));
        phonesys2.setText("Phone: +20 1100615741");
        enterData_SignUp.add(phonesys2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 800, 220, 30));

        mailsys2.setBackground(new java.awt.Color(255, 255, 255));
        mailsys2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mailsys2.setForeground(new java.awt.Color(153, 153, 153));
        mailsys2.setText("e-mail: bustra@yahoo.com");
        mailsys2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mailsys2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mailsys2MouseClicked(evt);
            }
        });
        enterData_SignUp.add(mailsys2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 770, 250, 40));
        enterData_SignUp.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 770, 520, 10));

        privacylbl2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        privacylbl2.setForeground(new java.awt.Color(153, 153, 153));
        privacylbl2.setText("© 2019 Envato Pty Ltd. Trademarks and brands are the property of their respective owners. ");
        enterData_SignUp.add(privacylbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 840, -1, 40));

        sign_UPBTN2.setBackground(new java.awt.Color(0, 0, 51));
        sign_UPBTN2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        sign_UPBTN2.setForeground(new java.awt.Color(255, 255, 255));
        sign_UPBTN2.setText("SIGN UP");
        sign_UPBTN2.setActionCommand("SignUP");
        sign_UPBTN2.setBorder(null);
        sign_UPBTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_UPBTN2jButton2ActionPerformed(evt);
            }
        });
        enterData_SignUp.add(sign_UPBTN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 700, 300, 50));

        facebooklink2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Capture31.PNG"))); // NOI18N
        facebooklink2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facebooklink2MouseClicked(evt);
            }
        });
        enterData_SignUp.add(facebooklink2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 60, 70));

        twitterlink2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Capture33.PNG"))); // NOI18N
        twitterlink2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitterlink2MouseClicked(evt);
            }
        });
        enterData_SignUp.add(twitterlink2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 60, 60));

        Gpluslink2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Capture32.PNG"))); // NOI18N
        Gpluslink2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Gpluslink2MouseClicked(evt);
            }
        });
        enterData_SignUp.add(Gpluslink2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, 60));

        phonelbl3.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        phonelbl3.setForeground(new java.awt.Color(0, 0, 51));
        phonelbl3.setText("Phone");
        enterData_SignUp.add(phonelbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, 80, 40));

        visaPassword.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        visaPassword.setForeground(new java.awt.Color(0, 0, 102));
        visaPassword.setBorder(null);
        visaPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                visaPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                visaPasswordFocusLost(evt);
            }
        });
        visaPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visaPasswordMouseClicked(evt);
            }
        });
        visaPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visaPasswordActionPerformed(evt);
            }
        });
        visaPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                visaPasswordKeyReleased(evt);
            }
        });
        enterData_SignUp.add(visaPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, 290, 40));

        phoneseparator.setBackground(new java.awt.Color(204, 204, 204));
        phoneseparator.setForeground(new java.awt.Color(204, 204, 204));
        enterData_SignUp.add(phoneseparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, 290, 10));

        phonetxt.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        phonetxt.setForeground(new java.awt.Color(0, 0, 102));
        phonetxt.setBorder(null);
        phonetxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phonetxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phonetxtFocusLost(evt);
            }
        });
        phonetxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phonetxtMouseClicked(evt);
            }
        });
        phonetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonetxtActionPerformed(evt);
            }
        });
        phonetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phonetxtKeyReleased(evt);
            }
        });
        enterData_SignUp.add(phonetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, 290, 40));

        namelbl.setBackground(new java.awt.Color(255, 255, 255));
        namelbl.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        namelbl.setForeground(new java.awt.Color(0, 0, 51));
        namelbl.setText("Name");
        enterData_SignUp.add(namelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 100, 50));

        nametxt.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        nametxt.setForeground(new java.awt.Color(0, 0, 102));
        nametxt.setBorder(null);
        nametxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nametxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nametxtFocusLost(evt);
            }
        });
        nametxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nametxtMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nametxtMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                nametxtMouseReleased(evt);
            }
        });
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        nametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nametxtKeyReleased(evt);
            }
        });
        enterData_SignUp.add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 290, 40));

        nameerror.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nameerror.setForeground(new java.awt.Color(204, 0, 0));
        nameerror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nameerrorMouseExited(evt);
            }
        });
        enterData_SignUp.add(nameerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 290, 40));

        nameseparator.setBackground(new java.awt.Color(204, 204, 204));
        nameseparator.setForeground(new java.awt.Color(204, 204, 204));
        nameseparator.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        enterData_SignUp.add(nameseparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 290, 30));

        usernamelbl2.setBackground(new java.awt.Color(255, 255, 255));
        usernamelbl2.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        usernamelbl2.setForeground(new java.awt.Color(0, 0, 51));
        usernamelbl2.setText("Username");
        enterData_SignUp.add(usernamelbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 100, 50));

        usernametxt5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        usernametxt5.setForeground(new java.awt.Color(0, 0, 102));
        usernametxt5.setBorder(null);
        usernametxt5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernametxt5FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernametxt5FocusLost(evt);
            }
        });
        usernametxt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernametxt5MouseClicked(evt);
            }
        });
        usernametxt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametxt5ActionPerformed(evt);
            }
        });
        usernametxt5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernametxt5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernametxt5KeyReleased(evt);
            }
        });
        enterData_SignUp.add(usernametxt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 290, 40));

        usernameseparator4.setBackground(new java.awt.Color(204, 204, 204));
        usernameseparator4.setForeground(new java.awt.Color(204, 204, 204));
        enterData_SignUp.add(usernameseparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 290, 10));

        gender.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        gender.setForeground(new java.awt.Color(0, 0, 51));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        enterData_SignUp.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 640, 150, 40));

        nationalidibi.setBackground(new java.awt.Color(255, 255, 255));
        nationalidibi.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        nationalidibi.setForeground(new java.awt.Color(0, 0, 51));
        nationalidibi.setText("NationalID");
        enterData_SignUp.add(nationalidibi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 120, 50));

        nationalid1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        nationalid1.setForeground(new java.awt.Color(0, 0, 102));
        nationalid1.setBorder(null);
        nationalid1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nationalid1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nationalid1FocusLost(evt);
            }
        });
        nationalid1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nationalid1MouseClicked(evt);
            }
        });
        nationalid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nationalid1ActionPerformed(evt);
            }
        });
        nationalid1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nationalid1KeyReleased(evt);
            }
        });
        enterData_SignUp.add(nationalid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 290, 40));

        nationalidseparator.setBackground(new java.awt.Color(204, 204, 204));
        nationalidseparator.setForeground(new java.awt.Color(204, 204, 204));
        enterData_SignUp.add(nationalidseparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 290, 10));

        locationlbl6.setBackground(new java.awt.Color(255, 255, 255));
        locationlbl6.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        locationlbl6.setForeground(new java.awt.Color(0, 0, 51));
        locationlbl6.setText("Location");
        enterData_SignUp.add(locationlbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 100, 50));

        location.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        location.setForeground(new java.awt.Color(0, 0, 102));
        location.setBorder(null);
        location.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                locationFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                locationFocusLost(evt);
            }
        });
        location.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                locationMouseClicked(evt);
            }
        });
        location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationActionPerformed(evt);
            }
        });
        location.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                locationKeyReleased(evt);
            }
        });
        enterData_SignUp.add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 290, 40));

        locationseparator.setBackground(new java.awt.Color(204, 204, 204));
        locationseparator.setForeground(new java.awt.Color(204, 204, 204));
        enterData_SignUp.add(locationseparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 290, 10));

        visapasswordlbl4.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        visapasswordlbl4.setForeground(new java.awt.Color(0, 0, 51));
        visapasswordlbl4.setText("Visa Password");
        enterData_SignUp.add(visapasswordlbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, 150, 40));

        age.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        age.setForeground(new java.awt.Color(0, 0, 102));
        age.setBorder(null);
        age.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ageFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ageFocusLost(evt);
            }
        });
        age.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ageMouseClicked(evt);
            }
        });
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ageKeyReleased(evt);
            }
        });
        enterData_SignUp.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 290, 40));

        ageseparator.setBackground(new java.awt.Color(204, 204, 204));
        ageseparator.setForeground(new java.awt.Color(204, 204, 204));
        enterData_SignUp.add(ageseparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 290, 10));

        passwordlbl2.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        passwordlbl2.setForeground(new java.awt.Color(0, 0, 51));
        passwordlbl2.setText("Password");
        enterData_SignUp.add(passwordlbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 100, 40));

        password.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 102));
        password.setBorder(null);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        enterData_SignUp.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 290, 40));

        passwordseparator4.setBackground(new java.awt.Color(204, 204, 204));
        passwordseparator4.setForeground(new java.awt.Color(204, 204, 204));
        enterData_SignUp.add(passwordseparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 290, 10));

        Visanumlbl.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        Visanumlbl.setForeground(new java.awt.Color(0, 0, 51));
        Visanumlbl.setText("Visa number");
        enterData_SignUp.add(Visanumlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 130, 40));

        visanum.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        visanum.setForeground(new java.awt.Color(0, 0, 102));
        visanum.setBorder(null);
        visanum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                visanumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                visanumFocusLost(evt);
            }
        });
        visanum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visanumMouseClicked(evt);
            }
        });
        visanum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visanumActionPerformed(evt);
            }
        });
        visanum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                visanumKeyReleased(evt);
            }
        });
        enterData_SignUp.add(visanum, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 290, 40));

        visapasswordseparator5.setBackground(new java.awt.Color(204, 204, 204));
        visapasswordseparator5.setForeground(new java.awt.Color(204, 204, 204));
        enterData_SignUp.add(visapasswordseparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 290, 10));

        passworderror.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passworderror.setForeground(new java.awt.Color(204, 0, 0));
        passworderror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passworderrorMouseExited(evt);
            }
        });
        enterData_SignUp.add(passworderror, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 87, 290, 30));

        mailerror.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mailerror.setForeground(new java.awt.Color(204, 0, 0));
        mailerror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mailerrorMouseExited(evt);
            }
        });
        enterData_SignUp.add(mailerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 290, 20));

        usernameerror.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernameerror.setForeground(new java.awt.Color(204, 0, 0));
        usernameerror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usernameerrorMouseExited(evt);
            }
        });
        enterData_SignUp.add(usernameerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 300, 40));

        ageerror.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ageerror.setForeground(new java.awt.Color(204, 0, 0));
        ageerror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ageerrorMouseExited(evt);
            }
        });
        enterData_SignUp.add(ageerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 290, 20));

        visanumerror.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        visanumerror.setForeground(new java.awt.Color(204, 0, 0));
        visanumerror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                visanumerrorMouseExited(evt);
            }
        });
        enterData_SignUp.add(visanumerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, 290, 40));

        visapassworderror.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        visapassworderror.setForeground(new java.awt.Color(204, 0, 0));
        visapassworderror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                visapassworderrorMouseExited(evt);
            }
        });
        enterData_SignUp.add(visapassworderror, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 430, 40));

        phoneerror.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        phoneerror.setForeground(new java.awt.Color(204, 0, 0));
        phoneerror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                phoneerrorMouseExited(evt);
            }
        });
        enterData_SignUp.add(phoneerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 290, 40));

        nationaliderror.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nationaliderror.setForeground(new java.awt.Color(204, 0, 0));
        nationaliderror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nationaliderrorMouseExited(evt);
            }
        });
        enterData_SignUp.add(nationaliderror, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 290, 40));

        locationerror.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        locationerror.setForeground(new java.awt.Color(204, 0, 0));
        locationerror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                locationerrorMouseExited(evt);
            }
        });
        enterData_SignUp.add(locationerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 290, 40));

        getContentPane().add(enterData_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 890));

        SignUp_SignIn1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Show_SignUp1.setBackground(new java.awt.Color(0, 0, 51));
        Show_SignUp1.setForeground(new java.awt.Color(102, 0, 0));
        Show_SignUp1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hellofriends3.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        hellofriends3.setForeground(new java.awt.Color(255, 255, 255));
        hellofriends3.setText("Welcome Back !");
        Show_SignUp1.add(hellofriends3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        Intro1.setFont(new java.awt.Font("Traditional Arabic", 0, 25)); // NOI18N
        Intro1.setForeground(new java.awt.Color(255, 255, 255));
        Intro1.setText("Enter your User name & Password");
        Show_SignUp1.add(Intro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, -1, -1));

        Intro3.setFont(new java.awt.Font("Traditional Arabic", 0, 25)); // NOI18N
        Intro3.setForeground(new java.awt.Color(255, 255, 255));
        Intro3.setText("and continue your journey with us");
        Show_SignUp1.add(Intro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, 30));

        bustra3.setFont(new java.awt.Font("Andalus", 3, 55)); // NOI18N
        bustra3.setForeground(new java.awt.Color(255, 255, 255));
        bustra3.setText("Bus Tra");
        bustra3.setToolTipText("");
        Show_SignUp1.add(bustra3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 200, 100));

        SigninBTN1.setBackground(new java.awt.Color(0, 0, 51));
        SigninBTN1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SigninBTN1.setForeground(new java.awt.Color(255, 255, 255));
        SigninBTN1.setText("SIGN IN");
        SigninBTN1.setActionCommand("SignUP");
        SigninBTN1.setBorder(null);
        SigninBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SigninBTN1jButton2ActionPerformed(evt);
            }
        });
        Show_SignUp1.add(SigninBTN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 290, 53));

        SignUp_SignIn1.add(Show_SignUp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 890));

        slidershow11.setBackground(new java.awt.Color(255, 255, 255));
        SignUp_SignIn1.add(slidershow11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 490, 900));

        slidershow7.setBackground(new java.awt.Color(255, 255, 255));
        SignUp_SignIn1.add(slidershow7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 490, 900));

        slidershow9.setBackground(new java.awt.Color(255, 255, 255));
        SignUp_SignIn1.add(slidershow9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 490, 900));

        slidershow12.setBackground(new java.awt.Color(255, 255, 255));
        SignUp_SignIn1.add(slidershow12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 490, 900));

        slidershow10.setBackground(new java.awt.Color(255, 255, 255));
        SignUp_SignIn1.add(slidershow10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 490, 900));

        slidershow8.setBackground(new java.awt.Color(255, 255, 255));
        SignUp_SignIn1.add(slidershow8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 490, 900));

        slidershow13.setBackground(new java.awt.Color(255, 255, 255));
        SignUp_SignIn1.add(slidershow13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 490, 900));

        getContentPane().add(SignUp_SignIn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 490, 890));

        SignUp_SignIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Show_SignUp.setBackground(new java.awt.Color(0, 0, 51));
        Show_SignUp.setForeground(new java.awt.Color(102, 0, 0));
        Show_SignUp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hellofriends2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        hellofriends2.setForeground(new java.awt.Color(255, 255, 255));
        hellofriends2.setText("Hello, Friends!");
        Show_SignUp.add(hellofriends2, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 260, 210, -1));

        Intro.setFont(new java.awt.Font("Traditional Arabic", 0, 25)); // NOI18N
        Intro.setForeground(new java.awt.Color(255, 255, 255));
        Intro.setText("Enter your personal details");
        Show_SignUp.add(Intro, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 340, 310, -1));

        Intro2.setFont(new java.awt.Font("Traditional Arabic", 0, 25)); // NOI18N
        Intro2.setForeground(new java.awt.Color(255, 255, 255));
        Intro2.setText("and start journey with us");
        Show_SignUp.add(Intro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 370, 300, 40));

        bustra2.setFont(new java.awt.Font("Andalus", 3, 55)); // NOI18N
        bustra2.setForeground(new java.awt.Color(255, 255, 255));
        bustra2.setText("Bus Tra");
        bustra2.setToolTipText("");
        Show_SignUp.add(bustra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 210, 100));

        SignupBTN.setBackground(new java.awt.Color(0, 0, 51));
        SignupBTN.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        SignupBTN.setForeground(new java.awt.Color(255, 255, 255));
        SignupBTN.setText("SIGN UP");
        SignupBTN.setActionCommand("SignUP");
        SignupBTN.setBorder(null);
        SignupBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupBTNjButton2ActionPerformed(evt);
            }
        });
        Show_SignUp.add(SignupBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 320, 53));

        SignUp_SignIn.add(Show_SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 890));

        slidershow.setBackground(new java.awt.Color(255, 255, 255));
        SignUp_SignIn.add(slidershow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 890));

        slidershow1.setBackground(new java.awt.Color(255, 255, 255));
        SignUp_SignIn.add(slidershow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 890));

        slidershow2.setBackground(new java.awt.Color(255, 255, 255));
        SignUp_SignIn.add(slidershow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 890));

        slidershow3.setBackground(new java.awt.Color(255, 255, 255));
        SignUp_SignIn.add(slidershow3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 890));

        slidershow4.setBackground(new java.awt.Color(255, 255, 255));
        SignUp_SignIn.add(slidershow4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 890));

        slidershow5.setBackground(new java.awt.Color(255, 255, 255));
        SignUp_SignIn.add(slidershow5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 890));

        slidershow6.setBackground(new java.awt.Color(255, 255, 255));
        SignUp_SignIn.add(slidershow6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 890));

        getContentPane().add(SignUp_SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 890));

        enterData_SignIn.setBackground(new java.awt.Color(255, 255, 255));
        enterData_SignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        enterData_SignIn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordlbl.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        passwordlbl.setForeground(new java.awt.Color(0, 0, 51));
        passwordlbl.setText("Password");
        enterData_SignIn.add(passwordlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 120, 64));

        passwordseparator.setBackground(new java.awt.Color(204, 204, 204));
        passwordseparator.setForeground(new java.awt.Color(204, 204, 204));
        enterData_SignIn.add(passwordseparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 360, 10));

        passwordtxt.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        passwordtxt.setForeground(new java.awt.Color(0, 0, 102));
        passwordtxt.setBorder(null);
        passwordtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordtxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordtxtFocusLost(evt);
            }
        });
        passwordtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordtxtMouseClicked(evt);
            }
        });
        passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtxtActionPerformed(evt);
            }
        });
        passwordtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordtxtKeyReleased(evt);
            }
        });
        enterData_SignIn.add(passwordtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 350, 40));

        phonesys.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phonesys.setForeground(new java.awt.Color(153, 153, 153));
        phonesys.setText("Phone: +20 1100615741");
        enterData_SignIn.add(phonesys, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 810, 220, 30));

        mailsys.setBackground(new java.awt.Color(255, 255, 255));
        mailsys.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mailsys.setForeground(new java.awt.Color(153, 153, 153));
        mailsys.setText("e-mail: bustra@yahoo.com");
        mailsys.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mailsys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mailsysMouseClicked(evt);
            }
        });
        enterData_SignIn.add(mailsys, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 780, 250, 40));
        enterData_SignIn.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 780, 490, 10));

        privacylbl.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        privacylbl.setForeground(new java.awt.Color(153, 153, 153));
        privacylbl.setText("© 2019 Envato Pty Ltd. Trademarks and brands are the property of their respective owners. ");
        enterData_SignIn.add(privacylbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 850, 620, 40));

        facebooklink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Capture31.PNG"))); // NOI18N
        facebooklink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        facebooklink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facebooklinkMouseClicked(evt);
            }
        });
        enterData_SignIn.add(facebooklink, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 60, 70));

        twitterlink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Capture33.PNG"))); // NOI18N
        twitterlink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twitterlink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitterlinkMouseClicked(evt);
            }
        });
        enterData_SignIn.add(twitterlink, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 260, 60, 60));

        Gpluslink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Capture32.PNG"))); // NOI18N
        Gpluslink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Gpluslink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GpluslinkMouseClicked(evt);
            }
        });
        enterData_SignIn.add(Gpluslink, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, 60, 70));

        forgetpassword.setBackground(new java.awt.Color(255, 255, 255));
        forgetpassword.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        forgetpassword.setText("Forget Password");
        forgetpassword.setBorder(null);
        forgetpassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgetpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgetpasswordActionPerformed(evt);
            }
        });
        enterData_SignIn.add(forgetpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 520, 160, 30));

        usernameorpassworderrorsignin1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        usernameorpassworderrorsignin1.setForeground(new java.awt.Color(204, 0, 0));
        usernameorpassworderrorsignin1.setToolTipText("");
        usernameorpassworderrorsignin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usernameorpassworderrorsignin1MouseExited(evt);
            }
        });
        enterData_SignIn.add(usernameorpassworderrorsignin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 350, 40));

        usernameloginlbl1.setBackground(new java.awt.Color(255, 255, 255));
        usernameloginlbl1.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        usernameloginlbl1.setForeground(new java.awt.Color(0, 0, 51));
        usernameloginlbl1.setText("Username");
        enterData_SignIn.add(usernameloginlbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 120, 64));

        usernametxt1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        usernametxt1.setForeground(new java.awt.Color(0, 0, 102));
        usernametxt1.setBorder(null);
        usernametxt1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernametxt1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernametxt1FocusLost(evt);
            }
        });
        usernametxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernametxt1MouseClicked(evt);
            }
        });
        usernametxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametxt1ActionPerformed(evt);
            }
        });
        usernametxt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernametxt1KeyReleased(evt);
            }
        });
        enterData_SignIn.add(usernametxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 350, 40));

        usernameseparator1.setBackground(new java.awt.Color(204, 204, 204));
        usernameseparator1.setForeground(new java.awt.Color(204, 204, 204));
        enterData_SignIn.add(usernameseparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 350, 10));

        forgetpasswordpanel.setBackground(new java.awt.Color(255, 255, 255));
        forgetpasswordpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emaillblforgetpassword1.setBackground(new java.awt.Color(255, 255, 255));
        emaillblforgetpassword1.setFont(new java.awt.Font("Traditional Arabic", 0, 26)); // NOI18N
        emaillblforgetpassword1.setForeground(new java.awt.Color(0, 0, 51));
        emaillblforgetpassword1.setText("E-mail");
        forgetpasswordpanel.add(emaillblforgetpassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 90, 50));

        emailtxtforgetpassword.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        emailtxtforgetpassword.setForeground(new java.awt.Color(0, 0, 102));
        emailtxtforgetpassword.setBorder(null);
        emailtxtforgetpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailtxtforgetpasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailtxtforgetpasswordFocusLost(evt);
            }
        });
        emailtxtforgetpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailtxtforgetpasswordMouseClicked(evt);
            }
        });
        emailtxtforgetpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtforgetpasswordActionPerformed(evt);
            }
        });
        emailtxtforgetpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailtxtforgetpasswordKeyReleased(evt);
            }
        });
        forgetpasswordpanel.add(emailtxtforgetpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 350, 40));

        emailseparatorfogetpassword.setBackground(new java.awt.Color(204, 204, 204));
        emailseparatorfogetpassword.setForeground(new java.awt.Color(204, 204, 204));
        forgetpasswordpanel.add(emailseparatorfogetpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 350, 20));

        newpasswordlbl1.setFont(new java.awt.Font("Traditional Arabic", 0, 24)); // NOI18N
        newpasswordlbl1.setForeground(new java.awt.Color(0, 0, 51));
        newpasswordlbl1.setText("New Password");
        forgetpasswordpanel.add(newpasswordlbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 150, 60));

        newpasswordtxt1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        newpasswordtxt1.setForeground(new java.awt.Color(0, 0, 102));
        newpasswordtxt1.setBorder(null);
        newpasswordtxt1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newpasswordtxt1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                newpasswordtxt1FocusLost(evt);
            }
        });
        newpasswordtxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newpasswordtxt1MouseClicked(evt);
            }
        });
        newpasswordtxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpasswordtxt1ActionPerformed(evt);
            }
        });
        newpasswordtxt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                newpasswordtxt1KeyReleased(evt);
            }
        });
        forgetpasswordpanel.add(newpasswordtxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 360, 40));

        newpassworderror.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        newpassworderror.setForeground(new java.awt.Color(204, 0, 0));
        newpassworderror.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                newpassworderrorMouseExited(evt);
            }
        });
        forgetpasswordpanel.add(newpassworderror, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 360, 40));

        newpasswordseparator1.setBackground(new java.awt.Color(204, 204, 204));
        newpasswordseparator1.setForeground(new java.awt.Color(204, 204, 204));
        forgetpasswordpanel.add(newpasswordseparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 350, 10));

        emailrrorsignin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailrrorsignin.setForeground(new java.awt.Color(204, 0, 0));
        emailrrorsignin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                emailrrorsigninMouseExited(evt);
            }
        });
        forgetpasswordpanel.add(emailrrorsignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 350, 30));

        finalsend.setBackground(new java.awt.Color(0, 0, 51));
        finalsend.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        finalsend.setForeground(new java.awt.Color(255, 255, 255));
        finalsend.setText("CONFIRM");
        finalsend.setActionCommand("SignUP");
        finalsend.setBorder(null);
        finalsend.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        finalsend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalsendjButton2ActionPerformed(evt);
            }
        });
        forgetpasswordpanel.add(finalsend, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 300, 50));

        finalsend2.setBackground(new java.awt.Color(0, 0, 51));
        finalsend2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        finalsend2.setForeground(new java.awt.Color(255, 255, 255));
        finalsend2.setText("CONFIRM");
        finalsend2.setActionCommand("SignUP");
        finalsend2.setBorder(null);
        finalsend2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        finalsend2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalsend2jButton2ActionPerformed(evt);
            }
        });
        forgetpasswordpanel.add(finalsend2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 300, 50));

        backlbl.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        backlbl.setForeground(new java.awt.Color(0, 0, 51));
        backlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-double-left-16.png"))); // NOI18N
        backlbl.setText("Back");
        backlbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backlblMouseClicked(evt);
            }
        });
        forgetpasswordpanel.add(backlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 110, 40));

        enterData_SignIn.add(forgetpasswordpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 310));

        sign_inBTN1.setBackground(new java.awt.Color(0, 0, 51));
        sign_inBTN1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        sign_inBTN1.setForeground(new java.awt.Color(255, 255, 255));
        sign_inBTN1.setText("SIGN IN");
        sign_inBTN1.setActionCommand("SignUP");
        sign_inBTN1.setBorder(null);
        sign_inBTN1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sign_inBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_inBTN1jButton2ActionPerformed(evt);
            }
        });
        enterData_SignIn.add(sign_inBTN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 300, 60));

        getContentPane().add(enterData_SignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 650, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mailtxt2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailtxt2FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_mailtxt2FocusGained

    private void mailtxt2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailtxt2FocusLost

        String mail=mailtxt2.getText();
        Admin admin_test=new Admin();
        int check=admin_test.check_Email(mail);
        if(mail.length()==0){
            mailerror.setVisible(true);
            mailerror.setText("Please enter your e-mail");
            mailtxt2.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            sign_UPBTN2.setEnabled(false);
        } else{
            if(check==0){
                mailerror.setText("");
                mailerror.setVisible(false);
                mailtxt2.setBorder(BorderFactory.createEmptyBorder());
            }
            else  if(check==1)
            {
                mailerror.setVisible(true);
                mailtxt2.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                sign_UPBTN2.setEnabled(false);
                mailerror.setText("Please enter valid E-mail");
            }
            else if(check==2){
                mailerror.setVisible(true);
                mailtxt2.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                sign_UPBTN2.setEnabled(false);
                mailerror.setText("Please enter valid E-mail");

            }
            else if(check==3){

                mailerror.setVisible(true);
                mailtxt2.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                sign_UPBTN2.setEnabled(false);
                mailerror.setText("Please enter valid E-mail");
            }
            else if(check==4){

                mailerror.setVisible(true);
                mailtxt2.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                sign_UPBTN2.setEnabled(false);
                mailerror.setText("You have already registered using this account before");
                return;
            }
        }
    }//GEN-LAST:event_mailtxt2FocusLost

    private void mailtxt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailtxt2MouseClicked

        String mail=mailtxt2.getText();
        if(mail.length()==0&&mailerror.getText().length()==0){
            mailtxt2.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Email(mail);

            if(mail.length()==0){
                mailerror.setVisible(true);
                mailerror.setText("Please enter your e-mail");
                mailtxt2.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            else{
                if(check==0){
                    mailerror.setText("");
                    mailerror.setVisible(false);
                    mailtxt2.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                }
                else  if(check==1)
                {
                    mailerror.setVisible(true);
                    mailtxt2.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    mailerror.setText("Please enter valid E-mail");
                }
                else if(check==2){
                    mailerror.setVisible(true);
                    mailtxt2.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    mailerror.setText("Please enter valid E-mail");

                }
                else if(check==3){

                    mailerror.setVisible(true);
                    mailtxt2.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    mailerror.setText("Please enter valid E-mail");
                }
                else if(check==4){

                    mailerror.setVisible(true);
                    mailtxt2.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    mailerror.setText("You have already registered using this account before");
                    return;
                }
            }}
    }//GEN-LAST:event_mailtxt2MouseClicked

    private void mailtxt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailtxt2ActionPerformed

    }//GEN-LAST:event_mailtxt2ActionPerformed

    private void mailtxt2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailtxt2KeyReleased

        String mail=mailtxt2.getText();
        if(mail.length()==0&&mailerror.getText().length()==0){
            mailtxt2.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Email(mail);

            if(mail.length()==0){
                mailerror.setVisible(true);
                mailerror.setText("Please enter your e-mail");
                mailtxt2.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            else{
                if(check==0){
                    mailerror.setText("");
                    mailerror.setVisible(false);
                    mailtxt2.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                    return;

                }
                else  if(check==1)
                {
                    mailerror.setVisible(true);
                    mailtxt2.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    mailerror.setText("Please enter valid E-mail");
                }
                else if(check==2){
                    mailerror.setVisible(true);
                    mailtxt2.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    mailerror.setText("Please enter valid E-mail");

                }
                else if(check==3){

                    mailerror.setVisible(true);
                    mailtxt2.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    mailerror.setText("Please enter valid E-mail");
                }
                else if(check==4){

                    mailerror.setVisible(true);
                    mailtxt2.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    mailerror.setText("You have already registered using this account before");
                    return;
                }
            }
            if(nameerror.getText().length()==0&&passworderror.getText().length()==0&&usernameerror.getText().length()==0&&
                mailerror.getText().length()==0&&nationaliderror.getText().length()==0&&ageerror.getText().length()==0&&locationerror.getText().length()==0&&
                phoneerror.getText().length()==0&&visapassworderror.getText().length()==0&&visanumerror.getText().length()==0
                &&nametxt.getText().length()!=0  &&(String.valueOf(password.getPassword())).length()!=0  &&usernametxt5.getText().length()!=0
                &&mailtxt2.getText().length()!=0&&nationalid1.getText().length()!=0  &&age.getText().length()!=0
                &&phonetxt.getText().length()!=0&&visanum.getText().length()!=0  &&(String.valueOf(visaPassword.getPassword())).length()!=0)
            sign_UPBTN2.setEnabled(true);
        }

    }//GEN-LAST:event_mailtxt2KeyReleased

    private void mailsys2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailsys2MouseClicked

        try {
            String uri="https://mail.yahoo.com/d/compose/6934265107";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(uri));
        } catch (IOException ex) {
            Logger.getLogger(Login_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mailsys2MouseClicked

    private void sign_UPBTN2jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_UPBTN2jButton2ActionPerformed
        String parsedName = nametxt.getText();
        String parsedPassword = String.valueOf(password.getPassword());
        String parsedEmail = mailtxt2.getText();
        String parsedUsername = usernametxt5.getText();
        long parsedNationalID = Long.valueOf(nationalid1.getText());
        String parsedLocation = location.getText();
        int parsedAge = Integer.valueOf(age.getText());
        String parsedVisaNum = visanum.getText();
        String parsedVisaPass = String.valueOf(visaPassword.getPassword());
        String parsedPhone = phonetxt.getText();
        String parsedGender = gender.getSelectedItem().toString();
        Customer newCustomer = new Customer(parsedName,parsedAge,parsedNationalID,parsedGender,parsedLocation,parsedEmail,
            parsedUsername,parsedPassword,parsedPhone,parsedVisaNum,parsedVisaPass);
        newCustomer.Registration(newCustomer);
        current_customer = newCustomer;
        upload_customers_data();
        this.dispose();
        customer_form custForm = new customer_form();
        custForm.setVisible(true);
        Admin admin_email=new Admin();
        admin_email.send_registrationEmail();
    }//GEN-LAST:event_sign_UPBTN2jButton2ActionPerformed

    private void facebooklink2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebooklink2MouseClicked
        try {
            String uri="https://www.facebook.com/Bus-Tra-340100159975139/?modal=admin_todo_tour";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(uri));
        } catch (IOException ex) {
            Logger.getLogger(Login_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_facebooklink2MouseClicked

    private void twitterlink2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterlink2MouseClicked
        try {
            String uri="https://twitter.com/Twitter?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(uri));
        } catch (IOException ex) {
            Logger.getLogger(Login_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_twitterlink2MouseClicked

    private void Gpluslink2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Gpluslink2MouseClicked
        try {
            String uri="https://aboutme.google.com/u/0/";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(uri));
        } catch (IOException ex) {
            Logger.getLogger(Login_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Gpluslink2MouseClicked

    private void visaPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_visaPasswordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_visaPasswordFocusGained

    private void visaPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_visaPasswordFocusLost
        String VISA_Password=String.valueOf(visaPassword.getPassword());
        if(VISA_Password.length()==0){
            visapassworderror.setVisible(true);
            visapassworderror.setText("Please enter Visa password");
            visaPassword.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            sign_UPBTN2.setEnabled(false);
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.Check_VisaPassword(VISA_Password);
            if(check==0){
                visapassworderror.setText("");
                visapassworderror.setVisible(false);
                visaPassword.setBorder(BorderFactory.createEmptyBorder());
            }
            else  if(check==1)
            {
                visapassworderror.setVisible(true);
                visaPassword.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                visapassworderror.setText("Please enter your real Visa password");
                sign_UPBTN2.setEnabled(false);
            }
        }
    }//GEN-LAST:event_visaPasswordFocusLost

    private void visaPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visaPasswordMouseClicked
        String VISAPassword=String.valueOf(visaPassword.getPassword());
        if(VISAPassword.length()==0&&visapassworderror.getText().length()!=0){
            visaPassword.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));}
        else if(VISAPassword.length()==0&&visapassworderror.getText().length()==0){

            visaPassword.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.Check_VisaPassword(VISAPassword);

            if(check==0){
                visapassworderror.setText("");
                visapassworderror.setVisible(false);
                visaPassword.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
            }
            else  if(check==1)
            {

                visapassworderror.setVisible(true);
                visaPassword.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                visapassworderror.setText("Please enter your real Visa password");
            }
        }
    }//GEN-LAST:event_visaPasswordMouseClicked

    private void visaPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visaPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visaPasswordActionPerformed

    private void visaPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_visaPasswordKeyReleased
        String VISA_Password=String.valueOf(visaPassword.getPassword());
        Admin admin_test=new Admin();
        int check=admin_test.Check_VisaPassword(VISA_Password);

        if(check==0){
            visapassworderror.setText("");
            visapassworderror.setVisible(false);
            visaPassword.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
        }
        else  if(check==1)
        {

            visapassworderror.setVisible(true);
            visaPassword.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            visapassworderror.setText("Please enter your real Visa password");
        }
        if(nameerror.getText().length()==0&&passworderror.getText().length()==0&&usernameerror.getText().length()==0&&
            mailerror.getText().length()==0&&nationaliderror.getText().length()==0&&ageerror.getText().length()==0&&locationerror.getText().length()==0&&
            phoneerror.getText().length()==0&&visapassworderror.getText().length()==0&&visanumerror.getText().length()==0
            &&nametxt.getText().length()!=0  &&(String.valueOf(password.getPassword())).length()!=0  &&usernametxt5.getText().length()!=0
            &&mailtxt2.getText().length()!=0&&nationalid1.getText().length()!=0  &&age.getText().length()!=0
            &&phonetxt.getText().length()!=0&&visanum.getText().length()!=0  &&(String.valueOf(visaPassword.getPassword())).length()!=0)
        sign_UPBTN2.setEnabled(true);
    }//GEN-LAST:event_visaPasswordKeyReleased

    private void phonetxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phonetxtFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_phonetxtFocusGained

    private void phonetxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phonetxtFocusLost
        String phone= phonetxt.getText();
        Admin admin_test=new Admin();
        int check=admin_test.check_Phone(phone);

        if(phone.length()==0){
            phoneerror.setVisible(true);
            phoneerror.setText("Please enter your phone");
            phonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            sign_UPBTN2.setEnabled(false);
        }
        else{
            if(check==0){
                phoneerror.setText("");
                phoneerror.setVisible(false);
                phonetxt.setBorder(BorderFactory.createEmptyBorder());

            }
            else  if(check==1)
            {
                phoneerror.setVisible(true);
                phonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                phoneerror.setText("Please enter valid phone & only numbers");
                sign_UPBTN2.setEnabled(false);
            }
            else  if(check==2)
            {
                phoneerror.setVisible(true);
                phonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                phoneerror.setText("Please enter only numbers");
                sign_UPBTN2.setEnabled(false);
            }
            else  if(check==3)
            {
                phoneerror.setVisible(true);
                phonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                phoneerror.setText("Please enter valid phone");
                sign_UPBTN2.setEnabled(false);
            }
        }
    }//GEN-LAST:event_phonetxtFocusLost

    private void phonetxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phonetxtMouseClicked
        String phone= phonetxt.getText();
        if(phone.length()==0&&phoneerror.getText().length()==0){
            phonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Phone(phone);

            if(phone.length()==0){
                phoneerror.setVisible(true);
                phoneerror.setText("Please enter your phone");
                phonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            else{
                if(check==0){
                    phoneerror.setText("");
                    phoneerror.setVisible(false);
                    phonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                }
                else  if(check==1)
                {
                    phoneerror.setVisible(true);
                    phonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    phoneerror.setText("Please enter valid phone & only numbers");
                }
                else  if(check==2)
                {
                    phoneerror.setVisible(true);
                    phonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    phoneerror.setText("Please enter only numbers");
                }
                else  if(check==3)
                {
                    phoneerror.setVisible(true);
                    phonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    phoneerror.setText("Please enter valid phone");
                }
            }
        }
    }//GEN-LAST:event_phonetxtMouseClicked

    private void phonetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonetxtActionPerformed

    private void phonetxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonetxtKeyReleased
        String phone= phonetxt.getText();
        if(phone.length()==0&&phoneerror.getText().length()==0){
            phonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Phone(phone);
            if(phone.length()==0){
                phoneerror.setVisible(true);
                phoneerror.setText("Please enter your phone");
                phonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            else{
                if(check==0){
                    phoneerror.setText("");
                    phoneerror.setVisible(false);
                    phonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                }
                else  if(check==1)
                {
                    phoneerror.setVisible(true);
                    phonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    phoneerror.setText("Please enter valid phone & only numbers");
                }
                else  if(check==2)
                {
                    phoneerror.setVisible(true);
                    phonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    phoneerror.setText("Please enter only numbers");
                }
                else  if(check==3)
                {
                    phoneerror.setVisible(true);
                    phonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    phoneerror.setText("Please enter valid phone");
                }
            }
        }
        if(nameerror.getText().length()==0&&passworderror.getText().length()==0&&usernameerror.getText().length()==0&&
            mailerror.getText().length()==0&&nationaliderror.getText().length()==0&&ageerror.getText().length()==0&&locationerror.getText().length()==0&&
            phoneerror.getText().length()==0&&visapassworderror.getText().length()==0&&visanumerror.getText().length()==0
            &&nametxt.getText().length()!=0  &&(String.valueOf(password.getPassword())).length()!=0  &&usernametxt5.getText().length()!=0
            &&mailtxt2.getText().length()!=0&&nationalid1.getText().length()!=0  &&age.getText().length()!=0
            &&phonetxt.getText().length()!=0&&visanum.getText().length()!=0  &&(String.valueOf(visaPassword.getPassword())).length()!=0)
        sign_UPBTN2.setEnabled(true);
    }//GEN-LAST:event_phonetxtKeyReleased

    private void nametxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nametxtFocusGained

    }//GEN-LAST:event_nametxtFocusGained

    private void nametxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nametxtFocusLost

        String Name=nametxt.getText();
        Admin admin_test=new Admin();
        int check=admin_test.check_Name(Name);
        if(Name.length()==0){
            nameerror.setVisible(true);
            nameerror.setText("Please enter your name");
            nametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));  sign_UPBTN2.setEnabled(false);

        }else{
            if(check==0){
                nameerror.setText("");
                nameerror.setVisible(false);
                nametxt.setBorder(BorderFactory.createEmptyBorder());
            }
            else  if(check==1)
            {

                nameerror.setVisible(true);
                nametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));  sign_UPBTN2.setEnabled(false);
                nameerror.setText("Please enter letters only & valid name");
            }
            else if(check==2){
                nameerror.setVisible(true);
                nametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));  sign_UPBTN2.setEnabled(false);
                nameerror.setText("Please enter valid name");

            }
            else if(check==3){

                nameerror.setVisible(true);
                nametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));  sign_UPBTN2.setEnabled(false);
                nameerror.setText("Please enter letters only");
            }
        }
    }//GEN-LAST:event_nametxtFocusLost

    private void nametxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nametxtMouseClicked

        String Name=nametxt.getText();
        if(Name.length()==0){
            nametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Name(Name);

            if(check==0){
                nameerror.setText("");
                nameerror.setVisible(false);
                nametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
            }
            else  if(check==1)
            {

                nameerror.setVisible(true);
                nametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                nameerror.setText("Please enter letters only & valid name");
            }
            else if(check==2){
                nameerror.setVisible(true);
                nametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                nameerror.setText("Please enter valid name");
            }
            else if(check==3){

                nameerror.setVisible(true);
                nametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                nameerror.setText("Please enter letters only");
            }}
    }//GEN-LAST:event_nametxtMouseClicked

    private void nametxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nametxtMouseExited

    }//GEN-LAST:event_nametxtMouseExited

    private void nametxtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nametxtMouseReleased

    }//GEN-LAST:event_nametxtMouseReleased

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed

    }//GEN-LAST:event_nametxtActionPerformed

    private void nametxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nametxtKeyReleased

        String Name=nametxt.getText();

        Admin admin_test=new Admin();
        int check=admin_test.check_Name(Name);

        if(check==0){
            nameerror.setText("");
            nameerror.setVisible(false);
            nametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
        }
        else  if(check==1)
        {

            nameerror.setVisible(true);
            nametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            nameerror.setText("Please enter letters only & valid name");
        }
        else if(check==2){
            nameerror.setVisible(true);
            nametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            nameerror.setText("Please enter valid name");

        }
        else if(check==3){

            nameerror.setVisible(true);
            nametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            nameerror.setText("Please enter letters only");
        }
        if(nameerror.getText().length()==0&&passworderror.getText().length()==0&&usernameerror.getText().length()==0&&
            mailerror.getText().length()==0&&nationaliderror.getText().length()==0&&ageerror.getText().length()==0&&locationerror.getText().length()==0&&
            phoneerror.getText().length()==0&&visapassworderror.getText().length()==0&&visanumerror.getText().length()==0
            &&nametxt.getText().length()!=0  &&(String.valueOf(password.getPassword())).length()!=0  &&usernametxt5.getText().length()!=0
            &&mailtxt2.getText().length()!=0&&nationalid1.getText().length()!=0  &&age.getText().length()!=0
            &&phonetxt.getText().length()!=0&&visanum.getText().length()!=0  &&(String.valueOf(visaPassword.getPassword())).length()!=0)
        sign_UPBTN2.setEnabled(true);

    }//GEN-LAST:event_nametxtKeyReleased

    private void usernametxt5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernametxt5FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametxt5FocusGained

    private void usernametxt5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernametxt5FocusLost
        String username=usernametxt5.getText();
        if(username.length()==0&&usernameerror.getText().length()==0){
            usernameerror.setVisible(true);
            usernameerror.setText("Please enter your User name");
            usernametxt5.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            sign_UPBTN2.setEnabled(false);
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Username(username);

            if(username.length()==0){
                usernameerror.setVisible(true);
                usernameerror.setText("Please enter your User name");
                usernametxt5.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                sign_UPBTN2.setEnabled(false);
            }
            else{
                if(check==0){
                    usernameerror.setText("");
                    usernameerror.setVisible(false);      usernametxt5.setBorder(BorderFactory.createEmptyBorder());
                }
                else  if(check==1)
                {
                    usernameerror.setVisible(true);
                    usernametxt5.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    sign_UPBTN2.setEnabled(false);
                    usernameerror.setText("Please enter valid User name");
                }
                else if(check==2){
                    usernameerror.setVisible(true);
                    usernametxt5.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    usernameerror.setText("This User name is already existed");
                    sign_UPBTN2.setEnabled(false);
                }
            }
        }
    }//GEN-LAST:event_usernametxt5FocusLost

    private void usernametxt5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernametxt5MouseClicked
        String username=usernametxt5.getText();
        if(username.length()==0&&usernameerror.getText().length()==0){
            usernametxt5.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Username(username);

            if(username.length()==0){
                usernameerror.setVisible(true);
                usernameerror.setText("Please enter your User name");
                usernametxt5.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            else{
                if(check==0){
                    usernameerror.setText("");
                    usernameerror.setVisible(false);
                    usernametxt5.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                }
                else  if(check==1)
                {
                    usernameerror.setVisible(true);
                    usernametxt5.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    usernameerror.setText("Please enter valid User name");
                }
                else if(check==2){
                    usernameerror.setVisible(true);
                    usernametxt5.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    usernameerror.setText("This User name is already existed");
                }
            }
        }

    }//GEN-LAST:event_usernametxt5MouseClicked

    private void usernametxt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametxt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametxt5ActionPerformed

    private void usernametxt5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernametxt5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametxt5KeyPressed

    private void usernametxt5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernametxt5KeyReleased

        String username=usernametxt5.getText();
        if(username.length()==0&&usernameerror.getText().length()==0){
            usernametxt5.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Username(username);

            if(username.length()==0){
                usernameerror.setVisible(true);
                usernameerror.setText("Please enter your User name");
                usernametxt5.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            else{
                if(check==0){
                    usernameerror.setText("");
                    usernameerror.setVisible(false);
                    usernametxt5.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                }
                else  if(check==1)
                {
                    usernameerror.setVisible(true);
                    usernametxt5.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    usernameerror.setText("Please enter valid User name");
                }
                else if(check==2){
                    usernameerror.setVisible(true);
                    usernametxt5.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    usernameerror.setText("This User name is already existed");
                }
            }
            if(nameerror.getText().length()==0&&passworderror.getText().length()==0&&usernameerror.getText().length()==0&&
                mailerror.getText().length()==0&&nationaliderror.getText().length()==0&&ageerror.getText().length()==0&&locationerror.getText().length()==0&&
                phoneerror.getText().length()==0&&visapassworderror.getText().length()==0&&visanumerror.getText().length()==0
                &&nametxt.getText().length()!=0  &&(String.valueOf(password.getPassword())).length()!=0  &&usernametxt5.getText().length()!=0
                &&mailtxt2.getText().length()!=0&&nationalid1.getText().length()!=0  &&age.getText().length()!=0
                &&phonetxt.getText().length()!=0&&visanum.getText().length()!=0  &&(String.valueOf(visaPassword.getPassword())).length()!=0)
            sign_UPBTN2.setEnabled(true);
        }

    }//GEN-LAST:event_usernametxt5KeyReleased

    private void nationalid1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nationalid1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_nationalid1FocusGained

    private void nationalid1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nationalid1FocusLost
        String nationalid=nationalid1.getText();
        if(nationalid.length()==0&&nationaliderror.getText().length()==0){
            nationaliderror.setVisible(true);
            nationaliderror.setText("Please enter valid national ID");
            nationalid1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            sign_UPBTN2.setEnabled(false);
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_National_ID(nationalid);

            if(nationalid.length()==0){
                nationaliderror.setVisible(true);
                nationaliderror.setText("Please enter your national ID");
                nationalid1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                sign_UPBTN2.setEnabled(false);
            }
            else{
                if(check==0){
                    nationaliderror.setText("");
                    nationaliderror.setVisible(false);
                    nationalid1.setBorder(BorderFactory.createEmptyBorder());
                }
                else  if(check==1)
                {
                    nationaliderror.setVisible(true);
                    nationalid1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    nationaliderror.setText("Please enter valid national ID length & only numbers");
                    sign_UPBTN2.setEnabled(false);
                }
                else  if(check==2)
                {
                    nationaliderror.setVisible(true);
                    nationalid1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    nationaliderror.setText("Please enter only numbers");  sign_UPBTN2.setEnabled(false);
                }
                else  if(check==3)
                {
                    nationaliderror.setVisible(true);
                    nationalid1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    nationaliderror.setText("Please enter valid national ID length");
                    sign_UPBTN2.setEnabled(false);
                }
            }
        }
    }//GEN-LAST:event_nationalid1FocusLost

    private void nationalid1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nationalid1MouseClicked
        String nationalid= nationalid1.getText();
        if(nationalid.length()==0&&nationaliderror.getText().length()==0){
            nationalid1.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_National_ID(nationalid);

            if(nationalid.length()==0){
                nationaliderror.setVisible(true);
                nationaliderror.setText("Please enter your national ID");
                nationalid1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            else{
                if(check==0){
                    nationaliderror.setText("");
                    nationaliderror.setVisible(false);
                    nationalid1.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                }
                else  if(check==1)
                {
                    nationaliderror.setVisible(true);
                    nationalid1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    nationaliderror.setText("Please enter valid national ID length & only numbers");
                }
                else  if(check==2)
                {
                    nationaliderror.setVisible(true);
                    nationalid1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    nationaliderror.setText("Please enter only numbers");
                }
                else  if(check==3)
                {
                    nationaliderror.setVisible(true);
                    nationalid1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    nationaliderror.setText("Please enter valid national ID length");
                }
            }
        }
    }//GEN-LAST:event_nationalid1MouseClicked

    private void nationalid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nationalid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nationalid1ActionPerformed

    private void nationalid1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nationalid1KeyReleased
        String nationalid=nationalid1.getText();
        if(nationalid.length()==0&&nationaliderror.getText().length()==0){
            nationalid1.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_National_ID(nationalid);

            if(nationalid.length()==0){
                nationaliderror.setVisible(true);
                nationaliderror.setText("Please enter your national ID");
                nationalid1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            else{
                if(check==0){
                    nationaliderror.setText("");
                    nationaliderror.setVisible(false);
                    nationalid1.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                }
                else  if(check==1)
                {
                    nationaliderror.setVisible(true);
                    nationalid1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    nationaliderror.setText("Please enter valid national ID length & only numbers");
                }
                else  if(check==2)
                {
                    nationaliderror.setVisible(true);
                    nationalid1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    nationaliderror.setText("Please enter only numbers");
                }
                else  if(check==3)
                {
                    nationaliderror.setVisible(true);
                    nationalid1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    nationaliderror.setText("Please enter valid national ID length");
                }
            }}
            if(nameerror.getText().length()==0&&passworderror.getText().length()==0&&usernameerror.getText().length()==0&&
                mailerror.getText().length()==0&&nationaliderror.getText().length()==0&&ageerror.getText().length()==0&&locationerror.getText().length()==0&&
                phoneerror.getText().length()==0&&visapassworderror.getText().length()==0&&visanumerror.getText().length()==0
                &&nametxt.getText().length()!=0  &&(String.valueOf(password.getPassword())).length()!=0  &&usernametxt5.getText().length()!=0
                &&mailtxt2.getText().length()!=0&&nationalid1.getText().length()!=0  &&age.getText().length()!=0
                &&phonetxt.getText().length()!=0&&visanum.getText().length()!=0  &&(String.valueOf(visaPassword.getPassword())).length()!=0)
            sign_UPBTN2.setEnabled(true);
    }//GEN-LAST:event_nationalid1KeyReleased

    private void locationFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_locationFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_locationFocusGained

    private void locationFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_locationFocusLost
        String location1=location.getText();
        if(location1.length()==0&&locationerror.getText().length()==0){
            locationerror.setVisible(true);
            locationerror.setText("Please enter your location");
            location.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            sign_UPBTN2.setEnabled(false);
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.Check_Location(location1);

            if(location1.length()==0){
                locationerror.setVisible(true);
                locationerror.setText("Please enter your location");
                location.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                sign_UPBTN2.setEnabled(false);
            }
            else{
                if(check==0){
                    locationerror.setText("");
                    locationerror.setVisible(false);
                    location.setBorder(BorderFactory.createEmptyBorder());
                }
                else  if(check==1)
                {
                    locationerror.setVisible(true);
                    location.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    locationerror.setText("Please enter letters only & vaild location");
                    sign_UPBTN2.setEnabled(false);
                }
                else  if(check==2)
                {
                    locationerror.setVisible(true);
                    location.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    locationerror.setText("Please enter letters only & vaild location");
                    sign_UPBTN2.setEnabled(false);
                }
            }}
    }//GEN-LAST:event_locationFocusLost

    private void locationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locationMouseClicked
        String location1= location.getText();
        if(location1.length()==0&&locationerror.getText().length()==0){
            location.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.Check_Location(location1);

            if(location1.length()==0){
                locationerror.setVisible(true);
                locationerror.setText("Please enter your location");
                location.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            else{
                if(check==0){
                    locationerror.setText("");
                    locationerror.setVisible(false);
                    location.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                }
                else  if(check==1)
                {
                    locationerror.setVisible(true);
                    location.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    locationerror.setText("Please enter letters only & vaild location");
                }
                else  if(check==2)
                {
                    locationerror.setVisible(true);
                    location.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    locationerror.setText("Please enter letters only & vaild location");
                }

            }
        }
    }//GEN-LAST:event_locationMouseClicked

    private void locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationActionPerformed

    private void locationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_locationKeyReleased
        String location1=location.getText();
        if(location1.length()==0&&locationerror.getText().length()==0){
            location.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.Check_Location(location1);

            if(location1.length()==0){
                locationerror.setVisible(true);
                locationerror.setText("Please enter your location");
                location.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            else{
                if(check==0){
                    locationerror.setText("");
                    locationerror.setVisible(false);
                    location.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                }
                else  if(check==1)
                {
                    locationerror.setVisible(true);
                    location.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    locationerror.setText("Please enter letters only & vaild location");
                }
                else  if(check==2)
                {
                    locationerror.setVisible(true);
                    location.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    locationerror.setText("Please enter letters only & vaild location");
                }
            }}
            if(nameerror.getText().length()==0&&passworderror.getText().length()==0&&usernameerror.getText().length()==0&&
                mailerror.getText().length()==0&&nationaliderror.getText().length()==0&&ageerror.getText().length()==0&&locationerror.getText().length()==0&&
                phoneerror.getText().length()==0&&visapassworderror.getText().length()==0&&visanumerror.getText().length()==0
                &&nametxt.getText().length()!=0  &&(String.valueOf(password.getPassword())).length()!=0  &&usernametxt5.getText().length()!=0
                &&mailtxt2.getText().length()!=0&&nationalid1.getText().length()!=0  &&age.getText().length()!=0
                &&phonetxt.getText().length()!=0&&visanum.getText().length()!=0  &&(String.valueOf(visaPassword.getPassword())).length()!=0)
            sign_UPBTN2.setEnabled(true);
    }//GEN-LAST:event_locationKeyReleased

    private void ageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFocusGained

    private void ageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFocusLost
        String ageparsed=age.getText();
        if(ageparsed.length()==0&&ageerror.getText().length()==0){
            ageerror.setVisible(true);
            ageerror.setText("Please enter your age");
            age.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            sign_UPBTN2.setEnabled(false);
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Age(ageparsed);
            if(ageparsed.length()==0){
                ageerror.setVisible(true);
                ageerror.setText("Please enter your age");
                age.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                sign_UPBTN2.setEnabled(false);
            }
            else{
                if(check==0){
                    ageerror.setText("");
                    ageerror.setVisible(false);
                    age.setBorder(BorderFactory.createEmptyBorder());
                }
                else  if(check==1)
                {ageerror.setVisible(true);
                    age.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    ageerror.setText("Please enter numbers only & your valid age");
                    sign_UPBTN2.setEnabled(false);
                } else  if(check==2)
                {
                    ageerror.setVisible(true);
                    age.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    ageerror.setText("Please enter numbers only");
                    sign_UPBTN2.setEnabled(false);
                } else  if(check==3)
                {
                    ageerror.setVisible(true);
                    age.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    ageerror.setText("Please enter your valid age");
                    sign_UPBTN2.setEnabled(false);
                }
                else  if(check==4)
                {
                    ageerror.setVisible(true);
                    age.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    ageerror.setText("Please enter your valid age");
                    sign_UPBTN2.setEnabled(false);
                }
            }

        }
    }//GEN-LAST:event_ageFocusLost

    private void ageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageMouseClicked
        String parsedage= age.getText();
        if(parsedage.length()==0&&ageerror.getText().length()==0){
            age.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Age(parsedage);

            if(parsedage.length()==0){
                ageerror.setVisible(true);
                ageerror.setText("Please enter your age");
                age.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            else{
                if(check==0){
                    ageerror.setText("");
                    ageerror.setVisible(false);
                    age.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                }
                else  if(check==1)
                {ageerror.setVisible(true);
                    age.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    ageerror.setText("Please enter numbers only & your valid age");
                } else  if(check==2)
                {
                    ageerror.setVisible(true);
                    age.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    ageerror.setText("Please enter numbers only");
                } else  if(check==3)
                {
                    ageerror.setVisible(true);
                    age.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    ageerror.setText("Please enter your valid age");

                }
                else  if(check==4)
                {
                    ageerror.setVisible(true);
                    age.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    ageerror.setText("Please enter your valid age");

                }
            }
        }
    }//GEN-LAST:event_ageMouseClicked

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void ageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyReleased
        String parsedage= age.getText();
        if(parsedage.length()==0&&ageerror.getText().length()==0){
            age.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Age(parsedage);

            if(parsedage.length()==0){
                ageerror.setVisible(true);
                ageerror.setText("Please enter your age");
                age.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            else{
                if(check==0){
                    ageerror.setText("");
                    ageerror.setVisible(false);
                    age.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                }
                else  if(check==1)
                {ageerror.setVisible(true);
                    age.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    ageerror.setText("Please enter numbers only & your valid age");
                } else  if(check==2)
                {
                    ageerror.setVisible(true);
                    age.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    ageerror.setText("Please enter numbers only");
                } else  if(check==3)
                {
                    ageerror.setVisible(true);
                    age.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    ageerror.setText("Please enter your valid age");

                }
                else  if(check==4)
                {
                    ageerror.setVisible(true);
                    age.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    ageerror.setText("Please enter your valid age");

                }
            }
        }
        if(nameerror.getText().length()==0&&passworderror.getText().length()==0&&usernameerror.getText().length()==0&&
            mailerror.getText().length()==0&&nationaliderror.getText().length()==0&&ageerror.getText().length()==0&&locationerror.getText().length()==0&&
            phoneerror.getText().length()==0&&visapassworderror.getText().length()==0&&visanumerror.getText().length()==0
            &&nametxt.getText().length()!=0  &&(String.valueOf(password.getPassword())).length()!=0  &&usernametxt5.getText().length()!=0
            &&mailtxt2.getText().length()!=0&&nationalid1.getText().length()!=0  &&age.getText().length()!=0
            &&phonetxt.getText().length()!=0&&visanum.getText().length()!=0  &&(String.valueOf(visaPassword.getPassword())).length()!=0)
        sign_UPBTN2.setEnabled(true);
    }//GEN-LAST:event_ageKeyReleased

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        String Password=String.valueOf(  password.getPassword());
        if(Password.length()==0){
            passworderror.setVisible(true);
            passworderror.setText("Please enter password");
            password.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            sign_UPBTN2.setEnabled(false);
        }else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Password(Password);

            if(check==0){
                passworderror.setText("");
                passworderror.setVisible(false);         password.setBorder(BorderFactory.createEmptyBorder());
            }
            else  if(check==1)
            {

                passworderror.setVisible(true);
                password.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                passworderror.setText("Please enter strong password");
                sign_UPBTN2.setEnabled(false);
            }
        }
    }//GEN-LAST:event_passwordFocusLost

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked

        String Password=String.valueOf(password.getPassword());
        if(Password.length()==0&&passworderror.getText().length()!=0){
            password.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));}
        else if(Password.length()==0&&passworderror.getText().length()==0){

            password.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Password(Password);

            if(check==0){
                passworderror.setText("");
                passworderror.setVisible(false);
                password.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
            }
            else  if(check==1)
            {

                passworderror.setVisible(true);
                password.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                passworderror.setText("Please enter strong password");
            }
        }

    }//GEN-LAST:event_passwordMouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        String Password=String.valueOf(password.getPassword());
        Admin admin_test=new Admin();
        int check=admin_test.check_Password(Password);

        if(check==0){
            passworderror.setText("");
            passworderror.setVisible(false);
            password.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
        }
        else  if(check==1)
        {

            passworderror.setVisible(true);
            password.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            passworderror.setText("Please enter strong password");
        }
        if(nameerror.getText().length()==0&&passworderror.getText().length()==0&&usernameerror.getText().length()==0&&
            mailerror.getText().length()==0&&nationaliderror.getText().length()==0&&ageerror.getText().length()==0&&locationerror.getText().length()==0&&
            phoneerror.getText().length()==0&&visapassworderror.getText().length()==0&&visanumerror.getText().length()==0
            &&nametxt.getText().length()!=0  &&(String.valueOf(password.getPassword())).length()!=0  &&usernametxt5.getText().length()!=0
            &&mailtxt2.getText().length()!=0&&nationalid1.getText().length()!=0  &&age.getText().length()!=0
            &&phonetxt.getText().length()!=0&&visanum.getText().length()!=0  &&(String.valueOf(visaPassword.getPassword())).length()!=0)
        sign_UPBTN2.setEnabled(true);
    }//GEN-LAST:event_passwordKeyReleased

    private void visanumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_visanumFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_visanumFocusGained

    private void visanumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_visanumFocusLost
        String visaNO= visanum.getText();
        if(visaNO.length()==0&&visanumerror.getText().length()==0){
            visanumerror.setVisible(true);
            visanumerror.setText("Please enter your visa number");
            visanum.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            sign_UPBTN2.setEnabled(false);
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Visa_no(visaNO);

            if(visaNO.length()==0){
                visanumerror.setVisible(true);
                visanumerror.setText("Please enter your visa number");
                visanum.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                sign_UPBTN2.setEnabled(false);
            }
            else{
                if(check==0){
                    visanumerror.setText("");
                    visanumerror.setVisible(false);
                    visanum.setBorder(BorderFactory.createEmptyBorder());
                }
                else  if(check==1)
                {
                    visanumerror.setVisible(true);
                    visanum.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    visanumerror.setText("Please enter valid visa number length & only numbers");
                    sign_UPBTN2.setEnabled(false);
                }
                else  if(check==2)
                {
                    visanumerror.setVisible(true);
                    visanum.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    visanumerror.setText("Please enter only numbers");
                    sign_UPBTN2.setEnabled(false);
                }
            }
        }
    }//GEN-LAST:event_visanumFocusLost

    private void visanumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visanumMouseClicked
        String visaNO= visanum.getText();
        if(visaNO.length()==0&&visanumerror.getText().length()==0){
            visanum.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Visa_no(visaNO);

            if(visaNO.length()==0){
                visanumerror.setVisible(true);
                visanumerror.setText("Please enter your visa number");
                visanum.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            else{
                if(check==0){
                    visanumerror.setText("");
                    visanumerror.setVisible(false);
                    visanum.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                }
                else  if(check==1)
                {
                    visanumerror.setVisible(true);
                    visanum.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    visanumerror.setText("Please enter valid visa number length & only numbers");
                }
                else  if(check==2)
                {
                    visanumerror.setVisible(true);
                    visanum.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    visanumerror.setText("Please enter only numbers");
                }
            }
        }
    }//GEN-LAST:event_visanumMouseClicked

    private void visanumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visanumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visanumActionPerformed

    private void visanumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_visanumKeyReleased
        String visaNO= visanum.getText();
        if(visaNO.length()==0&&visanumerror.getText().length()==0){
            visanum.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Visa_no(visaNO);

            if(visaNO.length()==0){
                visanumerror.setVisible(true);
                visanumerror.setText("Please enter your visa number");
                visanum.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            else{
                if(check==0){
                    visanumerror.setText("");
                    visanumerror.setVisible(false);
                    visanum.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                }
                else  if(check==1)
                {
                    visanumerror.setVisible(true);
                    visanum.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    visanumerror.setText("Please enter valid visa number length & only numbers");
                }
                else  if(check==2)
                {
                    visanumerror.setVisible(true);
                    visanum.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    visanumerror.setText("Please enter only numbers");
                }
            }
        }
        if(nameerror.getText().length()==0&&passworderror.getText().length()==0&&usernameerror.getText().length()==0&&
            mailerror.getText().length()==0&&nationaliderror.getText().length()==0&&ageerror.getText().length()==0&&locationerror.getText().length()==0&&
            phoneerror.getText().length()==0&&visapassworderror.getText().length()==0&&visanumerror.getText().length()==0
            &&nametxt.getText().length()!=0  &&(String.valueOf(password.getPassword())).length()!=0  &&usernametxt5.getText().length()!=0
            &&mailtxt2.getText().length()!=0&&nationalid1.getText().length()!=0  &&age.getText().length()!=0
            &&phonetxt.getText().length()!=0&&visanum.getText().length()!=0  &&(String.valueOf(visaPassword.getPassword())).length()!=0)
        sign_UPBTN2.setEnabled(true);
    }//GEN-LAST:event_visanumKeyReleased

    private void nameerrorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameerrorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_nameerrorMouseExited

    private void passworderrorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passworderrorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_passworderrorMouseExited

    private void mailerrorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailerrorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_mailerrorMouseExited

    private void usernameerrorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameerrorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameerrorMouseExited

    private void ageerrorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ageerrorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ageerrorMouseExited

    private void visanumerrorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visanumerrorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_visanumerrorMouseExited

    private void visapassworderrorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visapassworderrorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_visapassworderrorMouseExited

    private void phoneerrorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phoneerrorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneerrorMouseExited

    private void nationaliderrorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nationaliderrorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_nationaliderrorMouseExited

    private void locationerrorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_locationerrorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_locationerrorMouseExited

    private void SigninBTN1jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SigninBTN1jButton2ActionPerformed

        Show_SignUp.setBackground(new Color(1, 50, 67,110));
        SignUp_SignIn1.setVisible(false);
        enterData_SignUp.setVisible(false);
        SignUp_SignIn.setVisible(true);
        enterData_SignIn.setVisible(true);
       sign_inBTN1.setVisible(true);
        slideshow_imges();
    }//GEN-LAST:event_SigninBTN1jButton2ActionPerformed

    private void SignupBTNjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupBTNjButton2ActionPerformed
        SignUp_SignIn1.setVisible(true);
        SignUp_SignIn.setVisible(false);
        enterData_SignIn.setVisible(false);
        enterData_SignUp.setVisible(true);

        Show_SignUp1.setBackground(new Color(1, 50, 67,110));

        new Thread(){
            @Override
            public  void run(){

                try{
                    while (true){

                        ImageIcon myimage=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Capture25.jpg")));
                        Image img1=myimage.getImage();
                        Image img2=img1.getScaledInstance(slidershow8.getWidth(), slidershow8.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon IMG=new ImageIcon(img2);
                        slidershow8.setIcon(IMG);   Thread.sleep(2000);
                        slidershow8.setVisible(true);           slidershow10.setVisible(false);    slidershow11.setVisible(false);    slidershow12.setVisible(false);    slidershow13.setVisible(false);
                        slidershow9.setVisible(false);
                        Thread.sleep(2000);

                        ImageIcon myimage1=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Capture28.jpg")));
                        Image img3=myimage1.getImage();
                        Image img4=img3.getScaledInstance(slidershow9.getWidth(), slidershow9.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon IMG1=new ImageIcon(img4);
                        slidershow9.setIcon(IMG1);   Thread.sleep(2000);
                        slidershow9.setVisible(true);
                        slidershow8.setVisible(false);
                        slidershow10.setVisible(false);    slidershow11.setVisible(false);    slidershow12.setVisible(false);    slidershow13.setVisible(false);

                        Thread.sleep(2000);
                        ImageIcon myimage2=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Capture21.PNG")));
                        Image img5=myimage2.getImage();
                        Image img6=img5.getScaledInstance(slidershow10.getWidth(), slidershow10.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon IMG2=new ImageIcon(img6);
                        slidershow10.setIcon(IMG2);   Thread.sleep(2000);
                        slidershow8.setVisible(false);
                        slidershow9.setVisible(false);
                        slidershow10.setVisible(true);    slidershow11.setVisible(false);    slidershow12.setVisible(false);    slidershow13.setVisible(false);

                        Thread.sleep(2000);

                        ImageIcon myimage3=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Capture19.PNG")));

                        Image img7=myimage3.getImage();
                        Image img8=img7.getScaledInstance(slidershow11.getWidth(), slidershow11.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon IMG3=new ImageIcon(img8);
                        slidershow11.setIcon(IMG3);   Thread.sleep(2000);
                        slidershow8.setVisible(false);
                        slidershow9.setVisible(false);
                        slidershow10.setVisible(false);    slidershow11.setVisible(true);    slidershow12.setVisible(false);    slidershow13.setVisible(false);

                        Thread.sleep(2000);
                        ImageIcon myimage5=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Capture23.PNG")));

                        Image img11=myimage5.getImage();
                        Image img12=img11.getScaledInstance(slidershow12.getWidth(), slidershow12.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon IMG5=new ImageIcon(img12);
                        slidershow12.setIcon(IMG5);
                        Thread.sleep(2000);
                        slidershow8.setVisible(false);
                        slidershow9.setVisible(false);
                        slidershow10.setVisible(false);    slidershow11.setVisible(false);    slidershow13.setVisible(false);    slidershow12.setVisible(true);

                        Thread.sleep(2000);
                        ImageIcon myimage4=new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Capture26.jpg")));
                        Image img9=myimage4.getImage();
                        Image img10=img9.getScaledInstance(slidershow13.getWidth(), slidershow13.getHeight(), Image.SCALE_SMOOTH);
                        ImageIcon IMG4=new ImageIcon(img10);
                        slidershow13.setIcon(IMG4);
                        Thread.sleep(2000);
                        slidershow8.setVisible(false);
                        slidershow9.setVisible(false);
                        slidershow10.setVisible(false);    slidershow11.setVisible(false);    slidershow13.setVisible(true);    slidershow12.setVisible(false);

                        Thread.sleep(2000);

                    }

                }catch(Exception ex){

                }
            }
        }.start();

    }//GEN-LAST:event_SignupBTNjButton2ActionPerformed

    private void passwordtxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordtxtFocusGained

    }//GEN-LAST:event_passwordtxtFocusGained

    private void passwordtxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordtxtFocusLost
        passwordtxt.setBorder(BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_passwordtxtFocusLost

    private void passwordtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordtxtMouseClicked
        String password=String.valueOf(passwordtxt.getPassword());
        if(password.length()==0&&usernameorpassworderrorsignin1.getText().length()==0||password.length()!=0&&usernameorpassworderrorsignin1.getText().length()==0){
            passwordtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
            usernameorpassworderrorsignin1.setText("");
            usernameorpassworderrorsignin1.setVisible(false);
        }
        else if(usernameorpassworderrorsignin1.getText().length()!=0){
            usernameorpassworderrorsignin1.setText("");
            usernameorpassworderrorsignin1.setVisible(false);
            passwordtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
    }//GEN-LAST:event_passwordtxtMouseClicked

    private void passwordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtxtActionPerformed

    }//GEN-LAST:event_passwordtxtActionPerformed

    private void passwordtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordtxtKeyReleased
        if(usernametxt1.getText().length()!=0&&String.valueOf(passwordtxt.getPassword()).length()!=0)
        sign_inBTN1.setEnabled(true);
        else
        sign_inBTN1.setEnabled(false);
    }//GEN-LAST:event_passwordtxtKeyReleased

    private void mailsysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mailsysMouseClicked
        try {
            String uri="https://mail.yahoo.com/d/compose/6934265107";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(uri));
        } catch (IOException ex) {
            Logger.getLogger(Login_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mailsysMouseClicked

    private void facebooklinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facebooklinkMouseClicked

        try {
            String uri="https://www.facebook.com/Bus-Tra-340100159975139/?modal=admin_todo_tour";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(uri));
        } catch (IOException ex) {
            Logger.getLogger(Login_form.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_facebooklinkMouseClicked

    private void twitterlinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitterlinkMouseClicked

        try {
            String uri="https://twitter.com/Twitter?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(uri));
        } catch (IOException ex) {
            Logger.getLogger(Login_form.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_twitterlinkMouseClicked

    private void GpluslinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GpluslinkMouseClicked
        try {
            String uri="https://aboutme.google.com/u/0/";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(uri));
        } catch (IOException ex) {
            Logger.getLogger(Login_form.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_GpluslinkMouseClicked

    private void forgetpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgetpasswordActionPerformed
        usernameorpassworderrorsignin1.setText("");
        emailtxtforgetpassword.setBorder(BorderFactory.createEmptyBorder());
        usernametxt1.setText("");
        passwordtxt.setText("");
        emailrrorsignin.setText("");
        emailtxtforgetpassword.setText("");
        usernametxt1.setVisible(false);
        usernameseparator1.setVisible(false);
        usernameloginlbl1.setVisible(false);
        usernameorpassworderrorsignin1.setVisible(false);
        passwordlbl.setVisible(false);
        passwordtxt.setVisible(false);
        usernameorpassworderrorsignin1.setVisible(false);
        passwordseparator.setVisible(false);
        forgetpassword.setVisible(false);
        sign_inBTN1.setVisible(false);
        finalsend2.setVisible(true);
        forgetpasswordpanel.setVisible(true);
        finalsend.setVisible(false);
        newpassworderror.setVisible(false);
        newpasswordlbl1.setVisible(false);
        newpasswordseparator1.setVisible(false);
        newpasswordtxt1.setVisible(false);
    }//GEN-LAST:event_forgetpasswordActionPerformed

    private void usernameorpassworderrorsignin1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameorpassworderrorsignin1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameorpassworderrorsignin1MouseExited

    private void sign_inBTN1jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sign_inBTN1jButton2ActionPerformed
        String parsedUsername = usernametxt1.getText();
        String parsedPassword = String.valueOf(passwordtxt.getPassword());
        Admin admin = new Admin();
        Customer customer = new Customer();
        Driver driver = new Driver();
        if(admin.login(parsedUsername, parsedPassword))
        {
            this.dispose();
            admin_form adminForm = new admin_form();
            adminForm.setVisible(true);
        }
        else if(driver.login(parsedUsername, parsedPassword))
        {
            this.dispose();
            driver_form driverForm = new driver_form();
            driverForm.setVisible(true);
        }
        else if(customer.login(parsedUsername, parsedPassword))
        {
            this.dispose();
            customer_form customerForm = new customer_form();
            customerForm.setVisible(true);
        }
        else
        {
            usernameorpassworderrorsignin1.setVisible(true);
            usernameorpassworderrorsignin1.setText("                                   Wrong username or password ");
            usernametxt1.setText("");
            usernametxt1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            passwordtxt.setText("");
            passwordtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            sign_inBTN1.setEnabled(false);
        }
    }//GEN-LAST:event_sign_inBTN1jButton2ActionPerformed

    private void usernametxt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernametxt1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_usernametxt1FocusGained

    private void usernametxt1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernametxt1FocusLost
        usernametxt1.setBorder(BorderFactory.createEmptyBorder());

    }//GEN-LAST:event_usernametxt1FocusLost

    private void usernametxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernametxt1MouseClicked
        String username=usernametxt1.getText();
        if(username.length()==0&&usernameorpassworderrorsignin1.getText().length()==0||username.length()!=0&&usernameorpassworderrorsignin1.getText().length()==0){
            usernametxt1.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
            usernameorpassworderrorsignin1.setText("");
            usernameorpassworderrorsignin1.setVisible(false);
        }
        else if(usernameorpassworderrorsignin1.getText().length()!=0){
            usernameorpassworderrorsignin1.setText("");
            usernameorpassworderrorsignin1.setVisible(false);
            usernametxt1.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
    }//GEN-LAST:event_usernametxt1MouseClicked

    private void usernametxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametxt1ActionPerformed

    }//GEN-LAST:event_usernametxt1ActionPerformed

    private void usernametxt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernametxt1KeyReleased
        if(usernametxt1.getText().length()!=0&&String.valueOf(passwordtxt.getPassword()).length()!=0)
        sign_inBTN1.setEnabled(true);
        else
        sign_inBTN1.setEnabled(false);
    }//GEN-LAST:event_usernametxt1KeyReleased

    private void emailtxtforgetpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailtxtforgetpasswordFocusGained

    }//GEN-LAST:event_emailtxtforgetpasswordFocusGained

    private void emailtxtforgetpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailtxtforgetpasswordFocusLost
        String mail=emailtxtforgetpassword.getText();
        Admin admin_test=new Admin();
        int check=admin_test.check_Email_found(mail);
        if(mail.length()==0){
            emailrrorsignin.setVisible(true);
            emailrrorsignin.setText("Please enter your e-mail");
            emailtxtforgetpassword.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            finalsend2.setEnabled(false);
        } else{
            if(check==0){
                emailrrorsignin.setText("");
                emailrrorsignin.setVisible(false);
                newpasswordlbl1.setVisible(true);
                newpasswordseparator1.setVisible(true);
                newpasswordtxt1.setVisible(true);
                finalsend2.setVisible(false);
                finalsend.setVisible(true);
                emailtxtforgetpassword.setBorder(BorderFactory.createEmptyBorder());
            }
            else  if(check==2){
                emailrrorsignin.setText("");
                emailrrorsignin.setVisible(false);
                newpasswordlbl1.setVisible(true);
                newpasswordseparator1.setVisible(true);
                finalsend2.setVisible(false);
                finalsend.setVisible(true);
                newpasswordtxt1.setVisible(true);
                emailtxtforgetpassword.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                current_Person_reset_password=false;
                return;

            }
            else  if(check==1)
            {
                emailrrorsignin.setVisible(true);
                finalsend2.setEnabled(false);
                emailrrorsignin.setText("Please enter your valid E-mail");
            }
        }
        if(emailtxtforgetpassword.getText().length()!=0&&String.valueOf(newpasswordtxt1.getPassword()).length()!=0
            &&emailrrorsignin.getText().length()==0&&newpassworderror.getText().length()==0)
        {
            finalsend.setVisible(true);
            finalsend.setEnabled(true);
        }
        if(emailrrorsignin.getText().length()!=0||newpassworderror.getText().length()!=0)
        {
            finalsend.setEnabled(false);
        }

    }//GEN-LAST:event_emailtxtforgetpasswordFocusLost

    private void emailtxtforgetpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailtxtforgetpasswordMouseClicked
        String mail=emailtxtforgetpassword.getText();
        if(mail.length()==0&&emailrrorsignin.getText().length()==0){
            emailtxtforgetpassword.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));

        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Email_found(mail);
            if(mail.length()==0){
                emailrrorsignin.setVisible(true);
                emailrrorsignin.setText("Please enter your e-mail");
                emailtxtforgetpassword.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            else{
                if(check==0){
                    emailrrorsignin.setText("");
                    emailrrorsignin.setVisible(false);
                    newpasswordlbl1.setVisible(true);
                    newpasswordseparator1.setVisible(true);
                    finalsend2.setVisible(false);
                    finalsend.setVisible(true);
                    newpasswordtxt1.setVisible(true);
                    emailtxtforgetpassword.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                    return; }
                else  if(check==2){
                    emailrrorsignin.setText("");
                    emailrrorsignin.setVisible(false);
                    newpasswordlbl1.setVisible(true);
                    newpasswordseparator1.setVisible(true);
                    finalsend2.setVisible(false);
                    finalsend.setVisible(true);
                    newpasswordtxt1.setVisible(true);
                    emailtxtforgetpassword.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                    current_Person_reset_password=false;
                    return;

                }
                else  if(check==1)
                {
                    emailrrorsignin.setVisible(true);
                    emailtxtforgetpassword.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    emailrrorsignin.setText("Please enter your valid E-mail");
                }
            }
            if(emailtxtforgetpassword.getText().length()!=0&&String.valueOf(newpasswordtxt1.getPassword()).length()!=0
                &&emailrrorsignin.getText().length()==0&&newpassworderror.getText().length()==0)
            {
                finalsend.setVisible(true);
                finalsend.setEnabled(true);
            }
            if(emailrrorsignin.getText().length()!=0||newpassworderror.getText().length()!=0)
            {
                finalsend.setEnabled(false);
            }
        }
    }//GEN-LAST:event_emailtxtforgetpasswordMouseClicked

    private void emailtxtforgetpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxtforgetpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxtforgetpasswordActionPerformed

    private void emailtxtforgetpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailtxtforgetpasswordKeyReleased

        String mail=emailtxtforgetpassword.getText();
        if(mail.length()==0&&emailrrorsignin.getText().length()==0){
            emailtxtforgetpassword.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Email_found(mail);

            if(mail.length()==0){
                emailrrorsignin.setVisible(true);
                emailrrorsignin.setText("Please enter your e-mail");
                emailtxtforgetpassword.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            }
            else{
                if(check==0){
                    emailrrorsignin.setText("");
                    emailrrorsignin.setVisible(false);
                    newpasswordlbl1.setVisible(true);
                    newpasswordseparator1.setVisible(true);
                    finalsend2.setVisible(false);
                    finalsend.setVisible(true);
                    newpasswordtxt1.setVisible(true);
                    emailrrorsignin.setVisible(false);
                    finalsend.setEnabled(true);
                    emailtxtforgetpassword.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                    return;

                }
                else  if(check==2){
                    emailrrorsignin.setText("");
                    emailrrorsignin.setVisible(false);
                    newpasswordlbl1.setVisible(true);
                    newpasswordseparator1.setVisible(true);
                    finalsend2.setVisible(false);
                    finalsend.setVisible(true);
                    newpasswordtxt1.setVisible(true);
                    emailtxtforgetpassword.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                    current_Person_reset_password=false;
                    return;

                }
                else  if(check==1)
                {
                    emailrrorsignin.setVisible(true);
                    emailtxtforgetpassword.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                    emailrrorsignin.setText("Please enter your valid E-mail");
                }
                if(emailrrorsignin.getText().length()==0&&newpassworderror.getText().length()==0)
                {
                    finalsend.setVisible(true);
                    finalsend.setEnabled(true);
                }
                if(emailrrorsignin.getText().length()!=0||newpassworderror.getText().length()!=0)
                {
                    finalsend.setEnabled(false);
                }
            }

        }
    }//GEN-LAST:event_emailtxtforgetpasswordKeyReleased

    private void newpasswordtxt1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newpasswordtxt1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_newpasswordtxt1FocusGained

    private void newpasswordtxt1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newpasswordtxt1FocusLost
        String email=emailtxtforgetpassword.getText();
        String Password=String.valueOf(newpasswordtxt1.getPassword());
        if(Password.length()==0&&newpassworderror.getText().length()!=0){
            newpasswordtxt1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));}
        else if(Password.length()==0&&newpassworderror.getText().length()==0){
            newpasswordtxt1.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Password(Password);
            if(check==0){
                newpassworderror.setText("");
                newpassworderror.setVisible(false);
                finalsend2.setVisible(false);
                finalsend.setVisible(true);
                newpasswordtxt1.setBorder(BorderFactory.createEmptyBorder());
            }
            else  if(check==1)
            {
                newpassworderror.setVisible(true);
                newpasswordtxt1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                newpassworderror.setText("Please enter strong password");
            }
        }
        if(emailtxtforgetpassword.getText().length()!=0&&String.valueOf(newpasswordtxt1.getPassword()).length()!=0
            &&emailrrorsignin.getText().length()==0&&newpassworderror.getText().length()==0)
        {
            finalsend.setVisible(true);
            finalsend.setEnabled(true);
        }
        if(emailrrorsignin.getText().length()!=0||newpassworderror.getText().length()!=0)
        {
            finalsend.setEnabled(false);
        }
    }//GEN-LAST:event_newpasswordtxt1FocusLost

    private void newpasswordtxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newpasswordtxt1MouseClicked
        String email=emailtxtforgetpassword.getText();
        String Password=String.valueOf(newpasswordtxt1.getPassword());
        if(Password.length()==0&&newpassworderror.getText().length()!=0){
            newpasswordtxt1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));}
        else if(Password.length()==0&&newpassworderror.getText().length()==0){
            newpasswordtxt1.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Password(Password);
            if(check==0){
                newpassworderror.setText("");
                newpassworderror.setVisible(false);
                finalsend2.setVisible(false);
                finalsend.setVisible(true);
                newpasswordtxt1.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
            }
            else  if(check==1)
            {
                newpassworderror.setVisible(true);
                newpasswordtxt1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                newpassworderror.setText("Please enter strong password");
            }
        }
        if(emailtxtforgetpassword.getText().length()!=0&&String.valueOf(newpasswordtxt1.getPassword()).length()!=0
            &&emailrrorsignin.getText().length()==0&&newpassworderror.getText().length()==0)
        {
            finalsend.setVisible(true);
            finalsend.setEnabled(true);
        }
        if(emailrrorsignin.getText().length()!=0||newpassworderror.getText().length()!=0)
        {
            finalsend.setEnabled(false);
        }
    }//GEN-LAST:event_newpasswordtxt1MouseClicked

    private void newpasswordtxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpasswordtxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpasswordtxt1ActionPerformed

    private void newpasswordtxt1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newpasswordtxt1KeyReleased
        String email=emailtxtforgetpassword.getText();
        String Password=String.valueOf(newpasswordtxt1.getPassword());
        if(Password.length()==0&&newpassworderror.getText().length()!=0){
            newpasswordtxt1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));}
        else if(Password.length()==0&&newpassworderror.getText().length()==0){
            newpasswordtxt1.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        }
        else{
            Admin admin_test=new Admin();
            int check=admin_test.check_Password(Password);
            if(check==0){
                newpassworderror.setText("");
                newpassworderror.setVisible(false);
                newpasswordtxt1.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
            }
            else  if(check==1)
            {
                newpassworderror.setVisible(true);
                newpasswordtxt1.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                newpassworderror.setText("Please enter strong password");
            }
        }
        if(emailtxtforgetpassword.getText().length()!=0&&String.valueOf(newpasswordtxt1.getPassword()).length()!=0
            &&emailrrorsignin.getText().length()==0&&newpassworderror.getText().length()==0)
        {
            finalsend.setVisible(true);
            finalsend.setEnabled(true);
        }
        if(emailrrorsignin.getText().length()!=0||newpassworderror.getText().length()!=0)
        {
            finalsend.setEnabled(false);
        }
    }//GEN-LAST:event_newpasswordtxt1KeyReleased

    private void newpassworderrorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newpassworderrorMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_newpassworderrorMouseExited

    private void emailrrorsigninMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailrrorsigninMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_emailrrorsigninMouseExited

    private void finalsendjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalsendjButton2ActionPerformed

        String email=emailtxtforgetpassword.getText();
        String Password=String.valueOf(newpasswordtxt1.getPassword());
        if(current_Person_reset_password==true){
            Customer cus =new Customer();
            cus.Edit_newPassword(email, Password);
            Admin admin_test=new Admin();
            admin_test.reset_Fogetten_Passwordforcustomer(email);
        }
        else if (current_Person_reset_password==false){
            Driver dri=new Driver();
            dri.Edit_newPasswordDriver(email, Password);
            Admin admin_test=new Admin();
            admin_test.reset_Fogetten_Passwordfor_driver(email);
        }
        this.dispose();
        new   Login_form().setVisible(true);

    }//GEN-LAST:event_finalsendjButton2ActionPerformed

    private void finalsend2jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalsend2jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_finalsend2jButton2ActionPerformed

    private void backlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlblMouseClicked
        usernameorpassworderrorsignin1.setText("");
        usernametxt1.setText("");
        passwordtxt.setText("");
        usernametxt1.setBorder(BorderFactory.createEmptyBorder());
        passwordtxt.setBorder(BorderFactory.createEmptyBorder());
        usernametxt1.setVisible(true);
        usernameseparator1.setVisible(true);
        usernameloginlbl1.setVisible(true);
        usernameorpassworderrorsignin1.setVisible(true);
        passwordlbl.setVisible(true);
        passwordtxt.setVisible(true);
        usernameorpassworderrorsignin1.setVisible(true);
        passwordseparator.setVisible(true);
        forgetpassword.setVisible(true);
        sign_inBTN1.setVisible(true);
        forgetpasswordpanel.setVisible(false);

    }//GEN-LAST:event_backlblMouseClicked

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
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gpluslink;
    private javax.swing.JLabel Gpluslink2;
    private javax.swing.JLabel Intro;
    private javax.swing.JLabel Intro1;
    private javax.swing.JLabel Intro2;
    private javax.swing.JLabel Intro3;
    private javax.swing.JPanel Show_SignUp;
    private javax.swing.JPanel Show_SignUp1;
    private javax.swing.JPanel SignUp_SignIn;
    private javax.swing.JPanel SignUp_SignIn1;
    private javax.swing.JButton SigninBTN1;
    private javax.swing.JButton SignupBTN;
    private javax.swing.JLabel Visanumlbl;
    private javax.swing.JTextField age;
    private javax.swing.JLabel ageerror;
    private javax.swing.JLabel agelbl2;
    private javax.swing.JSeparator ageseparator;
    private javax.swing.JLabel backlbl;
    private javax.swing.JLabel bustra2;
    private javax.swing.JLabel bustra3;
    private javax.swing.JLabel email;
    private javax.swing.JLabel emaillblforgetpassword1;
    private javax.swing.JLabel emailrrorsignin;
    private javax.swing.JSeparator emailseparatorfogetpassword;
    private javax.swing.JTextField emailtxtforgetpassword;
    private javax.swing.JPanel enterData_SignIn;
    private javax.swing.JPanel enterData_SignUp;
    private javax.swing.JLabel facebooklink;
    private javax.swing.JLabel facebooklink2;
    private javax.swing.JButton finalsend;
    private javax.swing.JButton finalsend2;
    private javax.swing.JCheckBox forgetpassword;
    private javax.swing.JPanel forgetpasswordpanel;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel hellofriends2;
    private javax.swing.JLabel hellofriends3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField location;
    private javax.swing.JLabel locationerror;
    private javax.swing.JLabel locationlbl6;
    private javax.swing.JSeparator locationseparator;
    private javax.swing.JLabel mailerror;
    private javax.swing.JSeparator mailseparator;
    private javax.swing.JLabel mailsys;
    private javax.swing.JLabel mailsys2;
    private javax.swing.JTextField mailtxt2;
    private javax.swing.JLabel nameerror;
    private javax.swing.JLabel namelbl;
    private javax.swing.JSeparator nameseparator;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField nationalid1;
    private javax.swing.JLabel nationaliderror;
    private javax.swing.JLabel nationalidibi;
    private javax.swing.JSeparator nationalidseparator;
    private javax.swing.JLabel newpassworderror;
    private javax.swing.JLabel newpasswordlbl1;
    private javax.swing.JSeparator newpasswordseparator1;
    private javax.swing.JPasswordField newpasswordtxt1;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passworderror;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JLabel passwordlbl2;
    private javax.swing.JSeparator passwordseparator;
    private javax.swing.JSeparator passwordseparator4;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JLabel phoneerror;
    private javax.swing.JLabel phonelbl3;
    private javax.swing.JSeparator phoneseparator;
    private javax.swing.JLabel phonesys;
    private javax.swing.JLabel phonesys2;
    private javax.swing.JTextField phonetxt;
    private javax.swing.JLabel privacylbl;
    private javax.swing.JLabel privacylbl2;
    private javax.swing.JButton sign_UPBTN2;
    private javax.swing.JButton sign_inBTN1;
    private javax.swing.JLabel slidershow;
    private javax.swing.JLabel slidershow1;
    private javax.swing.JLabel slidershow10;
    private javax.swing.JLabel slidershow11;
    private javax.swing.JLabel slidershow12;
    private javax.swing.JLabel slidershow13;
    private javax.swing.JLabel slidershow2;
    private javax.swing.JLabel slidershow3;
    private javax.swing.JLabel slidershow4;
    private javax.swing.JLabel slidershow5;
    private javax.swing.JLabel slidershow6;
    private javax.swing.JLabel slidershow7;
    private javax.swing.JLabel slidershow8;
    private javax.swing.JLabel slidershow9;
    private javax.swing.JLabel twitterlink;
    private javax.swing.JLabel twitterlink2;
    private javax.swing.JLabel usernameerror;
    private javax.swing.JLabel usernamelbl2;
    private javax.swing.JLabel usernameloginlbl1;
    private javax.swing.JLabel usernameorpassworderrorsignin1;
    private javax.swing.JSeparator usernameseparator1;
    private javax.swing.JSeparator usernameseparator4;
    private javax.swing.JTextField usernametxt1;
    private javax.swing.JTextField usernametxt5;
    private javax.swing.JPasswordField visaPassword;
    private javax.swing.JTextField visanum;
    private javax.swing.JSeparator visanumberseparator;
    private javax.swing.JLabel visanumerror;
    private javax.swing.JLabel visapassworderror;
    private javax.swing.JLabel visapasswordlbl4;
    private javax.swing.JSeparator visapasswordseparator5;
    // End of variables declaration//GEN-END:variables
}
