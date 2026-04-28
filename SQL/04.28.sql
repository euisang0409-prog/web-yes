-- film테이블에서 길이가 60분 이상 90분 이하인
-- 영화를 조회하세요
select title,length
from film
where length not between 60 and 90;

# film 테이블에서 등급이 G또는 PG또는 PG-13인 영화의 제목과 길이,
# 등급을 조회해주세요
select title,length,rating
from film
where rating in('G','PG','PG-13');

# actor테이블에서 이름이 A로 시작하는 배우의 이름을 조회하기
select FIRST_name
from actor
where FIRST_name LIKE 'A%';

# film테이블에서 제목이 LOVE가 포함된 영화의 제목을 조회하세요
select TITLE from FILM where TITLE like '%LOVE%';

# actor테이블에서 이름이 A로 시작하고 총 3글자인 배우의 이름을
-- 조회 하세요
select first_name
from actor
where first_name like 'A__';

-- 배우테이블에서 이름의 두번째 글자가 A인 배우를 조회하세요
select first_name
from actor a 
where first_name like '_A%';

-- 배우테이블에서 이름이 정확히 4글자인 배우의 이름 조회하기

select FIRST_NAME
from actor a
where first_name like '____';

-- NOT LIKE
-- 패턴이 일치하지 않는 데이터를 조회할 때 사용
select TITLE
from film 
where TITLE not like 'A%';

-- customer 테이블에서 이메일이 .org로 끝나는 고객을 조회하세요
select email
from customer
where email like '%.org';

-- film테이블에서 제목에 dinosaur가 포함되어 있지 않은 영화의
-- 제목을 조회하세요

select title
from film
where title not like '%dinosaur%';

create table FRUIT(
	ID INT primary key,
	NAME VARCHAR(30),
	PRICE INT
)
-- 한번에 여러 행 추가하기
insert into FRUIT (ID, NAME, PRICE)
VALUES
	(1, '사과', 3000),
	(2, '바나나', 2000),
	(3, '포도', 5000);

select * from fruit;

-- 한건 추가
insert into FRUIT (ID, NAME, PRICE)
VALUES	(4, '복숭아', 6000);

-- SELECT가 된 결과를 추가하는 방법

create table FRUIT_BACKUP(
	ID INT primary key,
	NAME VARCHAR(30),
	PRICE INT
)

insert into FRUIT_BACKUP(ID,NAME,RICE)
select ID, NAME, PRICE
from FRUIT
where PRICE <= 3000;

select * from FRUIT_BACKUP;

-- 일부 컬럼만 추가하기
-- 컬럼이 NOT NULL이면 무조건 써야함
insert into fruit(ID)
values (5);

select * from fruit;

-- 컬럼명을 생략하는 INSERT
insert into FRUIT values (6, '딸기',3900);

-- NULL값을 직접 넣을 수 있다.
insert into FRUIT values (7, '키위',NULL);

-- DEFAULT값 사용하기
insert into tbl_student (id ,NAME,MAJOR,birth)
values (1, '홍길동','컴퓨터공학','2020-01-01');

select * from tbl_student ts ;

-- 문자열 데이터를 넣을 때 작은따옴표를 사용한다.
-- 날짜 데이터도 작은따옴표로 넣는다.

insert into tbl_student (id ,NAME,MAJOR,GENDER,birth)
values (2, '이영희','산업디자인','W','2020-01-01');

insert into tbl_student (id ,NAME,MAJOR,GENDER,birth)
values (3, '김철수', '화학공학', 'M','1980-01-02');

select *from tbl_student ts;

insert into flower (flower_name, flower_color, flower_price)
VALUES
	('장미','빨간색',3000),
	('해바라기','노란색',6000),
	('튤립','보라색',5000),
	('안개꽃','흰색',2000);

-- 화분테이블에 추가하기
select * from POT;

insert into POT(pot_id,pot_color ,pot_shape ,pot_name )
values ('2026002','검은색','네모','해바라기');


UPDATE POT
SET pot_name = '장미꽃'
WHERE pot_name = '진달래';

-- TBL_student 테이블에 홍길동의 이름을 김길동으로 바꿔라

update tbl_student
set name = '김길동'
where name = '홍길동';

select * from tbl_student;




