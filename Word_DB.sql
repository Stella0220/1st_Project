

create table RESULT1 (
    correct number(5)
    constraint correct_pk primary key
);


create table RESULT2 (
    incorrect number(5)
    constraint incorrect_pk primary key
);

commit;

select * from RESULT1;
select * from RESULT2;





------------------------------------------
--userinfo Table

drop table userinfo;
create table userinfo(
name char(13)
constraint name_pk primary key,
gscore_w number(5),
gscore_l number(5),
FW number(5)
constraint fw_fk2 references RESULT1(correct),
FL number(5)
constraint fl_fk2 references RESULT2(incorrect)
);


create table fw(
FW number(5)
constraint fw_fk references RESULT1(correct));


DROP TABLE FL;

create table fl(
FL number(5)
constraint fl_fk references RESULT2(incorrect));




commit;
select * from userinfo;






----------------------------------------------
--game_4

drop table WORD_4;
create table WORD_4 (
    num number(5),
    word varchar2(20)
);

insert into WORD_4
values (1,'jump');

insert into WORD_4
values (2,'study');

insert into WORD_4
values (3,'school');

insert into WORD_4
values (4,'teacher');

insert into WORD_4
values (5,'shoes');

insert into WORD_4
values (6,'carrot');

insert into WORD_4
values (7,'clock');

insert into WORD_4
values (8,'pencil');

insert into WORD_4
values (9,'sleep');

insert into WORD_4
values (10,'duck');

commit;







----------------------------------------------
-- game_2 table

drop table GAME2;
create table GAME2(
num number(5),
word varchar2(20)
);

insert into game2
values (0,'beach');

insert into game2
values (1,'bird');

insert into game2
values (2,'book');

insert into game2
values (3,'box');

insert into game2
values (4,'butterfly');

insert into game2
values (5,'cake');

insert into game2
values (6,'chair');

insert into game2
values (7,'computer');

insert into game2
values (8,'fork');

insert into game2
values (9,'hand');

insert into game2
values (10,'leaf');

insert into game2
values (11,'mountain');

insert into game2
values (12,'onion');

insert into game2
values (13,'present');

insert into game2
values (14,'rabbit');

insert into game2
values (15,'ring');

insert into game2
values (16,'scissors');

insert into game2
values (17,'socks');

insert into game2
values (18,'subway');

insert into game2
values (19,'window');

SELECT * FROM GAME2;

---------------------------------------------------------------
---- game3 table

DROP TABLE TEST1
CREATE TABLE test1(
    words VARCHAR2(20),
    sentence VARCHAR2(4000) -- Adjust the size as needed
);

INSERT INTO test1 (words, sentence)
VALUES ('earth', 'We are living on Earth');
INSERT INTO test1 (words, sentence)
VALUES ('video', 'I am filming a video');
INSERT INTO test1 (words, sentence)
VALUES ('sun', 'The sun is bright');
INSERT INTO test1 (words, sentence)
VALUES ('moon', 'The moon is bright');
INSERT INTO test1 (words, sentence)
VALUES ('watch', 'I am watching you');
INSERT INTO test1 (words, sentence)
VALUES ('speed', 'What is the speed of that car');
INSERT INTO test1 (words, sentence)
VALUES ('phone', 'My phone is pretty');
INSERT INTO test1 (words, sentence)
VALUES ('math', 'Math is hard');
INSERT INTO test1 (words, sentence)
VALUES ('delivery', 'The delivery has arrived');
INSERT INTO test1 (words, sentence)
VALUES ('worker', 'The worker works hard');

commit;

select * from test1;



--------------------------------------------------------------------
-- game1 table

drop table tCateg;
create table tCateg (

id number(5),
category varchar2(20),
word varchar2(20)
);

insert into tCateg
values(1,'Family','mom');

insert into tCateg
values(2,'Family','dad');

insert into tCateg
values(3,'Family','brother');

insert into tCateg
values(4,'Family','sister');

insert into tCateg
values(5,'Animal','cat');

insert into tCateg
values(6,'Animal','pig');

insert into tCateg
values(7,'Animal','dog');

insert into tCateg
values(8,'Animal','lion');

insert into tCateg
values(9,'Fruit','lemon');

insert into tCateg
values(10,'Fruit','peach');

insert into tCateg
values(11,'Fruit','grapes');

insert into tCateg
values(12,'Fruit','banana');

insert into tCateg
values(13,'Transport','car');

insert into tCateg
values(14,'Transport','ship');

insert into tCateg
values(15,'Transport','plane');

insert into tCateg
values(16,'Transport','train');

insert into tCateg
values(17,'Instrument','piano');

insert into tCateg
values(18,'Instrument','violin');

insert into tCateg
values(19,'Instrument','drum');

insert into tCateg
values(20,'Instrument','guitar');


select * from tCateg;

--------------------------------------

commit;


