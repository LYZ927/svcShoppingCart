package com.midterm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.midterm.service.CspService;

@Service
public class CspServiceImpl implements CspService {

//	@Autowired
//	private DataSource dataSource;
	private final String CONN_URL = "jdbc:oracle:thin:@//localhost:1521/orcl";
	private final String ACCOUNT = "vivian";
	private final String PASSWORD = "123456";
	private final String QUERY_ALL_PRODUCTS_SQL = "select * from vivian.PRODUCT";
	// 四個主要欄位
	private final String PRODUCT_ID = "PRODUCT_ID";

	/**
	 * 範例程式
	 * 
	 * @param demoMap
	 * @return
	 */
	@Override
	public Map<String, Object> demoCode(Map<String, String> demoMap) {
		/* 1. 將前端傳入值取出：使用前端傳入物件的key值，從Map中取得對應value，例如： */
		String id = demoMap.get("id");
		String keyword = demoMap.get("keyword");
		System.err.println("id--->" + id);
		System.err.println("keyword--->" + keyword);

		/*
		 * 2. 業務邏輯：檢核、題目要求邏輯實作，如需使用DB連線，請參考下列程式碼 try (Connection conn =
		 * dataSource.getConnection(); PreparedStatement pstmt =
		 * conn.prepareStatement(DEMOCODE_QUERY_SQL_STRING);) {
		 * 
		 * 
		 * } catch (SQLException e) { e.printStackTrace(); }
		 */

		/* 3. 把要回傳給前端的值包裝成Map後return，例如： */
		Map<String, Object> rtnMap = new HashMap<>();
		rtnMap.put("success", true);
		rtnMap.put("returnMessage", "驗證成功");
		rtnMap.put("metro_fee", 100);
		rtnMap.put("pokerA", new ArrayList<>());
		return rtnMap;
	}

	/**
	 * (畫面一): 查詢產品
	 * 
	 * @param map
	 * @return
	 */
//	@Override
//	public Map<String, Object> queryProducts(Map<String, String> reqMap) {
//		/* 1. 將前端傳入值取出：使用前端傳入物件的key值，從Map中取得對應value，例如： */
//		String name = reqMap.get("name");
//		System.err.println("NAME--->" + name);
//		List<Map<String, String>> list = new ArrayList<>();
//
//		/* 2. 業務邏輯：檢核、題目要求邏輯實作，如需使用DB連線 */
//		try (Connection conn = DriverManager.getConnection(CONN_URL, ACCOUNT, PASSWORD);
//				PreparedStatement pstmt = conn.prepareStatement(QUERY_ALL_PRODUCTS_SQL)) {
//
//			// 查出來的結果
//			ResultSet rs = pstmt.executeQuery();
//
//			while (rs.next()) {
//				Map<String, String> productMap = new HashMap<>();
//				productMap.put("productId", rs.getString(PRODUCT_ID));
//				productMap.put("name", rs.getString("NAME"));
//				productMap.put("price", rs.getString("PRICE"));
//				productMap.put("stock", rs.getString("STOCK"));
//				productMap.put("status", rs.getString("STATUS"));
//				productMap.put("description", rs.getString("DESCRIPTION"));
//				productMap.put("createTime", rs.getString("CREATE_TIME"));
//				productMap.put("updateTime", rs.getString("UPDATE_TIME"));
//				list.add(productMap);
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//
//		/* 3. 把要回傳給前端的值包裝成Map後return，例如： */
//		Map<String, Object> rtnMap = new HashMap<>();
//
//		if (list.isEmpty()) {
//			rtnMap.put("returnCode", "E001");
//			rtnMap.put("returnMsg", "查無資料");
//			return rtnMap;
//		}
//
//		rtnMap.put("returnCode", "0000");
//		rtnMap.put("returnMsg", "查詢成功");
//		rtnMap.put("list", list);
//		return rtnMap;
//
//	}

