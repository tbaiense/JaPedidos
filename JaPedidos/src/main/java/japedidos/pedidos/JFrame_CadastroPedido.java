/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package japedidos.pedidos;

/**
 *
 * @author t.baiense
 */
public class JFrame_CadastroPedido extends javax.swing.JFrame {

    /**
     * Creates new form CadastroPedido
     */
    public JFrame_CadastroPedido() {
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

        jpnl_principal = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpnl_incluirPedido = new javax.swing.JPanel();
        jcmb_estadoInicial = new javax.swing.JComboBox<>();
        jtxtf_valorEntrega = new javax.swing.JTextField();
        jlbl_horaEntrega = new javax.swing.JLabel();
        jscp_destinatario = new javax.swing.JScrollPane();
        jtxta_destinatario = new javax.swing.JTextArea();
        jbtn_incluirProduto = new javax.swing.JButton();
        jtxtf_valorTotal = new javax.swing.JTextField();
        jtxtf_dataEntrega = new javax.swing.JTextField();
        jpnl_btn_novo = new javax.swing.JLabel();
        jtxtf_horaEntrega = new javax.swing.JTextField();
        jcmb_tipoEntrega = new javax.swing.JComboBox<>();
        jtxtf_nomeCliente = new javax.swing.JTextField();
        jtxtf_unidade = new javax.swing.JTextField();
        jlbl_valorEntrega = new javax.swing.JLabel();
        jlbl_bairro = new javax.swing.JLabel();
        jlbl_rua = new javax.swing.JLabel();
        jtxtf_cidade = new javax.swing.JTextField();
        jcmb_produto = new javax.swing.JComboBox<>();
        jscp_produtosInseridos = new javax.swing.JScrollPane();
        jtbl_produtosInseridos = new javax.swing.JTable();
        jlbl_cidade = new javax.swing.JLabel();
        jlbl_estadoInicial = new javax.swing.JLabel();
        jtxtf_uf = new javax.swing.JTextField();
        jlbl_tipoEntrega = new javax.swing.JLabel();
        jtxtf_rua = new javax.swing.JTextField();
        jlbl_uf = new javax.swing.JLabel();
        jtxtf_bairro = new javax.swing.JTextField();
        jtxtf_desconto = new javax.swing.JTextField();
        jlbl_desconto = new javax.swing.JLabel();
        jtxtf_telefoneCliente = new javax.swing.JTextField();
        jlbl_telefoneCliente = new javax.swing.JLabel();
        jlbl_quantidadeProduto = new javax.swing.JLabel();
        jbtn_criarPedido = new javax.swing.JButton();
        jlbl_valorTotal = new javax.swing.JLabel();
        jlbl_produto = new javax.swing.JLabel();
        jlbl_infoAdicionalCliente = new javax.swing.JLabel();
        jlbl_dataEntrega = new javax.swing.JLabel();
        jspn_quantidade = new javax.swing.JSpinner();
        jlbl_destinatario = new javax.swing.JLabel();
        jlbl_nomeCliente = new javax.swing.JLabel();
        jtxtf_numero = new javax.swing.JTextField();
        jlbl_numero = new javax.swing.JLabel();
        jpnl_pedidosAberto = new javax.swing.JPanel();
        jtxtf_pesquisarPedidos = new javax.swing.JTextField();
        jlbl_filtroPedidosEmAberto = new javax.swing.JLabel();
        jtxtf_filtroPedidosEmAberto = new javax.swing.JTextField();
        jscp_pedidosEmAberto = new javax.swing.JScrollPane();
        jtbl_pedidosEmAberto = new javax.swing.JTable();
        jlbl_img_intercorrencia = new javax.swing.JLabel();
        jpnl_historicoPedidos = new javax.swing.JPanel();
        jtxtf_pesquisarHistoricoPedido = new javax.swing.JTextField();
        jlbl_filtroHistoricoPedido = new javax.swing.JLabel();
        jtxtf_filtroHistoricoPedido = new javax.swing.JTextField();
        jscp_pedidosEmAberto1 = new javax.swing.JScrollPane();
        jtbl_HistoricoPedido = new javax.swing.JTable();
        jpnl_sideMenu = new javax.swing.JPanel();
        jlbl_clientes = new javax.swing.JLabel();
        jlbl_produtos = new javax.swing.JLabel();
        jlbl_pedidos = new javax.swing.JLabel();
        jlbl_relatorios = new javax.swing.JLabel();
        jpnl_img_etiqueta = new javax.swing.JLabel();
        jpnl_background = new javax.swing.JLabel();
        jpnl_background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnl_principal.setBackground(new java.awt.Color(153, 204, 255));
        jpnl_principal.setMaximumSize(new java.awt.Dimension(1024, 576));
        jpnl_principal.setMinimumSize(new java.awt.Dimension(1024, 576));
        jpnl_principal.setPreferredSize(new java.awt.Dimension(1024, 576));
        jpnl_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnl_incluirPedido.setOpaque(false);
        jpnl_incluirPedido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcmb_estadoInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em aberto", "Aguardando pagamento", "Pago", "Em preparo/separação", "Aguardando envio/retirada", "Saiu para entrega", "Concluído", "Cancelado" }));
        jpnl_incluirPedido.add(jcmb_estadoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 160, -1));

