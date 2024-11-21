package Flaviaf.algoritmosEstructuradeDatos.arrayStringHashTable.ZeroMatric;

/*
 * Dada una matriz, escribe un algoritmo para establecer ceros en la fila F y columna C si existe un
 * 0 en la celda F:C
 *
 * Ejemplo:
 *  Input: 2 1 3 0 2
 *         7 4 1 3 8
 *         4 0 1 2 1
 *         9 3 4 1 9
 *
 *  Output: 0 0 0 0 0
 *          7 0 1 0 8
 *          0 0 0 0 0
 *          9 0 4 0 9
 */
public class ZeroMatrix {

    public int[][] zeroMatrix(int[][] matrix) {
      int rows = matrix.length;
      int columns = matrix[0].length;

        boolean[] rowsToZero = new boolean[rows];
        boolean[] colsToZero = new boolean[columns];

      for (int i=0; i<rows; i++){
          for ( int j=0; j<columns;j++){
              if (matrix[i][j] == 0) {
                  rowsToZero[i]= true;
                  colsToZero[j]= true;
              }
          }
      }

      int [][] result = new int [rows][columns];
      for( int i =0; i<rows; i++){
          for ( int j =0; j< columns; j++){
              if(rowsToZero[i]|| colsToZero[j]){
                  result[i][j] = 0;
              }else {
                  result[i][j]= matrix[i][j];

              }
          }
      }
        return result;


    }

}
