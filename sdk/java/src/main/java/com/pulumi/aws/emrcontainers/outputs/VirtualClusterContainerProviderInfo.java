// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.emrcontainers.outputs;

import com.pulumi.aws.emrcontainers.outputs.VirtualClusterContainerProviderInfoEksInfo;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class VirtualClusterContainerProviderInfo {
    /**
     * @return Nested list containing EKS-specific information about the cluster where the EMR Containers cluster is running
     * 
     */
    private final VirtualClusterContainerProviderInfoEksInfo eksInfo;

    @CustomType.Constructor
    private VirtualClusterContainerProviderInfo(@CustomType.Parameter("eksInfo") VirtualClusterContainerProviderInfoEksInfo eksInfo) {
        this.eksInfo = eksInfo;
    }

    /**
     * @return Nested list containing EKS-specific information about the cluster where the EMR Containers cluster is running
     * 
     */
    public VirtualClusterContainerProviderInfoEksInfo eksInfo() {
        return this.eksInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualClusterContainerProviderInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualClusterContainerProviderInfoEksInfo eksInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualClusterContainerProviderInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eksInfo = defaults.eksInfo;
        }

        public Builder eksInfo(VirtualClusterContainerProviderInfoEksInfo eksInfo) {
            this.eksInfo = Objects.requireNonNull(eksInfo);
            return this;
        }        public VirtualClusterContainerProviderInfo build() {
            return new VirtualClusterContainerProviderInfo(eksInfo);
        }
    }
}
