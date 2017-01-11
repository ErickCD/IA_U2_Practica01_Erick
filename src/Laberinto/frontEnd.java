package Laberinto;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Clair
 */
public class frontEnd extends JFrame {

    private String[][] field;

    private final PlayingFields pf = new PlayingFields();

    public frontEnd() {
        initComponents();

        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelButton = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        PanelField = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Laberinto");

        PanelButton.setName("PanelButton"); // NOI18N
        PanelButton.setLayout(new java.awt.GridLayout());

        jButton1.setText("Laberinto 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelButton.add(jButton1);

        jButton2.setText("Laberinto 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PanelButton.add(jButton2);

        javax.swing.GroupLayout PanelFieldLayout = new javax.swing.GroupLayout(PanelField);
        PanelField.setLayout(PanelFieldLayout);
        PanelFieldLayout.setHorizontalGroup(
            PanelFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelFieldLayout.setVerticalGroup(
            PanelFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMenuItem3.setText("Iniciar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem2.setText("Creditos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanelField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        JOptionPane.showMessageDialog(jMenuItem2, "Autor: Erick Clair.\nCódigo fuente: https://github.com/ErickCD/IA_U2_Practica01_Erick.git", "Datos del usuario", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        field = pf.fieldOne();
        createField();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        field = pf.fieldTwo();
        createField();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.repaint();
        MazeSolution(filaasterico(field), columasterico(field));
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private JButton[][] botones;

    private void createField() {
        PanelField.removeAll();
        PanelField.setLayout(new GridLayout(field.length, field[0].length));
        this.setSize(500, 500);
        botones = new JButton[field.length][field[0].length];

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j] == "|" || field[i][j] == "-") {
                    JButton boton = new JButton();
                    boton.setBackground(Color.darkGray);
                    botones[i][j] = boton;
                } else if (field[i][j] == "a") {
                    JButton boton = new JButton();
                    boton.setBackground(Color.black);
                    botones[i][j] = boton;
                } else if (field[i][j] == "*") {
                    JButton boton = new JButton();
                    boton.setBackground(Color.green);
                    botones[i][j] = boton;
                } else if (field[i][j] == "x") {
                    JButton boton = new JButton();
                    boton.setBackground(Color.red);
                    botones[i][j] = boton;
                } else {
                    JButton boton = new JButton();
                    boton.setBackground(Color.white);
                    botones[i][j] = boton;
                }

            }
        }

        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[0].length; j++) {
                PanelField.add(botones[i][j]);
//                PanelField.updateUI();
//                PanelField.setVisible(true);
            }
        }

        PanelField.updateUI();
        PanelField.setVisible(true);

        //MazeSolution(filaasterico(field), columasterico(field), botones);
    }

    public int filaasterico(String[][] matriz) {
        int fila = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j].equals("*")) {
                    fila = i;
                }
            }
        }
        return fila;
    }

    public int columasterico(String[][] matriz) {
        int fila = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j].equals("*")) {
                    fila = j;
                }
            }
        }
        return fila;
    }

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
            java.util.logging.Logger.getLogger(frontEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frontEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frontEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frontEnd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frontEnd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelButton;
    private javax.swing.JPanel PanelField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables

    public void MazeSolution(int filas, int colum) {
        String direccion = "abajo";
        int[] arreglo = posX(field);

        while (field[filas][colum] != field[arreglo[0]][arreglo[1]]) {
            imprimirMatriz(field);
            PanelField.updateUI();
            PanelField.setVisible(true);
            this.repaint();
            switch (direccion) {
                case "derecha"://DERECHA
                    if (!field[filas - 1][colum].equals("a") && !field[filas - 1][colum].equals("|") && !field[filas - 1][colum].equals("-")) {
                        field[filas - 1][colum] = "*";
                        field[filas][colum] = " ";
                        botones[filas - 1][colum].setBackground(Color.green);
                        botones[filas][colum].setBackground(Color.yellow);
                        filas--;
                        direccion = "arriba";
                    } else if (!field[filas][colum + 1].equals("a") && !field[filas][colum + 1].equals("|") && !field[filas][colum + 1].equals("-")) {
                        field[filas][colum + 1] = "*";
                        field[filas][colum] = " ";
                        botones[filas][colum + 1].setBackground(Color.green);
                        botones[filas][colum].setBackground(Color.yellow);
                        colum++;
                    } else if (!field[filas + 1][colum].equals("a") && !field[filas + 1][colum].equals("|") && !field[filas + 1][colum].equals("-")) {
                        field[filas + 1][colum] = "*";
                        field[filas][colum] = " ";
                        botones[filas + 1][colum].setBackground(Color.green);
                        botones[filas][colum].setBackground(Color.yellow);
                        filas++;
                        direccion = "abajo";
                    } else {
                        field[filas][colum - 1] = "*";
                        field[filas][colum] = " ";
                        botones[filas][colum - 1].setBackground(Color.green);
                        botones[filas][colum].setBackground(Color.yellow);
                        colum--;
                        direccion = "izquierda";
                    }
                    break;
                case "arriba"://ARRIBA
                    if (!field[filas][colum - 1].equals("a") && !field[filas][colum - 1].equals("|") && !field[filas][colum - 1].equals("-")) {
                        field[filas][colum - 1] = "*";
                        field[filas][colum] = " ";
                        botones[filas][colum - 1].setBackground(Color.green);
                        botones[filas][colum].setBackground(Color.yellow);
                        colum--;
                        direccion = "izquierda";
                    } else if (!field[filas - 1][colum].equals("a") && !field[filas - 1][colum].equals("|") && !field[filas - 1][colum].equals("-")) {
                        field[filas - 1][colum] = "*";
                        field[filas][colum] = " ";
                        botones[filas - 1][colum].setBackground(Color.green);
                        botones[filas][colum].setBackground(Color.yellow);
                        filas--;
                    } else if (!field[filas][colum + 1].equals("a") && !field[filas][colum + 1].equals("|") && !field[filas][colum + 1].equals("-")) {
                        field[filas][colum + 1] = "*";
                        field[filas][colum] = " ";
                        botones[filas][colum + 1].setBackground(Color.green);
                        botones[filas][colum].setBackground(Color.yellow);
                        colum++;
                        direccion = "derecha";
                    } else {
                        field[filas + 1][colum] = "*";
                        field[filas][colum] = " ";
                        botones[filas + 1][colum].setBackground(Color.green);
                        botones[filas][colum].setBackground(Color.yellow);
                        filas++;
                        direccion = "abajo";
                    }
                    break;
                case "izquierda":
                    if (!field[filas + 1][colum].equals("a") && !field[filas + 1][colum].equals("|") && !field[filas + 1][colum].equals("-")) {
                        field[filas + 1][colum] = "*";
                        field[filas][colum] = " ";
                        botones[filas + 1][colum].setBackground(Color.green);
                        botones[filas][colum].setBackground(Color.yellow);
                        filas++;
                        direccion = "abajo";
                    } else if (!field[filas][colum - 1].equals("a") && !field[filas][colum - 1].equals("|") && !field[filas][colum - 1].equals("-")) {
                        field[filas][colum - 1] = "*";
                        field[filas][colum] = " ";
                        botones[filas][colum - 1].setBackground(Color.green);
                        botones[filas][colum].setBackground(Color.yellow);
                        colum--;
                    } else if (!field[filas - 1][colum].equals("a") && !field[filas - 1][colum].equals("|") && !field[filas - 1][colum].equals("-")) {
                        field[filas - 1][colum] = "*";
                        field[filas][colum] = " ";
                        botones[filas - 1][colum].setBackground(Color.green);
                        botones[filas][colum].setBackground(Color.yellow);
                        filas--;
                        direccion = "arriba";
                    } else {
                        field[filas][colum + 1] = "*";
                        field[filas][colum] = " ";
                        botones[filas][colum + 1].setBackground(Color.green);
                        botones[filas][colum].setBackground(Color.yellow);
                        colum++;
                        direccion = "derecha";
                    }
                    break;

                case "abajo"://ARRIBA
                    if (!field[filas][colum + 1].equals("a") && !field[filas][colum + 1].equals("|") && !field[filas][colum + 1].equals("-")) {
                        field[filas][colum + 1] = "*";
                        field[filas][colum] = " ";
                        botones[filas][colum + 1].setBackground(Color.green);
                        botones[filas][colum].setBackground(Color.yellow);
                        colum++;
                        direccion = "derecha";
                    } else if (!field[filas + 1][colum].equals("a") && !field[filas + 1][colum].equals("|") && !field[filas + 1][colum].equals("-")) {
                        field[filas + 1][colum] = "*";
                        field[filas][colum] = " ";
                        botones[filas + 1][colum].setBackground(Color.green);
                        botones[filas][colum].setBackground(Color.yellow);
                        filas++;

                    } else if (!field[filas][colum - 1].equals("a") && !field[filas][colum - 1].equals("|") && !field[filas][colum - 1].equals("-")) {
                        field[filas][colum - 1] = "*";
                        field[filas][colum] = " ";
                        botones[filas][colum - 1].setBackground(Color.green);
                        botones[filas][colum].setBackground(Color.yellow);
                        colum--;
                        direccion = "izquierda";
                    } else {
                        field[filas - 1][colum] = "*";
                        field[filas][colum] = " ";
                        botones[filas - 1][colum].setBackground(Color.green);
                        botones[filas][colum].setBackground(Color.yellow);
                        filas--;
                        direccion = "arriba";
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            try {
                Thread.sleep(200);
                this.repaint();
                PanelField.updateUI();
                PanelField.setVisible(true);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
        PanelField.updateUI();
        PanelField.setVisible(true);
        imprimirMatriz(field);
        System.out.println("Ha llegado a la salida");
    }

    public int[] posX(String[][] matriz) {
        int arreglo[] = new int[2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j].equals("x")) {
                    arreglo[0] = i;
                    arreglo[1] = j;
                }
            }
        }
        return arreglo;
    }

    public void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
