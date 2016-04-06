package pl.jeziorl.springmvc.service;

import pl.jeziorl.springmvc.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getProductList();
}
