package com.mjc813.cafe_kiosk.models.sale;

import com.mjc813.cafe_kiosk.models.product.ProductEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Repository
public interface SaleRepository extends JpaRepository<SaleEntity, Integer> {
	@EntityGraph(value = "SaleEntity.fetchProduct")
	Slice<SaleEntity> findByProductEquals(ProductEntity productEntity, Pageable pageable);

	@Query("SELECT SUM(s.price) FROM sale s WHERE s.saleTime BETWEEN :start AND :end")
	Long sumPriceBySaleTimeAtBetween(@Param("start") LocalDateTime start, @Param("end") LocalDateTime end);
}
