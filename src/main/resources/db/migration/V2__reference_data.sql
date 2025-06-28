INSERT INTO functions (fun_name) VALUES
    ('Вход/регистрация'),
    ('Просмотр техрадара'),
    ('Фильтрация техрадара (секция, категория, дата)'),
    ('Экспорт техрадара PDF/CSV'),
    ('Группировка техрадара по командам'),
    ('Голосование за распределение продуктов'),
    ('Добавление продукта каталог технологий'),
    ('Просмотр каталога технологий'),
    ('Просмотр дашборда по продукту'),
    ('Архивирование/Удаление/редактирование продукта на техрадаре'),
    ('Поиск, сортировка, фильтрация по каталогу технологий');

INSERT INTO roles (role_name) VALUES
    ('tech_lead'),
    ('developer');

INSERT INTO categories (cat_name) VALUES
    ('Backend'),
    ('Frontend'),
    ('IOS'),
    ('Android');

INSERT INTO sections (sec_name) VALUES
    ('Languages'),
    ('Tools'),
    ('Techniques'),
    ('Platforms');

INSERT INTO rings (ring_name) VALUES
    ('ADOPT'),
    ('TRIAL'),
    ('ASSESS'),
    ('HOLD'),
    ('BACKLOG');

INSERT INTO statuses (stat_name) VALUES
    ('MOVED UP'),
    ('MOVED DOWN'),
    ('NEW'),
    ('NO CHANGE'),
    ('ARCHIVED');