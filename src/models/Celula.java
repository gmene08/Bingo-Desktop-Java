/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import controller.Verificacao;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author User
 */
public class Celula extends JButton {
    String prompt;
    boolean isMarked=false;
    int posX;
    int posY;
    
    

    public Celula() {
        
    }

    public Celula(String text, int x, int y) {
        super(text);
        this.prompt=text;
        posX=x;
        posY=y;
        
        super.setFont(new Font("Arial", Font.PLAIN, 24));
        setBackground( Color.WHITE);
        
        this.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                isMarked = !isMarked;
                setBackground(isMarked ? new Color(255,153,255) : Color.WHITE);
                
                Verificacao.registrarMarco(Celula.this);
            }
        });
        
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public boolean isIsMarked() {
        return isMarked;
    }

    public void setIsMarked(boolean isMarked) {
        this.isMarked = isMarked;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    
}
