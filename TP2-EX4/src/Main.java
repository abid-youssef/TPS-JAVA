

import java.util.ArrayList;

class Song {
    private String title;
    private String artist;
    private int lengthInSeconds;

    public Song(String title, String artist, int lengthInSeconds) {
        this.title = title;
        this.artist = artist;
        this.lengthInSeconds = lengthInSeconds;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getLengthInSeconds() {
        return lengthInSeconds;
    }

    public void playSong() {
        System.out.println("Playing " + title + " by " + artist);
    }

    public void getSongLength() {
        System.out.println("The song is " + lengthInSeconds + " seconds long");
    }
}

class Album{
    private String albumName;
    private ArrayList<Song> songs;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songs = new ArrayList<Song>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public void listSongs() {
        for (int i = 0; i < songs.size(); i++) {
            System.out.println(songs.get(i).getTitle());
        }
    }
}

class Artist{
    private String artistName;
    private ArrayList<Album> albums;

    public Artist(String artistName) {
        this.artistName = artistName;
        this.albums = new ArrayList<Album>();
    }

    public String getArtistName() {
        return artistName;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void addAlbum(Album album) {
        albums.add(album);
    }

    public void removeAlbum(Album album) {
        albums.remove(album);
    }

    public void listAlbums() {
        for (int i = 0; i < albums.size(); i++) {
            System.out.println(albums.get(i).getAlbumName());
        }
    }
}

interface User {
    public void listen(Song song);
    public void addToPlaylist(Song song);
    public void removeFromPlaylist(Song song);

}

class FreeUser implements User {
    private String username;
    private Playlist playlist;

    public FreeUser(String username) {
        this.username = username;
        this.playlist = new Playlist(this);}

    public String getUsername() {
        return username;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void listen(Song song) {
        song.playSong();
    }

    public void addToPlaylist(Song song) {
        System.out.println("You must be a premium user to add songs to your playlist");
    }

    public void removeFromPlaylist(Song song) {
        System.out.println("You must be a premium user to remove songs from your playlist");
    }




}

class PremiumUser implements User {
    private String username;
    private Playlist playlist;

    public PremiumUser(String username) {
        this.username = username;
        this.playlist = new Playlist(this);}

    public String getUsername() {
        return username;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void listen(Song song) {
        song.playSong();
    }

    public void addToPlaylist(Song song) {
        playlist.addSong(song);
    }

    public void removeFromPlaylist(Song song) {
        playlist.removeSong(song);
    }
}
class Playlist {
    private User user;
    private ArrayList<Song> songs;

    public Playlist(User user) {
        this.user = user;
        this.songs = new ArrayList<Song>();
    }

    public User getUser() {
        return user;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public void shuffleSongs() {
        for (int i = 0; i < songs.size(); i++) {
            int randomIndex = (int) (Math.random() * songs.size());
            Song temp = songs.get(i);
            songs.set(i, songs.get(randomIndex));
            songs.set(randomIndex, temp);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Song 1", "1", 180);
        Song song2 = new Song("Song 2", "2", 200);
        Song song3 = new Song("Song 3", "3", 90000);
        Song song4 = new Song("Song 4", "4", 240);
        Song song5 = new Song("Song 5", "5", 200);

        Album album1 = new Album("Album 1");
        album1.addSong(song1);
        album1.addSong(song2);
        album1.addSong(song3);

        Album album2 = new Album("Album 2");
        album2.addSong(song4);
        album2.addSong(song5);

        Artist artist1 = new Artist("Artist 1");
        artist1.addAlbum(album1);
        artist1.addAlbum(album2);

        PremiumUser user1 = new PremiumUser("User 1");
        user1.addToPlaylist(song1);
        user1.addToPlaylist(song2);
        user1.addToPlaylist(song3);
        user1.addToPlaylist(song4);
        user1.addToPlaylist(song5);
        user1.removeFromPlaylist(song1);

        FreeUser user2 = new FreeUser("User 2");
        user2.addToPlaylist(song1);
        user2.addToPlaylist(song2);

        user1.getPlaylist().shuffleSongs();
        user2.getPlaylist().shuffleSongs();

        }
    }
