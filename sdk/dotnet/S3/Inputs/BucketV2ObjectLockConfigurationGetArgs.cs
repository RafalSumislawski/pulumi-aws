// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3.Inputs
{

    public sealed class BucketV2ObjectLockConfigurationGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether this bucket has an Object Lock configuration enabled. Valid value is `Enabled`. Use the top-level argument `object_lock_enabled` instead.
        /// </summary>
        [Input("objectLockEnabled")]
        public Input<string>? ObjectLockEnabled { get; set; }

        [Input("rules")]
        private InputList<Inputs.BucketV2ObjectLockConfigurationRuleGetArgs>? _rules;

        /// <summary>
        /// The Object Lock rule in place for this bucket (documented below).
        /// </summary>
        [Obsolete(@"Use the aws_s3_bucket_object_lock_configuration resource instead")]
        public InputList<Inputs.BucketV2ObjectLockConfigurationRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.BucketV2ObjectLockConfigurationRuleGetArgs>());
            set => _rules = value;
        }

        public BucketV2ObjectLockConfigurationGetArgs()
        {
        }
    }
}
