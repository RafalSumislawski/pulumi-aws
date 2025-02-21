// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.wafv2.WebAclArgs;
import com.pulumi.aws.wafv2.inputs.WebAclState;
import com.pulumi.aws.wafv2.outputs.WebAclCustomResponseBody;
import com.pulumi.aws.wafv2.outputs.WebAclDefaultAction;
import com.pulumi.aws.wafv2.outputs.WebAclRule;
import com.pulumi.aws.wafv2.outputs.WebAclVisibilityConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a WAFv2 Web ACL resource.
 * 
 * ## Example Usage
 * 
 * This resource is based on `aws.wafv2.RuleGroup`, check the documentation of the `aws.wafv2.RuleGroup` resource to see examples of the various available statements.
 * ### Managed Rule
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new WebAcl(&#34;example&#34;, WebAclArgs.builder()        
 *             .defaultAction(WebAclDefaultActionArgs.builder()
 *                 .allow()
 *                 .build())
 *             .description(&#34;Example of a managed rule.&#34;)
 *             .rules(WebAclRuleArgs.builder()
 *                 .name(&#34;rule-1&#34;)
 *                 .overrideAction(WebAclRuleOverrideActionArgs.builder()
 *                     .count()
 *                     .build())
 *                 .priority(1)
 *                 .statement(WebAclRuleStatementArgs.builder()
 *                     .managedRuleGroupStatement(WebAclRuleStatementManagedRuleGroupStatementArgs.builder()
 *                         .excludedRule(                        
 *                             %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference),
 *                             %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                         .name(&#34;AWSManagedRulesCommonRuleSet&#34;)
 *                         .scopeDownStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementArgs.builder()
 *                             .geoMatchStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementGeoMatchStatementArgs.builder()
 *                                 .countryCodes(                                
 *                                     &#34;US&#34;,
 *                                     &#34;NL&#34;)
 *                                 .build())
 *                             .build())
 *                         .vendorName(&#34;AWS&#34;)
 *                         .build())
 *                     .build())
 *                 .visibilityConfig(WebAclRuleVisibilityConfigArgs.builder()
 *                     .cloudwatchMetricsEnabled(false)
 *                     .metricName(&#34;friendly-rule-metric-name&#34;)
 *                     .sampledRequestsEnabled(false)
 *                     .build())
 *                 .build())
 *             .scope(&#34;REGIONAL&#34;)
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Tag1&#34;, &#34;Value1&#34;),
 *                 Map.entry(&#34;Tag2&#34;, &#34;Value2&#34;)
 *             ))
 *             .visibilityConfig(WebAclVisibilityConfigArgs.builder()
 *                 .cloudwatchMetricsEnabled(false)
 *                 .metricName(&#34;friendly-metric-name&#34;)
 *                 .sampledRequestsEnabled(false)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Rate Based
 * Rate-limit US and NL-based clients to 10,000 requests for every 5 minutes.
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new WebAcl(&#34;example&#34;, WebAclArgs.builder()        
 *             .defaultAction(WebAclDefaultActionArgs.builder()
 *                 .allow()
 *                 .build())
 *             .description(&#34;Example of a Cloudfront rate based statement.&#34;)
 *             .rules(WebAclRuleArgs.builder()
 *                 .action(WebAclRuleActionArgs.builder()
 *                     .block()
 *                     .build())
 *                 .name(&#34;rule-1&#34;)
 *                 .priority(1)
 *                 .statement(WebAclRuleStatementArgs.builder()
 *                     .rateBasedStatement(WebAclRuleStatementRateBasedStatementArgs.builder()
 *                         .aggregateKeyType(&#34;IP&#34;)
 *                         .limit(10000)
 *                         .scopeDownStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementArgs.builder()
 *                             .geoMatchStatement(WebAclRuleStatementRateBasedStatementScopeDownStatementGeoMatchStatementArgs.builder()
 *                                 .countryCodes(                                
 *                                     &#34;US&#34;,
 *                                     &#34;NL&#34;)
 *                                 .build())
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .visibilityConfig(WebAclRuleVisibilityConfigArgs.builder()
 *                     .cloudwatchMetricsEnabled(false)
 *                     .metricName(&#34;friendly-rule-metric-name&#34;)
 *                     .sampledRequestsEnabled(false)
 *                     .build())
 *                 .build())
 *             .scope(&#34;CLOUDFRONT&#34;)
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Tag1&#34;, &#34;Value1&#34;),
 *                 Map.entry(&#34;Tag2&#34;, &#34;Value2&#34;)
 *             ))
 *             .visibilityConfig(WebAclVisibilityConfigArgs.builder()
 *                 .cloudwatchMetricsEnabled(false)
 *                 .metricName(&#34;friendly-metric-name&#34;)
 *                 .sampledRequestsEnabled(false)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Rule Group Reference
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new RuleGroup(&#34;example&#34;, RuleGroupArgs.builder()        
 *             .capacity(10)
 *             .scope(&#34;REGIONAL&#34;)
 *             .rules(            
 *                 RuleGroupRuleArgs.builder()
 *                     .name(&#34;rule-1&#34;)
 *                     .priority(1)
 *                     .action(RuleGroupRuleActionArgs.builder()
 *                         .count()
 *                         .build())
 *                     .statement(RuleGroupRuleStatementArgs.builder()
 *                         .geoMatchStatement(RuleGroupRuleStatementGeoMatchStatementArgs.builder()
 *                             .countryCodes(&#34;NL&#34;)
 *                             .build())
 *                         .build())
 *                     .visibilityConfig(RuleGroupRuleVisibilityConfigArgs.builder()
 *                         .cloudwatchMetricsEnabled(false)
 *                         .metricName(&#34;friendly-rule-metric-name&#34;)
 *                         .sampledRequestsEnabled(false)
 *                         .build())
 *                     .build(),
 *                 RuleGroupRuleArgs.builder()
 *                     .name(&#34;rule-to-exclude-a&#34;)
 *                     .priority(10)
 *                     .action(RuleGroupRuleActionArgs.builder()
 *                         .allow()
 *                         .build())
 *                     .statement(RuleGroupRuleStatementArgs.builder()
 *                         .geoMatchStatement(RuleGroupRuleStatementGeoMatchStatementArgs.builder()
 *                             .countryCodes(&#34;US&#34;)
 *                             .build())
 *                         .build())
 *                     .visibilityConfig(RuleGroupRuleVisibilityConfigArgs.builder()
 *                         .cloudwatchMetricsEnabled(false)
 *                         .metricName(&#34;friendly-rule-metric-name&#34;)
 *                         .sampledRequestsEnabled(false)
 *                         .build())
 *                     .build(),
 *                 RuleGroupRuleArgs.builder()
 *                     .name(&#34;rule-to-exclude-b&#34;)
 *                     .priority(15)
 *                     .action(RuleGroupRuleActionArgs.builder()
 *                         .allow()
 *                         .build())
 *                     .statement(RuleGroupRuleStatementArgs.builder()
 *                         .geoMatchStatement(RuleGroupRuleStatementGeoMatchStatementArgs.builder()
 *                             .countryCodes(&#34;GB&#34;)
 *                             .build())
 *                         .build())
 *                     .visibilityConfig(RuleGroupRuleVisibilityConfigArgs.builder()
 *                         .cloudwatchMetricsEnabled(false)
 *                         .metricName(&#34;friendly-rule-metric-name&#34;)
 *                         .sampledRequestsEnabled(false)
 *                         .build())
 *                     .build())
 *             .visibilityConfig(RuleGroupVisibilityConfigArgs.builder()
 *                 .cloudwatchMetricsEnabled(false)
 *                 .metricName(&#34;friendly-metric-name&#34;)
 *                 .sampledRequestsEnabled(false)
 *                 .build())
 *             .build());
 * 
 *         var test = new WebAcl(&#34;test&#34;, WebAclArgs.builder()        
 *             .scope(&#34;REGIONAL&#34;)
 *             .defaultAction(WebAclDefaultActionArgs.builder()
 *                 .block()
 *                 .build())
 *             .rules(WebAclRuleArgs.builder()
 *                 .name(&#34;rule-1&#34;)
 *                 .priority(1)
 *                 .overrideAction(WebAclRuleOverrideActionArgs.builder()
 *                     .count()
 *                     .build())
 *                 .statement(WebAclRuleStatementArgs.builder()
 *                     .ruleGroupReferenceStatement(WebAclRuleStatementRuleGroupReferenceStatementArgs.builder()
 *                         .arn(example.arn())
 *                         .excludedRules(                        
 *                             WebAclRuleStatementRuleGroupReferenceStatementExcludedRuleArgs.builder()
 *                                 .name(&#34;rule-to-exclude-b&#34;)
 *                                 .build(),
 *                             WebAclRuleStatementRuleGroupReferenceStatementExcludedRuleArgs.builder()
 *                                 .name(&#34;rule-to-exclude-a&#34;)
 *                                 .build())
 *                         .build())
 *                     .build())
 *                 .visibilityConfig(WebAclRuleVisibilityConfigArgs.builder()
 *                     .cloudwatchMetricsEnabled(false)
 *                     .metricName(&#34;friendly-rule-metric-name&#34;)
 *                     .sampledRequestsEnabled(false)
 *                     .build())
 *                 .build())
 *             .tags(Map.ofEntries(
 *                 Map.entry(&#34;Tag1&#34;, &#34;Value1&#34;),
 *                 Map.entry(&#34;Tag2&#34;, &#34;Value2&#34;)
 *             ))
 *             .visibilityConfig(WebAclVisibilityConfigArgs.builder()
 *                 .cloudwatchMetricsEnabled(false)
 *                 .metricName(&#34;friendly-metric-name&#34;)
 *                 .sampledRequestsEnabled(false)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * WAFv2 Web ACLs can be imported using `ID/Name/Scope` e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:wafv2/webAcl:WebAcl example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc/example/REGIONAL
 * ```
 * 
 */
@ResourceType(type="aws:wafv2/webAcl:WebAcl")
public class WebAcl extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the IP Set that this statement references.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Web ACL capacity units (WCUs) currently being used by this web ACL.
     * 
     */
    @Export(name="capacity", type=Integer.class, parameters={})
    private Output<Integer> capacity;

    /**
     * @return Web ACL capacity units (WCUs) currently being used by this web ACL.
     * 
     */
    public Output<Integer> capacity() {
        return this.capacity;
    }
    /**
     * Defines custom response bodies that can be referenced by `custom_response` actions. See Custom Response Body below for details.
     * 
     */
    @Export(name="customResponseBodies", type=List.class, parameters={WebAclCustomResponseBody.class})
    private Output</* @Nullable */ List<WebAclCustomResponseBody>> customResponseBodies;

    /**
     * @return Defines custom response bodies that can be referenced by `custom_response` actions. See Custom Response Body below for details.
     * 
     */
    public Output<Optional<List<WebAclCustomResponseBody>>> customResponseBodies() {
        return Codegen.optional(this.customResponseBodies);
    }
    /**
     * Action to perform if none of the `rules` contained in the WebACL match. See Default Action below for details.
     * 
     */
    @Export(name="defaultAction", type=WebAclDefaultAction.class, parameters={})
    private Output<WebAclDefaultAction> defaultAction;

    /**
     * @return Action to perform if none of the `rules` contained in the WebACL match. See Default Action below for details.
     * 
     */
    public Output<WebAclDefaultAction> defaultAction() {
        return this.defaultAction;
    }
    /**
     * Friendly description of the WebACL.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Friendly description of the WebACL.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="lockToken", type=String.class, parameters={})
    private Output<String> lockToken;

    public Output<String> lockToken() {
        return this.lockToken;
    }
    /**
     * Label string.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Label string.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
     * 
     */
    @Export(name="rules", type=List.class, parameters={WebAclRule.class})
    private Output</* @Nullable */ List<WebAclRule>> rules;

    /**
     * @return Rule blocks used to identify the web requests that you want to `allow`, `block`, or `count`. See Rules below for details.
     * 
     */
    public Output<Optional<List<WebAclRule>>> rules() {
        return Codegen.optional(this.rules);
    }
    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    @Export(name="scope", type=String.class, parameters={})
    private Output<String> scope;

    /**
     * @return Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }
    /**
     * Map of key-value pairs to associate with the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of key-value pairs to associate with the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    @Export(name="visibilityConfig", type=WebAclVisibilityConfig.class, parameters={})
    private Output<WebAclVisibilityConfig> visibilityConfig;

    /**
     * @return Defines and enables Amazon CloudWatch metrics and web request sample collection. See Visibility Configuration below for details.
     * 
     */
    public Output<WebAclVisibilityConfig> visibilityConfig() {
        return this.visibilityConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebAcl(String name) {
        this(name, WebAclArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebAcl(String name, WebAclArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebAcl(String name, WebAclArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafv2/webAcl:WebAcl", name, args == null ? WebAclArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebAcl(String name, Output<String> id, @Nullable WebAclState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:wafv2/webAcl:WebAcl", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static WebAcl get(String name, Output<String> id, @Nullable WebAclState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebAcl(name, id, state, options);
    }
}
