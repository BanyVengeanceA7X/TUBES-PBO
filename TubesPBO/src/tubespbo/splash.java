package tubespbo;

public class splash extends javax.swing.JFrame {

    public splash() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        pg_bar = new javax.swing.JProgressBar();
        loadingnumber = new javax.swing.JLabel();
        wecome = new javax.swing.JLabel();
        bckground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 40, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 40, 10));

        pg_bar.setForeground(new java.awt.Color(255, 153, 51));
        getContentPane().add(pg_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 340, 10));

        loadingnumber.setForeground(new java.awt.Color(204, 204, 204));
        loadingnumber.setText("99");
        getContentPane().add(loadingnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        wecome.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        wecome.setForeground(new java.awt.Color(204, 204, 204));
        wecome.setText("WELCOME");
        getContentPane().add(wecome, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, 30));

        bckground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Splash1.png"))); // NOI18N
        bckground.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        bckground.setMinimumSize(new java.awt.Dimension(540, 350));
        bckground.setOpaque(true);
        getContentPane().add(bckground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        splash Sp = new splash();
        App app = new App();
        Sp.setVisible(true);
        try{
            int i;
            for(i=0; i<=100; i++){
                Thread.sleep(70);
                Sp.loadingnumber.setText(Integer.toString(i)+ "%");
                Sp.pg_bar.setValue(i);
            }
            Sp.setVisible(false);
            app.setVisible(true);
        }catch(Exception E){
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bckground;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel loadingnumber;
    private javax.swing.JProgressBar pg_bar;
    private javax.swing.JLabel wecome;
    // End of variables declaration//GEN-END:variables
}
