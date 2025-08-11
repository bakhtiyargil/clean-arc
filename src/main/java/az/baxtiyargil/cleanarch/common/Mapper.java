package az.baxtiyargil.cleanarch.common;

import az.baxtiyargil.cleanarch.adapter.out.MerchantJpaEntity;
import az.baxtiyargil.cleanarch.adapter.out.ProductJpaEntity;
import az.baxtiyargil.cleanarch.application.domain.model.Merchant;
import az.baxtiyargil.cleanarch.application.domain.model.Product;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class Mapper {

    public Merchant merchantJpaToMerchant(MerchantJpaEntity merchantJpaEntity) {
        var merchant = new Merchant();
        merchant.setId(merchantJpaEntity.getId() == null ? null : merchantJpaEntity.getId());
        merchant.setName(merchantJpaEntity.getName());
        merchant.setAddress(merchantJpaEntity.getAddress());
        merchant.setPhone(merchantJpaEntity.getPhone());
        merchant.setEmail(merchantJpaEntity.getEmail());
        merchant.setWebsite(merchantJpaEntity.getWebsite());
        merchant.setJoinedAt(merchantJpaEntity.getJoinedAt());
        merchant.setProducts(Collections.emptyList());
        for (ProductJpaEntity product : merchantJpaEntity.getProducts()) {
            merchant.getProducts().add(productJpaToProduct(product));
        }
        return merchant;
    }

    public Product productJpaToProduct(ProductJpaEntity productJpaEntity) {
        var product = new Product();
        product.setId(productJpaEntity.getId() == null ? null : productJpaEntity.getId());
        product.setName(productJpaEntity.getName());
        product.setDescription(productJpaEntity.getDescription());
        product.setPrice(productJpaEntity.getPrice());
        product.setCreatedAt(productJpaEntity.getCreatedAt());
        product.setImageUrl(productJpaEntity.getImageUrl());
        if( productJpaEntity.getMerchant() != null) {
            product.setMerchant(merchantJpaToMerchant(productJpaEntity.getMerchant()));
        }
        return product;
    }

    public ProductJpaEntity productToProductJpa(Product product) {
        var productJpaEntity = new ProductJpaEntity();
        productJpaEntity.setId(product.getId() == null ? null : product.getId());
        productJpaEntity.setName(product.getName());
        productJpaEntity.setDescription(product.getDescription());
        productJpaEntity.setPrice(product.getPrice());
        productJpaEntity.setCreatedAt(product.getCreatedAt());
        productJpaEntity.setImageUrl(product.getImageUrl());
        productJpaEntity.setCreatedAt(product.getCreatedAt());
        productJpaEntity.setMerchant(merchantToMerchantJpa(product.getMerchant()));
        return productJpaEntity;
    }

    public MerchantJpaEntity merchantToMerchantJpa(Merchant merchant) {
        var merchantJpaEntity = new MerchantJpaEntity();
        merchantJpaEntity.setId(merchant.getId() == null ? null : merchant.getId());
        merchantJpaEntity.setName(merchant.getName());
        merchantJpaEntity.setAddress(merchant.getAddress());
        merchantJpaEntity.setPhone(merchant.getPhone());
        merchantJpaEntity.setEmail(merchant.getEmail());
        merchantJpaEntity.setWebsite(merchant.getWebsite());
        merchantJpaEntity.setJoinedAt(merchant.getJoinedAt());
        return merchantJpaEntity;
    }
}
