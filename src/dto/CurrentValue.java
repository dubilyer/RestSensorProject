package dto;

import java.util.Date;

/**
 * Created by dubilyer on 11/20/16.
 */
public class CurrentValue {
    String id;
    long timestamp;
    Date timestampISO;
    long serverTimestamp;
    Date serverTimestampISO;
    String data;
    String description;
    double quality;

    public CurrentValue(String id, long timestamp, Date timestampISO, long serverTimestamp,
                        Date serverTimestampISO, String data, String description, double quality) {
        this.id = id;
        this.timestamp = timestamp;
        this.timestampISO = timestampISO;
        this.serverTimestamp = serverTimestamp;
        this.serverTimestampISO = serverTimestampISO;
        this.data = data;
        this.description = description;
        this.quality = quality;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public Date getTimestampISO() {
        return timestampISO;
    }

    public void setTimestampISO(Date timestampISO) {
        this.timestampISO = timestampISO;
    }

    public long getServerTimestamp() {
        return serverTimestamp;
    }

    public void setServerTimestamp(long serverTimestamp) {
        this.serverTimestamp = serverTimestamp;
    }

    public Date getServerTimestampISO() {
        return serverTimestampISO;
    }

    public void setServerTimestampISO(Date serverTimestampISO) {
        this.serverTimestampISO = serverTimestampISO;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getQuality() {
        return quality;
    }

    public void setQuality(double quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return "CurrentValue{" +
                "id='" + id + '\'' +
                ", timestamp=" + timestamp +
                ", timestampISO='" + timestampISO + '\'' +
                ", serverTimestamp=" + serverTimestamp +
                ", serverTimestampISO='" + serverTimestampISO + '\'' +
                ", data='" + data + '\'' +
                ", description='" + description + '\'' +
                ", quality=" + quality +
                '}';
    }
}
