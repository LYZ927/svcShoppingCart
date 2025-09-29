package com.midterm.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.midterm.service.CspService;

@RestController
@RequestMapping("/csp/api")
@CrossOrigin({ "*" })
public class CspController {

	@Autowired
	CspService cspService;

	/**
	 * 範例程式
	 * 
	 * @param map
	 * @return
	 */
	@ResponseBody
	@PostMapping(value = "/demoCode")
	public ResponseEntity<Map<String, Object>> demoCode(@RequestBody Map<String, String> map) {
		return new ResponseEntity<>(cspService.demoCode(map), HttpStatus.OK);
	}

	/**
	 * 查詢商品
	 * 
	 * @param map
	 * @return
	 */
	@ResponseBody
	@PostMapping(value = "/queryProducts")
	public ResponseEntity<Map<String, Object>> queryProducts(@RequestBody Map<String, String> map) {
		return new ResponseEntity<>(cspService.queryProducts(map), HttpStatus.OK);
	}

	/**
	 * 建立訂單
	 * 
	 * @param map
	 * @return
	 */
	@ResponseBody
	@PostMapping(value = "/createOrder")
	public ResponseEntity<Map<String, Object>> createOrder(@RequestBody Map<String, Object> map) {
		return new ResponseEntity<>(cspService.createOrder(map), HttpStatus.OK);
	}

	/**
	 * 查詢訂單
	 * 
	 * @param map
	 * @return
	 */
	@ResponseBody
	@PostMapping(value = "/queryOrder")
	public ResponseEntity<Map<String, Object>> queryOrder(@RequestBody Map<String, String> map) {
		return new ResponseEntity<>(cspService.queryOrder(map), HttpStatus.OK);
	}

	/**
	 * 完成訂單
	 * 
	 * @param map
	 * @return
	 */
	@ResponseBody
	@PostMapping(value = "/completeOrder")
	public ResponseEntity<Map<String, Object>> completeOrder(@RequestBody Map<String, String> map) {
		return new ResponseEntity<>(cspService.completeOrder(map), HttpStatus.OK);
	}

	/**
	 * 修改訂單
	 * 
	 * @param map
	 * @return
	 */
	@ResponseBody
	@PostMapping(value = "/editOrder")
	public ResponseEntity<Map<String, Object>> editOrder(@RequestBody Map<String, Object> map) {
		return new ResponseEntity<>(cspService.editOrder(map), HttpStatus.OK);
	}

	/**
	 * 刪除訂單
	 * 
	 * @param map
	 * @return
	 */
	@ResponseBody
	@PostMapping(value = "/deleteOrder")
	public ResponseEntity<Map<String, Object>> deleteOrder(@RequestBody Map<String, String> map) {
		return new ResponseEntity<>(cspService.deleteOrder(map), HttpStatus.OK);
	}

	/**
	 * 新增評論
	 * 
	 * @param map
	 * @return
	 */
	@ResponseBody
	@PostMapping(value = "/createReview")
	public ResponseEntity<Map<String, Object>> createReview(@RequestBody Map<String, String> map) {
		return new ResponseEntity<>(cspService.createReview(map), HttpStatus.OK);
	}

}