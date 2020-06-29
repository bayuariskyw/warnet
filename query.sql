create tablespace bayuariskyw06927
datafile 'D:\database\bayuarisky06927.dbf'
size 10M;

create user bayuariskyw06927
identified by bayu
default tablespace bayuariskyw06927
quota 10m on bayuariskyw06927;

GRANT ALL PRIVILEGES TO bayuariskyw06927;

conn bayuariskyw06927/bayu;

create table admin
(
Id_admin VARCHAR2(10) not null,
password VARCHAR2(12),
nama_admin VARCHAR2(20),
alamat VARCHAR2(20),
no_telp NUMBER(12),
constraint PK_admin primary key(Id_admin)
);

create table komputer
(
No_pc VARCHAR2(10) not null,
nama_pc VARCHAR2(25),
keterangan VARCHAR2(100),
constraint PK_komputer primary key(No_pc)
);

create table member
(
Id_member VARCHAR2(10) not null,
Id_admin VARCHAR2(10),
password VARCHAR2(16),
nama_member VARCHAR2(10),
no_tlp NUMBER(12),
duration NUMBER(10),
constraint PK_member primary key(Id_member)
);

create table voucher
(
Kode_voucher VARCHAR2(10) not null,
Id_admin VARCHAR2(10),
duration NUMBER(10),
constraint PK_voucher primary key(Kode_voucher)
);

create table transaksi
(
No_transaksi VARCHAR2(10) not null,
Id_member VARCHAR2(10),
Kode_voucher VARCHAR2(10),
No_pc VARCHAR2(10),
duration NUMBER(10),
harga NUMBER(30),
bayar NUMBER(30),
kembalian NUMBER(30),
constraint PK_transaksi primary key(No_transaksi)
);

create table login
(
No_transaksi  VARCHAR2(10),
No_pc         VARCHAR2(10),
tanggal    DATE,
jamlogin  Timestamp,
jamlogout  Timestamp,
sisawaktu NUMBER
);

alter table login
add constraint FK_No_transaksi FOREIGN KEY (No_transaksi)
references transaksi(No_transaksi)
add constraint FK_No_pc FOREIGN KEY (No_pc)
references komputer(No_pc);

alter table transaksi
add constraint FK_Id_member FOREIGN KEY (Id_member)
references member(Id_member)
add constraint FK_Kode_voucher FOREIGN KEY (Kode_voucher)
references voucher(Kode_voucher)
add constraint FK_No_pc1 FOREIGN KEY (No_pc)
references komputer(No_pc);

alter table member
add constraint FK_Id_admin FOREIGN KEY (Id_admin)
references admin(Id_admin);

alter table voucher
add constraint FK_Id_admin1 FOREIGN KEY (Id_admin)
references admin(Id_admin);

create sequence No_transaksi
minvalue 1
maxvalue 9999
start with 1
increment by 1
cache 10;

alter table login_06927
modify(jamlogin Timestamp);

alter table login rename to login_06927;

insert into komputer (No_pc, nama_pc, keterangan) values (1, 'biasa', 'i5 gtx 1060');
insert into komputer (No_pc, nama_pc, keterangan) values (2, 'biasa', 'i5 gtx 1060');
insert into komputer (No_pc, nama_pc, keterangan) values (3, 'biasa', 'i5 gtx 1060');
insert into komputer (No_pc, nama_pc, keterangan) values (4, 'pro', 'i7 rtx 2060');
insert into komputer (No_pc, nama_pc, keterangan) values (5, 'pro', 'i7 rtx 2060');

insert all
into admin (Id_admin, password, nama_admin, alamat, no_telp) values (1, '123', 'Subejo', 'ambrella', '08214')
into admin (Id_admin, password, nama_admin, alamat, no_telp) values (2, '114', 'raybe', 'abrel', '08822134')
into admin (Id_admin, password, nama_admin, alamat, no_telp) values (3, '145', 'rayhen', 'planet', '085643')
into admin (Id_admin, password, nama_admin, alamat, no_telp) values (4, '177', 'hahan', 'rare', '085643')
into admin (Id_admin, password, nama_admin, alamat, no_telp) values (5, '129', 'tyga', 'marel', '085643')
select 1 from dual;

