import TurtleGraphics.*;
import BreezySwing.*;
import java.awt.Color;
import javax.swing.JOptionPane;
public class ShapeGUI extends javax.swing.JFrame {
StandardPen p;
AbstractShape s;
    public ShapeGUI() {
        initComponents();
        SketchPadWindow w = new SketchPadWindow(400,400);
        w.setLocation(50,275);
        p = new StandardPen(w);
        s = new Circle(0,0,0);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btncircle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnwheel = new javax.swing.JButton();
        btnRect = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtinfo = new javax.swing.JTextArea();
        btnmove = new javax.swing.JButton();
        btnresize = new javax.swing.JButton();
        btnquit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnTri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shape Maker 2.0");

        btncircle.setText("Circle");
        btncircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncircleActionPerformed(evt);
            }
        });

        jLabel1.setText("Select A Shape");

        btnwheel.setText("Wheel");
        btnwheel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwheelActionPerformed(evt);
            }
        });

        btnRect.setText("Rectangle");
        btnRect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRectActionPerformed(evt);
            }
        });

        txtinfo.setColumns(20);
        txtinfo.setRows(5);
        jScrollPane1.setViewportView(txtinfo);

        btnmove.setText("Move");
        btnmove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoveActionPerformed(evt);
            }
        });

        btnresize.setText("Resize");
        btnresize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresizeActionPerformed(evt);
            }
        });

        btnquit.setText("Quit");
        btnquit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitActionPerformed(evt);
            }
        });

        jLabel2.setText("Shape Data");

        jLabel3.setText("Options");

        btnTri.setText("Triangle");
        btnTri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnresize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnquit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btncircle, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnwheel)
                                        .addGap(19, 19, 19)
                                        .addComponent(btnRect)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnTri)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncircle)
                    .addComponent(btnwheel)
                    .addComponent(btnRect)
                    .addComponent(btnTri))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnmove)
                        .addGap(18, 18, 18)
                        .addComponent(btnresize)
                        .addGap(18, 18, 18)
                        .addComponent(btnquit)
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void erase(){
        p.setColor(Color.white);
        s.draw(p);
        p.setColor(Color.blue);
    }
    private void btncircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncircleActionPerformed
        erase();
        s=new Circle(0,0,50);
        s.draw(p);
        txtinfo.setText(s.toString());
    }//GEN-LAST:event_btncircleActionPerformed

    private void btnTriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriActionPerformed
            erase();
        s=new Triangle();
        s.draw(p);
        txtinfo.setText(s.toString());
    }//GEN-LAST:event_btnTriActionPerformed

    private void btnmoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoveActionPerformed
    double x = Double.parseDouble(JOptionPane.showInputDialog(this,"Enter new x", "0"));
    double y = Double.parseDouble(JOptionPane.showInputDialog(this,"Enter new y", "0"));
    erase();
    s.move(x,y);
    s.draw(p);
    txtinfo.setText(s.toString());
    }//GEN-LAST:event_btnmoveActionPerformed

    private void btnwheelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwheelActionPerformed
        erase();
        s=new Wheel(0,0,50,6);
        s.draw(p);
        txtinfo.setText(s.toString());
    }//GEN-LAST:event_btnwheelActionPerformed

    private void btnRectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRectActionPerformed
        erase();
        s=new Rect(0,0,150,100);
        s.draw(p);
        txtinfo.setText(s.toString());
    }//GEN-LAST:event_btnRectActionPerformed

    private void btnresizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresizeActionPerformed
     double f = Double.parseDouble(JOptionPane.showInputDialog(this,"Enter new factor to stretch by","0"));
     erase();
     s.stretchBy(f);
     s.draw(p);
     txtinfo.setText(s.toString());
    }//GEN-LAST:event_btnresizeActionPerformed

    private void btnquitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitActionPerformed
     System.exit(0);   // TODO add your handling code here:
    }//GEN-LAST:event_btnquitActionPerformed

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
            java.util.logging.Logger.getLogger(ShapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShapeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShapeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRect;
    private javax.swing.JButton btnTri;
    private javax.swing.JButton btncircle;
    private javax.swing.JButton btnmove;
    private javax.swing.JButton btnquit;
    private javax.swing.JButton btnresize;
    private javax.swing.JButton btnwheel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtinfo;
    // End of variables declaration//GEN-END:variables
}
