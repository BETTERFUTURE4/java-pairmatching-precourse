# 🚀 미션 - 페어매칭관리 애플리케이션

우테코의 미션은 페어 프로그래밍으로 진행된다.
미션을 함께할 페어를 관리해주는 애플리케이션을 완성하시오.

# 📈 기능 목록

## 구현 기능 목록

### ✅ 파일 입출력

- [X]  페어 매칭에 필요한 크루들의 이름을 파일 입출력을 통해 불러온다.

### ✅ 인풋 구현

- [X]  기능의 종류를 출력하고 그 중 하나의 입력을 받는다.

```
기능을 선택하세요.
1. 페어 매칭
2. 페어 조회
3. 페어 초기화 
Q. 종료

```

- [X]  과정와 미션을 출력, 매칭하고자 하는 과정, 레벨, 미션을 입력 받는다.

```
#############################################
과정: 백엔드 | 프론트엔드
미션:
  - 레벨1: 자동차경주 | 로또 | 숫자야구게임
  - 레벨2: 장바구니 | 결제 | 지하철노선도
  - 레벨3: 
  - 레벨4: 성능개선 | 배포
  - 레벨5: 
############################################
과정, 레벨, 미션을 선택하세요.
ex) 백엔드, 레벨1, 

```

- [X]  재매칭 여부를 입력받기

```
매칭 정보가 있습니다. 다시 매칭하시겠습니까?
네 | 아니오

```

### ✅ 아웃풋 구현

- [X]  매칭이 정상적으로 수행되면 결과가 출력

```
페어 매칭 결과입니다.
용팔 : 대만
대협 : 덕규
치수 : 준호
태웅 : 백호
달재 : 태산
한나 : 수겸
태섭 : 대남
준섭 : 소연
현준 : 호열
구식 : 경태

```

- [X]  초기화 출력

```
초기화 되었습니다.

```

### ✅ 페어 매칭 기능

- [X]  페어 매칭 대상이 빡수: 미션을 함께 수행할 페어를 두명씩 매칭
- [X]  페어 매칭 대상이 홀수인 경우 한 페어는 3인으로 구성

  - [X]  같은 레벨에서 이미 페어를 맺은 크루와는 다시 페어로 매칭될 수 없다.
- [X]  크루들의 이름 목록을 List<String> 형태 생성
- [X]  크루 목록의 순서를 랜덤으로 섞는다. shuffle 메서드를 활용
- [X]  페어 목록에서

  - [X]  앞에서부터 순서대로 두명씩 페어 매칭
    - [X]  크루 수 홀수 : 마지막 크루는 마지막 페어에 포함
  - [X]  같은 레벨 이미 페어크루 다시 매칭 시
    - [X]  크루 목록의 순서를 다시 랜덤으로 섞어서
    - [X]  재매칭
- [X]  [예외] 3회 시도까지 매칭이 되지 않거나
- [ ]  [예외] 매칭을 할 수 있는 경우의 수가 없으면

### ✅ 페어 조회 기능

- [X]  과정, 레벨, 미션을 선택
- [X]  해당 미션의 페어 정보를 출력
  - [X]  출력되는 페어의 순서는 shuffle 메서드의 결과 순서로 정렬
- [ ]  [예외] 매칭 이력이 없음

---
