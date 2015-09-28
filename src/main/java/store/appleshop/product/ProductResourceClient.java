package store.appleshop.product;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author chanwook
 */
@FeignClient("api-product")
public interface ProductResourceClient {

    @RequestMapping(method = RequestMethod.GET, value = "/product/{productId}")
    ProductResource getProduct(@PathVariable("productId") String productId);

}

