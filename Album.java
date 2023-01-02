package linked_list;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }


    public  boolean addSong(String title,double duration) {

        Song songObj=new Song(title,duration);
        if(findSong(title) ==null){
            this.songs.add(songObj);
            return true;

        }
        return  false;

    }

    private Song findSong(String song){
        for(int i=0;i<songs.size();i++){
  Song songObj=this.songs.get(i);
  if(songObj.getTitle().equals(song)){
      return songObj;
  }

        }
        return  null;

    }

    public  boolean addToPlayList(int trackNum, List<Song> playList){
        int index=trackNum-1;

        if(index >= 0 && (index<=this.songs.size())) {
            playList.add(this.songs.get(index));

            return  true;
        }
        System.out.println("This album does not have a track " + trackNum);
        return false;

    }


    public  boolean addToPlayList(String titleSong,List<Song> playList){
  Song song=findSong(titleSong);
        if(song!=null){
            playList.add(song);
            return true;
        }

        System.out.println("The song " + titleSong + " is not in this album");
        return  false;

    }
}