	@Override
	public Map<String, Object> queryProducts(Map<String, String> reqMap) {
		// 可讀取 name，但本 DEMO 固定回傳，不做過濾
		String name = (reqMap == null) ? null : reqMap.get("name");
		List<Map<String, String>> list = new ArrayList<>();

		list.add(Map.of("status", "Active", "price", "700", "description", "降噪、長續航，適合通勤使用", "createTime",
				"2025-09-13 14:15:44.275", "updateTime", "2025-09-13 14:15:44.275", "productId", "1", "stock", "10",
				"name", "藍牙耳機"));
		list.add(Map.of("status", "Active", "price", "200", "description", "含 HDMI、USB3.0、SD卡插槽", "createTime",
				"2025-09-13 14:15:44.275", "updateTime", "2025-09-13 14:15:44.275", "productId", "2", "stock", "5",
				"name", "多功能集線器"));
		list.add(Map.of("status", "Active", "price", "350", "description", "青軸，RGB 背光，可編程巨集", "createTime",
				"2025-09-13 14:15:44.275", "updateTime", "2025-09-13 14:15:44.275", "productId", "3", "stock", "5",
				"name", "藍芽鍵盤"));
		list.add(Map.of("status", "Active", "price", "500", "description", "符合手型，長時間使用不疲勞", "createTime",
				"2025-09-13 14:15:44.275", "updateTime", "2025-09-13 14:15:44.275", "productId", "4", "stock", "3",
				"name", "人體工學滑鼠"));
		list.add(Map.of("status", "Active", "price", "799", "description", "支援 PD 快充，雙 USB 輸出", "createTime",
				"2025-09-13 14:15:44.275", "updateTime", "2025-09-13 14:15:44.275", "productId", "5", "stock", "5",
				"name", "行動電源"));
		list.add(Map.of("status", "Active", "price", "600", "description", "IPS 面板，HDR 支援，護眼模式", "createTime",
				"2025-09-13 14:15:44.275", "updateTime", "2025-09-13 14:15:44.275", "productId", "6", "stock", "3",
				"name", "電腦螢幕"));
		list.add(Map.of("status", "Active", "price", "150", "description", "鋁合金材質，可調整高度", "createTime",
				"2025-09-13 14:15:44.275", "updateTime", "2025-09-13 14:15:44.275", "productId", "7", "stock", "10",
				"name", "筆電支架"));
		list.add(Map.of("status", "Active", "price", "900", "description", "防水設計，低音強化，攜帶方便", "createTime",
				"2025-09-13 14:15:44.275", "updateTime", "2025-09-13 14:15:44.275", "productId", "8", "stock", "7",
				"name", "藍牙喇叭"));
		list.add(Map.of("status", "Active", "price", "1200", "description", "USB 3.1，輕薄設計", "createTime",
				"2025-09-13 14:15:44.275", "updateTime", "2025-09-13 14:15:44.275", "productId", "9", "stock", "6",
				"name", "外接硬碟"));
		list.add(Map.of("status", "Active", "price", "2000", "description", "心率偵測，睡眠監測，防水設計", "createTime",
				"2025-09-13 14:15:44.275", "updateTime", "2025-09-13 14:15:44.275", "productId", "10", "stock", "3",
				"name", "智慧手錶"));

		Map<String, Object> rtnMap = new HashMap<>();
		// 正		
		rtnMap.put("returnCode", "0000");
		rtnMap.put("returnMsg", "查詢成功");
		rtnMap.put("list", list);
		
		// 反
//		rtnMap.put("returnCode", "E001");
//		rtnMap.put("returnMsg", "查無資料");
		return rtnMap;
	}

	/**
	 * (畫面二): 建立訂單
	 * 
	 * @param map
	 * @return
	 */

	@Override
	public Map<String, Object> createOrder(Map<String, Object> req) {
		// 1) 先把前端給的品項抓出來，算一下總金額（用內建價格表）
		int total = 0;
		try {
			Object itemsObj = req == null ? null : req.get("list");
			if (itemsObj instanceof List<?> list) {
				for (Object it : list) {
					if (it instanceof Map<?, ?> m) {
						int pid = toInt(m.get("productId"));
						int qty = Math.max(0, toInt(m.get("quantity")));
						int price = priceByProductId(pid);
						total += price * qty;
					}
				}
			}
		} catch (Exception ignore) {
			// 算不出來就當 0；或你也可以固定成 3897 等金額
		}
		// 若想固定金額，改這行即可：
		// total = 3897;

		// 2) 組下行（固定 orderId=0001）
		Map<String, Object> data = new HashMap<>();
		data.put("orderId", "0001");
		data.put("totalAmount", total);
		data.put("createTime", "2025/09/01/12:00");

		Map<String, Object> rtn = new HashMap<>();
		rtn.put("returnCode", "0000");
		rtn.put("returnMsg", "成功建立訂單");
		rtn.put("data", data);
		
		// 反
//		rtn.put("returnCode", "E002");
//		rtn.put("returnMsg", "商品庫存不足");
		return rtn;
	}

	/** 小工具：把任意物件轉 int（支援 Number / String） */
	private int toInt(Object o) {
		if (o == null)
			return 0;
		if (o instanceof Number n)
			return n.intValue();
		try {
			return Integer.parseInt(String.valueOf(o));
		} catch (Exception e) {
			return 0;
		}
	}

	/** 對應你 queryProducts 的價格表（DEMO 用） */
	private int priceByProductId(int pid) {
		return switch (pid) {
		case 1 -> 700;
		case 2 -> 200;
		case 3 -> 350;
		case 4 -> 500;
		case 5 -> 799;
		case 6 -> 600;
		case 7 -> 150;
		case 8 -> 900;
		case 9 -> 1200;
		case 10 -> 2000;
		default -> 0;
		};
	}

