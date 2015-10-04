
package br.unibh.servicospessoas;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

// A classe Java ser� hospedada no caminho URI "/ myresource"

@Path("/myresource")
public class MyResource{

    // TODO: atualize a classe para atender �s suas necessidades    
    // O m�todo Java ir� processar solicita��es HTTP GET
	
    @GET 
    
    // O m�todo Java ir� produzir conte�do identificado pela m�dia MIME
    // tipo (type) "text/plain"
    
    @Produces("text/plain")
    public String getIt() {
        return "Got it!";
    }
}
