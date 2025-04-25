import java.util.ArrayList;

public class BibliotekaMuzyczna {
    private String nazwaKolekcji;
    private String wlasciciel;
    private ArrayList<String> utwory;
    private ArrayList<Playlista> playlisty;

    public BibliotekaMuzyczna(String nazwaKolekcji, String wlasciciel) {
        this.nazwaKolekcji = nazwaKolekcji;
        this.wlasciciel = wlasciciel;
        this.utwory = new ArrayList<>();
        this.playlisty = new ArrayList<>();
    }

    public void dodajUtwor(String utwor) {
        if (!utwory.contains(utwor)) {
            utwory.add(utwor);
        }
    }

    public void usunUtwor(String utwor) {
        if (utwory.remove(utwor)) {
            for (Playlista plista : playlisty) {
                plista.usunUtwor(utwor);
            }
        }
    }

    public void pokazUtwory() {
        for (String utwor : utwory) {
            System.out.println(utwor);
        }
    }

    public void szukajUtwor(String fraza) {
        for (String utwor : utwory) {
            if (utwor.toLowerCase().contains(fraza.toLowerCase())) {
                System.out.println(utwor);
            }
        }
    }

    public void zrobPlayliste(String nazwa) {
        if (znajdzPliste(nazwa) == null) {
            playlisty.add(new Playlista(nazwa));
        }
    }

    private Playlista znajdzPliste(String nazwa) {
        for (Playlista plista : playlisty) {
            if (plista.getNazwa().equals(nazwa)) {
                return plista;
            }
        }
        return null;
    }

    public void dodajDoPlaylisty(String utwor, String nazwaPlisty) {
        Playlista plista = znajdzPliste(nazwaPlisty);
        if (plista != null && utwory.contains(utwor)) {
            plista.dodajUtwor(utwor);
        }
    }

    public void pokazPlayliste(String nazwaPlisty) {
        Playlista plista = znajdzPliste(nazwaPlisty);
        if (plista != null) {
            plista.pokazUtwory();
        }
    }

    public void pokazPlaylisty() {
        for (Playlista plista : playlisty) {
            System.out.println(plista.getNazwa());
        }
    }

    public int getLiczbaUtworow() {
        return utwory.size();
    }

    public int getLiczbaPlaylist() {
        return playlisty.size();
    }
}
