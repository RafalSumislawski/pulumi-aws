// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class VirtualNodeSpecListenerConnectionPoolTcp {
    /**
     * @return Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    private final Integer maxConnections;

    @CustomType.Constructor
    private VirtualNodeSpecListenerConnectionPoolTcp(@CustomType.Parameter("maxConnections") Integer maxConnections) {
        this.maxConnections = maxConnections;
    }

    /**
     * @return Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster. Minimum value of `1`.
     * 
     */
    public Integer maxConnections() {
        return this.maxConnections;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecListenerConnectionPoolTcp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxConnections;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecListenerConnectionPoolTcp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxConnections = defaults.maxConnections;
        }

        public Builder maxConnections(Integer maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }        public VirtualNodeSpecListenerConnectionPoolTcp build() {
            return new VirtualNodeSpecListenerConnectionPoolTcp(maxConnections);
        }
    }
}
