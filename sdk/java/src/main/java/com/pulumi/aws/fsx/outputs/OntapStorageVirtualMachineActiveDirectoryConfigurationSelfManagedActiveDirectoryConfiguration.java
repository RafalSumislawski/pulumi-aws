// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration {
    /**
     * @return A list of up to three IP addresses of DNS servers or domain controllers in the self-managed AD directory.
     * 
     */
    private final List<String> dnsIps;
    /**
     * @return The fully qualified domain name of the self-managed AD directory. For example, `corp.example.com`.
     * 
     */
    private final String domainName;
    /**
     * @return The name of the domain group whose members are granted administrative privileges for the SVM. The group that you specify must already exist in your domain. Defaults to `Domain Admins`.
     * 
     */
    private final @Nullable String fileSystemAdministratorsGroup;
    /**
     * @return The fully qualified distinguished name of the organizational unit within your self-managed AD directory that the Windows File Server instance will join. For example, `OU=FSx,DC=yourdomain,DC=corp,DC=com`. Only accepts OU as the direct parent of the SVM. If none is provided, the SVM is created in the default location of your self-managed AD directory. To learn more, see [RFC 2253](https://tools.ietf.org/html/rfc2253).
     * 
     */
    private final @Nullable String organizationalUnitDistinguishedName;
    /**
     * @return The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
     * 
     */
    private final String password;
    /**
     * @return The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
     * 
     */
    private final String username;

    @CustomType.Constructor
    private OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration(
        @CustomType.Parameter("dnsIps") List<String> dnsIps,
        @CustomType.Parameter("domainName") String domainName,
        @CustomType.Parameter("fileSystemAdministratorsGroup") @Nullable String fileSystemAdministratorsGroup,
        @CustomType.Parameter("organizationalUnitDistinguishedName") @Nullable String organizationalUnitDistinguishedName,
        @CustomType.Parameter("password") String password,
        @CustomType.Parameter("username") String username) {
        this.dnsIps = dnsIps;
        this.domainName = domainName;
        this.fileSystemAdministratorsGroup = fileSystemAdministratorsGroup;
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
        this.password = password;
        this.username = username;
    }

    /**
     * @return A list of up to three IP addresses of DNS servers or domain controllers in the self-managed AD directory.
     * 
     */
    public List<String> dnsIps() {
        return this.dnsIps;
    }
    /**
     * @return The fully qualified domain name of the self-managed AD directory. For example, `corp.example.com`.
     * 
     */
    public String domainName() {
        return this.domainName;
    }
    /**
     * @return The name of the domain group whose members are granted administrative privileges for the SVM. The group that you specify must already exist in your domain. Defaults to `Domain Admins`.
     * 
     */
    public Optional<String> fileSystemAdministratorsGroup() {
        return Optional.ofNullable(this.fileSystemAdministratorsGroup);
    }
    /**
     * @return The fully qualified distinguished name of the organizational unit within your self-managed AD directory that the Windows File Server instance will join. For example, `OU=FSx,DC=yourdomain,DC=corp,DC=com`. Only accepts OU as the direct parent of the SVM. If none is provided, the SVM is created in the default location of your self-managed AD directory. To learn more, see [RFC 2253](https://tools.ietf.org/html/rfc2253).
     * 
     */
    public Optional<String> organizationalUnitDistinguishedName() {
        return Optional.ofNullable(this.organizationalUnitDistinguishedName);
    }
    /**
     * @return The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
     * 
     */
    public String password() {
        return this.password;
    }
    /**
     * @return The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD domain.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> dnsIps;
        private String domainName;
        private @Nullable String fileSystemAdministratorsGroup;
        private @Nullable String organizationalUnitDistinguishedName;
        private String password;
        private String username;

        public Builder() {
    	      // Empty
        }

        public Builder(OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsIps = defaults.dnsIps;
    	      this.domainName = defaults.domainName;
    	      this.fileSystemAdministratorsGroup = defaults.fileSystemAdministratorsGroup;
    	      this.organizationalUnitDistinguishedName = defaults.organizationalUnitDistinguishedName;
    	      this.password = defaults.password;
    	      this.username = defaults.username;
        }

        public Builder dnsIps(List<String> dnsIps) {
            this.dnsIps = Objects.requireNonNull(dnsIps);
            return this;
        }
        public Builder dnsIps(String... dnsIps) {
            return dnsIps(List.of(dnsIps));
        }
        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder fileSystemAdministratorsGroup(@Nullable String fileSystemAdministratorsGroup) {
            this.fileSystemAdministratorsGroup = fileSystemAdministratorsGroup;
            return this;
        }
        public Builder organizationalUnitDistinguishedName(@Nullable String organizationalUnitDistinguishedName) {
            this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
            return this;
        }
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }        public OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration build() {
            return new OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration(dnsIps, domainName, fileSystemAdministratorsGroup, organizationalUnitDistinguishedName, password, username);
        }
    }
}
