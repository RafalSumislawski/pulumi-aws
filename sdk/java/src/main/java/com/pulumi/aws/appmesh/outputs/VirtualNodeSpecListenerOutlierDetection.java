// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerOutlierDetectionBaseEjectionDuration;
import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecListenerOutlierDetectionInterval;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class VirtualNodeSpecListenerOutlierDetection {
    /**
     * @return The base amount of time for which a host is ejected.
     * 
     */
    private final VirtualNodeSpecListenerOutlierDetectionBaseEjectionDuration baseEjectionDuration;
    /**
     * @return The time interval between ejection sweep analysis.
     * 
     */
    private final VirtualNodeSpecListenerOutlierDetectionInterval interval;
    /**
     * @return Maximum percentage of hosts in load balancing pool for upstream service that can be ejected. Will eject at least one host regardless of the value.
     * Minimum value of `0`. Maximum value of `100`.
     * 
     */
    private final Integer maxEjectionPercent;
    /**
     * @return Number of consecutive `5xx` errors required for ejection. Minimum value of `1`.
     * 
     */
    private final Integer maxServerErrors;

    @CustomType.Constructor
    private VirtualNodeSpecListenerOutlierDetection(
        @CustomType.Parameter("baseEjectionDuration") VirtualNodeSpecListenerOutlierDetectionBaseEjectionDuration baseEjectionDuration,
        @CustomType.Parameter("interval") VirtualNodeSpecListenerOutlierDetectionInterval interval,
        @CustomType.Parameter("maxEjectionPercent") Integer maxEjectionPercent,
        @CustomType.Parameter("maxServerErrors") Integer maxServerErrors) {
        this.baseEjectionDuration = baseEjectionDuration;
        this.interval = interval;
        this.maxEjectionPercent = maxEjectionPercent;
        this.maxServerErrors = maxServerErrors;
    }

    /**
     * @return The base amount of time for which a host is ejected.
     * 
     */
    public VirtualNodeSpecListenerOutlierDetectionBaseEjectionDuration baseEjectionDuration() {
        return this.baseEjectionDuration;
    }
    /**
     * @return The time interval between ejection sweep analysis.
     * 
     */
    public VirtualNodeSpecListenerOutlierDetectionInterval interval() {
        return this.interval;
    }
    /**
     * @return Maximum percentage of hosts in load balancing pool for upstream service that can be ejected. Will eject at least one host regardless of the value.
     * Minimum value of `0`. Maximum value of `100`.
     * 
     */
    public Integer maxEjectionPercent() {
        return this.maxEjectionPercent;
    }
    /**
     * @return Number of consecutive `5xx` errors required for ejection. Minimum value of `1`.
     * 
     */
    public Integer maxServerErrors() {
        return this.maxServerErrors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerOutlierDetection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecListenerOutlierDetectionBaseEjectionDuration baseEjectionDuration;
        private VirtualNodeSpecListenerOutlierDetectionInterval interval;
        private Integer maxEjectionPercent;
        private Integer maxServerErrors;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerOutlierDetection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseEjectionDuration = defaults.baseEjectionDuration;
    	      this.interval = defaults.interval;
    	      this.maxEjectionPercent = defaults.maxEjectionPercent;
    	      this.maxServerErrors = defaults.maxServerErrors;
        }

        public Builder baseEjectionDuration(VirtualNodeSpecListenerOutlierDetectionBaseEjectionDuration baseEjectionDuration) {
            this.baseEjectionDuration = Objects.requireNonNull(baseEjectionDuration);
            return this;
        }
        public Builder interval(VirtualNodeSpecListenerOutlierDetectionInterval interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        public Builder maxEjectionPercent(Integer maxEjectionPercent) {
            this.maxEjectionPercent = Objects.requireNonNull(maxEjectionPercent);
            return this;
        }
        public Builder maxServerErrors(Integer maxServerErrors) {
            this.maxServerErrors = Objects.requireNonNull(maxServerErrors);
            return this;
        }        public VirtualNodeSpecListenerOutlierDetection build() {
            return new VirtualNodeSpecListenerOutlierDetection(baseEjectionDuration, interval, maxEjectionPercent, maxServerErrors);
        }
    }
}
