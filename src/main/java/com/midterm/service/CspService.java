package com.midterm.service;

import java.util.Map;

public interface CspService {

    /**
     * 範例程式
     * @param map
     * @return
     */
    Map<String, Object> demoCode(Map<String, String> map);
    
    /**
     * (畫面一): 查詢產品
     * @param map
     * @return
     */
    Map<String, Object> queryProducts(Map<String, String> map);
    
    /**
     * (畫面二): 建立訂單
     * @param map
     * @return
     */
    Map<String, Object> createOrder(Map<String, Object> map);
    
    /**
     * (畫面三): 查詢訂單
     * @param map
     * @return
     */
    Map<String, Object> queryOrder(Map<String, String> map);
    
    /**
     * (畫面三): 完成訂單
     * @param map
     * @return
     */
    Map<String, Object> completeOrder(Map<String, String> map);
    
    /**
     * (畫面三): 修改訂單
     * @param map
     * @return
     */
    Map<String, Object> editOrder(Map<String, Object> map);
    
    /**
     * (畫面三): 刪除訂單
     * @param map
     * @return
     */
    Map<String, Object> deleteOrder(Map<String, String> map);
    
    /**
     * (畫面三): 新增評論
     * @param map
     * @return
     */
    Map<String, Object> createReview(Map<String, String> map);

}
