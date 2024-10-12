package japedidos.produto;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Dimension;
import java.awt.GridLayout;

import japedidos.produto.Categoria;
/**
 *
 * @author thiago
 */
public class JTable_Categoria extends JPanel{
    private CategoriaTableModel modelo;
    
    public JTable_Categoria() {
        this(new CategoriaTableModel());
    }
    
    public JTable_Categoria(CategoriaTableModel model) {
        super(new GridLayout(1, 0));
        this.modelo = model;
        final JTable table = new JTable(model);
        table.setPreferredScrollableViewportSize(new Dimension(200,300));
        table.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(table);
        
        this.add(scrollPane);
    }
    
    public CategoriaTableModel getModel() {
        return this.modelo;
    }
    
    public static void test() {
        JFrame frame = new JFrame("Teste da tabela Categoria");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTable_Categoria tabela = new JTable_Categoria();
        Categoria bebida = new Categoria(2, "bebidas", "produtos bebíveis");
        
        tabela.getModel().addRow(bebida);
        tabela.setOpaque(true);
        
        frame.setContentPane(tabela);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(JTable_Categoria::test);
    }
}
