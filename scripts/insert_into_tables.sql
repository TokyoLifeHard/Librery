INSERT INTO `librery`.`student` (`id_student`, `first_name`, `secound_name`, `third_name`, `group`) VALUES ('1', 'Артем ', 'Вяткин', 'Витальевич', 'УИС-411');
INSERT INTO `librery`.`student` (`id_student`, `first_name`, `secound_name`, `third_name`, `group`) VALUES ('2', 'Антон', 'Лутовинов', 'Павлович', 'УИС-411');
INSERT INTO `librery`.`student` (`id_student`, `first_name`, `secound_name`, `third_name`, `group`) VALUES ('3', 'Никита', 'Еринский', 'Иванович', 'УИС-411');
INSERT INTO `librery`.`student` (`id_student`, `first_name`, `secound_name`, `third_name`, `group`) VALUES ('4', 'Антон', 'Жаднов', 'Валерьевич', 'УВА-413');
INSERT INTO `librery`.`student` (`id_student`, `first_name`, `secound_name`, `third_name`, `group`) VALUES ('5', 'Ирина', 'Бережных', 'Витальевна', 'УВА-413');

INSERT INTO `librery`.`book` (`id_book`, `name_of_book`, `date_of_create`, `id_type`, `id_autor`) VALUES ('1', 'Кластерный анализ', '2009', '1', '1');
INSERT INTO `librery`.`book` (`id_book`, `name_of_book`, `date_of_create`, `id_type`, `id_autor`) VALUES ('2', 'Теория передачи сигналов', '2007', '2', '2');
INSERT INTO `librery`.`book` (`id_book`, `name_of_book`, `date_of_create`, `id_type`, `id_autor`) VALUES ('3', 'Цвет в системах передачи информации', '2009', '3', '3');
INSERT INTO `librery`.`book` (`id_book`, `name_of_book`, `date_of_create`, `id_type`, `id_autor`) VALUES ('4', 'Язык C++. Базовые алгоритмические функции', '2011', '4', '4');
INSERT INTO `librery`.`book` (`id_book`, `name_of_book`, `date_of_create`, `id_type`, `id_autor`) VALUES ('5', 'Качество информации в системах управления', '2011', '5', '5');
INSERT INTO `librery`.`book` (`id_book`, `name_of_book`, `date_of_create`, `id_type`, `id_autor`) VALUES ('6', 'Эксплуатационное обслуживание ИС', '2013', '6', '5');
INSERT INTO `librery`.`book` (`id_book`, `name_of_book`, `date_of_create`, `id_type`, `id_autor`) VALUES ('7', 'Моделирование информационных систем ', '2011', '7', '6');
INSERT INTO `librery`.`book` (`id_book`, `name_of_book`, `date_of_create`, `id_type`, `id_autor`) VALUES ('8', 'Шифрование с открытым ключом', '2008', '8', '7');

INSERT INTO `librery`.`autor` (`id_autor`, `secound_name`, `first_name`, `third_name`) VALUES ('1', 'Сёмин', 'Андрей', 'Владимировчи');
INSERT INTO `librery`.`autor` (`id_autor`, `secound_name`, `first_name`, `third_name`) VALUES ('2', 'Нейман', 'Владимир', 'Ильич');
INSERT INTO `librery`.`autor` (`id_autor`, `secound_name`, `first_name`, `third_name`) VALUES ('3', 'Дружинин', 'Юрий', 'Георгиевич');
INSERT INTO `librery`.`autor` (`id_autor`, `secound_name`, `first_name`, `third_name`) VALUES ('4', 'Варфоломоев', 'Виктор', 'Архипович');
INSERT INTO `librery`.`autor` (`id_autor`, `secound_name`, `first_name`, `third_name`) VALUES ('5', 'Сергеева', 'Ирина', 'Васильевна');
INSERT INTO `librery`.`autor` (`id_autor`, `secound_name`, `first_name`, `third_name`) VALUES ('6', 'Ивницкий', 'Виктор', 'Аронивич');
INSERT INTO `librery`.`autor` (`id_autor`, `secound_name`, `first_name`, `third_name`) VALUES ('7', 'Костюковская', 'Эмма ', 'Иссаковна');

INSERT INTO `librery`.`type_of_book` (`id_type`, `type_of_book`) VALUES ('1', 'Системы искусственного интеллекта');
INSERT INTO `librery`.`type_of_book` (`id_type`, `type_of_book`) VALUES ('2', 'Теория информации и кодирования');
INSERT INTO `librery`.`type_of_book` (`id_type`, `type_of_book`) VALUES ('3', 'Анализ человеко-машинных систем');
INSERT INTO `librery`.`type_of_book` (`id_type`, `type_of_book`) VALUES ('4', 'Алгоритмические языки и программирование');
INSERT INTO `librery`.`type_of_book` (`id_type`, `type_of_book`) VALUES ('5', 'Обеспечение качества информации');
INSERT INTO `librery`.`type_of_book` (`id_type`, `type_of_book`) VALUES ('6', 'Эксплуатационное обслуживание ИС');
INSERT INTO `librery`.`type_of_book` (`id_type`, `type_of_book`) VALUES ('7', 'УП: Моделирование систем');
INSERT INTO `librery`.`type_of_book` (`id_type`, `type_of_book`) VALUES ('8', 'Методы и средства защиты информации');

INSERT INTO `librery`.`accounting` (`id_book`, `real_count`, `total_count`) VALUES ('1', '80', '78');
INSERT INTO `librery`.`accounting` (`id_book`, `real_count`, `total_count`) VALUES ('2', '76', '77');
INSERT INTO `librery`.`accounting` (`id_book`, `real_count`, `total_count`) VALUES ('3', '99', '97');
INSERT INTO `librery`.`accounting` (`id_book`, `real_count`, `total_count`) VALUES ('4', '82', '81');
INSERT INTO `librery`.`accounting` (`id_book`, `real_count`, `total_count`) VALUES ('5', '67', '66');
INSERT INTO `librery`.`accounting` (`id_book`, `real_count`, `total_count`) VALUES ('6', '25', '24');
INSERT INTO `librery`.`accounting` (`id_book`, `real_count`, `total_count`) VALUES ('7', '66', '64');
INSERT INTO `librery`.`accounting` (`id_book`, `real_count`, `total_count`) VALUES ('8', '75', '74');


INSERT INTO `librery`.`book_on_the_hands` (`id_student`, `id_book`, `id_book_instance`) VALUES ('1', '1', '1');
INSERT INTO `librery`.`book_on_the_hands` (`id_student`, `id_book`, `id_book_instance`) VALUES ('1', '4', '2');
INSERT INTO `librery`.`book_on_the_hands` (`id_student`, `id_book`, `id_book_instance`) VALUES ('3', '5', '3');
INSERT INTO `librery`.`book_on_the_hands` (`id_student`, `id_book`, `id_book_instance`) VALUES ('2', '5', '4');
INSERT INTO `librery`.`book_on_the_hands` (`id_student`, `id_book`, `id_book_instance`) VALUES ('4', '3', '5');
INSERT INTO `librery`.`book_on_the_hands` (`id_student`, `id_book`, `id_book_instance`) VALUES ('5', '6', '6');
INSERT INTO `librery`.`book_on_the_hands` (`id_student`, `id_book`, `id_book_instance`) VALUES ('5', '5', '7');
INSERT INTO `librery`.`book_on_the_hands` (`id_student`, `id_book`, `id_book_instance`) VALUES ('3', '8', '8');
