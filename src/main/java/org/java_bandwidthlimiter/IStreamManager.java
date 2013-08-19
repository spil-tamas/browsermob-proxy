package org.java_bandwidthlimiter;

public interface IStreamManager {

    /**
     * Calling this method to start throttling all registered streams.
     * By default the StreamManager is disabled
     */
    public abstract void enable();

    /**
     * Calling this method to stop throttling all registered streams.
     * By default the StreamManager is disabled
     */
    public abstract void disable();

    /**
     * To take into account overhead due to underlying protocols (e.g. TCP/IP)
     * @param payloadPercentage a  ] 0 , 100] value. where 100 means that the required
     *                          downstream/upstream bandwidth will be full used for
     *                          sending payload.
     *                          Default value is 95%.
     *                          The default value is applied if an out of boundaries value is passed in.
     */
    public abstract void setPayloadPercentage(int payloadPercentage);

    /**
     * This function sets the max bits per second threshold
     * {@link #setDownstreamKbps} and {@link #setDownstreamKbps(long)} won't be allowed
     * to set a bandwidth higher than what specified here.
     * @param maxBitsPerSecond The max bits per seconds you want this instance of StreamManager to respect.
     */
    public abstract void setMaxBitsPerSecondThreshold(long maxBitsPerSecond);

}
