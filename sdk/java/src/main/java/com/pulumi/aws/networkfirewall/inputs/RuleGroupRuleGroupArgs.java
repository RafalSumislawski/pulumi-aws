// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.inputs;

import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRuleVariablesArgs;
import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceArgs;
import com.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupStatefulRuleOptionsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleGroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupArgs Empty = new RuleGroupRuleGroupArgs();

    /**
     * A configuration block that defines additional settings available to use in the rules defined in the rule group. Can only be specified for **stateful** rule groups. See Rule Variables below for details.
     * 
     */
    @Import(name="ruleVariables")
    private @Nullable Output<RuleGroupRuleGroupRuleVariablesArgs> ruleVariables;

    /**
     * @return A configuration block that defines additional settings available to use in the rules defined in the rule group. Can only be specified for **stateful** rule groups. See Rule Variables below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleGroupRuleVariablesArgs>> ruleVariables() {
        return Optional.ofNullable(this.ruleVariables);
    }

    /**
     * A configuration block that defines the stateful or stateless rules for the rule group. See Rules Source below for details.
     * 
     */
    @Import(name="rulesSource", required=true)
    private Output<RuleGroupRuleGroupRulesSourceArgs> rulesSource;

    /**
     * @return A configuration block that defines the stateful or stateless rules for the rule group. See Rules Source below for details.
     * 
     */
    public Output<RuleGroupRuleGroupRulesSourceArgs> rulesSource() {
        return this.rulesSource;
    }

    /**
     * A configuration block that defines stateful rule options for the rule group. See Stateful Rule Options below for details.
     * 
     */
    @Import(name="statefulRuleOptions")
    private @Nullable Output<RuleGroupRuleGroupStatefulRuleOptionsArgs> statefulRuleOptions;

    /**
     * @return A configuration block that defines stateful rule options for the rule group. See Stateful Rule Options below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleGroupStatefulRuleOptionsArgs>> statefulRuleOptions() {
        return Optional.ofNullable(this.statefulRuleOptions);
    }

    private RuleGroupRuleGroupArgs() {}

    private RuleGroupRuleGroupArgs(RuleGroupRuleGroupArgs $) {
        this.ruleVariables = $.ruleVariables;
        this.rulesSource = $.rulesSource;
        this.statefulRuleOptions = $.statefulRuleOptions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleGroupArgs $;

        public Builder() {
            $ = new RuleGroupRuleGroupArgs();
        }

        public Builder(RuleGroupRuleGroupArgs defaults) {
            $ = new RuleGroupRuleGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param ruleVariables A configuration block that defines additional settings available to use in the rules defined in the rule group. Can only be specified for **stateful** rule groups. See Rule Variables below for details.
         * 
         * @return builder
         * 
         */
        public Builder ruleVariables(@Nullable Output<RuleGroupRuleGroupRuleVariablesArgs> ruleVariables) {
            $.ruleVariables = ruleVariables;
            return this;
        }

        /**
         * @param ruleVariables A configuration block that defines additional settings available to use in the rules defined in the rule group. Can only be specified for **stateful** rule groups. See Rule Variables below for details.
         * 
         * @return builder
         * 
         */
        public Builder ruleVariables(RuleGroupRuleGroupRuleVariablesArgs ruleVariables) {
            return ruleVariables(Output.of(ruleVariables));
        }

        /**
         * @param rulesSource A configuration block that defines the stateful or stateless rules for the rule group. See Rules Source below for details.
         * 
         * @return builder
         * 
         */
        public Builder rulesSource(Output<RuleGroupRuleGroupRulesSourceArgs> rulesSource) {
            $.rulesSource = rulesSource;
            return this;
        }

        /**
         * @param rulesSource A configuration block that defines the stateful or stateless rules for the rule group. See Rules Source below for details.
         * 
         * @return builder
         * 
         */
        public Builder rulesSource(RuleGroupRuleGroupRulesSourceArgs rulesSource) {
            return rulesSource(Output.of(rulesSource));
        }

        /**
         * @param statefulRuleOptions A configuration block that defines stateful rule options for the rule group. See Stateful Rule Options below for details.
         * 
         * @return builder
         * 
         */
        public Builder statefulRuleOptions(@Nullable Output<RuleGroupRuleGroupStatefulRuleOptionsArgs> statefulRuleOptions) {
            $.statefulRuleOptions = statefulRuleOptions;
            return this;
        }

        /**
         * @param statefulRuleOptions A configuration block that defines stateful rule options for the rule group. See Stateful Rule Options below for details.
         * 
         * @return builder
         * 
         */
        public Builder statefulRuleOptions(RuleGroupRuleGroupStatefulRuleOptionsArgs statefulRuleOptions) {
            return statefulRuleOptions(Output.of(statefulRuleOptions));
        }

        public RuleGroupRuleGroupArgs build() {
            $.rulesSource = Objects.requireNonNull($.rulesSource, "expected parameter 'rulesSource' to be non-null");
            return $;
        }
    }

}
