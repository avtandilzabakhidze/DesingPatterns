package pattern.structural.flyweight;

public class MusicNoteFactory {
    private static final int NODE_POOL_SIZE = 12;
    private static final MusicNote[] nodes = new MusicNote[NODE_POOL_SIZE];

    public static MusicNote getMusicNote(String note) {
        int index = Math.abs(note.hashCode()) % NODE_POOL_SIZE;
        if (nodes[index] == null) {
            nodes[index] = new ConcreteMusicNote(note);
        }
        return nodes[index];
    }
}
