package EAD;

import CODIGOS.*;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.BadLocationException;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import org.scilab.forge.jlatexmath.TeXConstants;
import org.scilab.forge.jlatexmath.TeXFormula;
import org.scilab.forge.jlatexmath.TeXIcon;
import javax.swing.JTextPane;

/**
 *
 * @author hugoocampo
 */
public class TEST1 extends javax.swing.JFrame {

    double t1, t2, p1, p2, c, k;
    String funcion = "";
    int nDecimales = 2;
    boolean estado1 = false;
    boolean estado2 = false;
    boolean estado3 = false;

    public TEST1() {
        initComponents();
        String formula = String.format("A= \\pi r^2");
        textoLatexLabel(jLbFormula, formula);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jPanelObservacion1 = new javax.swing.JPanel();
        jTxtRadio = new javax.swing.JTextField();
        jLbObservacion1 = new javax.swing.JLabel();
        jBtnCalcular = new javax.swing.JButton();
        jLbTitulo = new javax.swing.JLabel();
        jLbFormula = new javax.swing.JLabel();
        jBtnLimpiar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTxPane1 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTxPane2 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPrincipal.setBackground(new java.awt.Color(0, 153, 102));
        jPanelPrincipal.setLayout(null);

        jPanelObservacion1.setBackground(new java.awt.Color(0, 51, 51));

        jLbObservacion1.setBackground(new java.awt.Color(255, 255, 255));
        jLbObservacion1.setForeground(new java.awt.Color(255, 255, 255));
        jLbObservacion1.setText("Radio");

        javax.swing.GroupLayout jPanelObservacion1Layout = new javax.swing.GroupLayout(jPanelObservacion1);
        jPanelObservacion1.setLayout(jPanelObservacion1Layout);
        jPanelObservacion1Layout.setHorizontalGroup(
            jPanelObservacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelObservacion1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelObservacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLbObservacion1))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        jPanelObservacion1Layout.setVerticalGroup(
            jPanelObservacion1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelObservacion1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLbObservacion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTxtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanelPrincipal.add(jPanelObservacion1);
        jPanelObservacion1.setBounds(70, 80, 420, 74);

        jBtnCalcular.setText("Calcular");
        jBtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCalcularActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jBtnCalcular);
        jBtnCalcular.setBounds(410, 230, 77, 23);

        jLbTitulo.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLbTitulo.setText("Circunferencia");
        jPanelPrincipal.add(jLbTitulo);
        jLbTitulo.setBounds(450, 10, 281, 30);

        jLbFormula.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLbFormula.setForeground(new java.awt.Color(255, 255, 255));
        jLbFormula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLbFormula.setText("Formula");
        jPanelPrincipal.add(jLbFormula);
        jLbFormula.setBounds(260, 290, 400, 28);

        jBtnLimpiar.setText("Reiniciar");
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jBtnLimpiar);
        jBtnLimpiar.setBounds(970, 40, 90, 23);

        jScrollPane2.setViewportView(jTxPane1);

        jPanelPrincipal.add(jScrollPane2);
        jScrollPane2.setBounds(60, 420, 450, 390);

        jScrollPane3.setViewportView(jTxPane2);

        jPanelPrincipal.add(jScrollPane3);
        jScrollPane3.setBounds(570, 420, 450, 390);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1106, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        // TODO add your handling code here:
        jTxtRadio.setText("");
        jLbFormula.setText("P(t) = ");
        estado1 = false;
        estado2 = false;
        estado3 = false;
        limpiarTextPane(jTxPane2);
        limpiarLabel(jLbFormula);
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void jBtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCalcularActionPerformed

        String sBase = jTxtRadio.getText();
        float base = Float.parseFloat(sBase);
        
        String formula = String.format("\\pi");
        textoLatexLabel(jLbFormula, formula);
        try {
            textoLatexPane(jTxPane1, formula);
        } catch (BadLocationException ex) {
            Logger.getLogger(TEST1.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_jBtnCalcularActionPerformed

    public static void textoLatexPane(JTextPane textPane, String latex) throws BadLocationException {
        // Crear fórmula y renderizar el ícono
        TeXFormula formula = new TeXFormula(latex);
        TeXIcon icon = formula.createTeXIcon(TeXFormula.SERIF, 18);

        // Crear una imagen con fondo transparente
        BufferedImage image = new BufferedImage(
                icon.getIconWidth(),
                icon.getIconHeight(),
                BufferedImage.TYPE_INT_ARGB
        );
        icon.paintIcon(null, image.getGraphics(), 0, 0);

        // Convertir la imagen a un ImageIcon
        ImageIcon latexIcon = new ImageIcon(image);

        // Obtener o crear el estilo
        StyledDocument doc = textPane.getStyledDocument();
        Style style = textPane.getStyle("LaTeXStyle");
        if (style == null) {
            style = textPane.addStyle("LaTeXStyle", null);
        }
        StyleConstants.setIcon(style, latexIcon);

        // Insertar imagen y salto de línea
        doc.insertString(doc.getLength(), " ", style);
        doc.insertString(doc.getLength(), "\n\n", null);

        // Opcional: desplazarse automáticamente al final
        textPane.setCaretPosition(doc.getLength());

        // Opcional: proteger edición del usuario
        textPane.setEditable(false);
    }

    private void textoLatexLabel(JLabel jLb, String latex) {
        TeXFormula formula = new TeXFormula(latex);

        // Crear el ícono con tamaño (20 es un buen punto de partida)
        TeXIcon icon = formula.createTeXIcon(TeXConstants.STYLE_DISPLAY, 22);
        //icon.setInsets(new Insets(5, 5, 2, 2)); // top, left, bottom, right

        // Asignar ícono al JLabel que agregaste desde el diseñador
        jLb.setIcon(icon);

        // Eliminar texto si tenía algo
        jLb.setText(null);
        //Alinear la imagen
        jLb.setHorizontalAlignment(SwingConstants.CENTER);
        jLb.setVerticalAlignment(SwingConstants.CENTER);

    }


    public void limpiarTextPane(JTextPane textPane) {
        try {
            StyledDocument doc = textPane.getStyledDocument();
            doc.remove(0, doc.getLength());
            textPane.setText("");
        } catch (BadLocationException e) {
            e.printStackTrace(); // Opcional: para ver errores en consola
        }
    }

    public void limpiarLabel(JLabel label) {
        label.setText(null);   // Elimina el texto
        label.setIcon(null);   // Elimina el ícono (útil si usás fórmulas LaTeX o imágenes)
    }


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
            java.util.logging.Logger.getLogger(TEST1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TEST1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TEST1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TEST1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TEST1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCalcular;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JLabel jLbFormula;
    private javax.swing.JLabel jLbObservacion1;
    private javax.swing.JLabel jLbTitulo;
    private javax.swing.JPanel jPanelObservacion1;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTxPane1;
    private javax.swing.JTextPane jTxPane2;
    private javax.swing.JTextField jTxtRadio;
    // End of variables declaration//GEN-END:variables
}