        jtxtf_valorEntrega.setForeground(new java.awt.Color(204, 204, 204));
        jpnl_incluirPedido.add(jtxtf_valorEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 440, 120, -1));

        jlbl_horaEntrega.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_horaEntrega.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_horaEntrega.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_horaEntrega.setText("HORA ENTREGA");
        jpnl_incluirPedido.add(jlbl_horaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, 30));

        jtxta_destinatario.setColumns(20);
        jtxta_destinatario.setRows(5);
        jscp_destinatario.setViewportView(jtxta_destinatario);

        jpnl_incluirPedido.add(jscp_destinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 260, 60));

        jbtn_incluirProduto.setText("Incluir");
        jpnl_incluirPedido.add(jbtn_incluirProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jtxtf_valorTotal.setForeground(new java.awt.Color(204, 204, 204));
        jpnl_incluirPedido.add(jtxtf_valorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 120, -1));

        jtxtf_dataEntrega.setForeground(new java.awt.Color(204, 204, 204));
        jpnl_incluirPedido.add(jtxtf_dataEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 120, -1));

        jpnl_btn_novo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnl_btn_novoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpnl_btn_novoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpnl_btn_novoMouseReleased(evt);
            }
        });
        jpnl_incluirPedido.add(jpnl_btn_novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, -1, -1));

        jtxtf_horaEntrega.setForeground(new java.awt.Color(204, 204, 204));
        jpnl_incluirPedido.add(jtxtf_horaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 90, -1));

        jcmb_tipoEntrega.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Envio", "Retirada no local" }));
        jpnl_incluirPedido.add(jcmb_tipoEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 160, -1));

        jtxtf_nomeCliente.setForeground(new java.awt.Color(204, 204, 204));
        jpnl_incluirPedido.add(jtxtf_nomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 300, -1));

        jtxtf_unidade.setText("UND");
        jpnl_incluirPedido.add(jtxtf_unidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 70, -1));

        jlbl_valorEntrega.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_valorEntrega.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_valorEntrega.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_valorEntrega.setText("VALOR DA ENTREGA:");
        jpnl_incluirPedido.add(jlbl_valorEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 440, 190, 30));

        jlbl_bairro.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_bairro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_bairro.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_bairro.setText("BAIRRO");
        jpnl_incluirPedido.add(jlbl_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jlbl_rua.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_rua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_rua.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_rua.setText("RUA");
        jpnl_incluirPedido.add(jlbl_rua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jtxtf_cidade.setForeground(new java.awt.Color(204, 204, 204));
        jpnl_incluirPedido.add(jtxtf_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 210, -1));

        jcmb_produto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOLINHA DE QUEIJO", "COXINHA DE FRANGO", "KIBE DE CARNE", "RISSOLE DE", "MINI CHURROS" }));
        jpnl_incluirPedido.add(jcmb_produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 190, -1));

        jtbl_produtosInseridos.setBackground(new java.awt.Color(153, 204, 255));
        jtbl_produtosInseridos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtbl_produtosInseridos.setForeground(new java.awt.Color(255, 255, 255));
        jtbl_produtosInseridos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "BOLINHA DE QUEIJO", "ALIMENTO", "UND",  new Double(0.75)},
                { new Integer(2), "COXINHA DE FRANGO", "ALIMENTO", "UND",  new Double(0.75)},
                { new Integer(3), "KIBE DE CARNE", "ALIMENTO", "UND",  new Double(0.65)},
                { new Integer(4), "RISSOLE DE PIZZA", "ALIMENTO", "UND",  new Double(0.65)},
                { new Integer(5), "RISSOLE DE CAMARÃO", "ALIMENTO", "UND",  new Double(0.75)},
                { new Integer(6), "MINI CHURROS", "ALIMENTO", "UND",  new Double(0.55)},
                { new Integer(7), "ENROLADO DE SALSICHA ", "ALIMENTO", "UND",  new Double(0.55)}
            },
            new String [] {
                "Cód.", "Descrição", "Categoria", "Unid.", "Valor(R$)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtbl_produtosInseridos.setMinimumSize(new java.awt.Dimension(20, 160));
        jtbl_produtosInseridos.setPreferredSize(new java.awt.Dimension(655, 204));
        jscp_produtosInseridos.setViewportView(jtbl_produtosInseridos);

        jpnl_incluirPedido.add(jscp_produtosInseridos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 440, 170));

        jlbl_cidade.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_cidade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_cidade.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_cidade.setText("CIDADE");
        jpnl_incluirPedido.add(jlbl_cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, -1, -1));

        jlbl_estadoInicial.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_estadoInicial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_estadoInicial.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_estadoInicial.setText("ESTADO INICIAL");
        jpnl_incluirPedido.add(jlbl_estadoInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 150, 30));

        jtxtf_uf.setForeground(new java.awt.Color(204, 204, 204));
        jpnl_incluirPedido.add(jtxtf_uf, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 50, -1));

        jlbl_tipoEntrega.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_tipoEntrega.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_tipoEntrega.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_tipoEntrega.setText("TIPO DA ENTREGA");
        jpnl_incluirPedido.add(jlbl_tipoEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, 30));

        jtxtf_rua.setForeground(new java.awt.Color(204, 204, 204));
        jpnl_incluirPedido.add(jtxtf_rua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, -1));

        jlbl_uf.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_uf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_uf.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_uf.setText("UF");
        jpnl_incluirPedido.add(jlbl_uf, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, -1, -1));

        jtxtf_bairro.setForeground(new java.awt.Color(204, 204, 204));
        jpnl_incluirPedido.add(jtxtf_bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 140, -1));

        jtxtf_desconto.setForeground(new java.awt.Color(204, 204, 204));
        jpnl_incluirPedido.add(jtxtf_desconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, 120, -1));

        jlbl_desconto.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_desconto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_desconto.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_desconto.setText("DESCONTO APLICADO:");
        jpnl_incluirPedido.add(jlbl_desconto, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 200, 30));

        jtxtf_telefoneCliente.setForeground(new java.awt.Color(204, 204, 204));
        jpnl_incluirPedido.add(jtxtf_telefoneCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, -1));

        jlbl_telefoneCliente.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_telefoneCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_telefoneCliente.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_telefoneCliente.setText("TELEFONE");
        jpnl_incluirPedido.add(jlbl_telefoneCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jlbl_quantidadeProduto.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_quantidadeProduto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_quantidadeProduto.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_quantidadeProduto.setText("QUANT.");
        jpnl_incluirPedido.add(jlbl_quantidadeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 80, 30));

        jbtn_criarPedido.setText("Criar pedido");
        jbtn_criarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_criarPedidoActionPerformed(evt);
            }
        });
        jpnl_incluirPedido.add(jbtn_criarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 210, -1));

        jlbl_valorTotal.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_valorTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_valorTotal.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_valorTotal.setText("VALOR TOTAL:");
        jpnl_incluirPedido.add(jlbl_valorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, 130, 30));

        jlbl_produto.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_produto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_produto.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_produto.setText("PRODUTO");
        jpnl_incluirPedido.add(jlbl_produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, 30));

        jlbl_infoAdicionalCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/japedidos/imagens/Frame 79 (1).png"))); // NOI18N
        jpnl_incluirPedido.add(jlbl_infoAdicionalCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        jlbl_dataEntrega.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_dataEntrega.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_dataEntrega.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_dataEntrega.setText("DATA ENTREGA");
        jpnl_incluirPedido.add(jlbl_dataEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 140, 30));
        jpnl_incluirPedido.add(jspn_quantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 90, -1));

        jlbl_destinatario.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_destinatario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_destinatario.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_destinatario.setText("DESTINATÁRIO");
        jpnl_incluirPedido.add(jlbl_destinatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 160, 30));

        jlbl_nomeCliente.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_nomeCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_nomeCliente.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_nomeCliente.setText("NOME");
        jpnl_incluirPedido.add(jlbl_nomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 130, -1));

        jtxtf_numero.setForeground(new java.awt.Color(204, 204, 204));
        jpnl_incluirPedido.add(jtxtf_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 50, -1));

        jlbl_numero.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_numero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_numero.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_numero.setText("Nº");
        jpnl_incluirPedido.add(jlbl_numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        jTabbedPane1.addTab("Incluir pedido", jpnl_incluirPedido);

        jpnl_pedidosAberto.setOpaque(false);
        jpnl_pedidosAberto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtf_pesquisarPedidos.setText("PESQUISAR..");
        jtxtf_pesquisarPedidos.setPreferredSize(new java.awt.Dimension(96, 22));
        jtxtf_pesquisarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_pesquisarPedidosActionPerformed(evt);
            }
        });
        jpnl_pedidosAberto.add(jtxtf_pesquisarPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 21, 310, 40));

        jlbl_filtroPedidosEmAberto.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlbl_filtroPedidosEmAberto.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_filtroPedidosEmAberto.setText("FILTRO:");
        jpnl_pedidosAberto.add(jlbl_filtroPedidosEmAberto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jtxtf_filtroPedidosEmAberto.setText("NOME ");
        jpnl_pedidosAberto.add(jtxtf_filtroPedidosEmAberto, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 100, 40));

        jtbl_pedidosEmAberto.setBackground(new java.awt.Color(153, 204, 255));
        jtbl_pedidosEmAberto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtbl_pedidosEmAberto.setForeground(new java.awt.Color(255, 255, 255));
        jtbl_pedidosEmAberto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "NOME",  new Integer(279999999), "RUA TAL Nº X", "10/10/2024",  new Double(1.0), "ABERTO", null},
                { new Integer(2), "NOME",  new Integer(279999999), "RUA TAL Nº X", "10/10/2024",  new Double(1.0), "ABERTO", null},
                { new Integer(3), "NOME",  new Integer(279999999), "RUA TAL Nº X", "10/10/2024",  new Double(1.0), "ABERTO", null},
                { new Integer(4), "NOME",  new Integer(279999999), "RUA TAL Nº X", "10/10/2024",  new Double(1.0), "ABERTO", null},
                { new Integer(5), "NOME",  new Integer(279999999), "RUA TAL Nº X", "10/10/2024",  new Double(1.0), "ABERTO", null}
            },
            new String [] {
                "CODIGO", "NOME", "TELEFONE", "ENDEREÇO", "DATA/HORA ENTREGA", "VALOR", "STAUS PEDIDO", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtbl_pedidosEmAberto.setMinimumSize(new java.awt.Dimension(20, 160));
        jtbl_pedidosEmAberto.setPreferredSize(new java.awt.Dimension(655, 204));
        jscp_pedidosEmAberto.setViewportView(jtbl_pedidosEmAberto);

        jpnl_pedidosAberto.add(jscp_pedidosEmAberto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 690, 170));

        jlbl_img_intercorrencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/japedidos/imagens/Intercorrencia.png"))); // NOI18N
        jpnl_pedidosAberto.add(jlbl_img_intercorrencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, -1, -1));

        jTabbedPane1.addTab("Pedidos em aberto", jpnl_pedidosAberto);

        jpnl_historicoPedidos.setOpaque(false);
        jpnl_historicoPedidos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtf_pesquisarHistoricoPedido.setText("PESQUISAR..");
        jtxtf_pesquisarHistoricoPedido.setPreferredSize(new java.awt.Dimension(96, 22));
        jtxtf_pesquisarHistoricoPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtf_pesquisarHistoricoPedidoActionPerformed(evt);
            }
        });
        jpnl_historicoPedidos.add(jtxtf_pesquisarHistoricoPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 21, 310, 40));

        jlbl_filtroHistoricoPedido.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlbl_filtroHistoricoPedido.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_filtroHistoricoPedido.setText("FILTRO:");
        jpnl_historicoPedidos.add(jlbl_filtroHistoricoPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jtxtf_filtroHistoricoPedido.setText("NOME ");
        jpnl_historicoPedidos.add(jtxtf_filtroHistoricoPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 100, 40));

        jtbl_HistoricoPedido.setBackground(new java.awt.Color(153, 204, 255));
        jtbl_HistoricoPedido.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtbl_HistoricoPedido.setForeground(new java.awt.Color(255, 255, 255));
        jtbl_HistoricoPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "NOME",  new Integer(27999999), "RUA TAL Nº X", "10/10/2024",  new Double(1.0)},
                { new Integer(2), "NOME",  new Integer(27999999), "RUA TAL Nº X", "10/10/2024",  new Double(1.0)},
                { new Integer(3), "NOME",  new Integer(27999999), "RUA TAL Nº X", "10/10/2024",  new Double(1.0)},
                { new Integer(4), "NOME",  new Integer(27999999), "RUA TAL Nº X", "10/10/2024",  new Double(1.0)},
                { new Integer(5), "NOME",  new Integer(27999999), "RUA TAL Nº X", "10/10/2024",  new Double(1.0)}
            },
            new String [] {
                "CODIGO", "NOME", "TELEFONE", "ENDEREÇO", "DATA/HORA ENTREGA", "VALOR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtbl_HistoricoPedido.setMinimumSize(new java.awt.Dimension(20, 160));
        jtbl_HistoricoPedido.setPreferredSize(new java.awt.Dimension(655, 204));
        jscp_pedidosEmAberto1.setViewportView(jtbl_HistoricoPedido);

        jpnl_historicoPedidos.add(jscp_pedidosEmAberto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 690, 170));

        jTabbedPane1.addTab("Histórico de pedidos", jpnl_historicoPedidos);

        jpnl_principal.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 750, 580));

        jpnl_sideMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpnl_sideMenu.setMaximumSize(new java.awt.Dimension(250, 576));
        jpnl_sideMenu.setMinimumSize(new java.awt.Dimension(250, 576));
        jpnl_sideMenu.setPreferredSize(new java.awt.Dimension(250, 576));
        jpnl_sideMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbl_clientes.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_clientes.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jlbl_clientes.setText("CLIENTES");
        jpnl_sideMenu.add(jlbl_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jlbl_produtos.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_produtos.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jlbl_produtos.setForeground(new java.awt.Color(204, 204, 204));
        jlbl_produtos.setText("PRODUTOS");
        jlbl_produtos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jlbl_produtosFocusGained(evt);
            }
        });
        jpnl_sideMenu.add(jlbl_produtos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jlbl_pedidos.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_pedidos.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jlbl_pedidos.setText("PEDIDOS");
        jpnl_sideMenu.add(jlbl_pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jlbl_relatorios.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_relatorios.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jlbl_relatorios.setText("RELATÓRIOS");
        jpnl_sideMenu.add(jlbl_relatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jpnl_img_etiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/japedidos/imagens/painel_comandos_esquerda_05x.png"))); // NOI18N
        jpnl_img_etiqueta.setText("jLabel2");
        jpnl_img_etiqueta.setMaximumSize(new java.awt.Dimension(250, 576));
        jpnl_img_etiqueta.setMinimumSize(new java.awt.Dimension(250, 576));
        jpnl_sideMenu.add(jpnl_img_etiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 250, -1));

        jpnl_background.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jpnl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/japedidos/imagens/background_pedidos.png"))); // NOI18N
        jpnl_background.setToolTipText("");
        jpnl_background.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jpnl_background.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jpnl_sideMenu.add(jpnl_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jpnl_principal.add(jpnl_sideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 576));

        jpnl_background1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jpnl_background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/japedidos/imagens/background_pedidos.png"))); // NOI18N
        jpnl_background1.setToolTipText("");
        jpnl_background1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jpnl_background1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jpnl_principal.add(jpnl_background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnl_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlbl_produtosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jlbl_produtosFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_jlbl_produtosFocusGained

    private void jbtn_criarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_criarPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_criarPedidoActionPerformed

    private void jpnl_btn_novoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnl_btn_novoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jpnl_btn_novoMouseClicked

    private void jpnl_btn_novoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnl_btn_novoMousePressed
        // TODO add your handling code here:
        jpnl_btn_novo.setIcon(new javax.swing.ImageIcon("C:\\SENAI\\TECHNIGHT\\JaPedidos\\JaPedidos\\src\\main\\java\\japedidos\\imagens\\btn_novo_pressionado.png"));
    }//GEN-LAST:event_jpnl_btn_novoMousePressed

    private void jpnl_btn_novoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnl_btn_novoMouseReleased
        // TODO add your handling code here:
        //jpnl_btn_novo.setIcon(new javax.swing.ImageIcon("C:\\JaPedidos\\JaPedidos\\src\\main\\java\\japedidos\\imagens\\btn_novo_padrao.png"));
        jpnl_btn_novo.setIcon(new javax.swing.ImageIcon("C:\\SENAI\\TECHNIGHT\\JaPedidos\\JaPedidos\\src\\main\\java\\japedidos\\imagens\\btn_novo_padrao.png"));

    }//GEN-LAST:event_jpnl_btn_novoMouseReleased

    private void jtxtf_pesquisarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_pesquisarPedidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_pesquisarPedidosActionPerformed

    private void jtxtf_pesquisarHistoricoPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtf_pesquisarHistoricoPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtf_pesquisarHistoricoPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame_CadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_CadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_CadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_CadastroPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_CadastroPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtn_criarPedido;
    private javax.swing.JButton jbtn_incluirProduto;
    private javax.swing.JComboBox<String> jcmb_estadoInicial;
    private javax.swing.JComboBox<String> jcmb_produto;
    private javax.swing.JComboBox<String> jcmb_tipoEntrega;
    private javax.swing.JLabel jlbl_bairro;
    private javax.swing.JLabel jlbl_cidade;
    private javax.swing.JLabel jlbl_clientes;
    private javax.swing.JLabel jlbl_dataEntrega;
    private javax.swing.JLabel jlbl_desconto;
    private javax.swing.JLabel jlbl_destinatario;
    private javax.swing.JLabel jlbl_estadoInicial;
    private javax.swing.JLabel jlbl_filtroHistoricoPedido;
    private javax.swing.JLabel jlbl_filtroPedidosEmAberto;
    private javax.swing.JLabel jlbl_horaEntrega;
    private javax.swing.JLabel jlbl_img_intercorrencia;
    private javax.swing.JLabel jlbl_infoAdicionalCliente;
    private javax.swing.JLabel jlbl_nomeCliente;
    private javax.swing.JLabel jlbl_numero;
    private javax.swing.JLabel jlbl_pedidos;
    private javax.swing.JLabel jlbl_produto;
    private javax.swing.JLabel jlbl_produtos;
    private javax.swing.JLabel jlbl_quantidadeProduto;
    private javax.swing.JLabel jlbl_relatorios;
    private javax.swing.JLabel jlbl_rua;
    private javax.swing.JLabel jlbl_telefoneCliente;
    private javax.swing.JLabel jlbl_tipoEntrega;
    private javax.swing.JLabel jlbl_uf;
    private javax.swing.JLabel jlbl_valorEntrega;
    private javax.swing.JLabel jlbl_valorTotal;
    private javax.swing.JLabel jpnl_background;
    private javax.swing.JLabel jpnl_background1;
    private javax.swing.JLabel jpnl_btn_novo;
    private javax.swing.JPanel jpnl_historicoPedidos;
    private javax.swing.JLabel jpnl_img_etiqueta;
    private javax.swing.JPanel jpnl_incluirPedido;
    private javax.swing.JPanel jpnl_pedidosAberto;
    private javax.swing.JPanel jpnl_principal;
    private javax.swing.JPanel jpnl_sideMenu;
    private javax.swing.JScrollPane jscp_destinatario;
    private javax.swing.JScrollPane jscp_pedidosEmAberto;
    private javax.swing.JScrollPane jscp_pedidosEmAberto1;
    private javax.swing.JScrollPane jscp_produtosInseridos;
    private javax.swing.JSpinner jspn_quantidade;
    private javax.swing.JTable jtbl_HistoricoPedido;
    private javax.swing.JTable jtbl_pedidosEmAberto;
    private javax.swing.JTable jtbl_produtosInseridos;
    private javax.swing.JTextArea jtxta_destinatario;
    private javax.swing.JTextField jtxtf_bairro;
    private javax.swing.JTextField jtxtf_cidade;
    private javax.swing.JTextField jtxtf_dataEntrega;
    private javax.swing.JTextField jtxtf_desconto;
    private javax.swing.JTextField jtxtf_filtroHistoricoPedido;
    private javax.swing.JTextField jtxtf_filtroPedidosEmAberto;
    private javax.swing.JTextField jtxtf_horaEntrega;
    private javax.swing.JTextField jtxtf_nomeCliente;
    private javax.swing.JTextField jtxtf_numero;
    private javax.swing.JTextField jtxtf_pesquisarHistoricoPedido;
    private javax.swing.JTextField jtxtf_pesquisarPedidos;
    private javax.swing.JTextField jtxtf_rua;
    private javax.swing.JTextField jtxtf_telefoneCliente;
    private javax.swing.JTextField jtxtf_uf;
    private javax.swing.JTextField jtxtf_unidade;
    private javax.swing.JTextField jtxtf_valorEntrega;
    private javax.swing.JTextField jtxtf_valorTotal;
    // End of variables declaration//GEN-END:variables
}
