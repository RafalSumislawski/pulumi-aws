// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleSourceSourceDetail {
    /**
     * @return The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWSresources. This defaults to `aws.config` and is the only valid value.
     * 
     */
    private final @Nullable String eventSource;
    /**
     * @return The frequency that you want AWS Config to run evaluations for a rule that istriggered periodically. If specified, requires `message_type` to be `ScheduledNotification`.
     * 
     */
    private final @Nullable String maximumExecutionFrequency;
    /**
     * @return The type of notification that triggers AWS Config to run an evaluation for a rule. You canspecify the following notification types:
     * 
     */
    private final @Nullable String messageType;

    @CustomType.Constructor
    private RuleSourceSourceDetail(
        @CustomType.Parameter("eventSource") @Nullable String eventSource,
        @CustomType.Parameter("maximumExecutionFrequency") @Nullable String maximumExecutionFrequency,
        @CustomType.Parameter("messageType") @Nullable String messageType) {
        this.eventSource = eventSource;
        this.maximumExecutionFrequency = maximumExecutionFrequency;
        this.messageType = messageType;
    }

    /**
     * @return The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWSresources. This defaults to `aws.config` and is the only valid value.
     * 
     */
    public Optional<String> eventSource() {
        return Optional.ofNullable(this.eventSource);
    }
    /**
     * @return The frequency that you want AWS Config to run evaluations for a rule that istriggered periodically. If specified, requires `message_type` to be `ScheduledNotification`.
     * 
     */
    public Optional<String> maximumExecutionFrequency() {
        return Optional.ofNullable(this.maximumExecutionFrequency);
    }
    /**
     * @return The type of notification that triggers AWS Config to run an evaluation for a rule. You canspecify the following notification types:
     * 
     */
    public Optional<String> messageType() {
        return Optional.ofNullable(this.messageType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleSourceSourceDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eventSource;
        private @Nullable String maximumExecutionFrequency;
        private @Nullable String messageType;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleSourceSourceDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventSource = defaults.eventSource;
    	      this.maximumExecutionFrequency = defaults.maximumExecutionFrequency;
    	      this.messageType = defaults.messageType;
        }

        public Builder eventSource(@Nullable String eventSource) {
            this.eventSource = eventSource;
            return this;
        }
        public Builder maximumExecutionFrequency(@Nullable String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }
        public Builder messageType(@Nullable String messageType) {
            this.messageType = messageType;
            return this;
        }        public RuleSourceSourceDetail build() {
            return new RuleSourceSourceDetail(eventSource, maximumExecutionFrequency, messageType);
        }
    }
}
