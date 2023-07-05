package com.example.bi_backend.manager;

import com.example.bi_backend.common.ErrorCode;
import com.example.bi_backend.exception.BusinessException;
import com.yupi.yucongming.dev.client.YuCongMingClient;
import com.yupi.yucongming.dev.common.BaseResponse;
import com.yupi.yucongming.dev.model.DevChatRequest;
import com.yupi.yucongming.dev.model.DevChatResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 用于对接 AI 平台
 * 1-引入依赖[sdk]，2-通过配置注入对象[access-key,secret-key]，3-构造请求参数，4-获取相应结果
 */
@Service
public class AiManager {
    @Resource
    private YuCongMingClient yuCongMingClient;

    /**
     * AI 对话
     * @param modelId
     * @param message
     * @return
     */
    public String doChat(long modelId, String message) {
        //3.构造请求参数
        DevChatRequest devChatRequest = new DevChatRequest();
        devChatRequest.setModelId(modelId);
        devChatRequest.setMessage(message);
        //4.获取相应结果
        BaseResponse<DevChatResponse> response = yuCongMingClient.doChat(devChatRequest);
        if (response == null) {
            throw new BusinessException(ErrorCode.SYSTEM_ERROR, "AI 响应错误");
        }
        return response.getData().getContent();
    }
}
