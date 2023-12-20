package pattern.structural.flyweight;

public class Demo {
    public static void main(String[] args) {
        String[] musicSheet = { "C", "D", "E", "F", "G", "A", "B", "C" };

        // Play music notes using Flyweight pattern
        for (String note : musicSheet) {
            MusicNote musicNote = MusicNoteFactory.getMusicNote(note);
            musicNote.play();
        }
    }
}
