/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Telas.Bing;
import javax.swing.JOptionPane;
import models.Celula;

/**
 *
 * @author User
 */
public class Verificacao {
    private static boolean bingo[][];
    private static boolean ganhou=false;
    private static int nVitorias=0;
    
    public static void inicializarBingo(int tam){
        bingo= new boolean[tam][tam];
        ganhou=false;
    }
    
    public static void registrarMarco(Celula celulaClicada){
        int x= celulaClicada.getPosX();
        int y= celulaClicada.getPosY();
        bingo[x][y]=celulaClicada.isIsMarked();
        if(!ganhou) verificarVitoria();
    }
    
    public static void verificarVitoria(){
        int tamanho=bingo.length;
        
        int contLinha;
        int contColuna;
        int contDiag=0;
        int contDiagSec=0;
        
        for (int i =0 ; i<tamanho; i++){
            contLinha=0;
            contColuna=0;
            for (int j=0 ; j<tamanho; j++){
                if(bingo[i][j]) contLinha++;
                if(bingo[j][i]) contColuna++;
                if(bingo[i][j] && i==j) contDiag++;
                if(bingo[i][j] && i+j==tamanho-1) contDiagSec++;
            }
            if(contLinha==tamanho || contColuna==tamanho || contDiag==tamanho || contDiagSec == tamanho) {
                JOptionPane.showMessageDialog(null, "Bingo!!");
                ganhou=true;
                nVitorias++;
                Bing.getjLabelVitorias().setText("Vitorias: " + nVitorias);
            }
        }
 
    }

    public static int getnVitorias() {
        return nVitorias;
    }
    
    
    
    
    
    
}
