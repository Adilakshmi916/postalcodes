package com.springdatajpa.springboot.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//pojo class means plain object
//Specifies that the class is an entity.this annotation is applied to the entity class,interface of enums.
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@NoArgsConstructor
//all parameters for be below one
@AllArgsConstructor
@ToString
@Table(
		name="products",
		schema="ecommerce",
		uniqueConstraints= {
		@UniqueConstraint(
						name="sku_unique",
						columnNames="stock_keeping_unit"
						)
		//if we want to add uniqueconstraints add like abouve in table//
}
)
public class Product {
	@Id
	//THE Identity strategy relies on the database auto-increment colomun//
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,
	                 // genarator="product_generator"
	                 // 
	//)
//	@SequenceGenerator(
//			name="product_generator",
//			sequenceName="product_sequence_name",
//			allocationSize=1
//			)
	//@GeneratedValue(strategy=GenerationType.TABLE)
	
	private Long id;
	//specifies the mapped column for a persistant property or field.if no
	//column annotation is spcified,the default values apply.//
	@Column(name="stock_keeping_unit",nullable=false)
	private String sku;
	
	@Column(nullable=false)
	private String name;
	
	private String description;
	
	private boolean active;
	private String imageUrl;
	
	@CreationTimestamp
	private LocalDateTime dateCreated;
	
	@UpdateTimestamp
	private LocalDateTime lastUpdated;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public LocalDateTime getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}
	public LocalDateTime getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(LocalDateTime lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	
	

}
