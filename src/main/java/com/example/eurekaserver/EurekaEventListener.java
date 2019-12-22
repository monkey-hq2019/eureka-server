package com.example.eurekaserver;

import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EurekaEventListener {

    /**
     * 服务下线事件
     * @param event
     */
    @EventListener
    public void listenCancelEvent(EurekaInstanceCanceledEvent event){
        System.out.println(event.getAppName()+"下线啦~");
    }

    /**
     * 服务注册事件
     * @param event
     */
    @EventListener
    public void listenRegisterEvent(EurekaInstanceRegisteredEvent event){
         System.out.println(event.getInstanceInfo().getAppName()+"服务正在注册");
    }

    /**
     * 服务续约事件
     * @param event
     */
    @EventListener
    public void listenRenewedEvent(EurekaInstanceRenewedEvent event){
        System.out.println(event.getAppName()+"服务续约成功");
    }

    /**
     * 服务中心启动事件
     * @param event
     */
    @EventListener
    public void listenRegistryAvailableEvent(EurekaRegistryAvailableEvent event){
        System.out.println("服务中心启动~");
    }
    /**
     * Eureka Server启动事件
     * @param event
     */
    @EventListener
    public void listenServerStartedEvent(EurekaServerStartedEvent event){
        System.out.println("Eureka Server 启动~");
    }
}
