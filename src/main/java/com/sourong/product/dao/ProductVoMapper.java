package com.sourong.product.dao;

import java.util.List;

import com.sourong.product.domain.ProductVo;

public interface ProductVoMapper {
	public List<ProductVo> selectAll();
	public int deleteByPrimanyKey(ProductVo proId);
	public int insertByProduct(ProductVo pro);
	public int updateByProduct(ProductVo pro);
}
