package br.com.etechoracio.avaliacao.business;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.etechoracio.avaliacao.model.avaliacao;
import br.com.etechoracio.common.business.BaseSB;
import br.com.etechoracio.avaliacao.dao.avaliacaoDAO;

@Service
	public class avaliacaoSB extends BaseSB {

		private avaliacaoDAO avaliacaoDAO;
		
		@Override
		protected void postConstructImpl() {
			avaliacaoDAO = getDAO(avaliacaoDAO.class);
			
		}
		
		@Transactional(propagation = Propagation.NOT_SUPPORTED)
		public List<avaliacao> findAll(){
			return avaliacaoDAO.findAll();
		}
			
	}