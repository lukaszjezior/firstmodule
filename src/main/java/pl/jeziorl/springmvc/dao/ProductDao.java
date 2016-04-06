package pl.jeziorl.springmvc.dao;

import pl.jeziorl.springmvc.dto.ProductDTO;

import java.util.List;

public interface ProductDao {
    List<ProductDTO> getProductList();
}
