CREATE TABLE t_app_def
(
	id  					    VARCHAR(64) NOT NULL PRIMARY KEY,
	app_name 				  VARCHAR(256) NOT NULL,
	group_name				VARCHAR(256),
	own_user_id       VARCHAR(64),
	server_port       SMALLINT NOT NULL,
	dubbo_port        INT,
	kafka_topic       VARCHAR(256),
	ext_setting       VARCHAR(256),
	ext1_setting      VARCHAR(256),
	context_path      VARCHAR(64),
	app_desc          VARCHAR(1024),
	status          	VARCHAR(2),
	update_user_id    VARCHAR(64),
	create_user_id    VARCHAR(64),
	update_datetime   TIMESTAMP WITHOUT TIME ZONE,
	create_datetime   TIMESTAMP WITHOUT TIME ZONE
);

CREATE UNIQUE INDEX I_APP_NAME ON t_app_def (app_name);

create sequence SEQ_APP_DEF increment by 1 minvalue 1 no maxvalue start with 1;

comment on table  t_app_def 					        is '服务表';
comment on column t_app_def.id 				        is '主键';
comment on column t_app_def.app_name 			    is '服务名';
comment on column t_app_def.group_name 			  is '服务分组名';
comment on column t_app_def.own_user_id 			is '服务owner用户';
comment on column t_app_def.server_port 			is '服务端口';
comment on column t_app_def.dubbo_port 			  is 'dubbo端口';
comment on column t_app_def.kafka_topic 			is 'kafka话题,通常用于任务下发';
comment on column t_app_def.ext_setting 			is '额外设置';
comment on column t_app_def.ext1_setting 			is '额外设置1';
comment on column t_app_def.context_path 			is '服务前缀';
comment on column t_app_def.app_desc 			    is '服务描述';
comment on column t_app_def.status 		        is '是否可用';
comment on column t_app_def.update_user_id 	  is '更新操作员';
comment on column t_app_def.create_user_id 	  is '创建操作员';
comment on column t_app_def.create_datetime 	is '更新时间';
comment on column t_app_def.create_datetime 	is '创建时间';


CREATE TABLE t_cache_def
(
	id  					        VARCHAR(64) NOT NULL PRIMARY KEY,
	cache_name 				    VARCHAR(256) NOT NULL,
	app_name				      VARCHAR(256),
	cache_zk_path         VARCHAR(512),
	cache_redis_key       VARCHAR(512),
	cache_ins_class       VARCHAR(1024),
	bridge_class          VARCHAR(1024),
	feild_keys            VARCHAR(1024),
	is_global             VARCHAR(2),
	is_durable            VARCHAR(2),
  duration_of_minutes   INT,
	last_load_datetime    TIMESTAMP WITHOUT TIME ZONE,
	status          	    VARCHAR(2),
	update_user_id        VARCHAR(64),
	create_user_id        VARCHAR(64),
	update_datetime       TIMESTAMP WITHOUT TIME ZONE,
	create_datetime       TIMESTAMP WITHOUT TIME ZONE
);

CREATE UNIQUE INDEX I_CACHE_APP_NAME ON t_cache_def (cache_name,app_name);

CREATE UNIQUE INDEX I_CACHE_ZK_PATH ON t_cache_def (cache_zk_path);

CREATE UNIQUE INDEX I_CACHE_REDIS_KEY ON t_cache_def (cache_redis_key);

create sequence SEQ_CACHE_DEF increment by 1 minvalue 1 no maxvalue start with 1;

comment on table  t_cache_def 					              is '缓存表';
comment on column t_cache_def.id 				              is '主键';
comment on column t_cache_def.cache_name 			        is '缓存名';
comment on column t_cache_def.app_name 			          is '所在服务名';
comment on column t_cache_def.cache_zk_path 			    is '缓存在的zookeeper path 用于更新全局缓存,比如说国家之类的通知监听地址,不是全局可置为空';
comment on column t_cache_def.cache_redis_key 			  is '缓存在的redis_key';
comment on column t_cache_def.cache_ins_class 			  is '缓存的class类名';
comment on column t_cache_def.bridge_class 			      is '缓存的bridge类名';
comment on column t_cache_def.feild_keys 			        is '缓存的key值;分割为key,为联合field key';
comment on column t_cache_def.is_global 			        is '是否全局缓存  Y/N';
comment on column t_cache_def.is_durable 			        is '是否长期缓存  Y/N  长期缓存不需要过期时间';
comment on column t_cache_def.duration_of_minutes 		is '过期分钟';
comment on column t_cache_def.last_load_datetime 			is '最后一次更新时间';
comment on column t_cache_def.status 		              is '是否可用';
comment on column t_cache_def.update_user_id 	        is '更新操作员';
comment on column t_cache_def.create_user_id 	        is '创建操作员';
comment on column t_cache_def.create_datetime 	      is '更新时间';
comment on column t_cache_def.create_datetime 	      is '创建时间';



