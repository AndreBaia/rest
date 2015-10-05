package br.unibh.servicospessoas.servicos;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.unibh.servicospessoas.entidades.PessoaJuridica;
import br.unibh.servicospessoas.persistencia.PessoaJuridicaDAO;

@Path("/pessoajuridica")
public class ServicoPessoaJuridicaRestJson {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listar")
	public List<PessoaJuridica> listar(){
		PessoaJuridicaDAO dao = new PessoaJuridicaDAO();
		return dao.findAll();
	}

}
