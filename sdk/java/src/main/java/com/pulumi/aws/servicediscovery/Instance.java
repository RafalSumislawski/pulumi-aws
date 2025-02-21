// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicediscovery;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.servicediscovery.InstanceArgs;
import com.pulumi.aws.servicediscovery.inputs.InstanceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a Service Discovery Instance resource.
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
 *         var exampleVpc = new Vpc(&#34;exampleVpc&#34;, VpcArgs.builder()        
 *             .cidrBlock(&#34;10.0.0.0/16&#34;)
 *             .enableDnsSupport(true)
 *             .enableDnsHostnames(true)
 *             .build());
 * 
 *         var examplePrivateDnsNamespace = new PrivateDnsNamespace(&#34;examplePrivateDnsNamespace&#34;, PrivateDnsNamespaceArgs.builder()        
 *             .description(&#34;example&#34;)
 *             .vpc(exampleVpc.id())
 *             .build());
 * 
 *         var exampleService = new Service(&#34;exampleService&#34;, ServiceArgs.builder()        
 *             .dnsConfig(ServiceDnsConfigArgs.builder()
 *                 .namespaceId(examplePrivateDnsNamespace.id())
 *                 .dnsRecords(ServiceDnsConfigDnsRecordArgs.builder()
 *                     .ttl(10)
 *                     .type(&#34;A&#34;)
 *                     .build())
 *                 .routingPolicy(&#34;MULTIVALUE&#34;)
 *                 .build())
 *             .healthCheckCustomConfig(ServiceHealthCheckCustomConfigArgs.builder()
 *                 .failureThreshold(1)
 *                 .build())
 *             .build());
 * 
 *         var exampleInstance = new Instance(&#34;exampleInstance&#34;, InstanceArgs.builder()        
 *             .instanceId(&#34;example-instance-id&#34;)
 *             .serviceId(exampleService.id())
 *             .attributes(Map.ofEntries(
 *                 Map.entry(&#34;AWS_INSTANCE_IPV4&#34;, &#34;172.18.0.1&#34;),
 *                 Map.entry(&#34;custom_attribute&#34;, &#34;custom&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
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
 *         var exampleHttpNamespace = new HttpNamespace(&#34;exampleHttpNamespace&#34;, HttpNamespaceArgs.builder()        
 *             .description(&#34;example&#34;)
 *             .build());
 * 
 *         var exampleService = new Service(&#34;exampleService&#34;, ServiceArgs.builder()        
 *             .namespaceId(exampleHttpNamespace.id())
 *             .build());
 * 
 *         var exampleInstance = new Instance(&#34;exampleInstance&#34;, InstanceArgs.builder()        
 *             .instanceId(&#34;example-instance-id&#34;)
 *             .serviceId(exampleService.id())
 *             .attributes(Map.of(&#34;AWS_EC2_INSTANCE_ID&#34;, &#34;i-0abdg374kd892cj6dl&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Service Discovery Instance can be imported using the service ID and instance ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:servicediscovery/instance:Instance example 0123456789/i-0123
 * ```
 * 
 */
@ResourceType(type="aws:servicediscovery/instance:Instance")
public class Instance extends com.pulumi.resources.CustomResource {
    /**
     * A map contains the attributes of the instance. Check the [doc](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#API_RegisterInstance_RequestSyntax) for the supported attributes and syntax.
     * 
     */
    @Export(name="attributes", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> attributes;

    /**
     * @return A map contains the attributes of the instance. Check the [doc](https://docs.aws.amazon.com/cloud-map/latest/api/API_RegisterInstance.html#API_RegisterInstance_RequestSyntax) for the supported attributes and syntax.
     * 
     */
    public Output<Map<String,String>> attributes() {
        return this.attributes;
    }
    /**
     * The ID of the service instance.
     * 
     */
    @Export(name="instanceId", type=String.class, parameters={})
    private Output<String> instanceId;

    /**
     * @return The ID of the service instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * The ID of the service that you want to use to create the instance.
     * 
     */
    @Export(name="serviceId", type=String.class, parameters={})
    private Output<String> serviceId;

    /**
     * @return The ID of the service that you want to use to create the instance.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Instance(String name) {
        this(name, InstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Instance(String name, InstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Instance(String name, InstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicediscovery/instance:Instance", name, args == null ? InstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Instance(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicediscovery/instance:Instance", name, state, makeResourceOptions(options, id));
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
    public static Instance get(String name, Output<String> id, @Nullable InstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Instance(name, id, state, options);
    }
}
