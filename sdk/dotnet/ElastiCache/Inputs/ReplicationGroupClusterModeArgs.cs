// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.ElastiCache.Inputs
{

    public sealed class ReplicationGroupClusterModeArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number of node groups (shards) for this Redis replication group. Changing this number will trigger an online resizing operation before other settings modifications. Required unless `global_replication_group_id` is set.
        /// </summary>
        [Input("numNodeGroups")]
        public Input<int>? NumNodeGroups { get; set; }

        /// <summary>
        /// Number of replica nodes in each node group. Valid values are 0 to 5. Changing this number will trigger an online resizing operation before other settings modifications.
        /// </summary>
        [Input("replicasPerNodeGroup")]
        public Input<int>? ReplicasPerNodeGroup { get; set; }

        public ReplicationGroupClusterModeArgs()
        {
        }
    }
}
