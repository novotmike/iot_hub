package cz.iot.local;


/**
 * Created by Michal on 13. 7. 2015.
 */
public class Packet {

    private Identifier UUID;
    private String payload;

    public Packet(String UUID, String payload) {
        this.UUID = new Identifier(UUID);
        this.payload = payload;
    }

    //TO-DO

    public Identifier getUUID() {
        return UUID;
    }

    public String getPayload() {
        return payload;
    }

    @Override
    public String toString() {
        return "Packet{" +
                "UUID=" + UUID +
                ", payload='" + payload + '\'' +
                '}';
    }
}
