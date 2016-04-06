package pl.jeziorl.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.jeziorl.springmvc.dao.ProductDao;
import pl.jeziorl.springmvc.dto.ProductDTO;
import pl.jeziorl.springmvc.service.ProductService;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    public List<ProductDTO> getProductList() {
        return productDao.getProductList();
    }
}
