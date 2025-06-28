-- Создание таблиц справочников
CREATE TABLE functions
(
    fun_id   SERIAL PRIMARY KEY,
    fun_name VARCHAR(255) NOT NULL
);

CREATE TABLE roles
(
    role_id   SERIAL PRIMARY KEY,
    role_name VARCHAR(100) NOT NULL
);

CREATE TABLE categories
(
    cat_id   SERIAL PRIMARY KEY,
    cat_name VARCHAR(100) NOT NULL
);

CREATE TABLE sections
(
    sec_id   SERIAL PRIMARY KEY,
    sec_name VARCHAR(100) NOT NULL
);

CREATE TABLE rings
(
    ring_id   SERIAL PRIMARY KEY,
    ring_name VARCHAR(100) NOT NULL
);

CREATE TABLE statuses
(
    stat_id   SERIAL PRIMARY KEY,
    stat_name VARCHAR(100) NOT NULL
);

-- Основные таблицы

CREATE TABLE users
(
    user_id       SERIAL PRIMARY KEY,
    role_id       INT                 NOT NULL REFERENCES roles (role_id),
    login         VARCHAR(255) UNIQUE NOT NULL,
    password_hash VARCHAR(255)        NOT NULL,
    refresh_token VARCHAR(255)
);

CREATE TABLE technologies
(
    tech_id     SERIAL PRIMARY KEY,
    cat_id      INT          NOT NULL REFERENCES categories (cat_id),
    sec_id      INT          NOT NULL REFERENCES sections (sec_id),
    ring_id     INT          NOT NULL REFERENCES rings (ring_id),
    name        VARCHAR(255) NOT NULL,
    description VARCHAR(255),
    stat_id     INT          NOT NULL REFERENCES statuses (stat_id),
    update_time TIMESTAMP    NOT NULL DEFAULT now()
);

CREATE TABLE mapping
(
    id      SERIAL PRIMARY KEY,
    role_id INT NOT NULL REFERENCES roles (role_id),
    fun_id  INT NOT NULL REFERENCES functions (fun_id)
);

CREATE TABLE polls
(
    poll_id SERIAL PRIMARY KEY,
    user_id INT       NOT NULL REFERENCES users (user_id),
    tech_id INT       NOT NULL REFERENCES technologies (tech_id),
    ring_id INT       NOT NULL REFERENCES rings (ring_id),
    time    TIMESTAMP NOT NULL DEFAULT now()
);