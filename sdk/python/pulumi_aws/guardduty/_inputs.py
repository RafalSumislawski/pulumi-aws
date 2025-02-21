# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'DetectorDatasourcesArgs',
    'DetectorDatasourcesKubernetesArgs',
    'DetectorDatasourcesKubernetesAuditLogsArgs',
    'DetectorDatasourcesS3LogsArgs',
    'FilterFindingCriteriaArgs',
    'FilterFindingCriteriaCriterionArgs',
    'OrganizationConfigurationDatasourcesArgs',
    'OrganizationConfigurationDatasourcesS3LogsArgs',
]

@pulumi.input_type
class DetectorDatasourcesArgs:
    def __init__(__self__, *,
                 kubernetes: Optional[pulumi.Input['DetectorDatasourcesKubernetesArgs']] = None,
                 s3_logs: Optional[pulumi.Input['DetectorDatasourcesS3LogsArgs']] = None):
        """
        :param pulumi.Input['DetectorDatasourcesKubernetesArgs'] kubernetes: Configures [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html).
               See Kubernetes and Kubernetes Audit Logs below for more details.
        :param pulumi.Input['DetectorDatasourcesS3LogsArgs'] s3_logs: Configures [S3 protection](https://docs.aws.amazon.com/guardduty/latest/ug/s3-protection.html).
               See S3 Logs below for more details.
        """
        if kubernetes is not None:
            pulumi.set(__self__, "kubernetes", kubernetes)
        if s3_logs is not None:
            pulumi.set(__self__, "s3_logs", s3_logs)

    @property
    @pulumi.getter
    def kubernetes(self) -> Optional[pulumi.Input['DetectorDatasourcesKubernetesArgs']]:
        """
        Configures [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html).
        See Kubernetes and Kubernetes Audit Logs below for more details.
        """
        return pulumi.get(self, "kubernetes")

    @kubernetes.setter
    def kubernetes(self, value: Optional[pulumi.Input['DetectorDatasourcesKubernetesArgs']]):
        pulumi.set(self, "kubernetes", value)

    @property
    @pulumi.getter(name="s3Logs")
    def s3_logs(self) -> Optional[pulumi.Input['DetectorDatasourcesS3LogsArgs']]:
        """
        Configures [S3 protection](https://docs.aws.amazon.com/guardduty/latest/ug/s3-protection.html).
        See S3 Logs below for more details.
        """
        return pulumi.get(self, "s3_logs")

    @s3_logs.setter
    def s3_logs(self, value: Optional[pulumi.Input['DetectorDatasourcesS3LogsArgs']]):
        pulumi.set(self, "s3_logs", value)


@pulumi.input_type
class DetectorDatasourcesKubernetesArgs:
    def __init__(__self__, *,
                 audit_logs: pulumi.Input['DetectorDatasourcesKubernetesAuditLogsArgs']):
        """
        :param pulumi.Input['DetectorDatasourcesKubernetesAuditLogsArgs'] audit_logs: Configures Kubernetes audit logs as a data source for [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html).
               See Kubernetes Audit Logs below for more details.
        """
        pulumi.set(__self__, "audit_logs", audit_logs)

    @property
    @pulumi.getter(name="auditLogs")
    def audit_logs(self) -> pulumi.Input['DetectorDatasourcesKubernetesAuditLogsArgs']:
        """
        Configures Kubernetes audit logs as a data source for [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html).
        See Kubernetes Audit Logs below for more details.
        """
        return pulumi.get(self, "audit_logs")

    @audit_logs.setter
    def audit_logs(self, value: pulumi.Input['DetectorDatasourcesKubernetesAuditLogsArgs']):
        pulumi.set(self, "audit_logs", value)


