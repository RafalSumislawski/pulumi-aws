// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mskconnect.outputs;

import com.pulumi.aws.mskconnect.outputs.ConnectorKafkaClusterApacheKafkaClusterVpc;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectorKafkaClusterApacheKafkaCluster {
    /**
     * @return The bootstrap servers of the cluster.
     * 
     */
    private final String bootstrapServers;
    /**
     * @return Details of an Amazon VPC which has network connectivity to the Apache Kafka cluster.
     * 
     */
    private final ConnectorKafkaClusterApacheKafkaClusterVpc vpc;

    @CustomType.Constructor
    private ConnectorKafkaClusterApacheKafkaCluster(
        @CustomType.Parameter("bootstrapServers") String bootstrapServers,
        @CustomType.Parameter("vpc") ConnectorKafkaClusterApacheKafkaClusterVpc vpc) {
        this.bootstrapServers = bootstrapServers;
        this.vpc = vpc;
    }

    /**
     * @return The bootstrap servers of the cluster.
     * 
     */
    public String bootstrapServers() {
        return this.bootstrapServers;
    }
    /**
     * @return Details of an Amazon VPC which has network connectivity to the Apache Kafka cluster.
     * 
     */
    public ConnectorKafkaClusterApacheKafkaClusterVpc vpc() {
        return this.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorKafkaClusterApacheKafkaCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bootstrapServers;
        private ConnectorKafkaClusterApacheKafkaClusterVpc vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorKafkaClusterApacheKafkaCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bootstrapServers = defaults.bootstrapServers;
    	      this.vpc = defaults.vpc;
        }

        public Builder bootstrapServers(String bootstrapServers) {
            this.bootstrapServers = Objects.requireNonNull(bootstrapServers);
            return this;
        }
        public Builder vpc(ConnectorKafkaClusterApacheKafkaClusterVpc vpc) {
            this.vpc = Objects.requireNonNull(vpc);
            return this;
        }        public ConnectorKafkaClusterApacheKafkaCluster build() {
            return new ConnectorKafkaClusterApacheKafkaCluster(bootstrapServers, vpc);
        }
    }
}
