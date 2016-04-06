package pl.jeziorl.springmvc.mapper;

import pl.jeziorl.springmvc.dto.ProductDTO;

import java.util.List;

public interface ProductMapper {
    List<ProductDTO> getProductList();
}