	/**
	 * (畫面三): 查詢訂單（DEMO：固定回傳假資料） Request: { "orderId": "0001" } Response: {
	 * returnCode, returnMsg, data{ orderId,status,info,list,totalAmount,createTime
	 * } }
	 */
	@Override
	public Map<String, Object> queryOrder(Map<String, String> req) {
		// 1) 取 orderId（未提供就用 0001）
		String orderId = "";
		if (req != null && req.get("orderId") != null) {
			orderId = String.valueOf(req.get("orderId"));
		}

		// 2) 假的收件人資訊
		Map<String, Object> info = Map.of("buyerName", "林小花", "email", "cathayCsp@example.com", "phone", "0975123456",
				"address", "台北內湖區瑞光路520號");

		// 3) 假的明細（兩筆）
		Map<String, Object> item1 = Map.of("productId", 1001, "productName", "USB-C Hub", "unitPrice", 1299, "quantity",
				2, "lineAmount", 2598);
		Map<String, Object> item2 = Map.of("productId", 1005, "productName", "HDMI Cable", "unitPrice", 299, "quantity",
				1, "lineAmount", 299);
		List<Map<String, Object>> list = List.of(item1, item2);

		int totalAmount = 123;

		// 4) data 區
		Map<String, Object> data = new HashMap<>();
		data.put("orderId", orderId);
		data.put("status", "completed");
		data.put("info", info);
		data.put("list", list);
		data.put("totalAmount", totalAmount);
		data.put("createTime", "2025/09/01/12:00");
		data.put("review", "niceee");

		// 5) 外層回傳
		Map<String, Object> rtn = new HashMap<>();
		if(orderId.isBlank()) {
			rtn.put("returnCode", "E001");
			rtn.put("returnMsg", "查無資料");
		}else {
			rtn.put("returnCode", "0000");
			rtn.put("returnMsg", "查詢成功");
			rtn.put("data", data);
		}
		
		
//		反1

		return rtn;
	}

	/**
	 * (畫面三): 完成訂單（DEMO：固定回傳） Request: { "orderId": "0001" } Response: {
	 * "returnCode":"0000", "returnMsg":"完成訂單" }
	 */
	@Override
	public Map<String, Object> completeOrder(Map<String, String> req) {
		String orderId = (req != null && req.get("orderId") != null) ? String.valueOf(req.get("orderId")) : "0001";
		System.err.println("completeOrder orderId = " + orderId);

		Map<String, Object> rtn = new HashMap<>();
//		rtn.put("returnCode", "0000");
//		rtn.put("returnMsg", "完成訂單");
		
		rtn.put("returnCode", "E003");
		rtn.put("returnMsg", "請確認訂單狀態");
		return rtn;
	}

	/**
	 * (畫面三): 修改訂單（DEMO：固定回傳；僅回訊息） Request: { "orderId":"0001",
	 * "items":[{"productId":1001,"quantity":1}, ...] } Response: {
	 * "returnCode":"0000", "returnMsg":"已修改訂單" }
	 */
	@Override
	public Map<String, Object> editOrder(Map<String, Object> req) {
		String orderId = (req != null && req.get("orderId") != null) ? String.valueOf(req.get("orderId")) : "0001";
		System.err.println("editOrder orderId = " + orderId + " , payload = " + req);

		Map<String, Object> rtn = new HashMap<>();
		rtn.put("returnCode", "0000");
		rtn.put("returnMsg", "已修改訂單");
		
//		反1
//		rtnMap.put("returnCode", "E002");
//		rtnMap.put("returnMsg", "商品庫存不足");
		
//		反2
//		rtnMap.put("returnCode", "E003");
//		rtnMap.put("returnMsg", "請確認訂單狀態");
		
		return rtn;
	}

	/**
	 * (畫面三): 刪除訂單（DEMO：固定回傳） Request: { "orderId":"0001" } Response: {
	 * "returnCode":"0000", "returnMsg":"成功刪除訂單" }
	 */
	@Override
	public Map<String, Object> deleteOrder(Map<String, String> req) {
		String orderId = (req != null && req.get("orderId") != null) ? String.valueOf(req.get("orderId")) : "0001";
		System.err.println("deleteOrder orderId = " + orderId);

		Map<String, Object> rtn = new HashMap<>();
//		rtn.put("returnCode", "0000");
//		rtn.put("returnMsg", "成功刪除訂單");
		
		rtn.put("returnCode", "E003");
		rtn.put("returnMsg", "請確認訂單狀態");
		
		return rtn;
	}

	/**
	 * (畫面三): 新增評論（DEMO：固定回傳） Request: { "orderId":"0001", "productId":1001?,
	 * "content":"..." } Response: { "returnCode":"0000", "returnMsg":"成功評論" }
	 */
	@Override
	public Map<String, Object> createReview(Map<String, String> req) {
		String orderId = (req != null && req.get("orderId") != null) ? String.valueOf(req.get("orderId")) : "0001";
		System.err.println("createReview orderId = " + orderId + " , payload = " + req);

		Map<String, Object> rtn = new HashMap<>();
//		rtn.put("returnCode", "0000");
//		rtn.put("returnMsg", "成功評論");
		
		rtn.put("returnCode", "E003");
		rtn.put("returnMsg", "請確認訂單狀態");
		
		return rtn;
	}

}
