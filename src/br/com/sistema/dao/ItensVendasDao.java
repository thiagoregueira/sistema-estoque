/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.sistema.dao;

import br.com.sistema.jdbc.ConexaoBanco;
import br.com.sistema.model.ItensVendas;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author thiag
 */
public class ItensVendasDao {
    private Connection conn;
    
    public ItensVendasDao(){
        this.conn = new ConexaoBanco().pegarConexao();
    }
    
    public void salvar(ItensVendas obj){
        try {
            String sql = "INSERT INTO tb_itensvendas (venda_id, produto_id, qtd, subtotal) VALUES (?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, obj.getVendas().getId());
            stmt.setInt(2, obj.getProdutos().getId());
            stmt.setInt(3, obj.getQtd());
            stmt.setDouble(4, obj.getSubtotal());
            stmt.execute();
            stmt.close();
            
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar os itens da minha venda");
        }
    }
}
