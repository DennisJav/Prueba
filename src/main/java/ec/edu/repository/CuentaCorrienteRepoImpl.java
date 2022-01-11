package ec.edu.repository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ec.edu.modelo.Cuenta;
import ec.edu.repository.CuentaCorrienteRepoImpl;


@Repository
@Qualifier("ahorros")
public class CuentaCorrienteRepoImpl implements ICuentaRepo{
	private static final Logger LOG = LoggerFactory.getLogger(CuentaCorrienteRepoImpl.class);


	@Override
	public void crear(Cuenta cuenta) {
		
		LOG.info("ha ingresado una nueva cuenta y se guarda en postreSQL" + cuenta); 
		
	}
}
