/**
 * Dastekin created on 13.12.2022 the PricingServices-Class inside the package - SpeedPresiDeepDive
 */
package SpeedPresiDeepDive.selfshuntpattern.core.domain.service.interfaces;

import SpeedPresiDeepDive.selfshuntpattern.core.domain.model.Customer;
import SpeedPresiDeepDive.selfshuntpattern.core.domain.model.Product;

public interface PricingServices {
    float getDiscountPercentage(Customer c, Product p);
}
