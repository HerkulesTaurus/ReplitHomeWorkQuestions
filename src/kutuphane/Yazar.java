package kutuphane;

public class Yazar {

	
	private String yazarAdi;
	private String yas;
	private String yazarMemleketi;
	
	
	
	public String getYazarAdi() {
		return yazarAdi;
	}
	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}
	public String getYas() {
		return yas;
	}
	public void setYas(String yas) {
		this.yas = yas;
	}
	public String getYazarMemleketi() {
		return yazarMemleketi;
	}
	public void setYazarMemleketi(String yazarMemleketi) {
		this.yazarMemleketi = yazarMemleketi;
	}
	
	public Yazar(String yazarAdi, String yas, String yazarMemleketi) {
		super();
		this.yazarAdi = yazarAdi;
		this.yas = yas;
		this.yazarMemleketi = yazarMemleketi;
	}
	public Yazar() {
		
	}
	public String yazarBilgileriGetir() {
	 return "Yazar [yazarAdi=" + yazarAdi + ", yas=" + yas + ", yazarMemleketi=" + yazarMemleketi + "]";
	}
	
}
