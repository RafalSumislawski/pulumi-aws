// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRuleGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRuleGroupArgs Empty = new GetRuleGroupArgs();

    /**
     * The name of the WAFv2 Rule Group.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the WAFv2 Rule Group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    private GetRuleGroupArgs() {}

    private GetRuleGroupArgs(GetRuleGroupArgs $) {
        this.name = $.name;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRuleGroupArgs $;

        public Builder() {
            $ = new GetRuleGroupArgs();
        }

        public Builder(GetRuleGroupArgs defaults) {
            $ = new GetRuleGroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the WAFv2 Rule Group.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the WAFv2 Rule Group.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param scope Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public GetRuleGroupArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
