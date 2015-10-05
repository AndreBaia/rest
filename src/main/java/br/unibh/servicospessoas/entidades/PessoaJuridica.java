package br.unibh.servicospessoas.entidades;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private String email;
	private Date dataConstituicao;
	private String site;
	
	public PessoaJuridica(){
		
	}
	
	//
	public PessoaJuridica(Long id, String nome, String endereco, String telefone, String cnpj, String email, Date dataConstituicao,
			String site) {
		super(id, nome, endereco, telefone);
		this.cnpj = cnpj;
		this.email = email;
		this.dataConstituicao = dataConstituicao;
		this.site = site;	
		
	}
		
	
	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + ", email="+ email +", dataConstituicao=" + dataConstituicao + ", site=" + site
				+ ", toString()=" + super.toString() + "]";
	}



	//Métodos Get e Set
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Date getDataConstituicao() {
		return dataConstituicao;
	}
	public void setDataConstituicao(Date dataConstituicao) {
		this.dataConstituicao = dataConstituicao;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	

}
