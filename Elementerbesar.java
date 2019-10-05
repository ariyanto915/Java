/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementerbesar;
import java.util.Scanner;
/**
 *
 * @author Ar
 */
public class Elementerbesar {

    public static void main(String[] args)
    {
        Elementerbesar ET = new Elementerbesar();
        ET.urutkanAngka();
        ET.Elementerbesar();
        ET.tampilkanAngka();
    }
    
    int[] angka=new int[5];
    public void Elementerbesar()
    {
        Scanner input = new Scanner(System.in);
        for(int i=0;i<5; i++)
        {
            System.out.print("Masukkan Angka ke "+(i+1)+" : ");
            angka[i] = input.nextInt();
        } 
        tampilkanAngka();
        urutkanAngka();
        tampilkanAngka(); 
        
    } 
    void tampilkanAngka()
    {
        System.out.println("\n--------------------------------");
        for (int i=0;i<5; i++)         {
            System.out.print(angka[i]+" ");
        }
    } 
    void urutkanAngka()
    {
        int tampung;
        for (int i=0;i<5; i++)         {
            for(int j=0;j<5; j++)             {
                if(angka[j]>angka[j+1])
                {
                    tampung=angka[j];
                    angka[j]=angka[j+1];
                    angka[j+1]=tampung;
                } 
            }
        } 
    }
    }

