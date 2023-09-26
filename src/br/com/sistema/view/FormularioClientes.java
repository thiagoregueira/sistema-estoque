/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.sistema.view;

import br.com.sistema.dao.ClientesDao;
import br.com.sistema.model.Clientes;
import br.com.sistema.utilitarios.Utilitarios;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thiag
 */
public class FormularioClientes extends javax.swing.JFrame {

    /**
     * Creates new form FormularioClientes
     */
    
    public void listar(){
        ClientesDao dao = new ClientesDao();
        List<Clientes> lista = dao.listar();
        DefaultTableModel dados = (DefaultTableModel) tabela.getModel();
        dados.setNumRows(0);
        for (Clientes c : lista){
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getRg(),
                c.getCpf(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getEstado(),
            });
        }
    }
    
    public FormularioClientes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painel_guias = new javax.swing.JTabbedPane();
        painel_dados_pessoais = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cbUF = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        painel_consulta = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtPesquisaNome = new javax.swing.JTextField();
        btnPesquisaNome = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setText("Código:");

        txtCodigo.setEditable(false);

        jLabel3.setText("Nome:");

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel4.setText("E-mail:");

        jLabel5.setText("Celular:");

        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("Telefone:");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setText("Endereço:");

        jLabel8.setText("CEP:");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel9.setText("Nº:");

        jLabel10.setText("Bairro:");

        jLabel11.setText("Cidade:");

        jLabel12.setText("Complemento:");

        cbUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel13.setText("RG:");

        jLabel14.setText("CPF:");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout painel_dados_pessoaisLayout = new javax.swing.GroupLayout(painel_dados_pessoais);
        painel_dados_pessoais.setLayout(painel_dados_pessoaisLayout);
        painel_dados_pessoaisLayout.setHorizontalGroup(
            painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                        .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                                .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                                    .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtBairro, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel_dados_pessoaisLayout.createSequentialGroup()
                                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel7)))
                                    .addGap(18, 18, 18)
                                    .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel12)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel9)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtNumero)))
                                    .addGap(18, 18, 18)
                                    .addComponent(cbUF, 0, 60, Short.MAX_VALUE))
                                .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                                    .addComponent(txtEmail)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnPesquisar))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel_dados_pessoaisLayout.setVerticalGroup(
            painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_dados_pessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_dados_pessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        painel_guias.addTab("Dados Pessoais", painel_dados_pessoais);

        jLabel15.setText("Nome:");

        txtPesquisaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaNomeKeyReleased(evt);
            }
        });

        btnPesquisaNome.setText("Pesquisar");
        btnPesquisaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaNomeActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "nome", "RG", "CPF", "e-mail", "telefone", "celular", "cep", "endereco", "numero", "complemento", "bairro", "cidade", "UF"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout painel_consultaLayout = new javax.swing.GroupLayout(painel_consulta);
        painel_consulta.setLayout(painel_consultaLayout);
        painel_consultaLayout.setHorizontalGroup(
            painel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_consultaLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPesquisaNome)
                .addContainerGap(382, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        painel_consultaLayout.setVerticalGroup(
            painel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_consultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_consultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))
        );

        painel_guias.addTab("Consultar Clientes", painel_consulta);

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistema/imagens/add1.png"))); // NOI18N
        btnNovo.setText("NOVO");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistema/imagens/salvar.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistema/imagens/editar.png"))); // NOI18N
        btnEditar.setText("EDITAR");

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistema/imagens/excluir.png"))); // NOI18N
        btnExcluir.setText("EXCLUIR");

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/sistema/imagens/printer.png"))); // NOI18N
        btnImprimir.setText("IMPRIMIR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnNovo)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(btnImprimir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(painel_guias)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel_guias, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnImprimir))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Clientes obj = new Clientes();
        obj.setNome(txtNome.getText());
        obj.setRg(txtRg.getText());
        obj.setCpf(txtCpf.getText());
        obj.setEmail(txtEmail.getText());
        obj.setTelefone(txtTelefone.getText());
        obj.setCelular(txtCelular.getText());
        obj.setCep(txtCep.getText());
        obj.setEndereco(txtEndereco.getText());
        obj.setNumero(Integer.parseInt(txtNumero.getText()));
        obj.setComplemento(txtComplemento.getText());
        obj.setBairro(txtBairro.getText());
        obj.setCidade(txtCidade.getText());
        obj.setEstado(cbUF.getSelectedItem().toString());
        
        ClientesDao dao = new ClientesDao();
        dao.salvar(obj);
        Utilitarios util = new Utilitarios();
        util.limpaTela(painel_dados_pessoais);
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String nome = txtNome.getText();
        Clientes obj = new Clientes();
        ClientesDao dao = new ClientesDao();
        
        obj = dao.buscarCliente(nome);
        if (obj.getNome() != null){
            txtCodigo.setText(String.valueOf(obj.getId()));
            txtNome.setText(obj.getNome());
            txtRg.setText(obj.getRg());
            txtCpf.setText(obj.getCpf());
            txtEmail.setText(obj.getEmail());
            txtTelefone.setText(obj.getTelefone());
            txtCelular.setText(obj.getCelular());
            txtCep.setText(obj.getCep());
            txtEndereco.setText(obj.getEndereco());
            txtNumero.setText(String.valueOf(obj.getNumero()));
            txtComplemento.setText(obj.getComplemento());
            txtBairro.setText(obj.getBairro());
            txtCidade.setText(obj.getCidade());
            cbUF.setSelectedItem(obj.getEstado());
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        Utilitarios util = new Utilitarios();
        util.limpaTela(painel_dados_pessoais);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        listar();
    }//GEN-LAST:event_formWindowActivated

    private void btnPesquisaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaNomeActionPerformed
        String nome = "%" + txtPesquisaNome.getText() + "%";
        ClientesDao dao = new ClientesDao();
        List<Clientes> lista = dao.filtrar(nome);
        DefaultTableModel dados = (DefaultTableModel) tabela.getModel();
        dados.setNumRows(0);
        for (Clientes c : lista){
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getRg(),
                c.getCpf(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getEstado(),
            });
        }
    }//GEN-LAST:event_btnPesquisaNomeActionPerformed

    private void txtPesquisaNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaNomeKeyReleased
         String nome = "%" + txtPesquisaNome.getText() + "%";
        ClientesDao dao = new ClientesDao();
        List<Clientes> lista = dao.filtrar(nome);
        DefaultTableModel dados = (DefaultTableModel) tabela.getModel();
        dados.setNumRows(0);
        for (Clientes c : lista){
            dados.addRow(new Object[]{
                c.getId(),
                c.getNome(),
                c.getRg(),
                c.getCpf(),
                c.getEmail(),
                c.getTelefone(),
                c.getCelular(),
                c.getCep(),
                c.getEndereco(),
                c.getNumero(),
                c.getComplemento(),
                c.getBairro(),
                c.getCidade(),
                c.getEstado(),
            });
        }
    }//GEN-LAST:event_txtPesquisaNomeKeyReleased

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            String nome = txtNome.getText();
            Clientes obj = new Clientes();
            ClientesDao dao = new ClientesDao();
        
            obj = dao.buscarCliente(nome);
            if (obj.getNome() != null){
                txtCodigo.setText(String.valueOf(obj.getId()));
                txtNome.setText(obj.getNome());
                txtRg.setText(obj.getRg());
                txtCpf.setText(obj.getCpf());
                txtEmail.setText(obj.getEmail());
                txtTelefone.setText(obj.getTelefone());
                txtCelular.setText(obj.getCelular());
                txtCep.setText(obj.getCep());
                txtEndereco.setText(obj.getEndereco());
                txtNumero.setText(String.valueOf(obj.getNumero()));
                txtComplemento.setText(obj.getComplemento());
                txtBairro.setText(obj.getBairro());
                txtCidade.setText(obj.getCidade());
                cbUF.setSelectedItem(obj.getEstado());
            } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado");
        }
            
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        painel_guias.setSelectedIndex(0);
        txtCodigo.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
        txtNome.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
        txtRg.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
        txtCpf.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
        txtEmail.setText(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
        txtTelefone.setText(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
        txtCelular.setText(tabela.getValueAt(tabela.getSelectedRow(), 6).toString());
        txtCep.setText(tabela.getValueAt(tabela.getSelectedRow(), 7).toString());
        txtEndereco.setText(tabela.getValueAt(tabela.getSelectedRow(), 8).toString());
        txtNumero.setText(tabela.getValueAt(tabela.getSelectedRow(), 9).toString());
        txtComplemento.setText(tabela.getValueAt(tabela.getSelectedRow(), 10).toString());
        txtBairro.setText(tabela.getValueAt(tabela.getSelectedRow(), 11).toString());
        txtCidade.setText(tabela.getValueAt(tabela.getSelectedRow(), 12).toString());
        cbUF.setSelectedItem(tabela.getValueAt(tabela.getSelectedRow(), 13).toString());
    }//GEN-LAST:event_tabelaMouseClicked

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
            java.util.logging.Logger.getLogger(FormularioClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisaNome;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbUF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painel_consulta;
    private javax.swing.JPanel painel_dados_pessoais;
    private javax.swing.JTabbedPane painel_guias;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPesquisaNome;
    private javax.swing.JTextField txtRg;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
