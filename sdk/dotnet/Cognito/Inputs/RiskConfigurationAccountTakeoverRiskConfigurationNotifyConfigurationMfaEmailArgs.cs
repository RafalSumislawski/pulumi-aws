// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Cognito.Inputs
{

    public sealed class RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationMfaEmailArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The email HTML body.
        /// </summary>
        [Input("htmlBody", required: true)]
        public Input<string> HtmlBody { get; set; } = null!;

        /// <summary>
        /// The email subject.
        /// </summary>
        [Input("subject", required: true)]
        public Input<string> Subject { get; set; } = null!;

        [Input("textBody", required: true)]
        public Input<string> TextBody { get; set; } = null!;

        public RiskConfigurationAccountTakeoverRiskConfigurationNotifyConfigurationMfaEmailArgs()
        {
        }
    }
}