CREATE TABLE t_biz_table_def
(
	id  					    VARCHAR(64) NOT NULL PRIMARY KEY,
	table_name 				VARCHAR(256) NOT NULL,
	schema				    VARCHAR(256),
	app_name          VARCHAR(256),
	t_class 				  VARCHAR(1024) NOT NULL,
	pattern           VARCHAR(64),
	biz_code          SMALLINT NOT NULL,
	prefix 					  VARCHAR(4),
	the_desc 					VARCHAR(1024),
	is_sys					  VARCHAR(2),
	status          	VARCHAR(2),
	update_user_id    VARCHAR(64),
	create_user_id    VARCHAR(64),
	create_datetime   TIMESTAMP WITHOUT TIME ZONE
);

CREATE UNIQUE INDEX I_TABLE_NAME_SCHEMA ON t_biz_table_def (table_name,schema);

create sequence SEQ_BIZ_TABLE_CONF increment by 1 minvalue 1 no maxvalue start with 1;

comment on table  t_biz_table_def 					        is '业务表配置';
comment on column t_biz_table_def.id 				        is '主键';
comment on column t_biz_table_def.table_name 			  is '表名';
comment on column t_biz_table_def.schema 			      is '库名';
comment on column t_biz_table_def.app_name 			    is '服务名';
comment on column t_biz_table_def.t_class 			    is '类全名';
comment on column t_biz_table_def.pattern 				  is '分表模式 yyyy_MM, yyyy_MM_dd';
comment on column t_biz_table_def.biz_code 			    is '业务CODE(0-31)';
comment on column t_biz_table_def.prefix 				    is 'ID前缀';
comment on column t_biz_table_def.the_desc 			    is '业务分表描述';
comment on column t_biz_table_def.is_sys 		        is '是否系统';
comment on column t_biz_table_def.status 		        is '是否可用';
comment on column t_biz_table_def.update_user_id 	  is '更新操作员';
comment on column t_biz_table_def.create_user_id  	is '创建操作员';
comment on column t_biz_table_def.create_datetime 	is '创建时间';

create table t_country_3166
(
  id        	 	            VARCHAR(64) NOT NULL PRIMARY KEY,
  alpha_code_2              VARCHAR(4) NOT NULL ,
  alpha_code_3              VARCHAR(6) NOT NULL ,
  number_code               VARCHAR(6) NOT NULL ,
  ISO3166_2                 VARCHAR(32) ,
  i18n_key                  VARCHAR(256) ,
  name                      VARCHAR(256),
  region                    VARCHAR(256),
  sub_region                VARCHAR(256),
  intermediate_region       VARCHAR(256),
  region_code               VARCHAR(6),
  sub_region_code           VARCHAR(6),
  intermediate_region_code  VARCHAR(6),
  status                    VARCHAR(2),
  update_user_id            VARCHAR(64),
	create_user_id            VARCHAR(64),
	update_datetime           TIMESTAMP WITHOUT TIME ZONE,
	create_datetime           TIMESTAMP WITHOUT TIME ZONE
);

create sequence SEQ_COUNTRY_3166 increment by 1 minvalue 1 no maxvalue start with 1;

comment on table  t_country_3166 					                  is '国家表';
comment on column t_country_3166.id 				                is '主键';
comment on column t_country_3166.alpha_code_2 			        is '国家2字码';
comment on column t_country_3166.alpha_code_3 			        is '国家3字码';
comment on column t_country_3166.number_code 			          is '国家数字码';
comment on column t_country_3166.ISO3166_2 			            is '国家3166-2字码';
comment on column t_country_3166.i18n_key 				          is '国家I18N';
comment on column t_country_3166.name 			                is '国家英文名';
comment on column t_country_3166.region 			              is '国家地区';
comment on column t_country_3166.sub_region 				        is '国家子地区';
comment on column t_country_3166.intermediate_region 			  is '国家中间地区';
comment on column t_country_3166.region_code 		            is '国家地区编码';
comment on column t_country_3166.sub_region_code 		        is '国家子地区编码';
comment on column t_country_3166.intermediate_region_code 	is '国家中间地区编码';
comment on column t_country_3166.status 		                is '是否可用';
comment on column t_country_3166.update_user_id 	          is '更新操作员';
comment on column t_country_3166.create_user_id 	          is '创建操作员';
comment on column t_country_3166.update_datetime 	          is '更新时间';
comment on column t_country_3166.create_datetime 	          is '创建时间';

create table t_currency_4217
(
  id        	 	      VARCHAR(64) NOT NULL PRIMARY KEY,
  alpha_code          VARCHAR(6) ,
  number_code         VARCHAR(6) ,
  minor_unit          SMALLINT default 0,
  symbol_currency     VARCHAR(6),
  i18n_key            VARCHAR(32),
  name                VARCHAR(128),
  country             VARCHAR(128),
  grant_4_sale        VARCHAR(2),
  grant_4_settle      VARCHAR(2),
  status              VARCHAR(2),
  update_user_id      VARCHAR(64),
	create_user_id      VARCHAR(64),
	update_datetime     TIMESTAMP WITHOUT TIME ZONE,
	create_datetime     TIMESTAMP WITHOUT TIME ZONE
);

create sequence SEQ_CURRENCY_4217 increment by 1 minvalue 1 no maxvalue start with 1;

