// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.EmrServerless.Inputs
{

    public sealed class ApplicationAutoStartConfigurationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enables the application to automatically stop after a certain amount of time being idle. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        public ApplicationAutoStartConfigurationArgs()
        {
        }
    }
}
