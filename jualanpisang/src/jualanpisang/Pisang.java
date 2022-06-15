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
public class Pisang extends Jualan {
  int HargaPisang = 25000;
  int HargaApel = 50000;
  int totalApel;
  int totalPisang;
  int hargaTotal;
  
  @Override
  int totalApel(){
      int totalApel = 2*HargaApel;
      System.out.println("Total Harga Apel : "+totalApel);
      return totalApel;
  }
  
  @Override
  int totalPisang(){
      int totalPisang = 2*HargaPisang;
      System.out.println("Total Harga Pisang : "+totalPisang);
      return totalPisang;
  }
}
