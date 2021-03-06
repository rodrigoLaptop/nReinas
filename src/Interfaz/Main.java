/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Clases.Regla;
import java.util.LinkedList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rodrigo AB
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    //********************************VARIABLES********************************
    public int cant;
    public int[][] m;
    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    public int cont;

    public Main() {
        initComponents();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.setRowHeight(40);
        jTable1.setTableHeader(null);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setText("Tamaño");

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Resolver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel2.setText("El problema de las NReinas");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // GENERAR MATRIZ
        try {
            cant = Integer.parseInt(jTextField1.getText());
            m = new int[cant][cant];
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setColumnCount(m.length);
            model.setRowCount(m.length);
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m.length; j++) {
                    jTable1.setValueAt(null, i, j);
                }
                jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese solo números");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // RESOLVER
        try {
            cont = 0;
            m = new int[cant][cant];
            nReinas(m, 1);
            if (cont == 0) {
                JOptionPane.showMessageDialog(this, "No existe solución para este tamaño");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Debe generar primero la matriz");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    //***************************METODOS*************************************** 
    public void nReinas(int m[][], int paso) {
        if (paso > m.length) {
            mostrarMatriz(m);
            cont++;
            return;
        }
        LinkedList<Regla> L1 = reglasAplicables(m);
        while (!L1.isEmpty()) {
            Regla R = L1.removeFirst();
            m[R.fil][R.col] = paso;
            nReinas(m, paso + 1);
            m[R.fil][R.col] = 0;
            if (cont != 0) {
                return;
            }
        }
    }

    public LinkedList<Regla> reglasAplicables(int m[][]) {
        LinkedList<Regla> L1 = new LinkedList<>();
        int i = 0;
        while (i < m.length) {
            int j = 0;
            while (j < m[i].length) {
                if (posVal(m, i, j)) {
                    L1.add(new Regla(i, j));
                }
                j = j + 1;
            }
            i = i + 1;
        }
        return L1;
    }

    public boolean posVal(int m[][], int i, int j) {
        return filaVal(m, i) && colVal(m, j) && diagonalP(m, i, j)
                && diagonalS(m, i, j);
    }

    private boolean filaVal(int[][] m, int i) {
        int j = 0;
        while (j < m[i].length) {
            if (m[i][j] > 0) {
                return false;
            }
            j++;
        }
        return true;
    }

    private boolean diagonalP(int[][] m, int i, int j) {
        return diagIzqSup(m, i, j) && diagDerInf(m, i, j);
    }

    private boolean colVal(int[][] m, int j) {
        int i = 0;
        while (i < m[j].length) {
            if (m[i][j] > 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    private boolean diagonalS(int[][] m, int i, int j) {
        return diagIzqInf(m, i, j) && diagDerSup(m, i, j);
    }

    private boolean diagDerInf(int[][] m, int i1, int j1) {
        int i = i1, j = j1;
        while (i < m.length && j < m.length) {
            if (m[i][j] > 0) {
                return false;
            }
            i = i + 1;
            j = j + 1;
        }
        return true;
    }

    private boolean diagIzqSup(int[][] m, int i1, int j1) {
        int i = i1, j = j1;
        while (i >= 0 && j >= 0) {
            if (m[i][j] > 0) {
                return false;
            }
            i = i - 1;
            j = j - 1;
        }
        return true;
    }

    private boolean diagDerSup(int[][] m, int i1, int j1) {
        int i = i1, j = j1;
        while (i >= 0 && j < m.length) {
            if (m[i][j] > 0) {
                return false;
            }
            i = i - 1;
            j = j + 1;
        }
        return true;
    }

    private boolean diagIzqInf(int[][] m, int i1, int j1) {
        int i = i1, j = j1;
        while (j >= 0 && i < m.length) {
            if (m[i][j] > 0) {
                return false;
            }
            i = i + 1;
            j = j - 1;
        }
        return true;
    }

    private void mostrarMatriz(int[][] m) {
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] == 0) {
                    jTable1.setValueAt(null, i, j);
                }else{
                    jTable1.setValueAt(m[i][j], i, j);
                }
            }
            jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    //*************************************************************************

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
