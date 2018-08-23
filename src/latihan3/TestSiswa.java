/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author Cheeettoozzz
 */
public class TestSiswa {
    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Julian");
        siswa.setAbsen(23);
        siswa.setAddress("Malang");
        
        System.out.print("\n Name : "+ siswa.getName() + 
                         "\n Absen : " +siswa.getAbsen() +
                         "\n Address : "+siswa.getAddress());
    }
    
}
