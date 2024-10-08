package japedidos.produto;

import java.awt.Color;

public class JFrame_ListaProdutos extends javax.swing.JFrame {

    String diretorioBase = "C:\\SENAI\\TECHNIGHT\\JaPedidos\\JaPedidos\\src\\main\\java\\japedidos\\imagens\\";
    String caminhoIcone = "";

    /**
     * Creates new form listaProdutos
     */
    public JFrame_ListaProdutos() {
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

        jpnl_sideMenu = new javax.swing.JPanel();
        jtb_linhaBranca = new javax.swing.JToolBar();
        jlbl_clientes = new javax.swing.JLabel();
        jlbl_produtos = new javax.swing.JLabel();
        jlbl_pedidos = new javax.swing.JLabel();
        jlbl_relatorios = new javax.swing.JLabel();
        jpnl_img_etiqueta = new javax.swing.JLabel();
        jpnl_background0 = new javax.swing.JLabel();
        jpnl_corpo = new javax.swing.JPanel();
        jtxtf_pesquisa = new javax.swing.JTextField();
        jlbl_codigo = new javax.swing.JLabel();
        jtxtf_codigo = new javax.swing.JTextField();
        jlbl_descricao = new javax.swing.JLabel();
        jtxtf_descricao = new javax.swing.JTextField();
        jlbl_categoria = new javax.swing.JLabel();
        jcmb_categoria = new javax.swing.JComboBox<>();
        jlbl_und = new javax.swing.JLabel();
        jcmb_und = new javax.swing.JComboBox<>();
        jlbl_valor = new javax.swing.JLabel();
        jtxtf_valor = new javax.swing.JTextField();
        jtb_linha = new javax.swing.JToolBar();
        jtb_linha1 = new javax.swing.JToolBar();
        jlbl_clientes1 = new javax.swing.JLabel();
        jlbl_produtos1 = new javax.swing.JLabel();
        jlbl_pedidos1 = new javax.swing.JLabel();
        jlbl_relatorios1 = new javax.swing.JLabel();
        jpnl_img_etiqueta1 = new javax.swing.JLabel();
        jpnl_background2 = new javax.swing.JLabel();
        jpnl_btn_novo = new javax.swing.JLabel();
        jpnl_btn_excluir = new javax.swing.JLabel();
        jpnl_btn_salvar = new javax.swing.JLabel();
        jtbl_listaprodutos = new javax.swing.JScrollPane();
        jtbl_lista_produtos = new javax.swing.JTable();
        jlbl_codigo1 = new javax.swing.JLabel();
        jlbl_descricao1 = new javax.swing.JLabel();
        jlbl_categoria1 = new javax.swing.JLabel();
        jtxtf_valor1 = new javax.swing.JTextField();
        jtxtf_pesquisa1 = new javax.swing.JTextField();
        jtxtf_codigo1 = new javax.swing.JTextField();
        jtxtf_categoria = new javax.swing.JTextField();
        jcmb_und1 = new javax.swing.JComboBox<>();
        jtxtf_codigo2 = new javax.swing.JTextField();
        jtb_linha2 = new javax.swing.JToolBar();
        jpnl_btn_novo1 = new javax.swing.JLabel();
        jpnl_btn_excluir1 = new javax.swing.JLabel();
        jpnl_btn_salvar1 = new javax.swing.JLabel();
        jpnl_background1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(1024, 576));
        setSize(new java.awt.Dimension(1024, 576));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnl_sideMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpnl_sideMenu.setMaximumSize(new java.awt.Dimension(250, 576));
        jpnl_sideMenu.setMinimumSize(new java.awt.Dimension(250, 576));
        jpnl_sideMenu.setPreferredSize(new java.awt.Dimension(250, 576));
        jpnl_sideMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtb_linhaBranca.setBackground(new java.awt.Color(255, 255, 255));
        jtb_linhaBranca.setBorder(null);
        jtb_linhaBranca.setForeground(new java.awt.Color(255, 255, 255));
        jtb_linhaBranca.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jtb_linhaBranca.setBorderPainted(false);
        jpnl_sideMenu.add(jtb_linhaBranca, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 280, 100, 4));

        jlbl_clientes.setBackground(new java.awt.Color(187, 187, 187));
        jlbl_clientes.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jlbl_clientes.setForeground(new Color(128,128,128));
        jlbl_clientes.setText("CLIENTES");
        jlbl_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbl_clientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbl_clientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbl_clientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlbl_clientesMousePressed(evt);
            }
        });
        jpnl_sideMenu.add(jlbl_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 210, -1, -1));

        jlbl_produtos.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_produtos.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jlbl_produtos.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_produtos.setText("PRODUTOS");
        jlbl_produtos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jlbl_produtosFocusGained(evt);
            }
        });
        jlbl_produtos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbl_produtosMouseClicked(evt);
            }
        });
        jpnl_sideMenu.add(jlbl_produtos, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 250, -1, -1));

        jlbl_pedidos.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_pedidos.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jlbl_pedidos.setForeground(new Color(128,128,128));
        jlbl_pedidos.setText("PEDIDOS");
        jlbl_pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbl_pedidosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbl_pedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbl_pedidosMouseExited(evt);
            }
        });
        jpnl_sideMenu.add(jlbl_pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 290, -1, -1));

        jlbl_relatorios.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_relatorios.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jlbl_relatorios.setForeground(new Color(128,128,128));
        jlbl_relatorios.setText("RELATÓRIOS");
        jlbl_relatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbl_relatoriosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlbl_relatoriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbl_relatoriosMouseExited(evt);
            }
        });
        jpnl_sideMenu.add(jlbl_relatorios, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 330, -1, -1));

        jpnl_img_etiqueta.setMaximumSize(new java.awt.Dimension(250, 576));
        jpnl_img_etiqueta.setMinimumSize(new java.awt.Dimension(250, 576));
        jpnl_sideMenu.add(jpnl_img_etiqueta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 250, -1));

        jpnl_background0.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jpnl_background0.setToolTipText("");
        jpnl_background0.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jpnl_background0.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jpnl_background0.setMaximumSize(new java.awt.Dimension(1024, 576));
        jpnl_background0.setMinimumSize(new java.awt.Dimension(1024, 576));
        jpnl_background0.setPreferredSize(new java.awt.Dimension(1024, 576));
        jpnl_sideMenu.add(jpnl_background0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jpnl_sideMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 576));

        jpnl_corpo.setBackground(new java.awt.Color(153, 204, 255));
        jpnl_corpo.setMaximumSize(new java.awt.Dimension(1024, 576));
        jpnl_corpo.setMinimumSize(new java.awt.Dimension(1024, 576));
        jpnl_corpo.setPreferredSize(new java.awt.Dimension(1024, 576));
        jpnl_corpo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtf_pesquisa.setBackground(new java.awt.Color(204, 204, 204));
        jtxtf_pesquisa.setForeground(new java.awt.Color(0, 0, 0));
        jtxtf_pesquisa.setText("  Pesquisar...");
        jtxtf_pesquisa.setBorder(jtxtf_codigo.getBorder());
        jtxtf_pesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpnl_corpo.add(jtxtf_pesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 680, 30));

        jlbl_codigo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_codigo.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_codigo.setText("CÓDIGO :");
        jpnl_corpo.add(jlbl_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jtxtf_codigo.setBackground(new java.awt.Color(204, 204, 204));
        jtxtf_codigo.setForeground(new java.awt.Color(0, 0, 0));
        jpnl_corpo.add(jtxtf_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 90, 30));

        jlbl_descricao.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_descricao.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_descricao.setText("DESCRIÇÃO :");
        jpnl_corpo.add(jlbl_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        jtxtf_descricao.setBackground(new java.awt.Color(204, 204, 204));
        jtxtf_descricao.setForeground(new java.awt.Color(0, 0, 0));
        jpnl_corpo.add(jtxtf_descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 290, 30));

        jlbl_categoria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_categoria.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_categoria.setText("CATEGORIA :");
        jpnl_corpo.add(jlbl_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        jcmb_categoria.setBackground(new java.awt.Color(204, 204, 204));
        jcmb_categoria.setForeground(new java.awt.Color(255, 255, 255));
        jcmb_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UNI", "KG", "SC" }));
        jpnl_corpo.add(jcmb_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 60, 30));

        jlbl_und.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_und.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_und.setText("UND :");
        jpnl_corpo.add(jlbl_und, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, -1, -1));

        jcmb_und.setBackground(new java.awt.Color(204, 204, 204));
        jcmb_und.setForeground(new java.awt.Color(255, 255, 255));
        jcmb_und.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALIMENTO", "REFRIGERANTE", "MOLHOS" }));
        jpnl_corpo.add(jcmb_und, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 140, 30));

        jlbl_valor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_valor.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_valor.setText("VALOR :");
        jpnl_corpo.add(jlbl_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, -1, -1));

        jtxtf_valor.setBackground(new java.awt.Color(204, 204, 204));
        jtxtf_valor.setForeground(new java.awt.Color(0, 0, 0));
        jpnl_corpo.add(jtxtf_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 250, 60, 30));

        jtb_linha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.darkGray, null));

        jtb_linha1.setBackground(new java.awt.Color(255, 255, 255));
        jtb_linha1.setBorder(null);
        jtb_linha1.setForeground(new java.awt.Color(255, 255, 255));
        jtb_linha.add(jtb_linha1);

        jlbl_clientes1.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_clientes1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jlbl_clientes1.setText("CLIENTES");
        jtb_linha.add(jlbl_clientes1);

        jlbl_produtos1.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_produtos1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jlbl_produtos1.setForeground(new java.awt.Color(255, 255, 255));
        jlbl_produtos1.setText("PRODUTOS");
        jlbl_produtos1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jlbl_produtosFocusGained(evt);
            }
        });
        jtb_linha.add(jlbl_produtos1);

        jlbl_pedidos1.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_pedidos1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jlbl_pedidos1.setText("PEDIDOS");
        jtb_linha.add(jlbl_pedidos1);

        jlbl_relatorios1.setBackground(new java.awt.Color(0, 0, 0));
        jlbl_relatorios1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jlbl_relatorios1.setText("RELATÓRIOS");
        jtb_linha.add(jlbl_relatorios1);

        jpnl_img_etiqueta1.setMaximumSize(new java.awt.Dimension(250, 576));
        jpnl_img_etiqueta1.setMinimumSize(new java.awt.Dimension(250, 576));
        jtb_linha.add(jpnl_img_etiqueta1);

        jpnl_background2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jpnl_background2.setToolTipText("");
        jpnl_background2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jpnl_background2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jpnl_background2.setMaximumSize(new java.awt.Dimension(1024, 576));
        jpnl_background2.setMinimumSize(new java.awt.Dimension(1024, 576));
        jpnl_background2.setPreferredSize(new java.awt.Dimension(1024, 576));
        jtb_linha.add(jpnl_background2);

        jpnl_corpo.add(jtb_linha, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 680, 2));

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
        jpnl_corpo.add(jpnl_btn_novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, -1, -1));

        jpnl_btn_excluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpnl_btn_excluirMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpnl_btn_excluirMouseReleased(evt);
            }
        });
        jpnl_corpo.add(jpnl_btn_excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 210, -1, -1));

        jpnl_btn_salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpnl_btn_salvarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpnl_btn_salvarMouseReleased(evt);
            }
        });
        jpnl_corpo.add(jpnl_btn_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 250, -1, -1));

        jtbl_lista_produtos.setBackground(new java.awt.Color(153, 204, 255));
        jtbl_lista_produtos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jtbl_lista_produtos.setForeground(new java.awt.Color(255, 255, 255));
        jtbl_lista_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "BOLINHA DE QUEIJO", "ALIMENTO",  new Double(0.75), "UNI",  new Boolean(true)},
                { new Integer(2), "COXINHA DE FRANGO", "ALIMENTO",  new Double(0.75), "UNI",  new Boolean(true)},
                { new Integer(3), "KIBE DE CARNE", "ALIMENTO",  new Double(0.65), "UNI",  new Boolean(true)},
                { new Integer(4), "RISSOLE DE PIZZA", "ALIMENTO",  new Double(0.65), "UNI",  new Boolean(true)},
                { new Integer(5), "RISSOLE DE CAMARÃO", "ALIMENTO",  new Double(0.75), "UNI",  new Boolean(true)},
                { new Integer(6), "MINI CHURROS", "ALIMENTO",  new Double(0.55), "UNI",  new Boolean(true)},
                { new Integer(7), "ENROLADO DE SALSICHA ", "ALIMENTO",  new Double(0.55), "UNI",  new Boolean(true)}
            },
            new String [] {
                "Codigo", "Descrição", "Categoria", "Valor(R$)", "Unidade ", "Ativo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtbl_lista_produtos.setToolTipText("");
        jtbl_lista_produtos.setMinimumSize(new java.awt.Dimension(90, 160));
        jtbl_lista_produtos.setPreferredSize(new java.awt.Dimension(655, 204));
        jtbl_listaprodutos.setViewportView(jtbl_lista_produtos);
        if (jtbl_lista_produtos.getColumnModel().getColumnCount() > 0) {
            jtbl_lista_produtos.getColumnModel().getColumn(0).setResizable(false);
            jtbl_lista_produtos.getColumnModel().getColumn(0).setPreferredWidth(60);
            jtbl_lista_produtos.getColumnModel().getColumn(1).setResizable(false);
            jtbl_lista_produtos.getColumnModel().getColumn(1).setPreferredWidth(350);
            jtbl_lista_produtos.getColumnModel().getColumn(2).setResizable(false);
            jtbl_lista_produtos.getColumnModel().getColumn(2).setPreferredWidth(90);
            jtbl_lista_produtos.getColumnModel().getColumn(3).setResizable(false);
            jtbl_lista_produtos.getColumnModel().getColumn(3).setPreferredWidth(66);
            jtbl_lista_produtos.getColumnModel().getColumn(4).setResizable(false);
            jtbl_lista_produtos.getColumnModel().getColumn(4).setPreferredWidth(55);
            jtbl_lista_produtos.getColumnModel().getColumn(5).setResizable(false);
            jtbl_lista_produtos.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        jpnl_corpo.add(jtbl_listaprodutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 680, 170));

        jlbl_codigo1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_codigo1.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_codigo1.setText("CÓDIGO :");
        jpnl_corpo.add(jlbl_codigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        jlbl_descricao1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_descricao1.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_descricao1.setText("DESCRIÇÃO :");
        jpnl_corpo.add(jlbl_descricao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        jlbl_categoria1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbl_categoria1.setForeground(new java.awt.Color(0, 0, 0));
        jlbl_categoria1.setText("CATEGORIA :");
        jpnl_corpo.add(jlbl_categoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        jtxtf_valor1.setBackground(new java.awt.Color(204, 204, 204));
        jtxtf_valor1.setForeground(new java.awt.Color(0, 0, 0));
        jpnl_corpo.add(jtxtf_valor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, 60, 30));

        jtxtf_pesquisa1.setBackground(new java.awt.Color(204, 204, 204));
        jtxtf_pesquisa1.setForeground(new java.awt.Color(0, 0, 0));
        jtxtf_pesquisa1.setText("  Pesquisar...");
        jtxtf_pesquisa1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jpnl_corpo.add(jtxtf_pesquisa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 660, 30));

        jtxtf_codigo1.setBackground(new java.awt.Color(204, 204, 204));
        jtxtf_codigo1.setForeground(new java.awt.Color(0, 0, 0));
        jpnl_corpo.add(jtxtf_codigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 90, 30));

        jtxtf_categoria.setBackground(new java.awt.Color(204, 204, 204));
        jtxtf_categoria.setForeground(new java.awt.Color(0, 0, 0));
        jpnl_corpo.add(jtxtf_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 290, 30));

        jcmb_und1.setBackground(new java.awt.Color(204, 204, 204));
        jcmb_und1.setForeground(new java.awt.Color(255, 255, 255));
        jcmb_und1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALIMENTO", "REFRIGERANTE", "MOLHOS" }));
        jpnl_corpo.add(jcmb_und1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, 140, 30));

        jtxtf_codigo2.setBackground(new java.awt.Color(204, 204, 204));
        jtxtf_codigo2.setForeground(new java.awt.Color(0, 0, 0));
        jpnl_corpo.add(jtxtf_codigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 90, 30));

        jtb_linha2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, java.awt.Color.darkGray, null));
        jpnl_corpo.add(jtb_linha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 658, 2));

        jpnl_btn_novo1.addMouseListener(new java.awt.event.MouseAdapter() {
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
        jpnl_corpo.add(jpnl_btn_novo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, -1, -1));

        jpnl_btn_excluir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpnl_btn_excluirMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpnl_btn_excluirMouseReleased(evt);
            }
        });
        jpnl_corpo.add(jpnl_btn_excluir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 210, -1, -1));

        jpnl_btn_salvar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpnl_btn_salvarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jpnl_btn_salvarMouseReleased(evt);
            }
        });
        jpnl_corpo.add(jpnl_btn_salvar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, -1, -1));

        jpnl_background1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jpnl_background1.setToolTipText("");
        jpnl_background1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jpnl_background1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jpnl_background1.setMaximumSize(new java.awt.Dimension(1024, 576));
        jpnl_background1.setMinimumSize(new java.awt.Dimension(1024, 576));
        jpnl_background1.setPreferredSize(new java.awt.Dimension(1024, 576));
        jpnl_corpo.add(jpnl_background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        getContentPane().add(jpnl_corpo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlbl_produtosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jlbl_produtosFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jlbl_produtosFocusGained

    private void jpnl_btn_novoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnl_btn_novoMousePressed
        // TODO add your handling code here:
        jpnl_btn_novo.setIcon(new javax.swing.ImageIcon("C:\\SENAI\\TECHNIGHT\\JaPedidos\\JaPedidos\\src\\main\\java\\japedidos\\imagens\\btn_novo_pressionado.png")); 
    }//GEN-LAST:event_jpnl_btn_novoMousePressed

    private void jpnl_btn_novoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnl_btn_novoMouseClicked
        // TODO add your handling code here:
        

    }//GEN-LAST:event_jpnl_btn_novoMouseClicked

    private void jpnl_btn_novoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnl_btn_novoMouseReleased
        // TODO add your handling code here:
        //jpnl_btn_novo.setIcon(new javax.swing.ImageIcon("C:\\JaPedidos\\JaPedidos\\src\\main\\java\\japedidos\\imagens\\btn_novo_padrao.png")); 
        jpnl_btn_novo.setIcon(new javax.swing.ImageIcon("C:\\SENAI\\TECHNIGHT\\JaPedidos\\JaPedidos\\src\\main\\java\\japedidos\\imagens\\btn_novo_padrao.png")); 
        

    }//GEN-LAST:event_jpnl_btn_novoMouseReleased

    private void jpnl_btn_excluirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnl_btn_excluirMousePressed
        // TODO add your handling code here:
        jpnl_btn_excluir.setIcon(new javax.swing.ImageIcon("C:\\SENAI\\TECHNIGHT\\JaPedidos\\JaPedidos\\src\\main\\java\\japedidos\\imagens\\btn_excluir_pressionado.png")); 
    }//GEN-LAST:event_jpnl_btn_excluirMousePressed

    private void jpnl_btn_excluirMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnl_btn_excluirMouseReleased
        // TODO add your handling code here:
        jpnl_btn_excluir.setIcon(new javax.swing.ImageIcon("C:\\SENAI\\TECHNIGHT\\JaPedidos\\JaPedidos\\src\\main\\java\\japedidos\\imagens\\btn_excluir_padrao.png")); 
    }//GEN-LAST:event_jpnl_btn_excluirMouseReleased

    private void jpnl_btn_salvarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnl_btn_salvarMouseReleased
        // TODO add your handling code here:
        jpnl_btn_salvar.setIcon(new javax.swing.ImageIcon("C:\\SENAI\\TECHNIGHT\\JaPedidos\\JaPedidos\\src\\main\\java\\japedidos\\imagens\\btn_salvar_padrao.png")); 
    }//GEN-LAST:event_jpnl_btn_salvarMouseReleased

    private void jpnl_btn_salvarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnl_btn_salvarMousePressed
        // TODO add your handling code here:
        jpnl_btn_salvar.setIcon(new javax.swing.ImageIcon("C:\\SENAI\\TECHNIGHT\\JaPedidos\\JaPedidos\\src\\main\\java\\japedidos\\imagens\\btn_salvar_pressionado.png")); 
    }//GEN-LAST:event_jpnl_btn_salvarMousePressed

    private void jlbl_clientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_clientesMouseEntered
        // TODO add your handling code here:
        jlbl_clientes.setForeground(new Color(187,187,187));
        
    }//GEN-LAST:event_jlbl_clientesMouseEntered

    private void jlbl_clientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_clientesMouseExited
        // TODO add your handling code here:
        jlbl_clientes.setForeground(new Color(128,128,128));
    }//GEN-LAST:event_jlbl_clientesMouseExited

    private void jlbl_pedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_pedidosMouseExited
        // TODO add your handling code here:
         
         jlbl_pedidos.setForeground(new Color(128,128,128));
    }//GEN-LAST:event_jlbl_pedidosMouseExited

    private void jlbl_pedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_pedidosMouseEntered
        // TODO add your handling code here:
        jlbl_pedidos.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_jlbl_pedidosMouseEntered

    private void jlbl_relatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_relatoriosMouseEntered
        // TODO add your handling code here:
        jlbl_relatorios.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_jlbl_relatoriosMouseEntered

    private void jlbl_relatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_relatoriosMouseExited
        // TODO add your handling code here:
        jlbl_relatorios.setForeground(new Color(128,128,128));
    }//GEN-LAST:event_jlbl_relatoriosMouseExited

    private void jlbl_clientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_clientesMousePressed
        // TODO add your handling code here:
        jtb_linhaBranca.locate(46, 240);
    }//GEN-LAST:event_jlbl_clientesMousePressed

    private void jlbl_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_clientesMouseClicked
        // TODO add your handling code here:
        jtb_linhaBranca.setLocation(46, 240);
        jtb_linhaBranca.setSize(jlbl_clientes.getWidth(), 4 );
        jlbl_clientes.setForeground(new Color(255,255,255));
        
    }//GEN-LAST:event_jlbl_clientesMouseClicked

    private void jlbl_produtosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_produtosMouseClicked
        // TODO add your handling code here:
        jtb_linhaBranca.setLocation(46, 250+30);
        jtb_linhaBranca.setSize(jlbl_produtos.getWidth(), 4 );
        jlbl_produtos.setForeground(new Color(255,255,255));

    }//GEN-LAST:event_jlbl_produtosMouseClicked

    private void jlbl_pedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_pedidosMouseClicked
        // TODO add your handling code here:
        jtb_linhaBranca.setLocation(46, 290+30);
        jtb_linhaBranca.setSize(jlbl_pedidos.getWidth(), 4 );
        jlbl_pedidos.setForeground(new Color(255,255,255));
        
    }//GEN-LAST:event_jlbl_pedidosMouseClicked

    private void jlbl_relatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl_relatoriosMouseClicked
        // TODO add your handling code here:
        jtb_linhaBranca.setLocation(46, 330+30);
        jtb_linhaBranca.setSize(jlbl_relatorios.getWidth(), 4 );
        jlbl_relatorios.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_jlbl_relatoriosMouseClicked

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
            java.util.logging.Logger.getLogger(JFrame_ListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame_ListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame_ListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame_ListaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame_ListaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jcmb_categoria;
    private javax.swing.JComboBox<String> jcmb_und;
    private javax.swing.JComboBox<String> jcmb_und1;
    private javax.swing.JLabel jlbl_categoria;
    private javax.swing.JLabel jlbl_categoria1;
    private javax.swing.JLabel jlbl_clientes;
    private javax.swing.JLabel jlbl_clientes1;
    private javax.swing.JLabel jlbl_codigo;
    private javax.swing.JLabel jlbl_codigo1;
    private javax.swing.JLabel jlbl_descricao;
    private javax.swing.JLabel jlbl_descricao1;
    private javax.swing.JLabel jlbl_pedidos;
    private javax.swing.JLabel jlbl_pedidos1;
    private javax.swing.JLabel jlbl_produtos;
    private javax.swing.JLabel jlbl_produtos1;
    private javax.swing.JLabel jlbl_relatorios;
    private javax.swing.JLabel jlbl_relatorios1;
    private javax.swing.JLabel jlbl_und;
    private javax.swing.JLabel jlbl_valor;
    private javax.swing.JLabel jpnl_background0;
    private javax.swing.JLabel jpnl_background1;
    private javax.swing.JLabel jpnl_background2;
    private javax.swing.JLabel jpnl_btn_excluir;
    private javax.swing.JLabel jpnl_btn_excluir1;
    private javax.swing.JLabel jpnl_btn_novo;
    private javax.swing.JLabel jpnl_btn_novo1;
    private javax.swing.JLabel jpnl_btn_salvar;
    private javax.swing.JLabel jpnl_btn_salvar1;
    private javax.swing.JPanel jpnl_corpo;
    private javax.swing.JLabel jpnl_img_etiqueta;
    private javax.swing.JLabel jpnl_img_etiqueta1;
    private javax.swing.JPanel jpnl_sideMenu;
    private javax.swing.JToolBar jtb_linha;
    private javax.swing.JToolBar jtb_linha1;
    private javax.swing.JToolBar jtb_linha2;
    private javax.swing.JToolBar jtb_linhaBranca;
    private javax.swing.JTable jtbl_lista_produtos;
    private javax.swing.JScrollPane jtbl_listaprodutos;
    private javax.swing.JTextField jtxtf_categoria;
    private javax.swing.JTextField jtxtf_codigo;
    private javax.swing.JTextField jtxtf_codigo1;
    private javax.swing.JTextField jtxtf_codigo2;
    private javax.swing.JTextField jtxtf_descricao;
    private javax.swing.JTextField jtxtf_pesquisa;
    private javax.swing.JTextField jtxtf_pesquisa1;
    private javax.swing.JTextField jtxtf_valor;
    private javax.swing.JTextField jtxtf_valor1;
    // End of variables declaration//GEN-END:variables
}
