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

import com.douyin.open.models.VideoDeleteAwemeDeleteBody;
import com.douyin.open.models.VideoDeleteAwemeDeleteInlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VideoDeleteApi
 */
@Ignore
public class VideoDeleteApiTest {

    private final VideoDeleteApi api = new VideoDeleteApi();

    /**
     * 删除授权用户发布的视频
     *
     * * Scope: &#x60;video.delete&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoDeletePostTest() {
        String openId = null;
        String accessToken = null;
        VideoDeleteAwemeDeleteBody body = null;
        VideoDeleteAwemeDeleteInlineResponse200 response = api.videoDeletePost(openId, accessToken, body);

        // TODO: test validations
    }
}
