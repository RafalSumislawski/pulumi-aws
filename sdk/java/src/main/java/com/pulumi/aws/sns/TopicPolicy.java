// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sns;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sns.TopicPolicyArgs;
import com.pulumi.aws.sns.inputs.TopicPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an SNS topic policy resource
 * 
 * &gt; **NOTE:** If a Principal is specified as just an AWS account ID rather than an ARN, AWS silently converts it to the ARN for the root user, causing future deployments to differ. To avoid this problem, just specify the full ARN, e.g. `arn:aws:iam::123456789012:root`
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
 *         var test = new Topic(&#34;test&#34;);
 * 
 *         final var snsTopicPolicy = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .policyId(&#34;__default_policy_ID&#34;)
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .actions(                
 *                     &#34;SNS:Subscribe&#34;,
 *                     &#34;SNS:SetTopicAttributes&#34;,
 *                     &#34;SNS:RemovePermission&#34;,
 *                     &#34;SNS:Receive&#34;,
 *                     &#34;SNS:Publish&#34;,
 *                     &#34;SNS:ListSubscriptionsByTopic&#34;,
 *                     &#34;SNS:GetTopicAttributes&#34;,
 *                     &#34;SNS:DeleteTopic&#34;,
 *                     &#34;SNS:AddPermission&#34;)
 *                 .conditions(GetPolicyDocumentStatementConditionArgs.builder()
 *                     .test(&#34;StringEquals&#34;)
 *                     .variable(&#34;AWS:SourceOwner&#34;)
 *                     .values(var_.account-id())
 *                     .build())
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;AWS&#34;)
 *                     .identifiers(&#34;*&#34;)
 *                     .build())
 *                 .resources(test.arn())
 *                 .sid(&#34;__default_statement_ID&#34;)
 *                 .build())
 *             .build());
 * 
 *         var default_ = new TopicPolicy(&#34;default&#34;, TopicPolicyArgs.builder()        
 *             .arn(test.arn())
 *             .policy(snsTopicPolicy.apply(getPolicyDocumentResult -&gt; getPolicyDocumentResult).apply(snsTopicPolicy -&gt; snsTopicPolicy.apply(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json())))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * SNS Topic Policy can be imported using the topic ARN, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:sns/topicPolicy:TopicPolicy user_updates arn:aws:sns:us-west-2:0123456789012:my-topic
 * ```
 * 
 */
@ResourceType(type="aws:sns/topicPolicy:TopicPolicy")
public class TopicPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the SNS topic
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The ARN of the SNS topic
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The AWS Account ID of the SNS topic owner
     * 
     */
    @Export(name="owner", type=String.class, parameters={})
    private Output<String> owner;

    /**
     * @return The AWS Account ID of the SNS topic owner
     * 
     */
    public Output<String> owner() {
        return this.owner;
    }
    /**
     * The fully-formed AWS policy as JSON.
     * 
     */
    @Export(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    /**
     * @return The fully-formed AWS policy as JSON.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TopicPolicy(String name) {
        this(name, TopicPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TopicPolicy(String name, TopicPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TopicPolicy(String name, TopicPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sns/topicPolicy:TopicPolicy", name, args == null ? TopicPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TopicPolicy(String name, Output<String> id, @Nullable TopicPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sns/topicPolicy:TopicPolicy", name, state, makeResourceOptions(options, id));
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
    public static TopicPolicy get(String name, Output<String> id, @Nullable TopicPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TopicPolicy(name, id, state, options);
    }
}
