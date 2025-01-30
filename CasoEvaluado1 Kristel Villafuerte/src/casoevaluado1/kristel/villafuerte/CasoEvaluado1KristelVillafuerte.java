/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casoevaluado1.kristel.villafuerte;

import javax.swing.JOptionPane;

/**
 *
 * @author krisv
 */
public class CasoEvaluado1KristelVillafuerte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int SalIn = 0; // salario individual
        double T = 0; // salario total
        double SEM = 0.0925; // Seguro de Enfermedad y Maternidad
        double IVM = 0.0508; //Invalidez, Vejez y Muerte

        SalIn = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario:"));
        SEM = SalIn * SEM;
        IVM = SalIn * IVM;
        T = IVM + SEM;
        System.out.println("La empresa debera abonar a la CCSS el monto de: (incluyendo SEM e IVM)colones " + T);
    }
     
        
    }
    
