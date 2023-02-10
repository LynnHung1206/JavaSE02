package module37_42;

import java.util.List;
import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
		List<Pen> penList = Pen.initPens();
		
//		已經確定好型別P
		Predicate<Pen> allExpensivePens = 
				p -> p.getPrice() >= 1000; 
//				敘述執行完要有布林結果，多敘述需要return
				
				
//				集合透過此方法把物件一個個拿出來
		penList.stream()
			.filter(allExpensivePens)
			.forEach(Pen::printDetails);
//		.forEach(p -> p.printDetails());
		
		
		System.out.println("\n==== comparison");
		
		for (Pen p : penList) {
			if (allExpensivePens.test(p)) {
				p.printDetails();
			}
		}
		
//		for (Pen p : penList) {
//			if (p.getPrice() >= 1000) {
//				p.printDetails();
//			}
//		}
	}

}
