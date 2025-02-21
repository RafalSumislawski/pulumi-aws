// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.networkmanager.GlobalNetworkArgs;
import com.pulumi.aws.networkmanager.inputs.GlobalNetworkState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a global network resource.
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
 *         var example = new GlobalNetwork(&#34;example&#34;, GlobalNetworkArgs.builder()        
 *             .description(&#34;example&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_networkmanager_global_network` can be imported using the global network ID, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:networkmanager/globalNetwork:GlobalNetwork example global-network-0d47f6t230mz46dy4
 * ```
 * 
 */
@ResourceType(type="aws:networkmanager/globalNetwork:GlobalNetwork")
public class GlobalNetwork extends com.pulumi.resources.CustomResource {
    /**
     * Global Network Amazon Resource Name (ARN)
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Global Network Amazon Resource Name (ARN)
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Description of the Global Network.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the Global Network.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GlobalNetwork(String name) {
        this(name, GlobalNetworkArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GlobalNetwork(String name, @Nullable GlobalNetworkArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GlobalNetwork(String name, @Nullable GlobalNetworkArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkmanager/globalNetwork:GlobalNetwork", name, args == null ? GlobalNetworkArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GlobalNetwork(String name, Output<String> id, @Nullable GlobalNetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkmanager/globalNetwork:GlobalNetwork", name, state, makeResourceOptions(options, id));
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
    public static GlobalNetwork get(String name, Output<String> id, @Nullable GlobalNetworkState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GlobalNetwork(name, id, state, options);
    }
}
