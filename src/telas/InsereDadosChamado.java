package telas;
import Locadora.Chamado;
import Locadora.Cliente;
import Locadora.ListaChamados;
import Locadora.ListaClientes;
import javax.swing.JOptionPane;

public class InsereDadosChamado extends javax.swing.JFrame {
    private boolean edit;
    private PesquisaChamado telaPai;
    private int indexUltimo;
    
    public InsereDadosChamado(boolean edit) {
        initComponents();
        carregaClientes();
        this.edit = edit;
        if (edit){
            setEdit();
        }
        
    }
    
    public InsereDadosChamado(boolean edit, PesquisaChamado telaPai, int indexUltimo) {
        initComponents();
        carregaClientes();
        this.edit = edit;
        this.telaPai = telaPai;
        this.indexUltimo = indexUltimo;
        if (edit){
            setEdit();
        }
    }
    
    private void setEdit(){
        if (ListaChamados.get(indexUltimo).getTipo().equals("Viagem")){
            rbtViagem.setSelected(true);    
        }
        else {
            rbtCorrida.setSelected(true);
        }
        txtOrigem.setText(ListaChamados.get(indexUltimo).getOrigem());
        txtDestino.setText(ListaChamados.get(indexUltimo).getDestino());
        txtData.setText(ListaChamados.get(indexUltimo).getData());
        
        int i = 0;
        while (i < cpbClientes.getItemCount()){
            if (cpbClientes.getItemAt(i).equals(ListaChamados.get(indexUltimo).getCliente().getNome())){
                cpbClientes.setSelectedIndex(i);
                break;
            }
            i += 1;
        } 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgViagemCorrida = new javax.swing.ButtonGroup();
        pnlDados = new javax.swing.JPanel();
        lblOrigem = new javax.swing.JLabel();
        lblDestino = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        txtOrigem = new javax.swing.JTextField();
        txtDestino = new javax.swing.JFormattedTextField();
        lblTipo = new javax.swing.JLabel();
        rbtViagem = new javax.swing.JRadioButton();
        rbtCorrida = new javax.swing.JRadioButton();
        cpbClientes = new javax.swing.JComboBox<>();
        lblCliente = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        pnlSalvar = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Chamados");

        pnlDados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados do Chamado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 10))); // NOI18N

        lblOrigem.setText("Origem:");

        lblDestino.setText("Destino:");

        lblData.setText("Data:");

        lblTipo.setText("Tipo:");

        btgViagemCorrida.add(rbtViagem);
        rbtViagem.setText("Viagem");

        btgViagemCorrida.add(rbtCorrida);
        rbtCorrida.setText("Corrida");

        cpbClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o cliente" }));

        lblCliente.setText("Cliente:");

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTipo)
                            .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblOrigem)
                                .addComponent(lblDestino)
                                .addComponent(lblData, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosLayout.createSequentialGroup()
                                .addComponent(rbtViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbtCorrida, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtOrigem)
                                .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addComponent(lblCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cpbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(381, Short.MAX_VALUE))
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(rbtViagem)
                    .addComponent(rbtCorrida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrigem)
                    .addComponent(txtOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDestino)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblData)
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCliente))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pnlSalvar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/saveicon.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        btnCancel.setText("Voltar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSalvarLayout = new javax.swing.GroupLayout(pnlSalvar);
        pnlSalvar.setLayout(pnlSalvarLayout);
        pnlSalvarLayout.setHorizontalGroup(
            pnlSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalvarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancel)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(18, 18, 18))
        );
        pnlSalvarLayout.setVerticalGroup(
            pnlSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalvarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSalvarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void carregaClientes(){
        for (int i = 0; i < ListaClientes.size(); i++){
            cpbClientes.addItem(ListaClientes.get(i).getNome());
        }
    }
    
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        int nTipo = 0;
        String[] tipo = {"Corrida", "Viagem"};
        if (rbtCorrida.isSelected()){
            nTipo = 1;
        }
        else if (rbtViagem.isSelected()){
            nTipo = 2;
        }
        String origem = txtOrigem.getText();
        String destino = txtDestino.getText();
        String data = txtData.getText();
        
        if (nTipo == 0 || origem.length() == 0 || destino.length() == 0  || data.charAt(9) == ' ' || cpbClientes.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Preencha todos as Itens Corretamente!", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Cliente cliente = ListaClientes.get(cpbClientes.getSelectedIndex() - 1);
            if (edit){
                ListaChamados.get(indexUltimo).setTipo(tipo[nTipo - 1]);
                ListaChamados.get(indexUltimo).setOrigem(origem);
                ListaChamados.get(indexUltimo).setDestino(destino);
                ListaChamados.get(indexUltimo).setData(data);
                ListaChamados.get(indexUltimo).setCliente(cliente);
                telaPai.mostrarChamado(ListaChamados.get(indexUltimo), indexUltimo);
                telaPai.clearPesquisa();
                telaPai.selectTable();
            }
            else{
                Chamado novoChamado = new Chamado(data, tipo[nTipo-1], origem, destino, cliente);
                ListaChamados.add(novoChamado);
            }
            JOptionPane.showMessageDialog(null, "Chamado Cadastrado!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgViagemCorrida;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cpbClientes;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblOrigem;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JPanel pnlSalvar;
    private javax.swing.JRadioButton rbtCorrida;
    private javax.swing.JRadioButton rbtViagem;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtDestino;
    private javax.swing.JTextField txtOrigem;
    // End of variables declaration//GEN-END:variables
}
