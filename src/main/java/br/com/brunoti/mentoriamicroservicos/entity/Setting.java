package br.com.brunoti.mentoriamicroservicos.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SETTING")
public class Setting {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@Column(name = "STATUS", nullable = false)
	private Boolean status;

	@Column(name = "CRIATED_IN")
	private Timestamp criatedIn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Timestamp getCriatedIn() {
		return criatedIn;
	}

	public void setCriatedIn(Timestamp criatedIn) {
		this.criatedIn = criatedIn;
	}

}