comment on table  t_currency_4217 					                is '币种表';
comment on column t_currency_4217.id 				                is '主键';
comment on column t_currency_4217.alpha_code 			          is '币种字母码';
comment on column t_currency_4217.number_code 			        is '币种数字码';
comment on column t_currency_4217.minor_unit 			          is '币种最小单位';
comment on column t_currency_4217.symbol_currency 			    is '币种符号';
comment on column t_currency_4217.i18n_key 				          is '币种I18N';
comment on column t_currency_4217.name 			                is '币种中文名';
comment on column t_currency_4217.country 			            is '币种使用实体';
comment on column t_currency_4217.grant_4_sale 				      is '是否是交易币种Y/N';
comment on column t_currency_4217.grant_4_settle 			      is '是否是结算币种Y/N';
comment on column t_currency_4217.status 		                is '是否可用';
comment on column t_currency_4217.update_user_id 	          is '更新操作员';
comment on column t_currency_4217.create_user_id 	          is '创建操作员';
comment on column t_currency_4217.update_datetime 	        is '更新时间';
comment on column t_currency_4217.create_datetime 	        is '创建时间';

CREATE TABLE t_dict_data
(
	dict_code                 VARCHAR(64) NOT NULL  PRIMARY KEY,
	parent_code               VARCHAR(64) NOT NULL,
	tree_sort                 SMALLINT NOT NULL,
	tree_leaf                 VARCHAR(2) NOT NULL,
	tree_level                SMALLINT NOT NULL,
	dict_label                VARCHAR(128) NOT NULL,
	dict_value                VARCHAR(128) NOT NULL,
	dict_name                 VARCHAR(128) NOT NULL,
	dict_tag                  VARCHAR(256) NOT NULL,
	is_sys                    VARCHAR(2) NOT NULL,
	is_default                VARCHAR(2) NOT NULL,
	the_desc                  VARCHAR(1024),
	status                    VARCHAR(2),
  update_user_id            VARCHAR(64),
	create_user_id            VARCHAR(64),
	update_datetime           TIMESTAMP WITHOUT TIME ZONE,
	create_datetime           TIMESTAMP WITHOUT TIME ZONE
);

create sequence SEQ_DICT_DATA increment by 1 minvalue 1 no maxvalue start with 1;
CREATE INDEX I_PARENT_CODE ON t_biz_table_def (parent_code);
CREATE INDEX I_DICT_NAME ON t_biz_table_def (dict_name);

comment on table  t_dict_data 					                is '字典数据表';
comment on column t_dict_data.dict_code 				        is '字典编码';
comment on column t_dict_data.parent_code 			        is '父节点编码';
comment on column t_dict_data.tree_sort 			          is '树排序';
comment on column t_dict_data.tree_leaf 			          is '是否叶子节点  Y/N';
comment on column t_dict_data.tree_level 			          is '叶子深度';
comment on column t_dict_data.dict_label 				        is '字典标志';
comment on column t_dict_data.dict_value 			          is '字典值';
comment on column t_dict_data.dict_name 			          is '字典名';
comment on column t_dict_data.dict_tag 			            is '字典标识';
comment on column t_dict_data.is_sys 				            is '是否系统使用 Y/N';
comment on column t_dict_data.is_default 				        is '是否默认选中 Y/N';
comment on column t_dict_data.the_desc 				          is '描述';
comment on column t_dict_data.status 		                is '是否可用';
comment on column t_dict_data.update_user_id 	          is '更新操作员';
comment on column t_dict_data.create_user_id 	          is '创建操作员';
comment on column t_dict_data.update_datetime 	        is '更新时间';
comment on column t_dict_data.create_datetime 	        is '创建时间';

CREATE TABLE t_dict_type
(
	id                        VARCHAR(64) NOT NULL PRIMARY KEY,
	dict_name                 VARCHAR(128) NOT NULL,
	dict_type                 VARCHAR(128) NOT NULL,
	the_desc                  VARCHAR(1024),
	is_sys                    VARCHAR(1) NOT NULL,
  status                    VARCHAR(2),
  update_user_id            VARCHAR(64),
	create_user_id            VARCHAR(64),
	update_datetime           TIMESTAMP WITHOUT TIME ZONE,
	create_datetime           TIMESTAMP WITHOUT TIME ZONE
);

create sequence SEQ_DICT_TYPE_ID increment by 1 minvalue 1 no maxvalue start with 1;

comment on table  t_dict_type 					                is '字典类型表';
comment on column t_dict_type.id 				                is '字典编码';
comment on column t_dict_type.dict_name 			          is '字典名称';
comment on column t_dict_type.dict_type 			          is '字典类型';
comment on column t_dict_type.is_sys 				            is '是否系统使用 Y/N';
comment on column t_dict_type.the_desc 				          is '描述';
comment on column t_dict_type.status 		                is '是否可用';
comment on column t_dict_type.update_user_id 	          is '更新操作员';
comment on column t_dict_type.create_user_id 	          is '创建操作员';
comment on column t_dict_type.update_datetime 	        is '更新时间';
comment on column t_dict_type.create_datetime 	        is '创建时间';

