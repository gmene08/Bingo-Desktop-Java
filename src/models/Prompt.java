/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


import Telas.TelaPrompts;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class Prompt {
    private List<String> prompts = new ArrayList<>();
    
    public Prompt(){
        prompts =  new ArrayList<>(List.of("Sayrui com dor de Cabeca"
                , "Sayuri com fome"
                , "Sayuri quer ir embora"
                , "Sayuri vai embora na 2 aula"
                , "Sayuri maltrata os amigos"
                , "Sayuri arruma o cabelo"
                , "Sayuri oferece chiclete"
                , "Sayuri reclama da aula"
                , "Sayuri toma agua"
                , "Sayuri vai no banheiro")
        );
    }
    
    public void adicionarPrompt(String texto){
        prompts.add(texto);
    }
    
    public void mostrarPrompts(){
        JOptionPane.showMessageDialog(null, String.join("\n", prompts));
    }
    
    public void rmvPrompt(int linha){
        prompts.remove(linha);
    }
    
    public void aleatorizar(){
        Collections.shuffle(prompts);
    }

    public String getDados(int i){
        return prompts.get(i);
    }
    
    public List<String> getPrompts() {
        return prompts;
    }

    public void setPrompts(List<String> prompts) {
        this.prompts = prompts;
    }
    
    
}
