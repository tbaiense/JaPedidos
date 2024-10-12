package japedidos;

import japedidos.bd.BD;
import japedidos.produto.*;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class JaPedidos {

    public static void main(String[] args) {
        
        Categoria bebidas = new Categoria("bebidas", "categoria de produtos bebíveis.");
        BD.Categoria.insert(bebidas);
        
        System.out.print(BD.Categoria.selectLast().getId());
        
    }
}
