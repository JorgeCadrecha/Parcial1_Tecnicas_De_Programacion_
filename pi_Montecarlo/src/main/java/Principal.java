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



import mates.Matematicas;

public class Principal {


        public static void main(String[] args) {
            //System.out.println("El número PI es "  + Matematicas.generarNumeroPi(Integer.parseInt(args[0])));
            System.out.println("El número PI es "  + Matematicas.generarNumeroPi(Integer.parseInt("100000000")));
            // Si pongo la anterior línea me funciona y me proporciona el valor de PI correcto
        }

}
