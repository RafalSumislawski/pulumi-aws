// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppFlow.Outputs
{

    [OutputType]
    public sealed class ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsRedshift
    {
        /// <summary>
        /// The password that corresponds to the user name.
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// The name of the user.
        /// </summary>
        public readonly string Username;

        [OutputConstructor]
        private ConnectorProfileConnectorProfileConfigConnectorProfileCredentialsRedshift(
            string password,

            string username)
        {
            Password = password;
            Username = username;
        }
    }
}
