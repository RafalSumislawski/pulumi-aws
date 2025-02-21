// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLogDeliveryCanonicalUserIdPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLogDeliveryCanonicalUserIdPlainArgs Empty = new GetLogDeliveryCanonicalUserIdPlainArgs();

    /**
     * The region you&#39;d like the zone for. By default, fetches the current region.
     * 
     */
    @Import(name="region")
    private @Nullable String region;

    /**
     * @return The region you&#39;d like the zone for. By default, fetches the current region.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    private GetLogDeliveryCanonicalUserIdPlainArgs() {}

    private GetLogDeliveryCanonicalUserIdPlainArgs(GetLogDeliveryCanonicalUserIdPlainArgs $) {
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLogDeliveryCanonicalUserIdPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLogDeliveryCanonicalUserIdPlainArgs $;

        public Builder() {
            $ = new GetLogDeliveryCanonicalUserIdPlainArgs();
        }

        public Builder(GetLogDeliveryCanonicalUserIdPlainArgs defaults) {
            $ = new GetLogDeliveryCanonicalUserIdPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param region The region you&#39;d like the zone for. By default, fetches the current region.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable String region) {
            $.region = region;
            return this;
        }

        public GetLogDeliveryCanonicalUserIdPlainArgs build() {
            return $;
        }
    }

}
