// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter {
    /**
     * @return Parameter name. Valid Values: `LambdaArn`, `NumberOfRetries`, `MetadataExtractionQuery`, `JsonParsingEngine`, `RoleArn`, `BufferSizeInMBs`, `BufferIntervalInSeconds`, `SubRecordType`, `Delimiter`. Validation is done against [AWS SDK constants](https://docs.aws.amazon.com/sdk-for-go/api/service/firehose/#pkg-constants); so that values not explicitly listed may also work.
     * 
     */
    private final String parameterName;
    /**
     * @return Parameter value. Must be between 1 and 512 length (inclusive). When providing a Lambda ARN, you should specify the resource version as well.
     * 
     */
    private final String parameterValue;

    @CustomType.Constructor
    private FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter(
        @CustomType.Parameter("parameterName") String parameterName,
        @CustomType.Parameter("parameterValue") String parameterValue) {
        this.parameterName = parameterName;
        this.parameterValue = parameterValue;
    }

    /**
     * @return Parameter name. Valid Values: `LambdaArn`, `NumberOfRetries`, `MetadataExtractionQuery`, `JsonParsingEngine`, `RoleArn`, `BufferSizeInMBs`, `BufferIntervalInSeconds`, `SubRecordType`, `Delimiter`. Validation is done against [AWS SDK constants](https://docs.aws.amazon.com/sdk-for-go/api/service/firehose/#pkg-constants); so that values not explicitly listed may also work.
     * 
     */
    public String parameterName() {
        return this.parameterName;
    }
    /**
     * @return Parameter value. Must be between 1 and 512 length (inclusive). When providing a Lambda ARN, you should specify the resource version as well.
     * 
     */
    public String parameterValue() {
        return this.parameterValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String parameterName;
        private String parameterValue;

        public Builder() {
    	      // Empty
        }

        public Builder(FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterName = defaults.parameterName;
    	      this.parameterValue = defaults.parameterValue;
        }

        public Builder parameterName(String parameterName) {
            this.parameterName = Objects.requireNonNull(parameterName);
            return this;
        }
        public Builder parameterValue(String parameterValue) {
            this.parameterValue = Objects.requireNonNull(parameterValue);
            return this;
        }        public FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter build() {
            return new FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter(parameterName, parameterValue);
        }
    }
}
