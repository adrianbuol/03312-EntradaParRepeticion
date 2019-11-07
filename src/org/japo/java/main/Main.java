/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Scanner;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252");

    public static void main(String[] args) {
        boolean error = false;
        int par;
        int condicion;

        do {
            try {
                System.out.print("Número par ...: ");
                par = SCN.nextInt();
                condicion = par % 2;

                if (error = condicion != 0) {
                    error = true;
                    System.out.println("ERROR: Entrada Incorrecta.");
                } else {
                    System.out.println("ERROR: Entrada Incorrecta");
                }

            } catch (Exception e) {
                error = true;
                System.out.println("ERROR: Entrada Incorrecta.");

            } finally {
                SCN.nextLine();
            }
        } while (error == true);
        System.out.println("END");
    }
}
