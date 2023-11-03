package id.ac.unpas.ib.latihan.searching;

public class MainTest {
    public static void main(String[] args) {
// Membuat Node kota di Jawa Barat
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

// Menambahkan tetangga 
Bogor.addTetangga(Sukabumi, true);
Bogor.addTetangga(Depok, false);

Sukabumi.addTetangga(Cianjur, true);
Sukabumi.addTetangga(Bogor, false);

Cianjur.addTetangga(Sukabumi, false);
Cianjur.addTetangga(Bandung, true);  

Bandung.addTetangga(Cianjur, false);
Bandung.addTetangga(Cimahi, true);
Bandung.addTetangga(Tasikmalaya, false);

Cimahi.addTetangga(Bandung, false);

Tasikmalaya.addTetangga(Bandung, true);
Tasikmalaya.addTetangga(Cirebon, false);

Cirebon.addTetangga(Tasikmalaya, true); 
Cirebon.addTetangga(Bekasi, false);

Bekasi.addTetangga(Cirebon, true);
Bekasi.addTetangga(Depok, false);
Bekasi.addTetangga(Jakarta, true);  

Depok.addTetangga(Bogor, true);
Depok.addTetangga(Bekasi, false);
Depok.addTetangga(Jakarta, false);

Cilegon.addTetangga(Serang, true);

Serang.addTetangga(Cilegon, false);
Serang.addTetangga(Tangerang, true);

Tangerang.addTetangga(Serang, false);  
Tangerang.addTetangga(Jakarta, true);

Jakarta.addTetangga(Bekasi, false);
Jakarta.addTetangga(Depok, true);
Jakarta.addTetangga(Tangerang, false);


// Instansiasi DLS
DepthLimitedSearch dls = new DepthLimitedSearch();

dls.setLimit(10);

// Cari jalur dari Bogor ke Bandung
dls.search(Bogor, Bandung); 

System.out.println();

// Cari jalur dari Bandung ke Bogor  
dls.search(Bandung, Bogor);
    }
}
