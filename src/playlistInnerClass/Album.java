package playlistInnerClass;

import java.util.*;
public class Album {
    private String name;
    private String artist;
    private SongList songList;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    public boolean addSong(String title, double duration){
        return this.songList.add(new Song(title, duration));
    }

    // track -> no of song in Album
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist){
        Song songToAdd = this.songList.findSong(trackNumber -1); // track number start with one
        if (songToAdd != null) {
            playlist.add(songToAdd);
            return true;
        }
        // check song already added
//        ListIterator<Song> iterator = playlist.listIterator();
//        while(iterator.hasNext()){
//            if(iterator.next().getTitle().compareTo(s ongToAdd.getTitle()) == 0){
//                return false;
//            }
//        }
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist){
        // find song by title then add to playlist
        Song songToAdd = this.songList.findSong(title);
        if (songToAdd != null) {
            playlist.add(songToAdd);
            return true;
        }
        // check song already added
        /*ListIterator<Song> iterator = playlist.listIterator();
        while(iterator.hasNext()){
            if(iterator.next().getTitle().equals(title)){
                return false;
            }
        }*/
        return false;
    }



    public static class SongList{
        private ArrayList<Song> songs;

        public SongList(){
            this.songs = new ArrayList<>();
        }

        public boolean add(Song song){
            if(songs.contains(song)){
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String title){
            if(!songs.isEmpty()){
                for(Song song: this.songs){
                    if (song.getTitle().equals(title)){
                        return song;
                    }
                }
            }
            return null;
        }

        private Song findSong(int trackNumber){
            if(trackNumber >= 0 && trackNumber < songs.size()) {
                return songs.get(trackNumber - 1); // track number start with one
            }
            return null;
        }

        public int size() {
            return this.songs.size();
        }
    }
}
