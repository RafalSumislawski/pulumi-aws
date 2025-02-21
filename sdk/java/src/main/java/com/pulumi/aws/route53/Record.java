// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.route53.RecordArgs;
import com.pulumi.aws.route53.inputs.RecordState;
import com.pulumi.aws.route53.outputs.RecordAlias;
import com.pulumi.aws.route53.outputs.RecordFailoverRoutingPolicy;
import com.pulumi.aws.route53.outputs.RecordGeolocationRoutingPolicy;
import com.pulumi.aws.route53.outputs.RecordLatencyRoutingPolicy;
import com.pulumi.aws.route53.outputs.RecordWeightedRoutingPolicy;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Route53 record resource.
 * 
 * ## Example Usage
 * ### Simple routing policy
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
 *         var www = new Record(&#34;www&#34;, RecordArgs.builder()        
 *             .zoneId(aws_route53_zone.primary().zone_id())
 *             .name(&#34;www.example.com&#34;)
 *             .type(&#34;A&#34;)
 *             .ttl(&#34;300&#34;)
 *             .records(aws_eip.lb().public_ip())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Weighted routing policy
 * Other routing policies are configured similarly. See [Amazon Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html) for details.
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
 *         var www_dev = new Record(&#34;www-dev&#34;, RecordArgs.builder()        
 *             .zoneId(aws_route53_zone.primary().zone_id())
 *             .name(&#34;www&#34;)
 *             .type(&#34;CNAME&#34;)
 *             .ttl(&#34;5&#34;)
 *             .weightedRoutingPolicies(RecordWeightedRoutingPolicyArgs.builder()
 *                 .weight(10)
 *                 .build())
 *             .setIdentifier(&#34;dev&#34;)
 *             .records(&#34;dev.example.com&#34;)
 *             .build());
 * 
 *         var www_live = new Record(&#34;www-live&#34;, RecordArgs.builder()        
 *             .zoneId(aws_route53_zone.primary().zone_id())
 *             .name(&#34;www&#34;)
 *             .type(&#34;CNAME&#34;)
 *             .ttl(&#34;5&#34;)
 *             .weightedRoutingPolicies(RecordWeightedRoutingPolicyArgs.builder()
 *                 .weight(90)
 *                 .build())
 *             .setIdentifier(&#34;live&#34;)
 *             .records(&#34;live.example.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Alias record
 * See [related part of Amazon Route 53 Developer Guide](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resource-record-sets-choosing-alias-non-alias.html)
 * to understand differences between alias and non-alias records.
 * 
 * TTL for all alias records is [60 seconds](https://aws.amazon.com/route53/faqs/#dns_failover_do_i_need_to_adjust),
 * you cannot change this, therefore `ttl` has to be omitted in alias records.
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
 *         var main = new LoadBalancer(&#34;main&#34;, LoadBalancerArgs.builder()        
 *             .availabilityZones(&#34;us-east-1c&#34;)
 *             .listeners(LoadBalancerListenerArgs.builder()
 *                 .instancePort(80)
 *                 .instanceProtocol(&#34;http&#34;)
 *                 .lbPort(80)
 *                 .lbProtocol(&#34;http&#34;)
 *                 .build())
 *             .build());
 * 
 *         var www = new Record(&#34;www&#34;, RecordArgs.builder()        
 *             .zoneId(aws_route53_zone.primary().zone_id())
 *             .name(&#34;example.com&#34;)
 *             .type(&#34;A&#34;)
 *             .aliases(RecordAliasArgs.builder()
 *                 .name(main.dnsName())
 *                 .zoneId(main.zoneId())
 *                 .evaluateTargetHealth(true)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### NS and SOA Record Management
 * 
 * When creating Route 53 zones, the `NS` and `SOA` records for the zone are automatically created. Enabling the `allow_overwrite` argument will allow managing these records in a single deployment without the requirement for `import`.
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
 *         var exampleZone = new Zone(&#34;exampleZone&#34;);
 * 
 *         var exampleRecord = new Record(&#34;exampleRecord&#34;, RecordArgs.builder()        
 *             .allowOverwrite(true)
 *             .name(&#34;test.example.com&#34;)
 *             .ttl(172800)
 *             .type(&#34;NS&#34;)
 *             .zoneId(exampleZone.zoneId())
 *             .records(            
 *                 exampleZone.nameServers().apply(nameServers -&gt; nameServers[0]),
 *                 exampleZone.nameServers().apply(nameServers -&gt; nameServers[1]),
 *                 exampleZone.nameServers().apply(nameServers -&gt; nameServers[2]),
 *                 exampleZone.nameServers().apply(nameServers -&gt; nameServers[3]))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Route53 Records can be imported using ID of the record, which is the zone identifier, record name, and record type, separated by underscores (`_`)E.g.,
 * 
 * ```sh
 *  $ pulumi import aws:route53/record:Record myrecord Z4KAPRWWNC7JR_dev.example.com_NS
 * ```
 * 
 *  If the record also contains a delegated set identifier, it can be appended
 * 
 * ```sh
 *  $ pulumi import aws:route53/record:Record myrecord Z4KAPRWWNC7JR_dev.example.com_NS_dev
 * ```
 * 
 */
@ResourceType(type="aws:route53/record:Record")
public class Record extends com.pulumi.resources.CustomResource {
    /**
     * An alias block. Conflicts with `ttl` &amp; `records`.
     * Alias record documented below.
     * 
     */
    @Export(name="aliases", type=List.class, parameters={RecordAlias.class})
    private Output</* @Nullable */ List<RecordAlias>> aliases;

    /**
     * @return An alias block. Conflicts with `ttl` &amp; `records`.
     * Alias record documented below.
     * 
     */
    public Output<Optional<List<RecordAlias>>> aliases() {
        return Codegen.optional(this.aliases);
    }
    /**
     * Allow creation of this record to overwrite an existing record, if any. This does not affect the ability to update the record using this provider and does not prevent other resources within this provider or manual Route 53 changes outside this provider from overwriting this record. `false` by default. This configuration is not recommended for most environments.
     * 
     */
    @Export(name="allowOverwrite", type=Boolean.class, parameters={})
    private Output<Boolean> allowOverwrite;

    /**
     * @return Allow creation of this record to overwrite an existing record, if any. This does not affect the ability to update the record using this provider and does not prevent other resources within this provider or manual Route 53 changes outside this provider from overwriting this record. `false` by default. This configuration is not recommended for most environments.
     * 
     */
    public Output<Boolean> allowOverwrite() {
        return this.allowOverwrite;
    }
    /**
     * A block indicating the routing behavior when associated health check fails. Conflicts with any other routing policy. Documented below.
     * 
     */
    @Export(name="failoverRoutingPolicies", type=List.class, parameters={RecordFailoverRoutingPolicy.class})
    private Output</* @Nullable */ List<RecordFailoverRoutingPolicy>> failoverRoutingPolicies;

    /**
     * @return A block indicating the routing behavior when associated health check fails. Conflicts with any other routing policy. Documented below.
     * 
     */
    public Output<Optional<List<RecordFailoverRoutingPolicy>>> failoverRoutingPolicies() {
        return Codegen.optional(this.failoverRoutingPolicies);
    }
    /**
     * [FQDN](https://en.wikipedia.org/wiki/Fully_qualified_domain_name) built using the zone domain and `name`.
     * 
     */
    @Export(name="fqdn", type=String.class, parameters={})
    private Output<String> fqdn;

    /**
     * @return [FQDN](https://en.wikipedia.org/wiki/Fully_qualified_domain_name) built using the zone domain and `name`.
     * 
     */
    public Output<String> fqdn() {
        return this.fqdn;
    }
    /**
     * A block indicating a routing policy based on the geolocation of the requestor. Conflicts with any other routing policy. Documented below.
     * 
     */
    @Export(name="geolocationRoutingPolicies", type=List.class, parameters={RecordGeolocationRoutingPolicy.class})
    private Output</* @Nullable */ List<RecordGeolocationRoutingPolicy>> geolocationRoutingPolicies;

    /**
     * @return A block indicating a routing policy based on the geolocation of the requestor. Conflicts with any other routing policy. Documented below.
     * 
     */
    public Output<Optional<List<RecordGeolocationRoutingPolicy>>> geolocationRoutingPolicies() {
        return Codegen.optional(this.geolocationRoutingPolicies);
    }
    /**
     * The health check the record should be associated with.
     * 
     */
    @Export(name="healthCheckId", type=String.class, parameters={})
    private Output</* @Nullable */ String> healthCheckId;

    /**
     * @return The health check the record should be associated with.
     * 
     */
    public Output<Optional<String>> healthCheckId() {
        return Codegen.optional(this.healthCheckId);
    }
    /**
     * A block indicating a routing policy based on the latency between the requestor and an AWS region. Conflicts with any other routing policy. Documented below.
     * 
     */
    @Export(name="latencyRoutingPolicies", type=List.class, parameters={RecordLatencyRoutingPolicy.class})
    private Output</* @Nullable */ List<RecordLatencyRoutingPolicy>> latencyRoutingPolicies;

    /**
     * @return A block indicating a routing policy based on the latency between the requestor and an AWS region. Conflicts with any other routing policy. Documented below.
     * 
     */
    public Output<Optional<List<RecordLatencyRoutingPolicy>>> latencyRoutingPolicies() {
        return Codegen.optional(this.latencyRoutingPolicies);
    }
    /**
     * Set to `true` to indicate a multivalue answer routing policy. Conflicts with any other routing policy.
     * 
     */
    @Export(name="multivalueAnswerRoutingPolicy", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> multivalueAnswerRoutingPolicy;

    /**
     * @return Set to `true` to indicate a multivalue answer routing policy. Conflicts with any other routing policy.
     * 
     */
    public Output<Optional<Boolean>> multivalueAnswerRoutingPolicy() {
        return Codegen.optional(this.multivalueAnswerRoutingPolicy);
    }
    /**
     * DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="records", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> records;

    public Output<Optional<List<String>>> records() {
        return Codegen.optional(this.records);
    }
    /**
     * Unique identifier to differentiate records with routing policies from one another. Required if using `failover`, `geolocation`, `latency`, `multivalue_answer`, or `weighted` routing policies documented below.
     * 
     */
    @Export(name="setIdentifier", type=String.class, parameters={})
    private Output</* @Nullable */ String> setIdentifier;

    /**
     * @return Unique identifier to differentiate records with routing policies from one another. Required if using `failover`, `geolocation`, `latency`, `multivalue_answer`, or `weighted` routing policies documented below.
     * 
     */
    public Output<Optional<String>> setIdentifier() {
        return Codegen.optional(this.setIdentifier);
    }
    /**
     * The TTL of the record.
     * 
     */
    @Export(name="ttl", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> ttl;

    /**
     * @return The TTL of the record.
     * 
     */
    public Output<Optional<Integer>> ttl() {
        return Codegen.optional(this.ttl);
    }
    /**
     * `PRIMARY` or `SECONDARY`. A `PRIMARY` record will be served if its healthcheck is passing, otherwise the `SECONDARY` will be served. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html#dns-failover-failover-rrsets
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return `PRIMARY` or `SECONDARY`. A `PRIMARY` record will be served if its healthcheck is passing, otherwise the `SECONDARY` will be served. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/dns-failover-configuring-options.html#dns-failover-failover-rrsets
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * A block indicating a weighted routing policy. Conflicts with any other routing policy. Documented below.
     * 
     */
    @Export(name="weightedRoutingPolicies", type=List.class, parameters={RecordWeightedRoutingPolicy.class})
    private Output</* @Nullable */ List<RecordWeightedRoutingPolicy>> weightedRoutingPolicies;

    /**
     * @return A block indicating a weighted routing policy. Conflicts with any other routing policy. Documented below.
     * 
     */
    public Output<Optional<List<RecordWeightedRoutingPolicy>>> weightedRoutingPolicies() {
        return Codegen.optional(this.weightedRoutingPolicies);
    }
    /**
     * Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See `resource_elb.zone_id` for example.
     * 
     */
    @Export(name="zoneId", type=String.class, parameters={})
    private Output<String> zoneId;

    /**
     * @return Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See `resource_elb.zone_id` for example.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Record(String name) {
        this(name, RecordArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Record(String name, RecordArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Record(String name, RecordArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/record:Record", name, args == null ? RecordArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Record(String name, Output<String> id, @Nullable RecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/record:Record", name, state, makeResourceOptions(options, id));
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
    public static Record get(String name, Output<String> id, @Nullable RecordState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Record(name, id, state, options);
    }
}
