### Java SE 21 일반 정보 및 잠재적 문제
이 규칙에는 Java SE 21의 변경 사항과 Java SE 21 이후에 출시된 이전 비 LTS(장기 지원) Java 버전에 대한 정보 링크가 포함되어 있습니다. 각 Java 버전에 대해 릴리스 노트와 WebSphere Application Migration Toolkit에서 감지하지 못하지만 문제를 일으킬 수 있는 특정 변경 사항에 대한 링크가 포함되어 있습니다. Oracle JDK 마이그레이션 가이드에서도 추가 세부 정보를 찾을 수 있습니다.

애플리케이션에서 다음 변경 사항을 적용하기 위한 자동화된 수정 사항이 있으며, 사용자 정의 구성을 애플리케이션 빌드 파일에 복사하여 적용할 수 있습니다.

* Java 21을 대상/소스로 사용하도록 빌드 파일 업데이트
* 불법 세미콜론 제거
* 새로운 URL(문자열)을 URI.create(문자열).toURL()로 변환
* SequencedCollection을 채택하도록 코드 업데이트
* 새로운 Locale(..)보다 Locale.of(..)를 선호하도록 코드 업데이트
* 더 이상 사용되지 않는 Runtime#exec() 메서드 대체
* Java 21과 호환되는 버전으로 플러그인 및 종속성 업데이트