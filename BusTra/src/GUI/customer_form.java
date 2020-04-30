package GUI;


import Bus.Bus;
import Bus.Classic;
import Bus.Elite;
import java.awt.Color;
import javax.swing.JLabel;
import Bus_Reservation_System.Bus_Reservation_System;
import static Bus_Reservation_System.Bus_Reservation_System.Bus_list;
import static Bus_Reservation_System.Bus_Reservation_System.Customer_trips_list;
import static Bus_Reservation_System.Bus_Reservation_System.Trip_list;
import static Bus_Reservation_System.Bus_Reservation_System.current_customer;
import static Bus_Reservation_System.Bus_Reservation_System.load_data;
import static Bus_Reservation_System.Bus_Reservation_System.upload_customers_trips_data;
import Person.*;
import Trip.Trip;
import customers_trips.customers_trips;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.RadioButton;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import mySQL.Sec;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kk
 */
public class customer_form extends javax.swing.JFrame {
Admin admin = new Admin();
  ArrayList<Trip> list =new ArrayList<Trip>();
  public static  Trip selectedTrip=new  Trip();
  public static  String selected_seat_customer="";
    public static String selected_seat_trip="";
  public      Classic BusClassic=null;
  public       Elite BusElite=null;
  public int count_seat=0;  
    /**
     * Creates new form customer_form
     */
      public void setlabelcolor(JLabel lbl){
    lbl.setForeground( new Color(0, 181, 204));
}
public void resetlabelcolor(JLabel lbl){
    lbl.setForeground( new Color(204,204,204));
}
    public customer_form() {
        initComponents();
         selectedTrip.setPickUp(current_customer.getPosition());
        seatselectionElite.setVisible(false);
        seatselectionClassic.setVisible(false);
        pickupdate.setVisible(false);
          pickuptime.setVisible(false);
          bustype.setVisible(false);
            A_booked.setVisible(false);
              B_booked.setVisible(false);
                C_booked.setVisible(false);
                  D_booked.setVisible(false); 
                  E_booked.setVisible(false);
                    F_booked.setVisible(false);
                  G_booked.setVisible(false);
                    H_booked.setVisible(false);
                  seatselectionClassic.setVisible(false);
                      seatselectionElite.setVisible(false);
               
    }
    public void chech_reserved_seats(String seat_reserveed_code){
        if(seat_reserveed_code.length()==0)
            
            return;
        else
        for(int k=0;k<seat_reserveed_code.length();k++)
        {
            if("A".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  A.setEnabled(false); }
            else   if("B".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  B.setEnabled(false); }
                else   if("C".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  C.setEnabled(false); }
                else   if("D".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  D.setEnabled(false); }
                else   if("E".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  E.setEnabled(false); }
              else   if("F".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  F.setEnabled(false); }
                else   if("G".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  G.setEnabled(false); }
                else   if("H".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  H.setEnabled(false); }
                else   if("I".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  I.setEnabled(false); }
                else   if("J".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  J.setEnabled(false); }   
                else   if("K".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  K.setEnabled(false); }
                else   if("L".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  L.setEnabled(false); }
                else   if("M".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  M.setEnabled(false); }
                else   if("N".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  N.setEnabled(false); }
                else   if("O".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  O.setEnabled(false); }
                else   if("P".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  P.setEnabled(false); }
                else   if("Q".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  Q.setEnabled(false); }
                else   if("R".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  R.setEnabled(false); }
                else   if("S".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            { S.setEnabled(false); }
                else   if("T".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  T.setEnabled(false); }
                else   if("U".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  U.setEnabled(false); }
                else   if("V".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  V.setEnabled(false); }
                else   if("W".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  W.setEnabled(false); }
                else   if("X".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  X.setEnabled(false); }
                else   if("Y".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  Y.setEnabled(false); }
                else   if("Z".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  Z.setEnabled(false); }
                else   if("a".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  a.setEnabled(false); }
                else   if("b".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  b.setEnabled(false); }
                else   if("c".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  c.setEnabled(false); }
                else   if("d".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  d.setEnabled(false); }
                else   if("e".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  e.setEnabled(false); }
                else   if("f".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  f.setEnabled(false); }
                else   if("g".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  g.setEnabled(false); }
                else   if("h".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  h.setEnabled(false); }
                  else   if("i".equals(String.valueOf(seat_reserveed_code.charAt(k))))
            {  i.setEnabled(false); }
          else   if("j".equals(String.valueOf(seat_reserveed_code.charAt(k))))
                {j.setEnabled(false);}
                
            
            
            
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baseside = new javax.swing.JPanel();
        CAccInfoLabel = new javax.swing.JLabel();
        CEditInfoLabel = new javax.swing.JLabel();
        CUpcomingLabel = new javax.swing.JLabel();
        CRunningLabel = new javax.swing.JLabel();
        CHistoryLabel = new javax.swing.JLabel();
        deleteBookLabel = new javax.swing.JLabel();
        bookLabel = new javax.swing.JLabel();
        ClogOut = new javax.swing.JLabel();
        maincustomerPanel = new javax.swing.JPanel();
        CstartPanel = new javax.swing.JPanel();
        deleteBookPanel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        noTripsLabel = new javax.swing.JLabel();
        deleteBookBtn = new javax.swing.JButton();
        chooseTripLbl = new javax.swing.JLabel();
        upTripsComboBox = new javax.swing.JComboBox<>();
        CAccInfo = new javax.swing.JPanel();
        CaccinfoHeader = new javax.swing.JPanel();
        CaccinfoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CaccInfotxt = new javax.swing.JTextArea();
        Cupcoming = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        CupcomingTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CRunning = new javax.swing.JPanel();
        CrunningHeader = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CRunningtxt = new javax.swing.JTextArea();
        ChistoryTable = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        CdoneTable = new javax.swing.JTable();
        CEditInfo = new javax.swing.JPanel();
        CeditHeader = new javax.swing.JPanel();
        CeditLabel = new javax.swing.JLabel();
        CeditUsername = new javax.swing.JLabel();
        CeditPassword = new javax.swing.JLabel();
        CeditEmail = new javax.swing.JLabel();
        CeditUsernametxt = new javax.swing.JTextField();
        CeditPasswordtxt = new javax.swing.JTextField();
        CeditEmailtxt = new javax.swing.JTextField();
        CsaveEditBtn = new javax.swing.JButton();
        PhoneLabel = new javax.swing.JLabel();
        CVnumLabel = new javax.swing.JLabel();
        CVpassLabel = new javax.swing.JLabel();
        CeditPhonetxt = new javax.swing.JTextField();
        CeditVnumtxt = new javax.swing.JTextField();
        CeditVpasstxt = new javax.swing.JTextField();
        CuserError = new javax.swing.JLabel();
        CpassError = new javax.swing.JLabel();
        CemailError = new javax.swing.JLabel();
        CphoneError = new javax.swing.JLabel();
        CVnoError = new javax.swing.JLabel();
        CVpassError = new javax.swing.JLabel();
        bookPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pickupdate = new javax.swing.JComboBox<>();
        currentlocation = new javax.swing.JTextField();
        fromlbl = new javax.swing.JLabel();
        suitabletrips1 = new javax.swing.JComboBox<>();
        pickuptime = new javax.swing.JComboBox<>();
        bustype = new javax.swing.JComboBox<>();
        seatselectionElite = new javax.swing.JPanel();
        B = new javax.swing.JCheckBox();
        C = new javax.swing.JCheckBox();
        D = new javax.swing.JCheckBox();
        E = new javax.swing.JCheckBox();
        F = new javax.swing.JCheckBox();
        A = new javax.swing.JCheckBox();
        G = new javax.swing.JCheckBox();
        I = new javax.swing.JCheckBox();
        J = new javax.swing.JCheckBox();
        K = new javax.swing.JCheckBox();
        L = new javax.swing.JCheckBox();
        H = new javax.swing.JCheckBox();
        A_booked = new javax.swing.JCheckBox();
        B_booked = new javax.swing.JCheckBox();
        C_booked = new javax.swing.JCheckBox();
        D_booked = new javax.swing.JCheckBox();
        E_booked = new javax.swing.JCheckBox();
        F_booked = new javax.swing.JCheckBox();
        G_booked = new javax.swing.JCheckBox();
        H_booked = new javax.swing.JCheckBox();
        I_booked = new javax.swing.JCheckBox();
        J_booked = new javax.swing.JCheckBox();
        K_booked = new javax.swing.JCheckBox();
        L_booked = new javax.swing.JCheckBox();
        seatselectionClassic = new javax.swing.JPanel();
        M = new javax.swing.JCheckBox();
        O = new javax.swing.JCheckBox();
        N = new javax.swing.JCheckBox();
        Q = new javax.swing.JCheckBox();
        P = new javax.swing.JCheckBox();
        S = new javax.swing.JCheckBox();
        T = new javax.swing.JCheckBox();
        U = new javax.swing.JCheckBox();
        V = new javax.swing.JCheckBox();
        W = new javax.swing.JCheckBox();
        R = new javax.swing.JCheckBox();
        Y = new javax.swing.JCheckBox();
        Z = new javax.swing.JCheckBox();
        a = new javax.swing.JCheckBox();
        X = new javax.swing.JCheckBox();
        c = new javax.swing.JCheckBox();
        d = new javax.swing.JCheckBox();
        b = new javax.swing.JCheckBox();
        j = new javax.swing.JCheckBox();
        g = new javax.swing.JCheckBox();
        h = new javax.swing.JCheckBox();
        i = new javax.swing.JCheckBox();
        e = new javax.swing.JCheckBox();
        f = new javax.swing.JCheckBox();
        M_booked = new javax.swing.JCheckBox();
        N_booked = new javax.swing.JCheckBox();
        O_booked = new javax.swing.JCheckBox();
        P_booked = new javax.swing.JCheckBox();
        Q_booked = new javax.swing.JCheckBox();
        R_booked = new javax.swing.JCheckBox();
        S_booked = new javax.swing.JCheckBox();
        T_booked = new javax.swing.JCheckBox();
        U_booked = new javax.swing.JCheckBox();
        V_booked = new javax.swing.JCheckBox();
        W_booked = new javax.swing.JCheckBox();
        X_booked = new javax.swing.JCheckBox();
        Y_booked = new javax.swing.JCheckBox();
        Z_booked = new javax.swing.JCheckBox();
        a_booked = new javax.swing.JCheckBox();
        b_booked = new javax.swing.JCheckBox();
        c_booked = new javax.swing.JCheckBox();
        d_booked = new javax.swing.JCheckBox();
        e_booked = new javax.swing.JCheckBox();
        f_booked = new javax.swing.JCheckBox();
        g_booked = new javax.swing.JCheckBox();
        h_booked = new javax.swing.JCheckBox();
        i_booked = new javax.swing.JCheckBox();
        j_booked = new javax.swing.JCheckBox();
        num_of_selectedseat = new javax.swing.JTextField();
        no_selected_seatcodelbl = new javax.swing.JLabel();
        totalcoselbl = new javax.swing.JLabel();
        totalcostTXT = new javax.swing.JTextField();
        RESERVE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        baseside.setBackground(new java.awt.Color(34, 49, 63));
        baseside.setForeground(new java.awt.Color(153, 153, 153));

        CAccInfoLabel.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        CAccInfoLabel.setForeground(new java.awt.Color(204, 204, 204));
        CAccInfoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/accInfoicon.png"))); // NOI18N
        CAccInfoLabel.setText("Account information");
        CAccInfoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CAccInfoLabelMousePressed(evt);
            }
        });

