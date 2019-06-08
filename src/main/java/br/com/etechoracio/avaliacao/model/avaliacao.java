package br.com.etechoracio.avaliacao.model;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.etechoracio.common.model.BaseORM;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="tb_contas")
public class avaliacao extends BaseORM {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;

	@Column(name="descricao")
	private String descricao;

	
	@Column(name="tp_doc")
	private String tp_doc;

	
	@Column(name="dt_vencimento")
	private Date dt_vencimento;
	 
	
	@Column(name="situacao")
	private String situacao;


	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void setId(Long arg0) {
		// TODO Auto-generated method stub
		
	}
	 
	
	
}
