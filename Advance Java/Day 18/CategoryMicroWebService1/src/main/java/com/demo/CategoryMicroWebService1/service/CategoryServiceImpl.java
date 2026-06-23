package com.demo.CategoryMicroWebService1.service;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.demo.CategoryMicroWebService1.beans.Category;
import com.demo.CategoryMicroWebService1.beans.Product;
import com.demo.CategoryMicroWebService1.dto.CategoryDTo;

@Service
public class CategoryServiceImpl implements CategoryService{
	private final RestClient restClient;

    public CategoryServiceImpl(RestClient restClient) {
        this.restClient = restClient;
    }

    public Category getCategoryById(int cid) {

        Category category = switch (cid) {
            case 1 -> new Category(1,
                    "Electronics",
                    "Electronic Products");

            case 2 -> new Category(2,
                    "Clothing",
                    "Garments");

            default -> null;
        };

        if (category == null) {
            return null;
        }

       /* List<Product> products =
                restClient.get()
                        .uri("/products/category/{cid}", cid)
                        .retrieve()
                        .body(new ParameterizedTypeReference<List<Product>>() {});

        category.setProducts(products);*/

        return category;
    }

	@Override
	public CategoryDTo getProductsByCid(int cid) {
		Category category = switch (cid) {
        case 1 -> new Category(1,
                "Electronics",
                "Electronic Products");

        case 2 -> new Category(2,
                "Clothing",
                "Garments");

        default -> null;
    };

    if (category == null) {
        return null;
    }

   List<Product> products =
            restClient.get()
                    .uri("/products/category/{cid}", cid)
                    .retrieve()
                    .body(new ParameterizedTypeReference<List<Product>>() {});

    CategoryDTo cdto=new CategoryDTo(category,products);

    return cdto;
	}


}
