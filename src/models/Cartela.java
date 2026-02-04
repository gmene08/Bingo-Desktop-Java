/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import controller.Verificacao;
import java.awt.GridLayout;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class Cartela {
    int tam=3;
  
    public void attCartela(JPanel painelCartela, List<String> prompts){
        try{
            painelCartela.removeAll(); 
            GridLayout layout = new GridLayout(tam,tam);
            painelCartela.setLayout(layout);

            int index=0;
                for (int i=0; i<tam; i++){
                    for (int j=0; j<tam; j++){
                        if(index<prompts.size()){
                            painelCartela.add(new Celula(prompts.get(index), i, j));
                        }
                        else painelCartela.add(new Celula("", i, j));

                        index++;
                    }
            }

            painelCartela.revalidate(); 
            painelCartela.repaint();
        }
        catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(null, "Crie a cartela primeiro");
        }
        
        Verificacao.inicializarBingo(tam);
    }

    public int getTamanho() {
        return tam;
    }

    public void setTamanho(int tam) {
        this.tam = tam;
    }
    
    
}
