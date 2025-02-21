// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.acmpca.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs Empty = new CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs();

    /**
     * Fully qualified domain name (FQDN) associated with the certificate subject. Must be less than or equal to 64 characters in length.
     * 
     */
    @Import(name="commonName")
    private @Nullable Output<String> commonName;

    /**
     * @return Fully qualified domain name (FQDN) associated with the certificate subject. Must be less than or equal to 64 characters in length.
     * 
     */
    public Optional<Output<String>> commonName() {
        return Optional.ofNullable(this.commonName);
    }

    /**
     * Two digit code that specifies the country in which the certificate subject located. Must be less than or equal to 2 characters in length.
     * 
     */
    @Import(name="country")
    private @Nullable Output<String> country;

    /**
     * @return Two digit code that specifies the country in which the certificate subject located. Must be less than or equal to 2 characters in length.
     * 
     */
    public Optional<Output<String>> country() {
        return Optional.ofNullable(this.country);
    }

    /**
     * Disambiguating information for the certificate subject. Must be less than or equal to 64 characters in length.
     * 
     */
    @Import(name="distinguishedNameQualifier")
    private @Nullable Output<String> distinguishedNameQualifier;

    /**
     * @return Disambiguating information for the certificate subject. Must be less than or equal to 64 characters in length.
     * 
     */
    public Optional<Output<String>> distinguishedNameQualifier() {
        return Optional.ofNullable(this.distinguishedNameQualifier);
    }

    /**
     * Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and III for third. Must be less than or equal to 3 characters in length.
     * 
     */
    @Import(name="generationQualifier")
    private @Nullable Output<String> generationQualifier;

    /**
     * @return Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and III for third. Must be less than or equal to 3 characters in length.
     * 
     */
    public Optional<Output<String>> generationQualifier() {
        return Optional.ofNullable(this.generationQualifier);
    }

    /**
     * First name. Must be less than or equal to 16 characters in length.
     * 
     */
    @Import(name="givenName")
    private @Nullable Output<String> givenName;

    /**
     * @return First name. Must be less than or equal to 16 characters in length.
     * 
     */
    public Optional<Output<String>> givenName() {
        return Optional.ofNullable(this.givenName);
    }

    /**
     * Concatenation that typically contains the first letter of the `given_name`, the first letter of the middle name if one exists, and the first letter of the `surname`. Must be less than or equal to 5 characters in length.
     * 
     */
    @Import(name="initials")
    private @Nullable Output<String> initials;

    /**
     * @return Concatenation that typically contains the first letter of the `given_name`, the first letter of the middle name if one exists, and the first letter of the `surname`. Must be less than or equal to 5 characters in length.
     * 
     */
    public Optional<Output<String>> initials() {
        return Optional.ofNullable(this.initials);
    }

    /**
     * The locality (such as a city or town) in which the certificate subject is located. Must be less than or equal to 128 characters in length.
     * 
     */
    @Import(name="locality")
    private @Nullable Output<String> locality;

    /**
     * @return The locality (such as a city or town) in which the certificate subject is located. Must be less than or equal to 128 characters in length.
     * 
     */
    public Optional<Output<String>> locality() {
        return Optional.ofNullable(this.locality);
    }

    /**
     * Legal name of the organization with which the certificate subject is affiliated. Must be less than or equal to 64 characters in length.
     * 
     */
    @Import(name="organization")
    private @Nullable Output<String> organization;

    /**
     * @return Legal name of the organization with which the certificate subject is affiliated. Must be less than or equal to 64 characters in length.
     * 
     */
    public Optional<Output<String>> organization() {
        return Optional.ofNullable(this.organization);
    }

    /**
     * A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is affiliated. Must be less than or equal to 64 characters in length.
     * 
     */
    @Import(name="organizationalUnit")
    private @Nullable Output<String> organizationalUnit;

    /**
     * @return A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is affiliated. Must be less than or equal to 64 characters in length.
     * 
     */
    public Optional<Output<String>> organizationalUnit() {
        return Optional.ofNullable(this.organizationalUnit);
    }

    /**
     * Typically a shortened version of a longer `given_name`. For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth, Liz, or Eliza. Must be less than or equal to 128 characters in length.
     * 
     */
    @Import(name="pseudonym")
    private @Nullable Output<String> pseudonym;

    /**
     * @return Typically a shortened version of a longer `given_name`. For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth, Liz, or Eliza. Must be less than or equal to 128 characters in length.
     * 
     */
    public Optional<Output<String>> pseudonym() {
        return Optional.ofNullable(this.pseudonym);
    }

    /**
     * State in which the subject of the certificate is located. Must be less than or equal to 128 characters in length.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return State in which the subject of the certificate is located. Must be less than or equal to 128 characters in length.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Family name. In the US and the UK for example, the surname of an individual is ordered last. In Asian cultures the surname is typically ordered first. Must be less than or equal to 40 characters in length.
     * 
     */
    @Import(name="surname")
    private @Nullable Output<String> surname;

    /**
     * @return Family name. In the US and the UK for example, the surname of an individual is ordered last. In Asian cultures the surname is typically ordered first. Must be less than or equal to 40 characters in length.
     * 
     */
    public Optional<Output<String>> surname() {
        return Optional.ofNullable(this.surname);
    }

    /**
     * A title such as Mr. or Ms. which is pre-pended to the name to refer formally to the certificate subject. Must be less than or equal to 64 characters in length.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return A title such as Mr. or Ms. which is pre-pended to the name to refer formally to the certificate subject. Must be less than or equal to 64 characters in length.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    private CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs() {}

    private CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs(CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs $) {
        this.commonName = $.commonName;
        this.country = $.country;
        this.distinguishedNameQualifier = $.distinguishedNameQualifier;
        this.generationQualifier = $.generationQualifier;
        this.givenName = $.givenName;
        this.initials = $.initials;
        this.locality = $.locality;
        this.organization = $.organization;
        this.organizationalUnit = $.organizationalUnit;
        this.pseudonym = $.pseudonym;
        this.state = $.state;
        this.surname = $.surname;
        this.title = $.title;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs $;

        public Builder() {
            $ = new CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs();
        }

        public Builder(CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs defaults) {
            $ = new CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param commonName Fully qualified domain name (FQDN) associated with the certificate subject. Must be less than or equal to 64 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder commonName(@Nullable Output<String> commonName) {
            $.commonName = commonName;
            return this;
        }

        /**
         * @param commonName Fully qualified domain name (FQDN) associated with the certificate subject. Must be less than or equal to 64 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder commonName(String commonName) {
            return commonName(Output.of(commonName));
        }

        /**
         * @param country Two digit code that specifies the country in which the certificate subject located. Must be less than or equal to 2 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder country(@Nullable Output<String> country) {
            $.country = country;
            return this;
        }

        /**
         * @param country Two digit code that specifies the country in which the certificate subject located. Must be less than or equal to 2 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder country(String country) {
            return country(Output.of(country));
        }

        /**
         * @param distinguishedNameQualifier Disambiguating information for the certificate subject. Must be less than or equal to 64 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder distinguishedNameQualifier(@Nullable Output<String> distinguishedNameQualifier) {
            $.distinguishedNameQualifier = distinguishedNameQualifier;
            return this;
        }

        /**
         * @param distinguishedNameQualifier Disambiguating information for the certificate subject. Must be less than or equal to 64 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder distinguishedNameQualifier(String distinguishedNameQualifier) {
            return distinguishedNameQualifier(Output.of(distinguishedNameQualifier));
        }

        /**
         * @param generationQualifier Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and III for third. Must be less than or equal to 3 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder generationQualifier(@Nullable Output<String> generationQualifier) {
            $.generationQualifier = generationQualifier;
            return this;
        }

        /**
         * @param generationQualifier Typically a qualifier appended to the name of an individual. Examples include Jr. for junior, Sr. for senior, and III for third. Must be less than or equal to 3 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder generationQualifier(String generationQualifier) {
            return generationQualifier(Output.of(generationQualifier));
        }

        /**
         * @param givenName First name. Must be less than or equal to 16 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder givenName(@Nullable Output<String> givenName) {
            $.givenName = givenName;
            return this;
        }

        /**
         * @param givenName First name. Must be less than or equal to 16 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder givenName(String givenName) {
            return givenName(Output.of(givenName));
        }

        /**
         * @param initials Concatenation that typically contains the first letter of the `given_name`, the first letter of the middle name if one exists, and the first letter of the `surname`. Must be less than or equal to 5 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder initials(@Nullable Output<String> initials) {
            $.initials = initials;
            return this;
        }

        /**
         * @param initials Concatenation that typically contains the first letter of the `given_name`, the first letter of the middle name if one exists, and the first letter of the `surname`. Must be less than or equal to 5 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder initials(String initials) {
            return initials(Output.of(initials));
        }

        /**
         * @param locality The locality (such as a city or town) in which the certificate subject is located. Must be less than or equal to 128 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder locality(@Nullable Output<String> locality) {
            $.locality = locality;
            return this;
        }

        /**
         * @param locality The locality (such as a city or town) in which the certificate subject is located. Must be less than or equal to 128 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder locality(String locality) {
            return locality(Output.of(locality));
        }

        /**
         * @param organization Legal name of the organization with which the certificate subject is affiliated. Must be less than or equal to 64 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder organization(@Nullable Output<String> organization) {
            $.organization = organization;
            return this;
        }

        /**
         * @param organization Legal name of the organization with which the certificate subject is affiliated. Must be less than or equal to 64 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder organization(String organization) {
            return organization(Output.of(organization));
        }

        /**
         * @param organizationalUnit A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is affiliated. Must be less than or equal to 64 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder organizationalUnit(@Nullable Output<String> organizationalUnit) {
            $.organizationalUnit = organizationalUnit;
            return this;
        }

        /**
         * @param organizationalUnit A subdivision or unit of the organization (such as sales or finance) with which the certificate subject is affiliated. Must be less than or equal to 64 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder organizationalUnit(String organizationalUnit) {
            return organizationalUnit(Output.of(organizationalUnit));
        }

        /**
         * @param pseudonym Typically a shortened version of a longer `given_name`. For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth, Liz, or Eliza. Must be less than or equal to 128 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder pseudonym(@Nullable Output<String> pseudonym) {
            $.pseudonym = pseudonym;
            return this;
        }

        /**
         * @param pseudonym Typically a shortened version of a longer `given_name`. For example, Jonathan is often shortened to John. Elizabeth is often shortened to Beth, Liz, or Eliza. Must be less than or equal to 128 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder pseudonym(String pseudonym) {
            return pseudonym(Output.of(pseudonym));
        }

        /**
         * @param state State in which the subject of the certificate is located. Must be less than or equal to 128 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state State in which the subject of the certificate is located. Must be less than or equal to 128 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param surname Family name. In the US and the UK for example, the surname of an individual is ordered last. In Asian cultures the surname is typically ordered first. Must be less than or equal to 40 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder surname(@Nullable Output<String> surname) {
            $.surname = surname;
            return this;
        }

        /**
         * @param surname Family name. In the US and the UK for example, the surname of an individual is ordered last. In Asian cultures the surname is typically ordered first. Must be less than or equal to 40 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder surname(String surname) {
            return surname(Output.of(surname));
        }

        /**
         * @param title A title such as Mr. or Ms. which is pre-pended to the name to refer formally to the certificate subject. Must be less than or equal to 64 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title A title such as Mr. or Ms. which is pre-pended to the name to refer formally to the certificate subject. Must be less than or equal to 64 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        public CertificateAuthorityCertificateAuthorityConfigurationSubjectArgs build() {
            return $;
        }
    }

}
