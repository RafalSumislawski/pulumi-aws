// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Keyspaces.Inputs
{

    public sealed class TableSchemaDefinitionPartitionKeyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the partition key column.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public TableSchemaDefinitionPartitionKeyArgs()
        {
        }
    }
}
