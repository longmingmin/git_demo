package com.sourong.product.service;

import java.util.List;

import com.sourong.product.domain.ProductVo;

public interface ProductService {
	public List<ProductVo> doselectAll();
	public int dodeleteByPrimanyKey(ProductVo proId);
	public int doinsertByProduct(ProductVo pro);
	public int doupdateByProduct(ProductVo pro);
}
