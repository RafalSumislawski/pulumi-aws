// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.networkmanager.ConnectionArgs;
import com.pulumi.aws.networkmanager.inputs.ConnectionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a connection between two devices.
 * The devices can be a physical or virtual appliance that connects to a third-party appliance in a VPC, or a physical appliance that connects to another physical appliance in an on-premises network.
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
 *         var example = new Connection(&#34;example&#34;, ConnectionArgs.builder()        
 *             .globalNetworkId(aws_networkmanager_global_network.example().id())
 *             .deviceId(aws_networkmanager_device.example1().id())
 *             .connectedDeviceId(aws_networkmanager_device.example2().id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_networkmanager_connection` can be imported using the connection ARN, e.g.
 * 
 * ```sh
 *  $ pulumi import aws:networkmanager/connection:Connection example arn:aws:networkmanager::123456789012:device/global-network-0d47f6t230mz46dy4/connection-07f6fd08867abc123
 * ```
 * 
 */
@ResourceType(type="aws:networkmanager/connection:Connection")
public class Connection extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the connection.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the connection.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ID of the second device in the connection.
     * 
     */
    @Export(name="connectedDeviceId", type=String.class, parameters={})
    private Output<String> connectedDeviceId;

    /**
     * @return The ID of the second device in the connection.
     * 
     */
    public Output<String> connectedDeviceId() {
        return this.connectedDeviceId;
    }
    /**
     * The ID of the link for the second device.
     * 
     */
    @Export(name="connectedLinkId", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectedLinkId;

    /**
     * @return The ID of the link for the second device.
     * 
     */
    public Output<Optional<String>> connectedLinkId() {
        return Codegen.optional(this.connectedLinkId);
    }
    /**
     * A description of the connection.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the connection.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ID of the first device in the connection.
     * 
     */
    @Export(name="deviceId", type=String.class, parameters={})
    private Output<String> deviceId;

    /**
     * @return The ID of the first device in the connection.
     * 
     */
    public Output<String> deviceId() {
        return this.deviceId;
    }
    /**
     * The ID of the global network.
     * 
     */
    @Export(name="globalNetworkId", type=String.class, parameters={})
    private Output<String> globalNetworkId;

    /**
     * @return The ID of the global network.
     * 
     */
    public Output<String> globalNetworkId() {
        return this.globalNetworkId;
    }
    /**
     * The ID of the link for the first device.
     * 
     */
    @Export(name="linkId", type=String.class, parameters={})
    private Output</* @Nullable */ String> linkId;

    /**
     * @return The ID of the link for the first device.
     * 
     */
    public Output<Optional<String>> linkId() {
        return Codegen.optional(this.linkId);
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
    public Connection(String name) {
        this(name, ConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connection(String name, ConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connection(String name, ConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkmanager/connection:Connection", name, args == null ? ConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Connection(String name, Output<String> id, @Nullable ConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:networkmanager/connection:Connection", name, state, makeResourceOptions(options, id));
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
    public static Connection get(String name, Output<String> id, @Nullable ConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Connection(name, id, state, options);
    }
}
