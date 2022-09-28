/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorydem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author admin
 */
public class GenerateBill {

    public static void main(String args[]) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();
        System.out.println("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String planName = br.readLine();
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units = Integer.parseInt(br.readLine());
        Plan p = planFactory.getPlan(planName);
        System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
        p.getRate();
        p.calculateBill(units);
    }

}
