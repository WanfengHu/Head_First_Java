package Chapter16;

import java.util.*;
import java.io.*;

public class JukeBox2 {
    ArrayList<String> songList = new ArrayList<String>();

    public static void main(String[] args) {
        new JukeBox2().go();
    }

    public void go() {
        getSong();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }

    void getSong() {
        try {
            File file = new File("Chapter16/SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        songList.add(tokens[0]);
    } 
} 