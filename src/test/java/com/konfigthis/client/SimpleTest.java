package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://sandbox.ob.hsbcnet.com/mock/ce/obie/open-banking/v3.1/aisp";
        
        // Configure HTTP bearer authorization: BearerAuth
        configuration.token = "BEARER TOKEN";
        
        // Configure OAuth2 access token for authorization: PSUOAuth2Security
        configuration.accessToken = "YOUR ACCESS TOKEN";
        
        HsbcAccountInformationCe client = new HsbcAccountInformationCe(configuration);
        assertNotNull(client);
    }
}
