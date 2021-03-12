INSERT INTO tb_product(name, price, description, img_url) VALUES ('PC Gamer', 3500.99, 'PC gamer i7 8GB', 'www.image.jpg');
INSERT INTO tb_product(name, price, description, img_url) VALUES ('Notebook', 3000.56, 'Notebook samsung i5 8GB', 'www.image.jpg');

INSERT INTO tb_category(name) VALUES ('Informatica');
INSERT INTO tb_category(name) VALUES ('Notebooks');
INSERT INTO tb_category(name) VALUES ('Computadores');

INSERT INTO tb_category_product(product_id, category_id) VALUES (1, 1);
INSERT INTO tb_category_product(product_id, category_id) VALUES (1, 3);
INSERT INTO tb_category_product(product_id, category_id) VALUES (2, 1);
INSERT INTO tb_category_product(product_id, category_id) VALUES (2, 2);
INSERT INTO tb_category_product(product_id, category_id) VALUES (2, 3);