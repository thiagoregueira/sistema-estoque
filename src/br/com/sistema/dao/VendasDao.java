/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sistema.dao;
import br.com.sistema.jdbc.ConexaoBanco;
import br.com.sistema.model.Vendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author thiag
 */
public class VendasDao {
    private Connection conn;
    
    public VendasDao(){
        this.conn = new ConexaoBanco().pegarConexao();
    }
    
    public void salvar(Vendas obj){
        try {
            String sql = "INSERT INTO tb_vendas (cliente_id, data_venda, total_venda, observacoes) VALUES (?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, obj.getClientes().getId());
            stmt.setString(2, obj.getData_venda());
            stmt.setDouble(3, obj.getTotal_venda());
            stmt.setString(4, obj.getObservacoes());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Venda realizada com sucesso!");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao realizar a venda" + e);
        }
    }
    
    public int retornaUltimoIdVenda(){
        try {
            int ultimoId = 0;
            String sql = "SELECT max(id) id FROM tb_vendas";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Vendas v = new Vendas();
                v.setId(rs.getInt("id"));
                ultimoId = v.getId();
                
            }
            return ultimoId;
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao retornar o último id da venda");
        }
    }
}
