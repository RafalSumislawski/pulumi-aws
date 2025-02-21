// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ApplicationLoadBalancing
{
    /// <summary>
    /// Provides a Target Group resource for use with Load Balancer resources.
    /// 
    /// &gt; **Note:** `aws.alb.TargetGroup` is known as `aws.lb.TargetGroup`. The functionality is identical.
    /// 
    /// ## Example Usage
    /// ### Instance Target Group
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var main = new Aws.Ec2.Vpc("main", new Aws.Ec2.VpcArgs
    ///         {
    ///             CidrBlock = "10.0.0.0/16",
    ///         });
    ///         var test = new Aws.LB.TargetGroup("test", new Aws.LB.TargetGroupArgs
    ///         {
    ///             Port = 80,
    ///             Protocol = "HTTP",
    ///             VpcId = main.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### IP Target Group
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var main = new Aws.Ec2.Vpc("main", new Aws.Ec2.VpcArgs
    ///         {
    ///             CidrBlock = "10.0.0.0/16",
    ///         });
    ///         var ip_example = new Aws.LB.TargetGroup("ip-example", new Aws.LB.TargetGroupArgs
    ///         {
    ///             Port = 80,
    ///             Protocol = "HTTP",
    ///             TargetType = "ip",
    ///             VpcId = main.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### Lambda Target Group
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var lambda_example = new Aws.LB.TargetGroup("lambda-example", new Aws.LB.TargetGroupArgs
    ///         {
    ///             TargetType = "lambda",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// ### ALB Target Group
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var alb_example = new Aws.LB.TargetGroup("alb-example", new Aws.LB.TargetGroupArgs
    ///         {
    ///             TargetType = "alb",
    ///             Port = 80,
    ///             Protocol = "TCP",
    ///             VpcId = aws_vpc.Main.Id,
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Target Groups can be imported using their ARN, e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:applicationloadbalancing/targetGroup:TargetGroup app_front_end arn:aws:elasticloadbalancing:us-west-2:187416307283:targetgroup/app-front-end/20cfe21448b66314
    /// ```
    /// </summary>
    [Obsolete(@"aws.applicationloadbalancing.TargetGroup has been deprecated in favor of aws.alb.TargetGroup")]
    [AwsResourceType("aws:applicationloadbalancing/targetGroup:TargetGroup")]
    public partial class TargetGroup : Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the Target Group (matches `id`).
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// ARN suffix for use with CloudWatch Metrics.
        /// </summary>
        [Output("arnSuffix")]
        public Output<string> ArnSuffix { get; private set; } = null!;

        /// <summary>
        /// Whether to terminate connections at the end of the deregistration timeout on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#deregistration-delay) for more information. Default is `false`.
        /// </summary>
        [Output("connectionTermination")]
        public Output<bool?> ConnectionTermination { get; private set; } = null!;

        /// <summary>
        /// Amount time for Elastic Load Balancing to wait before changing the state of a deregistering target from draining to unused. The range is 0-3600 seconds. The default value is 300 seconds.
        /// </summary>
        [Output("deregistrationDelay")]
        public Output<int?> DeregistrationDelay { get; private set; } = null!;

        /// <summary>
        /// Health Check configuration block. Detailed below.
        /// </summary>
        [Output("healthCheck")]
        public Output<Outputs.TargetGroupHealthCheck> HealthCheck { get; private set; } = null!;

        /// <summary>
        /// Whether the request and response headers exchanged between the load balancer and the Lambda function include arrays of values or strings. Only applies when `target_type` is `lambda`. Default is `false`.
        /// </summary>
        [Output("lambdaMultiValueHeadersEnabled")]
        public Output<bool?> LambdaMultiValueHeadersEnabled { get; private set; } = null!;

        /// <summary>
        /// Determines how the load balancer selects targets when routing requests. Only applicable for Application Load Balancer Target Groups. The value is `round_robin` or `least_outstanding_requests`. The default is `round_robin`.
        /// </summary>
        [Output("loadBalancingAlgorithmType")]
        public Output<string> LoadBalancingAlgorithmType { get; private set; } = null!;

        /// <summary>
        /// Name of the target group. If omitted, this provider will assign a random, unique name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Creates a unique name beginning with the specified prefix. Conflicts with `name`. Cannot be longer than 6 characters.
        /// </summary>
        [Output("namePrefix")]
        public Output<string?> NamePrefix { get; private set; } = null!;

        /// <summary>
        /// Port to use to connect with the target. Valid values are either ports 1-65535, or `traffic-port`. Defaults to `traffic-port`.
        /// </summary>
        [Output("port")]
        public Output<int?> Port { get; private set; } = null!;

        /// <summary>
        /// Whether client IP preservation is enabled. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#client-ip-preservation) for more information.
        /// </summary>
        [Output("preserveClientIp")]
        public Output<string> PreserveClientIp { get; private set; } = null!;

        /// <summary>
        /// Protocol to use to connect with the target. Defaults to `HTTP`. Not applicable when `target_type` is `lambda`.
        /// </summary>
        [Output("protocol")]
        public Output<string?> Protocol { get; private set; } = null!;

        /// <summary>
        /// Only applicable when `protocol` is `HTTP` or `HTTPS`. The protocol version. Specify GRPC to send requests to targets using gRPC. Specify HTTP2 to send requests to targets using HTTP/2. The default is HTTP1, which sends requests to targets using HTTP/1.1
        /// </summary>
        [Output("protocolVersion")]
        public Output<string> ProtocolVersion { get; private set; } = null!;

        /// <summary>
        /// Whether to enable support for proxy protocol v2 on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#proxy-protocol) for more information. Default is `false`.
        /// </summary>
        [Output("proxyProtocolV2")]
        public Output<bool?> ProxyProtocolV2 { get; private set; } = null!;

        /// <summary>
        /// Amount time for targets to warm up before the load balancer sends them a full share of requests. The range is 30-900 seconds or 0 to disable. The default value is 0 seconds.
        /// </summary>
        [Output("slowStart")]
        public Output<int?> SlowStart { get; private set; } = null!;

        /// <summary>
        /// Stickiness configuration block. Detailed below.
        /// </summary>
        [Output("stickiness")]
        public Output<Outputs.TargetGroupStickiness> Stickiness { get; private set; } = null!;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider .
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Type of target that you must specify when registering targets with this target group. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_CreateTargetGroup.html) for supported values. The default is `instance`.
        /// </summary>
        [Output("targetType")]
        public Output<string?> TargetType { get; private set; } = null!;

        /// <summary>
        /// Identifier of the VPC in which to create the target group. Required when `target_type` is `instance`, `ip` or `alb`. Does not apply when `target_type` is `lambda`.
        /// </summary>
        [Output("vpcId")]
        public Output<string?> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a TargetGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TargetGroup(string name, TargetGroupArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:applicationloadbalancing/targetGroup:TargetGroup", name, args ?? new TargetGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TargetGroup(string name, Input<string> id, TargetGroupState? state = null, CustomResourceOptions? options = null)
            : base("aws:applicationloadbalancing/targetGroup:TargetGroup", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing TargetGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TargetGroup Get(string name, Input<string> id, TargetGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new TargetGroup(name, id, state, options);
        }
    }

    public sealed class TargetGroupArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether to terminate connections at the end of the deregistration timeout on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#deregistration-delay) for more information. Default is `false`.
        /// </summary>
        [Input("connectionTermination")]
        public Input<bool>? ConnectionTermination { get; set; }

        /// <summary>
        /// Amount time for Elastic Load Balancing to wait before changing the state of a deregistering target from draining to unused. The range is 0-3600 seconds. The default value is 300 seconds.
        /// </summary>
        [Input("deregistrationDelay")]
        public Input<int>? DeregistrationDelay { get; set; }

        /// <summary>
        /// Health Check configuration block. Detailed below.
        /// </summary>
        [Input("healthCheck")]
        public Input<Inputs.TargetGroupHealthCheckArgs>? HealthCheck { get; set; }

        /// <summary>
        /// Whether the request and response headers exchanged between the load balancer and the Lambda function include arrays of values or strings. Only applies when `target_type` is `lambda`. Default is `false`.
        /// </summary>
        [Input("lambdaMultiValueHeadersEnabled")]
        public Input<bool>? LambdaMultiValueHeadersEnabled { get; set; }

        /// <summary>
        /// Determines how the load balancer selects targets when routing requests. Only applicable for Application Load Balancer Target Groups. The value is `round_robin` or `least_outstanding_requests`. The default is `round_robin`.
        /// </summary>
        [Input("loadBalancingAlgorithmType")]
        public Input<string>? LoadBalancingAlgorithmType { get; set; }

        /// <summary>
        /// Name of the target group. If omitted, this provider will assign a random, unique name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Creates a unique name beginning with the specified prefix. Conflicts with `name`. Cannot be longer than 6 characters.
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// Port to use to connect with the target. Valid values are either ports 1-65535, or `traffic-port`. Defaults to `traffic-port`.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Whether client IP preservation is enabled. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#client-ip-preservation) for more information.
        /// </summary>
        [Input("preserveClientIp")]
        public Input<string>? PreserveClientIp { get; set; }

        /// <summary>
        /// Protocol to use to connect with the target. Defaults to `HTTP`. Not applicable when `target_type` is `lambda`.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// Only applicable when `protocol` is `HTTP` or `HTTPS`. The protocol version. Specify GRPC to send requests to targets using gRPC. Specify HTTP2 to send requests to targets using HTTP/2. The default is HTTP1, which sends requests to targets using HTTP/1.1
        /// </summary>
        [Input("protocolVersion")]
        public Input<string>? ProtocolVersion { get; set; }

        /// <summary>
        /// Whether to enable support for proxy protocol v2 on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#proxy-protocol) for more information. Default is `false`.
        /// </summary>
        [Input("proxyProtocolV2")]
        public Input<bool>? ProxyProtocolV2 { get; set; }

        /// <summary>
        /// Amount time for targets to warm up before the load balancer sends them a full share of requests. The range is 30-900 seconds or 0 to disable. The default value is 0 seconds.
        /// </summary>
        [Input("slowStart")]
        public Input<int>? SlowStart { get; set; }

        /// <summary>
        /// Stickiness configuration block. Detailed below.
        /// </summary>
        [Input("stickiness")]
        public Input<Inputs.TargetGroupStickinessArgs>? Stickiness { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Type of target that you must specify when registering targets with this target group. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_CreateTargetGroup.html) for supported values. The default is `instance`.
        /// </summary>
        [Input("targetType")]
        public Input<string>? TargetType { get; set; }

        /// <summary>
        /// Identifier of the VPC in which to create the target group. Required when `target_type` is `instance`, `ip` or `alb`. Does not apply when `target_type` is `lambda`.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public TargetGroupArgs()
        {
        }
    }

    public sealed class TargetGroupState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the Target Group (matches `id`).
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// ARN suffix for use with CloudWatch Metrics.
        /// </summary>
        [Input("arnSuffix")]
        public Input<string>? ArnSuffix { get; set; }

        /// <summary>
        /// Whether to terminate connections at the end of the deregistration timeout on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#deregistration-delay) for more information. Default is `false`.
        /// </summary>
        [Input("connectionTermination")]
        public Input<bool>? ConnectionTermination { get; set; }

        /// <summary>
        /// Amount time for Elastic Load Balancing to wait before changing the state of a deregistering target from draining to unused. The range is 0-3600 seconds. The default value is 300 seconds.
        /// </summary>
        [Input("deregistrationDelay")]
        public Input<int>? DeregistrationDelay { get; set; }

        /// <summary>
        /// Health Check configuration block. Detailed below.
        /// </summary>
        [Input("healthCheck")]
        public Input<Inputs.TargetGroupHealthCheckGetArgs>? HealthCheck { get; set; }

        /// <summary>
        /// Whether the request and response headers exchanged between the load balancer and the Lambda function include arrays of values or strings. Only applies when `target_type` is `lambda`. Default is `false`.
        /// </summary>
        [Input("lambdaMultiValueHeadersEnabled")]
        public Input<bool>? LambdaMultiValueHeadersEnabled { get; set; }

        /// <summary>
        /// Determines how the load balancer selects targets when routing requests. Only applicable for Application Load Balancer Target Groups. The value is `round_robin` or `least_outstanding_requests`. The default is `round_robin`.
        /// </summary>
        [Input("loadBalancingAlgorithmType")]
        public Input<string>? LoadBalancingAlgorithmType { get; set; }

        /// <summary>
        /// Name of the target group. If omitted, this provider will assign a random, unique name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Creates a unique name beginning with the specified prefix. Conflicts with `name`. Cannot be longer than 6 characters.
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// Port to use to connect with the target. Valid values are either ports 1-65535, or `traffic-port`. Defaults to `traffic-port`.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Whether client IP preservation is enabled. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#client-ip-preservation) for more information.
        /// </summary>
        [Input("preserveClientIp")]
        public Input<string>? PreserveClientIp { get; set; }

        /// <summary>
        /// Protocol to use to connect with the target. Defaults to `HTTP`. Not applicable when `target_type` is `lambda`.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// Only applicable when `protocol` is `HTTP` or `HTTPS`. The protocol version. Specify GRPC to send requests to targets using gRPC. Specify HTTP2 to send requests to targets using HTTP/2. The default is HTTP1, which sends requests to targets using HTTP/1.1
        /// </summary>
        [Input("protocolVersion")]
        public Input<string>? ProtocolVersion { get; set; }

        /// <summary>
        /// Whether to enable support for proxy protocol v2 on Network Load Balancers. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/network/load-balancer-target-groups.html#proxy-protocol) for more information. Default is `false`.
        /// </summary>
        [Input("proxyProtocolV2")]
        public Input<bool>? ProxyProtocolV2 { get; set; }

        /// <summary>
        /// Amount time for targets to warm up before the load balancer sends them a full share of requests. The range is 30-900 seconds or 0 to disable. The default value is 0 seconds.
        /// </summary>
        [Input("slowStart")]
        public Input<int>? SlowStart { get; set; }

        /// <summary>
        /// Stickiness configuration block. Detailed below.
        /// </summary>
        [Input("stickiness")]
        public Input<Inputs.TargetGroupStickinessGetArgs>? Stickiness { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider .
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// Type of target that you must specify when registering targets with this target group. See [doc](https://docs.aws.amazon.com/elasticloadbalancing/latest/APIReference/API_CreateTargetGroup.html) for supported values. The default is `instance`.
        /// </summary>
        [Input("targetType")]
        public Input<string>? TargetType { get; set; }

        /// <summary>
        /// Identifier of the VPC in which to create the target group. Required when `target_type` is `instance`, `ip` or `alb`. Does not apply when `target_type` is `lambda`.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public TargetGroupState()
        {
        }
    }
}
