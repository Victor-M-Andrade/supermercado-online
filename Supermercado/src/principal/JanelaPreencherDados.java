/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import javax.swing.JOptionPane;
import principal.JanelaSobre;
/**
 *
 * @author victo
 */
public class JanelaPreencherDados extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPreencherDados
     */
    public JanelaPreencherDados() {
        initComponents();
        cxNome.setText("");
        cxSobrenome.setText("");
        cxIdade.setText("");
        cxCidade.setText("");
        cxEndereco.setText("");
       
    }
    
    /*JanelaMenu carrinho = new JanelaMenu();*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFinalizar = new javax.swing.JButton();
        txtIdade = new javax.swing.JLabel();
        txtNome = new javax.swing.JLabel();
        txtCidade = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JLabel();
        cxNome = new javax.swing.JTextField();
        cxIdade = new javax.swing.JTextField();
        cxCidade = new javax.swing.JTextField();
        cxEndereco = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JLabel();
        cxSobrenome = new javax.swing.JTextField();
        btnCancelarCompra = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();
        fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dados do Cliente");
        setBackground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(542, 397));
        setMinimumSize(new java.awt.Dimension(542, 397));
        setPreferredSize(new java.awt.Dimension(542, 397));
        getContentPane().setLayout(null);

        btnFinalizar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnFinalizar.setText("Concluir");
        btnFinalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinalizar);
        btnFinalizar.setBounds(220, 260, 95, 31);

        txtIdade.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtIdade.setText("Idade:");
        getContentPane().add(txtIdade);
        txtIdade.setBounds(70, 110, 60, 22);

        txtNome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNome.setText("Nome:");
        getContentPane().add(txtNome);
        txtNome.setBounds(70, 30, 60, 22);

        txtCidade.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCidade.setText("Cidade:");
        getContentPane().add(txtCidade);
        txtCidade.setBounds(60, 150, 68, 22);

        txtEndereco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtEndereco.setText("Endereço:");
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(40, 190, 92, 22);

        cxNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(cxNome);
        cxNome.setBounds(150, 20, 365, 30);

        cxIdade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cxIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxIdadeActionPerformed(evt);
            }
        });
        getContentPane().add(cxIdade);
        cxIdade.setBounds(150, 100, 36, 30);

        cxCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cxCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(cxCidade);
        cxCidade.setBounds(150, 140, 364, 30);

        cxEndereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cxEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(cxEndereco);
        cxEndereco.setBounds(150, 180, 364, 30);

        txtSobrenome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtSobrenome.setText("Sobrenome:");
        getContentPane().add(txtSobrenome);
        txtSobrenome.setBounds(20, 70, 110, 22);

        cxSobrenome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(cxSobrenome);
        cxSobrenome.setBounds(150, 60, 365, 30);

        btnCancelarCompra.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelarCompra.setText("Cancelar compra");
        btnCancelarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarCompra);
        btnCancelarCompra.setBounds(330, 300, 163, 31);

        btnLimparCampos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLimparCampos.setText("Limpar Campos");
        btnLimparCampos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimparCampos);
        btnLimparCampos.setBounds(40, 300, 155, 31);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/principal/fundo_azul (1).jpg"))); // NOI18N
        getContentPane().add(fundo);
        fundo.setBounds(0, 0, 1150, 650);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        //Finalização dos preenchimento dos dados do cliente
        int resposta = JOptionPane.showConfirmDialog(this,"Ola "+cxNome.getText()+" confirme seus dados:\n"+
                "\nNome: "+ cxNome.getText() +" "+ cxSobrenome.getText()+
                "\nIdade: " + cxIdade.getText() + " anos" + "\nCidade: " + cxCidade.getText()+
                "\nEndereço: " + cxEndereco.getText() + "\n" +
                "\nSeus dados estão corretos?", "Atenção", JOptionPane.YES_NO_OPTION);
        
        float idade;
        idade = Float.parseFloat(cxIdade.getText());
        if (resposta == JOptionPane.YES_OPTION) {
            if (idade < 18){
                JOptionPane.showMessageDialog(this,
                        "Você não pode concluir a compra pois é menor de idade." +
                                "\nChame um adulto e ele preencherá os dados", "Alerta de menor de idade!!!", JOptionPane.WARNING_MESSAGE);
            }
        
            else {
                
                    JOptionPane.showMessageDialog(this,
                        "Obrigado pela confiança, tenha uma ótima semana.", "Obrigado", JOptionPane.PLAIN_MESSAGE);
                    JanelaSobre janelaSobre = new JanelaSobre();
                    janelaSobre.setVisible(true);
                    this.dispose();}
        }
        if (resposta == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(this,
                "Preencha os dados corretamente dessa vez ok?", "Cuidado!!!", JOptionPane.WARNING_MESSAGE);
            } 
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void cxCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxCidadeActionPerformed

    private void cxEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxEnderecoActionPerformed

    private void cxIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cxIdadeActionPerformed

    private void btnCancelarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCompraActionPerformed
        //Cancelamento da compra
        int resposta = JOptionPane.showConfirmDialog(this,"Realmente deseja cancelar sua compra?"
                , "Atenção", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this,
                    "Tudo bem, sua compra foi cancelada com sucesso, tenha uma ótima semana.",
                    "Compra Cancelada!!!", JOptionPane.WARNING_MESSAGE);
            JanelaSobre janelaSobre = new JanelaSobre();
            janelaSobre.setVisible(true);
            this.dispose();}
        else{
            JOptionPane.showMessageDialog(this, "Sua compra não foi cancelada."
                    + "\nPreencha os dados.", "Cancelamento Abortado", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnCancelarCompraActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        //Limpar campos
        cxNome.setText("");
        cxSobrenome.setText("");
        cxIdade.setText("");
        cxCidade.setText("");
        cxEndereco.setText("");
    }//GEN-LAST:event_btnLimparCamposActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPreencherDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPreencherDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPreencherDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPreencherDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPreencherDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarCompra;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JTextField cxCidade;
    private javax.swing.JTextField cxEndereco;
    private javax.swing.JTextField cxIdade;
    private javax.swing.JTextField cxNome;
    private javax.swing.JTextField cxSobrenome;
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel txtCidade;
    private javax.swing.JLabel txtEndereco;
    private javax.swing.JLabel txtIdade;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtSobrenome;
    // End of variables declaration//GEN-END:variables
}