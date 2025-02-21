// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    public static class GetLocalGateways
    {
        /// <summary>
        /// Provides information for multiple EC2 Local Gateways, such as their identifiers.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The following example retrieves Local Gateways with a resource tag of `service` set to `production`.
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var fooLocalGateways = Output.Create(Aws.Ec2.GetLocalGateways.InvokeAsync(new Aws.Ec2.GetLocalGatewaysArgs
        ///         {
        ///             Tags = 
        ///             {
        ///                 { "service", "production" },
        ///             },
        ///         }));
        ///         this.Foo = fooLocalGateways.Apply(fooLocalGateways =&gt; fooLocalGateways.Ids);
        ///     }
        /// 
        ///     [Output("foo")]
        ///     public Output&lt;string&gt; Foo { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetLocalGatewaysResult> InvokeAsync(GetLocalGatewaysArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetLocalGatewaysResult>("aws:ec2/getLocalGateways:getLocalGateways", args ?? new GetLocalGatewaysArgs(), options.WithDefaults());

        /// <summary>
        /// Provides information for multiple EC2 Local Gateways, such as their identifiers.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// The following example retrieves Local Gateways with a resource tag of `service` set to `production`.
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var fooLocalGateways = Output.Create(Aws.Ec2.GetLocalGateways.InvokeAsync(new Aws.Ec2.GetLocalGatewaysArgs
        ///         {
        ///             Tags = 
        ///             {
        ///                 { "service", "production" },
        ///             },
        ///         }));
        ///         this.Foo = fooLocalGateways.Apply(fooLocalGateways =&gt; fooLocalGateways.Ids);
        ///     }
        /// 
        ///     [Output("foo")]
        ///     public Output&lt;string&gt; Foo { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetLocalGatewaysResult> Invoke(GetLocalGatewaysInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetLocalGatewaysResult>("aws:ec2/getLocalGateways:getLocalGateways", args ?? new GetLocalGatewaysInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetLocalGatewaysArgs : Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetLocalGatewaysFilterArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// </summary>
        public List<Inputs.GetLocalGatewaysFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetLocalGatewaysFilterArgs>());
            set => _filters = value;
        }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// A mapping of tags, each pair of which must exactly match
        /// a pair on the desired local_gateways.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetLocalGatewaysArgs()
        {
        }
    }

    public sealed class GetLocalGatewaysInvokeArgs : Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetLocalGatewaysFilterInputArgs>? _filters;

        /// <summary>
        /// Custom filter block as described below.
        /// </summary>
        public InputList<Inputs.GetLocalGatewaysFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetLocalGatewaysFilterInputArgs>());
            set => _filters = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A mapping of tags, each pair of which must exactly match
        /// a pair on the desired local_gateways.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetLocalGatewaysInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetLocalGatewaysResult
    {
        public readonly ImmutableArray<Outputs.GetLocalGatewaysFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Set of all the Local Gateway identifiers
        /// </summary>
        public readonly ImmutableArray<string> Ids;
        public readonly ImmutableDictionary<string, string> Tags;

        [OutputConstructor]
        private GetLocalGatewaysResult(
            ImmutableArray<Outputs.GetLocalGatewaysFilterResult> filters,

            string id,

            ImmutableArray<string> ids,

            ImmutableDictionary<string, string> tags)
        {
            Filters = filters;
            Id = id;
            Ids = ids;
            Tags = tags;
        }
    }
}