        CEditInfoLabel.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        CEditInfoLabel.setForeground(new java.awt.Color(204, 204, 204));
        CEditInfoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/edit_icon.png"))); // NOI18N
        CEditInfoLabel.setText("Edit account information");
        CEditInfoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CEditInfoLabelMousePressed(evt);
            }
        });

        CUpcomingLabel.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        CUpcomingLabel.setForeground(new java.awt.Color(204, 204, 204));
        CUpcomingLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/view_icon.png"))); // NOI18N
        CUpcomingLabel.setText("View Upcoming Trips");
        CUpcomingLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CUpcomingLabelMousePressed(evt);
            }
        });

        CRunningLabel.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        CRunningLabel.setForeground(new java.awt.Color(204, 204, 204));
        CRunningLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/view_icon.png"))); // NOI18N
        CRunningLabel.setText("View Running Trip");
        CRunningLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CRunningLabelMousePressed(evt);
            }
        });

        CHistoryLabel.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        CHistoryLabel.setForeground(new java.awt.Color(204, 204, 204));
        CHistoryLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/view_icon.png"))); // NOI18N
        CHistoryLabel.setText("View History");
        CHistoryLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CHistoryLabelMousePressed(evt);
            }
        });

        deleteBookLabel.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        deleteBookLabel.setForeground(new java.awt.Color(204, 204, 204));
        deleteBookLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/trash_icon.png"))); // NOI18N
        deleteBookLabel.setText("Delete booking");
        deleteBookLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deleteBookLabelMousePressed(evt);
            }
        });

        bookLabel.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        bookLabel.setForeground(new java.awt.Color(204, 204, 204));
        bookLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Book_icon.png"))); // NOI18N
        bookLabel.setText("Book a trip");
        bookLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bookLabelMousePressed(evt);
            }
        });

        ClogOut.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        ClogOut.setForeground(new java.awt.Color(204, 204, 204));
        ClogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/logout_icon.png"))); // NOI18N
        ClogOut.setText("Log Out");
        ClogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ClogOutMousePressed(evt);
            }
        });

        javax.swing.GroupLayout basesideLayout = new javax.swing.GroupLayout(baseside);
        baseside.setLayout(basesideLayout);
        basesideLayout.setHorizontalGroup(
            basesideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basesideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basesideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CAccInfoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CEditInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CUpcomingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CRunningLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CHistoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBookLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ClogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bookLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        basesideLayout.setVerticalGroup(
            basesideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basesideLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(bookLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBookLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CAccInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CEditInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CUpcomingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CRunningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CHistoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(305, Short.MAX_VALUE))
        );

        getContentPane().add(baseside, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 720));

        maincustomerPanel.setBackground(new java.awt.Color(255, 255, 255));
        maincustomerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CstartPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout CstartPanelLayout = new javax.swing.GroupLayout(CstartPanel);
        CstartPanel.setLayout(CstartPanelLayout);
        CstartPanelLayout.setHorizontalGroup(
            CstartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        CstartPanelLayout.setVerticalGroup(
            CstartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        maincustomerPanel.add(CstartPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -212, 1140, 720));

        deleteBookPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(34, 49, 63));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Delete Booking");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel7)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        deleteBookBtn.setText("Delete");
        deleteBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBookBtnActionPerformed(evt);
            }
        });

        chooseTripLbl.setText("Choose a Trip");

        upTripsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upTripsComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deleteBookPanelLayout = new javax.swing.GroupLayout(deleteBookPanel);
        deleteBookPanel.setLayout(deleteBookPanelLayout);
        deleteBookPanelLayout.setHorizontalGroup(
            deleteBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(deleteBookPanelLayout.createSequentialGroup()
                .addGroup(deleteBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deleteBookPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(noTripsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deleteBookPanelLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(chooseTripLbl)
                        .addGap(18, 18, 18)
                        .addComponent(upTripsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deleteBookPanelLayout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(deleteBookBtn)))
                .addContainerGap(533, Short.MAX_VALUE))
        );
        deleteBookPanelLayout.setVerticalGroup(
            deleteBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteBookPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(noTripsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(deleteBookPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseTripLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upTripsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addComponent(deleteBookBtn)
                .addContainerGap(236, Short.MAX_VALUE))
        );

        maincustomerPanel.add(deleteBookPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -212, 1140, 720));

        CAccInfo.setBackground(new java.awt.Color(108, 122, 137));
        CAccInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CAccInfoMousePressed(evt);
            }
        });
        CAccInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CaccinfoHeader.setBackground(new java.awt.Color(34, 49, 63));

        CaccinfoLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        CaccinfoLabel.setForeground(new java.awt.Color(204, 204, 204));
        CaccinfoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/person_icon.png"))); // NOI18N
        CaccinfoLabel.setText("Account Information");

        javax.swing.GroupLayout CaccinfoHeaderLayout = new javax.swing.GroupLayout(CaccinfoHeader);
        CaccinfoHeader.setLayout(CaccinfoHeaderLayout);
        CaccinfoHeaderLayout.setHorizontalGroup(
            CaccinfoHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CaccinfoHeaderLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(CaccinfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(817, Short.MAX_VALUE))
        );
        CaccinfoHeaderLayout.setVerticalGroup(
            CaccinfoHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CaccinfoHeaderLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(CaccinfoLabel)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        CAccInfo.add(CaccinfoHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, -1, -1));

        CaccInfotxt.setEditable(false);
        CaccInfotxt.setBackground(new java.awt.Color(108, 122, 137));
        CaccInfotxt.setColumns(20);
        CaccInfotxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CaccInfotxt.setForeground(new java.awt.Color(204, 204, 204));
        CaccInfotxt.setRows(10);
        jScrollPane1.setViewportView(CaccInfotxt);

        CAccInfo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 172, 1117, 513));

        maincustomerPanel.add(CAccInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -212, -1, 720));

        Cupcoming.setBackground(new java.awt.Color(108, 122, 137));

        jScrollPane3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        CupcomingTable.setAutoCreateRowSorter(true);
        CupcomingTable.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        CupcomingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Pick Up", "Destination", "Pick Up Date", "Pick Up Time", "Arrival Date", "Arrival Time", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CupcomingTable.setCellSelectionEnabled(true);
        CupcomingTable.setGridColor(new java.awt.Color(255, 255, 255));
        CupcomingTable.setRowHeight(30);
        CupcomingTable.setRowMargin(20);
        CupcomingTable.setSelectionBackground(new java.awt.Color(108, 122, 137));
        CupcomingTable.setShowHorizontalLines(false);
        CupcomingTable.setShowVerticalLines(false);
        CupcomingTable.getTableHeader().setResizingAllowed(false);
        CupcomingTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(CupcomingTable);

        jPanel3.setBackground(new java.awt.Color(34, 49, 63));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/upcoming_icon.png"))); // NOI18N
        jLabel2.setText("   Upcoming Trips");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout CupcomingLayout = new javax.swing.GroupLayout(Cupcoming);
        Cupcoming.setLayout(CupcomingLayout);
        CupcomingLayout.setHorizontalGroup(
            CupcomingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1141, Short.MAX_VALUE)
        );
        CupcomingLayout.setVerticalGroup(
            CupcomingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CupcomingLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE))
        );

        maincustomerPanel.add(Cupcoming, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -210, -1, 720));

        CRunning.setBackground(new java.awt.Color(108, 122, 137));

        CrunningHeader.setBackground(new java.awt.Color(34, 49, 63));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/running_icon.png"))); // NOI18N
        jLabel3.setText("   Running Trip");

        javax.swing.GroupLayout CrunningHeaderLayout = new javax.swing.GroupLayout(CrunningHeader);
        CrunningHeader.setLayout(CrunningHeaderLayout);
        CrunningHeaderLayout.setHorizontalGroup(
            CrunningHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CrunningHeaderLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(822, Short.MAX_VALUE))
        );
        CrunningHeaderLayout.setVerticalGroup(
            CrunningHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CrunningHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addContainerGap())
        );

        CRunningtxt.setEditable(false);
        CRunningtxt.setBackground(new java.awt.Color(108, 122, 137));
        CRunningtxt.setColumns(20);
        CRunningtxt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        CRunningtxt.setForeground(new java.awt.Color(204, 204, 204));
        CRunningtxt.setRows(5);
        jScrollPane2.setViewportView(CRunningtxt);

        javax.swing.GroupLayout CRunningLayout = new javax.swing.GroupLayout(CRunning);
        CRunning.setLayout(CRunningLayout);
        CRunningLayout.setHorizontalGroup(
            CRunningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CrunningHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CRunningLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        CRunningLayout.setVerticalGroup(
            CRunningLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CRunningLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(CrunningHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                .addContainerGap())
        );

        maincustomerPanel.add(CRunning, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -212, -1, 720));

        ChistoryTable.setBackground(new java.awt.Color(108, 122, 137));

        jPanel4.setBackground(new java.awt.Color(34, 49, 63));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/done_icon.png"))); // NOI18N
        jLabel4.setText("   Done Trips");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        CdoneTable.setAutoCreateRowSorter(true);
        CdoneTable.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        CdoneTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Pick Up", "Destination", "Pick Up Date", "Pick Up Time", "Arrival Date", "Arrival Time", "Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CdoneTable.setCellSelectionEnabled(true);
        CdoneTable.setGridColor(new java.awt.Color(255, 255, 255));
        CdoneTable.setRowHeight(30);
        CdoneTable.setRowMargin(20);
        CdoneTable.setSelectionBackground(new java.awt.Color(108, 122, 137));
        CdoneTable.setShowHorizontalLines(false);
        CdoneTable.setShowVerticalLines(false);
        jScrollPane5.setViewportView(CdoneTable);

        javax.swing.GroupLayout ChistoryTableLayout = new javax.swing.GroupLayout(ChistoryTable);
        ChistoryTable.setLayout(ChistoryTableLayout);
        ChistoryTableLayout.setHorizontalGroup(
            ChistoryTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1141, Short.MAX_VALUE)
        );
        ChistoryTableLayout.setVerticalGroup(
            ChistoryTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChistoryTableLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE))
        );

        maincustomerPanel.add(ChistoryTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -210, -1, 720));

        CEditInfo.setBackground(new java.awt.Color(108, 122, 137));

        CeditHeader.setBackground(new java.awt.Color(34, 49, 63));

        CeditLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CeditLabel.setForeground(new java.awt.Color(204, 204, 204));
        CeditLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/person_icon.png"))); // NOI18N
        CeditLabel.setText("Edit Account Information");

        javax.swing.GroupLayout CeditHeaderLayout = new javax.swing.GroupLayout(CeditHeader);
        CeditHeader.setLayout(CeditHeaderLayout);
        CeditHeaderLayout.setHorizontalGroup(
            CeditHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CeditHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CeditLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CeditHeaderLayout.setVerticalGroup(
            CeditHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CeditHeaderLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(CeditLabel)
                .addGap(23, 23, 23))
        );

        CeditUsername.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        CeditUsername.setText("Username");

        CeditPassword.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        CeditPassword.setText("Password");

        CeditEmail.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        CeditEmail.setText("Email");

        CeditUsernametxt.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        CeditUsernametxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CeditUsernametxtFocusLost(evt);
            }
        });
        CeditUsernametxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CeditUsernametxtMouseClicked(evt);
            }
        });
        CeditUsernametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CeditUsernametxtKeyReleased(evt);
            }
        });

        CeditPasswordtxt.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        CeditPasswordtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CeditPasswordtxtFocusLost(evt);
            }
        });
        CeditPasswordtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CeditPasswordtxtMouseClicked(evt);
            }
        });
        CeditPasswordtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CeditPasswordtxtKeyReleased(evt);
            }
        });

        CeditEmailtxt.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        CeditEmailtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CeditEmailtxtFocusLost(evt);
            }
        });
        CeditEmailtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CeditEmailtxtMouseClicked(evt);
            }
        });
        CeditEmailtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CeditEmailtxtKeyReleased(evt);
            }
        });

        CsaveEditBtn.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        CsaveEditBtn.setText("Save");
        CsaveEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CsaveEditBtnActionPerformed(evt);
            }
        });

        PhoneLabel.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        PhoneLabel.setText("Phone");

        CVnumLabel.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        CVnumLabel.setText("VISA Number");

        CVpassLabel.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        CVpassLabel.setText("VISA Password");

        CeditPhonetxt.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        CeditPhonetxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CeditPhonetxtFocusLost(evt);
            }
        });
        CeditPhonetxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CeditPhonetxtMouseClicked(evt);
            }
        });
        CeditPhonetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CeditPhonetxtKeyReleased(evt);
            }
        });

        CeditVnumtxt.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        CeditVnumtxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CeditVnumtxtFocusLost(evt);
            }
        });
        CeditVnumtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CeditVnumtxtMouseClicked(evt);
            }
        });
        CeditVnumtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CeditVnumtxtKeyReleased(evt);
            }
        });

        CeditVpasstxt.setFont(new java.awt.Font("Times New Roman", 0, 22)); // NOI18N
        CeditVpasstxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CeditVpasstxtFocusLost(evt);
            }
        });
        CeditVpasstxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CeditVpasstxtMouseClicked(evt);
            }
        });
        CeditVpasstxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CeditVpasstxtKeyReleased(evt);
            }
        });

        CuserError.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        javax.swing.GroupLayout CEditInfoLayout = new javax.swing.GroupLayout(CEditInfo);
        CEditInfo.setLayout(CEditInfoLayout);
        CEditInfoLayout.setHorizontalGroup(
            CEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CeditHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(CEditInfoLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(CEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CEditInfoLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(CuserError, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CEditInfoLayout.createSequentialGroup()
                        .addGroup(CEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CEditInfoLayout.createSequentialGroup()
                                .addGroup(CEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CVnumLabel)
                                    .addComponent(CVpassLabel))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CEditInfoLayout.createSequentialGroup()
                                .addGroup(CEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PhoneLabel)
                                    .addComponent(CeditEmail))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CEditInfoLayout.createSequentialGroup()
                                .addComponent(CeditPassword)
                                .addGap(18, 18, 18)))
                        .addGroup(CEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CeditEmailtxt)
                            .addComponent(CeditPasswordtxt)
                            .addComponent(CsaveEditBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(CeditPhonetxt)
                            .addComponent(CeditVnumtxt)
                            .addComponent(CeditVpasstxt)
                            .addComponent(CVnoError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CVpassError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CEditInfoLayout.createSequentialGroup()
                        .addComponent(CeditUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CeditUsernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(CEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CpassError, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CemailError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CphoneError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(416, Short.MAX_VALUE))
        );
        CEditInfoLayout.setVerticalGroup(
            CEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CEditInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CeditHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(CEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CEditInfoLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(CpassError)
                        .addGap(58, 58, 58)
                        .addComponent(CemailError)
                        .addGap(58, 58, 58)
                        .addComponent(CphoneError))
                    .addGroup(CEditInfoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(CuserError, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CeditUsernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CeditUsername))
                        .addGap(25, 25, 25)
                        .addGroup(CEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CeditPasswordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CeditPassword))
                        .addGap(25, 25, 25)
                        .addGroup(CEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CeditEmailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CeditEmail))
                        .addGap(25, 25, 25)
                        .addGroup(CEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CeditPhonetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CVnoError, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CeditVnumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CVnumLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CVpassError, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CEditInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CeditVpasstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CVpassLabel))
                        .addGap(18, 18, 18)
                        .addComponent(CsaveEditBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        maincustomerPanel.add(CEditInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -220, -1, 730));

        bookPanel.setBackground(new java.awt.Color(255, 255, 255));
        bookPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bookPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(34, 49, 63));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Booking");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(889, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        bookPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1140, -1));

        pickupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickupdateActionPerformed(evt);
            }
        });
        bookPanel.add(pickupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 200, 33));

        currentlocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentlocationActionPerformed(evt);
            }
        });
        bookPanel.add(currentlocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 179, 33));

        fromlbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fromlbl.setText("From");
        bookPanel.add(fromlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 42, 33));

        suitabletrips1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suitabletrips1ActionPerformed(evt);
            }
        });
        bookPanel.add(suitabletrips1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 200, 33));

        pickuptime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickuptimeActionPerformed(evt);
            }
        });
        bookPanel.add(pickuptime, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 200, 33));

        bustype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Classic", "Elite" }));
        bustype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bustypeActionPerformed(evt);
            }
        });
        bookPanel.add(bustype, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 160, 200, 33));

        seatselectionElite.setBackground(new java.awt.Color(255, 255, 255));
        seatselectionElite.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        seatselectionElite.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        B.setBackground(new java.awt.Color(255, 255, 255));
        B.setSelected(true);
        B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BMouseClicked(evt);
            }
        });
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });
        seatselectionElite.add(B, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        C.setBackground(new java.awt.Color(255, 255, 255));
        C.setSelected(true);
        C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CMouseClicked(evt);
            }
        });
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        seatselectionElite.add(C, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        D.setBackground(new java.awt.Color(255, 255, 255));
        D.setSelected(true);
        D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DMouseClicked(evt);
            }
        });
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });
        seatselectionElite.add(D, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        E.setBackground(new java.awt.Color(255, 255, 255));
        E.setSelected(true);
        E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EMouseClicked(evt);
            }
        });
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });
        seatselectionElite.add(E, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        F.setBackground(new java.awt.Color(255, 255, 255));
        F.setSelected(true);
        F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FMouseClicked(evt);
            }
        });
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });
        seatselectionElite.add(F, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        A.setBackground(new java.awt.Color(255, 255, 255));
        A.setSelected(true);
        A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AMouseClicked(evt);
            }
        });
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });
        seatselectionElite.add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        G.setBackground(new java.awt.Color(255, 255, 255));
        G.setSelected(true);
        G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        G.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GMouseClicked(evt);
            }
        });
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });
        seatselectionElite.add(G, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        I.setBackground(new java.awt.Color(255, 255, 255));
        I.setSelected(true);
        I.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        I.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IMouseClicked(evt);
            }
        });
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });
        seatselectionElite.add(I, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        J.setBackground(new java.awt.Color(255, 255, 255));
        J.setSelected(true);
        J.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        J.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JMouseClicked(evt);
            }
        });
        J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JActionPerformed(evt);
            }
        });
        seatselectionElite.add(J, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        K.setBackground(new java.awt.Color(255, 255, 255));
        K.setSelected(true);
        K.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        K.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KMouseClicked(evt);
            }
        });
        K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KActionPerformed(evt);
            }
        });
        seatselectionElite.add(K, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        L.setBackground(new java.awt.Color(255, 255, 255));
        L.setSelected(true);
        L.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LMouseClicked(evt);
            }
        });
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });
        seatselectionElite.add(L, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, 57));

        H.setBackground(new java.awt.Color(255, 255, 255));
        H.setSelected(true);
        H.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        H.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HMouseClicked(evt);
            }
        });
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });
        seatselectionElite.add(H, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, 50));

        A_booked.setBackground(new java.awt.Color(255, 255, 255));
        A_booked.setSelected(true);
        A_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        A_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A_bookedMouseClicked(evt);
            }
        });
        A_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_bookedActionPerformed(evt);
            }
        });
        seatselectionElite.add(A_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, 60));

        B_booked.setBackground(new java.awt.Color(255, 255, 255));
        B_booked.setSelected(true);
        B_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        B_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                B_bookedMouseClicked(evt);
            }
        });
        B_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_bookedActionPerformed(evt);
            }
        });
        seatselectionElite.add(B_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 60));

        C_booked.setBackground(new java.awt.Color(255, 255, 255));
        C_booked.setSelected(true);
        C_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        C_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                C_bookedMouseClicked(evt);
            }
        });
        C_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_bookedActionPerformed(evt);
            }
        });
        seatselectionElite.add(C_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 60, -1));

        D_booked.setBackground(new java.awt.Color(255, 255, 255));
        D_booked.setSelected(true);
        D_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        D_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                D_bookedMouseClicked(evt);
            }
        });
        D_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_bookedActionPerformed(evt);
            }
        });
        seatselectionElite.add(D_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 60, 60));

        E_booked.setBackground(new java.awt.Color(255, 255, 255));
        E_booked.setSelected(true);
        E_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        E_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                E_bookedMouseClicked(evt);
            }
        });
        E_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_bookedActionPerformed(evt);
            }
        });
        seatselectionElite.add(E_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 60, 60));

        F_booked.setBackground(new java.awt.Color(255, 255, 255));
        F_booked.setSelected(true);
        F_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        F_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F_bookedMouseClicked(evt);
            }
        });
        F_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_bookedActionPerformed(evt);
            }
        });
        seatselectionElite.add(F_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 60, 60));

        G_booked.setBackground(new java.awt.Color(255, 255, 255));
        G_booked.setSelected(true);
        G_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        G_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                G_bookedMouseClicked(evt);
            }
        });
        G_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G_bookedActionPerformed(evt);
            }
        });
        seatselectionElite.add(G_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, -1));

        H_booked.setBackground(new java.awt.Color(255, 255, 255));
        H_booked.setSelected(true);
        H_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        H_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                H_bookedMouseClicked(evt);
            }
        });
        H_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H_bookedActionPerformed(evt);
            }
        });
        seatselectionElite.add(H_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, 50));

        I_booked.setBackground(new java.awt.Color(255, 255, 255));
        I_booked.setSelected(true);
        I_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        I_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                I_bookedMouseClicked(evt);
            }
        });
        I_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_bookedActionPerformed(evt);
            }
        });
        seatselectionElite.add(I_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        J_booked.setBackground(new java.awt.Color(255, 255, 255));
        J_booked.setSelected(true);
        J_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        J_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                J_bookedMouseClicked(evt);
            }
        });
        J_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_bookedActionPerformed(evt);
            }
        });
        seatselectionElite.add(J_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        K_booked.setBackground(new java.awt.Color(255, 255, 255));
        K_booked.setSelected(true);
        K_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        K_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                K_bookedMouseClicked(evt);
            }
        });
        K_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K_bookedActionPerformed(evt);
            }
        });
        seatselectionElite.add(K_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        L_booked.setBackground(new java.awt.Color(255, 255, 255));
        L_booked.setSelected(true);
        L_booked.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        L_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        L_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L_bookedMouseClicked(evt);
            }
        });
        L_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_bookedActionPerformed(evt);
            }
        });
        seatselectionElite.add(L_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, 57));

        bookPanel.add(seatselectionElite, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 390, 190));

        seatselectionClassic.setBackground(new java.awt.Color(255, 255, 255));
        seatselectionClassic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 51), null, new java.awt.Color(0, 0, 51)));
        seatselectionClassic.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        M.setBackground(new java.awt.Color(255, 255, 255));
        M.setSelected(true);
        M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MMouseClicked(evt);
            }
        });
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });
        seatselectionClassic.add(M, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 50));

        O.setBackground(new java.awt.Color(255, 255, 255));
        O.setSelected(true);
        O.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        O.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OMouseClicked(evt);
            }
        });
        O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OActionPerformed(evt);
            }
        });
        seatselectionClassic.add(O, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        N.setBackground(new java.awt.Color(255, 255, 255));
        N.setSelected(true);
        N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NMouseClicked(evt);
            }
        });
        N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NActionPerformed(evt);
            }
        });
        seatselectionClassic.add(N, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, 40));

        Q.setBackground(new java.awt.Color(255, 255, 255));
        Q.setSelected(true);
        Q.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        Q.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QMouseClicked(evt);
            }
        });
        Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QActionPerformed(evt);
            }
        });
        seatselectionClassic.add(Q, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        P.setBackground(new java.awt.Color(255, 255, 255));
        P.setSelected(true);
        P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PMouseClicked(evt);
            }
        });
        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });
        seatselectionClassic.add(P, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        S.setBackground(new java.awt.Color(255, 255, 255));
        S.setSelected(true);
        S.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SMouseClicked(evt);
            }
        });
        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });
        seatselectionClassic.add(S, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 50));

        T.setBackground(new java.awt.Color(255, 255, 255));
        T.setSelected(true);
        T.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        T.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TMouseClicked(evt);
            }
        });
        T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TActionPerformed(evt);
            }
        });
        seatselectionClassic.add(T, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 50));

        U.setBackground(new java.awt.Color(255, 255, 255));
        U.setSelected(true);
        U.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        U.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UMouseClicked(evt);
            }
        });
        U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UActionPerformed(evt);
            }
        });
        seatselectionClassic.add(U, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, 50));

        V.setBackground(new java.awt.Color(255, 255, 255));
        V.setSelected(true);
        V.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        V.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VMouseClicked(evt);
            }
        });
        V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VActionPerformed(evt);
            }
        });
        seatselectionClassic.add(V, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, 50));

        W.setBackground(new java.awt.Color(255, 255, 255));
        W.setSelected(true);
        W.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        W.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                WMouseClicked(evt);
            }
        });
        W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WActionPerformed(evt);
            }
        });
        seatselectionClassic.add(W, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, 50));

        R.setBackground(new java.awt.Color(255, 255, 255));
        R.setSelected(true);
        R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        R.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMouseClicked(evt);
            }
        });
        R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RActionPerformed(evt);
            }
        });
        seatselectionClassic.add(R, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        Y.setBackground(new java.awt.Color(255, 255, 255));
        Y.setSelected(true);
        Y.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        Y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                YMouseClicked(evt);
            }
        });
        Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YActionPerformed(evt);
            }
        });
        seatselectionClassic.add(Y, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        Z.setBackground(new java.awt.Color(255, 255, 255));
        Z.setSelected(true);
        Z.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        Z.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ZMouseClicked(evt);
            }
        });
        Z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZActionPerformed(evt);
            }
        });
        seatselectionClassic.add(Z, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        a.setBackground(new java.awt.Color(255, 255, 255));
        a.setSelected(true);
        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aMouseClicked(evt);
            }
        });
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        seatselectionClassic.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        X.setBackground(new java.awt.Color(255, 255, 255));
        X.setSelected(true);
        X.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XMouseClicked(evt);
            }
        });
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });
        seatselectionClassic.add(X, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, 50));

        c.setBackground(new java.awt.Color(255, 255, 255));
        c.setSelected(true);
        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cMouseClicked(evt);
            }
        });
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });
        seatselectionClassic.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        d.setBackground(new java.awt.Color(255, 255, 255));
        d.setSelected(true);
        d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        d.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dMouseClicked(evt);
            }
        });
        d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dActionPerformed(evt);
            }
        });
        seatselectionClassic.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        b.setBackground(new java.awt.Color(255, 255, 255));
        b.setSelected(true);
        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMouseClicked(evt);
            }
        });
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        seatselectionClassic.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        j.setBackground(new java.awt.Color(255, 255, 255));
        j.setSelected(true);
        j.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        j.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMouseClicked(evt);
            }
        });
        j.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jActionPerformed(evt);
            }
        });
        seatselectionClassic.add(j, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        g.setBackground(new java.awt.Color(255, 255, 255));
        g.setSelected(true);
        g.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        g.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gMouseClicked(evt);
            }
        });
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });
        seatselectionClassic.add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        h.setBackground(new java.awt.Color(255, 255, 255));
        h.setSelected(true);
        h.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        h.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hMouseClicked(evt);
            }
        });
        h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActionPerformed(evt);
            }
        });
        seatselectionClassic.add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        i.setBackground(new java.awt.Color(255, 255, 255));
        i.setSelected(true);
        i.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        i.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iMouseClicked(evt);
            }
        });
        i.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iActionPerformed(evt);
            }
        });
        seatselectionClassic.add(i, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        e.setBackground(new java.awt.Color(255, 255, 255));
        e.setSelected(true);
        e.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        e.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eMouseClicked(evt);
            }
        });
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });
        seatselectionClassic.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        f.setBackground(new java.awt.Color(255, 255, 255));
        f.setSelected(true);
        f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (3).png"))); // NOI18N
        f.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fMouseClicked(evt);
            }
        });
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });
        seatselectionClassic.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        M_booked.setBackground(new java.awt.Color(255, 255, 255));
        M_booked.setSelected(true);
        M_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        M_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                M_bookedMouseClicked(evt);
            }
        });
        M_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(M_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 60));

        N_booked.setBackground(new java.awt.Color(255, 255, 255));
        N_booked.setSelected(true);
        N_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        N_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                N_bookedMouseClicked(evt);
            }
        });
        N_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(N_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 60));

        O_booked.setBackground(new java.awt.Color(255, 255, 255));
        O_booked.setSelected(true);
        O_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        O_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                O_bookedMouseClicked(evt);
            }
        });
        O_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(O_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 60, -1));

        P_booked.setBackground(new java.awt.Color(255, 255, 255));
        P_booked.setSelected(true);
        P_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        P_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P_bookedMouseClicked(evt);
            }
        });
        P_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(P_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 60, 60));

        Q_booked.setBackground(new java.awt.Color(255, 255, 255));
        Q_booked.setSelected(true);
        Q_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        Q_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Q_bookedMouseClicked(evt);
            }
        });
        Q_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(Q_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 60, 60));

        R_booked.setBackground(new java.awt.Color(255, 255, 255));
        R_booked.setSelected(true);
        R_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        R_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                R_bookedMouseClicked(evt);
            }
        });
        R_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(R_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 60, 60));

        S_booked.setBackground(new java.awt.Color(255, 255, 255));
        S_booked.setSelected(true);
        S_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        S_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                S_bookedMouseClicked(evt);
            }
        });
        S_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(S_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 60, 70));

        T_booked.setBackground(new java.awt.Color(255, 255, 255));
        T_booked.setSelected(true);
        T_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        T_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                T_bookedMouseClicked(evt);
            }
        });
        T_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(T_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, 70));

        U_booked.setBackground(new java.awt.Color(255, 255, 255));
        U_booked.setSelected(true);
        U_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        U_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                U_bookedMouseClicked(evt);
            }
        });
        U_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                U_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(U_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, 70));

        V_booked.setBackground(new java.awt.Color(255, 255, 255));
        V_booked.setSelected(true);
        V_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        V_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                V_bookedMouseClicked(evt);
            }
        });
        V_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(V_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, 70));

        W_booked.setBackground(new java.awt.Color(255, 255, 255));
        W_booked.setSelected(true);
        W_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        W_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                W_bookedMouseClicked(evt);
            }
        });
        W_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                W_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(W_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, 70));

        X_booked.setBackground(new java.awt.Color(255, 255, 255));
        X_booked.setSelected(true);
        X_booked.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        X_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        X_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                X_bookedMouseClicked(evt);
            }
        });
        X_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(X_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, 70));

        Y_booked.setBackground(new java.awt.Color(255, 255, 255));
        Y_booked.setSelected(true);
        Y_booked.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Y_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        Y_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Y_bookedMouseClicked(evt);
            }
        });
        Y_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Y_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(Y_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 57));

        Z_booked.setBackground(new java.awt.Color(255, 255, 255));
        Z_booked.setSelected(true);
        Z_booked.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Z_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        Z_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Z_bookedMouseClicked(evt);
            }
        });
        Z_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Z_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(Z_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 57));

        a_booked.setBackground(new java.awt.Color(255, 255, 255));
        a_booked.setSelected(true);
        a_booked.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        a_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        a_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a_bookedMouseClicked(evt);
            }
        });
        a_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(a_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, 57));

        b_booked.setBackground(new java.awt.Color(255, 255, 255));
        b_booked.setSelected(true);
        b_booked.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        b_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        b_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_bookedMouseClicked(evt);
            }
        });
        b_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(b_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, 57));

        c_booked.setBackground(new java.awt.Color(255, 255, 255));
        c_booked.setSelected(true);
        c_booked.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        c_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        c_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c_bookedMouseClicked(evt);
            }
        });
        c_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(c_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, 57));

        d_booked.setBackground(new java.awt.Color(255, 255, 255));
        d_booked.setSelected(true);
        d_booked.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        d_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        d_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d_bookedMouseClicked(evt);
            }
        });
        d_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(d_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, 57));

        e_booked.setBackground(new java.awt.Color(255, 255, 255));
        e_booked.setSelected(true);
        e_booked.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        e_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        e_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                e_bookedMouseClicked(evt);
            }
        });
        e_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(e_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 57));

        f_booked.setBackground(new java.awt.Color(255, 255, 255));
        f_booked.setSelected(true);
        f_booked.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        f_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        f_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                f_bookedMouseClicked(evt);
            }
        });
        f_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(f_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, 57));

        g_booked.setBackground(new java.awt.Color(255, 255, 255));
        g_booked.setSelected(true);
        g_booked.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        g_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        g_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                g_bookedMouseClicked(evt);
            }
        });
        g_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(g_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, 57));

        h_booked.setBackground(new java.awt.Color(255, 255, 255));
        h_booked.setSelected(true);
        h_booked.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        h_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        h_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h_bookedMouseClicked(evt);
            }
        });
        h_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(h_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, 57));

        i_booked.setBackground(new java.awt.Color(255, 255, 255));
        i_booked.setSelected(true);
        i_booked.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        i_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        i_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                i_bookedMouseClicked(evt);
            }
        });
        i_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                i_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(i_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, 57));

        j_booked.setBackground(new java.awt.Color(255, 255, 255));
        j_booked.setSelected(true);
        j_booked.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        j_booked.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/icons8-waiting-room-48 (2).png"))); // NOI18N
        j_booked.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j_bookedMouseClicked(evt);
            }
        });
        j_booked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_bookedActionPerformed(evt);
            }
        });
        seatselectionClassic.add(j_booked, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, 57));

        bookPanel.add(seatselectionClassic, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 390, 330));

        num_of_selectedseat.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        num_of_selectedseat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num_of_selectedseatActionPerformed(evt);
            }
        });
        bookPanel.add(num_of_selectedseat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 280, 50));

        no_selected_seatcodelbl.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        no_selected_seatcodelbl.setForeground(new java.awt.Color(0, 0, 51));
        no_selected_seatcodelbl.setText("Number of selected seat:");
        bookPanel.add(no_selected_seatcodelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 280, 50));

        totalcoselbl.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        totalcoselbl.setForeground(new java.awt.Color(0, 0, 51));
        totalcoselbl.setText("Total Cost:");
        bookPanel.add(totalcoselbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 280, 50));

        totalcostTXT.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        totalcostTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalcostTXTActionPerformed(evt);
            }
        });
        bookPanel.add(totalcostTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 280, 50));

        RESERVE.setBackground(new java.awt.Color(0, 0, 51));
        RESERVE.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        RESERVE.setForeground(new java.awt.Color(255, 255, 255));
        RESERVE.setText("RESERVE");
        RESERVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESERVEActionPerformed(evt);
            }
        });
        bookPanel.add(RESERVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 590, 540, 60));

        maincustomerPanel.add(bookPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -212, 1140, 720));

        getContentPane().add(maincustomerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 214, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CAccInfoLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CAccInfoLabelMousePressed
        setlabelcolor(CAccInfoLabel);
        resetlabelcolor(CEditInfoLabel);
        resetlabelcolor(CHistoryLabel);
        resetlabelcolor(CUpcomingLabel);
        resetlabelcolor(CRunningLabel);
         resetlabelcolor(bookLabel);
        resetlabelcolor(deleteBookLabel);
        resetlabelcolor(ClogOut);

        String customerInfo = "Name: " + current_customer.getName()+"\n"
               +"Age: " +String.valueOf(current_customer.getAge())+"\n"
               +"Gender: "+current_customer.getGender()+"\n"
               +"National ID: "+String.valueOf(current_customer.getNationalID())+"\n"
               +"Position: "+current_customer.getPosition()+"\n"
               +"Username: "+current_customer.getUsername()+"\n"
               +"Email: : "+current_customer.getEmail()+"\n"
                +"VISA number: "+current_customer.getVISAnumber()+"\n"
                +"Phone: "+current_customer.getPhone()+"\n";
        CaccInfotxt.setText(customerInfo);
        
        CAccInfoLabel.setVisible(true);
        CstartPanel.setVisible(false);
       CEditInfoLabel.setVisible(false);
        ChistoryTable.setVisible(false);
        Cupcoming.setVisible(false);
        CRunning.setVisible(false);
        deleteBookPanel.setVisible(false);
        bookPanel.setVisible(false);
        
        
    }//GEN-LAST:event_CAccInfoLabelMousePressed

    private void CEditInfoLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CEditInfoLabelMousePressed
  setlabelcolor(CEditInfoLabel);
        resetlabelcolor(CAccInfoLabel);
        resetlabelcolor(CHistoryLabel);
        resetlabelcolor(CUpcomingLabel);
        resetlabelcolor(CRunningLabel);
         resetlabelcolor(bookLabel);
        resetlabelcolor(deleteBookLabel);
        resetlabelcolor(ClogOut);

        CuserError.setText("");
        CpassError.setText("");
        CemailError.setText("");
        CphoneError.setText("");
        CVnoError.setText("");
        CVpassError.setText("");
        CuserError.setVisible(false);
        CpassError.setVisible(false);
        CemailError.setVisible(false);
        CphoneError.setVisible(false);
        CVnoError.setVisible(false);
        CVpassError.setVisible(false);
        CeditUsernametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        CeditPasswordtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        CeditEmailtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        CeditPhonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        CeditVnumtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        CeditVpasstxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
        CeditUsernametxt.setText(current_customer.getUsername());
        CeditPasswordtxt.setText(current_customer.getPassword());
        CeditEmailtxt.setText(current_customer.getEmail());
        CeditPhonetxt.setText(current_customer.getPhone());
        CeditVnumtxt.setText(current_customer.getVISAnumber());
        CeditVpasstxt.setText(current_customer.getVISApassword());
        
        CsaveEditBtn.setEnabled(false);
       CAccInfoLabel.setVisible(false);
        CstartPanel.setVisible(false);
        CEditInfoLabel.setVisible(true);
        ChistoryTable.setVisible(false);
        Cupcoming.setVisible(false);
        CRunning.setVisible(false);
        deleteBookPanel.setVisible(false);
        bookPanel.setVisible(false);
       
    }//GEN-LAST:event_CEditInfoLabelMousePressed

    private void CUpcomingLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CUpcomingLabelMousePressed
  setlabelcolor(CUpcomingLabel);
        resetlabelcolor(CEditInfoLabel);
        resetlabelcolor(CAccInfoLabel);
        resetlabelcolor(CHistoryLabel);
        resetlabelcolor(CRunningLabel);
         resetlabelcolor(bookLabel);
        resetlabelcolor(deleteBookLabel);
        resetlabelcolor(ClogOut);

        DefaultTableModel model = (DefaultTableModel)CupcomingTable.getModel();
        
        if(model.getRowCount()!=0)
        {
            model.setRowCount(0);
        }
        
        ArrayList<customers_trips> upcomingTrips = admin.view_customer_Upcoming_trips();
        for(int i = 0 ; i < upcomingTrips.size() ; i++)
        {
            model.addRow(new Object[]{
                upcomingTrips.get(i).getTrip_customer().getCode(),
            upcomingTrips.get(i).getTrip_customer().getPickUp(),
            upcomingTrips.get(i).getTrip_customer().getPickUpTime(),
           upcomingTrips.get(i).getTrip_customer().getArrivalDate(),
            upcomingTrips.get(i).getTrip_customer().getArrivalTime(),
            upcomingTrips.get(i).getTrip_customer().getCost()
            });
        }
        
        CAccInfoLabel.setVisible(false);
        CstartPanel.setVisible(false);
        CEditInfoLabel.setVisible(false);
        ChistoryTable.setVisible(false);
        Cupcoming.setVisible(true);
        CRunning.setVisible(false);
        deleteBookPanel.setVisible(false);
        bookPanel.setVisible(false);
        
    }//GEN-LAST:event_CUpcomingLabelMousePressed

    private void CRunningLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CRunningLabelMousePressed
   setlabelcolor(CRunningLabel);
        resetlabelcolor(CEditInfoLabel);
        resetlabelcolor(CAccInfoLabel);
        resetlabelcolor(CHistoryLabel);
        resetlabelcolor(CUpcomingLabel);
         resetlabelcolor(bookLabel);
        resetlabelcolor(deleteBookLabel);
        resetlabelcolor(ClogOut);
        
        String runTripInfo;        
        Trip runningTrip = admin.view_customer_Running_trip();
        
        if (runningTrip!=null)
        {
            runTripInfo = "Code: "+runningTrip.getCode()+"\n"
                +"Pick Up Location: "+runningTrip.getPickUp()+"\n"
                +"Destination: "+runningTrip.getDestination()+"\n"
                +"Pick up date: "+runningTrip.getPickUpDate()+"\n"
                +"Pick up Time: "+runningTrip.getPickUpTime()+"\n"
                +"Arrival Date: "+runningTrip.getArrivalDate()+"\n"
                +"Arrival Time: "+runningTrip.getArrivalTime()+"\n";
        }
        else
        {
            runTripInfo = "You have no running trip.";
        }
        
        
       CRunningtxt.setText(runTripInfo);
         CAccInfoLabel.setVisible(false);
        CstartPanel.setVisible(false);
       CEditInfoLabel.setVisible(false);
        ChistoryTable.setVisible(false);
        Cupcoming.setVisible(false);
        CRunning.setVisible(true);
        deleteBookPanel.setVisible(false);
        bookPanel.setVisible(false);
    }//GEN-LAST:event_CRunningLabelMousePressed

    private void CHistoryLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CHistoryLabelMousePressed
 setlabelcolor(CHistoryLabel);
        resetlabelcolor(CEditInfoLabel);
        resetlabelcolor(CAccInfoLabel);
        resetlabelcolor(CUpcomingLabel);
        resetlabelcolor(CRunningLabel);
        resetlabelcolor(bookLabel);
        resetlabelcolor(deleteBookLabel);
        resetlabelcolor(ClogOut);
        
         DefaultTableModel model = (DefaultTableModel)CdoneTable.getModel();
        
        if(model.getRowCount()!=0)
        {
            model.setRowCount(0);
        }
        ArrayList<customers_trips> doneTrips = admin.View_Customer_History();
        
        for(int i = 0 ; i < doneTrips.size() ; i++)
        {
            model.addRow(new Object[]{doneTrips.get(i).getTrip_customer().getCode(),
            doneTrips.get(i).getTrip_customer().getPickUp(),
            doneTrips.get(i).getTrip_customer().getDestination(),
            doneTrips.get(i).getTrip_customer().getPickUpDate(),
            doneTrips.get(i).getTrip_customer().getPickUpTime(),
           doneTrips.get(i).getTrip_customer().getArrivalDate(),
            doneTrips.get(i).getTrip_customer().getArrivalTime(),
            doneTrips.get(i).getTrip_customer().getCost()
            });
        }
        
      CAccInfoLabel.setVisible(false);
        CstartPanel.setVisible(false);
       CEditInfoLabel.setVisible(false);
        ChistoryTable.setVisible(true);
        Cupcoming.setVisible(false);
        CRunning.setVisible(false);
        deleteBookPanel.setVisible(false);
        bookPanel.setVisible(false);
       
    }//GEN-LAST:event_CHistoryLabelMousePressed

    private void deleteBookLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBookLabelMousePressed
       upTripsComboBox.removeAllItems();
          setlabelcolor(deleteBookLabel);
        resetlabelcolor(CEditInfoLabel);
        resetlabelcolor(CAccInfoLabel);
        resetlabelcolor(CUpcomingLabel);
        resetlabelcolor(CRunningLabel);
        resetlabelcolor(bookLabel);
        resetlabelcolor(CHistoryLabel);
        resetlabelcolor(ClogOut);
        
        
        ArrayList<customers_trips> upComingTrips = admin.view_customer_Upcoming_trips();
        if (upComingTrips.isEmpty())
        {
            upTripsComboBox.setVisible(false);
            chooseTripLbl.setVisible(false);
            deleteBookBtn.setVisible(false);
            noTripsLabel.setText("No Upcoming Trips");
            noTripsLabel.setVisible(true);
        }
        else
        {
            noTripsLabel.setVisible(false);
            upTripsComboBox.setVisible(true);
            chooseTripLbl.setVisible(true);
            deleteBookBtn.setVisible(true);
            ArrayList<customers_trips> repeated_cusTrips=new ArrayList<customers_trips>();
            boolean found=false;
            
            for(int i = 0 ; i < upComingTrips.size() ; i++)
            {
                found = false;
                for (int j=0 ; j<repeated_cusTrips.size();j++)
                {
                    if(repeated_cusTrips.get(j).getTrip_customer().getCode().equals(upComingTrips.get(i).getTrip_customer().getCode())){
                    found=true;
                  
                    }
                }
                
                     if(!found)
                    {
                         upTripsComboBox.addItem(upComingTrips.get(i).getTrip_customer().getCode());
                      repeated_cusTrips.add(upComingTrips.get(i));
                    } 
            }
            
            
        }
         

                CAccInfo.setVisible(false);
        CstartPanel.setVisible(false);
       CEditInfo.setVisible(false);
        ChistoryTable.setVisible(false);
        Cupcoming.setVisible(false);
        CRunning.setVisible(false);
        bookPanel.setVisible(false);
        deleteBookPanel.setVisible(true);     
    }//GEN-LAST:event_deleteBookLabelMousePressed

    private void bookLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookLabelMousePressed
    setlabelcolor(bookLabel);
        resetlabelcolor(CEditInfoLabel);
        resetlabelcolor(CAccInfoLabel);
        resetlabelcolor(CUpcomingLabel);
        resetlabelcolor(CRunningLabel);
        resetlabelcolor(deleteBookLabel);
        resetlabelcolor(CHistoryLabel);
        resetlabelcolor(ClogOut);
        
        CstartPanel.setVisible(false);
   
        deleteBookPanel.setVisible(false);
        bookPanel.setVisible(true);
        seatselectionClassic.setVisible(false);
         suitabletrips1.removeAllItems();
         totalcostTXT.setText("");
         num_of_selectedseat.setText("");
          currentlocation.setText(current_customer.getPosition());
          currentlocation.setEditable(false);
          list =  admin.current_customer_suitable_trips();
          
            ArrayList <Trip> suitableTrips_Pickup=new ArrayList<Trip>();
            boolean found=false;
         for (int i=0 ; i<list.size(); i++ ){
             found=false;
                 for (int j=0 ; j<suitableTrips_Pickup.size(); j++ ){
                   if(suitableTrips_Pickup.get(j).getDestination().equals(list.get(i).getDestination())){
                              found=true;
                   }
                 }
                 if(!found)
                 {
                     suitableTrips_Pickup.add(list.get(i));
                   suitabletrips1.addItem(list.get(i).getDestination());
                 }
         }  
             CAccInfo.setVisible(false);
        CstartPanel.setVisible(false);
        CEditInfo.setVisible(false);
        ChistoryTable.setVisible(false);
        Cupcoming.setVisible(false);
        CRunning.setVisible(false);
        deleteBookPanel.setVisible(false);
        bookPanel.setVisible(true);
         pickupdate.setVisible(false);
         pickuptime.setVisible(false);
         bustype.setVisible(false);           seatselectionClassic.setVisible(false);
           seatselectionElite.setVisible(false);
    }//GEN-LAST:event_bookLabelMousePressed

    private void ClogOutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClogOutMousePressed
     setlabelcolor(ClogOut);
        resetlabelcolor(CEditInfoLabel);
        resetlabelcolor(CAccInfoLabel);
        resetlabelcolor(CUpcomingLabel);
        resetlabelcolor(CRunningLabel);
        resetlabelcolor(deleteBookLabel);
        resetlabelcolor(CHistoryLabel);
        resetlabelcolor(bookLabel);
        this.dispose();
        Login_form login = new Login_form();
        login.setVisible(true);
        
    }//GEN-LAST:event_ClogOutMousePressed

    private void currentlocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentlocationActionPerformed
       
    }//GEN-LAST:event_currentlocationActionPerformed

    private void pickupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickupdateActionPerformed
        pickuptime.removeAllItems();
        pickuptime.setVisible(true);
         String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        
                ArrayList <Trip> Pickup_Time=new ArrayList<Trip>(); 
        boolean found=false;
        
              for (int i=0 ; i<list.size(); i++ ){
             found=false;
                  
               if(selected_destination.equals(list.get(i).getDestination())&&selected_date.equals(list.get(i).getPickUpDate())){
                 for (int j=0 ; j<Pickup_Time.size(); j++ ){
                   if(Pickup_Time.get(j).getPickUpTime().equals(list.get(i).getPickUpTime())){
                              found=true;
                   }
                 }
                 if(found==false){
                     Pickup_Time.add(list.get(i));
                   pickuptime.addItem(list.get(i).getPickUpTime());
                 }
                     }
         }  
            selectedTrip.setPickUpDate(selected_date);
           pickuptime.setVisible(true);  bustype.setVisible(false);           seatselectionClassic.setVisible(false);
           seatselectionElite.setVisible(false);
    }//GEN-LAST:event_pickupdateActionPerformed

    private void suitabletrips1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suitabletrips1ActionPerformed
       
        pickupdate.removeAllItems();  
        pickupdate.setVisible(true);
        String selected_destination=String.valueOf(suitabletrips1.getSelectedItem()); 
        ArrayList <Trip> Pickup_Date=new ArrayList<Trip>(); 
        boolean found=false;
        
              for (int i=0 ; i<list.size(); i++ ){
             found=false;
                     if(selected_destination.equals(list.get(i).getDestination())){
                 for (int j=0 ; j<Pickup_Date.size(); j++ ){
                   if(Pickup_Date.get(j).getPickUpDate().equals(list.get(i).getPickUpDate())){
                              found=true;
                   }
                 }
                 if(found==false){
                     Pickup_Date.add(list.get(i));
                   pickupdate.addItem(list.get(i).getPickUpDate());
                 }
                     }
         }  
           selectedTrip.setDestination(selected_destination);
           pickuptime.setVisible(false);
           seatselectionClassic.setVisible(false);
           seatselectionElite.setVisible(false);
    }//GEN-LAST:event_suitabletrips1ActionPerformed

    private void pickuptimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickuptimeActionPerformed
       bustype.removeAllItems();
        String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
           for (int i=0 ; i<list.size(); i++ ){
               if(selected_destination.equals(list.get(i).getDestination())&&selected_date.equals(list.get(i).getPickUpDate())
                       &&selected_time.equals(list.get(i).getPickUpTime())){
                     if(list.get(i).getTripBus() instanceof Classic&& list.get(i).getAvailableSeatsNum()>0){
                         bustype.addItem("Classic");    
                         BusClassic=(Classic)list.get(i).getTripBus() ;
                     }
                     else if (list.get(i).getTripBus() instanceof Elite&& list.get(i).getAvailableSeatsNum()>0){
                         bustype.addItem("Elite");
                       BusElite=(Elite)list.get(i).getTripBus() ;
                     }
             }
           }   
                 selectedTrip.setPickUpTime(selected_time);
           bustype.setVisible(true);           seatselectionClassic.setVisible(false);
           seatselectionElite.setVisible(false);
           
    }//GEN-LAST:event_pickuptimeActionPerformed

    private void bustypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bustypeActionPerformed
        String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
        String buskind=String.valueOf(bustype.getSelectedItem());
        
        if(buskind.equals("Elite")){
               seatselectionElite.setVisible(true);
             seatselectionClassic.setVisible(false);
                         selectedTrip.setTripBus(BusElite);
                         if(buskind.equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
                                                          if(!buskind.equals("null"))
                                             { chech_reserved_seats(selectedTrip.getSeat_code());}
                                               
             }
           }
    }
                         
}
        else   if(buskind.equals("Classic")){

seatselectionClassic.setVisible(true);
seatselectionElite.setVisible(false);
selectedTrip.setTripBus(BusClassic);
              
                               if(buskind.equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip); 
                                     selectedTrip=Trip_list.get(i);
                                             if(!buskind.equals("null"))
                                             { chech_reserved_seats(selectedTrip.getSeat_code());}
                                             
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
}   

    }//GEN-LAST:event_bustypeActionPerformed

    
    private void num_of_selectedseatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num_of_selectedseatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num_of_selectedseatActionPerformed

    private void totalcostTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalcostTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalcostTXTActionPerformed

    private void MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MMouseClicked

    }//GEN-LAST:event_MMouseClicked

    private void BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BMouseClicked

    private void CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CMouseClicked

    private void DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DMouseClicked

    private void EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EMouseClicked

    private void FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_FMouseClicked

    private void AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AMouseClicked
     
    }//GEN-LAST:event_AMouseClicked

    private void GMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_GMouseClicked

    private void IMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_IMouseClicked

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());              G_booked.setVisible(true);
             G.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="G";
           selected_seat_trip+="G";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_GActionPerformed

    private void JMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JMouseClicked

    private void KMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_KMouseClicked

    private void LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LMouseClicked

    private void HMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_HMouseClicked

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             A_booked.setVisible(true);A.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="A";
           selected_seat_trip+="A";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
  
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_AActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());             E_booked.setVisible(true);
             E.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="E";
           selected_seat_trip+="E";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
 
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_EActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());           F_booked.setVisible(true);
             F.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="F";
           selected_seat_trip+="F";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_FActionPerformed

    private void OMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_OMouseClicked

    private void NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_NMouseClicked

    private void QMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_QMouseClicked

    private void PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PMouseClicked

    private void SMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SMouseClicked

    private void TMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TMouseClicked

    private void UMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UMouseClicked

    private void VMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_VMouseClicked

    private void WMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_WMouseClicked

    private void RMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RMouseClicked

    private void YMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_YMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_YMouseClicked

    private void ZMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ZMouseClicked

    private void aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_aMouseClicked

    private void XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_XMouseClicked

    private void cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cMouseClicked

    private void dMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dMouseClicked

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bMouseClicked

    private void jMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMouseClicked

    private void gMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_gMouseClicked

    private void hMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_hMouseClicked

    private void iMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_iMouseClicked

    private void eMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_eMouseClicked

    private void fMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fMouseClicked

    private void PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PActionPerformed
      String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             P_booked.setVisible(true);
             P.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="P";
           selected_seat_trip+="P";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

    }//GEN-LAST:event_PActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
  String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             X_booked.setVisible(true);
             X.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="X";
           selected_seat_trip+="X";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_XActionPerformed

    private void dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dActionPerformed
    String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             d_booked.setVisible(true);
             d.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="d";
           selected_seat_trip+="d";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

    }//GEN-LAST:event_dActionPerformed

    private void iActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iActionPerformed
   String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             i_booked.setVisible(true);
             i.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="i";
           selected_seat_trip+="i";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

    }//GEN-LAST:event_iActionPerformed

    private void jActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jActionPerformed
      String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             j_booked.setVisible(true);
             j.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="j";
           selected_seat_trip+="j";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

    }//GEN-LAST:event_jActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
     String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             M_booked.setVisible(true);
             M.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="M";
           selected_seat_trip+="M";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

    }//GEN-LAST:event_MActionPerformed

    private void NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NActionPerformed
     String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             N_booked.setVisible(true);
             N.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="N";
           selected_seat_trip+="N";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

    }//GEN-LAST:event_NActionPerformed

    private void OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OActionPerformed
        String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             O_booked.setVisible(true);
             O.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="O";
           selected_seat_trip+="O";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

    }//GEN-LAST:event_OActionPerformed

    private void QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QActionPerformed
     String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             Q_booked.setVisible(true);
             Q.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="Q";
           selected_seat_trip+="Q";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

    }//GEN-LAST:event_QActionPerformed

    private void RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RActionPerformed
   String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             R_booked.setVisible(true);
             R.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="R";
           selected_seat_trip+="R";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

    }//GEN-LAST:event_RActionPerformed

    private void SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SActionPerformed
  String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             S_booked.setVisible(true);
             S.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="S";
           selected_seat_trip+="S";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

    }//GEN-LAST:event_SActionPerformed

    private void TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TActionPerformed
      String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             T_booked.setVisible(true);
             T.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="T";
           selected_seat_trip+="T";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

    }//GEN-LAST:event_TActionPerformed

    private void UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UActionPerformed
        String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             U_booked.setVisible(true);
             U.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="U";
           selected_seat_trip+="U";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

    }//GEN-LAST:event_UActionPerformed

    private void VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VActionPerformed
        String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             V_booked.setVisible(true);
             V.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="V";
           selected_seat_trip+="V";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

    }//GEN-LAST:event_VActionPerformed

    private void WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WActionPerformed
  String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             W_booked.setVisible(true);
             W.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="W";
           selected_seat_trip+="W";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_WActionPerformed

    private void YActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YActionPerformed
         String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             Y_booked.setVisible(true);
             Y.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="Y";
           selected_seat_trip+="Y";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

    }//GEN-LAST:event_YActionPerformed

    private void ZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZActionPerformed
         String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             Z_booked.setVisible(true);
             Z.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="Z";
           selected_seat_trip+="Z";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

    }//GEN-LAST:event_ZActionPerformed

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
  String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             a_booked.setVisible(true);
             a.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="a";
           selected_seat_trip+="a";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_aActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
  String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             b_booked.setVisible(true);
             b.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="b";
           selected_seat_trip+="b";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

    }//GEN-LAST:event_bActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
      String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             c_booked.setVisible(true);
             c.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="c";
           selected_seat_trip+="c";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

    }//GEN-LAST:event_cActionPerformed

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
          String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             e_booked.setVisible(true);
             e.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="e";
           selected_seat_trip+="e";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

    }//GEN-LAST:event_eActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
  String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             f_booked.setVisible(true);
             f.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="f";
           selected_seat_trip+="f";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_fActionPerformed

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
  String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             g_booked.setVisible(true);
             g.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="g";
           selected_seat_trip+="g";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

    }//GEN-LAST:event_gActionPerformed

    private void hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hActionPerformed
              String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
             h_booked.setVisible(true);
             h.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="h";
           selected_seat_trip+="h";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

    }//GEN-LAST:event_hActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());     
             B_booked.setVisible(true);B.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="B";
           selected_seat_trip+="B";
                count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
             admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_BActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());             C_booked.setVisible(true);
             C.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="C";
           selected_seat_trip+="C";
                count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
   
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());                        D_booked.setVisible(true);D.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="D";
           selected_seat_trip+="D";
                count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
             admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_DActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());             H_booked.setVisible(true);
             H.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="H";
           selected_seat_trip+="H";
     count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
   
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_HActionPerformed

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());     I_booked.setVisible(true);
             I.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="I";
           selected_seat_trip+="I";
                count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_IActionPerformed

    private void JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JActionPerformed
