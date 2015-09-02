package br.com.caelum.vraptor.blank;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;


@Resource
public class Teste01 {

	private final Result result;

	public Teste01(Result result) {
		this.result = result;
	}

	@Path("teste01/tt")
	public void tt() {
		result.include("variable", "VRaptor! fudeu");
	}
	
	@Path("/teste021")
	public void teste022() {
		result.include("variable", "VRaptor!2");
	}
	
	
}
