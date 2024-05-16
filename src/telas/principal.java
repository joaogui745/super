package telas;

import java.awt.Image;
import javax.swing.ImageIcon;
import Locadora.ListaClientes;


public class principal extends javax.swing.JFrame {
    boolean edit = false;
    public principal() {
        initComponents();
        // Redimensionar Imagens
        ImageIcon ii = new ImageIcon(getClass().getResource("/imagens/superlogo.png"));
        Image image = ii.getImage().getScaledInstance(lblImagem.getWidth(), lblImagem.getHeight(), Image.SCALE_SMOOTH);
        ii = new ImageIcon(image);
        lblImagem.setIcon(ii);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMotto = new javax.swing.JLabel();
        lblImagem = new javax.swing.JLabel();
        mnbMenu = new javax.swing.JMenuBar();
        mnCadastro = new javax.swing.JMenu();
        mniCClientes = new javax.swing.JMenuItem();
        mniCChamado = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mniPesCliente = new javax.swing.JMenuItem();
        mniPesChamado = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Super");

        lblMotto.setFont(new java.awt.Font("Mongolian Baiti", 0, 36)); // NOI18N
        lblMotto.setText("SUPER");
        lblMotto.setPreferredSize(new java.awt.Dimension(112, 112));

        lblImagem.setMaximumSize(new java.awt.Dimension(100, 100));
        lblImagem.setMinimumSize(new java.awt.Dimension(100, 100));
        lblImagem.setPreferredSize(new java.awt.Dimension(100, 100));

        mnCadastro.setMnemonic('c');
        mnCadastro.setText("Cadastrar");

        mniCClientes.setMnemonic('c');
        mniCClientes.setText("Cliente");
        mniCClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCClientesActionPerformed(evt);
            }
        });
        mnCadastro.add(mniCClientes);

        mniCChamado.setMnemonic('h');
        mniCChamado.setText("Chamado");
        mniCChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCChamadoActionPerformed(evt);
            }
        });
        mnCadastro.add(mniCChamado);

        mnbMenu.add(mnCadastro);

        jMenu1.setMnemonic('p');
        jMenu1.setText("Pesquisar");

        mniPesCliente.setMnemonic('c');
        mniPesCliente.setText("Cliente");
        mniPesCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPesClienteActionPerformed(evt);
            }
        });
        jMenu1.add(mniPesCliente);

        mniPesChamado.setMnemonic('h');
        mniPesChamado.setText("Chamado");
        mniPesChamado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPesChamadoActionPerformed(evt);
            }
        });
        jMenu1.add(mniPesChamado);

        mnbMenu.add(jMenu1);

        setJMenuBar(mnbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(346, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMotto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(342, 342, 342))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(lblImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMotto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mniCChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCChamadoActionPerformed
        new InsereDadosChamado(edit).setVisible(true);
    }//GEN-LAST:event_mniCChamadoActionPerformed

    private void mniCClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCClientesActionPerformed
        new InsereDadosCliente(edit).setVisible(true);
    }//GEN-LAST:event_mniCClientesActionPerformed

    private void mniPesClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPesClienteActionPerformed
        new PesquisaClientes().setVisible(true);
    }//GEN-LAST:event_mniPesClienteActionPerformed

    private void mniPesChamadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniPesChamadoActionPerformed
        new PesquisaChamado().setVisible(true);
    }//GEN-LAST:event_mniPesChamadoActionPerformed


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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lblImagem;
    private javax.swing.JLabel lblMotto;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenuBar mnbMenu;
    private javax.swing.JMenuItem mniCChamado;
    private javax.swing.JMenuItem mniCClientes;
    private javax.swing.JMenuItem mniPesChamado;
    private javax.swing.JMenuItem mniPesCliente;
    // End of variables declaration//GEN-END:variables
}
