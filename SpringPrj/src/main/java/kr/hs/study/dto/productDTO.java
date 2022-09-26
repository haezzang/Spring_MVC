package kr.hs.study.dto;

import org.springframework.web.multipart.MultipartFile;

public class productDTO {

	private int product_id;
	private String product_name;
	private int proudct_price;
	private String proudct_desc;
	private MultipartFile product_img;
	private String url;

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public int getProudct_price() {
		return proudct_price;
	}

	public void setProudct_price(int proudct_price) {
		this.proudct_price = proudct_price;
	}

	public String getProudct_desc() {
		return proudct_desc;
	}

	public void setProudct_desc(String proudct_desc) {
		this.proudct_desc = proudct_desc;
	}

	public MultipartFile getProduct_img() {
		return product_img;
	}

	public void setProduct_img(MultipartFile product_img) {
		this.product_img = product_img;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


}
