package com.davisy.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "interested")
@NoArgsConstructor
@AllArgsConstructor
public class Interested {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int interested_id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	User user;

	@ManyToOne
	@JoinColumn(name = "post_id")
	Post post;
	
	@Temporal(TemporalType.DATE)
	Date date_interested = new Date();

}
