// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.enums;

import com.pulumi.core.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    /**
     * A Region represents any valid Amazon region that may be targeted with deployments.
     * 
     */
    @EnumType
    public enum Region {
        AFSouth1("af-south-1"),
        APEast1("ap-east-1"),
        APNortheast1("ap-northeast-1"),
        APNortheast2("ap-northeast-2"),
        APNortheast3("ap-northeast-3"),
        APSouth1("ap-south-1"),
        APSoutheast2("ap-southeast-2"),
        APSoutheast1("ap-southeast-1"),
        CACentral("ca-central-1"),
        CNNorth1("cn-north-1"),
        CNNorthwest1("cn-northwest-1"),
        EUCentral1("eu-central-1"),
        EUNorth1("eu-north-1"),
        EUWest1("eu-west-1"),
        EUWest2("eu-west-2"),
        EUWest3("eu-west-3"),
        EUSouth1("eu-south-1"),
        MESouth1("me-south-1"),
        SAEast1("sa-east-1"),
        USGovEast1("us-gov-east-1"),
        USGovWest1("us-gov-west-1"),
        USEast1("us-east-1"),
        USEast2("us-east-2"),
        USWest1("us-west-1"),
        USWest2("us-west-2");

        private final String value;

        Region(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "Region[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }
