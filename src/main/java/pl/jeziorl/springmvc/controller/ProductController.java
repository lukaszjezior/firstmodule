package pl.jeziorl.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.jeziorl.springmvc.dto.ProductDTO;
import pl.jeziorl.springmvc.service.ProductService;

import java.util.List;

@Controller
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<ProductDTO> productList() {
        return productService.getProductList();
    }
}
