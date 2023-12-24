CREATE TABLE products
    id IDENTITY not null,
    productName varchar(255) not null,
    description varchar  not null,
    weight integer not null,
    price integer not null,
    quantum integer not null,
    primary key (id)
);

CREATE TABLE recipe(

    product_id integer not null
    id IDENTITY not null,
    recipeName varchar not null,
    description varchar not null,
    primary key (id)
    FOREIGN KEY (product_id) REFERENCES products (id) ON DELETE CASCADE
);
