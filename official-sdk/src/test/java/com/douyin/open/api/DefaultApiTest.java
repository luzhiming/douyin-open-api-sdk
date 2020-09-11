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

import com.douyin.open.models.ToutiaoOauth2Oauth2InlineResponse200;
import com.douyin.open.models.ToutiaoOauth2Oauth2InlineResponse2001;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * 获取access_token
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void oauthAccessTokenGetTest() {
        String clientKey = null;
        String clientSecret = null;
        String code = null;
        String grantType = null;
        ToutiaoOauth2Oauth2InlineResponse200 response = api.oauthAccessTokenGet(clientKey, clientSecret, code, grantType);

        // TODO: test validations
    }
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
        ToutiaoOauth2Oauth2InlineResponse2001 response = api.oauthRefreshTokenGet(clientKey, grantType, refreshToken);

        // TODO: test validations
    }
}