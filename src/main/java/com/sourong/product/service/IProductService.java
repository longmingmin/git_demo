package com.sourong.product.service;

import java.util.List;

import com.sourong.product.domain.ProductVo;

public interface IProductService {
	List<ProductVo> doselectAll();
	int dodeleteByPrimanyKey(ProductVo proId);
	int doinsertByProduct(ProductVo pro);
	int doupdateByProduct(ProductVo pro);
}
