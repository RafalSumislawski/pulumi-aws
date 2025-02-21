# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetServiceResult',
    'AwaitableGetServiceResult',
    'get_service',
    'get_service_output',
]

@pulumi.output_type
class GetServiceResult:
    """
    A collection of values returned by getService.
    """
    def __init__(__self__, arn=None, description=None, dns_configs=None, health_check_configs=None, health_check_custom_configs=None, id=None, name=None, namespace_id=None, tags=None, tags_all=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if dns_configs and not isinstance(dns_configs, list):
            raise TypeError("Expected argument 'dns_configs' to be a list")
        pulumi.set(__self__, "dns_configs", dns_configs)
        if health_check_configs and not isinstance(health_check_configs, list):
            raise TypeError("Expected argument 'health_check_configs' to be a list")
        pulumi.set(__self__, "health_check_configs", health_check_configs)
        if health_check_custom_configs and not isinstance(health_check_custom_configs, list):
            raise TypeError("Expected argument 'health_check_custom_configs' to be a list")
        pulumi.set(__self__, "health_check_custom_configs", health_check_custom_configs)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if namespace_id and not isinstance(namespace_id, str):
            raise TypeError("Expected argument 'namespace_id' to be a str")
        pulumi.set(__self__, "namespace_id", namespace_id)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if tags_all and not isinstance(tags_all, dict):
            raise TypeError("Expected argument 'tags_all' to be a dict")
        pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        The ARN of the service.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        The description of the service.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="dnsConfigs")
    def dns_configs(self) -> Sequence['outputs.GetServiceDnsConfigResult']:
        """
        A complex type that contains information about the resource record sets that you want Amazon Route 53 to create when you register an instance.
        """
        return pulumi.get(self, "dns_configs")

    @property
    @pulumi.getter(name="healthCheckConfigs")
    def health_check_configs(self) -> Sequence['outputs.GetServiceHealthCheckConfigResult']:
        """
        A complex type that contains settings for an optional health check. Only for Public DNS namespaces.
        """
        return pulumi.get(self, "health_check_configs")

    @property
    @pulumi.getter(name="healthCheckCustomConfigs")
    def health_check_custom_configs(self) -> Sequence['outputs.GetServiceHealthCheckCustomConfigResult']:
        """
        A complex type that contains settings for ECS managed health checks.
        """
        return pulumi.get(self, "health_check_custom_configs")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="namespaceId")
    def namespace_id(self) -> str:
        """
        The ID of the namespace to use for DNS configuration.
        """
        return pulumi.get(self, "namespace_id")

    @property
    @pulumi.getter
    def tags(self) -> Optional[Mapping[str, str]]:
        """
        A map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Mapping[str, str]:
        """
        A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        """
        return pulumi.get(self, "tags_all")


class AwaitableGetServiceResult(GetServiceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceResult(
            arn=self.arn,
            description=self.description,
            dns_configs=self.dns_configs,
            health_check_configs=self.health_check_configs,
            health_check_custom_configs=self.health_check_custom_configs,
            id=self.id,
            name=self.name,
            namespace_id=self.namespace_id,
            tags=self.tags,
            tags_all=self.tags_all)


def get_service(name: Optional[str] = None,
                namespace_id: Optional[str] = None,
                tags: Optional[Mapping[str, str]] = None,
                tags_all: Optional[Mapping[str, str]] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceResult:
    """
    Retrieves information about a Service Discovery Service.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.servicediscovery.get_service(name="example",
        namespace_id="NAMESPACE_ID_VALUE")
    ```


    :param str name: The name of the service.
    :param str namespace_id: The ID of the namespace that the service belongs to.
    :param Mapping[str, str] tags: A map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
    :param Mapping[str, str] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['namespaceId'] = namespace_id
    __args__['tags'] = tags
    __args__['tagsAll'] = tags_all
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('aws:servicediscovery/getService:getService', __args__, opts=opts, typ=GetServiceResult).value

    return AwaitableGetServiceResult(
        arn=__ret__.arn,
        description=__ret__.description,
        dns_configs=__ret__.dns_configs,
        health_check_configs=__ret__.health_check_configs,
        health_check_custom_configs=__ret__.health_check_custom_configs,
        id=__ret__.id,
        name=__ret__.name,
        namespace_id=__ret__.namespace_id,
        tags=__ret__.tags,
        tags_all=__ret__.tags_all)


@_utilities.lift_output_func(get_service)
def get_service_output(name: Optional[pulumi.Input[str]] = None,
                       namespace_id: Optional[pulumi.Input[str]] = None,
                       tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                       tags_all: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetServiceResult]:
    """
    Retrieves information about a Service Discovery Service.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_aws as aws

    test = aws.servicediscovery.get_service(name="example",
        namespace_id="NAMESPACE_ID_VALUE")
    ```


    :param str name: The name of the service.
    :param str namespace_id: The ID of the namespace that the service belongs to.
    :param Mapping[str, str] tags: A map of tags to assign to the service. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
    :param Mapping[str, str] tags_all: A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
    """
    ...
