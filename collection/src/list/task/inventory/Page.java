package list.task.inventory;

import java.util.ArrayList;
import list.task.DBConnecter;

public class Page {
    public static void main(String[] args) {
        // 재고 정보 추가
        Inventory 재고1 = new Inventory("P001", 50);
        Inventory 재고2 = new Inventory("P002", 30);
        Inventory 재고3 = new Inventory("P003", 20);

        // InventoryManager 인스턴스 생성
        InventoryManager inventoryManager = new InventoryManager();
        ArrayList<Inventory> inventories;

        // 재고 추가
        inventoryManager.addInventory(재고1);
        inventoryManager.addInventory(재고2);
        inventoryManager.addInventory(재고3);

        // DBConnecter의 모든 재고 출력
        System.out.println("DBConnecter의 모든 재고: " + DBConnecter.inventories);

        // 모든 재고 정보 조회 및 출력
        inventories = inventoryManager.listAllInventories();
        System.out.println("모든 재고 정보: " + inventories);

        // 재고1의 정보 조회
        Inventory inventory = inventoryManager.findInventoryById("P001");
        System.out.println("P001의 재고 정보: " + inventory);

        // 재고1의 수량을 60으로 업데이트
        inventory.setStock(60);
        inventoryManager.updateInventory(inventory);
        System.out.println("업데이트 후 P001의 재고 정보: " + inventoryManager.findInventoryById("P001"));

        // 재고2 삭제
        inventoryManager.deleteInventory("P002");
        System.out.println("P002 삭제 후 모든 재고 정보: " + inventoryManager.listAllInventories());
    }
}
