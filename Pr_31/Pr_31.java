/*
Program Name: Pr_31
Program Description: Simulates a music playlist using LinkedList.
*/

import java.util.*;

public class Pr_31 {
    public static void main(String[] args) {

        LinkedList<String> playlist = new LinkedList<>();

        // Add songs
        playlist.add("Song1");
        playlist.add("Song2");
        playlist.add("Song3");

        // Display playlist
        System.out.println("Playlist: " + playlist);

        // Play first song
        playlist.removeFirst();
        System.out.println("After playing first: " + playlist);

        // Skip last song
        playlist.removeLast();
        System.out.println("After removing last: " + playlist);
    }
}
