// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package outposts

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Information about a specific hardware asset in an Outpost.
func GetAsset(ctx *pulumi.Context, args *GetAssetArgs, opts ...pulumi.InvokeOption) (*GetAssetResult, error) {
	var rv GetAssetResult
	err := ctx.Invoke("aws:outposts/getAsset:getAsset", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAsset.
type GetAssetArgs struct {
	// Outpost ARN.
	Arn string `pulumi:"arn"`
	// The ID of the asset.
	AssetId string `pulumi:"assetId"`
}

// A collection of values returned by getAsset.
type GetAssetResult struct {
	Arn     string `pulumi:"arn"`
	AssetId string `pulumi:"assetId"`
	// The type of the asset.
	AssetType string `pulumi:"assetType"`
	// The host ID of the Dedicated Hosts on the asset, if a Dedicated Host is provisioned.
	HostId string `pulumi:"hostId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The rack ID of the asset.
	RackId string `pulumi:"rackId"`
}

func GetAssetOutput(ctx *pulumi.Context, args GetAssetOutputArgs, opts ...pulumi.InvokeOption) GetAssetResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAssetResult, error) {
			args := v.(GetAssetArgs)
			r, err := GetAsset(ctx, &args, opts...)
			var s GetAssetResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAssetResultOutput)
}

// A collection of arguments for invoking getAsset.
type GetAssetOutputArgs struct {
	// Outpost ARN.
	Arn pulumi.StringInput `pulumi:"arn"`
	// The ID of the asset.
	AssetId pulumi.StringInput `pulumi:"assetId"`
}

func (GetAssetOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAssetArgs)(nil)).Elem()
}

// A collection of values returned by getAsset.
type GetAssetResultOutput struct{ *pulumi.OutputState }

func (GetAssetResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAssetResult)(nil)).Elem()
}

func (o GetAssetResultOutput) ToGetAssetResultOutput() GetAssetResultOutput {
	return o
}

func (o GetAssetResultOutput) ToGetAssetResultOutputWithContext(ctx context.Context) GetAssetResultOutput {
	return o
}

func (o GetAssetResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v GetAssetResult) string { return v.Arn }).(pulumi.StringOutput)
}

func (o GetAssetResultOutput) AssetId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAssetResult) string { return v.AssetId }).(pulumi.StringOutput)
}

// The type of the asset.
func (o GetAssetResultOutput) AssetType() pulumi.StringOutput {
	return o.ApplyT(func(v GetAssetResult) string { return v.AssetType }).(pulumi.StringOutput)
}

// The host ID of the Dedicated Hosts on the asset, if a Dedicated Host is provisioned.
func (o GetAssetResultOutput) HostId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAssetResult) string { return v.HostId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAssetResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAssetResult) string { return v.Id }).(pulumi.StringOutput)
}

// The rack ID of the asset.
func (o GetAssetResultOutput) RackId() pulumi.StringOutput {
	return o.ApplyT(func(v GetAssetResult) string { return v.RackId }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAssetResultOutput{})
}
