package org.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 内部调用
 * @author qimy
 */
@FeignClient(value = "minikube-internal-gateway", url = "http://minikube-internal-gateway:8081")
public interface MinniKubeDemoFeign {

    /**
     * 调用  MinniKubeDemo
     */
    @GetMapping("/v1/extend/extendOnline/internal/extendInfo")
    Map<String,String> getOnlineExtendInfo(@RequestParam("promotionNo") String promotionNo);

}
