// Objectives
// Create your first HashMap.
// Iterate over a HashMap.

// Tasks:
// Create a trackList of type HashMap
// Add in at least 4 songs that are stored by title
// Pull out one of the songs by its track title
// Print out all the track names and lyrics in the format Track: Lyrics

import java.util.HashMap;
import java.util.Set;

public class mapTest {
public static void main(String[] args) {
  HashMap<String, String> trackList = new HashMap<String, String>();
  trackList.put("Real Slim Shady", "plz stand up...");
  trackList.put("YMCA", "Young Mens Christian Academy");
  trackList.put("All the Small Things", "She left me roses by the stairs, surprises let me know she coires");
  String lyrics = trackList.get("YMCA");
  // get the keys by using the keySet method
  Set<String> keys = trackList.keySet();
  for(String key : keys) {
    System.out.println(key);
    System.out.println(trackList.get(key));
    }
    System.out.println(lyrics);
  }
}
