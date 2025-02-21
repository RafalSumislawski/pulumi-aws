// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.securityhub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InsightFiltersProductField {
    /**
     * @return The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
     * 
     */
    private final String comparison;
    /**
     * @return The key of the map filter. For example, for `ResourceTags`, `Key` identifies the name of the tag. For `UserDefinedFields`, `Key` is the name of the field.
     * 
     */
    private final String key;
    /**
     * @return A date range value for the date filter, provided as an Integer.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private InsightFiltersProductField(
        @CustomType.Parameter("comparison") String comparison,
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("value") String value) {
        this.comparison = comparison;
        this.key = key;
        this.value = value;
    }

    /**
     * @return The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
     * 
     */
    public String comparison() {
        return this.comparison;
    }
    /**
     * @return The key of the map filter. For example, for `ResourceTags`, `Key` identifies the name of the tag. For `UserDefinedFields`, `Key` is the name of the field.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return A date range value for the date filter, provided as an Integer.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersProductField defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comparison;
        private String key;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersProductField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparison = defaults.comparison;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder comparison(String comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public InsightFiltersProductField build() {
            return new InsightFiltersProductField(comparison, key, value);
        }
    }
}
