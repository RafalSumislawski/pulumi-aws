// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.outputs;

import com.pulumi.aws.costexplorer.outputs.GetCostCategorySplitChargeRuleParameter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCostCategorySplitChargeRule {
    /**
     * @return Method that&#39;s used to define how to split your source costs across your targets. Valid values are `FIXED`, `PROPORTIONAL`, `EVEN`
     * 
     */
    private final String method;
    /**
     * @return Configuration block for the parameters for a split charge method. This is only required for the `FIXED` method. See below.
     * 
     */
    private final List<GetCostCategorySplitChargeRuleParameter> parameters;
    /**
     * @return Cost Category value that you want to split.
     * 
     */
    private final String source;
    /**
     * @return Cost Category values that you want to split costs across. These values can&#39;t be used as a source in other split charge rules.
     * 
     */
    private final List<String> targets;

    @CustomType.Constructor
    private GetCostCategorySplitChargeRule(
        @CustomType.Parameter("method") String method,
        @CustomType.Parameter("parameters") List<GetCostCategorySplitChargeRuleParameter> parameters,
        @CustomType.Parameter("source") String source,
        @CustomType.Parameter("targets") List<String> targets) {
        this.method = method;
        this.parameters = parameters;
        this.source = source;
        this.targets = targets;
    }

    /**
     * @return Method that&#39;s used to define how to split your source costs across your targets. Valid values are `FIXED`, `PROPORTIONAL`, `EVEN`
     * 
     */
    public String method() {
        return this.method;
    }
    /**
     * @return Configuration block for the parameters for a split charge method. This is only required for the `FIXED` method. See below.
     * 
     */
    public List<GetCostCategorySplitChargeRuleParameter> parameters() {
        return this.parameters;
    }
    /**
     * @return Cost Category value that you want to split.
     * 
     */
    public String source() {
        return this.source;
    }
    /**
     * @return Cost Category values that you want to split costs across. These values can&#39;t be used as a source in other split charge rules.
     * 
     */
    public List<String> targets() {
        return this.targets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCostCategorySplitChargeRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String method;
        private List<GetCostCategorySplitChargeRuleParameter> parameters;
        private String source;
        private List<String> targets;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCostCategorySplitChargeRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.method = defaults.method;
    	      this.parameters = defaults.parameters;
    	      this.source = defaults.source;
    	      this.targets = defaults.targets;
        }

        public Builder method(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }
        public Builder parameters(List<GetCostCategorySplitChargeRuleParameter> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder parameters(GetCostCategorySplitChargeRuleParameter... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder targets(List<String> targets) {
            this.targets = Objects.requireNonNull(targets);
            return this;
        }
        public Builder targets(String... targets) {
            return targets(List.of(targets));
        }        public GetCostCategorySplitChargeRule build() {
            return new GetCostCategorySplitChargeRule(method, parameters, source, targets);
        }
    }
}
