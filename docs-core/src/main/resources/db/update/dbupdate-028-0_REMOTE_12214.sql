alter table T_DOCUMENT add column EDU_NAME_C varchar(100) not null;
alter table T_DOCUMENT add column EDU_MAJOR_C varchar(100) not null;
alter table T_DOCUMENT add column EDU_GRAD_DATE_D datetime not null;
alter table T_DOCUMENT add column EDU_GPA varchar(4) not null;

update T_CONFIG set CFG_VALUE_C = '28' where CFG_ID_C = 'DB_VERSION';
