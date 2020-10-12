package org.iadb.iic.apps.factcuid.config;


import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.security.keyvault.secrets.SecretClient;
import com.azure.security.keyvault.secrets.SecretClientBuilder;

public class EncryptedDriverManagerDataSource extends DriverManagerDataSource {
	private SecretClient secretClient;

    void setSecretClient() {
        String keyVaultName = System.getenv("KEY_VAULT_NAME");
        String kvUri = "https://" + keyVaultName + ".vault.azure.net";
        this.secretClient = new SecretClientBuilder()
                .vaultUrl(kvUri)
                .credential(new DefaultAzureCredentialBuilder().build())
                .buildClient();
    }



    @Override
    public String getPassword() {
        setSecretClient();
        String password_identifier = super.getPassword();
        return secretClient.getSecret(password_identifier).getValue();
    }

    @Override
    public String getUsername() {
        setSecretClient();
        String username_identifier = super.getUsername();
        return secretClient.getSecret(username_identifier).getValue();
    }

    @Override
    public String getUrl() {
        setSecretClient();
        String url_identifier = super.getUrl();
        return secretClient.getSecret(url_identifier).getValue();
    }

}
