package id.ac.unpas.ib.latihan.heuristik.greedybfs;

// Main program
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
// menambahkan tetangga dari masing-masing node
BogorUCS.addTetangga(SukabumiUCS);
BogorUCS.addTetangga(DepokUCS);

SukabumiUCS.addTetangga(CianjurUCS);
SukabumiUCS.addTetangga(BogorUCS);  

CianjurUCS.addTetangga(SukabumiUCS); 
CianjurUCS.addTetangga(BandungUCS);

BandungUCS.addTetangga(CianjurUCS);
BandungUCS.addTetangga(CimahiUCS);
BandungUCS.addTetangga(TasikmalayaUCS);

CimahiUCS.addTetangga(BandungUCS);

TasikmalayaUCS.addTetangga(BandungUCS);
TasikmalayaUCS.addTetangga(CirebonUCS);

CirebonUCS.addTetangga(TasikmalayaUCS);
CirebonUCS.addTetangga(BekasiUCS);

BekasiUCS.addTetangga(CirebonUCS);
BekasiUCS.addTetangga(DepokUCS); 
BekasiUCS.addTetangga(JakartaUCS);

DepokUCS.addTetangga(BogorUCS);
DepokUCS.addTetangga(BekasiUCS);
DepokUCS.addTetangga(JakartaUCS);  

CilegonUCS.addTetangga(SerangUCS);

SerangUCS.addTetangga(CilegonUCS); 
SerangUCS.addTetangga(TangerangUCS);

TangerangUCS.addTetangga(SerangUCS);
TangerangUCS.addTetangga(JakartaUCS);

JakartaUCS.addTetangga(BekasiUCS);
JakartaUCS.addTetangga(DepokUCS);
JakartaUCS.addTetangga(TangerangUCS);

// menampilkan hasil dari algoritma Greedy BFS
System.out.println("Greedy BFS");
GreedyBestFirstSearch bfs = new GreedyBestFirstSearch();
bfs.search(BogorUCS, BandungUCS); 
System.out.println();
    }
}