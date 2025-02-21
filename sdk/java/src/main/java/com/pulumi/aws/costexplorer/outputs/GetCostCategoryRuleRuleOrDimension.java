// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCostCategoryRuleRuleOrDimension {
    /**
     * @return Key for the tag.
     * 
     */
    private final String key;
    /**
     * @return Match options that you can use to filter your results. MatchOptions is only applicable for actions related to cost category. The default values for MatchOptions is `EQUALS` and `CASE_SENSITIVE`. Valid values are: `EQUALS`,  `ABSENT`, `STARTS_WITH`, `ENDS_WITH`, `CONTAINS`, `CASE_SENSITIVE`, `CASE_INSENSITIVE`.
     * 
     */
    private final List<String> matchOptions;
    /**
     * @return Parameter values.
     * 
     */
    private final List<String> values;

    @CustomType.Constructor
    private GetCostCategoryRuleRuleOrDimension(
        @CustomType.Parameter("key") String key,
        @CustomType.Parameter("matchOptions") List<String> matchOptions,
        @CustomType.Parameter("values") List<String> values) {
        this.key = key;
        this.matchOptions = matchOptions;
        this.values = values;
    }

    /**
     * @return Key for the tag.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return Match options that you can use to filter your results. MatchOptions is only applicable for actions related to cost category. The default values for MatchOptions is `EQUALS` and `CASE_SENSITIVE`. Valid values are: `EQUALS`,  `ABSENT`, `STARTS_WITH`, `ENDS_WITH`, `CONTAINS`, `CASE_SENSITIVE`, `CASE_INSENSITIVE`.
     * 
     */
    public List<String> matchOptions() {
        return this.matchOptions;
    }
    /**
     * @return Parameter values.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCostCategoryRuleRuleOrDimension defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private List<String> matchOptions;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCostCategoryRuleRuleOrDimension defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.matchOptions = defaults.matchOptions;
    	      this.values = defaults.values;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder matchOptions(List<String> matchOptions) {
            this.matchOptions = Objects.requireNonNull(matchOptions);
            return this;
        }
        public Builder matchOptions(String... matchOptions) {
            return matchOptions(List.of(matchOptions));
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public GetCostCategoryRuleRuleOrDimension build() {
            return new GetCostCategoryRuleRuleOrDimension(key, matchOptions, values);
        }
    }
}
