Create database Librery;

use Librery;

Create table student(
`id_student`  int(11) not null primary key,
`first_name` varchar(45),
`secound_name` varchar(45),
`third_name` varchar(45),
`group` varchar(45)
);

Create table book(
`id_book`  int(11) not null primary key,
`name_of_book` varchar(100),
`date_of_create` varchar(45),
`id_type` int(11),
`id_autor` int(11)
);

Create table autor(
`id_autor`  int(11) not null primary key,
`secound_name` varchar(45),
`first_name` varchar(45),
`third_name` varchar(45)
);


Create table type_of_book(
`id_type`  int(11) not null primary key,
`type_of_book` varchar(100)
);

Create table book_on_the_hands(
`id_student`  int(11),
`id_book` int(11),
`id_book_instance` int (11) not null primary key
);


Create table accounting(
	`id_book`  int(11) not null primary key,
	`real_count` int(11),
	`total_count`  int(11)
)