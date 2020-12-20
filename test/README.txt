3주차 과제를 전부 하지 못하여 이어서 했습니다
실습과제에 주어진 통계 API구축 SQL문을 직접 restcontroller를 이용하여 페이지에 값을 띄어보도록 했습니다
1.월별 접속자 수 - 완성
	SELECT DATE_FORMAT(createDate,'%Y-%m') createtime, count(*) as count
	FROM requestinfo GROUP BY createtime;
2.일자별 접속자 수 - 완성
	SELECT DATE_FORMAT(createDate,'%Y-%m-%d') createtime, count(*) as count 
	FROM requestinfo GROUP BY createtime;
3,4,5 로그인 수 관련 미완성
하나의 select문에 각기 다른 조건을 가진 값을 추츨하는 과정에서 문제가 생겨서 아직 해결 중입니다.