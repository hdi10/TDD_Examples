/**
 * Dastekin created on 13.12.2022 the SelfShuntExample-Class inside the package - SpeedPresiDeepDive
 */
package SpeedPresiDeepDive.selfshuntpattern;

import SpeedPresiDeepDive.selfshuntpattern.core.domain.model.Customer;
import SpeedPresiDeepDive.selfshuntpattern.core.domain.model.Product;
import SpeedPresiDeepDive.selfshuntpattern.core.domain.service.interfaces.PricingServices;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class SelfShuntExample implements PricingServices {
    @Override
    public float getDiscountPercentage(Customer c, Product p) {
        return 10.0f;
    }

    @Test
    public void testOrderProcessorWithMockObject() throws Exception {

        Mock processorMock = new OrderProcessor();

        // some setup omitted for brevfity...
        OrderProcessor processor = new OrderProcessor();
    processor.setPricingService(this);
       processor.process(new Order(customer,prodcut));
       assertEquals(excpectedBalance, customer.getBalance(),
               0.001f);
    }
}
