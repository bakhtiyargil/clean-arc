insert into cleanarch.merchant(id, joined_at, address, email, name, phone, website)
values (1,
        '11-24-2024 11:56:23.222',
        'Baku city, Port Baku 2',
        'neymar@gmail.com',
        'NeymarStore',
        '+994772221122',
        'neymarstore.com');

insert into cleanarch.product(id, merchant_id, price, created_at, description, image_url, name)
VALUES  (111,
         null,
         14.53,
         '09-02-2022 09:52:11.222',
         'Horse Meat',
         'file:///meat.jpeg',
         'Meat');