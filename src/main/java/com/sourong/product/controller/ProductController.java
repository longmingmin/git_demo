package com.sourong.product.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sourong.product.domain.ProductVo;
import com.sourong.product.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Resource
	private ProductService proService;
	@RequestMapping("/con")
	public String conSelectAll(HttpServletRequest request,HttpServletResponse response) {
		List<ProductVo> productVo = proService.doselectAll();
		request.setAttribute("productVo", productVo);
		return "product-list";
	}
}
