// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UsagePlanQuotaSettings {
    /**
     * @return The maximum number of requests that can be made in a given time period.
     * 
     */
    private final Integer limit;
    /**
     * @return The number of requests subtracted from the given limit in the initial time period.
     * 
     */
    private final @Nullable Integer offset;
    /**
     * @return The time period in which the limit applies. Valid values are &#34;DAY&#34;, &#34;WEEK&#34; or &#34;MONTH&#34;.
     * 
     */
    private final String period;

    @CustomType.Constructor
    private UsagePlanQuotaSettings(
        @CustomType.Parameter("limit") Integer limit,
        @CustomType.Parameter("offset") @Nullable Integer offset,
        @CustomType.Parameter("period") String period) {
        this.limit = limit;
        this.offset = offset;
        this.period = period;
    }

    /**
     * @return The maximum number of requests that can be made in a given time period.
     * 
     */
    public Integer limit() {
        return this.limit;
    }
    /**
     * @return The number of requests subtracted from the given limit in the initial time period.
     * 
     */
    public Optional<Integer> offset() {
        return Optional.ofNullable(this.offset);
    }
    /**
     * @return The time period in which the limit applies. Valid values are &#34;DAY&#34;, &#34;WEEK&#34; or &#34;MONTH&#34;.
     * 
     */
    public String period() {
        return this.period;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsagePlanQuotaSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer limit;
        private @Nullable Integer offset;
        private String period;

        public Builder() {
    	      // Empty
        }

        public Builder(UsagePlanQuotaSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limit = defaults.limit;
    	      this.offset = defaults.offset;
    	      this.period = defaults.period;
        }

        public Builder limit(Integer limit) {
            this.limit = Objects.requireNonNull(limit);
            return this;
        }
        public Builder offset(@Nullable Integer offset) {
            this.offset = offset;
            return this;
        }
        public Builder period(String period) {
            this.period = Objects.requireNonNull(period);
            return this;
        }        public UsagePlanQuotaSettings build() {
            return new UsagePlanQuotaSettings(limit, offset, period);
        }
    }
}
