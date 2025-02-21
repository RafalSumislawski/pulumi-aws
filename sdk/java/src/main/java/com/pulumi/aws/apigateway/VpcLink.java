// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigateway.VpcLinkArgs;
import com.pulumi.aws.apigateway.inputs.VpcLinkState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an API Gateway VPC Link.
 * 
 * &gt; **Note:** Amazon API Gateway Version 1 VPC Links enable private integrations that connect REST APIs to private resources in a VPC.
 * To enable private integration for HTTP APIs, use the `Amazon API Gateway Version 2 VPC Link` resource.
 * 
 * ## Example Usage
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
 *         var exampleLoadBalancer = new LoadBalancer(&#34;exampleLoadBalancer&#34;, LoadBalancerArgs.builder()        
 *             .internal(true)
 *             .loadBalancerType(&#34;network&#34;)
 *             .subnetMappings(LoadBalancerSubnetMappingArgs.builder()
 *                 .subnetId(&#34;12345&#34;)
 *                 .build())
 *             .build());
 * 
 *         var exampleVpcLink = new VpcLink(&#34;exampleVpcLink&#34;, VpcLinkArgs.builder()        
 *             .description(&#34;example description&#34;)
 *             .targetArn(exampleLoadBalancer.arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * API Gateway VPC Link can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigateway/vpcLink:VpcLink example 12345abcde
 * ```
 * 
 */
@ResourceType(type="aws:apigateway/vpcLink:VpcLink")
public class VpcLink extends com.pulumi.resources.CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The description of the VPC link.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the VPC link.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The name used to label and identify the VPC link.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name used to label and identify the VPC link.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
     * 
     */
    @Export(name="targetArn", type=String.class, parameters={})
    private Output<String> targetArn;

    /**
     * @return The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
     * 
     */
    public Output<String> targetArn() {
        return this.targetArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcLink(String name) {
        this(name, VpcLinkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcLink(String name, VpcLinkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcLink(String name, VpcLinkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/vpcLink:VpcLink", name, args == null ? VpcLinkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcLink(String name, Output<String> id, @Nullable VpcLinkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigateway/vpcLink:VpcLink", name, state, makeResourceOptions(options, id));
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
    public static VpcLink get(String name, Output<String> id, @Nullable VpcLinkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcLink(name, id, state, options);
    }
}
