// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.outposts.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAssetResult {
    private final String arn;
    private final String assetId;
    /**
     * @return The type of the asset.
     * 
     */
    private final String assetType;
    /**
     * @return The host ID of the Dedicated Hosts on the asset, if a Dedicated Host is provisioned.
     * 
     */
    private final String hostId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The rack ID of the asset.
     * 
     */
    private final String rackId;

    @CustomType.Constructor
    private GetAssetResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("assetId") String assetId,
        @CustomType.Parameter("assetType") String assetType,
        @CustomType.Parameter("hostId") String hostId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("rackId") String rackId) {
        this.arn = arn;
        this.assetId = assetId;
        this.assetType = assetType;
        this.hostId = hostId;
        this.id = id;
        this.rackId = rackId;
    }

    public String arn() {
        return this.arn;
    }
    public String assetId() {
        return this.assetId;
    }
    /**
     * @return The type of the asset.
     * 
     */
    public String assetType() {
        return this.assetType;
    }
    /**
     * @return The host ID of the Dedicated Hosts on the asset, if a Dedicated Host is provisioned.
     * 
     */
    public String hostId() {
        return this.hostId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The rack ID of the asset.
     * 
     */
    public String rackId() {
        return this.rackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String assetId;
        private String assetType;
        private String hostId;
        private String id;
        private String rackId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.assetId = defaults.assetId;
    	      this.assetType = defaults.assetType;
    	      this.hostId = defaults.hostId;
    	      this.id = defaults.id;
    	      this.rackId = defaults.rackId;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder assetId(String assetId) {
            this.assetId = Objects.requireNonNull(assetId);
            return this;
        }
        public Builder assetType(String assetType) {
            this.assetType = Objects.requireNonNull(assetType);
            return this;
        }
        public Builder hostId(String hostId) {
            this.hostId = Objects.requireNonNull(hostId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder rackId(String rackId) {
            this.rackId = Objects.requireNonNull(rackId);
            return this;
        }        public GetAssetResult build() {
            return new GetAssetResult(arn, assetId, assetType, hostId, id, rackId);
        }
    }
}
