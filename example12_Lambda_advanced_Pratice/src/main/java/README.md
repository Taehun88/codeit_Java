###2025-08-18 Lambda Advanced Pratice

| 각 기능을 FunctionalInterface를 기준으로 구현하고
|
| 각각의 동작이 정상 작동되는지 확인

- Supplier 이용
- - Supplier는 공급만 하기 때문에 해당 데이터를 받아서 기존 List 에 삽입

- Predicate 이용
- - Main에서 제공한 Predicate를 이용, Filter에 삽입하여 List 를 Stream으로 출력

- Function 이용
- Main에서 제공한 Function을 사용, map을 이용하여 List에 있는 값을 String으로 변환 출력

- Consumer 이용
- - Main에서 제공한 Consumer가 데이터를 받아 출력하는 형태의 Consumer이므로, 값을 받아서 Stream.forEach를 통해서 데이터를 출력