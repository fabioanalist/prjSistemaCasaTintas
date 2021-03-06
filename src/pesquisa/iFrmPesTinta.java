/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pesquisa;

import estoque.iFrmProdTinta;
import javax.swing.JOptionPane;
import lib.jdb.jdbquery.JDBQuery;

/**
 *
 * @author patri
 */
public class iFrmPesTinta extends javax.swing.JInternalFrame {
    private JDBQuery qryCategTinta, qryTipoTinta, qryOriginal, qryPesquisa;
    private iFrmProdTinta prodTinta;
    private String sqlOriginal;
    /**
     * Creates new form iFrmPesquisa
     */
    public iFrmPesTinta(iFrmProdTinta prodTinta, JDBQuery qryOriginal) {
        this.prodTinta = prodTinta;
        this.qryOriginal = qryOriginal;
        
        qryCategTinta = new JDBQuery();
        qryCategTinta.setJDBConnection(qryOriginal.getJDBConnection());
        qryCategTinta.setSQL("SELECT id, descricao FROM categorias_tinta");
        qryCategTinta.setConcurUpdatable(false);
        
        qryTipoTinta = new JDBQuery();
        qryTipoTinta.setJDBConnection(qryOriginal.getJDBConnection());
        qryTipoTinta.setSQL("SELECT id, descricao FROM tipos_tinta");
        qryTipoTinta.setConcurUpdatable(false);
        
        qryPesquisa = new JDBQuery();
        qryPesquisa.setJDBConnection(qryOriginal.getJDBConnection());
        qryPesquisa.setConcurUpdatable(false);
        
        initComponents();
        
        cbbCategoria.setJDBListQuery(qryCategTinta);
        cbbCategoria.setKeyListField("id");
        cbbCategoria.setInvisibleFields("id");

        cbbTipo.setJDBListQuery(qryTipoTinta);
        cbbTipo.setKeyListField("id");
        cbbTipo.setInvisibleFields("id");
        
        qryCategTinta.execQuery();
        cbbCategoria.setSelectedIndex(0);
        
        qryTipoTinta.execQuery();
        cbbTipo.setSelectedIndex(0);
        
        pesquisar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JPanel();
        btnPesquisa = new javax.swing.JButton();
        scrlTinta = new javax.swing.JScrollPane();
        tbTinta = new lib.jdb.control.jdbtable.JDBTable();
        txtPesquisa = new javax.swing.JTextField();
        cbbPesquisa = new javax.swing.JComboBox<String>();
        lblQuantidadeItens = new javax.swing.JLabel();
        jDBLabelCount1 = new lib.jdb.control.jdblabelcount.JDBLabelCount();
        jSeparator1 = new javax.swing.JSeparator();
        lblAno = new javax.swing.JLabel();
        txtAno = new lib.jdb.control.jdbtextfield.JDBTextField();
        lblTipo = new javax.swing.JLabel();
        cbbTipo = new lib.jdb.control.jdblistcombobox.JDBListComboBox();
        lblCategoria = new javax.swing.JLabel();
        cbbCategoria = new lib.jdb.control.jdblistcombobox.JDBListComboBox();

        setClosable(true);
        setIconifiable(true);
        setTitle("Pesquisa de Tintas");
        setPreferredSize(new java.awt.Dimension(600, 418));

        Painel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        btnPesquisa.setFont(principal.FrmLogin.fontePadrao);
        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/look.png"))); // NOI18N
        btnPesquisa.setText("Pesquisar");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        scrlTinta.setFont(principal.FrmLogin.fontePadrao);

        tbTinta.setEditable(false);
        tbTinta.setFont(principal.FrmLogin.fontePadrao);
        tbTinta.setToolTipText("Duplo clique para selecionar");
        tbTinta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTintaMouseClicked(evt);
            }
        });
        scrlTinta.setViewportView(tbTinta);

        txtPesquisa.setFont(principal.FrmLogin.fontePadrao);
        txtPesquisa.setToolTipText("ENTER para pesquisar");
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
        });

        cbbPesquisa.setFont(principal.FrmLogin.fontePadrao);
        cbbPesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nome", "Código Tinta" }));

        lblQuantidadeItens.setFont(principal.FrmLogin.fontePadrao);
        lblQuantidadeItens.setText("Quantidade de itens:");

        jDBLabelCount1.setFont(principal.FrmLogin.fontePadrao);
        jDBLabelCount1.setjDBQuery(qryPesquisa);
        jDBLabelCount1.setText("jDBLabelCount1");

        lblAno.setText("Ano:");

        txtAno.setFont(principal.FrmLogin.fontePadrao);
        txtAno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAnoFocusLost(evt);
            }
        });

        lblTipo.setText("Tipo:");

        cbbTipo.setFont(principal.FrmLogin.fontePadrao);
        cbbTipo.setNextFocusableComponent(txtPesquisa);
        cbbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTipoActionPerformed(evt);
            }
        });

        lblCategoria.setText("Categoria:");

        cbbCategoria.setFont(principal.FrmLogin.fontePadrao);

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrlTinta, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAno)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategoria)
                            .addComponent(cbbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addComponent(lblTipo)
                                .addGap(0, 110, Short.MAX_VALUE))
                            .addComponent(cbbTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(124, 124, 124))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblQuantidadeItens)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jDBLabelCount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                        .addComponent(txtPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisa)))
                .addContainerGap())
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPesquisa)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addComponent(lblAno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PainelLayout.createSequentialGroup()
                                .addComponent(lblCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addComponent(lblTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrlTinta, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantidadeItens)
                    .addComponent(jDBLabelCount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbTipoActionPerformed

    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
        if(evt.getKeyChar() == '\n'){
            pesquisar();
        }
    }//GEN-LAST:event_txtPesquisaKeyPressed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        pesquisar();
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void txtAnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAnoFocusLost
        if(!txtAno.getText().isEmpty()){
            if(!txtAno.getText().matches("^[0-9]{4}$")){
                JOptionPane.showMessageDialog(this, "Ano dever ser um inteiro de 4 casas", 
                        "Atenção", JOptionPane.INFORMATION_MESSAGE);

                txtAno.requestFocus();
            }
        }
    }//GEN-LAST:event_txtAnoFocusLost

    private void tbTintaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTintaMouseClicked
        if(evt.getClickCount() == 2){
            int id = qryPesquisa.getCurrentFieldValueAsInteger("id");
            
            qryOriginal.setSQL(sqlOriginal + " WHERE id = " + id);
            qryOriginal.execQuery();
            
            prodTinta.atribuirCampos();
            
            doDefaultCloseAction();
        }
    }//GEN-LAST:event_tbTintaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Painel;
    private javax.swing.JButton btnPesquisa;
    private lib.jdb.control.jdblistcombobox.JDBListComboBox cbbCategoria;
    private javax.swing.JComboBox<String> cbbPesquisa;
    private lib.jdb.control.jdblistcombobox.JDBListComboBox cbbTipo;
    private lib.jdb.control.jdblabelcount.JDBLabelCount jDBLabelCount1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblQuantidadeItens;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JScrollPane scrlTinta;
    private lib.jdb.control.jdbtable.JDBTable tbTinta;
    private lib.jdb.control.jdbtextfield.JDBTextField txtAno;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables

    private void pesquisar(){
        sqlOriginal = 
                "SELECT "
                    + "id, "
                    + "nome, "
                    + "cod_tinta, "
                    + "ano_inicial, "
                    + "ano_final, "
                    + "id_categoria_tinta, "
                    + "categoria, "
                    + "id_tipo_tinta, "
                    + "tipo, "
                    + "sigla_montadora, "
                    + "montadora, "
                    + "quantidade_producao, "
                    + "quantidade_minima, "
                    + "sigla_unidade, "
                    + "unidade "
                + "FROM vw_tintas";
        
        String complementos = "", ordenacao = "";       
        
        qryPesquisa.setSQL(sqlOriginal);
        
        tbTinta.setJDBQuery(qryPesquisa);
        
        tbTinta.setFieldsTitle("nome", "NOME");
        tbTinta.setFieldsTitle("cod_tinta", "COD.TINTA");
        tbTinta.setFieldsTitle("ano_inicial", "INICIO");
        tbTinta.setFieldsTitle("ano_final", "FIM");
        tbTinta.setFieldsTitle("categoria", "CATEGORIA");
        tbTinta.setFieldsTitle("tipo", "TIPO");
        tbTinta.setFieldsTitle("montadora", "MONTADORA");
        
        tbTinta.setFieldsWidth("ano_inicial", 40);
        tbTinta.setFieldsWidth("ano_final", 40);
        tbTinta.setFieldsWidth("nome", 150);
        
        tbTinta.setInvisibleFields("id id_categoria_tinta id_tipo_tinta "
                + "sigla_montadora quantidade_producao "
                + "quantidade_minima sigla_unidade unidade");
        
        // 0 = Nome, 1 = Código Tinta
        if(cbbPesquisa.getSelectedIndex() == 0){
            complementos = String.format(
                    " WHERE nome LIKE '%%%s%%'", txtPesquisa.getText().replaceAll(" ", "%")) ;
            ordenacao = " ORDER BY nome";
        }else{
            complementos = String.format(
                    " WHERE cod_tinta like '%%%s%%'", txtPesquisa.getText());
            ordenacao = " ORDER BY cod_tinta";
        }
        
        if(!txtAno.getText().isEmpty()){
            complementos += String.format(
                    " AND ano_inicial <= %s AND ano_final >= %s", txtAno.getText(), txtAno.getText()); 
        }
        
        if(cbbCategoria.getSelectedIndex() != 0){
            complementos += String.format(
                    " AND id_categoria_tinta = %s", cbbCategoria.getKeyListValue());
        }
        
        if(cbbTipo.getSelectedIndex() != 0){
            complementos += String.format(
                    " AND id_tipo_tinta = %s", cbbTipo.getKeyListValue());
        }
        
        qryPesquisa.setSQL(sqlOriginal + complementos + ordenacao);
        
//        System.out.println(qryOriginal.getSQL());
        
        qryPesquisa.execQuery();
    }
}
