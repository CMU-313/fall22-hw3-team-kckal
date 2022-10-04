-- create table T_EDUCATION (EDU_ID_C varchar(36) not null, EDU_IDDOC_C varchar(36), EDU_NAME_C varchar(100) not null, EDU_MAJOR_C varchar(100) not null, EDU_GRAD_DATE_D date not null, EDU_GPA float(3, 2) not null, primary key (EDU_ID_C));
create table T_EXPERIENCE (EXP_ID_C varchar(36) not null, EXP_IDDOC_C varchar(36), EXP_COMPANY_C varchar(100) not null, EXP_ROLE_C varchar(100) not null, EXP_DESCRIP_C varchar(1000) not null, EXP_START_DATE_D date not null, EXP_END_DATE_D date not null, primary key (EXP_ID_C) );
create table T_EDUCATION (EDU_ID_C varchar(36) not null, EDU_IDDOC_C varchar(36), EDU_NAME_C varchar(100) not null, EDU_MAJOR_C varchar(100) not null,  EDU_GRAD_DATE_D date not null, EDU_GPA varchar(4) not null, primary key (EDU_ID_C) );

alter table T_EDUCATION add constraint FK_EDU_IDDOC_C foreign key (EDU_IDDOC_C) references T_DOCUMENT (DOC_ID_C) on delete restrict on update restrict;
alter table T_EXPERIENCE add constraint FK_EXP_IDDOC_C foreign key (EXP_IDDOC_C) references T_DOCUMENT (DOC_ID_C) on delete restrict on update restrict;
update T_CONFIG set CFG_VALUE_C = '28' where CFG_ID_C = 'DB_VERSION';
