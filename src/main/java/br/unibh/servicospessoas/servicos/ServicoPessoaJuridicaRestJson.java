package br.unibh.servicospessoas.servicos;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.unibh.servicospessoas.entidades.PessoaJuridica;
import br.unibh.servicospessoas.persistencia.PessoaJuridicaDAO;

//A classe Java será hospedada no caminho URI "/pessoajuridica"
//Método listar

@Path("/pessoajuridica")
public class ServicoPessoaJuridicaRestJson {

	// Listar Tudo
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/listar")
	public List<PessoaJuridica> listar() {
		PessoaJuridicaDAO dao = new PessoaJuridicaDAO();
		return dao.findAll();
	}

	// Buscar
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public PessoaJuridica find(@PathParam("id") int id) {
		PessoaJuridicaDAO dao = new PessoaJuridicaDAO();
		return dao.find(new Long(id));
	}

	// Criar
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/salvar")
	public PessoaJuridica salvar(PessoaJuridica p) {
		PessoaJuridicaDAO dao = new PessoaJuridicaDAO();
		dao.insert(p);
		return dao.findCnpj(p.getCnpj());	
	}

	// Atualizar
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public PessoaJuridica atualizar(@PathParam("id") int id, PessoaJuridica p) {
		PessoaJuridicaDAO dao = new PessoaJuridicaDAO();
		dao.update(p);
		return dao.find(new Long(id));
	}

	// Delete
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public void deletarJSON(@PathParam("id") int id) {
		PessoaJuridicaDAO dao = new PessoaJuridicaDAO();
		PessoaJuridica pf = dao.find(new Long(id));
		dao.delete(pf);
		PessoaJuridica pf2 = dao.find(new Long(id));
		if (pf2 == null) {
			System.out.println("Pessoa Juridica foi deletada com sucesso");
		} else {
			System.out.println("Erro ao deletar a Pessoa Juridica");
		}
	}

}
