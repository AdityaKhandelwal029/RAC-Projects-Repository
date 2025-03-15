package com.teamcenter.rac.tml.cm.dmlchecklist;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import com.teamcenter.rac.aif.AbstractAIFUIApplication;
import com.teamcenter.rac.aif.kernel.AIFComponentContext;
import com.teamcenter.rac.aifrcp.AIFUtility;
import com.teamcenter.rac.kernel.TCComponent;
import com.teamcenter.rac.kernel.TCComponentFormType;
import com.teamcenter.rac.kernel.TCComponentQuery;
import com.teamcenter.rac.kernel.TCComponentQueryType;
import com.teamcenter.rac.kernel.TCException;
import com.teamcenter.rac.kernel.TCSession;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DMLCheckList 
{
	public JFrame frmDmlCheckList;
	public JTextPane textPane;
	public JTextField textField;
	JLabel lblIsThe   =  new JLabel(" 1.) Is the root cause analysis done for the identified failure mode ? *")                                                    ; JComboBox comboBox_1  = new JComboBox() ;  public JTextField textField_1;
	JLabel lblIsThe_1   =  new JLabel(" 2.) Is the failure mode generated at digital level ? *")                                                                     ; JComboBox comboBox_2  = new JComboBox() ;  public JTextField textField_2;
	JLabel Label_3   =  new JLabel(" 3.) Is the DFMEA revisited based on root cause analysis/identified failure mode ?")                                        ; JComboBox comboBox_3  = new JComboBox() ;  public JTextField textField_3;
	JLabel Label_4   =  new JLabel(" 4.) Has the DVP been updated to capture the failure mode ?")                                                               ; JComboBox comboBox_4  = new JComboBox() ;  public JTextField textField_4;
	JLabel Label_5   =  new JLabel(" 5.) Are all the recommended actions mentioned in DFMEA completed ?")                                                       ; JComboBox comboBox_5  = new JComboBox() ;  public JTextField textField_5;
	JLabel Label_6   =  new JLabel(" 6.) Is the linkage established between the special characteristics as per TS 11413 identified in the drawing and DFMEA ?") ; JComboBox comboBox_6  = new JComboBox() ;  public JTextField textField_6;
	JLabel Label_7   =  new JLabel(" 7.) Are applicable design review records available and attached ?")                                                        ; JComboBox comboBox_7  = new JComboBox() ;  public JTextField textField_7;
	JLabel Label_8   =  new JLabel(" 8.) Are the '4D' (DFMEA, DFM, DFA && DFS) documents attached to the DML ?")                                                ; JComboBox comboBox_8  = new JComboBox() ;  public JTextField textField_8;
	JLabel Label_9   =  new JLabel(" 9.) Is the  design verification  (Test Report) completed for the DR4 gateway ?")                                           ; JComboBox comboBox_9  = new JComboBox() ;  public JTextField textField_9;
	JLabel Label_10  = new  JLabel(" 10.) Is there an approved DCR/issue id linked to the DML (except for Gate Maturation DMLs) for post-DR3 releases ?")        ; JComboBox comboBox_10 = new JComboBox() ;  public JTextField textField_10;
	
	JLabel Label_11 = new JLabel(" 11.) Is the relevant DMU report available ?")                                                                                ; JComboBox comboBox_11 = new JComboBox();   public JTextField textField_11;
	JLabel Label_12 = new JLabel(" 12.) Is the DML subject correct and appropriate ?")                                                                          ; JComboBox comboBox_12 = new JComboBox();   public JTextField textField_12;
	JLabel Label_13 = new JLabel(" 13.) Is the DML reason code correct and appropriate ?")                                                                      ; JComboBox comboBox_13 = new JComboBox();   public JTextField textField_13;
	JLabel Label_14 = new JLabel(" 14.) Are all affected design groups identified and declared in the DML ?")                                                   ; JComboBox comboBox_14 = new JComboBox();   public JTextField textField_14;
	JLabel Label_15 = new JLabel(" 15.) Is the correct and appropriate keyword description selected against each part ?")                                       ; JComboBox comboBox_15 = new JComboBox();   public JTextField textField_15;
	JLabel Label_16 = new JLabel(" 16.) Is the supplier part no. given against proprietary parts,wherever such parts are there in the DML's product plan ?")    ; JComboBox comboBox_16 = new JComboBox();   public JTextField textField_16;
	JLabel Label_17 = new JLabel(" 17.) Is the colour indicator assigned correctly ?")                                                                          ; JComboBox comboBox_17 = new JComboBox();   public JTextField textField_17;
	JLabel lblIsThe_2 = new JLabel(" 18.) Is the spare criteria defined ? *")                                                                                       ; JComboBox comboBox_18 = new JComboBox();   public JTextField textField_18;
	JLabel Label_19 = new JLabel(" 19.) Is the spare indicator assigned correctly ?")                                                                           ; JComboBox comboBox_19 = new JComboBox();   public JTextField textField_19;
	JLabel Label_20 = new JLabel(" 20.) Is the part category assigned correctly ?")                                                                             ; JComboBox comboBox_20 = new JComboBox();   public JTextField textField_20;
	
	JLabel Label_21 = new JLabel(" 21.) Is the correct unit of measure selected ?")                                                   ; JComboBox comboBox_21 = new JComboBox(); public JTextField textField_21;
	JLabel Label_22 = new JLabel(" 22.) Is the hazardous material indicator assigned correctly ?")                                    ; JComboBox comboBox_22 = new JComboBox(); public JTextField textField_22;
	JLabel Label_23 = new JLabel(" 23.) Is the material class && surface protection std assigned correctly ? ")                       ; JComboBox comboBox_23 = new JComboBox(); public JTextField textField_23;
	JLabel Label_24 = new JLabel(" 24.) Is the weight defined ?")                                                                     ; JComboBox comboBox_24 = new JComboBox(); public JTextField textField_24;
	JLabel Label_25 = new JLabel(" 25.) Is the interchangeability defined in one way two way ?")                                      ; JComboBox comboBox_25 = new JComboBox(); public JTextField textField_25;
	JLabel Label_26 = new JLabel(" 26.) Is the disposal instruction w.r.t. interchangeability given wherever required ?")             ; JComboBox comboBox_26 = new JComboBox(); public JTextField textField_26;
	JLabel Label_27 = new JLabel(" 27.) Is the impact on homologation/certification assessed && appropriately addressed ?")           ; JComboBox comboBox_27 = new JComboBox(); public JTextField textField_27;
	JTextPane Label_28 = new JTextPane()                                                                                              ; JComboBox comboBox_28 = new JComboBox(); public JTextField textField_28;
	JLabel lblAreThe = new JLabel(" 29.) Are the envelop dimensions properly given ? *")                                                 ; JComboBox comboBox_29 = new JComboBox(); public JTextField textField_29;
	JLabel lblIsThe_3 = new JLabel(" 30.) Is the modification of drawings of all affected assemblies / components covered ? *")           ; JComboBox comboBox_30 = new JComboBox(); public JTextField textField_30;

	JLabel Label_31 = new JLabel(" 31.) Are the correct drawing no. and sheet no. mentioned ?")                                       ; JComboBox comboBox_31 = new JComboBox(); public JTextField textField_31;
	JLabel Label_32 = new JLabel(" 32.) Are the modification details and drawing modification status given ?")                        ; JComboBox comboBox_32 = new JComboBox(); public JTextField textField_32;
	JLabel Label_33 = new JLabel(" 33.) Is the supplier drawing/model referenced in the TML drawing/model ?")                         ; JComboBox comboBox_33 = new JComboBox(); public JTextField textField_33;
	JLabel Label_34 = new JLabel(" 34.) Are all the Information Fitment Drawings available as per the latest requirements ?")         ; JComboBox comboBox_34 = new JComboBox(); public JTextField textField_34;
	JLabel Label_35 = new JLabel(" 35.) Is the group-wise data entry corresponding to design group covered ?")                        ; JComboBox comboBox_35 = new JComboBox(); public JTextField textField_35;
	JLabel Label_36 = new JLabel(" 36.) Is modification of all Assy/TPL structures w.r.t. drawing modification covered ?")            ; JComboBox comboBox_36 = new JComboBox(); public JTextField textField_36;
	JLabel Label_37 = new JLabel(" 37.) Is the correct required quantity specified against each part ?")                              ; JComboBox comboBox_37 = new JComboBox(); public JTextField textField_37;
	JLabel Label_38 = new JLabel(" 38.) Is design novel ?")                                                                           ; JComboBox comboBox_38 = new JComboBox(); public JTextField textField_38;
	JLabel Label_39 = new JLabel(" 39.) Is design protected ?")                                                                       ; JComboBox comboBox_39 = new JComboBox(); public JTextField textField_39;
	JLabel Label_40 = new JLabel(" 40.) Is design protection initiated ?")                                                            ; JComboBox comboBox_40 = new JComboBox(); public JTextField textField_40;

	JLabel lblHasThe = new JLabel(" 41.) Has the Risk analysis in terms of DFMEA been completed for all carryover and changed parts ? *"); JComboBox comboBox_41 = new JComboBox() ; public JTextField textField_41; 
		
	
	@SuppressWarnings("rawtypes")
	
	JComboBox[] comBoxArray     =  new JComboBox[41];
	JTextField[] textFieldArray = new JTextField[41];
		
	static ExecutionEvent eventobj;
	
	
	int flagDesigner           = 0;
	int flagManager            = 0;
	int plmSupportGroup        = 0;
	int actionComboPerform     = 0;
	int designerComboPass      = 0;
	int designerMandatoryField = 0;
	int designerFinalPass      = 0;
	
	AIFComponentContext selectedobject = null;
	AIFComponentContext[] workflowArray;
	
	TCSession session = null;
	TCComponent selectedObj;
	TCComponentQueryType tccomponentquerytype = null;
	TCComponentQuery query = null;
	
	 TCComponent[] checkListAttached = null;
	 
	 TCComponentFormType formObj = null;
	 TCComponent checkListObj    = null;
		
	String itemId            = null;
	String itemRevId         = null;
	String objDesc           = null;
	String objType           = null;
	String objStr            = null;
	String designNovelCheck  = null;
	String designProtect     = null;
	String designProtectInit = null;
	
	String[] comboPropRealName = {
			"t5_RootCsAnal"   ,"t5_FailDigLevGen","t5_AddToDF"      ,"t5_NwEffTstFlrMod"   ,"t5_ActComplDFMEA","t5_NwlnkEstTs" ,"t5_DesRevRec",                      
			"t5_NwDfmeaAtt"   ,"t5_NwTstRptComp" ,"t5_NwIsDCRChk"   ,"t5_NwDmuRptAvl"      ,"t5_DMLSubCorrt"  ,"t5_DMLRsnCorrt","t5_AffDesGrpIden",                  
			"t5_CorrAppPrtDes","t5_PrtyPrtNob"   ,"t5_ColPrtInd"    ,"t5_SprCrtrDef"       ,"t5_SprIndDef"    ,"t5_NwPrtCatDef","t5_NwCorUoMSel",                    
			"t5_HazMatCont"   ,"t5_MatClsDef"    ,"t5_WgtDef"       ,"t5_IntrChnDef"       ,"t5_DispIns"      ,"t5_HomLogImp"  ,"t5_DrawClassInd","t5_EnvDimProp",                     
			"t5_ModCompPrt"   ,"t5_DrwShtNoCor"  ,"t5_ModDetStatCor","t5_PrtyPrtNoLnk"     ,"t5_IFDAvail"     ,"t5_GrpWsData"  ,"t5_NwModAssyTPLStruc",   	          
			"t5_ReqQanSpec"   ,"t5_IsDsgnNvl"    ,"t5_IsDsgnPrtctd" ,"t5_t5IsDsgnPrctnIntd","t5_IsRskanalysisDFMEA"	          
	       };
					
	String[] textPropRealName  = {
			"t5_Reason1" ,"t5_Reason4" ,"t5_Reason5" ,"t5_Reason42" ,"t5_Reason8" , "t5_Reason43","t5_Reason10",
			"t5_Reason44","t5_Reason45","t5_Reason14","t5_Reason47" ,"t5_Reason11", "t5_Reason12","t5_Reason13",
			"t5_Reason15","t5_Reason16","t5_Reason17","t5_Reason18" ,"t5_Reason19", "t5_Reason48","t5_Reason49",
			"t5_Reason20","t5_Reason21","t5_Reason22","t5_Reason23" ,"t5_Reason24", "t5_Reason25","t5_Reason26",
			"t5_Reason27","t5_Reason28","t5_Reason29","t5_Reason30" ,"t5_Reason31", "t5_Reason50","t5_Reason36",
			"t5_Reason37","t5_Reason38","t5_Reason2" , "t5_Reason34","t5_Reason35", "t5_Reason3"
	};
	
	String[] comboInitialValue     = new String[41];
	String[] comboFinalValue       = new String[41];
	String[] textFieldInitialvalue = new String[41];
	String[] finalTextFieldValue   = new String[41];
	
	int [] analystTodo = {1,2,4,6,8,9,15,18,28,29,30,31,33,34,36,37,38,39,40,41};
	int [] managerToDo = {3,5,7,11,12,13,14,17,19,20,21,22,23,24,25,32,35};
	
	//int [] designerMandatory = {1,2,18,28,29,30,41};
	int [] designerMandatory = {0,1,17,27,28,29,40};
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					DMLCheckList window = new DMLCheckList(0,0,0,eventobj);
					window.frmDmlCheckList.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	@SuppressWarnings("static-access")
	public DMLCheckList(int varDesigner,int varManager,int varplmSupportGroup,ExecutionEvent event1) 
	{
		this.flagDesigner    = varDesigner;
		this.flagManager     = varManager;
		this.plmSupportGroup = varplmSupportGroup;
		this.eventobj        = event1;
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void initialize() {
		frmDmlCheckList = new JFrame();
		frmDmlCheckList.setResizable(false);
		frmDmlCheckList.addWindowListener(new WindowAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void windowOpened(WindowEvent e) 
			{
				try
				{
					System.out.println(" ***************** Execution of DMLCheckList window started ***************** ");
					System.out.println(" - flagDesigner    = "+flagDesigner);
					System.out.println(" - flagManager     = "+flagManager);
					System.out.println(" - plmSupportGroup = "+plmSupportGroup);
					
					AbstractAIFUIApplication app = AIFUtility.getCurrentApplication();
					session = (TCSession) app.getSession();

					System.out.println("Session User:----------  " + session.getUser());
					System.out.println("***************************** 1");

					ISelection selection = HandlerUtil.getCurrentSelection(eventobj);

					System.out.println("***************************** 2");
					selectedobject = (AIFComponentContext) ((IStructuredSelection) selection).getFirstElement();					

					System.out.println("***************************** 3");
					selectedObj = (TCComponent) selectedobject.getComponent();

					System.out.println("***************************** 4");
					System.out.println("ID = " + selectedObj.toString());

					System.out.println("***************************** 5");
					System.out.println("TYPE = " + selectedObj.getType());
					
					objType=selectedObj.getType();
					
					itemId=selectedObj.getStringProperty("item_id");
					System.out.println(" - itemId = " + itemId);
					
					itemRevId = selectedObj.getStringProperty("item_revision_id");
					System.out.println(" - item_revision_id = "+itemRevId); 
					
					objDesc = selectedObj.getStringProperty("object_desc");
					System.out.println(" - objDesc = "+objDesc); 
					
					objStr = selectedObj.getStringProperty("object_string");
					System.out.println(" - objStr = "+objStr); 
					
					System.out.println(" - comboPropRealName = "+comboPropRealName.length);
					System.out.println(" - textPropRealName  = "+textPropRealName.length);
					
					
					if(objType.equals("ChangeRequestRevision")==true)
					{
						textField.setText(itemId);
						textPane.setText(objDesc);
						
						checkListAttached = selectedObj.getRelatedComponents("IMAN_manifestation");
						System.out.println(" - checkListAttached count = "+checkListAttached.length);
						
						// comboPropRealName Assignment	
																					
						
						// Execution of Condition where not checklist is available.
						if(checkListAttached.length == 0 )
						{
							if(plmSupportGroup == 1)
							{
								System.out.println("Group found is PLM_Support_Group So All Editing rights enabled ");
							}
							else
							{
								if(flagManager ==0 && flagDesigner == 1)
								{
									System.out.println(" ***************** Designer Execution started ***************** ");
																																				
									 comboBox_3.setEnabled(false); textField_3.setEditable(false);
									 comboBox_5.setEnabled(false); textField_5.setEditable(false);
									 comboBox_7.setEnabled(false); textField_7.setEditable(false);
									comboBox_11.setEnabled(false);textField_11.setEditable(false);
									comboBox_12.setEnabled(false);textField_12.setEditable(false);
									comboBox_13.setEnabled(false);textField_13.setEditable(false);
									comboBox_14.setEnabled(false);textField_14.setEditable(false);
									comboBox_17.setEnabled(false);textField_17.setEditable(false);
									comboBox_19.setEnabled(false);textField_19.setEditable(false);
									comboBox_20.setEnabled(false);textField_20.setEditable(false);
									comboBox_21.setEnabled(false);textField_21.setEditable(false);
									comboBox_22.setEnabled(false);textField_22.setEditable(false);
									comboBox_23.setEnabled(false);textField_23.setEditable(false);
									comboBox_24.setEnabled(false);textField_24.setEditable(false);
									comboBox_25.setEnabled(false);textField_25.setEditable(false);
									comboBox_32.setEnabled(false);textField_32.setEditable(false);
									comboBox_35.setEnabled(false);textField_35.setEditable(false);
									
									
									System.out.println(" ***************** Designer Execution Ended ***************** ");
									
								}
								if(flagDesigner == 0 && flagManager == 1)
								{
									System.out.println(" ***************** Manager Execution started ****************** ");						
								
									comboBox_1.setEnabled(false); textField_1.setEditable(false);
									comboBox_2.setEnabled(false); textField_2.setEditable(false);
									comboBox_4.setEnabled(false); textField_4.setEditable(false);
									comboBox_6.setEnabled(false); textField_6.setEditable(false);
									comboBox_8.setEnabled(false); textField_8.setEditable(false);
									comboBox_9.setEnabled(false); textField_9.setEditable(false);
									comboBox_15.setEnabled(false); textField_15.setEditable(false);
									comboBox_18.setEnabled(false); textField_18.setEditable(false);
									comboBox_28.setEnabled(false); textField_28.setEditable(false);
									comboBox_29.setEnabled(false); textField_29.setEditable(false);
									comboBox_30.setEnabled(false); textField_30.setEditable(false);
									comboBox_31.setEnabled(false); textField_31.setEditable(false);
									comboBox_33.setEnabled(false); textField_33.setEditable(false);
									comboBox_34.setEnabled(false); textField_34.setEditable(false);
									comboBox_36.setEnabled(false); textField_36.setEditable(false);
									comboBox_37.setEnabled(false); textField_37.setEditable(false);
									comboBox_38.setEnabled(false); textField_38.setEditable(false);
									comboBox_39.setEnabled(false); textField_39.setEditable(false);
									comboBox_40.setEnabled(false); textField_40.setEditable(false);
									comboBox_41.setEnabled(false); textField_41.setEditable(false);
									
									System.out.println(" ***************** Manager Execution Ended ****************** ");						
									
								}					
							}	
							formObj = (TCComponentFormType)session.getTypeComponent("Form");
							checkListObj = formObj.create(itemId, itemId, "T5_ERCDMLChecklist", true);
							checkListObj.save();
						}
						// Execution of condition where is checklist is available.
						else if(checkListAttached.length == 1)
						{							
							// Getting Properties from TCUA and setting in Checklist
							
							for(int i=0;i<41;i++)
							{
								comboInitialValue[i]      = checkListAttached[0].getStringProperty(comboPropRealName[i]);
								textFieldInitialvalue[i]  = checkListAttached[0].getStringProperty(textPropRealName[i]);							    
								System.out.println("Property Value in TC ["+(i+1)+"] = "+comboInitialValue[i]+"  "+comboInitialValue[i].length()+" "+textFieldInitialvalue[i]+" "+textFieldInitialvalue[i].length());														
							    
								textFieldArray[i].setText(textFieldInitialvalue[i]);
								
								for(int j=0;j<comBoxArray[i].getItemCount();j++)
								{
								    if(comboInitialValue[i].equals(comBoxArray[i].getItemAt(j).toString()))
								    {								       
								        comBoxArray[i].setSelectedIndex(j);
								    }
								}							
							}
																																									
							if(plmSupportGroup == 1)
							{
								System.out.println("Group found is PLM_Support_Group So All Editing rights enabled ");
							}
							else
							{																																
								if(flagManager ==0 && flagDesigner == 1)
								{
									System.out.println(" ***************** Designer Execution started ***************** ");
								
									 comboBox_3.setEnabled(false); textField_3.setEditable(false);
									 comboBox_5.setEnabled(false); textField_5.setEditable(false);
									 comboBox_7.setEnabled(false); textField_7.setEditable(false);
									comboBox_11.setEnabled(false);textField_11.setEditable(false);
									comboBox_12.setEnabled(false);textField_12.setEditable(false);
									comboBox_13.setEnabled(false);textField_13.setEditable(false);
									comboBox_14.setEnabled(false);textField_14.setEditable(false);
									comboBox_17.setEnabled(false);textField_17.setEditable(false);
									comboBox_19.setEnabled(false);textField_19.setEditable(false);
									comboBox_20.setEnabled(false);textField_20.setEditable(false);
									comboBox_21.setEnabled(false);textField_21.setEditable(false);
									comboBox_22.setEnabled(false);textField_22.setEditable(false);
									comboBox_23.setEnabled(false);textField_23.setEditable(false);
									comboBox_24.setEnabled(false);textField_24.setEditable(false);
									comboBox_25.setEnabled(false);textField_25.setEditable(false);
									comboBox_32.setEnabled(false);textField_32.setEditable(false);
									comboBox_35.setEnabled(false);textField_35.setEditable(false);
									
								         
									System.out.println(" ***************** Designer Execution Ended ***************** ");
								}
								if(flagDesigner == 0 && flagManager == 1)
								{
									System.out.println(" ***************** Manager Execution started ****************** ");	
									
									comboBox_1.setEnabled(false);   textField_1.setEditable(false);
									comboBox_2.setEnabled(false);   textField_2.setEditable(false);
									comboBox_4.setEnabled(false);   textField_4.setEditable(false);
									comboBox_6.setEnabled(false);   textField_6.setEditable(false);
									comboBox_8.setEnabled(false);   textField_8.setEditable(false);
									comboBox_9.setEnabled(false);   textField_9.setEditable(false);
									comboBox_15.setEnabled(false); textField_15.setEditable(false);
									comboBox_18.setEnabled(false); textField_18.setEditable(false);
									comboBox_28.setEnabled(false); textField_28.setEditable(false);
									comboBox_29.setEnabled(false); textField_29.setEditable(false);
									comboBox_30.setEnabled(false); textField_30.setEditable(false);
									comboBox_31.setEnabled(false); textField_31.setEditable(false);
									comboBox_33.setEnabled(false); textField_33.setEditable(false);
									comboBox_34.setEnabled(false); textField_34.setEditable(false);
									comboBox_36.setEnabled(false); textField_36.setEditable(false);
									comboBox_37.setEnabled(false); textField_37.setEditable(false);
									comboBox_38.setEnabled(false); textField_38.setEditable(false);
									comboBox_39.setEnabled(false); textField_39.setEditable(false);
									comboBox_40.setEnabled(false); textField_40.setEditable(false);
									comboBox_41.setEnabled(false); textField_41.setEditable(false);

									
									System.out.println(" ***************** Manager Execution started ****************** ");
								}					
							}	
							
						}
						// Execution of condition where is checklist found more than one.
						else
						{
							System.out.println("Checklist Count is more than one so Execution stopped ");
							JOptionPane.showMessageDialog(null, "CheckList found are more the one.Please connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
							frmDmlCheckList.dispose();
						}																																										
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Selected object is not of type DML Revision. Please select a valid object or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
						frmDmlCheckList.setVisible(false);
						frmDmlCheckList.dispose();
					}													
					System.out.println(" ***************** Execution of DMLCheckList window Ended   ***************** ");	
					
				}
				catch (TCException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
					System.out.println(" ************ TC Exception occured while getting selected object Point [1] ************");
					JOptionPane.showMessageDialog(null, "Error in getting target Object. Please select a valid object or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
					frmDmlCheckList.dispose();
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
					System.out.println(" ************ Exception occured while getting selected object Point [1]************ ");
					JOptionPane.showMessageDialog(null, "Error in getting target Object. Please select a valid object or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
					frmDmlCheckList.dispose();
				}	
				
			}
		});
		frmDmlCheckList.setTitle("DML Check List");
		frmDmlCheckList.getContentPane().setBackground(Color.WHITE);
		frmDmlCheckList.setBounds(100, 100, 950, 575);
		frmDmlCheckList.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmDmlCheckList.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 934, 94);
		frmDmlCheckList.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("DML No :");
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel.setBounds(10, 10, 86, 22);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(new LineBorder(new Color(171, 173, 179)));
		textField.setBackground(Color.WHITE);
		textField.setBounds(106, 10, 225, 20);
		panel.add(textField);
		
		JLabel lblDescription = new JLabel("Description :");
		lblDescription.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		lblDescription.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblDescription.setBounds(10, 40, 86, 22);
		panel.add(lblDescription);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(106, 40, 675, 45);
		panel.add(scrollPane_1);
		
		textPane = new JTextPane();
		textPane.setEditable(false);
		scrollPane_1.setViewportView(textPane);
		textPane.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		textPane.setBorder(new LineBorder(Color.LIGHT_GRAY));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(0, 98, 935, 370);
		frmDmlCheckList.getContentPane().add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setBorder(null);
		panel_1.setBackground(Color.WHITE);
		
		JLabel Heading_1 = new JLabel("DFMEA COMPLIANCE DETAILS");
		Heading_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Heading_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		Heading_1.setBackground(Color.WHITE);
		
		
		lblIsThe.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblIsThe.setBorder(null);
		comboBox_1.setToolTipText("Mandatory Property to be selected by Analyst.");
		comboBox_1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				System.out.println(" ******* -actionComboPerform    = "+actionComboPerform);
				if(actionComboPerform > -1)
				{
					if(flagDesigner == 1)
			        {
			            System.out.println("**************** Action Performed in ComboBox for designer started ****************** ");
			            try
			        	{
			        	    String t5dmlReason = selectedObj.getTCProperty("t5_reason").getDisplayableValue();
							String comboSelection = comboBox_1.getSelectedItem().toString();
							
			        		System.out.println(" ******* -t5dmlReason    = "+t5dmlReason);
							System.out.println(" ******* -comboSelection = "+comboSelection);
			        		if (t5dmlReason.equalsIgnoreCase("END CUSTOMER/FIELD COMPLAINTS & SERVICE FEEDBACK/CCT")==true || t5dmlReason.equalsIgnoreCase("CM")==true)
                            {
                              if(comboSelection.equals("Y")==true)
							  {
								  designerComboPass = 1;
							  }
							  else
							  {
								  System.out.println("As Reason of DML is :: " + t5dmlReason + " we are setting Root Cause to yes \n ");                       
                                  JOptionPane.showMessageDialog(null, "Error : As Reason of DML is : " + t5dmlReason + " , Root Cause Must be Y ","Error",JOptionPane.ERROR_MESSAGE);						  
                                  comboBox_1.setSelectedIndex(1);
							  }
                            }
							else
							{
								designerComboPass = 1;
							}
							
							System.out.println(" -designerComboPass [final] = "+designerComboPass);
			        	}
			        	catch(TCException e1)
			        	{
			        		e1.printStackTrace();
			        		System.out.println(" TC Execption Occured while performing action on comboBox_1 ");
			        		JOptionPane.showMessageDialog(null, "Error in updating properties please try again or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
			        		frmDmlCheckList.dispose();	
			        	}
			        	catch(Exception e1)
			        	{
			        		e1.printStackTrace();
			        		System.out.println(" General Execption Occured while performing action on comboBox_1 ");
			        		JOptionPane.showMessageDialog(null, "Error in updating properties please try again or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
			        		frmDmlCheckList.dispose();
			        	}
                        System.out.println("**************** Action Performed in ComboBox for designer Ended ****************** ");					
			        }
				}
				actionComboPerform++;
			}
		});
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"","*", "Y", "N"}));
		
		
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setColumns(10);
		
		
		lblIsThe_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblIsThe_1.setBorder(null);
		comboBox_2.setToolTipText("Mandatory Property to be selected by Analyst.");
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"","*", "Y", "N"}));
		
		
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setColumns(10);
		
		
		Label_3.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_3.setBorder(null);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_3.setColumns(10);
		
		
		Label_4.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_4.setBorder(null);
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_4.setColumns(10);
		
		
		Label_5.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_5.setBorder(null);
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_5.setColumns(10);
		
		
		Label_6.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_6.setBorder(null);
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_6.setColumns(10);
		
		JLabel Heading_2 = new JLabel("DESIGN REVIEW");
		Heading_2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Heading_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		
		Label_7.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_7.setBorder(null);
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_7.setColumns(10);
		
		
		Label_8.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_8.setBorder(null);
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_8.setColumns(10);
		
		
		Label_9.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_9.setBorder(null);
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_9.setColumns(10);
		
		
		Label_10.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_10.setBorder(null);
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_10.setColumns(10);
		
		
		Label_11.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_11.setBorder(null);
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_11.setColumns(10);
		
		JLabel Heading_3 = new JLabel("DML HEADER ENTRY");
		Heading_3.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Heading_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		
		Label_12.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_12.setBorder(null);
		comboBox_12.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_12.setColumns(10);
		
		
		Label_13.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_13.setBorder(null);
		comboBox_13.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_13.setColumns(10);
		
		
		Label_14.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_14.setBorder(null);
		comboBox_14.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_14.setColumns(10);
		
		JLabel Heading_4 = new JLabel("PART DETAILS ENTRY");
		Heading_4.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Heading_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		
		Label_15.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_15.setBorder(null);
		comboBox_15.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_15.setColumns(10);
		
		
		Label_16.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_16.setBorder(null);
		comboBox_16.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_16.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_16.setColumns(10);
		
		
		Label_17.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_17.setBorder(null);
		comboBox_17.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_17.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_17.setColumns(10);
		
		
		lblIsThe_2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblIsThe_2.setBorder(null);
		comboBox_18.setToolTipText("Mandatory Property to be selected by Analyst.");
		comboBox_18.setModel(new DefaultComboBoxModel(new String[] {"","*", "Y", "N"}));
		
		
		comboBox_18.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_18.setColumns(10);
		
		
		Label_19.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_19.setBorder(null);
		comboBox_19.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_19.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_19.setColumns(10);
		
		
		Label_20.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_20.setBorder(null);
		comboBox_20.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_20.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_20.setColumns(10);
		
		
		Label_21.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_21.setBorder(null);
		comboBox_21.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_21.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_21 = new JTextField();
		textField_21.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_21.setColumns(10);
		
		
		Label_22.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_22.setBorder(null);
		comboBox_22.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_22.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_22 = new JTextField();
		textField_22.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_22.setColumns(10);
		
		
		Label_23.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_23.setBorder(null);
		comboBox_23.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_23.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_23 = new JTextField();
		textField_23.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_23.setColumns(10);
		
		
		Label_24.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_24.setBorder(null);
		comboBox_24.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_24.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_24 = new JTextField();
		textField_24.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_24.setColumns(10);
		
		
		Label_25.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_25.setBorder(null);
		comboBox_25.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_25.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_25 = new JTextField();
		textField_25.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_25.setColumns(10);
		
		
		Label_26.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_26.setBorder(null);
		comboBox_26.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_26.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_26 = new JTextField();
		textField_26.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_26.setColumns(10);
		
		
		Label_27.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_27.setBorder(null);
		comboBox_27.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_27.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_27 = new JTextField();
		textField_27.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_27.setColumns(10);
		
		JLabel Heading_5 = new JLabel("DRAWING MODIFICATION DETAILS");
		Heading_5.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Heading_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		comboBox_28.setToolTipText("Mandatory Property to be selected by Analyst.");
		comboBox_28.setModel(new DefaultComboBoxModel(new String[] {"","*", "Y", "N"}));
		
		
		comboBox_28.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JTextPane Label_28 = new JTextPane();
		Label_28.setText(" 28.) Is the appropriate classification && identification of special  characteristics as per TS 11413 done on the drawing  and the other related documents ? *");
		Label_28.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_28.setEditable(false);
		Label_28.setBorder(null);
		
		textField_28 = new JTextField();
		textField_28.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_28.setColumns(10);
		
		
		lblAreThe.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblAreThe.setBorder(null);
		comboBox_29.setToolTipText("Mandatory Property to be selected by Analyst.");
		comboBox_29.setModel(new DefaultComboBoxModel(new String[] {"","*", "Y", "N"}));
		
		
		comboBox_29.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_29 = new JTextField();
		textField_29.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_29.setColumns(10);
		
		
		lblIsThe_3.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblIsThe_3.setBorder(null);
		comboBox_30.setToolTipText("Mandatory Property to be selected by Analyst.");
		comboBox_30.setModel(new DefaultComboBoxModel(new String[] {"","*", "Y", "N"}));	
		
		comboBox_30.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_30 = new JTextField();
		textField_30.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_30.setColumns(10);	
		
		Label_31.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_31.setBorder(null);
		comboBox_31.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		comboBox_31.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_31 = new JTextField();
		textField_31.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_31.setColumns(10);
			
		Label_32.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_32.setBorder(null);
		comboBox_32.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
			
		comboBox_32.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_32 = new JTextField();
		textField_32.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_32.setColumns(10);
			
		Label_33.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_33.setBorder(null);
		comboBox_33.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
			
		comboBox_33.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_33 = new JTextField();
		textField_33.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_33.setColumns(10);
				
		Label_34.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_34.setBorder(null);
		comboBox_34.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
		
		
		comboBox_34.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_34 = new JTextField();
		textField_34.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_34.setColumns(10);
		
		JLabel Heading_6 = new JLabel("DML STRUCTURE ENTRY");
		Heading_6.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Heading_6.setBorder(new LineBorder(new Color(0, 0, 0)));
				
		Label_35.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_35.setBorder(null);
		comboBox_35.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
			
		comboBox_35.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_35 = new JTextField();
		textField_35.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_35.setColumns(10);
				
		Label_36.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_36.setBorder(null);
		comboBox_36.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
				
		comboBox_36.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_36 = new JTextField();
		textField_36.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_36.setColumns(10);
		
		
		Label_37.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_37.setBorder(null);
		comboBox_37.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
				
		comboBox_37.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_37 = new JTextField();
		textField_37.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_37.setColumns(10);
		
		
		Label_38.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_38.setBorder(null);
		comboBox_38.setModel(new DefaultComboBoxModel(new String[] {"NULL", "Y", "N"}));
		
		
		comboBox_38.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_38 = new JTextField();
		textField_38.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_38.setColumns(10);
				
		Label_39.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_39.setBorder(null);
		comboBox_39.setModel(new DefaultComboBoxModel(new String[] {"*", "Y", "N"}));
				
		comboBox_39.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_39 = new JTextField();
		textField_39.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_39.setColumns(10);
				
		Label_40.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Label_40.setBorder(null);
		comboBox_40.setModel(new DefaultComboBoxModel(new String[] {"NULL", "Y", "N"}));
				
		comboBox_40.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_40 = new JTextField();
		textField_40.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_40.setColumns(10);
				
		lblHasThe.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblHasThe.setBorder(null);
		comboBox_41.setToolTipText("Mandatory Property to be selected by Analyst.");
		comboBox_41.setModel(new DefaultComboBoxModel(new String[] {"","Y", "N", "NA"}));
		
		
		comboBox_41.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textField_41 = new JTextField();
		textField_41.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_41.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1147, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(530)
					.addComponent(Heading_1, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lblIsThe, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lblIsThe_1, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_3, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_4, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_5, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_6, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(530)
					.addComponent(Heading_2, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_7, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(comboBox_7, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_8, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(comboBox_8, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_9, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox_9, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_10, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(comboBox_10, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_11, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox_11, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(530)
					.addComponent(Heading_3, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_12, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox_12, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_13, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox_13, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_14, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox_14, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(530)
					.addComponent(Heading_4, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_15, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox_15, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_16, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(comboBox_16, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_17, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox_17, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lblIsThe_2, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox_18, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_19, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(comboBox_19, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_20, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(comboBox_20, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_21, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox_21, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_22, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox_22, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_23, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(comboBox_23, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_24, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(comboBox_24, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_25, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(comboBox_25, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_26, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(comboBox_26, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_27, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(comboBox_27, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(530)
							.addComponent(Heading_5, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(716)
							.addComponent(comboBox_28, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE))
						.addComponent(Label_28, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addComponent(textField_28, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lblAreThe, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(comboBox_29, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_29, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lblIsThe_3, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(comboBox_30, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_30, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_31, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox_31, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_31, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_32, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(comboBox_32, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_33, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox_33, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_34, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox_34, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_34, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(530)
					.addComponent(Heading_6, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_35, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(comboBox_35, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_35, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_36, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox_36, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_36, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_37, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(comboBox_37, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_37, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_38, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(comboBox_38, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_38, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_39, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(7)
					.addComponent(comboBox_39, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_39, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(Label_40, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(comboBox_40, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_40, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lblHasThe, GroupLayout.PREFERRED_SIZE, 707, GroupLayout.PREFERRED_SIZE)
					.addGap(9)
					.addComponent(comboBox_41, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(textField_41, GroupLayout.PREFERRED_SIZE, 364, GroupLayout.PREFERRED_SIZE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1132, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(10)
					.addComponent(Heading_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(3)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(lblIsThe, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(4)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(lblIsThe_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(4)
					.addComponent(Heading_2)
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_9, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_9, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_10, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_10, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_11, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_11, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addComponent(Heading_3)
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_12, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_12, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addComponent(Heading_4)
					.addGap(3)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_15, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_15, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_16, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_16, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_16, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_17, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_17, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_17, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(lblIsThe_2, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_18, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_18, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_19, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_19, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_19, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_20, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_20, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_20, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_21, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_21, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_21, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_22, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_22, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_22, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_23, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_23, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_24, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_24, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_25, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_25, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_26, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_26, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_27, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_27, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(25)
							.addComponent(Heading_5))
						.addComponent(comboBox_28, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(Label_28, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_28, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(lblAreThe, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_29, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_29, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(lblIsThe_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_30, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_30, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_31, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_31, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_31, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_32, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_32, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_32, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_33, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_33, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_33, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_34, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_34, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_34, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addComponent(Heading_6)
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_35, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_35, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_35, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_36, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_36, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_36, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_37, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_37, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_37, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_38, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_38, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_38, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(3)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_39, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_39, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_39, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(Label_40, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addComponent(comboBox_40, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_40, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(2)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(lblHasThe))
						.addComponent(comboBox_41, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(1)
							.addComponent(textField_41, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)))
					.addGap(23))
		);
		panel_1.setLayout(gl_panel_1);
									
		comBoxArray[0] =comboBox_1;comBoxArray[1]=comboBox_2;comBoxArray[2]=comboBox_3;comBoxArray[3]=comboBox_4;comBoxArray[4]=comboBox_5;
		comBoxArray[5]=comboBox_6;comBoxArray[6]=comboBox_7;comBoxArray[7]=comboBox_8;comBoxArray[8]=comboBox_9;comBoxArray[9]=comboBox_10;
		comBoxArray[10]=comboBox_11;comBoxArray[11]=comboBox_12;comBoxArray[12]=comboBox_13;comBoxArray[13]=comboBox_14;comBoxArray[14]=comboBox_15;
	    comBoxArray[15]=comboBox_16;comBoxArray[16]=comboBox_17;comBoxArray[17]=comboBox_18;comBoxArray[18]=comboBox_19;comBoxArray[19]=comboBox_20;		
	    comBoxArray[20]=comboBox_21;comBoxArray[21]=comboBox_22;comBoxArray[22]=comboBox_23;comBoxArray[23]=comboBox_24;comBoxArray[24]=comboBox_25;
	    comBoxArray[25]=comboBox_26;comBoxArray[26]=comboBox_27;comBoxArray[27]=comboBox_28;comBoxArray[28]=comboBox_29;comBoxArray[29] = comboBox_30;
	    comBoxArray[30]=comboBox_31;comBoxArray[31]=comboBox_32;comBoxArray[32]=comboBox_33;comBoxArray[33]=comboBox_34;comBoxArray[34]=comboBox_35;
	    comBoxArray[35]=comboBox_36;comBoxArray[36]=comboBox_37;comBoxArray[37]=comboBox_38;comBoxArray[38] = comboBox_39;comBoxArray[39]=comboBox_40;
	    comBoxArray[40]=comboBox_41;
		
	    textFieldArray[0]  =   textField_1;textFieldArray[1] =   textField_2;textFieldArray[2] =   textField_3;textFieldArray[3] =    textField_4;textFieldArray[4] = textField_5;
	    textFieldArray[5]  =   textField_6;textFieldArray[6] =   textField_7;textFieldArray[7] =   textField_8;textFieldArray[8] =   textField_9;textFieldArray[9] = textField_10;
	    textFieldArray[10] = textField_11;textFieldArray[11] = textField_12;textFieldArray[12] = textField_13;textFieldArray[13] = textField_14;textFieldArray[14] = textField_15;
	    textFieldArray[15] = textField_16;textFieldArray[16] = textField_17;textFieldArray[17] = textField_18;textFieldArray[18] = textField_19;textFieldArray[19] = textField_20;
	    textFieldArray[20] = textField_21;textFieldArray[21] = textField_22;textFieldArray[22] = textField_23;textFieldArray[23] = textField_24;textFieldArray[24] = textField_25;
	    textFieldArray[25] = textField_26;textFieldArray[26] = textField_27;textFieldArray[27] = textField_28;textFieldArray[28] = textField_29;textFieldArray[29] = textField_30;
	    textFieldArray[30] = textField_31;textFieldArray[31] = textField_32;textFieldArray[32] = textField_33;textFieldArray[33] = textField_34;textFieldArray[34] = textField_35;
	    textFieldArray[35] = textField_36;textFieldArray[36] = textField_37;textFieldArray[37] = textField_38;textFieldArray[38] = textField_39;textFieldArray[39] = textField_40;
	    textFieldArray[40] = textField_41;
		
		
		JButton btnOkButton = new JButton("Apply & Save");
		btnOkButton.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void mouseClicked(MouseEvent e) 
			{ 
				System.out.println(" ****************** Execution of OK button started ****************** ");	
				System.out.print(" - checkListAttached = "+checkListAttached.length);
				try
				{
					if(checkListAttached.length == 0)
					{
						System.out.println(" ****************** Executing If condition where checkListAttached.length == 0 ****************** ");	
						if(plmSupportGroup == 1)
						{
							System.out.println("******** Ok with PLM_Support Executed *************** ");
							try
							{								
								for(int i=0;i<41;i++)
								{
									comboFinalValue[i]     =  comBoxArray[i].getSelectedItem().toString();
									finalTextFieldValue[i] =  textFieldArray[i].getText();
									
									checkListObj.setStringProperty(comboPropRealName[i], comboFinalValue[i]);
									checkListObj.setStringProperty(textPropRealName[i],  finalTextFieldValue[i]);				
									
								}
								selectedObj.add("IMAN_manifestation", checkListObj);
								
								System.out.println(" **************************** Property Updation successfully Ended ******************************************** ");
		   					    JOptionPane.showMessageDialog(null,"Checklist has been created/updated under the Manifestations relation in the DML. Please refresh the DML.","Info",JOptionPane.INFORMATION_MESSAGE);
								frmDmlCheckList.dispose();
							}
							catch(TCException e1)
							{
								e1.printStackTrace();
								System.out.println(" TC Execption Occured while Updating Property with PLM_support ");
								JOptionPane.showMessageDialog(null, "Error in updating properties please try again or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
								frmDmlCheckList.dispose();
								
							}
							catch(Exception e1)
							{
								e1.printStackTrace();
								System.out.println(" General Execption Occured while Updating Property with PLM_support ");
								JOptionPane.showMessageDialog(null, "Error in updating properties please try again or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
								frmDmlCheckList.dispose();
							}								
						}
						else
						{
							if(flagManager ==0 && flagDesigner == 1)
							{
								System.out.println("******** Ok with Designer (Analyst) Executed *************** ");
								try
								{
									designerMandatoryField = 0;
									designerFinalPass      = 0;
									
									int temp1 = 0; 
								    for(int i=0;i<7;i++)
								    {
								    	temp1 = designerMandatory[i];
								    	System.out.println(" -temp1  = "+temp1);
								    	
								    	if(comBoxArray[temp1].getSelectedItem().toString()=="")
								    	{
								    		designerMandatoryField++;
								    	}
								    }
									System.out.println(" -designerMandatoryField [Found] = "+designerMandatoryField);
								    if(designerMandatoryField > 0)
								    {
								    	System.out.println("All mandatory field not found for Designer. Please fill required field and Submit");
										JOptionPane.showMessageDialog(null, "All Designer questions are to be answered. Kindly select appropriate option from drop down menu. Also, fill up remarks wherever necessary.","Error",JOptionPane.ERROR_MESSAGE);
								    }
								    else
								    {
								    	System.out.println(" -designerComboPass = "+designerComboPass);
								    	if(designerComboPass == 1)
										{
											designNovelCheck = comBoxArray[37].getSelectedItem().toString();
										    System.out.println(" - designNovelCheck [Found] = "+designNovelCheck);
										    if(designNovelCheck.equals("NULL"))
										    {
										    	JOptionPane.showMessageDialog(null, "Design Novel should not be NULL.Please select Y or N.","Error",JOptionPane.ERROR_MESSAGE);
										    }
										    else
										    {
										    	if(designNovelCheck.equals("Y"))
										    	{
										    		designProtect =  comBoxArray[38].getSelectedItem().toString();
										    		System.out.println(" - designProtect = "+designProtect);
										    		if(designProtect.equals("*"))
										    		{
										    			JOptionPane.showMessageDialog(null, "If Design Novel =  Y then Is Design Protected cannot be * .","Error",JOptionPane.ERROR_MESSAGE);
										    		}
													else
													{
														designerFinalPass = 1;
													}
										    	}
										    	if(designNovelCheck.equals("N"))
										    	{
										    		designProtectInit = comBoxArray[39].getSelectedItem().toString();
										    		System.out.println(" - designProtectInit = "+designProtectInit);
										    		if(designProtectInit.equals("NULL"))
										    		{
										    			JOptionPane.showMessageDialog(null, "If Design Novel =  N then Is Design Protection Initiated cannot be NULL. ","Error",JOptionPane.ERROR_MESSAGE);
										    		}
													else
													{
														designerFinalPass = 1;
													}											
										    	}
										    	if(designNovelCheck.equals("*"))
										    	{
										    		designerFinalPass = 1;
										    		
										    	}
										    }
											System.out.println(" - designerFinalPass [Final] = "+designerFinalPass);
											if(designerFinalPass == 1)
											{
												for(int i=0;i<41;i++)
								                {
								                	comboFinalValue[i]     =  comBoxArray[i].getSelectedItem().toString();
								                	finalTextFieldValue[i] =  textFieldArray[i].getText();
								                	
								                	checkListObj.setStringProperty(comboPropRealName[i], comboFinalValue[i]);
								                	checkListObj.setStringProperty(textPropRealName[i],  finalTextFieldValue[i]);				
								                	
								                }
								                selectedObj.add("IMAN_manifestation", checkListObj);
								                
								                System.out.println(" **************************** Property Updation successfully Ended ******************************************** ");
		   					                    JOptionPane.showMessageDialog(null,"Checklist has been created/updated under the Manifestations relation in the DML. Please refresh the DML.","Info",JOptionPane.INFORMATION_MESSAGE);
								                frmDmlCheckList.dispose();
											}
										}
										else
										{
											System.out.println("Error : -designerComboPass value not found Proper.");
										}
								    }
								}
								catch(TCException e1)
								{
									e1.printStackTrace();
									System.out.println(" TC Execption Occured while Updating Property with Designer  ");
									JOptionPane.showMessageDialog(null, "Error in updating properties please try again or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
									frmDmlCheckList.dispose();
									
								}
								catch(Exception e1)
								{
									e1.printStackTrace();
									System.out.println(" General Execption Occured while Updating Property with Designer  ");
									JOptionPane.showMessageDialog(null, "Error in updating properties please try again or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
									frmDmlCheckList.dispose();
								}
								System.out.println("******** Ok with Designer (Analyst) Ended *************** ");
							}
							if(flagDesigner == 0 && flagManager == 1)
							{
		                        System.out.println("******** Ok with Manager Executed *************** ");
		                        try
							    {								
							    	for(int i=0;i<41;i++)
							    	{
							    		comboFinalValue[i]     =  comBoxArray[i].getSelectedItem().toString();
							    		finalTextFieldValue[i] =  textFieldArray[i].getText();
							    		
							    		checkListObj.setStringProperty(comboPropRealName[i], comboFinalValue[i]);
							    		checkListObj.setStringProperty(textPropRealName[i],  finalTextFieldValue[i]);				
							    		
							    	}
							    	selectedObj.add("IMAN_manifestation", checkListObj);
							    	
							    	System.out.println(" **************************** Property Updation successfully Ended ******************************************** ");
		   					        JOptionPane.showMessageDialog(null,"Checklist has been created/updated under the Manifestations relation in the DML. Please refresh the DML.","Info",JOptionPane.INFORMATION_MESSAGE);
							    	frmDmlCheckList.dispose();
							    }
							    catch(TCException e1)
							    {
							    	e1.printStackTrace();
							    	System.out.println(" TC Execption Occured while Updating Property with Manager ");
							    	JOptionPane.showMessageDialog(null, "Error in updating properties please try again or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
							    	frmDmlCheckList.dispose();
							    	
							    }
							    catch(Exception e1)
							    {
							    	e1.printStackTrace();
							    	System.out.println(" General Execption Occured while Updating Property with Manager ");
							    	JOptionPane.showMessageDialog(null, "Error in updating properties please try again or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
							    	frmDmlCheckList.dispose();
							    }				      								
								System.out.println("******** Ok with Manager Ended *************** ");
							}
						}
					}
					else
					{
						System.out.println(" ****************** Executing Else condition where checkListAttached.length == 1 ****************** ");	
						if(plmSupportGroup == 1)
						{
							System.out.println("******** Ok with PLM_Support Executed *************** ");						
							try 
							{
								for(int i=0;i<41;i++)
								{
									comboFinalValue[i]     =  comBoxArray[i].getSelectedItem().toString();
									finalTextFieldValue[i] =  textFieldArray[i].getText();
									
									if(comboInitialValue[i].equals(comboFinalValue[i]) == false)
									{
										System.out.println(" ***** ComboInitaial = "+comboInitialValue[i] +" ****** ComboFinal = " + comboFinalValue[i]);
										checkListAttached[0].setStringProperty(comboPropRealName[i], comboFinalValue[i]);
									}
									if(textFieldInitialvalue[i].equals(finalTextFieldValue[i]) == false)
									{
										System.out.println(" ***** textField Inital = "+textFieldInitialvalue[i]+" ***** textField Final = "+finalTextFieldValue[i]);
										checkListAttached[0].setStringProperty(textPropRealName[i], finalTextFieldValue[i]);							
									}
								}
								System.out.println(" **************************** Property Updation successfully Ended ******************************************** ");
		   					    JOptionPane.showMessageDialog(null,"Checklist has been created/updated under the Manifestations relation in the DML. Please refresh the DML.","Info",JOptionPane.INFORMATION_MESSAGE);
								frmDmlCheckList.dispose();
							}
							catch(TCException e1)
							{
								e1.printStackTrace();
								System.out.println(" TC Execption Occured while Updating Property with PLM_support ");
								JOptionPane.showMessageDialog(null, "Error in updating properties please try again or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
								frmDmlCheckList.dispose();
								
							}
							catch(Exception e1)
							{
								e1.printStackTrace();
								System.out.println(" General Execption Occured while Updating Property with PLM_support ");
								JOptionPane.showMessageDialog(null, "Error in updating properties please try again or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
								frmDmlCheckList.dispose();
							}				
							System.out.println("******** Ok with PLM_Support Ended *************** ");
						}
						else
						{
							if(flagManager ==0 && flagDesigner == 1)
							{
								System.out.println("******** Ok with Designer (Analyst) Executed *************** ");
								
								try 
								{
									for(int i=0;i<41;i++)
									{
										comboFinalValue[i]     =  comBoxArray[i].getSelectedItem().toString();
										finalTextFieldValue[i] =  textFieldArray[i].getText();
										
										if(comboInitialValue[i].equals(comboFinalValue[i]) == false)
										{
											System.out.println(" ***** ComboInitaial = "+comboInitialValue[i] +" ****** ComboFinal = " + comboFinalValue[i]);
											checkListAttached[0].setStringProperty(comboPropRealName[i], comboFinalValue[i]);
										}
										if(textFieldInitialvalue[i].equals(finalTextFieldValue[i]) == false)
										{
											System.out.println(" ***** textField Inital = "+textFieldInitialvalue[i]+" ***** textField Final = "+finalTextFieldValue[i]);
											checkListAttached[0].setStringProperty(textPropRealName[i], finalTextFieldValue[i]);							
										}
									}
									System.out.println(" **************************** Property Updation successfully Ended ******************************************** ");
			   					    JOptionPane.showMessageDialog(null,"Checklist has been created/updated under the Manifestations relation in the DML. Please refresh the DML.","Info",JOptionPane.INFORMATION_MESSAGE);
									frmDmlCheckList.dispose();
								}
								catch(TCException e1)
								{
									e1.printStackTrace();
									System.out.println(" TC Execption Occured while Updating Property with Designer  ");
									JOptionPane.showMessageDialog(null, "Error in updating properties please try again or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
									frmDmlCheckList.dispose();
									
								}
								catch(Exception e1)
								{
									e1.printStackTrace();
									System.out.println(" General Execption Occured while Updating Property with Designer  ");
									JOptionPane.showMessageDialog(null, "Error in updating properties please try again or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
									frmDmlCheckList.dispose();
								}
								
								System.out.println("******** Ok with Designer (Analyst) Ended *************** ");
							}
							if(flagDesigner == 0 && flagManager == 1)
							{
		                        System.out.println("******** Ok with Manager Executed *************** ");
		                        try 
								{
									for(int i=0;i<41;i++)
									{
										comboFinalValue[i]     =  comBoxArray[i].getSelectedItem().toString();
										finalTextFieldValue[i] =  textFieldArray[i].getText();
										
										if(comboInitialValue[i].equals(comboFinalValue[i]) == false)
										{
											System.out.println(" ***** ComboInitaial = "+comboInitialValue[i] +" ****** ComboFinal = " + comboFinalValue[i]);
											checkListAttached[0].setStringProperty(comboPropRealName[i], comboFinalValue[i]);
										}
										if(textFieldInitialvalue[i].equals(finalTextFieldValue[i]) == false)
										{
											System.out.println(" ***** textField Inital = "+textFieldInitialvalue[i]+" ***** textField Final = "+finalTextFieldValue[i]);
											checkListAttached[0].setStringProperty(textPropRealName[i], finalTextFieldValue[i]);							
										}
									}
									System.out.println(" **************************** Property Updation successfully Ended ******************************************** ");
			   					    JOptionPane.showMessageDialog(null,"Checklist has been created/updated under the Manifestations relation in the DML. Please refresh the DML.","Info",JOptionPane.INFORMATION_MESSAGE);
									frmDmlCheckList.dispose();
								}
								catch(TCException e1)
								{
									e1.printStackTrace();
									System.out.println(" TC Execption Occured while Updating Property with Manager ");
									JOptionPane.showMessageDialog(null, "Error in updating properties please try again or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
									frmDmlCheckList.dispose();
									
								}
								catch(Exception e1)
								{
									e1.printStackTrace();
									System.out.println(" General Execption Occured while Updating Property with Manager ");
									JOptionPane.showMessageDialog(null, "Error in updating properties please try again or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
									frmDmlCheckList.dispose();
								}						                        								
								System.out.println("******** Ok with Manager Ended *************** ");
							}
						}
					}
				}				
				catch(Exception e1)
				{
					e1.printStackTrace();
					System.out.println(" ************ Exception occured while updating Properties Point [2]************ ");
					JOptionPane.showMessageDialog(null, "Error in updating properties please try again or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
					frmDmlCheckList.dispose();
				}	
				
				System.out.println(" ****************** Execution of OK button Ended ****************** ");								
			}
		});
		btnOkButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnOkButton.setBounds(542, 489, 125, 23);
		frmDmlCheckList.getContentPane().add(btnOkButton);
		
		JButton btnCancelButton = new JButton("Cancel");
		btnCancelButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				frmDmlCheckList.dispose();
			}
		});
		btnCancelButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCancelButton.setBounds(781, 490, 89, 23);
		frmDmlCheckList.getContentPane().add(btnCancelButton);
	}
}