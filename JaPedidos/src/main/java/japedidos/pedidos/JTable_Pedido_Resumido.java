package japedidos.pedidos;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import static javax.management.Query.value;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author thiago
 */
public class JTable_Pedido_Resumido extends JPanel {
    private JTable table;
    private PedidoTableModel model;
    
    public JTable_Pedido_Resumido() {
        super(new GridLayout(1, 0));
        PedidoTableModel model = new PedidoTableModel();
        this.model = model;
        JTable table = new JTable(model);
        table.setAutoCreateRowSorter(true);
        this.table = table;
//        getTable().setDefaultRenderer(EstadoPedido.class, new EstadoRenderer());
//        JComboBox<EstadoPedido> jcmb_estados = new JComboBox<>();
//        jcmb_estados.addItem(new EstadoPedido(Estado.ABERTO));
//        jcmb_estados.addItem(new EstadoPedido(Estado.AGUARDANDO_PAGAMENTO));
//        getTable().setDefaultEditor(EstadoPedido.class, new DefaultCellEditor(jcmb_estados));

        table.setPreferredScrollableViewportSize(new Dimension(794, 300));
        table.setFillsViewportHeight(true);
        table.getTableHeader().setReorderingAllowed(false);
        JScrollPane scrollPane = new JScrollPane(table);
        TableColumn column;
//        PedidoTableModel
//        public static final String[] COLUMNS = {"Código.", "Cliente", "Telefone", "Data ent.", "Hora ent.", "Total", "Estado atual"};
        column = table.getColumnModel().getColumn(0);
            column.setMinWidth(50);
            column.setMaxWidth(100);
            column.setPreferredWidth(60);
            column.setResizable(true);
        column = table.getColumnModel().getColumn(1);
            column.setMinWidth(140);
            column.setMaxWidth(300);
            column.setPreferredWidth(200);
            column.setResizable(true);
        column = table.getColumnModel().getColumn(2);
            column.setMinWidth(100);
            column.setMaxWidth(120);
            column.setPreferredWidth(110);
            column.setResizable(true);
        column = table.getColumnModel().getColumn(3);
            column.setMinWidth(80);
            column.setMaxWidth(100);
            column.setPreferredWidth(90);
            column.setResizable(true);
        column = table.getColumnModel().getColumn(4);
            column.setMinWidth(60);
            column.setMaxWidth(100);
            column.setPreferredWidth(100);
            column.setResizable(true);
        column = table.getColumnModel().getColumn(5);
            column.setMinWidth(80);
            column.setMaxWidth(140);
            column.setPreferredWidth(80);
            column.setResizable(true);
        column = table.getColumnModel().getColumn(6);
            column.setMinWidth(70);
            column.setMaxWidth(200);
            column.setPreferredWidth(196);
            column.setResizable(true);
       
        this.add(scrollPane);
    }
    
    static class EstadoRenderer extends JComboBox<EstadoPedido> implements TableCellRenderer {
        public Component getTableCellRendererComponent(
                            JTable table, Object color,
                            boolean isSelected, boolean hasFocus,
                            int row, int column) {
            return this;
        } 
    }
    
    public JTable getTable() {
        return this.table;
    }
    
    public PedidoTableModel getModel() {
        return this.model;
    }
    
    public void preencher(japedidos.pedidos.Estado estado) {
        this.setEnabled(false);
        this.getModel().fillRows(japedidos.bd.BD.Pedido.selectByEstado(estado));
        this.setEnabled(true);
    }
    
    public static void test() {
        JFrame frame = new JFrame("Teste de pedido");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.yellow);
        JTable_Pedido_Resumido tabela = new JTable_Pedido_Resumido();
        tabela.setBackground(Color.red);
        tabela.getTable().setBorder(javax.swing.BorderFactory.createEmptyBorder());
        tabela.getTable().setOpaque(false);
        tabela.getTable().setBackground(new Color(0,0,0,0));
        frame.setContentPane(tabela);
        frame.pack();
        frame.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            test();
        });
    }
}
