public class Main {
    public static void main(String[] args) {
        BibliotekaMuzyczna mojaBiblioteka = new BibliotekaMuzyczna("Kolekcja Rockowa", "Jan Kowalski");

        mojaBiblioteka.dodajUtwor("Thousand Foot Krutch - The End Is Where We Begin");
        mojaBiblioteka.dodajUtwor("Lady Gaga - Garden Of Eden");
        mojaBiblioteka.dodajUtwor("CHINCHILLA - Little Girl Gone");
        mojaBiblioteka.dodajUtwor("Cassyette - Petrychor");
        mojaBiblioteka.dodajUtwor("Cassyette - Ipecac");
        mojaBiblioteka.dodajUtwor("Lady Gaga - Disease");
        mojaBiblioteka.dodajUtwor("Megara - 11:11");
        mojaBiblioteka.dodajUtwor("Maneskin - FEEL");
        mojaBiblioteka.dodajUtwor("Cassyette - Dear Goth");
        mojaBiblioteka.dodajUtwor("Icon For Hire - Blindside");

        mojaBiblioteka.pokazUtwory();

        mojaBiblioteka.zrobPlayliste("Ulubione");
        mojaBiblioteka.zrobPlayliste("Impreza");

        mojaBiblioteka.dodajDoPlaylisty("Thousand Foot Krutch - The End Is Where We Begin", "Ulubione");
        mojaBiblioteka.dodajDoPlaylisty("Lady Gaga - Garden Of Eden", "Ulubione");
        mojaBiblioteka.dodajDoPlaylisty("Cassyette - Petrychor", "Ulubione");
        mojaBiblioteka.dodajDoPlaylisty("Cassyette - Dear Goth", "Ulubione");
        mojaBiblioteka.dodajDoPlaylisty("Icon For Hire - Blindside", "Ulubione");

        mojaBiblioteka.dodajDoPlaylisty("CHINCHILLA - Little Girl Gone", "Impreza");
        mojaBiblioteka.dodajDoPlaylisty("Megara - 11:11", "Impreza");
        mojaBiblioteka.dodajDoPlaylisty("Maneskin - FEEL", "Impreza");
        mojaBiblioteka.dodajDoPlaylisty("Lady Gaga - Disease", "Impreza");

        mojaBiblioteka.pokazPlaylisty();
        mojaBiblioteka.pokazPlayliste("Ulubione");

        mojaBiblioteka.szukajUtwor("Lady Gaga");

        mojaBiblioteka.usunUtwor("Megara - 11:11");
        mojaBiblioteka.pokazPlayliste("Impreza");

        System.out.println(mojaBiblioteka.getLiczbaUtworow());
        System.out.println(mojaBiblioteka.getLiczbaPlaylist());
    }
}
