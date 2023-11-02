/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package poo;

/**
 *
 * @author zoebe
 */
public class VtPr extends javax.swing.JFrame
{
     public static Productos p[]=null;

    /**
     * Creates new form VtPr
     */
    public VtPr()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        Pereceberos = new javax.swing.JToolBar();
        bbPPA = new javax.swing.JToggleButton();
        bbPPA1 = new javax.swing.JToggleButton();
        bbPPA2 = new javax.swing.JToggleButton();
        bbPPA3 = new javax.swing.JToggleButton();
        mnu = new javax.swing.JMenuBar();
        mnuP = new javax.swing.JMenu();
        mnuPP = new javax.swing.JMenu();
        mnuPPA = new javax.swing.JMenuItem();
        mnuPPB = new javax.swing.JMenuItem();
        mnuPPC = new javax.swing.JMenuItem();
        mnuPPM = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuNP = new javax.swing.JMenu();
        mnuPNPA = new javax.swing.JMenuItem();
        mnuPNPB = new javax.swing.JMenuItem();
        mnuPNPC = new javax.swing.JMenuItem();
        mnuPNPM = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnuH = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manejo de productos");
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });

        Pereceberos.setRollover(true);

        bbPPA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/imagenes/boli.jpeg"))); // NOI18N
        bbPPA.setToolTipText("Altas de Productos Pereceberos");
        bbPPA.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bbPPAActionPerformed(evt);
            }
        });

        bbPPA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/imagenes/lupa.jpeg"))); // NOI18N
        bbPPA1.setToolTipText("Consulta de Productos Pereceberos");
        bbPPA1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bbPPA1ActionPerformed(evt);
            }
        });

        bbPPA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/imagenes/goma.jpeg"))); // NOI18N
        bbPPA2.setToolTipText("Bajas de Productos Pereceberos");

        bbPPA3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/poo/imagenes/disquet.jpeg"))); // NOI18N
        bbPPA3.setToolTipText("Modificaciones de Productos Pereceberos");
        bbPPA3.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                bbPPA3ActionPerformed(evt);
            }
        });

        mnuP.setText("Productos");

        mnuPP.setText("Perecederos");

        mnuPPA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuPPA.setText("Altas");
        mnuPPA.setToolTipText("Altas Productos Perecederos");
        mnuPPA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuPPA.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuPPAActionPerformed(evt);
            }
        });
        mnuPP.add(mnuPPA);

        mnuPPB.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuPPB.setText("Bajas");
        mnuPPB.setToolTipText("Bajas Productos Perecederos");
        mnuPPB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuPPB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuPPBActionPerformed(evt);
            }
        });
        mnuPP.add(mnuPPB);

        mnuPPC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuPPC.setText("Consultas");
        mnuPPC.setToolTipText("Consultas Productos Perecederos");
        mnuPPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuPPC.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuPPCActionPerformed(evt);
            }
        });
        mnuPP.add(mnuPPC);

        mnuPPM.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuPPM.setText("Modificaciones");
        mnuPPM.setToolTipText("Modificaciones Productos Perecederos");
        mnuPPM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuPPM.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuPPMActionPerformed(evt);
            }
        });
        mnuPP.add(mnuPPM);

        mnuP.add(mnuPP);
        mnuP.add(jSeparator2);

        mnuNP.setText("No Perecederos");

        mnuPNPA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuPNPA.setText("Altas");
        mnuPNPA.setToolTipText("Altas Productos No Perecederos");
        mnuPNPA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuPNPA.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuPNPAActionPerformed(evt);
            }
        });
        mnuNP.add(mnuPNPA);

        mnuPNPB.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuPNPB.setText("Bajas");
        mnuPNPB.setToolTipText("Bajas Productos No Perecederos");
        mnuPNPB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuPNPB.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuPNPBActionPerformed(evt);
            }
        });
        mnuNP.add(mnuPNPB);

        mnuPNPC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuPNPC.setText("Consultas");
        mnuPNPC.setToolTipText("Consultas Productos No Perecederos");
        mnuPNPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuPNPC.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuPNPCActionPerformed(evt);
            }
        });
        mnuNP.add(mnuPNPC);

        mnuPNPM.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnuPNPM.setText("Modificaciones");
        mnuPNPM.setToolTipText("Modificaciones Productos No Perecederos");
        mnuPNPM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnuPNPM.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuPNPMActionPerformed(evt);
            }
        });
        mnuNP.add(mnuPNPM);

        mnuP.add(mnuNP);
        mnuP.add(jSeparator3);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setText("Consultas Generales");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuP.add(jMenuItem1);

        mnu.add(mnuP);

        mnuH.setText("Herramientas");

        jMenu3.setText("toolbar");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("pereceberos");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jCheckBoxMenuItem1);

        mnuH.add(jMenu3);

        mnu.add(mnuH);

        setJMenuBar(mnu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(bbPPA, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bbPPA2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bbPPA1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bbPPA3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pereceberos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(356, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Pereceberos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bbPPA3)
                    .addComponent(bbPPA1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bbPPA2)
                        .addComponent(bbPPA)))
                .addContainerGap(419, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuPPAActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuPPAActionPerformed
    {//GEN-HEADEREND:event_mnuPPAActionPerformed
        new VtPPA().setVisible(true);
    }//GEN-LAST:event_mnuPPAActionPerformed

    private void mnuPPBActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuPPBActionPerformed
    {//GEN-HEADEREND:event_mnuPPBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuPPBActionPerformed

    private void mnuPPCActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuPPCActionPerformed
    {//GEN-HEADEREND:event_mnuPPCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuPPCActionPerformed

    private void mnuPPMActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuPPMActionPerformed
    {//GEN-HEADEREND:event_mnuPPMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuPPMActionPerformed

    private void mnuPNPAActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuPNPAActionPerformed
    {//GEN-HEADEREND:event_mnuPNPAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuPNPAActionPerformed

    private void mnuPNPBActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuPNPBActionPerformed
    {//GEN-HEADEREND:event_mnuPNPBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuPNPBActionPerformed

    private void mnuPNPCActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuPNPCActionPerformed
    {//GEN-HEADEREND:event_mnuPNPCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuPNPCActionPerformed

    private void mnuPNPMActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuPNPMActionPerformed
    {//GEN-HEADEREND:event_mnuPNPMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuPNPMActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowClosing
    {//GEN-HEADEREND:event_formWindowClosing
        ManipulacionArchivos.guarda(this,p, "Productos.dat");
        ManipulacionArchivos.guarda(this,Productos.getFolio(), "folios.dat");
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        try
        {
            Productos.setFolio((Integer)ManipulacionArchivos.carga(this,"folios.dat"));
        } catch (Exception e)
        {
            Productos.setFolio(0);
        }
        p=(Productos[]) ManipulacionArchivos.cargaArr(this,"Productos.dat");
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenuItem1ActionPerformed
    {//GEN-HEADEREND:event_jMenuItem1ActionPerformed
        new VtCG().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void bbPPAActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bbPPAActionPerformed
    {//GEN-HEADEREND:event_bbPPAActionPerformed
        mnuPPAActionPerformed(evt);
    }//GEN-LAST:event_bbPPAActionPerformed

    private void bbPPA3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bbPPA3ActionPerformed
    {//GEN-HEADEREND:event_bbPPA3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bbPPA3ActionPerformed

    private void bbPPA1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_bbPPA1ActionPerformed
    {//GEN-HEADEREND:event_bbPPA1ActionPerformed
        mnuPPCActionPerformed(evt);
    }//GEN-LAST:event_bbPPA1ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
    {//GEN-HEADEREND:event_jCheckBoxMenuItem1ActionPerformed
        if (mnu.isSelected())
        {
            Pereceberos.setVisible(true);
            mnuPPC.setEnabled(true);
        }else
        {
            Pereceberos.setVisible(false);
            mnuPPC.setEnabled(false);
            
        }
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VtPr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtPr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtPr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtPr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtPr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar Pereceberos;
    private javax.swing.JToggleButton bbPPA;
    private javax.swing.JToggleButton bbPPA1;
    private javax.swing.JToggleButton bbPPA2;
    private javax.swing.JToggleButton bbPPA3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuBar mnu;
    private javax.swing.JMenu mnuH;
    private javax.swing.JMenu mnuNP;
    private javax.swing.JMenu mnuP;
    private javax.swing.JMenuItem mnuPNPA;
    private javax.swing.JMenuItem mnuPNPB;
    private javax.swing.JMenuItem mnuPNPC;
    private javax.swing.JMenuItem mnuPNPM;
    private javax.swing.JMenu mnuPP;
    private javax.swing.JMenuItem mnuPPA;
    private javax.swing.JMenuItem mnuPPB;
    private javax.swing.JMenuItem mnuPPC;
    private javax.swing.JMenuItem mnuPPM;
    // End of variables declaration//GEN-END:variables
}
