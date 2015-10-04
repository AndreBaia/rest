
package br.unibh.servicospessoas;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// A classe Java será hospedada no caminho URI "/ myresource"

@Path("/myresource")
public class MyResource{

    // TODO: atualize a classe para atender às suas necessidades    
    // O método Java irá processar solicitações HTTP GET
	
    @GET 
    
    // O método Java irá produzir conteúdo identificado pela mídia MIME
    // tipo (type) "text/plain"
    
    @Produces("text/plain")
    public String getIt() {
        return "Got it!";
    }
}
