// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration {
    /**
     * @return The starting position on the stream. Valid values: `LAST_STOPPED_POINT`, `NOW`, `TRIM_HORIZON`.
     * 
     */
    private final @Nullable String inputStartingPosition;

    @CustomType.Constructor
    private ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration(@CustomType.Parameter("inputStartingPosition") @Nullable String inputStartingPosition) {
        this.inputStartingPosition = inputStartingPosition;
    }

    /**
     * @return The starting position on the stream. Valid values: `LAST_STOPPED_POINT`, `NOW`, `TRIM_HORIZON`.
     * 
     */
    public Optional<String> inputStartingPosition() {
        return Optional.ofNullable(this.inputStartingPosition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String inputStartingPosition;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputStartingPosition = defaults.inputStartingPosition;
        }

        public Builder inputStartingPosition(@Nullable String inputStartingPosition) {
            this.inputStartingPosition = inputStartingPosition;
            return this;
        }        public ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration(inputStartingPosition);
        }
    }
}
