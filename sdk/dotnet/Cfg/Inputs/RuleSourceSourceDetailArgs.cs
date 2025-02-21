// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Cfg.Inputs
{

    public sealed class RuleSourceSourceDetailArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWSresources. This defaults to `aws.config` and is the only valid value.
        /// </summary>
        [Input("eventSource")]
        public Input<string>? EventSource { get; set; }

        /// <summary>
        /// The frequency that you want AWS Config to run evaluations for a rule that istriggered periodically. If specified, requires `message_type` to be `ScheduledNotification`.
        /// </summary>
        [Input("maximumExecutionFrequency")]
        public Input<string>? MaximumExecutionFrequency { get; set; }

        /// <summary>
        /// The type of notification that triggers AWS Config to run an evaluation for a rule. You canspecify the following notification types:
        /// </summary>
        [Input("messageType")]
        public Input<string>? MessageType { get; set; }

        public RuleSourceSourceDetailArgs()
        {
        }
    }
}
