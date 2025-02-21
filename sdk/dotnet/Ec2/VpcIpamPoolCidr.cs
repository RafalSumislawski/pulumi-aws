// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    /// <summary>
    /// Provisions a CIDR from an IPAM address pool.
    /// 
    /// &gt; **NOTE:** Provisioning Public IPv4 or Public IPv6 require [steps outside the scope of this resource](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-byoip.html#prepare-for-byoip). The resource accepts `message` and `signature` as part of the `cidr_authorization_context` attribute but those must be generated ahead of time. Public IPv6 CIDRs that are provisioned into a Pool with `publicly_advertisable = true` and all public IPv4 CIDRs also require creating a Route Origin Authorization (ROA) object in your Regional Internet Registry (RIR).
    /// 
    /// &gt; **NOTE:** In order to deprovision CIDRs all Allocations must be released. Allocations created by a VPC take up to 30 minutes to be released. However, for IPAM to properly manage the removal of allocation records created by VPCs and other resources, you must [grant it permissions](https://docs.aws.amazon.com/vpc/latest/ipam/choose-single-user-or-orgs-ipam.html) in
    /// either a single account or organizationally. If you are unable to deprovision a cidr after waiting over 30 minutes, you may be missing the Service Linked Role.
    /// 
    /// ## Import
    /// 
    /// IPAMs can be imported using the `&lt;cidr&gt;_&lt;ipam-pool-id&gt;`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import aws:ec2/vpcIpamPoolCidr:VpcIpamPoolCidr example 172.2.0.0/24_ipam-pool-0e634f5a1517cccdc
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2/vpcIpamPoolCidr:VpcIpamPoolCidr")]
    public partial class VpcIpamPoolCidr : Pulumi.CustomResource
    {
        /// <summary>
        /// The CIDR you want to assign to the pool.
        /// </summary>
        [Output("cidr")]
        public Output<string> Cidr { get; private set; } = null!;

        /// <summary>
        /// A signed document that proves that you are authorized to bring the specified IP address range to Amazon using BYOIP. This is not stored in the state file. See cidr_authorization_context for more information.
        /// </summary>
        [Output("cidrAuthorizationContext")]
        public Output<Outputs.VpcIpamPoolCidrCidrAuthorizationContext?> CidrAuthorizationContext { get; private set; } = null!;

        /// <summary>
        /// The ID of the pool to which you want to assign a CIDR.
        /// </summary>
        [Output("ipamPoolId")]
        public Output<string> IpamPoolId { get; private set; } = null!;


        /// <summary>
        /// Create a VpcIpamPoolCidr resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpcIpamPoolCidr(string name, VpcIpamPoolCidrArgs args, CustomResourceOptions? options = null)
            : base("aws:ec2/vpcIpamPoolCidr:VpcIpamPoolCidr", name, args ?? new VpcIpamPoolCidrArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpcIpamPoolCidr(string name, Input<string> id, VpcIpamPoolCidrState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2/vpcIpamPoolCidr:VpcIpamPoolCidr", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VpcIpamPoolCidr resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpcIpamPoolCidr Get(string name, Input<string> id, VpcIpamPoolCidrState? state = null, CustomResourceOptions? options = null)
        {
            return new VpcIpamPoolCidr(name, id, state, options);
        }
    }

    public sealed class VpcIpamPoolCidrArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The CIDR you want to assign to the pool.
        /// </summary>
        [Input("cidr")]
        public Input<string>? Cidr { get; set; }

        /// <summary>
        /// A signed document that proves that you are authorized to bring the specified IP address range to Amazon using BYOIP. This is not stored in the state file. See cidr_authorization_context for more information.
        /// </summary>
        [Input("cidrAuthorizationContext")]
        public Input<Inputs.VpcIpamPoolCidrCidrAuthorizationContextArgs>? CidrAuthorizationContext { get; set; }

        /// <summary>
        /// The ID of the pool to which you want to assign a CIDR.
        /// </summary>
        [Input("ipamPoolId", required: true)]
        public Input<string> IpamPoolId { get; set; } = null!;

        public VpcIpamPoolCidrArgs()
        {
        }
    }

    public sealed class VpcIpamPoolCidrState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The CIDR you want to assign to the pool.
        /// </summary>
        [Input("cidr")]
        public Input<string>? Cidr { get; set; }

        /// <summary>
        /// A signed document that proves that you are authorized to bring the specified IP address range to Amazon using BYOIP. This is not stored in the state file. See cidr_authorization_context for more information.
        /// </summary>
        [Input("cidrAuthorizationContext")]
        public Input<Inputs.VpcIpamPoolCidrCidrAuthorizationContextGetArgs>? CidrAuthorizationContext { get; set; }

        /// <summary>
        /// The ID of the pool to which you want to assign a CIDR.
        /// </summary>
        [Input("ipamPoolId")]
        public Input<string>? IpamPoolId { get; set; }

        public VpcIpamPoolCidrState()
        {
        }
    }
}
