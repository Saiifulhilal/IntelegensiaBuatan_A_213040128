package id.ac.unpas.ib.latihan.heuristik.astar;

// main program
public class MainTest {
    // fungsi main
    public static void main(String[] args) {
// inisialisasi node-node yang ada  
Node Bogor = new Node("Bogor");
Node Sukabumi = new Node("Sukabumi");
Node Cianjur = new Node("Cianjur"); 
Node Bandung = new Node("Bandung");
Node Cimahi = new Node("Cimahi");
Node Tasikmalaya = new Node("Tasikmalaya");
Node Cirebon = new Node("Cirebon");
Node Bekasi = new Node("Bekasi");   
Node Depok = new Node("Depok");
Node Cilegon = new Node("Cilegon");
Node Serang = new Node("Serang");
Node Tangerang = new Node("Tangerang");
Node Jakarta = new Node("Jakarta");

// inisialisasi node-node yang ada dengan costnya
NodeUCS BogorUCS = new NodeUCS(Bogor, 0);  
NodeUCS SukabumiUCS = new NodeUCS(Sukabumi, 60);
NodeUCS CianjurUCS = new NodeUCS(Cianjur, 90);
NodeUCS BandungUCS = new NodeUCS(Bandung, 120);
NodeUCS CimahiUCS = new NodeUCS(Cimahi, 90);
NodeUCS TasikmalayaUCS = new NodeUCS(Tasikmalaya, 180); 
NodeUCS CirebonUCS = new NodeUCS(Cirebon, 150);
NodeUCS BekasiUCS = new NodeUCS(Bekasi, 60);
NodeUCS DepokUCS = new NodeUCS(Depok, 40);
NodeUCS CilegonUCS = new NodeUCS(Cilegon, 200);
NodeUCS SerangUCS = new NodeUCS(Serang, 220);
NodeUCS TangerangUCS = new NodeUCS(Tangerang, 100);
NodeUCS JakartaUCS = new NodeUCS(Jakarta, 60);

// menambahkan tetangga dari masing-masing node
BogorUCS.addTetangga(SukabumiUCS, 60);
BogorUCS.addTetangga(DepokUCS, 40);

SukabumiUCS.addTetangga(CianjurUCS, 60);  
SukabumiUCS.addTetangga(BogorUCS, 60);

CianjurUCS.addTetangga(SukabumiUCS, 60);
CianjurUCS.addTetangga(BandungUCS, 60);

BandungUCS.addTetangga(CianjurUCS, 60);
BandungUCS.addTetangga(CimahiUCS, 30);
BandungUCS.addTetangga(TasikmalayaUCS, 120);

CimahiUCS.addTetangga(BandungUCS, 30);

TasikmalayaUCS.addTetangga(BandungUCS, 120); 
TasikmalayaUCS.addTetangga(CirebonUCS, 90);

CirebonUCS.addTetangga(TasikmalayaUCS, 90);
CirebonUCS.addTetangga(BekasiUCS, 90);

BekasiUCS.addTetangga(CirebonUCS, 90); 
BekasiUCS.addTetangga(DepokUCS, 40);
BekasiUCS.addTetangga(JakartaUCS, 30);

DepokUCS.addTetangga(BogorUCS, 40);
DepokUCS.addTetangga(BekasiUCS, 40);
DepokUCS.addTetangga(JakartaUCS, 20);

CilegonUCS.addTetangga(SerangUCS, 30);

SerangUCS.addTetangga(CilegonUCS, 30);
SerangUCS.addTetangga(TangerangUCS, 60);

TangerangUCS.addTetangga(SerangUCS, 60);
TangerangUCS.addTetangga(JakartaUCS, 40);  

JakartaUCS.addTetangga(BekasiUCS, 30);
JakartaUCS.addTetangga(DepokUCS, 20);
JakartaUCS.addTetangga(TangerangUCS, 40);

        // menampilkan hasil dari algoritma A*
        System.out.println("A*");
        // inisialisasi objek AStar
        AStar aStar = new AStar();
        // memanggil fungsi search dari objek aStar dari node CilegonUCS ke SerangUCS
        aStar.search(CilegonUCS, SerangUCS);
        System.out.println();
    }
}
