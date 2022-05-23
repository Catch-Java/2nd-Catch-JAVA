# 1. Iterator

&nbsp; Collection Framework에서는 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화하였다. Iterator 인터페이스는 Collection에 저장된 각 요소에 접근하는 기능을 가진 인터페이스이고, Collection 인터페이스에는 Iterator 인스턴스를 반환하는 iterator( ) 메서드가 정의돼 있다.

```java
public interface Iterator {
    boolean hasNext();
    Object next();
    void remove();
}
public interface Collection {
     ...
     public Iterator iterator();
     ...
}
```

&nbsp; iterator( ) 메서드는 Collection 인터페이스에 정의된 메서드이므로, List와 Set도 포함한다. Collection 클래스에 대해 iterator( )를 호출하여 Iterator를 얻은 다음 반복문, 주로 while문을 사용해서 Collection 클래스의 요소들을 읽어온다.

|Method|Explanation|
|------|-----------|
|boolean hasNext()|읽어올 요소가 남아있는지 확인|
|Object next()|다음 요소를 읽음|
|void remove()|next()로 읽어 온 요소 삭제 (선택적 기능)|

&nbsp; 그럼 아래 코드를 보면서 어떻게 사용하는지 알아보자.

```java
// List
ArrayList list = new ArrayList();
Iterator iter = list.iterator();
while(iter.hasNext()){
 	System.out.println(iter.next());
}


// Set
HashMap map = new HashMap();
Iterator iter = map.keySet().iterator(); // 또는 entrySet().iterator()


while(iter.hasNext()){
 	String key = iter.next();
 	String value = map.get(key);
 	System.out.println(key + " : " + value);
}
```
&nbsp; 아직 set이나 map에 대해 배우진 않았지만, set이나 map은 index가 없기 때문에 iterator를 이용해 각 요소에 접근할 수 있다.

# 2. ListIterator
&nbsp; ListIterator는 Iterator를 상속받아 기능을 추가한 것이다. 컬렉션의 요소에 접근할 때 Iterator는 단 방향으로만 이동할 수 있지만, ListIterator는 양방향으로의 이동이 가능하다. 다만, 이름과 같이 List 인터페이스를 구현한 컬렉션에서만 사용 가능하다.

|Method|Explanation|
|------|-----------|
|void add(Object o)|컬렉션에 새로운 객체 추가 (선택적 기능)|
|boolean hasNext()|읽어 올 다음 요소가 남아있는지 확인|
|boolean hasPrevious()|읽어 올 이전 요소가 남아있는지 확인|
|Object next()|다음 요소를 읽어 옴|
|Object previous()|이전 요소를 읽어 옴|
|int nextIndex()|다음 요소의 index 반환|
|int previousIndex()|이전 요소의 index 반환|
|void remove()|next() 또는 previous()로 읽어 온 요소 삭제 (선택적 기능)|
|void set(Object o)|next() 또는 previous()로 읽어 온 요소를 지정된 객체로 변경|

&nbsp; 그럼 코드와 함께 이해해보자.
```java
import java.util.*;
class ListIteratorEx {
 	    public static void main(String[] args) {
 	        ArrayList arrList = new ArrayList();
 
 		for(int i=1 ; i<=5 ; i++)
 	        	arrList.add(i);
 
 	        ListIterator listIter = arrList.listIterator();
 
 	        // 순방향 출력 → 12345
 	        while(listIter.hasNext())
 	        	System.out.print(listIter.next());
 	        System.out.println();
 
 	        // 역방향 출력 → 54321
 	        while(listIter.hasPrevious())
 	        	System.out.print(listIter.previous());
 	    }
}
```
(c)를 현재 위치라고 생각하고 설명해보겠다. (1. 순방향, 2. 역방향)

**1-1. (c) 1  2  3  4  5**  
→ (c)의 next는 1이고, previous는 없다.  
→ next( ) / Output: 1  

**1-2. 1 (c) 2  3  4  5**  
→ (c)의 next는 2이고, previous는 1이다.  
→ next( ) / Output: 1 2  

**1-3. 1  2 (c) 3  4  5**  
→ (c)의 next는 3이고, previous는 2이다.  
→ next( ) / Output: 1 2 3  

**1-4. 1  2  3 (c) 4  5**  
→ (c)의 next는 4이고, previous는 3이다.  
→ next( ) / Output: 1 2 3 4  

**1-5. 1  2  3  4 (c) 5**  
→ (c)의 next는 5이고, previous는 4이다.  
→ next( ) / Output: 1 2 3 4 5

**1-6. 1  2  3  4  5 (c)**  
→ (c)의 next는 없고, previous는 5이다.  
→ next( ) 진행 불가 / while문 탈출  

**2-1. 1  2  3  4  5 (c)**  
→ (c)의 next는 없고, previous는 5다.  
→ previous( ) / Output: 5  

**2-2. 1  2  3  4 (c) 5**  
→ (c)의 next는 5이고, previous는 4이다.  
→ previous( ) / Output: 5 4  

**2-3. 1  2  3 (c) 4  5**  
→ (c)의 next는 4이고, previous는 3이다.  
→ previous( ) / Output: 5 4 3  

**2-4. 1  2 (c) 3  4  5**  
→ (c)의 next는 4이고, previous는 3이다.  
→ previous( ) / Output: 5 4 3 2  

**2-5. 1 (c) 2  3  4  5**  
→ (c)의 next는 2이고, previous는 1이다.  
→ previous( ) / Output: 5 4 3 2 1  

**2-6. (c) 1  2  3  4  5**  
→ (c)의 next는 1이고, previous는 없다.  
→ previous( ) 진행 불가 /  while문 탈출

# 3. Enumeration
&nbsp; Iterator와 같은 기능을 하는 Iterator의 구버전이라고 생각하면 된다.


