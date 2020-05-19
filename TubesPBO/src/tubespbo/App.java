package tubespbo;

import AppPackage.AnimationClass;
import Koneksi.Db_Koneksi;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class App extends javax.swing.JFrame {

    AnimationClass animasi_slide = new AnimationClass();
    int mouseX;
    int mouseY;

    public App() {
        initComponents();
        sp1.setVisible(false);
        sp2.setVisible(false);

    }
    //ini ban.. untuk masukin ke databasenya
    String KodeMK, KodeKLS, Ruangan, NamaMataKuliah, Hari, time, sks;

    private DefaultTableModel model;

    public void getReminder() {
        model.getDataVector();
        model.fireTableDataChanged();

        this.setLocationRelativeTo(null);
        try {
            com.mysql.jdbc.Statement stat = (com.mysql.jdbc.Statement) Koneksi.getKoneksi().createStatement();
            String sql = "select * from jadwal";
            ResultSet res = stat.executeQuery(sql);
            while (res.next()) {
                Object[] obj = new Object[7];
                obj[0] = res.getString("KodeMataKuliah");
                obj[1] = res.getString("KodeKelas");
                obj[2] = res.getString("Ruangan");
                obj[3] = res.getString("NamaMataKuliah");
                obj[4] = res.getString("SKS");
                obj[5] = res.getString("Hari");
                obj[6] = res.getString("Waktu");

                model.addRow(obj);
            }
        } catch (SQLException err) {

        }
    }

    public void loadData() {
        KodeMK = input_kodemk.getText();
        KodeKLS = input_kodekelas.getText();
        NamaMataKuliah = input_namamk.getText();
        Hari = (String) input_hari.getSelectedItem();
        sks = (String) input_sks.getSelectedItem();
        Ruangan = input_ruangan.getText();
        time = input_waktu.getText();
    }
    
    public void editdata() {
        try {
            Statement stat = (Statement) Koneksi.getKoneksi().createStatement();
            String sql ="UPDATE jadwal SET KodeMataKuliah = '"+input_kodeMK1.getText()+"', KodeKelas = '"+input_kodekelas1.getText()+"', Ruangan = '"+input_ruangan1.getText()+"', NamaMataKuliah = '"+input_namamk1.getText()+
            "', SKS = '"+input_sks1.getSelectedItem()+"', Hari = '"+input_hari1.getSelectedItem()+"', Waktu = '"+input_waktu1.getText()+"' WHERE KodeMataKuliah = '"+input_kodeMK1.getText()+"'";
            
            Connection conn = (Connection) Koneksi.getKoneksi();
            PreparedStatement pst = conn.prepareStatement(sql);
            
            JOptionPane.showMessageDialog(null, "Edit Berhasil!");
            pst.executeUpdate();

        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, " Ulangi inputan!", "Terjadi Kesalahan pada inputan!", 2);
        }
    }

    public void savedata() {
        loadData();
        try {
            Statement stat = (Statement) Koneksi.getKoneksi().createStatement();
            String sql = "Insert into Jadwal (KodeMataKuliah,KodeKelas,Ruangan,NamaMataKuliah,SKS,Hari,Waktu)"
                    + "values ('" + KodeMK + "','" + KodeKLS + "','" + Ruangan + "','" + NamaMataKuliah + "','" + sks + "','" + Hari + "','" + time + "')";
            Connection conn = (Connection) Koneksi.getKoneksi();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Input Berhasil!");

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, " Ulangi inputan!", "Terjadi Kesalahan pada inputan!", 2);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_dasar = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        maximize = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menu = new javax.swing.JScrollPane();
        panel_menu = new javax.swing.JPanel();
        lb_navbar = new javax.swing.JLabel();
        panel_create = new javax.swing.JPanel();
        lb_create = new javax.swing.JLabel();
        sp1 = new javax.swing.JSeparator();
        show_jadwal = new javax.swing.JPanel();
        lb_jadwal = new javax.swing.JLabel();
        sp2 = new javax.swing.JSeparator();
        wallpaper_first = new javax.swing.JLabel();
        CardLayout = new javax.swing.JPanel();
        laman_firstscreen = new javax.swing.JPanel();
        background = new javax.swing.JLabel();
        laman_create = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lbnama_mk = new javax.swing.JLabel();
        lbkode_matkul = new javax.swing.JLabel();
        lbkode_kelas = new javax.swing.JLabel();
        lb_sks = new javax.swing.JLabel();
        lb_hari = new javax.swing.JLabel();
        lb_waktu = new javax.swing.JLabel();
        lbruangan = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        input_kodemk = new javax.swing.JTextField();
        input_kodekelas = new javax.swing.JTextField();
        input_ruangan = new javax.swing.JTextField();
        input_namamk = new javax.swing.JTextField();
        input_waktu = new javax.swing.JTextField();
        input_hari = new javax.swing.JComboBox<>();
        jSeparator12 = new javax.swing.JSeparator();
        input_sks = new javax.swing.JComboBox<>();
        cancel = new javax.swing.JButton();
        save = new javax.swing.JButton();
        background_create = new javax.swing.JLabel();
        laman_jadwal = new javax.swing.JPanel();
        scrool_jadwal = new javax.swing.JScrollPane();
        jadwal = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        lbkode_matkul2 = new javax.swing.JLabel();
        lbnama_mk1 = new javax.swing.JLabel();
        lbkode_kelas1 = new javax.swing.JLabel();
        lb_sks1 = new javax.swing.JLabel();
        lb_hari1 = new javax.swing.JLabel();
        lb_waktu1 = new javax.swing.JLabel();
        lbruangan1 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        input_kodeMK1 = new javax.swing.JTextField();
        input_kodekelas1 = new javax.swing.JTextField();
        input_ruangan1 = new javax.swing.JTextField();
        input_namamk1 = new javax.swing.JTextField();
        input_waktu1 = new javax.swing.JTextField();
        input_hari1 = new javax.swing.JComboBox<>();
        jSeparator22 = new javax.swing.JSeparator();
        input_sks1 = new javax.swing.JComboBox<>();
        cancel1 = new javax.swing.JButton();
        save1 = new javax.swing.JButton();
        background_jadwal = new javax.swing.JLabel();
        wallpaper_create = new javax.swing.JLabel();
        wallpaper_jadwal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_dasar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_dasarMouseDragged(evt);
            }
        });
        panel_dasar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_dasarMousePressed(evt);
            }
        });
        panel_dasar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/red.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        panel_dasar.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, -1, -1));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/orange.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        panel_dasar.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 7, -1, -1));

        maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/green.png"))); // NOI18N
        maximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximizeMouseClicked(evt);
            }
        });
        panel_dasar.add(maximize, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 7, -1, -1));

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 3, 36)); // NOI18N
        jLabel2.setText("welcome to class reminder");
        panel_dasar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 510, 210));

        menu.setBorder(null);

        panel_menu.setBackground(new java.awt.Color(243, 244, 246));
        panel_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_navbar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_navbar.setText("___");
        lb_navbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_navbarMouseEntered(evt);
            }
        });
        panel_menu.add(lb_navbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 159, -1, -1));

        panel_create.setBackground(new java.awt.Color(243, 244, 246));
        panel_create.setOpaque(false);
        panel_create.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_create.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lb_create.setText("Create");
        lb_create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_createMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_createMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_createMouseExited(evt);
            }
        });
        panel_create.add(lb_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 1, -1, -1));
        panel_create.add(sp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 24, 42, 10));

        panel_menu.add(panel_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 27));

        show_jadwal.setBackground(new java.awt.Color(243, 244, 246));
        show_jadwal.setOpaque(false);
        show_jadwal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_jadwal.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lb_jadwal.setText("schedules");
        lb_jadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_jadwalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_jadwalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_jadwalMouseExited(evt);
            }
        });
        show_jadwal.add(lb_jadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 1, -1, -1));
        show_jadwal.add(sp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 24, 68, -1));

        panel_menu.add(show_jadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, 27));

        menu.setViewportView(panel_menu);

        panel_dasar.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, -160, 250, 180));

        wallpaper_first.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/backgorund.png"))); // NOI18N
        wallpaper_first.setText("jLabel1");
        wallpaper_first.setMaximumSize(new java.awt.Dimension(6038, 4000));
        wallpaper_first.setMinimumSize(new java.awt.Dimension(6038, 4000));
        wallpaper_first.setPreferredSize(new java.awt.Dimension(6038, 4000));
        panel_dasar.add(wallpaper_first, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, 1370, 780));

        CardLayout.setLayout(new java.awt.CardLayout());

        laman_firstscreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setText("jLabel1");
        background.setMaximumSize(new java.awt.Dimension(6038, 4000));
        background.setMinimumSize(new java.awt.Dimension(6038, 4000));
        background.setPreferredSize(new java.awt.Dimension(6038, 4000));
        laman_firstscreen.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 700));

        CardLayout.add(laman_firstscreen, "card2");

        laman_create.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Membuat Jadwal");
        laman_create.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, -1, -1));
        laman_create.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 70, 52, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        laman_create.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 25, 20, 46));
        laman_create.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 52, 10));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        laman_create.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 20, 46));

        lbnama_mk.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lbnama_mk.setForeground(new java.awt.Color(255, 255, 255));
        lbnama_mk.setText("Nama Matakuliah :");
        laman_create.add(lbnama_mk, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 370, -1, -1));

        lbkode_matkul.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lbkode_matkul.setForeground(new java.awt.Color(255, 255, 255));
        lbkode_matkul.setText("Kode Matakuliah   :");
        laman_create.add(lbkode_matkul, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, -1, -1));

        lbkode_kelas.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lbkode_kelas.setForeground(new java.awt.Color(255, 255, 255));
        lbkode_kelas.setText("Kode Kelas           :");
        laman_create.add(lbkode_kelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, -1, -1));

        lb_sks.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lb_sks.setForeground(new java.awt.Color(255, 255, 255));
        lb_sks.setText("SKS                     :");
        laman_create.add(lb_sks, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 440, -1, -1));

        lb_hari.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lb_hari.setForeground(new java.awt.Color(255, 255, 255));
        lb_hari.setText("Hari                      :");
        laman_create.add(lb_hari, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 500, -1, -1));

        lb_waktu.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lb_waktu.setForeground(new java.awt.Color(255, 255, 255));
        lb_waktu.setText("Waktu                  :");
        laman_create.add(lb_waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 570, -1, -1));

        lbruangan.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lbruangan.setForeground(new java.awt.Color(255, 255, 255));
        lbruangan.setText("Ruangan              :");
        laman_create.add(lbruangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 300, -1, -1));
        laman_create.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 330, 190, 20));
        laman_create.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 190, 190, 20));
        laman_create.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 473, 40, 20));
        laman_create.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 533, 190, 20));
        laman_create.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 600, 190, 20));
        laman_create.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 260, 190, 20));

        input_kodemk.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_kodemk.setForeground(new java.awt.Color(255, 255, 255));
        input_kodemk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_kodemk.setBorder(null);
        laman_create.add(input_kodemk, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 160, 190, -1));

        input_kodekelas.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_kodekelas.setForeground(new java.awt.Color(255, 255, 255));
        input_kodekelas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_kodekelas.setText("R");
        input_kodekelas.setBorder(null);
        input_kodekelas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_kodekelasKeyPressed(evt);
            }
        });
        laman_create.add(input_kodekelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 230, 190, -1));

        input_ruangan.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_ruangan.setForeground(new java.awt.Color(255, 255, 255));
        input_ruangan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_ruangan.setBorder(null);
        laman_create.add(input_ruangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 300, 190, -1));

        input_namamk.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_namamk.setForeground(new java.awt.Color(255, 255, 255));
        input_namamk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_namamk.setBorder(null);
        laman_create.add(input_namamk, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 370, 190, -1));

        input_waktu.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_waktu.setForeground(new java.awt.Color(255, 255, 255));
        input_waktu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_waktu.setText("00:00:00");
        input_waktu.setBorder(null);
        input_waktu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_waktuKeyPressed(evt);
            }
        });
        laman_create.add(input_waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 570, 190, -1));

        input_hari.setBackground(new java.awt.Color(240, 240, 240));
        input_hari.setForeground(new java.awt.Color(240, 240, 240));
        input_hari.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Hari :", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu" }));
        input_hari.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        laman_create.add(input_hari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 500, 190, 30));
        laman_create.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 400, 190, 30));

        input_sks.setBackground(new java.awt.Color(240, 240, 240));
        input_sks.setForeground(new java.awt.Color(240, 240, 240));
        input_sks.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        input_sks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        laman_create.add(input_sks, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 440, 40, 30));

        cancel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("CANCEL");
        cancel.setBorder(null);
        laman_create.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 640, 90, 30));

        save.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("SAVE");
        save.setBorder(null);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        laman_create.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(1173, 640, 80, 30));

        background_create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bg_create1.png"))); // NOI18N
        background_create.setText("jLabel1");
        background_create.setMaximumSize(new java.awt.Dimension(6038, 4000));
        background_create.setMinimumSize(new java.awt.Dimension(6038, 4000));
        background_create.setPreferredSize(new java.awt.Dimension(6038, 4000));
        laman_create.add(background_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, -31, 1370, 770));

        CardLayout.add(laman_create, "card3");

        laman_jadwal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrool_jadwal.setBackground(new java.awt.Color(0, 0, 0));
        scrool_jadwal.setBorder(null);
        scrool_jadwal.setOpaque(false);

        jadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jadwal.setOpaque(false);
        jadwal.setSelectionForeground(new java.awt.Color(255, 153, 0));
        jadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jadwalMouseClicked(evt);
            }
        });
        scrool_jadwal.setViewportView(jadwal);

        laman_jadwal.add(scrool_jadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 640, 530));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edit Jadwal");
        laman_jadwal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 50, -1, -1));
        laman_jadwal.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 100, 52, 10));

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        laman_jadwal.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 52, 20, 46));
        laman_jadwal.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, 52, 10));

        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);
        laman_jadwal.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, 20, 46));

        lbkode_matkul2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lbkode_matkul2.setText("Kode Matakuliah   :");
        laman_jadwal.add(lbkode_matkul2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, -1, -1));

        lbnama_mk1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lbnama_mk1.setForeground(new java.awt.Color(255, 255, 255));
        lbnama_mk1.setText("Nama Matakuliah :");
        laman_jadwal.add(lbnama_mk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 400, -1, -1));

        lbkode_kelas1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lbkode_kelas1.setForeground(new java.awt.Color(255, 255, 255));
        lbkode_kelas1.setText("Kode Kelas           :");
        laman_jadwal.add(lbkode_kelas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, -1, -1));

        lb_sks1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lb_sks1.setForeground(new java.awt.Color(255, 255, 255));
        lb_sks1.setText("SKS                     :");
        laman_jadwal.add(lb_sks1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 470, -1, -1));

        lb_hari1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lb_hari1.setForeground(new java.awt.Color(255, 255, 255));
        lb_hari1.setText("Hari                      :");
        laman_jadwal.add(lb_hari1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 530, -1, -1));

        lb_waktu1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lb_waktu1.setForeground(new java.awt.Color(255, 255, 255));
        lb_waktu1.setText("Waktu                  :");
        laman_jadwal.add(lb_waktu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 600, -1, -1));

        lbruangan1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lbruangan1.setForeground(new java.awt.Color(255, 255, 255));
        lbruangan1.setText("Ruangan              :");
        laman_jadwal.add(lbruangan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 330, -1, -1));
        laman_jadwal.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 360, 190, 20));
        laman_jadwal.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 220, 190, 20));
        laman_jadwal.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 500, 40, 20));
        laman_jadwal.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 560, 190, 20));
        laman_jadwal.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 630, 190, 20));
        laman_jadwal.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 290, 190, 20));

        input_kodeMK1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_kodeMK1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_kodeMK1.setBorder(null);
        input_kodeMK1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_kodeMK1KeyPressed(evt);
            }
        });
        laman_jadwal.add(input_kodeMK1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 190, 190, -1));

        input_kodekelas1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_kodekelas1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_kodekelas1.setText("R");
        input_kodekelas1.setBorder(null);
        input_kodekelas1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_kodekelas1KeyPressed(evt);
            }
        });
        laman_jadwal.add(input_kodekelas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 260, 190, -1));

        input_ruangan1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_ruangan1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_ruangan1.setBorder(null);
        laman_jadwal.add(input_ruangan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 330, 190, -1));

        input_namamk1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_namamk1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_namamk1.setBorder(null);
        laman_jadwal.add(input_namamk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 400, 190, -1));

        input_waktu1.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        input_waktu1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input_waktu1.setText("00:00:00");
        input_waktu1.setBorder(null);
        input_waktu1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                input_waktu1KeyPressed(evt);
            }
        });
        laman_jadwal.add(input_waktu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 600, 190, -1));

        input_hari1.setBackground(new java.awt.Color(240, 240, 240));
        input_hari1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Hari :", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu" }));
        input_hari1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        laman_jadwal.add(input_hari1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 530, 190, 30));
        laman_jadwal.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 430, 190, 30));

        input_sks1.setBackground(new java.awt.Color(240, 240, 240));
        input_sks1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        input_sks1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        input_sks1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_sks1ActionPerformed(evt);
            }
        });
        laman_jadwal.add(input_sks1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 470, 40, 30));

        cancel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cancel1.setForeground(new java.awt.Color(255, 255, 255));
        cancel1.setText("CANCEL");
        cancel1.setBorder(null);
        laman_jadwal.add(cancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 650, 90, 30));

        save1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        save1.setForeground(new java.awt.Color(255, 255, 255));
        save1.setText("SAVE");
        save1.setBorder(null);
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        laman_jadwal.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 650, 80, 30));

        background_jadwal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bg_jadwal.png"))); // NOI18N
        background_jadwal.setText("jLabel1");
        background_jadwal.setMaximumSize(new java.awt.Dimension(6038, 4000));
        background_jadwal.setMinimumSize(new java.awt.Dimension(6038, 4000));
        background_jadwal.setPreferredSize(new java.awt.Dimension(6038, 4000));
        laman_jadwal.add(background_jadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, -31, 1370, 770));

        CardLayout.add(laman_jadwal, "card4");

        panel_dasar.add(CardLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 27, 1370, 740));

        wallpaper_create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bg_create1.png"))); // NOI18N
        wallpaper_create.setText("jLabel1");
        wallpaper_create.setMaximumSize(new java.awt.Dimension(6038, 4000));
        wallpaper_create.setMinimumSize(new java.awt.Dimension(6038, 4000));
        wallpaper_create.setPreferredSize(new java.awt.Dimension(6038, 4000));
        panel_dasar.add(wallpaper_create, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, 1370, 780));

        wallpaper_jadwal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bg_jadwal.png"))); // NOI18N
        wallpaper_jadwal.setText("jLabel1");
        wallpaper_jadwal.setMaximumSize(new java.awt.Dimension(6038, 4000));
        wallpaper_jadwal.setMinimumSize(new java.awt.Dimension(6038, 4000));
        wallpaper_jadwal.setPreferredSize(new java.awt.Dimension(6038, 4000));
        panel_dasar.add(wallpaper_jadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, 1370, 780));

        getContentPane().add(panel_dasar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        setSize(new java.awt.Dimension(1355, 737));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void maximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_maximizeMouseClicked

    private void lb_navbarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_navbarMouseEntered
        animasi_slide.jTextAreaYUp(-160, -120, 30, 3, menu);
        animasi_slide.jTextAreaYUp(-120, -160, 15, 10, menu);
    }//GEN-LAST:event_lb_navbarMouseEntered

    private void lb_createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_createMouseClicked
        animasi_slide.jTextAreaYUp(-120, -160, 15, 10, menu);
        wallpaper_first.setVisible(false);
        sp1.setVisible(true);
        sp2.setVisible(false);
        jLabel2.setVisible(false);

        laman_firstscreen.setVisible(false);
        laman_jadwal.setVisible(false);
        wallpaper_jadwal.setVisible(false);
        wallpaper_create.setVisible(true);
        background_create.setVisible(true);
        laman_create.setVisible(true);
        panel_menu.setBackground(new Color(0, 0, 0, 125));
        panel_create.setBackground(new Color(0, 0, 0, 125));
        show_jadwal.setBackground(new Color(0, 0, 0, 125));
        lb_jadwal.setForeground(Color.white);
        lb_create.setForeground(Color.white);
        lb_navbar.setForeground(Color.white);

        input_kodemk.setBackground(new Color(0, 0, 0, 5));
        input_kodekelas.setBackground(new Color(0, 0, 0, 5));
        input_namamk.setBackground(new Color(0, 0, 0, 5));
        input_hari.setBackground(new Color(0, 0, 0, 0));
        input_sks.setBackground(new Color(0, 0, 0, 0));
        input_ruangan.setBackground(new Color(0, 0, 0, 5));
        input_waktu.setBackground(new Color(0, 0, 0, 5));
        save.setBackground(new Color(0, 0, 0, 1));
        cancel.setBackground(new Color(0, 0, 0, 1));
    }//GEN-LAST:event_lb_createMouseClicked

    private void lb_createMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_createMouseEntered
        sp1.setVisible(true);
    }//GEN-LAST:event_lb_createMouseEntered

    private void lb_createMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_createMouseExited
        sp1.setVisible(false);
    }//GEN-LAST:event_lb_createMouseExited

    private void lb_jadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_jadwalMouseClicked
        animasi_slide.jTextAreaYUp(-120, -160, 15, 10, menu);
        sp1.setVisible(false);
        sp2.setVisible(true);
        jLabel2.setVisible(false);

        laman_firstscreen.setVisible(false);
        laman_create.setVisible(false);
        laman_jadwal.setVisible(true);
        wallpaper_first.setVisible(false);
        wallpaper_create.setVisible(false);
        background_create.setVisible(false);
        wallpaper_jadwal.setVisible(true);

        panel_menu.setBackground(new Color(0, 0, 0, 125));
        panel_create.setBackground(new Color(0, 0, 0, 125));
        show_jadwal.setBackground(new Color(0, 0, 0, 125));
        lb_jadwal.setForeground(Color.white);
        lb_create.setForeground(Color.white);
        lb_navbar.setForeground(Color.white);
        save1.setBackground(new Color(0, 0, 0, 1));
        cancel1.setBackground(new Color(0, 0, 0, 1));
        scrool_jadwal.getViewport().setOpaque(false);
        jadwal.setShowGrid(false);
        
        ((DefaultTableCellRenderer) jadwal.getDefaultRenderer(Object.class)).setOpaque(false);
        this.setLocationRelativeTo(null);
        model = new DefaultTableModel();
        jadwal.setModel(model);
        model.addColumn("Kode Mata Kuliah");
        model.addColumn("Kode Kelas");
        model.addColumn("Ruangan");
        model.addColumn("Nama Mata Kuliah");
        model.addColumn("SKS");
        model.addColumn("Hari");
        model.addColumn("Waktu");

        getReminder();
    }//GEN-LAST:event_lb_jadwalMouseClicked

    private void lb_jadwalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_jadwalMouseEntered
        sp2.setVisible(true);
    }//GEN-LAST:event_lb_jadwalMouseEntered

    private void lb_jadwalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_jadwalMouseExited
        sp2.setVisible(false);
    }//GEN-LAST:event_lb_jadwalMouseExited

    private void panel_dasarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dasarMouseDragged
        int kordinatX = evt.getXOnScreen();
        int kordinatY = evt.getYOnScreen();
        this.setLocation(kordinatX - mouseX, kordinatY - mouseY);
    }//GEN-LAST:event_panel_dasarMouseDragged

    private void panel_dasarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dasarMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_panel_dasarMousePressed

    private void input_waktuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_waktuKeyPressed
        char c = evt.getKeyChar();
        //Untuk memasukkan jenis input Angka
        if (Character.isLetter(c)) {
            input_waktu.setEditable(false);

        } else {
            input_waktu.setEditable(true);
        }
    }//GEN-LAST:event_input_waktuKeyPressed

    private void input_kodekelasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_kodekelasKeyPressed
        char c = evt.getKeyChar();
        //Untuk memasukkan jenis Text
        if (Character.isLetter(c)) {
            input_kodekelas.setEditable(true);

        } else {
            input_kodekelas.setEditable(false);
        }
    }//GEN-LAST:event_input_kodekelasKeyPressed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        savedata();
    }//GEN-LAST:event_saveActionPerformed

    private void input_kodekelas1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_kodekelas1KeyPressed
        char c = evt.getKeyChar();
        //Untuk memasukkan jenis Text
        if (Character.isLetter(c)) {
            input_kodekelas1.setEditable(true);

        } else {
            input_kodekelas1.setEditable(false);
        }
    }//GEN-LAST:event_input_kodekelas1KeyPressed

    private void input_waktu1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_waktu1KeyPressed
        char c = evt.getKeyChar();
        //Untuk memasukkan jenis input Angka
        if (Character.isLetter(c)) {
            input_waktu1.setEditable(false);

        } else {
            input_waktu1.setEditable(true);
        }
    }//GEN-LAST:event_input_waktu1KeyPressed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        //edit data
        editdata();
    }//GEN-LAST:event_save1ActionPerformed

    private void input_kodeMK1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_input_kodeMK1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_kodeMK1KeyPressed

    private void jadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jadwalMouseClicked
        int baris = jadwal.rowAtPoint(evt.getPoint());
        String KodeMataKuliah = jadwal.getValueAt(baris, 0).toString();
        input_kodeMK1.setText(KodeMataKuliah);//Ruangan
        String KodeKelas = jadwal.getValueAt(baris, 1).toString();
        input_kodekelas1.setText(KodeKelas);
        String ruangan= jadwal.getValueAt(baris, 2).toString();
        input_ruangan1.setText(ruangan);
        String NamaMataKuliah = jadwal.getValueAt(baris, 3).toString();
        input_namamk1.setText(NamaMataKuliah);
        String SKS = jadwal.getValueAt(baris, 4).toString();
        input_sks1.setSelectedItem(SKS);
        String Hari = jadwal.getValueAt(baris, 5).toString();
        input_hari1.setSelectedItem(Hari);
        String Waktu = jadwal.getValueAt(baris, 6).toString();
        input_waktu1.setText(Waktu);

    }//GEN-LAST:event_jadwalMouseClicked

    private void input_sks1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_sks1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_sks1ActionPerformed

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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
                App App = new App();

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardLayout;
    private javax.swing.JLabel background;
    private javax.swing.JLabel background_create;
    private javax.swing.JLabel background_jadwal;
    private javax.swing.JButton cancel;
    private javax.swing.JButton cancel1;
    private javax.swing.JLabel exit;
    private javax.swing.JComboBox<String> input_hari;
    private javax.swing.JComboBox<String> input_hari1;
    private javax.swing.JTextField input_kodeMK1;
    private javax.swing.JTextField input_kodekelas;
    private javax.swing.JTextField input_kodekelas1;
    private javax.swing.JTextField input_kodemk;
    private javax.swing.JTextField input_namamk;
    private javax.swing.JTextField input_namamk1;
    private javax.swing.JTextField input_ruangan;
    private javax.swing.JTextField input_ruangan1;
    private javax.swing.JComboBox<String> input_sks;
    private javax.swing.JComboBox<String> input_sks1;
    private javax.swing.JTextField input_waktu;
    private javax.swing.JTextField input_waktu1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jadwal;
    private javax.swing.JPanel laman_create;
    private javax.swing.JPanel laman_firstscreen;
    private javax.swing.JPanel laman_jadwal;
    private javax.swing.JLabel lb_create;
    private javax.swing.JLabel lb_hari;
    private javax.swing.JLabel lb_hari1;
    private javax.swing.JLabel lb_jadwal;
    private javax.swing.JLabel lb_navbar;
    private javax.swing.JLabel lb_sks;
    private javax.swing.JLabel lb_sks1;
    private javax.swing.JLabel lb_waktu;
    private javax.swing.JLabel lb_waktu1;
    private javax.swing.JLabel lbkode_kelas;
    private javax.swing.JLabel lbkode_kelas1;
    private javax.swing.JLabel lbkode_matkul;
    private javax.swing.JLabel lbkode_matkul2;
    private javax.swing.JLabel lbnama_mk;
    private javax.swing.JLabel lbnama_mk1;
    private javax.swing.JLabel lbruangan;
    private javax.swing.JLabel lbruangan1;
    private javax.swing.JLabel maximize;
    private javax.swing.JScrollPane menu;
    private javax.swing.JLabel minimize;
    private javax.swing.JPanel panel_create;
    private javax.swing.JPanel panel_dasar;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    private javax.swing.JScrollPane scrool_jadwal;
    private javax.swing.JPanel show_jadwal;
    private javax.swing.JSeparator sp1;
    private javax.swing.JSeparator sp2;
    private javax.swing.JLabel wallpaper_create;
    private javax.swing.JLabel wallpaper_first;
    private javax.swing.JLabel wallpaper_jadwal;
    // End of variables declaration//GEN-END:variables
}
