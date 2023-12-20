package pattern.creational.builder;


import java.util.ArrayList;
import java.util.List;

public class Builder {
    private String wallMaterial;
    private String floorType;
    private boolean hasSwimmingPool;
    private boolean hasGarden;
    private List<Room> rooms;

    public Builder() {
        this.rooms = new ArrayList<>();
    }

    public Builder setWallMaterial(String wallMaterial) {
        this.wallMaterial = wallMaterial;
        return this;
    }

    public Builder setFloorType(String floorType) {
        this.floorType = floorType;
        return this;
    }

    public Builder addSwimmingPool() {
        this.hasSwimmingPool = true;
        return this;
    }

    public Builder addGarden() {
        this.hasGarden = true;
        return this;
    }

    public Builder addRoom(Room room) {
        this.rooms.add(room);
        return this;
    }

    @Override
    public String toString() {
        return "Builder{" +
                "wallMaterial='" + wallMaterial + '\'' +
                ", floorType='" + floorType + '\'' +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                ", rooms=" + rooms +
                '}';
    }
}