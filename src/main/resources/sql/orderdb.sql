create table tbl_users (
	`id` int primary key auto_increment,
	`email` varchar(255) not null,
	`password` varchar(20) not null,
	`logged_in` bool default false,
	`user_token` varchar(255),
	`token_expiration` datetime
);

CREATE TABLE tbl_user_addresses(
	`id` int primary key auto_increment,
	`user_id` int,
	`contact_name` varchar(255),
	`phone_number` varchar(255),
	`province` varchar(255),
	`street` varchar(255),
	`ward` varchar(255),
	foreign key (`user_id`) references tbl_users(`id`)
);

create table tbl_delivery (
	`id` integer primary key auto_increment,
	`price` decimal(10,2),
	`province` varchar(255),
	`street` varchar(255),
	`ward` varchar(255),
	`detail` varchar(255)
);

create table tbl_products (
	`id` integer primary key auto_increment,
	`product_name` varchar(255),
	`price` decimal(10,2),
	`quantity` integer,
	`date_created` datetime,
	`date_updated` datetime,
	`unit` varchar(255)
);

create table tbl_orders (
	`id` integer primary key  auto_increment,
	`order_uid` varchar(255),
	`price` decimal(10,2),
	`order_status` varchar(255),
	`user_id` integer,
	`delivery_id` integer,
	`date_created` datetime,
	`date_updated` datetime,
	foreign key (`user_id`) references tbl_users(`id`),
	foreign key (`delivery_id`) references tbl_delivery(`id`)
);

create table tbl_order_detail (
	`id` integer primary key auto_increment,
	`product_id` integer ,
	`order_id` integer,
	`quantity` integer,
	`price` decimal(10,2),
	`unit` decimal(10,2),
	foreign key(`product_id`) references tbl_products(`id`),
	foreign key(`order_id`) references tbl_orders(`id`)
);

create table tbl_cart (
	`id` integer primary key auto_increment,
	`user_id` integer,
	`product_id` integer,
	`quantity` integer,
	`unit` decimal(10,2),
	foreign key (`user_id`) references tbl_users(`id`),
	foreign key (`product_id`) references tbl_products(`id`)
);

create table tbl_payment (
	`id` integer primary key auto_increment,
	`payment_method` varchar(255),
	`payment_status` varchar(255),
	`payment_amount` decimal(10,2),
	`order_id` integer,
	foreign key (`order_id`) references tbl_orders(id)
);
