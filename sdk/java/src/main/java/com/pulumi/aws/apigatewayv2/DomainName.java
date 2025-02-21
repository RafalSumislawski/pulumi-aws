// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigatewayv2.DomainNameArgs;
import com.pulumi.aws.apigatewayv2.inputs.DomainNameState;
import com.pulumi.aws.apigatewayv2.outputs.DomainNameDomainNameConfiguration;
import com.pulumi.aws.apigatewayv2.outputs.DomainNameMutualTlsAuthentication;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Amazon API Gateway Version 2 domain name.
 * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html).
 * 
 * &gt; **Note:** This resource establishes ownership of and the TLS settings for
 * a particular domain name. An API stage can be associated with the domain name using the `aws.apigatewayv2.ApiMapping` resource.
 * 
 * ## Example Usage
 * ### Basic
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
 *         var example = new DomainName(&#34;example&#34;, DomainNameArgs.builder()        
 *             .domainName(&#34;ws-api.example.com&#34;)
 *             .domainNameConfiguration(DomainNameDomainNameConfigurationArgs.builder()
 *                 .certificateArn(aws_acm_certificate.example().arn())
 *                 .endpointType(&#34;REGIONAL&#34;)
 *                 .securityPolicy(&#34;TLS_1_2&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Associated Route 53 Resource Record
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
 *         var exampleDomainName = new DomainName(&#34;exampleDomainName&#34;, DomainNameArgs.builder()        
 *             .domainName(&#34;http-api.example.com&#34;)
 *             .domainNameConfiguration(DomainNameDomainNameConfigurationArgs.builder()
 *                 .certificateArn(aws_acm_certificate.example().arn())
 *                 .endpointType(&#34;REGIONAL&#34;)
 *                 .securityPolicy(&#34;TLS_1_2&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleRecord = new Record(&#34;exampleRecord&#34;, RecordArgs.builder()        
 *             .name(exampleDomainName.domainName())
 *             .type(&#34;A&#34;)
 *             .zoneId(aws_route53_zone.example().zone_id())
 *             .aliases(RecordAliasArgs.builder()
 *                 .name(exampleDomainName.domainNameConfiguration().apply(domainNameConfiguration -&gt; domainNameConfiguration.targetDomainName()))
 *                 .zoneId(exampleDomainName.domainNameConfiguration().apply(domainNameConfiguration -&gt; domainNameConfiguration.hostedZoneId()))
 *                 .evaluateTargetHealth(false)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_apigatewayv2_domain_name` can be imported by using the domain name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigatewayv2/domainName:DomainName example ws-api.example.com
 * ```
 * 
 */
@ResourceType(type="aws:apigatewayv2/domainName:DomainName")
public class DomainName extends com.pulumi.resources.CustomResource {
    /**
     * [API mapping selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-mapping-selection-expressions) for the domain name.
     * 
     */
    @Export(name="apiMappingSelectionExpression", type=String.class, parameters={})
    private Output<String> apiMappingSelectionExpression;

    /**
     * @return [API mapping selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-mapping-selection-expressions) for the domain name.
     * 
     */
    public Output<String> apiMappingSelectionExpression() {
        return this.apiMappingSelectionExpression;
    }
    /**
     * ARN of the domain name.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the domain name.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Domain name. Must be between 1 and 512 characters in length.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return Domain name. Must be between 1 and 512 characters in length.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * Domain name configuration. See below.
     * 
     */
    @Export(name="domainNameConfiguration", type=DomainNameDomainNameConfiguration.class, parameters={})
    private Output<DomainNameDomainNameConfiguration> domainNameConfiguration;

    /**
     * @return Domain name configuration. See below.
     * 
     */
    public Output<DomainNameDomainNameConfiguration> domainNameConfiguration() {
        return this.domainNameConfiguration;
    }
    /**
     * Mutual TLS authentication configuration for the domain name.
     * 
     */
    @Export(name="mutualTlsAuthentication", type=DomainNameMutualTlsAuthentication.class, parameters={})
    private Output</* @Nullable */ DomainNameMutualTlsAuthentication> mutualTlsAuthentication;

    /**
     * @return Mutual TLS authentication configuration for the domain name.
     * 
     */
    public Output<Optional<DomainNameMutualTlsAuthentication>> mutualTlsAuthentication() {
        return Codegen.optional(this.mutualTlsAuthentication);
    }
    /**
     * Map of tags to assign to the domain name. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the domain name. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DomainName(String name) {
        this(name, DomainNameArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DomainName(String name, DomainNameArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DomainName(String name, DomainNameArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/domainName:DomainName", name, args == null ? DomainNameArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DomainName(String name, Output<String> id, @Nullable DomainNameState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/domainName:DomainName", name, state, makeResourceOptions(options, id));
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
    public static DomainName get(String name, Output<String> id, @Nullable DomainNameState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DomainName(name, id, state, options);
    }
}
