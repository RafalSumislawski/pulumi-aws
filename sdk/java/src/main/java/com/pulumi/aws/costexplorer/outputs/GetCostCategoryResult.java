// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.costexplorer.outputs;

import com.pulumi.aws.costexplorer.outputs.GetCostCategoryRule;
import com.pulumi.aws.costexplorer.outputs.GetCostCategorySplitChargeRule;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetCostCategoryResult {
    private final String costCategoryArn;
    /**
     * @return Effective end data of your Cost Category.
     * 
     */
    private final String effectiveEnd;
    /**
     * @return Effective state data of your Cost Category.
     * 
     */
    private final String effectiveStart;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String name;
    /**
     * @return Rule schema version in this particular Cost Category.
     * 
     */
    private final String ruleVersion;
    /**
     * @return Configuration block for the `Expression` object used to categorize costs. See below.
     * 
     */
    private final List<GetCostCategoryRule> rules;
    /**
     * @return Configuration block for the split charge rules used to allocate your charges between your Cost Category values. See below.
     * 
     */
    private final List<GetCostCategorySplitChargeRule> splitChargeRules;

    @CustomType.Constructor
    private GetCostCategoryResult(
        @CustomType.Parameter("costCategoryArn") String costCategoryArn,
        @CustomType.Parameter("effectiveEnd") String effectiveEnd,
        @CustomType.Parameter("effectiveStart") String effectiveStart,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("ruleVersion") String ruleVersion,
        @CustomType.Parameter("rules") List<GetCostCategoryRule> rules,
        @CustomType.Parameter("splitChargeRules") List<GetCostCategorySplitChargeRule> splitChargeRules) {
        this.costCategoryArn = costCategoryArn;
        this.effectiveEnd = effectiveEnd;
        this.effectiveStart = effectiveStart;
        this.id = id;
        this.name = name;
        this.ruleVersion = ruleVersion;
        this.rules = rules;
        this.splitChargeRules = splitChargeRules;
    }

    public String costCategoryArn() {
        return this.costCategoryArn;
    }
    /**
     * @return Effective end data of your Cost Category.
     * 
     */
    public String effectiveEnd() {
        return this.effectiveEnd;
    }
    /**
     * @return Effective state data of your Cost Category.
     * 
     */
    public String effectiveStart() {
        return this.effectiveStart;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return Rule schema version in this particular Cost Category.
     * 
     */
    public String ruleVersion() {
        return this.ruleVersion;
    }
    /**
     * @return Configuration block for the `Expression` object used to categorize costs. See below.
     * 
     */
    public List<GetCostCategoryRule> rules() {
        return this.rules;
    }
    /**
     * @return Configuration block for the split charge rules used to allocate your charges between your Cost Category values. See below.
     * 
     */
    public List<GetCostCategorySplitChargeRule> splitChargeRules() {
        return this.splitChargeRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCostCategoryResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String costCategoryArn;
        private String effectiveEnd;
        private String effectiveStart;
        private String id;
        private String name;
        private String ruleVersion;
        private List<GetCostCategoryRule> rules;
        private List<GetCostCategorySplitChargeRule> splitChargeRules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCostCategoryResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.costCategoryArn = defaults.costCategoryArn;
    	      this.effectiveEnd = defaults.effectiveEnd;
    	      this.effectiveStart = defaults.effectiveStart;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.ruleVersion = defaults.ruleVersion;
    	      this.rules = defaults.rules;
    	      this.splitChargeRules = defaults.splitChargeRules;
        }

        public Builder costCategoryArn(String costCategoryArn) {
            this.costCategoryArn = Objects.requireNonNull(costCategoryArn);
            return this;
        }
        public Builder effectiveEnd(String effectiveEnd) {
            this.effectiveEnd = Objects.requireNonNull(effectiveEnd);
            return this;
        }
        public Builder effectiveStart(String effectiveStart) {
            this.effectiveStart = Objects.requireNonNull(effectiveStart);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder ruleVersion(String ruleVersion) {
            this.ruleVersion = Objects.requireNonNull(ruleVersion);
            return this;
        }
        public Builder rules(List<GetCostCategoryRule> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }
        public Builder rules(GetCostCategoryRule... rules) {
            return rules(List.of(rules));
        }
        public Builder splitChargeRules(List<GetCostCategorySplitChargeRule> splitChargeRules) {
            this.splitChargeRules = Objects.requireNonNull(splitChargeRules);
            return this;
        }
        public Builder splitChargeRules(GetCostCategorySplitChargeRule... splitChargeRules) {
            return splitChargeRules(List.of(splitChargeRules));
        }        public GetCostCategoryResult build() {
            return new GetCostCategoryResult(costCategoryArn, effectiveEnd, effectiveStart, id, name, ruleVersion, rules, splitChargeRules);
        }
    }
}
