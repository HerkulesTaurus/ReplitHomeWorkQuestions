package kutuphane;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Kitapİslemleri {

	static List<Kitap> kitaplar = new ArrayList<>();
	
	public void kitapEkle(Kitap ktp) {
		kitaplar.add(ktp);
	}
	public  void kitapSil(String  isnbNo) {
		for (Kitap oAnkiKitap:kitaplar) {
			if (oAnkiKitap.getKitapIsbnNo().equals(isnbNo)) {
				kitaplar.remove(oAnkiKitap);
				System.out.println("kitap silme islemi basarili");
				break;				
			}else {
				System.out.println("kitap bulunamadi");
			}
			
		}
		
	}
	
	public static void kitapBul(String kitapIsmi) {
		
		kitaplar.stream().filter(t->t.getKitapAdi().equalsIgnoreCase(kitapIsmi)).
		
		for(Kitap oAnkiKitap: kitaplar)
			
	if (oAnkiKitap.getKitapAdi().equalsIgnoreCase(kitapIsmi)) {
		System.out.println("kitap bulundu");
		oAnkiKitap.kitapBilgileri();
	}else { 
		System.out.println("kıtap bulunamadı");
	}	
		
	}
	public  void tumKitaplariGoster() {
		kitaplar.stream().forEach(Kitap::kitapBilgileri);
		
	}
}
