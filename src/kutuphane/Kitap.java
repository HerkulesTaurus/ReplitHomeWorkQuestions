package kutuphane;

public class Kitap {

	
 private String kitapAdi;
 private String kitapIsbnNo;
 private String aciklama;
 private Yazar yazar;
 private Yayinevi yayinevi;
 
public String getKitapAdi() {
	return kitapAdi;
}
public void setKitapAdi(String kitapAdi) {
	this.kitapAdi = kitapAdi;
}
public String getKitapIsbnNo() {
	return kitapIsbnNo;
}
public void setKitapIsbnNo(String kitapIsbnNo) {
	this.kitapIsbnNo = kitapIsbnNo;
}
public String getAciklama() {
	return aciklama;
}
public void setAciklama(String aciklama) {
	this.aciklama = aciklama;
}
public Yazar getYazar() {
	return yazar;
}
public void setYazar(Yazar yazar) {
	this.yazar = yazar;
}
public Yayinevi getYayinevi() {
	return yayinevi;
}
public void setYayinevi(Yayinevi yayinevi) {
	this.yayinevi = yayinevi;
}
public Kitap(String kitapAdi, String kitapIsbnNo, String aciklama, Yazar yazar, Yayinevi yayinevi) {
	super();
	this.kitapAdi = kitapAdi;
	this.kitapIsbnNo = kitapIsbnNo;
	this.aciklama = aciklama;
	this.yazar = yazar;
	this.yayinevi = yayinevi;
}
	public Kitap() {
		
	}
	public String kitapBilgileri() {
		return "Kitap [kitapAdi=" + kitapAdi + ", kitapIsbnNo=" + kitapIsbnNo + ", aciklama=" + aciklama + ", yazar="
				+ yazar + ", yayinevi=" + yayinevi + "]" ;
	}
 
 
}
