CREATE TABLE items(item_id bigserial PRIMARY KEY, title VARCHAR(255) NOT NULL, price INTEGER NOT NULL);
CREATE TABLE users(user_id bigserial PRIMARY KEY, name VARCHAR(255) NOT NULL, age INTEGER NOT NULL);