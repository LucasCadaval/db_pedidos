INSERT INTO itens_order (id_order, id_product, quantity, unit_price) VALUES
    (1, 1, 2, 129.99),  -- 2x Air Max 90
    (1, 2, 1, 29.99),    -- 1x Dri-FIT T-Shirt (total matches order 1's 259.98)

    (2, 1, 1, 129.99),   -- 1x Air Max 90 (matches order 2's 129.99)

    (3, 5, 1, 399.99),   -- 1x iPhone 15 Pro (matches order 3's 399.99)

    (4, 7, 1, 1199.99),  -- 1x Galaxy S23 Ultra (matches order 4's 1199.99)

    (5, 3, 1, 179.99),    -- 1x Ultraboost 21
    (5, 9, 1, 499.99),    -- 1x PlayStation 5 (total matches order 5's 699.98)

    (6, 6, 1, 249.00),    -- 1x AirPods Pro (matches order 6's 249.00)

    (7, 3, 1, 179.99),    -- 1x Ultraboost 21 (matches order 7's 179.99)

    (8, 9, 1, 499.99),    -- 1x PlayStation 5 (matches order 8's 499.99)

    (9, 2, 3, 29.99),     -- 3x Dri-FIT T-Shirt (total matches order 9's 899.97)

    (10, 10, 1, 399.99);   -- 1x WH-1000XM5 Headphones (matches order 10's 399.99)