
package ejemplomatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais Núñez
 */
public class MetodoMatriz {
    int filas = pedirTamaño();
    int columnas = pedirTamaño();
    int[][] notas = new int[filas][columnas];
    float [] notasMedias = new float[filas];
    float [] notasMediasModulos = new float[columnas];
    
    
    
    public void cargarMatriz(){
        
        for(int f=0; f<filas; f++)
            for(int c=0; c<columnas; c++)
                notas [f][c] = pedirNota();
    }
    
    
    public int pedirNota(){
        int resultado;
        
        do{
          
          resultado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca o resultado"));
        }while(resultado<1||resultado>10);
        return resultado;
        
    }
    
    
    
    public void amosarMatriz(){
        
        for(int f=0; f<filas; f++){
            for(int c=0; c<columnas; c++){
                System.out.print(notas[f][c]+ "  ");
        
    }
            System.out.println("\n");
}
}
    
    
    public void calcularMediaNotas(){
        int acu = 0;
        for(int f=0; f<filas; f++){
            acu = 0;
            for(int c=0; c<columnas; c++){
                                
                 acu = acu+ notas[f][c];
            }
            
            notasMedias[f] = acu/notas[f].length;
            System.out.println(notasMedias[f]);
        }
        
    }
    
    public void calcularMediaModulos(){
        int acu = 0;
        
        for(int c=0; c<columnas; c++){
            acu = 0;
            for(int f=0; f<filas; f++){
                
                acu = acu + notas[f][c];
            }
            
            notasMediasModulos[c] = acu/filas;
            System.out.println(notasMediasModulos[c]);
        }
        
    }
    public int pedirTamaño(){
        
        return Integer.parseInt(JOptionPane.showInputDialog("Introducir tamaño"));
        
    }
           
}
