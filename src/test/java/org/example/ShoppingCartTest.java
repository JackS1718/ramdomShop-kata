package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

class ShoppingCartTest {
    @Test
    void calculatePriceForMagicCards_red() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "red", null, "Magic: The Gathering - Lightning Bolt", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 3.5);

    }

    @Test
    void calculatePriceForMagicCards_blue() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "blue", null, "Magic: The Gathering - Maga Eternal", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 5.0);

    }
    @Test
    void calculatePriceForMagicCards_green() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "green", null, "Magic: The Gathering - Eternal forest", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 4.40);

    }

    @Test
    void calculatePriceForMagicCards_black() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, null, false, "black", null, "Magic: The Gathering - Absolute hell", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 6.80);
  
}

@Test
void calculatePriceForMagicCards_brown() {
    ShoppingCart shoppingCart = new ShoppingCart();

    Product product = new Product(null, null, false, "brown", null, "Magic: The Gathering - Autumn wind", null);

    shoppingCart.addProduct(product);

    assertEquals(shoppingCart.getTotalPrice(), 2.00);

}

@Test
void calculatePriceForMagicCards_blackLotus() {
    ShoppingCart shoppingCart = new ShoppingCart();

    Product product = new Product(null, null, false, "null", null, "Magic: The Gathering - Black Lotus", null);

    shoppingCart.addProduct(product);

    assertEquals(shoppingCart.getTotalPrice(), 40000.00);

}

    @Test
    void calculatePriceForWine() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, false, null, null, "el tio juanillo", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 100.0);

    }

    @Test
    void calculatePriceForCheese() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Product product = new Product(null, 5, true, null, null, "French Camembert", null);

        shoppingCart.addProduct(product);

        assertEquals(shoppingCart.getTotalPrice(), 50.0);

}

    @Test
void calculatePriceForFish() {
    ShoppingCart shoppingCart = new ShoppingCart();

    Product product = new Product(null, null, false, "orange", BigDecimal.valueOf(1), null, null);

    shoppingCart.addProduct(product);

    assertEquals(shoppingCart.getTotalPrice(), 1.00);

    }

         @Test
        void calculatePriceForFish_Blue() {
             ShoppingCart shoppingCart = new ShoppingCart();
    
             Product product = new Product(null, null, false, "blue", BigDecimal.valueOf(0), null, null);
    
             shoppingCart.addProduct(product);
    
             assertEquals(shoppingCart.getTotalPrice(), 0.10);
    
}


        @Test
        void calculatePriceForFish_Gold() {
            ShoppingCart shoppingCart = new ShoppingCart();
    
            Product product = new Product(null, null, false, "gold", BigDecimal.valueOf(1), null, null);
    
            shoppingCart.addProduct(product);
    
            assertEquals(shoppingCart.getTotalPrice(), 100.0);
    
    }

        @Test
        void calculatePriceForCat_Black() {
            ShoppingCart shoppingCart = new ShoppingCart();

            Product product = new Product(4, null, false, "black", null, null, null);

            shoppingCart.addProduct(product);

            assertEquals(shoppingCart.getTotalPrice(), 16.8);

    }

         @Test
         void calculatePriceForMagicForSpider_Blue() {
             ShoppingCart shoppingCart = new ShoppingCart();

            Product product = new Product(8, null, false, "black", null, null, null);

             shoppingCart.addProduct(product);

             assertEquals(shoppingCart.getTotalPrice(),9.60);
  
    }
        @Test
        void calculatePriceForSpider_Red() {
            ShoppingCart shoppingCart = new ShoppingCart();

            Product product = new Product(8, null, false, "Red", null, null, null);

            shoppingCart.addProduct(product);

            assertEquals(shoppingCart.getTotalPrice(), 11.6);
    }


        @Test
        void calculatePriceForSpider_Gold() {
            ShoppingCart shoppingCart = new ShoppingCart();

            Product product = new Product(8, null, false, "Gold", null, null, null);

            shoppingCart.addProduct(product);

            assertEquals(shoppingCart.getTotalPrice(), 12.6);
    }


        @Test
        void calculatePriceForSpiderStinky() {
            ShoppingCart shoppingCart = new ShoppingCart();

            Product product = new Product(8, null, true, "Blue", null, null, null);

            shoppingCart.addProduct(product);

            assertEquals(shoppingCart.getTotalPrice(), 4.8);
    }


        @Test
        void calculatePriceForSpiderRed_Stinky() {
            ShoppingCart shoppingCart = new ShoppingCart();

            Product product = new Product(8, null, true, "Red", null, null, null);

            shoppingCart.addProduct(product);

            assertEquals(shoppingCart.getTotalPrice(), 5.8);
    }


        @Test
        void calculatePriceForSpiderGold_Stinky() {
             ShoppingCart shoppingCart = new ShoppingCart();

             Product product = new Product(8, null, true, "gold", null, null, null);

             shoppingCart.addProduct(product);

             assertEquals(shoppingCart.getTotalPrice(), 6.30);

    }
}
