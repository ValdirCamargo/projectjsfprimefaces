package br.com.valdir.project.util.all;

import org.springframework.stereotype.Component;

@Component
public abstract class BeanViewAbstract implements ActionViewPadrao {

	private static final long serialVersionUID = 1L;

	@Override
	public void limparLista() throws Exception {

	}

	@Override
	public String save() throws Exception {
		return null;
	}

	@Override
	public void saveNotRetunr() throws Exception {
	}

	@Override
	public void saveEdit() throws Exception {
	}

	@Override
	public void excluir() throws Exception {
	}

	@Override
	public String ativar() throws Exception {
		return null;
	}

	@Override
	public String novo() throws Exception {
		return null;
	}

	@Override
	public String editar() throws Exception {
		return null;
	}

	@Override
	public void setarVariaveisNulas() throws Exception {
	}

	@Override
	public void consultarEntidade() throws Exception {
	}

	@Override
	public void stautsOperation(EstatusPersistencia a) throws Exception {
		Messagens.responseOperation(a);
	}

	protected void sucesso() throws Exception{
		stautsOperation(EstatusPersistencia.SUCESSO);
	}
	
	protected void error() throws Exception{
		stautsOperation(EstatusPersistencia.ERRO);
	}
	
	@Override
	public String redirecionarNewEntidade() throws Exception {
		return null;
	}

	@Override
	public String redirecionarFindEntidade() throws Exception {
		return null;
	}

	@Override
	public void addMsg(String msg) {
		Messagens.msg(msg);
		
	}

}
