/**
 * Dastekin created on 13.12.2022 the PricingServices-Class inside the package - SpeedPresiDeepDive
 */
package speedpresideepfive.selfshuntpattern.core.domain.service.interfaces;

import speedpresideepfive.selfshuntpattern.core.domain.model.Customer;
import speedpresideepfive.selfshuntpattern.core.domain.model.Product;

public interface PricingServices {
    float getDiscountPercentage(Customer c, Product p);
}
