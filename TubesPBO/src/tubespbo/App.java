package tubespbo;

import AppPackage.AnimationClass;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableCellRenderer;

public class App extends javax.swing.JFrame {
    AnimationClass animasi_slide = new AnimationClass();
    int mouseX;
    int mouseY;
    
    public App() {
        initComponents();
        sp1.setVisible(false);
        sp2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_dasar = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        maximize = new javax.swing.JLabel();
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
        background_create = new javax.swing.JLabel();
        laman_jadwal = new javax.swing.JPanel();
        scrool_jadwal = new javax.swing.JScrollPane();
        jadwal = new javax.swing.JTable();
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
        scrool_jadwal.setViewportView(jadwal);

        laman_jadwal.add(scrool_jadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 640, 530));

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
        animasi_slide.jTextAreaYUp(-160, -120, 30, 3, menu );
        animasi_slide.jTextAreaYUp(-120, -160, 15, 10, menu);
    }//GEN-LAST:event_lb_navbarMouseEntered

    private void lb_createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_createMouseClicked
        animasi_slide.jTextAreaYUp(-120, -160, 15, 10, menu);
        wallpaper_first.setVisible(false);
        sp1.setVisible(true);
        sp2.setVisible(false);

        laman_firstscreen.setVisible(false);
        laman_jadwal.setVisible(false);
        wallpaper_jadwal.setVisible(false);
        wallpaper_create.setVisible(true);
        background_create.setVisible(true);
        laman_create.setVisible(true);
        panel_menu.setBackground(new Color(0,0,0,125));
        panel_create.setBackground(new Color(0,0,0,125));
        show_jadwal.setBackground(new Color(0,0,0,125));
        lb_jadwal.setForeground(Color.white);
        lb_create.setForeground(Color.white);
        lb_navbar.setForeground(Color.white);
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

        laman_firstscreen.setVisible(false);
        laman_create.setVisible(false);
        laman_jadwal.setVisible(true);
        wallpaper_first.setVisible(false);
        wallpaper_create.setVisible(false);
        background_create.setVisible(false);
        wallpaper_jadwal.setVisible(true);

        panel_menu.setBackground(new Color(0,0,0,125));
        panel_create.setBackground(new Color(0,0,0,125));
        show_jadwal.setBackground(new Color(0,0,0,125));
        lb_jadwal.setForeground(Color.white);
        lb_create.setForeground(Color.white);
        lb_navbar.setForeground(Color.white);
        scrool_jadwal.getViewport().setOpaque(false);
        jadwal.setShowGrid(false);
        ((DefaultTableCellRenderer)jadwal.getDefaultRenderer(Object.class)).setOpaque(false);
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
        this.setLocation(kordinatX-mouseX, kordinatY-mouseY);
    }//GEN-LAST:event_panel_dasarMouseDragged

    private void panel_dasarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dasarMousePressed
        mouseX= evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_panel_dasarMousePressed

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
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardLayout;
    private javax.swing.JLabel background;
    private javax.swing.JLabel background_create;
    private javax.swing.JLabel background_jadwal;
    private javax.swing.JLabel exit;
    private javax.swing.JTable jadwal;
    private javax.swing.JPanel laman_create;
    private javax.swing.JPanel laman_firstscreen;
    private javax.swing.JPanel laman_jadwal;
    private javax.swing.JLabel lb_create;
    private javax.swing.JLabel lb_jadwal;
    private javax.swing.JLabel lb_navbar;
    private javax.swing.JLabel maximize;
    private javax.swing.JScrollPane menu;
    private javax.swing.JLabel minimize;
    private javax.swing.JPanel panel_create;
    private javax.swing.JPanel panel_dasar;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JScrollPane scrool_jadwal;
    private javax.swing.JPanel show_jadwal;
    private javax.swing.JSeparator sp1;
    private javax.swing.JSeparator sp2;
    private javax.swing.JLabel wallpaper_create;
    private javax.swing.JLabel wallpaper_first;
    private javax.swing.JLabel wallpaper_jadwal;
    // End of variables declaration//GEN-END:variables
}
