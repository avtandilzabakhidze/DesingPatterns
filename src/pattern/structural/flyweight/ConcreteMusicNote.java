package pattern.structural.flyweight;

public class ConcreteMusicNote implements MusicNote {
    private String node;

    public ConcreteMusicNote(String node) {
        this.node = node;
    }

    public String getNode() {
        return node;
    }

    @Override
    public void play() {
        System.out.println("playing node " + node);
    }
}
