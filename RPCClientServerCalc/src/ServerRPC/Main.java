

package ServerRPC;

import org.apache.xmlrpc.WebServer;
/**
 *
 * @author inayah
 */
public class Main {
    public static void main(String[] args) {
        //  Mendeklarasikan server pada port 1717
        //  Dan secara otomatis akan terbentuk sebuah URL http://localhost:2000/RPC2
        WebServer server = new WebServer(2000);
       
        //  Tambahkan sebuah handler yang akan dipanggil oleh si Client
        //  Dan sebuah class baru untuk menghandle request dari si Client
        server.addHandler("server", new Services());     
       
        //  Jalankan server XML RPC
        server.start();
        System.out.println("Server berjalan pada port 2000 . . .");
    }  
}