@pulumi.input_type
class DetectorDatasourcesKubernetesAuditLogsArgs:
    def __init__(__self__, *,
                 enable: pulumi.Input[bool]):
        """
        :param pulumi.Input[bool] enable: If true, enables Kubernetes audit logs as a data source for [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html).
               Defaults to `true`.
        """
        pulumi.set(__self__, "enable", enable)

    @property
    @pulumi.getter
    def enable(self) -> pulumi.Input[bool]:
        """
        If true, enables Kubernetes audit logs as a data source for [Kubernetes protection](https://docs.aws.amazon.com/guardduty/latest/ug/kubernetes-protection.html).
        Defaults to `true`.
        """
        return pulumi.get(self, "enable")

    @enable.setter
    def enable(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enable", value)


@pulumi.input_type
class DetectorDatasourcesS3LogsArgs:
    def __init__(__self__, *,
                 enable: pulumi.Input[bool]):
        """
        :param pulumi.Input[bool] enable: If true, enables [S3 protection](https://docs.aws.amazon.com/guardduty/latest/ug/s3-protection.html).
               Defaults to `true`.
        """
        pulumi.set(__self__, "enable", enable)

    @property
    @pulumi.getter
    def enable(self) -> pulumi.Input[bool]:
        """
        If true, enables [S3 protection](https://docs.aws.amazon.com/guardduty/latest/ug/s3-protection.html).
        Defaults to `true`.
        """
        return pulumi.get(self, "enable")

    @enable.setter
    def enable(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enable", value)


@pulumi.input_type
class FilterFindingCriteriaArgs:
    def __init__(__self__, *,
                 criterions: pulumi.Input[Sequence[pulumi.Input['FilterFindingCriteriaCriterionArgs']]]):
        pulumi.set(__self__, "criterions", criterions)

    @property
    @pulumi.getter
    def criterions(self) -> pulumi.Input[Sequence[pulumi.Input['FilterFindingCriteriaCriterionArgs']]]:
        return pulumi.get(self, "criterions")

    @criterions.setter
    def criterions(self, value: pulumi.Input[Sequence[pulumi.Input['FilterFindingCriteriaCriterionArgs']]]):
        pulumi.set(self, "criterions", value)


@pulumi.input_type
class FilterFindingCriteriaCriterionArgs:
    def __init__(__self__, *,
                 field: pulumi.Input[str],
                 equals: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 greater_than: Optional[pulumi.Input[str]] = None,
                 greater_than_or_equal: Optional[pulumi.Input[str]] = None,
                 less_than: Optional[pulumi.Input[str]] = None,
                 less_than_or_equal: Optional[pulumi.Input[str]] = None,
                 not_equals: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        :param pulumi.Input[str] field: The name of the field to be evaluated. The full list of field names can be found in [AWS documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_filter-findings.html#filter_criteria).
        :param pulumi.Input[Sequence[pulumi.Input[str]]] equals: List of string values to be evaluated.
        :param pulumi.Input[str] greater_than: A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
        :param pulumi.Input[str] greater_than_or_equal: A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
        :param pulumi.Input[str] less_than: A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
        :param pulumi.Input[str] less_than_or_equal: A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
        :param pulumi.Input[Sequence[pulumi.Input[str]]] not_equals: List of string values to be evaluated.
        """
        pulumi.set(__self__, "field", field)
        if equals is not None:
            pulumi.set(__self__, "equals", equals)
        if greater_than is not None:
            pulumi.set(__self__, "greater_than", greater_than)
        if greater_than_or_equal is not None:
            pulumi.set(__self__, "greater_than_or_equal", greater_than_or_equal)
        if less_than is not None:
            pulumi.set(__self__, "less_than", less_than)
        if less_than_or_equal is not None:
            pulumi.set(__self__, "less_than_or_equal", less_than_or_equal)
        if not_equals is not None:
            pulumi.set(__self__, "not_equals", not_equals)

    @property
    @pulumi.getter
    def field(self) -> pulumi.Input[str]:
        """
        The name of the field to be evaluated. The full list of field names can be found in [AWS documentation](https://docs.aws.amazon.com/guardduty/latest/ug/guardduty_filter-findings.html#filter_criteria).
        """
        return pulumi.get(self, "field")

    @field.setter
    def field(self, value: pulumi.Input[str]):
        pulumi.set(self, "field", value)

    @property
    @pulumi.getter
    def equals(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of string values to be evaluated.
        """
        return pulumi.get(self, "equals")

    @equals.setter
    def equals(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "equals", value)

    @property
    @pulumi.getter(name="greaterThan")
    def greater_than(self) -> Optional[pulumi.Input[str]]:
        """
        A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
        """
        return pulumi.get(self, "greater_than")

    @greater_than.setter
    def greater_than(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "greater_than", value)

    @property
    @pulumi.getter(name="greaterThanOrEqual")
    def greater_than_or_equal(self) -> Optional[pulumi.Input[str]]:
        """
        A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
        """
        return pulumi.get(self, "greater_than_or_equal")

    @greater_than_or_equal.setter
    def greater_than_or_equal(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "greater_than_or_equal", value)

    @property
    @pulumi.getter(name="lessThan")
    def less_than(self) -> Optional[pulumi.Input[str]]:
        """
        A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
        """
        return pulumi.get(self, "less_than")

    @less_than.setter
    def less_than(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "less_than", value)

    @property
    @pulumi.getter(name="lessThanOrEqual")
    def less_than_or_equal(self) -> Optional[pulumi.Input[str]]:
        """
        A value to be evaluated. Accepts either an integer or a date in [RFC 3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
        """
        return pulumi.get(self, "less_than_or_equal")

    @less_than_or_equal.setter
    def less_than_or_equal(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "less_than_or_equal", value)

    @property
    @pulumi.getter(name="notEquals")
    def not_equals(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of string values to be evaluated.
        """
        return pulumi.get(self, "not_equals")

    @not_equals.setter
    def not_equals(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "not_equals", value)


@pulumi.input_type
class OrganizationConfigurationDatasourcesArgs:
    def __init__(__self__, *,
                 s3_logs: Optional[pulumi.Input['OrganizationConfigurationDatasourcesS3LogsArgs']] = None):
        """
        :param pulumi.Input['OrganizationConfigurationDatasourcesS3LogsArgs'] s3_logs: Configuration for the builds to store logs to S3.
        """
        if s3_logs is not None:
            pulumi.set(__self__, "s3_logs", s3_logs)

    @property
    @pulumi.getter(name="s3Logs")
    def s3_logs(self) -> Optional[pulumi.Input['OrganizationConfigurationDatasourcesS3LogsArgs']]:
        """
        Configuration for the builds to store logs to S3.
        """
        return pulumi.get(self, "s3_logs")

    @s3_logs.setter
    def s3_logs(self, value: Optional[pulumi.Input['OrganizationConfigurationDatasourcesS3LogsArgs']]):
        pulumi.set(self, "s3_logs", value)


@pulumi.input_type
class OrganizationConfigurationDatasourcesS3LogsArgs:
    def __init__(__self__, *,
                 auto_enable: pulumi.Input[bool]):
        """
        :param pulumi.Input[bool] auto_enable: When this setting is enabled, all new accounts that are created in, or added to, the organization are added as a member accounts of the organization’s GuardDuty delegated administrator and GuardDuty is enabled in that AWS Region.
        """
        pulumi.set(__self__, "auto_enable", auto_enable)

    @property
    @pulumi.getter(name="autoEnable")
    def auto_enable(self) -> pulumi.Input[bool]:
        """
        When this setting is enabled, all new accounts that are created in, or added to, the organization are added as a member accounts of the organization’s GuardDuty delegated administrator and GuardDuty is enabled in that AWS Region.
        """
        return pulumi.get(self, "auto_enable")

    @auto_enable.setter
    def auto_enable(self, value: pulumi.Input[bool]):
        pulumi.set(self, "auto_enable", value)


