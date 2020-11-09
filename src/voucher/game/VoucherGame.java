package voucher.game;
import java.util.*;

public class VoucherGame {

    
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
        
   int total, jumlah,kembalian,pilihan,bayar;
   String nama, email;  
   String [] kode = {"d12f17", "4fyh23", "ag3wem2"};
   String[] Voucher = {"Steam","Google play","PS4"};
   String [] ID = {"ij4581n4124n1", "un1u9n18241", "dn192nnu1n0"};
   int[] harga = {14000, 12000, 50000}; 
   
   
    
   
    
   
   //menampilkan menu 
        System.out.println("================================================");
        System.out.println("SELAMAT DATANG DI TOKO SAYA ");
        System.out.println("Silahkan Pilih");
        System.out.println("Daftar Voucher game");
        for (int a=0; a<harga.length; a++){
            System.out.println((a+1)+". "+Voucher[a]+ " = "+harga[a]);
        }
        System.out.println("================================================");
     //input data diri 
        
        System.out.print("Masukan nama anda : ");
        nama = input.nextLine();
        System.out.print("Masukan email anda : ");
        email = input.nextLine();
        
        //pembeli meng-input pilihan dan jumlah   
        System.out.print("Silahkan masukan pilihan anda :");
            pilihan = input.nextInt();
            System.out.println("Pilihan anda : Voucher "+Voucher[pilihan-1]);
            System.out.print("Tentukan jumlah yang akan anda beli :");
            jumlah = input.nextInt();
            total = harga[pilihan]*jumlah;
             System.out.println("Total yang harus anda bayar adalah Rp."+total);
             System.out.print("Masukan uang anda : Rp.");
                bayar = input.nextInt();
        //pembeli membayar
        //System.out.print("Masukan uang Anda : Rp.");
        //bayar = input.nextInt();

//percabangan operator 
         
         if (bayar > total){
           
             System.out.println("=============================================================");
             System.out.println("ID No : "+ID[pilihan]);
             System.out.println("Nama  : "+nama);
             System.out.println("Email : "+email);
             System.out.println("=============================================================");
             System.out.println(Voucher[pilihan-1]+"                  : "+harga[pilihan]);
             System.out.println("total                  : "+total);
             System.out.println("Pembayaran             : "+bayar);
             System.out.println("Kembalian              : Rp."+(bayar-total));
             System.out.println("Kode voucher           : "+kode[pilihan]);
             System.out.println("=============================================================");
             System.out.println("                       TERIMA KASIH ");
                     
             
             
            
            
        }else if (bayar == total){
             System.out.println("=============================================================");
             System.out.println("ID No : "+ID[pilihan]);
             System.out.println("Nama  : "+nama);
             System.out.println("Email : "+email);
             System.out.println("=============================================================");
             System.out.println(Voucher[pilihan-1]+"                 : "+harga[pilihan]);
             System.out.println("total                  : "+total);
             System.out.println("Pembayaran             : "+bayar);
             System.out.println("Kembalian              : Rp.0");
             System.out.println("Kode voucher           : "+kode[pilihan]);
             System.out.println("=============================================================");
             System.out.println("                       TERIMA KASIH ");
            
        }else{
             System.out.println("Maaf transaksi gagal, uang anda kurang T_T");
        }
            
            
}
}
//1.Start
//2.menampilkan list voucher beserta harga 
//3.memilih dan memasukan jumlah yang akan di beli 
//4.memasukan nama 
//5.memasukan email pembeli 
//6.memasukan jumlah uang untuk membayar 
//7.menampilkan kalimat "Transaksi selesai"
//8.menampilkan ID transaksi 
//9.menampilkan nama pembeli 
//10.menampilkan email pembeli
//11.menampilkan total harga 
//12.menampilkan pembayaran pembeli 
//13.jika pembeli membayar dengan uang pas tidak akan menampilkan kembalian 
//14.jika pembeli membayar dengan uang lebih menampilkan kembalian 
//15.jika uang bayar pembeli kurang maka menampilkan kalimat "maaf transaksi gagal, uang anda kurang" 
//16 .menampilkan kode voucher game 
