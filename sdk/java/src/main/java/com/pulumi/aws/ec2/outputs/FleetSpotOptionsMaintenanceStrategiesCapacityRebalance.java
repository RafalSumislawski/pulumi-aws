// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FleetSpotOptionsMaintenanceStrategiesCapacityRebalance {
    /**
     * @return The replacement strategy to use. Only available for fleets of `type` set to `maintain`. Valid values: `launch`.
     * 
     */
    private final @Nullable String replacementStrategy;

    @CustomType.Constructor
    private FleetSpotOptionsMaintenanceStrategiesCapacityRebalance(@CustomType.Parameter("replacementStrategy") @Nullable String replacementStrategy) {
        this.replacementStrategy = replacementStrategy;
    }

    /**
     * @return The replacement strategy to use. Only available for fleets of `type` set to `maintain`. Valid values: `launch`.
     * 
     */
    public Optional<String> replacementStrategy() {
        return Optional.ofNullable(this.replacementStrategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetSpotOptionsMaintenanceStrategiesCapacityRebalance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String replacementStrategy;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetSpotOptionsMaintenanceStrategiesCapacityRebalance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replacementStrategy = defaults.replacementStrategy;
        }

        public Builder replacementStrategy(@Nullable String replacementStrategy) {
            this.replacementStrategy = replacementStrategy;
            return this;
        }        public FleetSpotOptionsMaintenanceStrategiesCapacityRebalance build() {
            return new FleetSpotOptionsMaintenanceStrategiesCapacityRebalance(replacementStrategy);
        }
    }
}
