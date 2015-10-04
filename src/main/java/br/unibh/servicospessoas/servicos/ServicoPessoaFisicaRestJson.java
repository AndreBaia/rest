
package br.unibh.servicospessoas.servicos;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.unibh.servicospessoas.entidades.PessoaFisica;
import br.unibh.servicospessoas.persistencia.PessoaFisicaDAO;

// A classe Java ser� hospedada no caminho URI "/pessoafisica"

@Path("/pessoafisica")
public class ServicoPessoaFisicaRestJson {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/listar")
    public List<PessoaFisica> listar(){
    	PessoaFisicaDAO dao = new PessoaFisicaDAO();
    	return dao.findAll();
    }
}
