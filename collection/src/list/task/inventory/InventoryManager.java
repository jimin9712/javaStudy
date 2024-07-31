package list.task.inventory;

import java.util.ArrayList;
import list.task.DBConnecter;

public class InventoryManager {
    // 재고 추가
    public void addInventory(Inventory inventory) {
    	// DBConnecter의 inventories 리스트에 재고 추가
        DBConnecter.inventories.add(inventory); 
    }

    // 재고 조회
    public Inventory findInventoryById(String productId) {
        for (int i = 0; i < DBConnecter.inventories.size(); i++) {
            if (DBConnecter.inventories.get(i).getProductId().equals(productId)) {
                return DBConnecter.inventories.get(i); // 일치하는 재고를 찾으면 반환
            }
        }
        return null; // 일치하는 재고가 없으면 null 반환
    }

    // 재고 수정
    public void updateInventory(Inventory inventory) {
        for (int i = 0; i < DBConnecter.inventories.size(); i++) {
            if (DBConnecter.inventories.get(i).getProductId().equals(inventory.getProductId())) {
            	// 재고 정보 업데이트
                DBConnecter.inventories.set(i, new Inventory(inventory)); 
                return;
            }
        }
    }

    // 재고 삭제
    public void deleteInventory(String productId) {
        int size = DBConnecter.inventories.size();
        int i = 0;
        while (i < size) {
            if (DBConnecter.inventories.get(i).getProductId().equals(productId)) {
            	// 재고 삭제
                DBConnecter.inventories.remove(i); 
                return;
            }
            i++;
        }
    }

    // 재고 목록
    public ArrayList<Inventory> listAllInventories() {
        ArrayList<Inventory> inventories = new ArrayList<>();
        for (int i = 0; i < DBConnecter.inventories.size(); i++) {
            inventories.add(new Inventory(DBConnecter.inventories.get(i))); // 재고 정보 복사하여 리스트에 추가
        }
        return inventories;
    }
}
