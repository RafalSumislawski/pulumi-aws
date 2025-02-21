// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleActionForwardStickinessArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerRuleActionForwardStickinessArgs Empty = new ListenerRuleActionForwardStickinessArgs();

    /**
     * The time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
     * 
     */
    @Import(name="duration", required=true)
    private Output<Integer> duration;

    /**
     * @return The time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
     * 
     */
    public Output<Integer> duration() {
        return this.duration;
    }

    /**
     * Indicates whether target group stickiness is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Indicates whether target group stickiness is enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private ListenerRuleActionForwardStickinessArgs() {}

    private ListenerRuleActionForwardStickinessArgs(ListenerRuleActionForwardStickinessArgs $) {
        this.duration = $.duration;
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerRuleActionForwardStickinessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerRuleActionForwardStickinessArgs $;

        public Builder() {
            $ = new ListenerRuleActionForwardStickinessArgs();
        }

        public Builder(ListenerRuleActionForwardStickinessArgs defaults) {
            $ = new ListenerRuleActionForwardStickinessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param duration The time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
         * 
         * @return builder
         * 
         */
        public Builder duration(Output<Integer> duration) {
            $.duration = duration;
            return this;
        }

        /**
         * @param duration The time period, in seconds, during which requests from a client should be routed to the same target group. The range is 1-604800 seconds (7 days).
         * 
         * @return builder
         * 
         */
        public Builder duration(Integer duration) {
            return duration(Output.of(duration));
        }

        /**
         * @param enabled Indicates whether target group stickiness is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Indicates whether target group stickiness is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ListenerRuleActionForwardStickinessArgs build() {
            $.duration = Objects.requireNonNull($.duration, "expected parameter 'duration' to be non-null");
            return $;
        }
    }

}
