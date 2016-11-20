package dto;

/**
 * Created by dubilyer on 11/20/16.
 */
public class DataStream {
    String cstId;
    String streamId;
    String dataType;
    String forwardTo;
    CurrentValue currentValue;
    String description;
    String units;
    long dataTtl;
    long rollupTtl;

    public DataStream(String cstId, String streamId, String dataType, String forwardTo, CurrentValue currentValue,
                      String description, String units, long dataTtl, long rollupTtl) {
        this.cstId = cstId;
        this.streamId = streamId;
        this.dataType = dataType;
        this.forwardTo = forwardTo;
        this.currentValue = currentValue;
        this.description = description;
        this.units = units;
        this.dataTtl = dataTtl;
        this.rollupTtl = rollupTtl;
    }

    public String getCstId() {
        return cstId;
    }

    public void setCstId(String cstId) {
        this.cstId = cstId;
    }

    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getForwardTo() {
        return forwardTo;
    }

    public void setForwardTo(String forwardTo) {
        this.forwardTo = forwardTo;
    }

    public CurrentValue getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(CurrentValue currentValue) {
        this.currentValue = currentValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public long getDataTtl() {
        return dataTtl;
    }

    public void setDataTtl(long dataTtl) {
        this.dataTtl = dataTtl;
    }

    public long getRollupTtl() {
        return rollupTtl;
    }

    public void setRollupTtl(long rollupTtl) {
        this.rollupTtl = rollupTtl;
    }

    @Override
    public String toString() {
        return "DataStream{" +
                "cstId='" + cstId + '\'' +
                ", streamId='" + streamId + '\'' +
                ", dataType='" + dataType + '\'' +
                ", forwardTo='" + forwardTo + '\'' +
                ", currentValue=" + currentValue +
                ", description='" + description + '\'' +
                ", units='" + units + '\'' +
                ", dataTtl=" + dataTtl +
                ", rollupTtl=" + rollupTtl +
                '}';
    }
}
