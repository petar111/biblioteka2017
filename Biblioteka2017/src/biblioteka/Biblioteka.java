package biblioteka;

import java.util.LinkedList;

import biblioteka.interfejs.BibliotekaInterfejs;

public class Biblioteka implements BibliotekaInterfejs {
	
	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();
	

	@Override
	public void dodajKnjigu(Knjiga k) {
		knjige.add(k);
	}

	@Override
	public void obrisiKnjigu(Knjiga k) {
		knjige.remove(k);

	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor a, long isbn, String naslov, String izdavac) {
		if(a == null || isbn == 0 || naslov == null || izdavac == null){
			return null;
		}
		
		LinkedList<Knjiga> rezultat = new LinkedList<Knjiga>();
		for(int i = 0; i < knjige.size(); i++){
			if(knjige.get(i).getNaslov().contains(naslov)){
				rezultat.add(knjige.get(i));
			}
		}
		return rezultat;
	}

}
