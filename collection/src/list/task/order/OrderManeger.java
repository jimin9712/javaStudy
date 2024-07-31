package list.task.order;

import java.util.ArrayList;
import list.task.DBConnecter;

public class OrderManeger {
    // 주문 추가
    public void addOrder(Order order) {
    	// DBConnecter의 orders 리스트에 주문 추가
        DBConnecter.orders.add(order); 
    }

    // 주문 조회
    public Order findOrderById(String orderId) {
//        	순회
        for (int i = 0; i < DBConnecter.orders.size(); i++) {
            if (DBConnecter.orders.get(i).getOrderId().equals(orderId)) {
            	// 일치하는 주문을 찾으면 반환
                return DBConnecter.orders.get(i); 
            }
        }
        // 일치하는 주문이 없으면 null 반환
        return null; 
    }

    // 주문 수정
    public void updateOrder(Order order) {
        for (int i = 0; i < DBConnecter.orders.size(); i++) {
            if (DBConnecter.orders.get(i).getOrderId().equals(order.getOrderId())) {
            	// 주문 정보 업데이트
                DBConnecter.orders.set(i, new Order(order)); 
                return;
            }
        }
    }

    // 주문 삭제
    public void deleteOrder(String orderId) {
        int size = DBConnecter.orders.size();
        int i = 0;
        while (i < size) {
            if (DBConnecter.orders.get(i).getOrderId().equals(orderId)) {
            	// 주문 삭제
                DBConnecter.orders.remove(i); 
                return;
            }
            i++;
        }
    }

    // 주문 목록
    public ArrayList<Order> listAllOrders() {
        ArrayList<Order> orders = new ArrayList<>();
        for (int i = 0; i < DBConnecter.orders.size(); i++) {
        	// 주문 정보 복사하여 리스트에 추가
            orders.add(new Order(DBConnecter.orders.get(i))); 
        }
        return orders;
    }
}
