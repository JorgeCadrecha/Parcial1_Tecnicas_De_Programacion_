/***********************************************************************
 *        Copyright 2023 Jorge Alejandro
 *
 *        Licensed under the Apache License, Version 2.0 (the "License");
 *        you may not use this file except in compliance with the License.
 *        You may obtain a copy of the License at*
 *        http://www.apache.org/licenses/LICENSE-2.0
 *        Unless required by applicable law or agreed to in writing,
 *        software distributed under the License is distributed on an
 *        "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *        either express or implied. See the License for the specific
 *        language governing permissions and limitations under the
 *        License.
 **********************************************************************************/



package dominio;

public class Tablero {
    private static int DIMENSION = 30;
    private int[][] estadoActual = new int[DIMENSION][DIMENSION];
    private int[][] estadoSiguiente = new int[DIMENSION][DIMENSION];




    public void leerEstadoActual() {
        //leer el estado actual del tablero
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                int estadoCasilla = estadoActual[i][j];

                System.out.println(estadoCasilla + " ");
            }
            System.out.println();
        }

    }

    public void generarEstadoActualPorMontecarlo() {
        int i, j;
        for (i = 0; i < DIMENSION; i++) {
            for (j = 0; j < DIMENSION; j++) {
                estadoSiguiente[i][j] = estadoActual[i][j] * (int) (Math.random() * 2);
            }
        }
        /**No se como generar cada segundo un estado diferente*/
    }




    public void transitarAlEstadoSiguiente() {
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                estadoSiguiente[i][j] = estadoActual[i][j];
            }
        }
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                sb.append(estadoActual[i][j] + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
