// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iot.PolicyAttachmentArgs;
import com.pulumi.aws.iot.inputs.PolicyAttachmentState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an IoT policy attachment.
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
 *         var pubsub = new Policy(&#34;pubsub&#34;, PolicyArgs.builder()        
 *             .policy(&#34;&#34;&#34;
 * {
 *   &#34;Version&#34;: &#34;2012-10-17&#34;,
 *   &#34;Statement&#34;: [
 *     {
 *       &#34;Action&#34;: [
 *         &#34;iot:*&#34;
 *       ],
 *       &#34;Effect&#34;: &#34;Allow&#34;,
 *       &#34;Resource&#34;: &#34;*&#34;
 *     }
 *   ]
 * }
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *         var cert = new Certificate(&#34;cert&#34;, CertificateArgs.builder()        
 *             .csr(Files.readString(&#34;csr.pem&#34;))
 *             .active(true)
 *             .build());
 * 
 *         var att = new PolicyAttachment(&#34;att&#34;, PolicyAttachmentArgs.builder()        
 *             .policy(pubsub.name())
 *             .target(cert.arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="aws:iot/policyAttachment:PolicyAttachment")
public class PolicyAttachment extends com.pulumi.resources.CustomResource {
    /**
     * The name of the policy to attach.
     * 
     */
    @Export(name="policy", type=String.class, parameters={})
    private Output<String> policy;

    /**
     * @return The name of the policy to attach.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * The identity to which the policy is attached.
     * 
     */
    @Export(name="target", type=String.class, parameters={})
    private Output<String> target;

    /**
     * @return The identity to which the policy is attached.
     * 
     */
    public Output<String> target() {
        return this.target;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PolicyAttachment(String name) {
        this(name, PolicyAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PolicyAttachment(String name, PolicyAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PolicyAttachment(String name, PolicyAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iot/policyAttachment:PolicyAttachment", name, args == null ? PolicyAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PolicyAttachment(String name, Output<String> id, @Nullable PolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iot/policyAttachment:PolicyAttachment", name, state, makeResourceOptions(options, id));
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
    public static PolicyAttachment get(String name, Output<String> id, @Nullable PolicyAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PolicyAttachment(name, id, state, options);
    }
}
