/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sistema.dao;
import br.com.sistema.jdbc.ConexaoBanco;
import br.com.sistema.model.Fornecedores;
import br.com.sistema.model.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author thiag
 */
public class ProdutosDao {
    
    private Connection conn;
    
    public ProdutosDao(){
        this.conn = new ConexaoBanco().pegarConexao();
    }
    
    
    public void salvar(Produtos obj){
        try {
            // 1º criar o SQL
            String sql = "INSERT INTO tb_produtos (descricao, preco, qtd_estoque, for_id)"
                    + "VALUES (?,?,?,?)";
            // 2º preparar a conexão SQL
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getDescricao());
            stmt.setDouble(2, obj.getPreco());
            stmt.setInt(3, obj.getQtd_estoque());
            stmt.setInt(4, obj.getFornecedores().getId());
            // 3º executar SQL
            stmt.execute();
            // 4º fechar a conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Produto salvo com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao salvar Produto " + e);
        }
    }
    
    public Produtos buscarProduto(String nome){
        try {
            String sql = "SELECT p.id, p.descricao, p.preco, p.qtd_estoque, f.nome FROM tb_produtos AS p INNER JOIN tb_fornecedores AS f ON(p.for_id = f.id) WHERE p.descricao = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            Produtos obj = new Produtos();
            Fornecedores f = new Fornecedores();
            if (rs.next()){
                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                
                f.setNome(rs.getString("f.nome"));
                obj.setFornecedores(f);

            }
            return obj;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Produto " + e);
        }
        return null;
    }
    
    public Produtos buscarProdutoCodigo(int id){
        try {
            String sql = "SELECT p.id, p.descricao, p.preco, p.qtd_estoque, f.nome FROM tb_produtos AS p INNER JOIN tb_fornecedores AS f ON(p.for_id = f.id) WHERE p.id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Produtos obj = new Produtos();
            Fornecedores f = new Fornecedores();
            if (rs.next()){
                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                
                f.setNome(rs.getString("f.nome"));
                obj.setFornecedores(f);

            }
            return obj;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Produto " + e);
        }
        return null;
    }
    
    public List<Produtos> listar (){
        List<Produtos> lista = new ArrayList<>();
        try {
            String sql = "SELECT p.id, p.descricao, p.preco, p.qtd_estoque, f.nome FROM tb_produtos AS p INNER JOIN tb_fornecedores AS f ON(p.for_id = f.id)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Produtos obj = new Produtos();
                Fornecedores f = new Fornecedores();
                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                f.setNome(rs.getString("f.nome"));
                obj.setFornecedores(f);

                lista.add(obj);
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a lista " + e);
        }
        return null;
    }
    
     public List<Produtos> filtrar (String nome){
        List<Produtos> lista = new ArrayList<>();
        try {
            String sql = "SELECT p.id, p.descricao, p.preco, p.qtd_estoque, f.nome FROM tb_produtos AS p INNER JOIN tb_fornecedores AS f ON(p.for_id = f.id) WHERE p.descricao like ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Produtos obj = new Produtos();
                Fornecedores f = new Fornecedores();
                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtd_estoque(rs.getInt("p.qtd_estoque"));
                
                f.setNome(rs.getString("f.nome"));
                obj.setFornecedores(f);

                lista.add(obj);
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a lista " + e);
        }
        return null;
    }
     
     public void editar(Produtos obj){
        try {
            // 1º criar o SQL
            String sql = "UPDATE tb_produtos SET descricao = ?, preco = ?, qtd_estoque = ?, for_id = ?  WHERE id = ?";
            // 2º preparar a conexão SQL
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getDescricao());
            stmt.setDouble(2, obj.getPreco());
            stmt.setInt(3, obj.getQtd_estoque());
            stmt.setInt(4, obj.getFornecedores().getId());
            stmt.setInt(5, obj.getId());

            // 3º executar SQL
            stmt.execute();
            // 4º fechar a conexão
            stmt.close();
            JOptionPane.showMessageDialog(null, "Produto editado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "erro ao editar Produto " + e);
        }
    }
     
     public void excluir(Produtos obj){
         try {
             String sql = "DELETE FROM tb_produtos WHERE id = ?";
             PreparedStatement stmt = conn.prepareStatement(sql);
             stmt.setInt(1, obj.getId());
             stmt.execute();
             stmt.close();
             JOptionPane.showMessageDialog(null, "Produto excluído com sucesso! ");
         } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro ao excluir o Produto " + e);
         }
     }
     
     public void adicionarEstoque(int id, int qtd_nova){
         try {
             String sql = "UPDATE tb_produtos SET qtd_estoque = ? WHERE id = ?";
             PreparedStatement stmt = conn.prepareStatement(sql);
             stmt.setInt(1, qtd_nova);
             stmt.setInt(2, id);
             stmt.execute();
             stmt.close();
             JOptionPane.showMessageDialog(null, "Adicionado com sucesso ao estoque");
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "erro ao adicionar ao estoque" + e);
         }
     }
     
     public void baixaEstoque(int id, int qtd_nova){
         try {
             String sql = "UPDATE tb_produtos SET qtd_estoque = ? WHERE id = ?";
             PreparedStatement stmt = conn.prepareStatement(sql);
             stmt.setInt(1, qtd_nova);
             stmt.setInt(2, id);
             stmt.execute();
             stmt.close();
             JOptionPane.showMessageDialog(null, "baixa no estoque efetuada com sucesso!");
         } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "erro ao dar baixa no estoque" + e);
         }
     }
}
