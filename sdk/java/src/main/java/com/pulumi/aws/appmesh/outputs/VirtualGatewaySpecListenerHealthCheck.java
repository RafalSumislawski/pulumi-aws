// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualGatewaySpecListenerHealthCheck {
    /**
     * @return The number of consecutive successful health checks that must occur before declaring listener healthy.
     * 
     */
    private final Integer healthyThreshold;
    /**
     * @return The time period in milliseconds between each health check execution.
     * 
     */
    private final Integer intervalMillis;
    /**
     * @return The destination path for the health check request. This is only required if the specified protocol is `http` or `http2`.
     * 
     */
    private final @Nullable String path;
    /**
     * @return The destination port for the health check request. This port must match the port defined in the `port_mapping` for the listener.
     * 
     */
    private final @Nullable Integer port;
    /**
     * @return The protocol for the health check request. Valid values are `http`, `http2`, and `grpc`.
     * 
     */
    private final String protocol;
    /**
     * @return The amount of time to wait when receiving a response from the health check, in milliseconds.
     * 
     */
    private final Integer timeoutMillis;
    /**
     * @return The number of consecutive failed health checks that must occur before declaring a virtual gateway unhealthy.
     * 
     */
    private final Integer unhealthyThreshold;

    @CustomType.Constructor
    private VirtualGatewaySpecListenerHealthCheck(
        @CustomType.Parameter("healthyThreshold") Integer healthyThreshold,
        @CustomType.Parameter("intervalMillis") Integer intervalMillis,
        @CustomType.Parameter("path") @Nullable String path,
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("timeoutMillis") Integer timeoutMillis,
        @CustomType.Parameter("unhealthyThreshold") Integer unhealthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        this.intervalMillis = intervalMillis;
        this.path = path;
        this.port = port;
        this.protocol = protocol;
        this.timeoutMillis = timeoutMillis;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    /**
     * @return The number of consecutive successful health checks that must occur before declaring listener healthy.
     * 
     */
    public Integer healthyThreshold() {
        return this.healthyThreshold;
    }
    /**
     * @return The time period in milliseconds between each health check execution.
     * 
     */
    public Integer intervalMillis() {
        return this.intervalMillis;
    }
    /**
     * @return The destination path for the health check request. This is only required if the specified protocol is `http` or `http2`.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return The destination port for the health check request. This port must match the port defined in the `port_mapping` for the listener.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return The protocol for the health check request. Valid values are `http`, `http2`, and `grpc`.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return The amount of time to wait when receiving a response from the health check, in milliseconds.
     * 
     */
    public Integer timeoutMillis() {
        return this.timeoutMillis;
    }
    /**
     * @return The number of consecutive failed health checks that must occur before declaring a virtual gateway unhealthy.
     * 
     */
    public Integer unhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecListenerHealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer healthyThreshold;
        private Integer intervalMillis;
        private @Nullable String path;
        private @Nullable Integer port;
        private String protocol;
        private Integer timeoutMillis;
        private Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecListenerHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.intervalMillis = defaults.intervalMillis;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.timeoutMillis = defaults.timeoutMillis;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
            return this;
        }
        public Builder intervalMillis(Integer intervalMillis) {
            this.intervalMillis = Objects.requireNonNull(intervalMillis);
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder timeoutMillis(Integer timeoutMillis) {
            this.timeoutMillis = Objects.requireNonNull(timeoutMillis);
            return this;
        }
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }        public VirtualGatewaySpecListenerHealthCheck build() {
            return new VirtualGatewaySpecListenerHealthCheck(healthyThreshold, intervalMillis, path, port, protocol, timeoutMillis, unhealthyThreshold);
        }
    }
}
