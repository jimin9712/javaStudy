package list.task.order;

import java.util.ArrayList;
import list.task.DBConnecter;

public class Page {
    public static void main(String[] args) {
        // 주문 정보 추가
        Order 주문1 = new Order("O001", "P001", "U001", 2);
        Order 주문2 = new Order("O002", "P002", "U002", 1);
        Order 주문3 = new Order("O003", "P003", "U003", 3);

        // OrderManager 인스턴스 생성
        OrderManeger orderManager = new OrderManeger();
        ArrayList<Order> orders;

        // 주문 추가
        orderManager.addOrder(주문1);
        orderManager.addOrder(주문2);
        orderManager.addOrder(주문3);

        // DBConnecter의 모든 주문 출력
        System.out.println("DBConnecter의 모든 주문: " + DBConnecter.orders);

        // 모든 주문 정보 조회 및 출력
        orders = orderManager.listAllOrders();
        System.out.println("모든 주문 정보: " + orders);

        // 주문1의 정보 조회
        Order order = orderManager.findOrderById("O001");
        System.out.println("O001의 주문 정보: " + order);

        // 주문1의 수량을 3으로 업데이트
        order.setQuantity(3);
        orderManager.updateOrder(order);
        System.out.println("업데이트 후 O001의 주문 정보: " + orderManager.findOrderById("O001"));

        // 주문2 삭제
        orderManager.deleteOrder("O002");
        System.out.println("O002 삭제 후 모든 주문 정보: " + orderManager.listAllOrders());
    }
}
