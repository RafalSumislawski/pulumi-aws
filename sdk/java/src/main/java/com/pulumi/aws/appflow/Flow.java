// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.appflow.FlowArgs;
import com.pulumi.aws.appflow.inputs.FlowState;
import com.pulumi.aws.appflow.outputs.FlowDestinationFlowConfig;
import com.pulumi.aws.appflow.outputs.FlowSourceFlowConfig;
import com.pulumi.aws.appflow.outputs.FlowTask;
import com.pulumi.aws.appflow.outputs.FlowTriggerConfig;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an AppFlow flow resource.
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
 *         var exampleSourceBucketV2 = new BucketV2(&#34;exampleSourceBucketV2&#34;);
 * 
 *         var exampleSourceBucketPolicy = new BucketPolicy(&#34;exampleSourceBucketPolicy&#34;, BucketPolicyArgs.builder()        
 *             .bucket(exampleSourceBucketV2.id())
 *             .policy(&#34;&#34;&#34;
 * {
 *     &#34;Statement&#34;: [
 *         {
 *             &#34;Effect&#34;: &#34;Allow&#34;,
 *             &#34;Sid&#34;: &#34;AllowAppFlowSourceActions&#34;,
 *             &#34;Principal&#34;: {
 *                 &#34;Service&#34;: &#34;appflow.amazonaws.com&#34;
 *             },
 *             &#34;Action&#34;: [
 *                 &#34;s3:ListBucket&#34;,
 *                 &#34;s3:GetObject&#34;
 *             ],
 *             &#34;Resource&#34;: [
 *                 &#34;arn:aws:s3:::example_source&#34;,
 *                 &#34;arn:aws:s3:::example_source/*&#34;
 *             ]
 *         }
 *     ],
 * 	&#34;Version&#34;: &#34;2012-10-17&#34;
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var exampleBucketObjectv2 = new BucketObjectv2(&#34;exampleBucketObjectv2&#34;, BucketObjectv2Args.builder()        
 *             .bucket(exampleSourceBucketV2.id())
 *             .key(&#34;example_source.csv&#34;)
 *             .source(new FileAsset(&#34;example_source.csv&#34;))
 *             .build());
 * 
 *         var exampleDestinationBucketV2 = new BucketV2(&#34;exampleDestinationBucketV2&#34;);
 * 
 *         var exampleDestinationBucketPolicy = new BucketPolicy(&#34;exampleDestinationBucketPolicy&#34;, BucketPolicyArgs.builder()        
 *             .bucket(exampleDestinationBucketV2.id())
 *             .policy(&#34;&#34;&#34;
 * 
 * {
 *     &#34;Statement&#34;: [
 *         {
 *             &#34;Effect&#34;: &#34;Allow&#34;,
 *             &#34;Sid&#34;: &#34;AllowAppFlowDestinationActions&#34;,
 *             &#34;Principal&#34;: {
 *                 &#34;Service&#34;: &#34;appflow.amazonaws.com&#34;
 *             },
 *             &#34;Action&#34;: [
 *                 &#34;s3:PutObject&#34;,
 *                 &#34;s3:AbortMultipartUpload&#34;,
 *                 &#34;s3:ListMultipartUploadParts&#34;,
 *                 &#34;s3:ListBucketMultipartUploads&#34;,
 *                 &#34;s3:GetBucketAcl&#34;,
 *                 &#34;s3:PutObjectAcl&#34;
 *             ],
 *             &#34;Resource&#34;: [
 *                 &#34;arn:aws:s3:::example_destination&#34;,
 *                 &#34;arn:aws:s3:::example_destination/*&#34;
 *             ]
 *         }
 *     ],
 * 	&#34;Version&#34;: &#34;2012-10-17&#34;
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var exampleFlow = new Flow(&#34;exampleFlow&#34;, FlowArgs.builder()        
 *             .sourceFlowConfig(FlowSourceFlowConfigArgs.builder()
 *                 .connectorType(&#34;S3&#34;)
 *                 .sourceConnectorProperties(FlowSourceFlowConfigSourceConnectorPropertiesArgs.builder()
 *                     .s3(FlowSourceFlowConfigSourceConnectorPropertiesS3Args.builder()
 *                         .bucketName(exampleSourceBucketPolicy.bucket())
 *                         .bucketPrefix(&#34;example&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .destinationFlowConfigs(FlowDestinationFlowConfigArgs.builder()
 *                 .connectorType(&#34;S3&#34;)
 *                 .destinationConnectorProperties(FlowDestinationFlowConfigDestinationConnectorPropertiesArgs.builder()
 *                     .s3(FlowDestinationFlowConfigDestinationConnectorPropertiesS3Args.builder()
 *                         .bucketName(exampleDestinationBucketPolicy.bucket())
 *                         .s3OutputFormatConfig(FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigArgs.builder()
 *                             .prefixConfig(FlowDestinationFlowConfigDestinationConnectorPropertiesS3S3OutputFormatConfigPrefixConfigArgs.builder()
 *                                 .prefixType(&#34;PATH&#34;)
 *                                 .build())
 *                             .build())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .tasks(FlowTaskArgs.builder()
 *                 .sourceFields(&#34;exampleField&#34;)
 *                 .destinationField(&#34;exampleField&#34;)
 *                 .taskType(&#34;Map&#34;)
 *                 .connectorOperators(FlowTaskConnectorOperatorArgs.builder()
 *                     .s3(&#34;NO_OP&#34;)
 *                     .build())
 *                 .build())
 *             .triggerConfig(FlowTriggerConfigArgs.builder()
 *                 .triggerType(&#34;OnDemand&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * AppFlow flows can be imported using the `arn`, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:appflow/flow:Flow example arn:aws:appflow:us-west-2:123456789012:flow/example-flow
 * ```
 * 
 */
@ResourceType(type="aws:appflow/flow:Flow")
public class Flow extends com.pulumi.resources.CustomResource {
    /**
     * The flow&#39;s Amazon Resource Name (ARN).
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The flow&#39;s Amazon Resource Name (ARN).
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A description of the flow you want to create.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the flow you want to create.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
     * 
     */
    @Export(name="destinationFlowConfigs", type=List.class, parameters={FlowDestinationFlowConfig.class})
    private Output<List<FlowDestinationFlowConfig>> destinationFlowConfigs;

    /**
     * @return A Destination Flow Config that controls how Amazon AppFlow places data in the destination connector.
     * 
     */
    public Output<List<FlowDestinationFlowConfig>> destinationFlowConfigs() {
        return this.destinationFlowConfigs;
    }
    /**
     * The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don&#39;t provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     * 
     */
    @Export(name="kmsArn", type=String.class, parameters={})
    private Output<String> kmsArn;

    /**
     * @return The ARN (Amazon Resource Name) of the Key Management Service (KMS) key you provide for encryption. This is required if you do not want to use the Amazon AppFlow-managed KMS key. If you don&#39;t provide anything here, Amazon AppFlow uses the Amazon AppFlow-managed KMS key.
     * 
     */
    public Output<String> kmsArn() {
        return this.kmsArn;
    }
    /**
     * The name of the flow.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the flow.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The Source Flow Config that controls how Amazon AppFlow retrieves data from the source connector.
     * 
     */
    @Export(name="sourceFlowConfig", type=FlowSourceFlowConfig.class, parameters={})
    private Output<FlowSourceFlowConfig> sourceFlowConfig;

    /**
     * @return The Source Flow Config that controls how Amazon AppFlow retrieves data from the source connector.
     * 
     */
    public Output<FlowSourceFlowConfig> sourceFlowConfig() {
        return this.sourceFlowConfig;
    }
    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * A Task that Amazon AppFlow performs while transferring the data in the flow run.
     * 
     */
    @Export(name="tasks", type=List.class, parameters={FlowTask.class})
    private Output<List<FlowTask>> tasks;

    /**
     * @return A Task that Amazon AppFlow performs while transferring the data in the flow run.
     * 
     */
    public Output<List<FlowTask>> tasks() {
        return this.tasks;
    }
    /**
     * A Trigger that determine how and when the flow runs.
     * 
     */
    @Export(name="triggerConfig", type=FlowTriggerConfig.class, parameters={})
    private Output<FlowTriggerConfig> triggerConfig;

    /**
     * @return A Trigger that determine how and when the flow runs.
     * 
     */
    public Output<FlowTriggerConfig> triggerConfig() {
        return this.triggerConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Flow(String name) {
        this(name, FlowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Flow(String name, FlowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Flow(String name, FlowArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appflow/flow:Flow", name, args == null ? FlowArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Flow(String name, Output<String> id, @Nullable FlowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:appflow/flow:Flow", name, state, makeResourceOptions(options, id));
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
    public static Flow get(String name, Output<String> id, @Nullable FlowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Flow(name, id, state, options);
    }
}
