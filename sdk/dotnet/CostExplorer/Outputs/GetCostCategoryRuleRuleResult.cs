// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CostExplorer.Outputs
{

    [OutputType]
    public sealed class GetCostCategoryRuleRuleResult
    {
        /// <summary>
        /// Return results that match both `Dimension` objects.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCostCategoryRuleRuleAndResult> Ands;
        /// <summary>
        /// Configuration block for the filter that's based on `CostCategory` values. See below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCostCategoryRuleRuleCostCategoryResult> CostCategories;
        /// <summary>
        /// Configuration block for the specific `Dimension` to use for `Expression`. See below.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCostCategoryRuleRuleDimensionResult> Dimensions;
        /// <summary>
        /// Return results that match both `Dimension` object.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCostCategoryRuleRuleNotResult> Nots;
        /// <summary>
        /// Return results that match both `Dimension` object.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetCostCategoryRuleRuleOrResult> Ors;
        public readonly ImmutableArray<Outputs.GetCostCategoryRuleRuleTagResult> Tags;

        [OutputConstructor]
        private GetCostCategoryRuleRuleResult(
            ImmutableArray<Outputs.GetCostCategoryRuleRuleAndResult> ands,

            ImmutableArray<Outputs.GetCostCategoryRuleRuleCostCategoryResult> costCategories,

            ImmutableArray<Outputs.GetCostCategoryRuleRuleDimensionResult> dimensions,

            ImmutableArray<Outputs.GetCostCategoryRuleRuleNotResult> nots,

            ImmutableArray<Outputs.GetCostCategoryRuleRuleOrResult> ors,

            ImmutableArray<Outputs.GetCostCategoryRuleRuleTagResult> tags)
        {
            Ands = ands;
            CostCategories = costCategories;
            Dimensions = dimensions;
            Nots = nots;
            Ors = ors;
            Tags = tags;
        }
    }
}
