# douyin-open-api-sdk
抖音Open Api 急速对接SDK， 简单，易用，高效！

## SDK 优点
- API覆盖率超过95%, 只需要简单的修改一下配置文件, 就能轻松调用api.
- 自动集成官方SDK, 切换使用原生一样方便! 多种选择, 轻松适配!
- 根据视频大小, 自动切换视频分片上传, 轻松避免异常, 保证接口安全.
- 接口分类清晰, 操作简单明了



## API手册
```java
/**
* 账号授权
*/
public class AccountDemo {

    public static void main(String[] args) {
        AccountAuth auth = new AccountAuth();
        // 获取抖音授权码(code)
        auth.getDouyinCode();
        // 生成 client_token
        ToutiaoOauth2Oauth2InlineResponse2002 clientToken = auth.createClientToken();
        // 获取access token
        ToutiaoOauth2Oauth2InlineResponse200 code = auth.getAccessToken("your code");
        // 刷新 access token
        Oauth2RefreshTokenInlineResponse200 accessToken = auth.refreshAccessToken("refreshToken");
        // 刷新 refreshToken
        Oauth2NewRefreshTokenInlineResponse200 refreshToken = auth.refreshRefreshToken("refreshToken");
    }
}

```