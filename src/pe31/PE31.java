/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe31;

import java.util.ArrayList;

/**
 *
 * @author Verosffy
 */
public class PE31 {

    /**
     * @param args the command line arguments
     */
    public static int ertek(int[] db, int[] pnz) {
        int ertek = 0;
        for (int i = 0; i < 8; i++) {
            ertek += pnz[i] * db[i];
        }
        return ertek;

    }

    public static void main(String[] args) {

        int[] db = new int[8];
        int[] pnz = {1, 2, 5, 10, 20, 50, 100, 200};
        int szamlalo=0;

        int osszeg = ertek(db, pnz);
        ArrayList<Integer> variations = new ArrayList<Integer>();
        for (int p1 = 200; p1 >= 0; p1--) {
            db[0]=p1;
            for (int p2 = 100; p2 >= 0; p2--) {
                db[1]=p2;
                for (int p5 = 40; p5 >= 0; p5--) {
                    db[2]=p5;
                    for (int p10 = 20; p10 >= 0; p10--) {
                        db[3]=p10;
                        for (int p20 = 10; p20 >= 0; p20--) {
                            db[4]=p20;
                            for (int p50 = 4; p50 >= 0; p50--) {
                                db[5]=p50;
                                for (int f1 = 2; f1 >= 0; f1--) {
                                    db[6]=f1;
                                    for (int f2 = 1; f2 >= 0; f2--) {
db[7]=f2;
if(200==ertek(db, pnz))szamlalo++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(szamlalo);

    }
}
