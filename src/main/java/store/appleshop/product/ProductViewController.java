package store.appleshop.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author chanwook
 */
@Controller
public class ProductViewController {

    @Autowired
    ProductResourceClient client;

    @RequestMapping("/product/{productId}")
    public String getProduct(@PathVariable String productId, ModelMap model) {
        final ProductResource product = client.getProduct(productId);
        model.put("product", product);
        return "product";
    }
}
