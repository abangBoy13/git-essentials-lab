package library;

public class LibrarySearch {
    public boolean matches(String title, String query) {
        return title.toLowerCase().contains(query.toLowerCase());
    }
}
