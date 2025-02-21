// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appconfig;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appconfig.DeploymentStrategyArgs;
import com.pulumi.aws.appconfig.inputs.DeploymentStrategyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an AppConfig Deployment Strategy resource.
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
 *         var example = new DeploymentStrategy(&#34;example&#34;, DeploymentStrategyArgs.builder()        
 *             .deploymentDurationInMinutes(3)
 *             .description(&#34;Example Deployment Strategy&#34;)
 *             .finalBakeTimeInMinutes(4)
 *             .growthFactor(10)
 *             .growthType(&#34;LINEAR&#34;)
 *             .replicateTo(&#34;NONE&#34;)
 *             .tags(Map.of(&#34;Type&#34;, &#34;AppConfig Deployment Strategy&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * AppConfig Deployment Strategies can be imported by using their deployment strategy ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:appconfig/deploymentStrategy:DeploymentStrategy example 11xxxxx
 * ```
 * 
 */
@ResourceType(type="aws:appconfig/deploymentStrategy:DeploymentStrategy")
public class DeploymentStrategy extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the AppConfig Deployment Strategy.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the AppConfig Deployment Strategy.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Total amount of time for a deployment to last. Minimum value of 0, maximum value of 1440.
     * 
     */
    @Export(name="deploymentDurationInMinutes", type=Integer.class, parameters={})
    private Output<Integer> deploymentDurationInMinutes;

    /**
     * @return Total amount of time for a deployment to last. Minimum value of 0, maximum value of 1440.
     * 
     */
    public Output<Integer> deploymentDurationInMinutes() {
        return this.deploymentDurationInMinutes;
    }
    /**
     * A description of the deployment strategy. Can be at most 1024 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the deployment strategy. Can be at most 1024 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The amount of time AWS AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back. Minimum value of 0, maximum value of 1440.
     * 
     */
    @Export(name="finalBakeTimeInMinutes", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> finalBakeTimeInMinutes;

    /**
     * @return The amount of time AWS AppConfig monitors for alarms before considering the deployment to be complete and no longer eligible for automatic roll back. Minimum value of 0, maximum value of 1440.
     * 
     */
    public Output<Optional<Integer>> finalBakeTimeInMinutes() {
        return Codegen.optional(this.finalBakeTimeInMinutes);
    }
    /**
     * The percentage of targets to receive a deployed configuration during each interval. Minimum value of 1.0, maximum value of 100.0.
     * 
     */
    @Export(name="growthFactor", type=Double.class, parameters={})
    private Output<Double> growthFactor;

    /**
     * @return The percentage of targets to receive a deployed configuration during each interval. Minimum value of 1.0, maximum value of 100.0.
     * 
     */
    public Output<Double> growthFactor() {
        return this.growthFactor;
    }
    /**
     * The algorithm used to define how percentage grows over time. Valid value: `LINEAR` and `EXPONENTIAL`. Defaults to `LINEAR`.
     * 
     */
    @Export(name="growthType", type=String.class, parameters={})
    private Output</* @Nullable */ String> growthType;

    /**
     * @return The algorithm used to define how percentage grows over time. Valid value: `LINEAR` and `EXPONENTIAL`. Defaults to `LINEAR`.
     * 
     */
    public Output<Optional<String>> growthType() {
        return Codegen.optional(this.growthType);
    }
    /**
     * A name for the deployment strategy. Must be between 1 and 64 characters in length.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name for the deployment strategy. Must be between 1 and 64 characters in length.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Where to save the deployment strategy. Valid values: `NONE` and `SSM_DOCUMENT`.
     * 
     */
    @Export(name="replicateTo", type=String.class, parameters={})
    private Output<String> replicateTo;

    /**
     * @return Where to save the deployment strategy. Valid values: `NONE` and `SSM_DOCUMENT`.
     * 
     */
    public Output<String> replicateTo() {
        return this.replicateTo;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeploymentStrategy(String name) {
        this(name, DeploymentStrategyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeploymentStrategy(String name, DeploymentStrategyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeploymentStrategy(String name, DeploymentStrategyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appconfig/deploymentStrategy:DeploymentStrategy", name, args == null ? DeploymentStrategyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DeploymentStrategy(String name, Output<String> id, @Nullable DeploymentStrategyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appconfig/deploymentStrategy:DeploymentStrategy", name, state, makeResourceOptions(options, id));
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
    public static DeploymentStrategy get(String name, Output<String> id, @Nullable DeploymentStrategyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeploymentStrategy(name, id, state, options);
    }
}
