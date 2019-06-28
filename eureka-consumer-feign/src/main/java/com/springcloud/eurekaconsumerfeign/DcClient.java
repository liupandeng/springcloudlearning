package com.springcloud.eurekaconsumerfeign;

import com.springcloud.eurekaclientapi.HelloClient;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("eureka-client")
public interface DcClient extends HelloClient {

}
