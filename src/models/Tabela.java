/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Tabela extends JTable {
    private static JTable tabela;
    
    public static JTable criarTabela(){

        String[][] dados= {};
        String[] colunas={};
        tabela = new JTable(dados,colunas);
        return tabela;
    }
    
    public static void attTabela(Prompt prompts){
        int tam=prompts.getPrompts().size();
        
        String[] coluna = {"prompts"};
        String[][] dados= new String[tam][1];

        for(int i=0; i<tam; i++){
            dados[i][0] = prompts.getDados(i);
        }
        DefaultTableModel dm = new DefaultTableModel(dados,coluna);  
        tabela.setModel(dm);
    }
    
    public static void rmv(int linha, Prompt prompts){
        DefaultTableModel rmv = (DefaultTableModel) tabela.getModel();
        rmv.removeRow(linha);
        
        prompts.rmvPrompt(linha);
        tabela.setModel(rmv);
    }
}
