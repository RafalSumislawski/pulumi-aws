// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterDefaultCapacityProviderStrategy {
    /**
     * @return The number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined.
     * 
     */
    private final @Nullable Integer base;
    /**
     * @return The short name of the capacity provider.
     * 
     */
    private final String capacityProvider;
    /**
     * @return The relative percentage of the total number of launched tasks that should use the specified capacity provider.
     * 
     */
    private final @Nullable Integer weight;

    @CustomType.Constructor
    private ClusterDefaultCapacityProviderStrategy(
        @CustomType.Parameter("base") @Nullable Integer base,
        @CustomType.Parameter("capacityProvider") String capacityProvider,
        @CustomType.Parameter("weight") @Nullable Integer weight) {
        this.base = base;
        this.capacityProvider = capacityProvider;
        this.weight = weight;
    }

    /**
     * @return The number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined.
     * 
     */
    public Optional<Integer> base() {
        return Optional.ofNullable(this.base);
    }
    /**
     * @return The short name of the capacity provider.
     * 
     */
    public String capacityProvider() {
        return this.capacityProvider;
    }
    /**
     * @return The relative percentage of the total number of launched tasks that should use the specified capacity provider.
     * 
     */
    public Optional<Integer> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterDefaultCapacityProviderStrategy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer base;
        private String capacityProvider;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterDefaultCapacityProviderStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.base = defaults.base;
    	      this.capacityProvider = defaults.capacityProvider;
    	      this.weight = defaults.weight;
        }

        public Builder base(@Nullable Integer base) {
            this.base = base;
            return this;
        }
        public Builder capacityProvider(String capacityProvider) {
            this.capacityProvider = Objects.requireNonNull(capacityProvider);
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }        public ClusterDefaultCapacityProviderStrategy build() {
            return new ClusterDefaultCapacityProviderStrategy(base, capacityProvider, weight);
        }
    }
}
