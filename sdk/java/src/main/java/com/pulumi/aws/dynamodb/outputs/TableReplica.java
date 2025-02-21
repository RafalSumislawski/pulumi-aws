// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dynamodb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TableReplica {
    /**
     * @return ARN of the CMK that should be used for the AWS KMS encryption. This attribute should only be specified if the key is different from the default DynamoDB CMK, `alias/aws/dynamodb`.
     * 
     */
    private final @Nullable String kmsKeyArn;
    /**
     * @return Whether to enable Point In Time Recovery for the replica.
     * 
     */
    private final @Nullable Boolean pointInTimeRecovery;
    /**
     * @return Region name of the replica.
     * 
     */
    private final String regionName;

    @CustomType.Constructor
    private TableReplica(
        @CustomType.Parameter("kmsKeyArn") @Nullable String kmsKeyArn,
        @CustomType.Parameter("pointInTimeRecovery") @Nullable Boolean pointInTimeRecovery,
        @CustomType.Parameter("regionName") String regionName) {
        this.kmsKeyArn = kmsKeyArn;
        this.pointInTimeRecovery = pointInTimeRecovery;
        this.regionName = regionName;
    }

    /**
     * @return ARN of the CMK that should be used for the AWS KMS encryption. This attribute should only be specified if the key is different from the default DynamoDB CMK, `alias/aws/dynamodb`.
     * 
     */
    public Optional<String> kmsKeyArn() {
        return Optional.ofNullable(this.kmsKeyArn);
    }
    /**
     * @return Whether to enable Point In Time Recovery for the replica.
     * 
     */
    public Optional<Boolean> pointInTimeRecovery() {
        return Optional.ofNullable(this.pointInTimeRecovery);
    }
    /**
     * @return Region name of the replica.
     * 
     */
    public String regionName() {
        return this.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableReplica defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyArn;
        private @Nullable Boolean pointInTimeRecovery;
        private String regionName;

        public Builder() {
    	      // Empty
        }

        public Builder(TableReplica defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.pointInTimeRecovery = defaults.pointInTimeRecovery;
    	      this.regionName = defaults.regionName;
        }

        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public Builder pointInTimeRecovery(@Nullable Boolean pointInTimeRecovery) {
            this.pointInTimeRecovery = pointInTimeRecovery;
            return this;
        }
        public Builder regionName(String regionName) {
            this.regionName = Objects.requireNonNull(regionName);
            return this;
        }        public TableReplica build() {
            return new TableReplica(kmsKeyArn, pointInTimeRecovery, regionName);
        }
    }
}
