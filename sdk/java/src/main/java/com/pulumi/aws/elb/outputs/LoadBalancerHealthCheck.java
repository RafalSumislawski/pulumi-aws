// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LoadBalancerHealthCheck {
    /**
     * @return The number of checks before the instance is declared healthy.
     * 
     */
    private final Integer healthyThreshold;
    /**
     * @return The interval between checks.
     * 
     */
    private final Integer interval;
    /**
     * @return The target of the check. Valid pattern is &#34;${PROTOCOL}:${PORT}${PATH}&#34;, where PROTOCOL
     * values are:
     * * `HTTP`, `HTTPS` - PORT and PATH are required
     * * `TCP`, `SSL` - PORT is required, PATH is not supported
     * 
     */
    private final String target;
    /**
     * @return The length of time before the check times out.
     * 
     */
    private final Integer timeout;
    /**
     * @return The number of checks before the instance is declared unhealthy.
     * 
     */
    private final Integer unhealthyThreshold;

    @CustomType.Constructor
    private LoadBalancerHealthCheck(
        @CustomType.Parameter("healthyThreshold") Integer healthyThreshold,
        @CustomType.Parameter("interval") Integer interval,
        @CustomType.Parameter("target") String target,
        @CustomType.Parameter("timeout") Integer timeout,
        @CustomType.Parameter("unhealthyThreshold") Integer unhealthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        this.interval = interval;
        this.target = target;
        this.timeout = timeout;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    /**
     * @return The number of checks before the instance is declared healthy.
     * 
     */
    public Integer healthyThreshold() {
        return this.healthyThreshold;
    }
    /**
     * @return The interval between checks.
     * 
     */
    public Integer interval() {
        return this.interval;
    }
    /**
     * @return The target of the check. Valid pattern is &#34;${PROTOCOL}:${PORT}${PATH}&#34;, where PROTOCOL
     * values are:
     * * `HTTP`, `HTTPS` - PORT and PATH are required
     * * `TCP`, `SSL` - PORT is required, PATH is not supported
     * 
     */
    public String target() {
        return this.target;
    }
    /**
     * @return The length of time before the check times out.
     * 
     */
    public Integer timeout() {
        return this.timeout;
    }
    /**
     * @return The number of checks before the instance is declared unhealthy.
     * 
     */
    public Integer unhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerHealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer healthyThreshold;
        private Integer interval;
        private String target;
        private Integer timeout;
        private Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.interval = defaults.interval;
    	      this.target = defaults.target;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
            return this;
        }
        public Builder interval(Integer interval) {
            this.interval = Objects.requireNonNull(interval);
            return this;
        }
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public Builder timeout(Integer timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }        public LoadBalancerHealthCheck build() {
            return new LoadBalancerHealthCheck(healthyThreshold, interval, target, timeout, unhealthyThreshold);
        }
    }
}
