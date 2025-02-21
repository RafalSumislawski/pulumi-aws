// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigatewayv2.ApiMappingArgs;
import com.pulumi.aws.apigatewayv2.inputs.ApiMappingState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Amazon API Gateway Version 2 API mapping.
 * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-custom-domains.html).
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
 *         var example = new ApiMapping(&#34;example&#34;, ApiMappingArgs.builder()        
 *             .apiId(aws_apigatewayv2_api.example().id())
 *             .domainName(aws_apigatewayv2_domain_name.example().id())
 *             .stage(aws_apigatewayv2_stage.example().id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_apigatewayv2_api_mapping` can be imported by using the API mapping identifier and domain name, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigatewayv2/apiMapping:ApiMapping example 1122334/ws-api.example.com
 * ```
 * 
 */
@ResourceType(type="aws:apigatewayv2/apiMapping:ApiMapping")
public class ApiMapping extends com.pulumi.resources.CustomResource {
    /**
     * The API identifier.
     * 
     */
    @Export(name="apiId", type=String.class, parameters={})
    private Output<String> apiId;

    /**
     * @return The API identifier.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }
    /**
     * The [API mapping key](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-mapping-template-reference.html).
     * 
     */
    @Export(name="apiMappingKey", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiMappingKey;

    /**
     * @return The [API mapping key](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-mapping-template-reference.html).
     * 
     */
    public Output<Optional<String>> apiMappingKey() {
        return Codegen.optional(this.apiMappingKey);
    }
    /**
     * The domain name. Use the `aws.apigatewayv2.DomainName` resource to configure a domain name.
     * 
     */
    @Export(name="domainName", type=String.class, parameters={})
    private Output<String> domainName;

    /**
     * @return The domain name. Use the `aws.apigatewayv2.DomainName` resource to configure a domain name.
     * 
     */
    public Output<String> domainName() {
        return this.domainName;
    }
    /**
     * The API stage. Use the `aws.apigatewayv2.Stage` resource to configure an API stage.
     * 
     */
    @Export(name="stage", type=String.class, parameters={})
    private Output<String> stage;

    /**
     * @return The API stage. Use the `aws.apigatewayv2.Stage` resource to configure an API stage.
     * 
     */
    public Output<String> stage() {
        return this.stage;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiMapping(String name) {
        this(name, ApiMappingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiMapping(String name, ApiMappingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiMapping(String name, ApiMappingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/apiMapping:ApiMapping", name, args == null ? ApiMappingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiMapping(String name, Output<String> id, @Nullable ApiMappingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/apiMapping:ApiMapping", name, state, makeResourceOptions(options, id));
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
    public static ApiMapping get(String name, Output<String> id, @Nullable ApiMappingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiMapping(name, id, state, options);
    }
}
