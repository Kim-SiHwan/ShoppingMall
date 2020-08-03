
CREATE TABLE t_products(
pid Long auto_increment,
product_content varchar(50) not null,
product_title varchar(50) not null,
product_price varchar(50) not null,
product_type varchar(50) not null,
product_url varchar(50),
primary key (pid)
);

CREATE TABLE t_members(
uid varchar (50) not null,
upw varchar (100) not null,
uname varchar(50)not null,
address varchar(50)not null,
call varchar(50)not null,
email varchar(50)not null,
point int,
primary key (uid)
);

CREATE TABLE t_reviews(
rno Long auto_increment,
content varchar(50),
primary key (rno),
pid Long references t_products(pid),
uid varchar(50) references t_members(uid)
);

CREATE TABLE t_carts(
bno Long auto_increment,
primary key(bno),
quantity int,
total_price varchar(50),
cart_url varchar (50),
pid Long references t_products(pid),
uid varchar(50) references t_members(uid)
);



CREATE TABLE t_points(
pno Long auto_increment,
primary key(pno),
points int,
history varchar (50),
uid varchar(50) references t_members(uid)
);

CREATE TABLE t_orders(
ono Long auto_increment,
primary key (ono),
order_state varchar (50),
order_price varchar (50),
order_address varchar (50),
pid Long references t_products(pid),
uid varchar(50) references t_members(uid)
);

INSERT INTO t_members( uid, upw, uname, address, call, email,point)  values ('김시환','1234','김시환','집','4166','naver',0);
INSERT INTO t_products( product_content, product_title, product_price, product_type, product_url) VALUES
('널찍한 책상','기다란 책상','90000','책상','1.jpg');
INSERT INTO t_products( product_content, product_title, product_price, product_type, product_url) VALUES
('기다란 책상','기다란 책상','120000','책상','2.jpg');
INSERT INTO t_products( product_content, product_title, product_price, product_type, product_url) VALUES
('아늑한 2인용 소파 ','푹신 소파','160000','소파','3.jpg');
INSERT INTO t_products( product_content, product_title, product_price, product_type, product_url) VALUES
('푹신하고 안정감 있는 16개의 쿠션 의자','쿠셔닝체어','90000','의자','4.jpg');
INSERT INTO t_products( product_content, product_title, product_price, product_type, product_url) VALUES
('널찍한 공간의 킹사이즈 침대','와이드 킹사이즈 침대 ','250000','침대','5.jpg');
INSERT INTO t_products( product_content, product_title, product_price, product_type, product_url) VALUES
('색감이 아름답고 공간이 넓은 킹사이즈 침대','세미 와이드 킹사이즈 침대','270000','침대','6.jpg');
INSERT INTO t_products( product_content, product_title, product_price, product_type, product_url) VALUES
('푹신함과 재질 그리고 넓이까지 모두 갖춘 퀸사이즈 침대','세미 와이드 퀸사이즈 침대','220000','침대','7.jpg');
INSERT INTO t_products( product_content, product_title, product_price, product_type, product_url) VALUES
('만족스런 사이즈와 디자인의 킹사이즈 침대','앤틱 킹사이즈 침대','300000','침대','8.jpg');
INSERT INTO t_products( product_content, product_title, product_price, product_type, product_url) VALUES
('넓직한 바디의 브라운 컬러 소파','브라운 와이드 소파','210000','소파','9.jpg');
INSERT INTO t_products( product_content, product_title, product_price, product_type, product_url) VALUES
('넓직한 바디의 블랙 컬러 소파','블랙 와이드 소파','210000','소파','10.jpg');
INSERT INTO t_products( product_content, product_title, product_price, product_type, product_url) VALUES
('1인용 인체공학적 디자인의 소파','체어 소파','190000','소파','11.jpg');
INSERT INTO t_products( product_content, product_title, product_price, product_type, product_url) VALUES
('작지만 실용적이고 유니크한 디자인의 소파','라운드 소파','150000','소파','12.jpg');



INSERT INTO t_carts( quantity, total_price, pid, uid,cart_url) values ('1','20000',1,'김시환','책상2.jpg');

INSERT INTO t_members ( uid, upw, uname, address, call, email ) VALUES ('회원1' ,'1234', '이름1' ,'주소', '폰번호', '이메일');
INSERT INTO t_members ( uid, upw, uname, address, call, email ) VALUES ('회원2' ,'1234', '이름2' ,'주소', '폰번호', '이메일');
INSERT INTO t_members ( uid, upw, uname, address, call, email ) VALUES ('회원3' ,'1234', '이름3' ,'주소', '폰번호', '이메일');
INSERT INTO t_members ( uid, upw, uname, address, call, email ) VALUES ('회원4' ,'1234', '이름4' ,'주소', '폰번호', '이메일');
INSERT INTO t_members ( uid, upw, uname, address, call, email ) VALUES ('회원5' ,'1234', '이름5' ,'주소', '폰번호', '이메일');
INSERT INTO t_reviews ( content, pid, uid ) VALUES ('r1',1,'김시환');
INSERT INTO t_reviews ( content, pid, uid ) VALUES ('r2',1,'회원2');
INSERT INTO t_reviews ( content, pid, uid ) VALUES ('r3',1,'회원1');
