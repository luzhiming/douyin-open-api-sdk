/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.douyin.open.api;

import com.douyin.open.models.Oauth2RefreshTokenInlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RefreshTokenApi
 */
@Ignore
public class RefreshTokenApiTest {

    private final RefreshTokenApi api = new RefreshTokenApi();

    /**
     * 刷新access_token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oauthRefreshTokenGetTest() {
        String clientKey = null;
        String grantType = null;
        String refreshToken = null;
        Oauth2RefreshTokenInlineResponse200 response = api.oauthRefreshTokenGet(clientKey, grantType, refreshToken);

        // TODO: test validations
    }
}
