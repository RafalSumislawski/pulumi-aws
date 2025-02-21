// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.EmrServerless.Outputs
{

    [OutputType]
    public sealed class ApplicationMaximumCapacity
    {
        /// <summary>
        /// The CPU requirements for every worker instance of the worker type.
        /// </summary>
        public readonly string Cpu;
        /// <summary>
        /// The disk requirements for every worker instance of the worker type.
        /// </summary>
        public readonly string? Disk;
        /// <summary>
        /// The memory requirements for every worker instance of the worker type.
        /// </summary>
        public readonly string Memory;

        [OutputConstructor]
        private ApplicationMaximumCapacity(
            string cpu,

            string? disk,

            string memory)
        {
            Cpu = cpu;
            Disk = disk;
            Memory = memory;
        }
    }
}
