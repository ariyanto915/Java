/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sequential;

/**
 *
 * @author Ar
 */
public class Sequential {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] data = {99,20,17,8,27,5,21,10,41,11};
        int cari=21;
        int i=0;
        boolean ditemukan = false;
        
        for(i=0; i < data.length; i++){
            if (data[i] == cari){
                ditemukan=true;
                break;
            }
        }
        if (ditemukan) {
            System.out.println("Data : " + cari + " Ditemukan Pada Index :"+ i +".");
        }
        else{
            System.out.println("Data Tidak di temukan");
        }
    }
}
