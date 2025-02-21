// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AutoScaling.Outputs
{

    [OutputType]
    public sealed class PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStat
    {
        /// <summary>
        /// A structure that defines the CloudWatch metric to return, including the metric name, namespace, and dimensions.
        /// </summary>
        public readonly Outputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetric Metric;
        /// <summary>
        /// The statistic of the metrics to return.
        /// </summary>
        public readonly string Stat;
        /// <summary>
        /// The unit of the metrics to return.
        /// </summary>
        public readonly string? Unit;

        [OutputConstructor]
        private PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStat(
            Outputs.PolicyPredictiveScalingConfigurationMetricSpecificationCustomizedScalingMetricSpecificationMetricDataQueryMetricStatMetric metric,

            string stat,

            string? unit)
        {
            Metric = metric;
            Stat = stat;
            Unit = unit;
        }
    }
}
