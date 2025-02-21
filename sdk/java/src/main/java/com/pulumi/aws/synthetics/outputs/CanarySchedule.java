// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.synthetics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CanarySchedule {
    /**
     * @return Duration in seconds, for the canary to continue making regular runs according to the schedule in the Expression value.
     * 
     */
    private final @Nullable Integer durationInSeconds;
    /**
     * @return Rate expression or cron expression that defines how often the canary is to run. For rate expression, the syntax is `rate(number unit)`. _unit_ can be `minute`, `minutes`, or `hour`. For cron expression, the syntax is `cron(expression)`. For more information about the syntax for cron expressions, see [Scheduling canary runs using cron](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_cron.html).
     * 
     */
    private final String expression;

    @CustomType.Constructor
    private CanarySchedule(
        @CustomType.Parameter("durationInSeconds") @Nullable Integer durationInSeconds,
        @CustomType.Parameter("expression") String expression) {
        this.durationInSeconds = durationInSeconds;
        this.expression = expression;
    }

    /**
     * @return Duration in seconds, for the canary to continue making regular runs according to the schedule in the Expression value.
     * 
     */
    public Optional<Integer> durationInSeconds() {
        return Optional.ofNullable(this.durationInSeconds);
    }
    /**
     * @return Rate expression or cron expression that defines how often the canary is to run. For rate expression, the syntax is `rate(number unit)`. _unit_ can be `minute`, `minutes`, or `hour`. For cron expression, the syntax is `cron(expression)`. For more information about the syntax for cron expressions, see [Scheduling canary runs using cron](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Synthetics_Canaries_cron.html).
     * 
     */
    public String expression() {
        return this.expression;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanarySchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer durationInSeconds;
        private String expression;

        public Builder() {
    	      // Empty
        }

        public Builder(CanarySchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationInSeconds = defaults.durationInSeconds;
    	      this.expression = defaults.expression;
        }

        public Builder durationInSeconds(@Nullable Integer durationInSeconds) {
            this.durationInSeconds = durationInSeconds;
            return this;
        }
        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }        public CanarySchedule build() {
            return new CanarySchedule(durationInSeconds, expression);
        }
    }
}
