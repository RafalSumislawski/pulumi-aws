// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BucketReplicationConfigRuleDestinationAccessControlTranslation {
    /**
     * @return Specifies the replica ownership. For default and valid values, see [PUT bucket replication](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html) in the Amazon S3 API Reference. Valid values: `Destination`.
     * 
     */
    private final String owner;

    @CustomType.Constructor
    private BucketReplicationConfigRuleDestinationAccessControlTranslation(@CustomType.Parameter("owner") String owner) {
        this.owner = owner;
    }

    /**
     * @return Specifies the replica ownership. For default and valid values, see [PUT bucket replication](https://docs.aws.amazon.com/AmazonS3/latest/API/RESTBucketPUTreplication.html) in the Amazon S3 API Reference. Valid values: `Destination`.
     * 
     */
    public String owner() {
        return this.owner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketReplicationConfigRuleDestinationAccessControlTranslation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String owner;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketReplicationConfigRuleDestinationAccessControlTranslation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.owner = defaults.owner;
        }

        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }        public BucketReplicationConfigRuleDestinationAccessControlTranslation build() {
            return new BucketReplicationConfigRuleDestinationAccessControlTranslation(owner);
        }
    }
}
