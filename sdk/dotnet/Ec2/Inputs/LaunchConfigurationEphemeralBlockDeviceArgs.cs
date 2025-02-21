// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Inputs
{

    public sealed class LaunchConfigurationEphemeralBlockDeviceArgs : Pulumi.ResourceArgs
    {
        [Input("deviceName", required: true)]
        public Input<string> DeviceName { get; set; } = null!;

        [Input("noDevice")]
        public Input<bool>? NoDevice { get; set; }

        [Input("virtualName")]
        public Input<string>? VirtualName { get; set; }

        public LaunchConfigurationEphemeralBlockDeviceArgs()
        {
        }
    }
}