String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());   J_booked.setVisible(true);
             J.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="J";
           selected_seat_trip+="J";
                count_seat++;
    
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_JActionPerformed

    private void KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KActionPerformed
String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());               K_booked.setVisible(true);
             K.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="K";
           selected_seat_trip+="K";
                count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
       
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_KActionPerformed

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());    L_booked.setVisible(true);
             L.setVisible(false);
           int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number-1);
        selected_seat_customer+="L";
           selected_seat_trip+="L";
                count_seat++;
     num_of_selectedseat.setText(String.valueOf(count_seat));
  
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_LActionPerformed

    private void RESERVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESERVEActionPerformed

        String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());
               
        if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
        admin.add_Customer_trips(current_customer.getUsername(),selectedTrip,selected_seat_customer);
        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }  
                         admin.add_Customer_trips(current_customer.getUsername(),selectedTrip,selected_seat_customer);
        }
     
        admin.send_confirmationEmail_booking(selectedTrip);
       upload_customers_trips_data();
    }//GEN-LAST:event_RESERVEActionPerformed

    private void A_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_A_bookedMouseClicked

    private void A_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_bookedActionPerformed
 String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       A.setVisible(true);
       A_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                     selectedTrip.setAvailableSeatsNum(ava_number+1);
                 
                 selected_seat_customer = selected_seat_customer.replace("A","");
                selected_seat_trip = selected_seat_trip.replace("A","");
                     count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
               admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_A_bookedActionPerformed

    private void B_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_B_bookedMouseClicked

    private void B_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_bookedActionPerformed
 String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());        B.setVisible(true);
       B_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
              
                     }
                     
                     
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("B","");
                selected_seat_trip = selected_seat_trip.replace("B","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
  
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_B_bookedActionPerformed

    private void C_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_C_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_C_bookedMouseClicked

    private void C_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_bookedActionPerformed
 String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());     C.setVisible(true);
       C_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
          selectedTrip.setAvailableSeatsNum(ava_number+1);
                 
                 selected_seat_customer = selected_seat_customer.replace("C","");
                selected_seat_trip = selected_seat_trip.replace("C","");
                     count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
          
          
    }//GEN-LAST:event_C_bookedActionPerformed

    private void D_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_D_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_D_bookedMouseClicked

    private void D_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_bookedActionPerformed
 String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       D.setVisible(true);
       D_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
        selectedTrip.setAvailableSeatsNum(ava_number+1);
                 
                 selected_seat_customer = selected_seat_customer.replace("D","");
                selected_seat_trip = selected_seat_trip.replace("D","");    
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat));
     totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_D_bookedActionPerformed

    private void E_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_E_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_E_bookedMouseClicked

    private void E_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_bookedActionPerformed
 String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());           E.setVisible(true);
       E_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
    selectedTrip.setAvailableSeatsNum(ava_number+1);
                 
                 selected_seat_customer = selected_seat_customer.replace("E","");
                selected_seat_trip = selected_seat_trip.replace("E","");
                     count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat));
     totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
     
     
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_E_bookedActionPerformed

    private void F_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_F_bookedMouseClicked

    private void F_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_bookedActionPerformed
 String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       F.setVisible(true);
       F_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           }     selectedTrip.setAvailableSeatsNum(ava_number+1);
                 
                 selected_seat_customer = selected_seat_customer.replace("F","");
                selected_seat_trip = selected_seat_trip.replace("F","");   
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat));
     totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_F_bookedActionPerformed

    private void G_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_G_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_G_bookedMouseClicked

    private void G_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G_bookedActionPerformed
 String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());      G.setVisible(true);
       G_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                   selectedTrip.setAvailableSeatsNum(ava_number+1);
                 
                 selected_seat_customer = selected_seat_customer.replace("G","");
                selected_seat_trip = selected_seat_trip.replace("G","");
                     count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat));
     totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
     
   
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_G_bookedActionPerformed

    private void H_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_H_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_H_bookedMouseClicked

    private void H_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H_bookedActionPerformed
 String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       H.setVisible(true);
       H_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                    selectedTrip.setAvailableSeatsNum(ava_number+1);
                 
                 selected_seat_customer = selected_seat_customer.replace("H","");
                selected_seat_trip = selected_seat_trip.replace("H","");
                     count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat));
     totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
               admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_H_bookedActionPerformed

    private void I_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_I_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_I_bookedMouseClicked

    private void I_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_bookedActionPerformed
 String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       I.setVisible(true);
       I_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
                   selectedTrip.setAvailableSeatsNum(ava_number+1);
                 
                 selected_seat_customer = selected_seat_customer.replace("I","");
                selected_seat_trip = selected_seat_trip.replace("I","");
                     count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat));
     totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));

          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
     
    }//GEN-LAST:event_I_bookedActionPerformed

    private void J_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_J_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_J_bookedMouseClicked

    private void J_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_bookedActionPerformed
 String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());   J.setVisible(true);
       J_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
    selectedTrip.setAvailableSeatsNum(ava_number+1);
                 
                 selected_seat_customer = selected_seat_customer.replace("J","");
                selected_seat_trip = selected_seat_trip.replace("J","");
                     count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_J_bookedActionPerformed

    private void K_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_K_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_K_bookedMouseClicked

    private void K_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K_bookedActionPerformed
 String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());     K.setVisible(true);
       K_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           }     selectedTrip.setAvailableSeatsNum(ava_number+1);
                 
                 selected_seat_customer = selected_seat_customer.replace("K","");
                selected_seat_trip = selected_seat_trip.replace("K","");
                     count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat));
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_K_bookedActionPerformed

    private void L_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_L_bookedMouseClicked

    private void L_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_bookedActionPerformed
 String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());   L.setVisible(true);
       L_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats();
           } 
         selectedTrip.setAvailableSeatsNum(ava_number+1);                 
                 selected_seat_customer = selected_seat_customer.replace("L","");
                selected_seat_trip = selected_seat_trip.replace("L","");
                     count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat));
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_L_bookedActionPerformed

    private void upTripsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upTripsComboBoxActionPerformed
        deleteBookBtn.setEnabled(true);
    }//GEN-LAST:event_upTripsComboBoxActionPerformed

    private void deleteBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBookBtnActionPerformed
        String selectedTripCode =upTripsComboBox.getSelectedItem().toString();
        String customer_seatCode = null;
        int tripIndex = 0 ;
        int customer_tripIndex = 0;
        String tripSeatCode = null;

        for ( int i = 0 ; i < Trip_list.size() ; i++)
        {
            if (Trip_list.get(i).getCode().equals(selectedTripCode))
            {
                tripSeatCode = Trip_list.get(i).getSeat_code();
                tripIndex = i ;
                break;
            }
        }

        for(int i = 0 ; i < Customer_trips_list.size(); i++)
        {
            if (current_customer.getUsername().equals(Customer_trips_list.get(i).getUserName()) && selectedTripCode.equals(Customer_trips_list.get(i).getTrip_customer().getCode()))
            {
                customer_seatCode = Customer_trips_list.get(i).getSeatCode();
                customer_tripIndex = i;
                break;
            }
        }

        for(int i = 0 ; i < customer_seatCode.length() ;i++)
        {
            tripSeatCode = tripSeatCode.replace(String.valueOf(customer_seatCode.charAt(i)), "");
        }

        Trip_list.get(tripIndex).setAvailableSeatsNum(Trip_list.get(tripIndex).getAvailableSeatsNum()+customer_seatCode.length());
        Trip_list.get(tripIndex).setSeat_code(tripSeatCode);

        Customer_trips_list.remove(customer_tripIndex);

        try {
            Connection c;
            Statement s;
            Sec c1 = new Sec();
            c = c1.connect();
            s = c.createStatement();
            String query;

            query = "update trips set seat_code = '"+ tripSeatCode +"'where code ='"+selectedTripCode+"'";
            s.execute(query);

            query = "delete from customers_trips where code = '"+selectedTripCode+"'";
            s.execute(query);

            c.close();
            s.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        upTripsComboBox.removeAllItems();
        ArrayList<customers_trips> upComingTrips = admin.view_customer_Upcoming_trips();
        if (upComingTrips.isEmpty())
        {
            upTripsComboBox.setVisible(false);
            chooseTripLbl.setVisible(false);
            deleteBookBtn.setVisible(false);
            noTripsLabel.setText("No Upcoming Trips");
            noTripsLabel.setVisible(true);
        }
        else
        {
            noTripsLabel.setVisible(false);
            upTripsComboBox.setVisible(true);
            chooseTripLbl.setVisible(true);
            deleteBookBtn.setVisible(true);
            ArrayList<customers_trips> repeated_cusTrips=new ArrayList<customers_trips>();
            boolean found=false;

            for(int i = 0 ; i < upComingTrips.size() ; i++)
            {
                found = false;
                for (int j=0 ; j<repeated_cusTrips.size();j++)
                {
                    if(repeated_cusTrips.get(j).getTrip_customer().getCode().equals(upComingTrips.get(i).getTrip_customer().getCode())){
                        found=true;

                    }
                }

                if(!found)
                {
                    upTripsComboBox.addItem(upComingTrips.get(i).getTrip_customer().getCode());
                    repeated_cusTrips.add(upComingTrips.get(i));
                }
            }
        }
    }//GEN-LAST:event_deleteBookBtnActionPerformed

    private void CeditUsernametxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CeditUsernametxtFocusLost
  
        String parsedUsername = CeditUsernametxt.getText();
        
                if(parsedUsername.equals(current_customer.getUsername()))
                {
                    CeditUsernametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
                    CuserError.setText("");
                    
                    
                }
                else
                {
                    int check = admin.check_Username(parsedUsername);
                    if(check==1)
                    {
                        CuserError.setText("Invalid username.");
                        CuserError.setVisible(true);
                        CeditUsernametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                        
                    }
                    else if(check==2)
                    {
                        CuserError.setText("Username already exists.");
                        CuserError.setVisible(true);
                        CeditUsernametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                       
                    }
                    else
                    {
                        CuserError.setText("");
                        CuserError.setVisible(false);
                        CeditUsernametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                        
                    }
                } 
                
                 if(!CuserError.isVisible()&&!CpassError.isVisible()&&!CemailError.isVisible()&&!CphoneError.isVisible()&&
                                 !CVnoError.isVisible()&&!CVpassError.isVisible())
                        {
                        CsaveEditBtn.setEnabled(true);
                        }
                else
          {
              CsaveEditBtn.setEnabled(false);
          }
                 
    }//GEN-LAST:event_CeditUsernametxtFocusLost

    private void CeditUsernametxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CeditUsernametxtMouseClicked
       String parsedUsername = CeditUsernametxt.getText();
        
                if(parsedUsername.equals(current_customer.getUsername()))
                {
                    CeditUsernametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
                    CuserError.setText("");
                    CuserError.setVisible(false);
                    
                }
                else
                {
                    int check = admin.check_Username(parsedUsername);
                    if(check==1)
                    {
                        CuserError.setText("Invalid username.");
                        CuserError.setVisible(true);
                        CeditUsernametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                        
                    }
                    else if(check==2)
                    {
                        CuserError.setText("Username already exists.");
                        CuserError.setVisible(true);
                        CeditUsernametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                        
                    }
                    else
                    {
                        CuserError.setText("");
                        CuserError.setVisible(false);
                        CeditUsernametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                         
                    }
                }
                 if(!CuserError.isVisible()&&!CpassError.isVisible()&&!CemailError.isVisible()&&!CphoneError.isVisible()&&
                                 !CVnoError.isVisible()&&!CVpassError.isVisible())
                        {
                        CsaveEditBtn.setEnabled(true);
                        }
                 else
          {
              CsaveEditBtn.setEnabled(false);
          }
    }//GEN-LAST:event_CeditUsernametxtMouseClicked

    private void CeditUsernametxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CeditUsernametxtKeyReleased
       String parsedUsername = CeditUsernametxt.getText();
        
                if(parsedUsername.equals(current_customer.getUsername()))
                {
                    CeditUsernametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
                    CuserError.setText("");
                    CuserError.setVisible(false);
                    
                }
                else
                {
                    int check = admin.check_Username(parsedUsername);
                    if(check==1)
                    {
                        CuserError.setText("Invalid username.");
                        CuserError.setVisible(true);
                        CeditUsernametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                        
                    }
                    else if(check==2)
                    {
                        CuserError.setText("Username already exists.");
                        CuserError.setVisible(true);
                        CeditUsernametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                        CsaveEditBtn.setEnabled(false);
                    }
                    else
                    {
                        CuserError.setText("");
                        CuserError.setVisible(false);
                        CeditUsernametxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                         
                    }
                }
                 if(!CuserError.isVisible()&&!CpassError.isVisible()&&!CemailError.isVisible()&&!CphoneError.isVisible()&&
                                 !CVnoError.isVisible()&&!CVpassError.isVisible())
                        {
                        CsaveEditBtn.setEnabled(true);
                        }
                 else
          {
              CsaveEditBtn.setEnabled(false);
          }
    }//GEN-LAST:event_CeditUsernametxtKeyReleased

    private void CeditPasswordtxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CeditPasswordtxtFocusLost
        String parsedPassword = CeditPasswordtxt.getText(); 
       
        if( parsedPassword.equals(current_customer.getPassword()))
                {
                    CeditPasswordtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
                    CpassError.setText("");
                    CpassError.setVisible(false);
                   
                }
                else
                {
                    if(admin.check_Password(parsedPassword)==1)
                    {
                        CpassError.setText("Invalid password.");
                        CpassError.setVisible(true);
                        CeditPasswordtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                       
                    }
                    else
                    {
                         CpassError.setText("");
                        CpassError.setVisible(false);
                        CeditPasswordtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                  
                    }
                }
         if(!CuserError.isVisible()&&!CpassError.isVisible()&&!CemailError.isVisible()&&!CphoneError.isVisible()&&
                                 !CVnoError.isVisible()&&!CVpassError.isVisible())
                        {
                        CsaveEditBtn.setEnabled(true);
                        }
         else
          {
              CsaveEditBtn.setEnabled(false);
          }
    }//GEN-LAST:event_CeditPasswordtxtFocusLost

    private void CeditPasswordtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CeditPasswordtxtMouseClicked
 String parsedPassword = CeditPasswordtxt.getText(); 
       
        if( parsedPassword.equals(current_customer.getPassword()))
                {
                    CeditPasswordtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
                    CpassError.setText("");
                    CpassError.setVisible(false);
                   
                }
                else
                {
                    if(admin.check_Password(parsedPassword)==1)
                    {
                        CpassError.setText("Invalid password.");
                        CpassError.setVisible(true);
                        CeditPasswordtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                      
                    }
                    else
                    {
                         CpassError.setText("");
                        CpassError.setVisible(false);
                        CeditPasswordtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                    
                    }
                }
         if(!CuserError.isVisible()&&!CpassError.isVisible()&&!CemailError.isVisible()&&!CphoneError.isVisible()&&
                                 !CVnoError.isVisible()&&!CVpassError.isVisible())
                        {
                        CsaveEditBtn.setEnabled(true);
                        }
         else
          {
              CsaveEditBtn.setEnabled(false);
          }
    }//GEN-LAST:event_CeditPasswordtxtMouseClicked

    private void CeditPasswordtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CeditPasswordtxtKeyReleased
  String parsedPassword = CeditPasswordtxt.getText(); 
       
        if( parsedPassword.equals(current_customer.getPassword()))
                {
                    CeditPasswordtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
                    CpassError.setText("");
                    CpassError.setVisible(false);
                    
                }
                else
                {
                    if(admin.check_Password(parsedPassword)==1)
                    {
                        CpassError.setText("Invalid password.");
                        CpassError.setVisible(true);
                        CeditPasswordtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                       
                    }
                    else
                    {
                         CpassError.setText("");
                        CpassError.setVisible(false);
                        CeditPasswordtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                    
                    }
                }
         if(!CuserError.isVisible()&&!CpassError.isVisible()&&!CemailError.isVisible()&&!CphoneError.isVisible()&&
                                 !CVnoError.isVisible()&&!CVpassError.isVisible())
                        {
                        CsaveEditBtn.setEnabled(true);
                        }
         else
          {
              CsaveEditBtn.setEnabled(false);
          }
    }//GEN-LAST:event_CeditPasswordtxtKeyReleased

    private void CeditEmailtxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CeditEmailtxtFocusLost
   String parsedEmail = CeditEmailtxt.getText();
        
        if( parsedEmail.equals(current_customer.getEmail()))
                {
                    CeditEmailtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
                    CemailError.setText("");
                    CemailError.setVisible(false);
                    
                }
                else
                {
                    int check = admin.check_Email(parsedEmail);
                    if(check==1 || check==2 || check==3)
                    {
                         CemailError.setText("Invalid Email.");
                        CemailError.setVisible(true);
                        CeditEmailtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                        
                    }
                    else if(check == 4)
                    {
                        CemailError.setText("Email already exists.");
                        CemailError.setVisible(true);
                        CeditEmailtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                        CsaveEditBtn.setEnabled(false);
                    }
                    else
                    {
                        CemailError.setText("");
                        CemailError.setVisible(false);
                        CeditEmailtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                 
                    }
                }
         if(!CuserError.isVisible()&&!CpassError.isVisible()&&!CemailError.isVisible()&&!CphoneError.isVisible()&&
                                 !CVnoError.isVisible()&&!CVpassError.isVisible())
                        {
                        CsaveEditBtn.setEnabled(true);
                        }
         else
          {
              CsaveEditBtn.setEnabled(false);
          }
    }//GEN-LAST:event_CeditEmailtxtFocusLost

    private void CeditEmailtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CeditEmailtxtMouseClicked
  String parsedEmail = CeditEmailtxt.getText();
        
        if( parsedEmail.equals(current_customer.getEmail()))
                {
                    CeditEmailtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
                    CemailError.setText("");
                    CemailError.setVisible(false);
                    
                }
                else
                {
                    int check = admin.check_Email(parsedEmail);
                    if(check==1 || check==2 || check==3)
                    {
                         CemailError.setText("Invalid Email.");
                        CemailError.setVisible(true);
                        CeditEmailtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                        
                    }
                    else if(check == 4)
                    {
                        CemailError.setText("Email already exists.");
                        CemailError.setVisible(true);
                        CeditEmailtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                        
                    }
                    else
                    {
                        CemailError.setText("");
                        CemailError.setVisible(false);
                        CeditEmailtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
            
                    }
                }
         if(!CuserError.isVisible()&&!CpassError.isVisible()&&!CemailError.isVisible()&&!CphoneError.isVisible()&&
                                 !CVnoError.isVisible()&&!CVpassError.isVisible())
                        {
                        CsaveEditBtn.setEnabled(true);
                        }
         else
          {
              CsaveEditBtn.setEnabled(false);
          }
    }//GEN-LAST:event_CeditEmailtxtMouseClicked

    private void CeditEmailtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CeditEmailtxtKeyReleased
 String parsedEmail = CeditEmailtxt.getText();
        
        if( parsedEmail.equals(current_customer.getEmail()))
                {
                    CeditEmailtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
                    CemailError.setText("");
                    CemailError.setVisible(false);
                    
                }
                else
                {
                    int check = admin.check_Email(parsedEmail);
                    if(check==1 || check==2 || check==3)
                    {
                         CemailError.setText("Invalid Email.");
                        CemailError.setVisible(true);
                        CeditEmailtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                        
                    }
                    else if(check == 4)
                    {
                        CemailError.setText("Email already exists.");
                        CemailError.setVisible(true);
                        CeditEmailtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                        
                    }
                    else
                    {
                        CemailError.setText("");
                        CemailError.setVisible(false);
                        CeditEmailtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                   
                    }
                }
         if(!CuserError.isVisible()&&!CpassError.isVisible()&&!CemailError.isVisible()&&!CphoneError.isVisible()&&
                                 !CVnoError.isVisible()&&!CVpassError.isVisible())
                        {
                        CsaveEditBtn.setEnabled(true);
                        }
         else
          {
              CsaveEditBtn.setEnabled(false);
          }
    }//GEN-LAST:event_CeditEmailtxtKeyReleased

    private void CsaveEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CsaveEditBtnActionPerformed

        String parsedUsername = CeditUsernametxt.getText();
        String parsedPassword = CeditPasswordtxt.getText();
        String parsedEmail = CeditEmailtxt.getText();
         String parsedPhone = CeditPhonetxt.getText();
         String parsedVnum = CeditVnumtxt.getText();
         String parsedVpass = CeditVpasstxt.getText();
         
         
         if(!parsedUsername.equals(current_customer.getUsername()))
         {
             current_customer.Edit_Username(parsedUsername);
         }
         if(!parsedPassword.equals(current_customer.getPassword()))
         {
         current_customer.Edit_Password(parsedPassword);
         }
         if(!parsedEmail.equals(current_customer.getEmail()))
         {
         current_customer.Edit_Email(parsedEmail);
         }
         if(!parsedPhone.equals(current_customer.getPhone()))
         {
         current_customer.Edit_Phone(parsedPhone);
         }
         if(!parsedVnum.equals(current_customer.getVISAnumber()))
         {
         current_customer.Edit_VISANO(parsedVnum);
         }
         if(!parsedVpass.equals(current_customer.getVISApassword()))
         {
         current_customer.Edit_VISA_Password(parsedVpass);
         }
    }//GEN-LAST:event_CsaveEditBtnActionPerformed

    private void CeditPhonetxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CeditPhonetxtFocusLost
        String parsedPhone = CeditPhonetxt.getText();
         if( parsedPhone.equals(current_customer.getPhone()))
                {
                    CeditPhonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
                    CphoneError.setText("");
                    CphoneError.setVisible(false);
                    
                }
                else
                {
                    if(admin.check_Phone(parsedPhone)==1)
                    {
                        CphoneError.setText("Invalid Phone.");
                        CphoneError.setVisible(true);
                        CeditPhonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                        
                    }
                    else
                    {
                        CphoneError.setText("");
                        CphoneError.setVisible(false);
                        CeditPhonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                  
                    }
                }
          if(!CuserError.isVisible()&&!CpassError.isVisible()&&!CemailError.isVisible()&&!CphoneError.isVisible()&&
                                 !CVnoError.isVisible()&&!CVpassError.isVisible())
                        {
                        CsaveEditBtn.setEnabled(true);
                        }
          else
          {
              CsaveEditBtn.setEnabled(false);
          }
    }//GEN-LAST:event_CeditPhonetxtFocusLost

    private void CeditPhonetxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CeditPhonetxtMouseClicked
   String parsedPhone = CeditPhonetxt.getText();
         if( parsedPhone.equals(current_customer.getPhone()))
                {
                    CeditPhonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
                    CphoneError.setText("");
                    CphoneError.setVisible(false);
                   
                }
                else
                {
                    if(admin.check_Phone(parsedPhone)==1)
                    {
                        CphoneError.setText("Invalid Phone.");
                        CphoneError.setVisible(true);
                        CeditPhonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                      
                    }
                    else
                    {
                        CphoneError.setText("");
                        CphoneError.setVisible(false);
                        CeditPhonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                  
                    }
                }
          if(!CuserError.isVisible()&&!CpassError.isVisible()&&!CemailError.isVisible()&&!CphoneError.isVisible()&&
                                 !CVnoError.isVisible()&&!CVpassError.isVisible())
                        {
                        CsaveEditBtn.setEnabled(true);
                        }
          else
          {
              CsaveEditBtn.setEnabled(false);
          }
    }//GEN-LAST:event_CeditPhonetxtMouseClicked

    private void CeditPhonetxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CeditPhonetxtKeyReleased
     String parsedPhone = CeditPhonetxt.getText();
         if( parsedPhone.equals(current_customer.getPhone()))
                {
                    CeditPhonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
                    CphoneError.setText("");
                    CphoneError.setVisible(false);
                    
                }
                else
                {
                    if(admin.check_Phone(parsedPhone)==1)
                    {
                        CphoneError.setText("Invalid Phone.");
                        CphoneError.setVisible(true);
                        CeditPhonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                        
                    }
                    else
                    {
                        CphoneError.setText("");
                        CphoneError.setVisible(false);
                        CeditPhonetxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                   
                    }
                }
          if(!CuserError.isVisible()&&!CpassError.isVisible()&&!CemailError.isVisible()&&!CphoneError.isVisible()&&
                                 !CVnoError.isVisible()&&!CVpassError.isVisible())
                        {
                        CsaveEditBtn.setEnabled(true);
                        }
          else
          {
              CsaveEditBtn.setEnabled(false);
          }
    }//GEN-LAST:event_CeditPhonetxtKeyReleased

    private void CeditVnumtxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CeditVnumtxtFocusLost
      String parsedVnum = CeditVnumtxt.getText();
         if( parsedVnum.equals(current_customer.getVISAnumber()))
                {
                    CeditVnumtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
                    CVnoError.setText("");
                    CVnoError.setVisible(false);
                    
                }
                else
                {
                    if(admin.check_Visa_no(parsedVnum)==1)
                    {
                        CVnoError.setText("Invalid VISA number.");
                        CVnoError.setVisible(true);
                        CeditVnumtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                        
                    }
                    else
                    {
                        CVnoError.setText("");
                        CVnoError.setVisible(false);
                        CeditVnumtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                  
                    }
                }
          if(!CuserError.isVisible()&&!CpassError.isVisible()&&!CemailError.isVisible()&&!CphoneError.isVisible()&&
                                 !CVnoError.isVisible()&&!CVpassError.isVisible())
                        {
                        CsaveEditBtn.setEnabled(true);
                        }
          else
          {
              CsaveEditBtn.setEnabled(false);
          }
    }//GEN-LAST:event_CeditVnumtxtFocusLost

    private void CeditVnumtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CeditVnumtxtMouseClicked
  String parsedVnum = CeditVnumtxt.getText();
         if( parsedVnum.equals(current_customer.getVISAnumber()))
                {
                    CeditVnumtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
                    CVnoError.setText("");
                    CVnoError.setVisible(false);
                     
                }
                else
                {
                    if(admin.check_Visa_no(parsedVnum)==1)
                    {
                        CVnoError.setText("Invalid VISA number.");
                        CVnoError.setVisible(true);
                        CeditVnumtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                      
                    }
                    else
                    {
                        CVnoError.setText("");
                        CVnoError.setVisible(false);
                        CeditVnumtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                 
                    }
                }
          if(!CuserError.isVisible()&&!CpassError.isVisible()&&!CemailError.isVisible()&&!CphoneError.isVisible()&&
                                 !CVnoError.isVisible()&&!CVpassError.isVisible())
                        {
                        CsaveEditBtn.setEnabled(true);
                        }
          else
          {
              CsaveEditBtn.setEnabled(false);
          }
    }//GEN-LAST:event_CeditVnumtxtMouseClicked

    private void CeditVnumtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CeditVnumtxtKeyReleased
       String parsedVnum = CeditVnumtxt.getText();
         if( parsedVnum.equals(current_customer.getVISAnumber()))
                {
                    CeditVnumtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
                    CVnoError.setText("");
                    CVnoError.setVisible(false);
                   
                }
                else
                {
                    if(admin.check_Visa_no(parsedVnum)==1)
                    {
                        CVnoError.setText("Invalid VISA number.");
                        CVnoError.setVisible(true);
                        CeditVnumtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                        
                    }
                    else
                    {
                        CVnoError.setText("");
                        CVnoError.setVisible(false);
                        CeditVnumtxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                  
                    }
                }
          if(!CuserError.isVisible()&&!CpassError.isVisible()&&!CemailError.isVisible()&&!CphoneError.isVisible()&&
                                 !CVnoError.isVisible()&&!CVpassError.isVisible())
                        {
                        CsaveEditBtn.setEnabled(true);
                        }
          else
          {
              CsaveEditBtn.setEnabled(false);
          }
    }//GEN-LAST:event_CeditVnumtxtKeyReleased

    private void CeditVpasstxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CeditVpasstxtFocusLost
  String parsedVpass = CeditVpasstxt.getText();
         if( parsedVpass.equals(current_customer.getVISApassword()))
                {
                    CeditVpasstxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
                    CVpassError.setText("");
                    CVpassError.setVisible(false);
                    
                }
          else
                {
                    if(admin.Check_VisaPassword(parsedVpass)==1)
                    {
                        CVpassError.setText("Invalid VISA password.");
                        CVpassError.setVisible(true);
                        CeditVpasstxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                        
                    }
                    else
                    {
                        CVpassError.setText("");
                        CVpassError.setVisible(false);
                        CeditVpasstxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                        
                    }
                }
          if(!CuserError.isVisible()&&!CpassError.isVisible()&&!CemailError.isVisible()&&!CphoneError.isVisible()&&
                                 !CVnoError.isVisible()&&!CVpassError.isVisible())
                        {
                        CsaveEditBtn.setEnabled(true);
                        }
          else
          {
              CsaveEditBtn.setEnabled(false);
          }
    }//GEN-LAST:event_CeditVpasstxtFocusLost

    private void CeditVpasstxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CeditVpasstxtMouseClicked
   String parsedVpass = CeditVpasstxt.getText();
         if( parsedVpass.equals(current_customer.getVISApassword()))
                {
                    CeditVpasstxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
                    CVpassError.setText("");
                    CVpassError.setVisible(false);
                }
          else
                {
                    if(admin.Check_VisaPassword(parsedVpass)==1)
                    {
                        CVpassError.setText("Invalid VISA password.");
                        CVpassError.setVisible(true);
                        CeditVpasstxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                        
                    }
                    else
                    {
                        CVpassError.setText("");
                        CVpassError.setVisible(false);
                        CeditVpasstxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                   
                    }
                }
          if(!CuserError.isVisible()&&!CpassError.isVisible()&&!CemailError.isVisible()&&!CphoneError.isVisible()&&
                                 !CVnoError.isVisible()&&!CVpassError.isVisible())
                        {
                        CsaveEditBtn.setEnabled(true);
                        }
          else
          {
              CsaveEditBtn.setEnabled(false);
          }
    }//GEN-LAST:event_CeditVpasstxtMouseClicked

    private void CeditVpasstxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CeditVpasstxtKeyReleased
      String parsedVpass = CeditVpasstxt.getText();
         if( parsedVpass.equals(current_customer.getVISApassword()))
                {
                    CeditVpasstxt.setBorder(BorderFactory.createLineBorder(Color.decode("#013243")));
                    CVpassError.setText("");
                    CVpassError.setVisible(false);
                   
                }
          else
                {
                    if(admin.Check_VisaPassword(parsedVpass)==1)
                    {
                        CVpassError.setText("Invalid VISA password.");
                        CVpassError.setVisible(true);
                        CeditVpasstxt.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                        
                    }
                    else
                    {
                        CVpassError.setText("");
                        CVpassError.setVisible(false);
                        CeditVpasstxt.setBorder(BorderFactory.createLineBorder(Color.decode("#4DBD33")));
                   
                    }
                }
          if(!CuserError.isVisible()&&!CpassError.isVisible()&&!CemailError.isVisible()&&!CphoneError.isVisible()&&
                                 !CVnoError.isVisible()&&!CVpassError.isVisible())
                        {
                        CsaveEditBtn.setEnabled(true);
                        }
          else
          {
              CsaveEditBtn.setEnabled(false);
          }
    }//GEN-LAST:event_CeditVpasstxtKeyReleased

    private void CAccInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CAccInfoMousePressed
        
        
        
    }//GEN-LAST:event_CAccInfoMousePressed

    private void M_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_M_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_M_bookedMouseClicked

    private void M_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_bookedActionPerformed
    String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        M.setVisible(true);
       M_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("M","");
                selected_seat_trip = selected_seat_trip.replace("M","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_M_bookedActionPerformed

    private void N_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_N_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_N_bookedMouseClicked

    private void N_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N_bookedActionPerformed
      String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        N.setVisible(true);
       N_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("N","");
                selected_seat_trip = selected_seat_trip.replace("N","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_N_bookedActionPerformed

    private void O_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_O_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_O_bookedMouseClicked

    private void O_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O_bookedActionPerformed
   String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        O.setVisible(true);
       O_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("O","");
                selected_seat_trip = selected_seat_trip.replace("O","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_O_bookedActionPerformed

    private void P_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_P_bookedMouseClicked

    private void P_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_bookedActionPerformed
        String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        P.setVisible(true);
       P_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("P","");
                selected_seat_trip = selected_seat_trip.replace("P","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_P_bookedActionPerformed

    private void Q_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Q_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Q_bookedMouseClicked

    private void Q_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q_bookedActionPerformed
  String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        Q.setVisible(true);
       Q_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("Q","");
                selected_seat_trip = selected_seat_trip.replace("Q","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_Q_bookedActionPerformed

    private void R_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_R_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_R_bookedMouseClicked

    private void R_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_bookedActionPerformed
    String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        R.setVisible(true);
       R_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("R","");
                selected_seat_trip = selected_seat_trip.replace("R","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_R_bookedActionPerformed

    private void S_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_S_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_S_bookedMouseClicked

    private void S_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_bookedActionPerformed
        String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        S.setVisible(true);
       S_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("S","");
                selected_seat_trip = selected_seat_trip.replace("S","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_S_bookedActionPerformed

    private void T_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_T_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_T_bookedMouseClicked

    private void T_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_bookedActionPerformed
    String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        T.setVisible(true);
        T_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("T","");
                selected_seat_trip = selected_seat_trip.replace("T","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_T_bookedActionPerformed

    private void U_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_U_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_U_bookedMouseClicked

    private void U_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_U_bookedActionPerformed
       String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        U.setVisible(true);
       U_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("U","");
                selected_seat_trip = selected_seat_trip.replace("U","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_U_bookedActionPerformed

    private void V_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_V_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_V_bookedMouseClicked

    private void V_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_bookedActionPerformed
     String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        V.setVisible(true);
       V_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("V","");
                selected_seat_trip = selected_seat_trip.replace("V","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_V_bookedActionPerformed

    private void W_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_W_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_W_bookedMouseClicked

    private void W_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_W_bookedActionPerformed
       String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        W.setVisible(true);
       W_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("W","");
                selected_seat_trip = selected_seat_trip.replace("W","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_W_bookedActionPerformed

    private void X_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_X_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_X_bookedMouseClicked

    private void X_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X_bookedActionPerformed
    String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        X.setVisible(true);
       X_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("X","");
                selected_seat_trip = selected_seat_trip.replace("X","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_X_bookedActionPerformed

    private void Y_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Y_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Y_bookedMouseClicked

    private void Y_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Y_bookedActionPerformed
      String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        Y.setVisible(true);
       Y_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("Y","");
                selected_seat_trip = selected_seat_trip.replace("Y","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_Y_bookedActionPerformed

    private void Z_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Z_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Z_bookedMouseClicked

    private void Z_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Z_bookedActionPerformed
       String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        Z.setVisible(true);
       Z_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("Z","");
                selected_seat_trip = selected_seat_trip.replace("Z","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_Z_bookedActionPerformed

    private void a_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_a_bookedMouseClicked

    private void a_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_bookedActionPerformed
         String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        a.setVisible(true);
      a_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("a","");
                selected_seat_trip = selected_seat_trip.replace("a","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_a_bookedActionPerformed

    private void b_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b_bookedMouseClicked

    private void b_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_bookedActionPerformed
  String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        b.setVisible(true);
       b_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("b","");
                selected_seat_trip = selected_seat_trip.replace("b","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_b_bookedActionPerformed

    private void c_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_c_bookedMouseClicked

    private void c_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_bookedActionPerformed
  String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        c.setVisible(true);
       c_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("c","");
                selected_seat_trip = selected_seat_trip.replace("c","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_c_bookedActionPerformed

    private void d_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_d_bookedMouseClicked

    private void d_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_bookedActionPerformed
   String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        d.setVisible(true);
       d_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("d","");
                selected_seat_trip = selected_seat_trip.replace("d","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_d_bookedActionPerformed

    private void e_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_e_bookedMouseClicked

    private void e_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_bookedActionPerformed
  String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        e.setVisible(true);
       e_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("e","");
                selected_seat_trip = selected_seat_trip.replace("e","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_e_bookedActionPerformed

    private void f_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_f_bookedMouseClicked

    private void f_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_bookedActionPerformed
  String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        f.setVisible(true);
       f_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("f","");
                selected_seat_trip = selected_seat_trip.replace("f","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_f_bookedActionPerformed

    private void g_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_g_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_g_bookedMouseClicked

    private void g_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g_bookedActionPerformed
  String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        g.setVisible(true);
       g_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("g","");
                selected_seat_trip = selected_seat_trip.replace("g","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_g_bookedActionPerformed

    private void h_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_h_bookedMouseClicked

    private void h_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h_bookedActionPerformed
  String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        h.setVisible(true);
       h_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("h","");
                selected_seat_trip = selected_seat_trip.replace("h","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_h_bookedActionPerformed

    private void i_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_i_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_i_bookedMouseClicked

    private void i_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_i_bookedActionPerformed
    String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        i.setVisible(true);
       i_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("i","");
                selected_seat_trip = selected_seat_trip.replace("i","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_i_bookedActionPerformed

    private void j_bookedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_bookedMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_j_bookedMouseClicked

    private void j_bookedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_bookedActionPerformed
      String selected_destination=String.valueOf(suitabletrips1.getSelectedItem());
        String selected_date=String.valueOf(pickupdate.getSelectedItem());
        String selected_time=String.valueOf(pickuptime.getSelectedItem());       
        j.setVisible(true);
       j_booked.setVisible(false);
       int ava_number=0;
                     if(selectedTrip.getTripBus() instanceof Classic){
                         BusClassic=(Classic) selectedTrip.getTripBus();
                         ava_number=BusClassic.getTotalNumSeats();
                     }
                     else if (selectedTrip.getTripBus() instanceof Elite){
                      BusElite=(Elite) selectedTrip.getTripBus();
              ava_number=BusElite.getTotalNumSeats(); 
                     }
              selectedTrip.setAvailableSeatsNum(ava_number+1);    
                 selected_seat_customer = selected_seat_customer.replace("j","");
                selected_seat_trip = selected_seat_trip.replace("j","");  
                count_seat-- ;
     num_of_selectedseat.setText(String.valueOf(count_seat)); 
     if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Classic")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Classic){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }      
        admin.set_SeatCode_in_Trips_EDIT(selected_seat_trip, selectedTrip.getCode());
           Customer_trips_list.add(new customers_trips(current_customer.getUsername(),  current_customer.getTotal_cost(),selectedTrip.getCode()
           ,selectedTrip.getPickUp(),selectedTrip.getPickUpDate(),selectedTrip.getPickUpTime(),selectedTrip.getDestination()
           ,selectedTrip.getArrivalDate(),selectedTrip.getarrivalTime(),selectedTrip.getCost(),selectedTrip.getStatus(),selected_seat_customer));

        }
    else if(String.valueOf(bustype.getSelectedItem()).equalsIgnoreCase("Elite")){
           for (int i=0 ; i<Trip_list.size(); i++ ){
                  
               if(selected_destination.equals(Trip_list.get(i).getDestination())&&selected_date.equals(Trip_list.get(i).getPickUpDate())
                       &&selected_time.equals(Trip_list.get(i).getPickUpTime())&&Trip_list.get(i).getTripBus() instanceof Elite){
                                     Trip_list.get(i).setSeat_code(selected_seat_trip);
                                               selectedTrip=Trip_list.get(i);
             }
           }
    }
          admin.calculate_cost_customer(selectedTrip.getCost(), count_seat);
          totalcostTXT.setText(String.valueOf(current_customer.getTotal_cost()));
    }//GEN-LAST:event_j_bookedActionPerformed


    
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
            java.util.logging.Logger.getLogger(customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox A;
    private javax.swing.JCheckBox A_booked;
    private javax.swing.JCheckBox B;
    private javax.swing.JCheckBox B_booked;
    private javax.swing.JCheckBox C;
    private javax.swing.JPanel CAccInfo;
    private javax.swing.JLabel CAccInfoLabel;
    private javax.swing.JPanel CEditInfo;
    private javax.swing.JLabel CEditInfoLabel;
    private javax.swing.JLabel CHistoryLabel;
    private javax.swing.JPanel CRunning;
    private javax.swing.JLabel CRunningLabel;
    private javax.swing.JTextArea CRunningtxt;
    private javax.swing.JLabel CUpcomingLabel;
    private javax.swing.JLabel CVnoError;
    private javax.swing.JLabel CVnumLabel;
    private javax.swing.JLabel CVpassError;
    private javax.swing.JLabel CVpassLabel;
    private javax.swing.JCheckBox C_booked;
    private javax.swing.JTextArea CaccInfotxt;
    private javax.swing.JPanel CaccinfoHeader;
    private javax.swing.JLabel CaccinfoLabel;
    private javax.swing.JTable CdoneTable;
    private javax.swing.JLabel CeditEmail;
    private javax.swing.JTextField CeditEmailtxt;
    private javax.swing.JPanel CeditHeader;
    private javax.swing.JLabel CeditLabel;
    private javax.swing.JLabel CeditPassword;
    private javax.swing.JTextField CeditPasswordtxt;
    private javax.swing.JTextField CeditPhonetxt;
    private javax.swing.JLabel CeditUsername;
    private javax.swing.JTextField CeditUsernametxt;
    private javax.swing.JTextField CeditVnumtxt;
    private javax.swing.JTextField CeditVpasstxt;
    private javax.swing.JLabel CemailError;
    private javax.swing.JPanel ChistoryTable;
    private javax.swing.JLabel ClogOut;
    private javax.swing.JLabel CpassError;
    private javax.swing.JLabel CphoneError;
    private javax.swing.JPanel CrunningHeader;
    private javax.swing.JButton CsaveEditBtn;
    private javax.swing.JPanel CstartPanel;
    private javax.swing.JPanel Cupcoming;
    private javax.swing.JTable CupcomingTable;
    private javax.swing.JLabel CuserError;
    private javax.swing.JCheckBox D;
    private javax.swing.JCheckBox D_booked;
    private javax.swing.JCheckBox E;
    private javax.swing.JCheckBox E_booked;
    private javax.swing.JCheckBox F;
    private javax.swing.JCheckBox F_booked;
    private javax.swing.JCheckBox G;
    private javax.swing.JCheckBox G_booked;
    private javax.swing.JCheckBox H;
    private javax.swing.JCheckBox H_booked;
    private javax.swing.JCheckBox I;
    private javax.swing.JCheckBox I_booked;
    private javax.swing.JCheckBox J;
    private javax.swing.JCheckBox J_booked;
    private javax.swing.JCheckBox K;
    private javax.swing.JCheckBox K_booked;
    private javax.swing.JCheckBox L;
    private javax.swing.JCheckBox L_booked;
    private javax.swing.JCheckBox M;
    private javax.swing.JCheckBox M_booked;
    private javax.swing.JCheckBox N;
    private javax.swing.JCheckBox N_booked;
    private javax.swing.JCheckBox O;
    private javax.swing.JCheckBox O_booked;
    private javax.swing.JCheckBox P;
    private javax.swing.JCheckBox P_booked;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JCheckBox Q;
    private javax.swing.JCheckBox Q_booked;
    private javax.swing.JCheckBox R;
    private javax.swing.JButton RESERVE;
    private javax.swing.JCheckBox R_booked;
    private javax.swing.JCheckBox S;
    private javax.swing.JCheckBox S_booked;
    private javax.swing.JCheckBox T;
    private javax.swing.JCheckBox T_booked;
    private javax.swing.JCheckBox U;
    private javax.swing.JCheckBox U_booked;
    private javax.swing.JCheckBox V;
    private javax.swing.JCheckBox V_booked;
    private javax.swing.JCheckBox W;
    private javax.swing.JCheckBox W_booked;
    private javax.swing.JCheckBox X;
    private javax.swing.JCheckBox X_booked;
    private javax.swing.JCheckBox Y;
    private javax.swing.JCheckBox Y_booked;
    private javax.swing.JCheckBox Z;
    private javax.swing.JCheckBox Z_booked;
    private javax.swing.JCheckBox a;
    private javax.swing.JCheckBox a_booked;
    private javax.swing.JCheckBox b;
    private javax.swing.JCheckBox b_booked;
    private javax.swing.JPanel baseside;
    private javax.swing.JLabel bookLabel;
    private javax.swing.JPanel bookPanel;
    private javax.swing.JComboBox<String> bustype;
    private javax.swing.JCheckBox c;
    private javax.swing.JCheckBox c_booked;
    private javax.swing.JLabel chooseTripLbl;
    private javax.swing.JTextField currentlocation;
    private javax.swing.JCheckBox d;
    private javax.swing.JCheckBox d_booked;
    private javax.swing.JButton deleteBookBtn;
    private javax.swing.JLabel deleteBookLabel;
    private javax.swing.JPanel deleteBookPanel;
    private javax.swing.JCheckBox e;
    private javax.swing.JCheckBox e_booked;
    private javax.swing.JCheckBox f;
    private javax.swing.JCheckBox f_booked;
    private javax.swing.JLabel fromlbl;
    private javax.swing.JCheckBox g;
    private javax.swing.JCheckBox g_booked;
    private javax.swing.JCheckBox h;
    private javax.swing.JCheckBox h_booked;
    private javax.swing.JCheckBox i;
    private javax.swing.JCheckBox i_booked;
    private javax.swing.JCheckBox j;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JCheckBox j_booked;
    private javax.swing.JPanel maincustomerPanel;
    private javax.swing.JLabel noTripsLabel;
    private javax.swing.JLabel no_selected_seatcodelbl;
    private javax.swing.JTextField num_of_selectedseat;
    private javax.swing.JComboBox<String> pickupdate;
    private javax.swing.JComboBox<String> pickuptime;
    private javax.swing.JPanel seatselectionClassic;
    private javax.swing.JPanel seatselectionElite;
    private javax.swing.JComboBox<String> suitabletrips1;
    private javax.swing.JLabel totalcoselbl;
    private javax.swing.JTextField totalcostTXT;
    private javax.swing.JComboBox<String> upTripsComboBox;
    // End of variables declaration//GEN-END:variables
}
