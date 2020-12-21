package com.example.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("商品信息模型")
public class GoodsModel {
	@ApiModelProperty(value = "商品名称", example = "铅笔")
	private String goodsname;
	@ApiModelProperty(value = "商品价格", example = "10.00")
	private String price;

	public String getGoodsname() {
		return goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}
