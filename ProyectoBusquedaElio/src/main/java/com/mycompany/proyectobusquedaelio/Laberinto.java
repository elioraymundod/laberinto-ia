/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectobusquedaelio;

/**
 *
 * @author Elio Raymundo
 */
public class Laberinto {
    public final short OBSTACULO = -1;
    private short INICIO = -2;
    private static short OBJETIVO = -3;
    private int alto = 3;
    private int largo = 3;

    private short [][] laberinto;
    private short [] nodosVecinos;
    private String[] solucion;
    
    public Laberinto() {
        System.out.println("Nuevo laberinto de tamaño " + alto + " por " + largo);
        
        laberinto = new short[largo + 2][alto + 2];
        
        for (int i = 0; i< largo + 2; i++) {
            for (int j = 0; j < alto + 2; j++) {
                laberinto[i][j] = 0;
            }
        }
        
        for (int i = 0; i < alto + 2; i++) {
            laberinto[0][i] = laberinto[largo + 1][i] = OBSTACULO;
        }
        
        for (int i = 0; i < largo + 2; i++) {
            laberinto[i][0] = laberinto[i][alto + 1] = OBSTACULO;
        }
        
        //Colocar obstaculos
        setValor(2, 2, (short)-1);
        setValor(3, 2, (short)-1);
        setValor(3, 1, (short)-1);
        
        //Especificar el estado inicial
        setValor(1, 1, (short)0);
        
        //Especifiar el estado objetivo
        setValor(largo, alto, OBJETIVO);
        
        //Imprimir en consola matriz
        for (int i = 0; i < laberinto.length; i++) {
            for (int j  = 0; j < laberinto[i].length; j++) {
                if (laberinto[i][j] == 0){
                    System.out.print(laberinto[i][j] +"     ");
                } else {
                    System.out.print(laberinto[i][j] +"    ");
                }
            }
            System.out.println();
        }
        
        //Buscar solucion a lo ancho de la matriz
        System.out.println("laberingo.length " + laberinto.length);
        
        for (int i = 1; i < laberinto.length - 1; i++) {
            for (int j  = 1; j < laberinto[i].length - 1; j++) {
                
            }
            
                //System.out.println("La lista de vecinos a evaluar es " + nodosVecinos);
        }
          System.out.println("no logre implementar una solucion :(");
        System.out.println("la solucion es " + solucion);
    }
    
    public short getValor(int x, int y) { 
        return laberinto[x + 1][y + 1]; 
    }
    
    public void setValor(int x, int y, short value) { 
        laberinto[x][y] = value; 
    }
    
    public int getLargo() { 
        return largo; 
    }
    
    public int getAlto() { 
        return alto; 
    }
}
