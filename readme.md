###	Random
```java
Random random = new Random();
int correctNumber = random.nextInt(100) + 1; 
// 0-99 + 1 = 1-100
```

###	Reverse
```java
StringBuffer sb = new StringBuffer(str);
		String reverseStr = sb.reverse().toString();
```

### 객체 
```
Goods[] goods = new Goods[COUNT_GOODS];	
		
		// 상품 입력
		for(int i=0; i<COUNT_GOODS; i++) {
			Goods gd = new Goods();
			
			String str = scanner.nextLine();
			String arr[] = str.split(" ");
			name = arr[0];
			num = Integer.parseInt(arr[1]);
			price = Integer.parseInt(arr[2]);
			
			
			goods[i].setName(name);
			goods[i].setNum(num);
			goods[i].setPrice(price);
		}
```
-	이대로 하면 goods[i] 에서 nullpointexception 발생.
-	객체 배열은 생성만하고 아무것도없는 비어있는 상태임. (비어있는 곳을 참조하려해서 null 발생)
-	객체배열박스의 타입객체를 생성한 후, 한개씩 넣어줘야한다.
