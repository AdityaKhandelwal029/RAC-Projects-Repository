package com.teamcenter.rac.tml.ui.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.jface.dialogs.MessageDialog;

@SuppressWarnings("unused")
public class non_cad_dml_attributes extends AbstractHandler 
{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException 
	{
		non_cad_dml_attributes_shell obj = new non_cad_dml_attributes_shell(event); 
		obj.frmDmlPropertyUpdation.setVisible(true);
		return null;
	}
}
