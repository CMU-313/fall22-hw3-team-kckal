alter table T_DOCUMENT add column EDU_NAME_C varchar(100) not null;
alter table T_DOCUMENT add column EDU_MAJOR_C varchar(100) not null;
alter table T_DOCUMENT add column EDU_GRAD_DATE_D datetime not null;
alter table T_DOCUMENT add column EDU_GPA varchar(4) not null;

<<<<<<< HEAD
alter table T_EDUCATION add constraint FK_EDU_IDDOC_C foreign key (EDU_IDDOC_C) references T_DOCUMENT (DOC_ID_C) on delete restrict on update restrict;
alter table T_EXPERIENCE add constraint FK_EXP_IDDOC_C foreign key (EXP_IDDOC_C) references T_DOCUMENT (DOC_ID_C) on delete restrict on update restrict;
=======
>>>>>>> 1d82db0367310e24ca45b9cb7a4d6080495c01cb
update T_CONFIG set CFG_VALUE_C = '28' where CFG_ID_C = 'DB_VERSION';
