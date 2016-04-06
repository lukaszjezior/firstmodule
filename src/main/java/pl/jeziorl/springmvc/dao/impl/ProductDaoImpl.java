package pl.jeziorl.springmvc.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.jeziorl.springmvc.dao.ProductDao;
import pl.jeziorl.springmvc.dto.ProductDTO;
import pl.jeziorl.springmvc.mapper.ProductMapper;

import java.util.List;

@Component
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private ProductMapper productMapper;

    public List<ProductDTO> getProductList() {
        return productMapper.getProductList();
    }
}
