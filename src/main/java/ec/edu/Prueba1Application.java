package ec.edu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.service.IMatriculaPrototype;
import ec.edu.service.IMatriculaService;
import ec.edu.service.MatriculaSingletonServiceImpl;

@SpringBootApplication
public class Prueba1Application implements  CommandLineRunner{

	private static final Logger LOG = LoggerFactory.getLogger(Prueba1Application.class);

	@Autowired
	private IMatriculaService objeto1;
	@Autowired
	private IMatriculaService objeto2;
	@Autowired
	private IMatriculaService objeto3;
	
//	//@Autowired
//	//private IMatriculaService objeto2;
//	
	@Autowired
	private IMatriculaPrototype objeto4;
	

	public static void main(String[] args) {
		SpringApplication.run(Prueba1Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("********SINGLETON*********");	
		LOG.info("Impresion valor del objeto");
		this.objeto1.establecerValor("EDISON");
		LOG.info(this.objeto1.getCodigo());
		LOG.info("*******************PROTOTYPE************");
		this.objeto4.establecerNombre("JUANITO");
		LOG.info(this.objeto4.obtenerNombre());
	}



}
