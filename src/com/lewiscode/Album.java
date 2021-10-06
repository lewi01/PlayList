package com.lewiscode;

import java.util.ArrayList;
import java.util.LinkedList;
public class Album {
    private String name;
    private String artist;
    private final ArrayList<Song>songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }
    public boolean addSong(String titleOfSong,double durationOfSong){
        Song song = new Song(titleOfSong,durationOfSong);
        if (findSong(titleOfSong) == null){
            songs.add(song);
           return true;
        }else {
            return false;
        }
    }
    private Song findSong(String titleOfSong){
        for (int i=0;i<songs.size();i++){
            if (songs.get(i).getTitle().equals(titleOfSong)){
                System.out.println( songs.get(i).getTitle() + "," + songs.get(i).getDuration());
            }
        }
        return null;
    }
    public boolean addToPlayList(int trackNoOfSong, LinkedList<Song> thePlayList){
        int index = trackNoOfSong-1;
        if (index >= 0 &&index <= this.songs.size()){
            thePlayList.add(this.songs.get(index));
            return true;
        }
        return false;
    }
    public boolean addToPlayList(String titleOfSong, LinkedList<Song> thePlayList){
        if (findSong(titleOfSong) !=null){
          thePlayList.add(findSong(titleOfSong));
          return true;
        }
        return false;
    }
}
