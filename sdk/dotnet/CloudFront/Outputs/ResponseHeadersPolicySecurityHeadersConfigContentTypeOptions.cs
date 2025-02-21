// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudFront.Outputs
{

    [OutputType]
    public sealed class ResponseHeadersPolicySecurityHeadersConfigContentTypeOptions
    {
        /// <summary>
        /// A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
        /// </summary>
        public readonly bool Override;

        [OutputConstructor]
        private ResponseHeadersPolicySecurityHeadersConfigContentTypeOptions(bool @override)
        {
            Override = @override;
        }
    }
}