insert all
into member (Id_member, Id_admin, password, nama_member, no_tlp, duration) values (1, '1', '556', 'bayu', '12345', '1')
into member (Id_member, Id_admin, password, nama_member, no_tlp, duration) values (2, '2', '545', 'arven', '123456', '2')
into member (Id_member, Id_admin, password, nama_member, no_tlp, duration) values (3, '3', '892', 'aren', '1234567', '3')
into member (Id_member, Id_admin, password, nama_member, no_tlp, duration) values (4, '3', '992', 'naen', '12345678', '2')
into member (Id_member, Id_admin, password, nama_member, no_tlp, duration) values (5, '4', '292', 'taeyon', '123458', '1')
into member (Id_member, Id_admin, password, nama_member, no_tlp, duration) values (6, '5', '192', 'afrdi', '1234568', '3')
into member (Id_member, Id_admin, password, nama_member, no_tlp, duration) values (7, '4', '393', 'erda', '1234', '1')
into member (Id_member, Id_admin, password, nama_member, no_tlp, duration) values (8, '5', '899', 'nande', '123567', '2')
into member (Id_member, Id_admin, password, nama_member, no_tlp, duration) values (9, '2', '442', 'bagu', '12456', '3')
into member (Id_member, Id_admin, password, nama_member, no_tlp, duration) values (10, '1', '362', 'lolitoe', '14578', '1')
select 1 from dual;

insert into voucher (Kode_voucher, Id_admin, duration) values (1, '1', '1');
insert into voucher (Kode_voucher, Id_admin, duration) values (2, '2', '2');
insert into voucher (Kode_voucher, Id_admin, duration) values (3, '3', '3');
insert into voucher (Kode_voucher, Id_admin, duration) values (4, '3', '2');
insert into voucher (Kode_voucher, Id_admin, duration) values (5, '4', '1');
insert into voucher (Kode_voucher, Id_admin, duration) values (6, '5', '3');
insert into voucher (Kode_voucher, Id_admin, duration) values (7, '4', '1');
insert into voucher (Kode_voucher, Id_admin, duration) values (8, '5', '2');
insert into voucher (Kode_voucher, Id_admin, duration) values (9, '2', '3');
insert into voucher (Kode_voucher, Id_admin, duration) values (10, '1', '1');

insert into transaksi values(No_transaksi.nextval, '1', '1', '1', '1', '5000', '5000', '0');
insert into transaksi values(No_transaksi.nextval, '2', '2', '2', '2', '10000', '10000', '0');
insert into transaksi values(No_transaksi.nextval, '3', '3', '3', '3', '15000', '15000', '0');
insert into transaksi values(No_transaksi.nextval, '4', '4', '4', '2', '10000', '10000', '0');
insert into transaksi values(No_transaksi.nextval, '5', '5', '5', '1', '5000', '5000', '0');
insert into transaksi values(No_transaksi.nextval, '6', '6', '1', '3', '15000', '15000', '0');
insert into transaksi values(No_transaksi.nextval, '7', '7', '2', '1', '5000', '5000', '0');
insert into transaksi values(No_transaksi.nextval, '8', '8', '3', '2', '10000', '10000', '0');
insert into transaksi values(No_transaksi.nextval, '9', '9', '4', '3', '15000', '15000', '0');
insert into transaksi values(No_transaksi.nextval, '10', '10', '5', '1', '5000', '5000', '0');

insert into login_06927 (No_transaksi, No_pc, tanggal, jamlogin, jamlogout, sisawaktu) values (1, '1', to_date('07/06/2020','dd/mm/yyyy'), to_timestamp('07:00:00','hh:mi:ss'), to_timestamp('08:00:00 ','hh:mi:ss'), '0'); 
insert into login_06927 (No_transaksi, No_pc, tanggal, jamlogin, jamlogout, sisawaktu) values (2, '2', to_date('06/06/2020','dd/mm/yyyy'), to_timestamp('08:00:00','hh:mi:ss'), to_timestamp('10:00:00 ','hh:mi:ss'), '0'); 
insert into login_06927 (No_transaksi, No_pc, tanggal, jamlogin, jamlogout, sisawaktu) values (3, '3', to_date('05/06/2020','dd/mm/yyyy'), to_timestamp('07:30:00','hh:mi:ss'), to_timestamp('10:30:00 ','hh:mi:ss'), '0'); 
insert into login_06927 (No_transaksi, No_pc, tanggal, jamlogin, jamlogout, sisawaktu) values (4, '4', to_date('04/06/2020','dd/mm/yyyy'), to_timestamp('08:15:00','hh:mi:ss'), to_timestamp('10:15:00 ','hh:mi:ss'), '0'); 
insert into login_06927 (No_transaksi, No_pc, tanggal, jamlogin, jamlogout, sisawaktu) values (5, '5', to_date('03/06/2020','dd/mm/yyyy'), to_timestamp('07:00:00','hh:mi:ss'), to_timestamp('08:00:00 ','hh:mi:ss'), '0'); 
insert into login_06927 (No_transaksi, No_pc, tanggal, jamlogin, jamlogout, sisawaktu) values (6, '1', to_date('02/06/2020','dd/mm/yyyy'), to_timestamp('07:00:00','hh:mi:ss'), to_timestamp('10:00:00 ','hh:mi:ss'), '0'); 

create view view_transaksi as select * from transaksi;

select * from transaksi join member on transaksi.id_member = member.id_member;
