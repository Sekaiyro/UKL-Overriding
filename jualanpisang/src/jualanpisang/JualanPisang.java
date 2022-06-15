/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jualanpisang;

/**
 *
 * @author Adrian
 */
public class JualanPisang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jualan jualan = new Jualan();
        jualan.totalPisang();
        jualan.totalApel();
        
        Pisang pisang = new Pisang();
        pisang.totalApel();
        pisang.totalPisang();
    }
    
}
