package com.teamcenter.rac.tml.ui.handlers;

import java.io.*; 
import java.util.*;
import java.lang.*;
import java.awt.EventQueue;

import javax.swing.JFrame;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.handlers.HandlerUtil;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultComboBoxModel;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import com.t5.services.rac.tmshellexecution.T5LinuxShellManagementService;
import com.teamcenter.rac.aif.AbstractAIFUIApplication;
import com.teamcenter.rac.aif.kernel.AIFComponentContext;
import com.teamcenter.rac.aifrcp.AIFUtility;
import com.teamcenter.rac.kernel.ListOfValuesInfo;
import com.teamcenter.rac.kernel.TCComponent;
import com.teamcenter.rac.kernel.TCComponentItem;
import com.teamcenter.rac.kernel.TCComponentItemRevision;
import com.teamcenter.rac.kernel.TCComponentListOfValues;
import com.teamcenter.rac.kernel.TCComponentListOfValuesType;
import com.teamcenter.rac.kernel.TCComponentQuery;
import com.teamcenter.rac.kernel.TCComponentQueryType;
import com.teamcenter.rac.kernel.TCException;
import com.teamcenter.rac.kernel.TCSession;
import com.teamcenter.services.rac.core.DataManagementService;
import com.teamcenter.services.rac.core.DataManagementService;
import com.teamcenter.services.rac.core._2008_06.DataManagement;
import com.teamcenter.services.loose.core._2008_06.DataManagement.CreateIn;
import com.teamcenter.services.loose.core._2008_06.DataManagement.CreateInput;
import com.teamcenter.services.loose.core._2008_06.DataManagement.CreateResponse;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("unused")
public class non_cad_dml_attributes_shell {

	public JFrame frmDmlPropertyUpdation;
	static ExecutionEvent eventobj;
	JLabel lblR = new JLabel("Release Letter Ref");
	JLabel lblEcuMintId = new JLabel("ECU Mint ID");
	JLabel lblProposedSolution = new JLabel("Proposed Solution");
	JLabel lblReleaseLetterNotes = new JLabel("Release Letter Notes");
	JLabel lblSynopsis = new JLabel("Synopsis");
	JLabel lblCopiesTo = new JLabel("Copies To");
	JLabel lblDescription = new JLabel("Description");
	JLabel lblReasonDescription = new JLabel("Reason Description");
	JLabel lblRequestionAgency = new JLabel("Requestion Agency");
	JLabel lblPriority = new JLabel("Priority");
	JLabel lblDrStatus = new JLabel("DR Status");
	JLabel lblDmlReason = new JLabel("DML Reason");
	JLabel lblNewLabel = new JLabel("");
	JLabel lblNewLabel_1 = new JLabel("");
	
	JButton btnNewButton = new JButton("Apply & Save");
	JButton btnNewButton_1 = new JButton("Cancel");
	
	JTextField textField;
	JTextField textField_1;
	JTextField textField_2;
	
	@SuppressWarnings("rawtypes")
	JComboBox comboBox = new JComboBox();
	@SuppressWarnings("rawtypes")
	JComboBox comboBox_1 = new JComboBox();
	@SuppressWarnings("rawtypes")
	JComboBox comboBox_2 = new JComboBox();
	@SuppressWarnings("rawtypes")
	JComboBox comboBox_3 = new JComboBox();
	JScrollPane scrollPane_2 = new JScrollPane();
	JScrollPane scrollPane_3 = new JScrollPane();
	JScrollPane scrollPane_4 = new JScrollPane();
	JScrollPane scrollPane_5 = new JScrollPane();
	JScrollPane scrollPane_6 = new JScrollPane();
	JScrollPane scrollPane_7 = new JScrollPane();
	JTextPane textPane_2 = new JTextPane();
	JTextPane textPane_3 = new JTextPane();
	JTextPane textPane_4 = new JTextPane();
	JTextPane textPane_5 = new JTextPane();
	JTextPane textPane_6 = new JTextPane();
	JTextPane textPane_7 = new JTextPane();
	
	AIFComponentContext selectedobject = null;
	AIFComponentContext[] workflowArray;
	
	TCSession session = null;
	TCComponent selectedObj;
	TCComponentQueryType tccomponentquerytype = null;
	TCComponentQuery query = null;
	
	TCComponent parObject = null;
	TCComponentItemRevision parObjectRev = null;
	TCComponent[] qryResultParRequest = null;
	TCComponent[] qryResultControlObj = null;
	TCComponentItem itemComp = null;
	
	int sequenceId1 = 0;
	int tmpId = 0;
	int k = 1;
	int workflowFound  = 0;
	int actionPerformedOnForm = 0;
	
	Vector<String>  comboValues = new Vector<String>();
    Vector<String>  realPropValues = new Vector<String>();
	Vector<Integer> itemIdsfound = new Vector<>();
	
	String itemId          = null;
	String objType         = null;
	String shellInput1     = null;
	String shellInput2     = null;
	String itemRevId       = null; 
	String sequenceId      = null;
	String shellPath       = null;
	String shellName       = null;
	String currentRole     = null; 
	String currentGroup    = null;
	String tempGroup       = null;
	String LoggedInUser    = null;
	String updatedItemId   = null;
	String tempId          = null; 
	String tempa           = ""; 
	String tempb           = null;
	String parNum          = null;
	String objDesc         = null;
	String projectCode     = "";
	String roles           = null;
	String currentDesc     = null;
	String tempQueryValue  = null; 
	String tempQueryValue2 = null;
	String prefPath        = null;
	String[] realPropNames =new String[] {"t5_rlsltrref","t5_ECUMintID","t5_proposedsol","t5_rlsltrnotes","object_name","object_desc","t5_reasondesc","t5_copiesto","t5_cpriority","t5_ReqestingAgency","t5_cDRstatus","t5_DmlReasonDisplay"};
	
	String releaseLetterRef         = null;   // t5_rlsltrref       
	String ecuMintID                = null;   // t5_ECUMintID       
	String proposedSolution         = null;   // t5_proposedsol     
	String releaseLetterNotes       = null;   // t5_rlsltrnotes     
	String synopsis                 = null;   // object_name        
	String description              = null;   // object_desc        
	String reasonDescription        = null;   // t5_reasondesc      
	String copiesTo                 = null;   // t5_copiesto        
	String priority                 = null;   // t5_cpriority       
	String reqestingAgency          = null;   // t5_ReqestingAgency 
	String dRStatus                 = null;   // t5_cDRstatus       
	String dmlReason                = null;   // t5_DmlReasonDisplay
	String workflowStatus           = null;
	String businessUnit             = null;
	String vehicleClassification    = null; 
	String releaseType              = null;
	String mdmReleaseType           = null;
	
	String final_releaseLetterRef   = null;   // t5_rlsltrref       
	String final_ecuMintID          = null;   // t5_ECUMintID       
	String final_proposedSolution   = null;   // t5_proposedsol     
	String final_releaseLetterNotes = null;   // t5_rlsltrnotes     
	String final_synopsis           = null;   // object_name        
	String final_description        = null;   // object_desc        
	String final_reasonDescription  = null;   // t5_reasondesc      
	String final_copiesTo           = null;   // t5_copiesto        
	String final_priority           = null;   // t5_cpriority       
	String final_reqestingAgency    = null;   // t5_ReqestingAgency 
	String final_dRStatus           = null;   // t5_cDRstatus       
	String final_dmlReason          = null;   // t5_DmlReasonDisplay
	String final_mdmReleaseType     = null;   // t5_mdmrlstype
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					non_cad_dml_attributes_shell window = new non_cad_dml_attributes_shell(eventobj);
					window.frmDmlPropertyUpdation.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public non_cad_dml_attributes_shell(ExecutionEvent event1) 
	{
		this.eventobj=event1;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() 
	{
		frmDmlPropertyUpdation = new JFrame();
		frmDmlPropertyUpdation.setResizable(false);
		frmDmlPropertyUpdation.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowOpened(WindowEvent arg0)
			{		
				try 
				{
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
					
					itemRevId=selectedObj.getStringProperty("item_revision_id");
					System.out.println(" - item_revision_id = "+itemRevId); 
					
					sequenceId1=selectedObj.getIntProperty("sequence_id");
					System.out.println(" - sequenceId1 = "+sequenceId1);
						
					sequenceId=String.valueOf(sequenceId1); 
					System.out.println(" - sequenceId = "+sequenceId);
					
					prefPath=session.getPreferenceService().getStringValue("RACApp_PoCheckshell");
					System.out.println(" - prefPath = "+prefPath);
					
					if(objType.equals("ChangeRequestRevision")==true)
					{
						releaseLetterRef        = selectedObj.getStringProperty("t5_rlsltrref");
						ecuMintID               = selectedObj.getStringProperty("t5_ECUMintID");
						proposedSolution        = selectedObj.getStringProperty("t5_proposedsol");
						releaseLetterNotes      = selectedObj.getStringProperty("t5_rlsltrnotes");
						synopsis                = selectedObj.getStringProperty("object_name");
						description             = selectedObj.getStringProperty("object_desc");
						reasonDescription       = selectedObj.getStringProperty("t5_reasondesc");
						copiesTo                = selectedObj.getStringProperty("t5_copiesto");
						priority                = selectedObj.getStringProperty("t5_cpriority");
						reqestingAgency         = selectedObj.getStringProperty("t5_ReqestingAgency");
						dRStatus                = selectedObj.getStringProperty("t5_cDRstatus");
						dmlReason               = selectedObj.getStringProperty("t5_DmlReasonDisplay");
						businessUnit            = selectedObj.getStringProperty("t5_ERCBusiUt");
						vehicleClassification   = selectedObj.getStringProperty("t5_DmlVClassfctn");
						releaseType             = selectedObj.getStringProperty("t5_rlstype");
						mdmReleaseType          = selectedObj.getStringProperty("t5_mdmrlstype");
						
						workflowArray=selectedObj.whereReferenced();
												
						System.out.println("releaseLetterRef      =  "+releaseLetterRef      +" releaseLetterRef       length = "+releaseLetterRef.length());
						System.out.println("ecuMintID             =  "+ecuMintID             +" ecuMintID              length = "+ecuMintID.length());
						System.out.println("proposedSolution      =  "+proposedSolution      +" proposedSolution       length = "+proposedSolution.length());
						System.out.println("releaseLetterNotes    =  "+releaseLetterNotes    +" releaseLetterNotes     length = "+releaseLetterNotes.length());
						System.out.println("synopsis              =  "+synopsis              +" synopsis               length = "+synopsis.length());
						System.out.println("description           =  "+description           +" description            length = "+description.length());
						System.out.println("reasonDescription     =  "+reasonDescription     +" reasonDescription      length = "+reasonDescription.length());
						System.out.println("copiesTo              =  "+copiesTo              +" copiesTo               length = "+copiesTo.length());
						System.out.println("priority              =  "+priority              +" priority               length = "+priority.length());
						System.out.println("reqestingAgency       =  "+reqestingAgency       +" reqestingAgency        length = "+reqestingAgency.length());
						System.out.println("dRStatus              =  "+dRStatus              +" dRStatus               length = "+dRStatus.length());
						System.out.println("dmlReason             =  "+dmlReason             +" dmlReason              length = "+dmlReason.length());
						System.out.println("businessUnit          =  "+businessUnit          +" businessUnit           length = "+businessUnit.length());
						System.out.println("vehicleClassification =  "+vehicleClassification +" vehicleClassification  length = "+vehicleClassification.length());
						System.out.println("releaseType           =  "+releaseType           +" releaseType            length = "+releaseType.length());
						System.out.println("mdmReleaseType        =  "+mdmReleaseType        +" mdmReleaseType         length = "+mdmReleaseType.length());
						
						
						    textField.setText(releaseLetterRef );
						  textField_1.setText(ecuMintID        );
						  textPane_2.setText(proposedSolution  );
						  textPane_3.setText(releaseLetterNotes);
						  textPane_4.setText(synopsis          );
						  textPane_5.setText(description       );
						  textPane_6.setText(reasonDescription );
						  textPane_7.setText(copiesTo          );
						  textField_2.setText(mdmReleaseType);
						  
						  if(priority.length()>0)
						  {
							  for(int i=0;i<comboBox.getItemCount();i++)
							  {
								  if(priority.equals(comboBox.getItemAt(i).toString()))
								  {
									  System.out.println("priority = "+priority+" comboBox = "+comboBox.getItemAt(i).toString());
									  comboBox.setSelectedIndex(i);
								  }
							  }
							  
						  }
						  if(reqestingAgency.length()>0)
						  {
							  for(int i=0;i<comboBox_1.getItemCount();i++)
							  {
								  if(reqestingAgency.equals(comboBox_1.getItemAt(i).toString()))
								  {
									  System.out.println("reqestingAgency = "+reqestingAgency+" comboBox_1 = "+comboBox_1.getItemAt(i).toString());
									  comboBox_1.setSelectedIndex(i);
								  }
							  }
						  }
						  if(dRStatus.length()>0)
						  {
							  for(int i=0;i<comboBox_2.getItemCount();i++)
							  {
								  if(dRStatus.equals(comboBox_2.getItemAt(i).toString()))
								  {
									  System.out.println("dRStatus = "+dRStatus+" comboBox_2 = "+comboBox_2.getItemAt(i).toString());
									  comboBox_2.setSelectedIndex(i);
								  }
							  }
						  }
						  if(dmlReason.length()>0)
						  {
							  for(int i=0;i<comboBox_3.getItemCount();i++)
							  {
								  if(dmlReason.equals(comboBox_3.getItemAt(i).toString()))
								  {
									  System.out.println("dmlReason = "+dmlReason+" comboBox_3 = "+comboBox_3.getItemAt(i).toString());
									  comboBox_3.setSelectedIndex(i);
								  }
							  }
						  }
						  
							for(int l=0;l<workflowArray.length;l++)
							{
								workflowStatus=workflowArray[l].getComponent().getProperty("object_type").toString();
								if(workflowStatus.equals("Workflow Task")==true)
								{
									System.out.println("**************** Worflow is attached on selected business object . **************** ");
									comboBox_2.setEnabled(false);
									comboBox_2.setToolTipText("DML is in lifecycle kindly abort DML then try to update.");
									
									comboBox_3.setEnabled(false);
									comboBox_3.setToolTipText("DML is in lifecycle kindly abort DML then try to update.");
									workflowFound=1;
									break;
								}
							}  
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Selected object is not of type DML Revision. Please select a valid object or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
						frmDmlPropertyUpdation.setVisible(false);
						frmDmlPropertyUpdation.dispose();
					}
				}
				catch (TCException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println(" ************ TC Exception occured while getting selected object ************");
					JOptionPane.showMessageDialog(null, "Error in getting target Object. Please select a valid object or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
					frmDmlPropertyUpdation.dispose();
				}
				catch(Exception e1)
				{
					System.out.println(" ************ Exception occured while getting selected object ************ ");
					JOptionPane.showMessageDialog(null, "Error in getting target Object. Please select a valid object or connect with admin !","Error",JOptionPane.ERROR_MESSAGE);
					frmDmlPropertyUpdation.dispose();
				}	
			}
		});
		frmDmlPropertyUpdation.setTitle("DML Property Updation");
		frmDmlPropertyUpdation.getContentPane().setBackground(Color.WHITE);
		frmDmlPropertyUpdation.setBounds(100, 100, 1150, 695);
		frmDmlPropertyUpdation.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmDmlPropertyUpdation.getContentPane().setLayout(null);
		
		lblR.setBackground(Color.WHITE);
		lblR.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblR.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblR.setBounds(65, 45, 145, 30);
		frmDmlPropertyUpdation.getContentPane().add(lblR);
		
		lblEcuMintId.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblEcuMintId.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblEcuMintId.setBackground(Color.WHITE);
		lblEcuMintId.setBounds(699, 45, 90, 30);
		frmDmlPropertyUpdation.getContentPane().add(lblEcuMintId);
		
		lblProposedSolution.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblProposedSolution.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblProposedSolution.setBackground(Color.WHITE);
		lblProposedSolution.setBounds(65, 125, 145, 30);
		frmDmlPropertyUpdation.getContentPane().add(lblProposedSolution);
		
		lblReleaseLetterNotes.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblReleaseLetterNotes.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblReleaseLetterNotes.setBackground(Color.WHITE);
		lblReleaseLetterNotes.setBounds(65, 215, 145, 30);
		frmDmlPropertyUpdation.getContentPane().add(lblReleaseLetterNotes);
		
		lblSynopsis.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblSynopsis.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSynopsis.setBackground(Color.WHITE);
		lblSynopsis.setBounds(65, 310, 145, 30);
		frmDmlPropertyUpdation.getContentPane().add(lblSynopsis);
		
		lblDescription.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblDescription.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblDescription.setBackground(Color.WHITE);
		lblDescription.setBounds(65, 380, 145, 30);
		frmDmlPropertyUpdation.getContentPane().add(lblDescription);
		
		lblReasonDescription.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblReasonDescription.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblReasonDescription.setBackground(Color.WHITE);
		lblReasonDescription.setBounds(65, 455, 145, 30);
		frmDmlPropertyUpdation.getContentPane().add(lblReasonDescription);
		
		lblCopiesTo.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblCopiesTo.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblCopiesTo.setBackground(Color.WHITE);
		lblCopiesTo.setBounds(65, 530, 145, 30);
		frmDmlPropertyUpdation.getContentPane().add(lblCopiesTo);
		
		lblPriority.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblPriority.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblPriority.setBackground(Color.WHITE);
		lblPriority.setBounds(698, 100, 73, 30);
		frmDmlPropertyUpdation.getContentPane().add(lblPriority);
		
		lblRequestionAgency.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblRequestionAgency.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblRequestionAgency.setBackground(Color.WHITE);
		lblRequestionAgency.setBounds(698, 152, 145, 30);
		frmDmlPropertyUpdation.getContentPane().add(lblRequestionAgency);
		
		scrollPane_2.setBounds(240, 100, 448, 70);
		frmDmlPropertyUpdation.getContentPane().add(scrollPane_2);
		
		scrollPane_2.setViewportView(textPane_2);
		textPane_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		
		scrollPane_3.setBounds(240, 195, 448, 80);
		frmDmlPropertyUpdation.getContentPane().add(scrollPane_3);
		
		scrollPane_3.setViewportView(textPane_3);
		textPane_3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		
		scrollPane_4.setBounds(240, 300, 448, 60);
		frmDmlPropertyUpdation.getContentPane().add(scrollPane_4);
		
		scrollPane_4.setViewportView(textPane_4);
		textPane_4.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		
		scrollPane_5.setBounds(240, 370, 448, 60);
		frmDmlPropertyUpdation.getContentPane().add(scrollPane_5);
		
		scrollPane_5.setViewportView(textPane_5);
		textPane_5.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		
		scrollPane_6.setBounds(240, 445, 448, 60);
		frmDmlPropertyUpdation.getContentPane().add(scrollPane_6);
	
		scrollPane_6.setViewportView(textPane_6);
		textPane_6.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		
		scrollPane_7.setBounds(240, 520, 448, 60);
		frmDmlPropertyUpdation.getContentPane().add(scrollPane_7);
		
		scrollPane_7.setViewportView(textPane_7);
		textPane_7.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		
		comboBox.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Low", "Mid", "High", "NA"}));
		comboBox.setBounds(873, 101, 196, 30);
		frmDmlPropertyUpdation.getContentPane().add(comboBox);
		
		comboBox_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"APL", "CORPORATE QUALITY", "CV PSC BODY", "CV PSC CASTING", "CV PSC CHASSIS", "CV PSC E and E", "CV PSC FBV and DEFENCE", "CV PSC FORGING", "CV PSC TRIMS", "DPDS ERC", "ELECTRICAL CONNECTED", "ERC APPLICATION ENGINEERING", "ERC BRAKES", "ERC CAB BIW EXTERIOR TRIMS", "ERC CAB HVAC", "ERC CHASSIS INTEGRATION", "ERC DRIVELINE INTEGRATION", "ERC ELECTRICAL", "ERC ELECTRICAL DISPLAY and ECUS", "ERC ELECTRONICS", "ERC POWERTRAIN INTEGRATION", "ERC SUSPENSION", "ERC TOOL and ACCESSORIES", "ERC WHEELS and TYRES", "MANUFACTURING TS", "PPPM DEF", "PPPM", "PSE ERC", "PSE TRN TESTING", "QA", "QSR ERC", "SERVICE", "SQ", "STYLING ERC", "TMETC", "TTL VAVE", "VATS ERC", "VEHICLE INTEGRATION ERC"}));
		comboBox_1.setBounds(873, 153, 196, 30);
		frmDmlPropertyUpdation.getContentPane().add(comboBox_1);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				try 
				{
					System.out.println(" ******************* ok executed **************** ");
					System.out.println(" ************  - Target itemId = " + itemId);
					
					lblNewLabel.setText("Loading .... ");
					lblNewLabel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
					lblNewLabel_1.setIcon(new ImageIcon(non_cad_dml_attributes_shell.class.getResource("/com/teamcenter/rac/tml/ui/handlers/LoadingImg.png")));		
					JOptionPane.showMessageDialog(null,"Updation is in process please click OK to processed.","Info",JOptionPane.INFORMATION_MESSAGE);
						
					final_releaseLetterRef  =   textField.getText();
					final_ecuMintID         = textField_1.getText();
					final_proposedSolution  = textPane_2.getText();
					final_releaseLetterNotes= textPane_3.getText();
					final_synopsis          = textPane_4.getText();
					final_description       = textPane_5.getText();
					final_reasonDescription = textPane_6.getText();
					final_copiesTo          = textPane_7.getText();
					final_priority          = comboBox.getSelectedItem().toString();
					final_reqestingAgency   = comboBox_1.getSelectedItem().toString();
					final_dRStatus          = comboBox_2.getSelectedItem().toString();
					final_dmlReason         = comboBox_3.getSelectedItem().toString();
					final_mdmReleaseType    = textField_2.getText();
					

					System.out.println("final_releaseLetterRef  =  "+final_releaseLetterRef   );
					System.out.println("final_ecuMintID         =  "+final_ecuMintID          );
					System.out.println("final_proposedSolution  =  "+final_proposedSolution   );
					System.out.println("final_releaseLetterNotes=  "+final_releaseLetterNotes );
					System.out.println("final_synopsis          =  "+final_synopsis           );
					System.out.println("final_description       =  "+final_description        );
					System.out.println("final_reasonDescription =  "+final_reasonDescription  );
					System.out.println("final_copiesTo          =  "+final_copiesTo           );
					System.out.println("final_priority          =  "+final_priority           );
					System.out.println("final_reqestingAgency   =  "+final_reqestingAgency    );
					System.out.println("final_dRStatus          =  "+final_dRStatus           );
					System.out.println("final_dmlReason         =  "+final_dmlReason          );
					System.out.println("final_mdmReleaseType    =  "+final_mdmReleaseType     );
					
					realPropValues.add(final_releaseLetterRef    );
                    realPropValues.add(final_ecuMintID           );
                    realPropValues.add(final_proposedSolution    );
                    realPropValues.add(final_releaseLetterNotes  );
                    realPropValues.add(final_synopsis            );
                    realPropValues.add(final_description         );
                    realPropValues.add(final_reasonDescription   );
                    realPropValues.add(final_copiesTo            );
                    realPropValues.add(final_priority            );
                    realPropValues.add(final_reqestingAgency     );
                    realPropValues.add(final_dRStatus            );
                    realPropValues.add(final_dmlReason           );
                    realPropValues.add(final_mdmReleaseType      );
                                  
                    // Query for PAR Request Item.
					
                    if(final_releaseLetterRef.length()<=20&&final_ecuMintID.length()<=25&&final_proposedSolution.length()<=200&&final_releaseLetterNotes.length()<=2001&&
                    		final_synopsis.length()<=128&&final_description.length()<=240&&final_reasonDescription.length()<=200&&final_copiesTo.length()<=200&&
                    		final_priority.length()<=32&&final_reqestingAgency.length()<=128&& final_dRStatus.length()<=40&&final_dmlReason.length()<=128 && final_mdmReleaseType.length()<=128)
                    {
   					    session = (TCSession) AIFUtility.getCurrentApplication().getSession();
   					    LoggedInUser=session.getUser().getProperty("user_id").toString();	 
   					    currentRole=session.getCurrentRole().getProperty("object_name").toString();
   					    currentGroup=session.getCurrentGroup().getProperty("display_name").toString();
   					    
   					    System.out.println(" LoggedInUser found = "+LoggedInUser);	
   					    System.out.println(" currentRole  found = "+currentRole);
   					    System.out.println(" currentGroup found = "+currentGroup);
   					    
   					    tccomponentquerytype = (TCComponentQueryType)session.getTypeComponent("ImanQuery");
   					    query = (TCComponentQuery)tccomponentquerytype.find("General..."); 
   					    String[] qryEntry3  = new String[] {"Name","Type"}; 
   					    String[] qryValues3 = new String[] {"*", "Par Request" };
   					    qryResultParRequest = null; 
   					    qryResultParRequest = query.execute(qryEntry3,qryValues3);
   					    System.out.println("Total PAR Objects Found = "+qryResultParRequest.length);				  					  													
   					    if(qryResultParRequest.length>0)
   					    {					 	  
   						    for(int i=0;i<qryResultParRequest.length;i++)							  
   						    {
   							    itemComp=(TCComponentItem)qryResultParRequest[i]; 						  
   							    tempId = itemComp.getProperty("item_id"); 
   							    tempId = tempId.substring(3,tempId.length());						   
   							    tmpId  =Integer.parseInt(tempId); 			   				  
   							    itemIdsfound.add(tmpId);
   						    }
   						    Collections.sort(itemIdsfound);
   						    tmpId=itemIdsfound.lastElement();
   						    System.out.println(" Value found = "+tmpId);
   						    tmpId = tmpId +1;
   						    System.out.println(" Updated Value found = "+tmpId);
   						    
   						    String s=String.valueOf(tmpId);
   						    k=7-s.length();
   						    for(int i=1;i<=k;i++)
   						    {
   							    tempa=tempa+"0";
   						    }
   						    tempa=tempa+s;
   						    s=tempa;
   						    s="PAR"+s;
   						    updatedItemId=s;
   						    System.out.println(" Final String Returned = "+updatedItemId);					  					 								  						  
   					    }
   					    else
   					    {
   						    updatedItemId="PAR0000001";
   						    System.out.println(" Final String Returned = "+updatedItemId);
   					    }		
   					    if(updatedItemId!=null)
   					    {
   					    	parNum=updatedItemId;
   					    	objDesc="DML Property change request initiated by "+LoggedInUser+" with Group "+currentGroup+" and role "+currentRole;	
   					    	
   					    	// Release letter Notes Property
   					    	
   					    	if(releaseLetterNotes.equals(final_releaseLetterNotes)==false)
   					    	{
   					    		roles="t5_rlsltrnotes"+"^"+final_releaseLetterNotes+"~";
   					    		System.out.println("releaseLetterNotes length = "+releaseLetterNotes.length()+" final_releaseLetterNotes length = "+final_releaseLetterNotes.length());
   					    	}
   					    	
   					    	// Other Properties
   					    	if(releaseLetterRef.equals(final_releaseLetterRef)==false)
   					    	{
   					    		projectCode=projectCode+"t5_rlsltrref"+"^"+final_releaseLetterRef+"~";
   					    		System.out.println("releaseLetterRef length = "+releaseLetterRef.length()+" final_releaseLetterRef length = "+final_releaseLetterRef.length());
   					    		
   					    	}
   					    	if(ecuMintID.equals(final_ecuMintID)==false)
   					    	{
   					    		projectCode=projectCode+"t5_ECUMintID"+"^"+final_ecuMintID+"~";
   					    		System.out.println("ecuMintID length = "+ecuMintID.length()+" final_ecuMintID length = "+final_ecuMintID.length());
   					    	}
   					    	if(proposedSolution.equals(final_proposedSolution)==false)
   					    	{
   					    		projectCode=projectCode+"t5_proposedsol"+"^"+final_proposedSolution+"~";
   					    		System.out.println("ecuMintID length = "+ecuMintID.length()+" final_ecuMintID length = "+final_ecuMintID.length());
   					    	}
   					    	if(synopsis.equals(final_synopsis)==false)
   					    	{
   					    		projectCode=projectCode+"object_name"+"^"+final_synopsis+"~";
   					    		System.out.println("synopsis length = "+synopsis.length()+" final_synopsis length = "+final_synopsis.length());
   					    	}
   					    	if(description.equals(final_description)==false)
   					    	{
   					    		projectCode=projectCode+"object_desc"+"^"+final_description+"~";
   					    		System.out.println("description length = "+description.length()+" final_description length = "+final_description.length());
   					    	}
   					    	if(reasonDescription.equals(final_reasonDescription)==false)
   					    	{
   					    		projectCode=projectCode+"t5_reasondesc"+"^"+final_reasonDescription+"~";
   					    		System.out.println("reasonDescription length = "+reasonDescription.length()+" final_reasonDescription length = "+final_reasonDescription.length());
   					    	}
   					    	if(copiesTo.equals(final_copiesTo)==false)
   					    	{
   					    		projectCode=projectCode+"t5_copiesto"+"^"+final_copiesTo+"~";
   					    		System.out.println("copiesTo length = "+copiesTo.length()+" final_copiesTo length = "+final_copiesTo.length());
   					    	}
   					    	if(priority.equals(final_priority)==false)
   					    	{
   					    		projectCode=projectCode+"t5_cpriority"+"^"+final_priority+"~";
   					    		System.out.println("priority length = "+priority.length()+" final_priority length = "+final_priority.length());
   					    	}
   					    	if(reqestingAgency.equals(final_reqestingAgency)==false)
   					    	{
   					    		projectCode=projectCode+"t5_ReqestingAgency"+"^"+final_reqestingAgency+"~";
   					    		System.out.println("reqestingAgency length = "+reqestingAgency.length()+" final_reqestingAgency length = "+final_reqestingAgency.length());
   					    	}
   					    	if(dRStatus.equals(final_dRStatus)==false)
   					    	{
   					    		projectCode=projectCode+"t5_cDRstatus"+"^"+final_dRStatus+"~";
   					    		System.out.println("dRStatus length = "+dRStatus.length()+" final_dRStatus length = "+final_dRStatus.length());
   					    	}
   					    	if(dmlReason.equals(final_dmlReason)==false)
   					    	{
   					    		projectCode=projectCode+"t5_DmlReasonDisplay"+"^"+final_dmlReason+"~";
   					    		projectCode=projectCode+"t5_reason"+"^"+final_dmlReason+"~";
   					    		System.out.println("dmlReason length = "+dmlReason.length()+" final_dmlReason length = "+final_dmlReason.length());
   					    	}	
   					    	if(mdmReleaseType.equals(final_mdmReleaseType)==false)
   					    	{
   					    		projectCode=projectCode+"t5_mdmrlstype"+"^"+final_mdmReleaseType+"~";
   					    		System.out.println("mdmReleaseType length = "+mdmReleaseType.length()+" final_mdmReleaseType length = "+final_mdmReleaseType.length());
   					    	}
   							    	
   					    	// Current Desc Property
   					    	
   					    	currentDesc = itemId+","+itemRevId+","+sequenceId+",";
   					    	
   					    	System.out.println(" - roles = "+roles);
   					    	System.out.println(" - currentDesc = "+currentDesc);
   					    	System.out.println(" - projectCode = "+projectCode);
   					    	System.out.println(" - objDesc = "+objDesc);
   					    	
   					    	// Creating PAR Object
   					    	  
   					    	DataManagement.CreateInput itemCreateIn= new DataManagement.CreateInput();
   					        itemCreateIn.boName = "T5_ParRequest";
					    
   					    	itemCreateIn.stringProps.put("item_id", parNum);
   					    	itemCreateIn.stringProps.put("object_name", parNum);
   					    	itemCreateIn.stringProps.put("object_desc",objDesc);
					    
   					    	System.out.println("\n Setting the value1 for T5_ParRequest");
					    
   					    	DataManagement.CreateInput revisionCreateIn = new DataManagement.CreateInput();
   					    	revisionCreateIn.boName = "T5_ParRequestRevision";
   					    	revisionCreateIn.stringProps.put("item_revision_id", "NR");	
   					    	revisionCreateIn.stringProps.put("object_desc", objDesc);	
   					    	revisionCreateIn.stringProps.put("DocumentAuthor", LoggedInUser);
   					    	revisionCreateIn.stringProps.put("t5_Role", roles);
   					    	revisionCreateIn.stringProps.put("t5_ParRequestProjectCode", projectCode);
   					    	revisionCreateIn.stringProps.put("t5_TML_Manager", currentDesc);
   					    	
   					    	System.out.println("\n Setting the values for T5_ParRequestRevision");
					    
   					    	itemCreateIn.compoundCreateInput.put("revision", new DataManagement.CreateInput[]{revisionCreateIn});
   					    	DataManagement.CreateIn cnAPLDMLCreateIn = new DataManagement.CreateIn();
   					    	cnAPLDMLCreateIn.clientId = parNum;
   					    	cnAPLDMLCreateIn.data = itemCreateIn;
   					    	DataManagementService dmService_APLDML = DataManagementService.getService(session);
   					    	DataManagement.CreateResponse APLDMLcreateResponse;
   					    	
   					    	APLDMLcreateResponse = dmService_APLDML.createObjects(new DataManagement.CreateIn[]{cnAPLDMLCreateIn});
   					    	System.out.println(" ************ Object creation successfull ************ ");
					    
   					    	tccomponentquerytype = (TCComponentQueryType)session.getTypeComponent("ImanQuery");
   					    	query = (TCComponentQuery)tccomponentquerytype.find("Item..."); 
   					    	String[] qryEntry31  = new String[] {"Item ID","Type"}; 
   					    	String[] qryValues31 = new String[] {parNum, "Par Request" };
   					    	qryResultParRequest = null; 
   					    	qryResultParRequest = query.execute(qryEntry31,qryValues31);
   					    	System.out.println("Total Real Objects found = "+qryResultParRequest.length);
   					    	if(qryResultParRequest.length==1)
   					    	{    		
   					    		parNum = "\""+parNum+"\""; 
   					    		currentDesc = "\""+currentDesc+"\""; 
   					    		
   					    		// Shell call Started 
   					    		
   	                            System.out.println(" ----- Shell Call started ........  ");
   					    		
   					    		System.out.println(" ********** Point 1.1.1 = **********"); 
   					    		AbstractAIFUIApplication app = AIFUtility.getCurrentApplication();
   					    		
   					    		System.out.println(" ********** Point 1.1.2 = **********"); 
   					    		TCSession session = (TCSession) app.getSession();
   					    		
   					    		System.out.println(" ********** Point 1.1.3 = **********"); 
   					    		T5LinuxShellManagementService t5LinuxShellManagementService = T5LinuxShellManagementService.getService(session);
   					    		
   					    		// testcmi
   					    		// shellPath = "/user/testcmi/Dev/devgroups/Aditya_Khandelwal/ShellTestingDml/";
   					    		// shellName = "DML.sh";
   					    																 							
   					    		//user/cvprod/Aditya_ak927337/DMLPropUpdate
   					    		//shellPath = "/user/cvprod/TC_ROOT12/bin/tml_tools";
   					    		shellPath=prefPath;
   					    		shellName = "Prp_upd_cv.sh";
   					    		
   					    		System.out.println(" ********** Point 1.1.4 = **********"); 
   					    		String returnMessage = t5LinuxShellManagementService.tmShellBatchCall(shellPath, shellName, parNum,currentDesc);
   					    		System.out.println("Shell Output message :" + returnMessage);
   					    	    System.out.println(" ********** Point 1.1.5 = **********"); 	
   					    	    System.out.println(" ----- Shell Call Ended ........  ");
   					    		
   					    		// Shell call ended
   					    	}
   					    	else
   					    	{
   					    		System.out.println(" ************ DML Property change request creation failed beacause PAR object creation failed in teamcenter ************ ");
   					    		frmDmlPropertyUpdation.dispose();
   					    	}
   					    }
   					    else
   					    {
   					  	    System.out.println(" updatedItemId == null . Item id generation failed . Please try again .");
   					    }
   					
   					    System.out.println(" **************************** Property Updation successfully Ended ******************************************** ");
   					    JOptionPane.showMessageDialog(null,"Procces completed Property updation successfull.Kindly refresh DML.","Info",JOptionPane.INFORMATION_MESSAGE);
   					    lblNewLabel.setText("");
     				    lblNewLabel_1.setBorder(new LineBorder(Color.WHITE));
     				    lblNewLabel_1.setIcon(null);
     				    frmDmlPropertyUpdation.dispose();		     
                    }
                    else
                    {
                    	String x="Error : Property updation failed property value extending allowed size. Please reduce size for below property as per the limit and try again.\n"; 
                    	if(final_releaseLetterRef.length()>20)
                    	{
                    		x=x+"Release Letter Ref limit = 20 \n";
                    	}
                        if(final_ecuMintID.length()> 25)
                        {
                        	x=x+"ECU Mint ID limit = 25 \n";
                        }
                        if(final_proposedSolution.length()>200)
                        {
                        	x=x+"Proposed Solution limit = 200 \n";
                        }
                        if(final_releaseLetterNotes.length()>2001)
                        {
                        	x=x+"Release Letter Notes limit = 2001 \n";
                        }
                        if(final_synopsis.length()> 128)
                        {
                        	x=x+"Synopsis limit = 128 \n";
                        }
                        if(final_description.length()> 240)
                        {
                        	x=x+"Description limit = 240 \n";
                        }
                        if(final_reasonDescription.length()> 200)
                        {
                        	x=x+"Reason Description limit = 200 \n";
                        }
                        if(final_copiesTo.length()> 200)
                        {
                        	x=x+"Cppies to limit = 200 \n";
                        }
                        if(final_priority.length()> 32)
                        {
                        	x=x+"Priority limit = 32 \n";
                        }
                        if(final_reqestingAgency.length() >128)
                        {
                        	x=x+"Requestion Agency limit = 128 \n";
                        }
                        if(final_dRStatus.length()> 40) 
                        {
                        	x=x+"DR Status limit = 40 \n";
                        }
                        if(final_dmlReason.length()> 128) 
                        {
                        	x=x+"DML Reason limit = 128 \n";
                        }
                    	
                    	JOptionPane.showMessageDialog(null,x,"Error",JOptionPane.INFORMATION_MESSAGE);
                    }
				}
				catch (TCException e1) 
				{
					e1.printStackTrace();
					System.out.println("######################## TCException exception occurred #################### ");
					JOptionPane.showMessageDialog(null, "Property updation failed please try again or connect with admin","Error",JOptionPane.ERROR_MESSAGE);
					frmDmlPropertyUpdation.dispose();
				}
				
				catch(Exception e)
				{
					e.printStackTrace();
					System.out.println("######################## General exception occurred #################### ");
					JOptionPane.showMessageDialog(null, "Property updation failed please try again or connect with admin","Error",JOptionPane.ERROR_MESSAGE);
					frmDmlPropertyUpdation.dispose();
				}
				
				lblNewLabel.setText("");
				lblNewLabel_1.setBorder(new LineBorder(Color.WHITE));
				lblNewLabel_1.setIcon(null);
			}
		});
		
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnNewButton.setBounds(774, 601, 123, 30);
		frmDmlPropertyUpdation.getContentPane().add(btnNewButton);
		
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				frmDmlPropertyUpdation.setVisible(false);
				frmDmlPropertyUpdation.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		btnNewButton_1.setBounds(939, 601, 108, 30);
		frmDmlPropertyUpdation.getContentPane().add(btnNewButton_1);
		
		
		lblDrStatus.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblDrStatus.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblDrStatus.setBackground(Color.WHITE);
		lblDrStatus.setBounds(701, 216, 73, 30);
		frmDmlPropertyUpdation.getContentPane().add(lblDrStatus);
		
		lblDmlReason.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblDmlReason.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblDmlReason.setBackground(Color.WHITE);
		lblDmlReason.setBounds(65, 601, 145, 30);
		frmDmlPropertyUpdation.getContentPane().add(lblDmlReason);
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				System.out.println(" ************************ Action Performed on DR-ComboBox ************************ ");
				actionPerformedOnForm++;
				if(workflowFound==0 && actionPerformedOnForm>1)
				{
					if(dRStatus.equals(final_dRStatus)==false)
					{
						System.out.println(" Action Performed on DR-ComboBox and drStatus != final_drStatus. "); 
						
						final_dRStatus = comboBox_2.getSelectedItem().toString();
						comboBox_3.removeAllItems();
						System.out.println(" -businessUnit          = "+businessUnit);
						System.out.println(" -vehicleClassification = "+vehicleClassification);
						System.out.println(" -releaseType           = "+releaseType);
						System.out.println(" -dRStatus              = "+dRStatus);
						System.out.println(" -final_dRStatus        = "+final_dRStatus);
																		
						if(businessUnit.equals("PVBU")==true ||businessUnit.equals("PV-PSE")==true ||businessUnit.equals("PV-Transmission")==true ||
								businessUnit.equals("PV-AdvTech")==true ||businessUnit.equals("PV-AdvEng")==true ||businessUnit.equals("CV-PSE")==true ||
								businessUnit.equals("CV-Transmission")==true ||businessUnit.equals("CV-AdvTech")==true ||businessUnit.equals("CV-AdvEng")==true)
						{
							System.out.println(" ************** If condition executed where  business unit found is in list of 9 ************** ");
							try 
							{
								    tccomponentquerytype = (TCComponentQueryType)session.getTypeComponent("ImanQuery");
			   					    query = (TCComponentQuery)tccomponentquerytype.find("Control Objects..."); 
			   					    String[] qryEntry3  = new String[] {"SYSCD","SUBSYSCD"}; 
			   					    String[] qryValues3 = new String[] {"DMLReason",  businessUnit};
			   					    qryResultControlObj = null; 
			   					    qryResultControlObj = query.execute(qryEntry3,qryValues3);
			   					    System.out.println("Total Query Objects Found for control objects = "+qryResultControlObj.length);				  					  													
			   					    if(qryResultControlObj.length>0)
			   					    {					 	  
			   						    for(int i=0;i<qryResultControlObj.length;i++)							  
			   						    {			   						    	 						  
			   						    	tempQueryValue = qryResultControlObj[i].getProperty("t5_Userinfo3").toString();
			 							    comboValues.add(tempQueryValue);
			   						    }
			   						    System.out.println("Vector of comboValues = "+comboValues);
			   						    comboBox_3.setModel(new DefaultComboBoxModel(comboValues));
			   					    }
							}
							catch (TCException e) 
							{
								e.printStackTrace();
								System.out.println(" *************** TC Exception Occurred while Searching contol object. ***************");
							}
							catch (Exception e) 
							{
								e.printStackTrace();
								System.out.println(" *************** General Exception Occurred while Searching contol object. ***************");
							}
		   						      
						}
						else if(businessUnit.equals("CVBU")==true)			
						{
							System.out.println(" ************** Else if condition executed where  business unit found == CVBU ************** ");
						    try 
						    {
						    	if(releaseType.equals("TODR")==true||releaseType.equals("EP")==true||releaseType.equals("DL")==true||releaseType.equals("KSP")==true||
						    			releaseType.equals("SP")==true||releaseType.equals("VOD")==true||releaseType.equals("CP")==true||releaseType.equals("CM")==true||
						    			releaseType.equals("TS")==true||releaseType.equals("WT")==true||releaseType.equals("WO")==true||releaseType.equals("VCMDU")==true||
						    			releaseType.equals("COL")==true||releaseType.equals("SPIUP")==true)
						    	{
						    		  System.out.println(" ************** If condition executed where release type is in selected 14. executing query with 2 entries ************** ");
						    		  tccomponentquerytype = (TCComponentQueryType)session.getTypeComponent("ImanQuery");
				   					  query = (TCComponentQuery)tccomponentquerytype.find("Control Objects..."); 
				   					  String[] qryEntry3  = new String[] {"SYSCD","SUBSYSCD"}; 
				   					  String[] qryValues3 = new String[] {"DMLReason",  businessUnit};
				   					  qryResultControlObj = null; 
				   					  qryResultControlObj = query.execute(qryEntry3,qryValues3);
				   					  System.out.println("Total Query Objects Found for control objects = "+qryResultControlObj.length);
				   					if(qryResultControlObj.length>0)
			   					    {					 	  
			   						    for(int i=0;i<qryResultControlObj.length;i++)							  
			   						    {			   						    							  
			   						    	tempQueryValue = qryResultControlObj[i].getProperty("t5_Userinfo3").toString();
			 							    comboValues.add(tempQueryValue);
			   						    }
			   						    System.out.println("Vector of comboValues = "+comboValues);
			   						    comboBox_3.setModel(new DefaultComboBoxModel(comboValues));
			   					    }				   	
						    	}
						    	else
						    	{
						    		System.out.println(" ************** Else condition executed where release type is not in selected 14. executing query with 3 entries ************** ");
						    		 tccomponentquerytype = (TCComponentQueryType)session.getTypeComponent("ImanQuery");
				   					 query = (TCComponentQuery)tccomponentquerytype.find("Control Objects..."); 
				   					 String[] qryEntry3  = new String[] {"SYSCD","SUBSYSCD","Information-1"}; 
				   					 String[] qryValues3 = new String[] {"DMLReason",  businessUnit,vehicleClassification};
				   					 qryResultControlObj = null; 
				   					 qryResultControlObj = query.execute(qryEntry3,qryValues3);
				   					 System.out.println("Total Query Objects Found for control objects = "+qryResultControlObj.length);	
				   					if(qryResultControlObj.length>0)
			   					    {					 	  
			   						    for(int i=0;i<qryResultControlObj.length;i++)							  
			   						    {			   				
			   						    	
			   						    	tempQueryValue  = qryResultControlObj[i].getProperty("t5_Userinfo3").toString();
			   						    	tempQueryValue2 = qryResultControlObj[i].getProperty("t5_Userinfo2").toString();
			   						    	System.out.println(" tempQueryValue : "+tempQueryValue);
			   						    	System.out.println(" tempQueryValue2 : "+tempQueryValue2);
			   						    	
			   						    	if(tempQueryValue2.contains(final_dRStatus)==true)			   						    		
			   						    	{
			   						    		comboValues.add(tempQueryValue);
			   						    	}			 							   
			   						    }
			   						    System.out.println("Vector of comboValues = "+comboValues);
			   						    comboBox_3.setModel(new DefaultComboBoxModel(comboValues));
			   					    }				   							   					 
						    	}
						    }
						    catch (TCException e) 
							{
								e.printStackTrace();
								System.out.println(" *************** TC Exception Occurred while Searching contol object for CVBU. ***************");
							}
						    catch (Exception e) 
							{
								e.printStackTrace();
								System.out.println(" *************** General Exception Occurred while Searching contol object for CVBU. ***************");
							}												
						}
						else
						{
							System.out.println(" ************** Else condition executed where No business unit found ************** ");
						}
						JOptionPane.showMessageDialog(null,"DML Reason property is updated as per DR Status changes Please check and click on OK to proceed .","Info",JOptionPane.INFORMATION_MESSAGE);
					}
					else
					{
						System.out.println(" **** Action Performed on DR-ComboBox dRStatus == final_dRStatus so nothing happened.");
					}
				}
				else
				{
					System.out.println(" **** Action Performed on DR-ComboBox since workflow is attached or Form is started so nothing happened. ");
				}
			}
		});
		
		comboBox_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"NA", "DR0", "DR1", "DR2", "DR3", "DR3P", "DR4", "DR5", "DVPT", "AR0", "AR1", "AR2", "AR3", "AR3P", "AR4", "AR5"}));
		comboBox_2.setBounds(873, 217, 197, 30);
		frmDmlPropertyUpdation.getContentPane().add(comboBox_2);
		
		comboBox_3.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"NEW REQUIREMENTS (NEW VC, NEW AGGREGATE)", "QUALITY & RELIABILITY IMPROVEMENT", "TO FACILITATE MANUFACTURING", "END CUSTOMER/FIELD COMPLAINTS & SERVICE FEEDBACK/CCT", "COST REDUCTION", "SAFETY REQUIREMENT", "WEIGHT REDUCTION", "REGULATORY REQUIREMENT", "DRAFTING ERROR CORRECTION/BOM-CAD QUALITY IMPROVEMENT", "ALTERNATE SOURCE DEVELOPMENT", "COMMONIZATION/STANDARDIZATION/COMPLEXITY REDUCTION", "INTEGRATED COST REDUCTION", "WARRANTY COST REDUCTION", "IMPROVEMENT IN JD POWER INITIAL QUALITY SCORE", "CHANGE IN FEATURE LIST", "MODULE MASTER DATA MANAGEMENT REQUEST", "VC Attribute Change", "QUALITY", "ATTRIBUTE REQUIREMENT", "ENGINEERING MATURITY (CAE, STYLING, VALIDATION, PROTO FEEDBACK ETC.)", "DFA FEEDBACK", "DFS FEEDBACK", "DFC FEEDBACK", "CONDITION OF SUPPLY CHANGE", "SCOPE CHANGES", "RELEASE OF SPARES/KITS (NO NEW PART DEVELOPMENT)", "INFO-FITMENT DRAWING (IFD)", "ECU CALIBRATION FILE RELEASE", "SAMPLES TO BE APPROVED", "DFM", "REGULATORY / SAFETY REQUIREMENTS", "DESIGN MATURATION", "STYLING SURFACES (CAS)", "EVI REPLACEMENTS (BLACK BOX)", "FEATURE ADDITION", "BTS SUPPLIER CHANGE (GREY BOX)", "DVLO ISSUES", "4D CHANGES", "VALIDATION / CAE FEEDBACK", "TO FACILITATE MANUFACTURING/ PROCESS CHANGES FOR QUALITY RELIABILITY IMPROVEMENT", "INTEGRATED COST REDUCTION / WEIGHT REDUCTION / COMPLEXITY REDUCTION", "QUALITY, WARRANTY & RELIABILITY IMPROVEMENT", "NON-ERC DML"}));
		comboBox_3.setBounds(240, 602, 375, 30);
		frmDmlPropertyUpdation.getContentPane().add(comboBox_3);
		
		
		lblNewLabel.setBorder(null);
		lblNewLabel.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lblNewLabel.setBounds(462, 0, 108, 34);
		frmDmlPropertyUpdation.getContentPane().add(lblNewLabel);
		
		//lblNewLabel_1.setIcon(new ImageIcon(non_cad_dml_attributes_shell.class.getResource("/com/teamcenter/rac/tml/ui/handlers/LoadingImg.png")));
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setBounds(595, 0, 38, 34);
		frmDmlPropertyUpdation.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		textField.setBounds(240, 45, 325, 30);
		frmDmlPropertyUpdation.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		textField_1.setBounds(799, 46, 325, 30);
		frmDmlPropertyUpdation.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblMdmRelease = new JLabel("MDM Release Type");
		lblMdmRelease.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblMdmRelease.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblMdmRelease.setBackground(Color.WHITE);
		lblMdmRelease.setBounds(699, 270, 135, 30);
		frmDmlPropertyUpdation.getContentPane().add(lblMdmRelease);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(844, 271, 281, 30);
		frmDmlPropertyUpdation.getContentPane().add(textField_2);
	}
	
	public String removeCommaInString(String x)
	{
		for(int i=0;i<x.length();i++)
		{
		    if(x.charAt(i)==',')
		    {		       
		    	System.out.println("******************* Comma Found **************************** ");
		        String result = x.substring(0, i) + ' ' + x.substring(i+1);
                x=result;          
		    }
		}
		
		return x;
	}
	public String removeNextLineInString(String x)
	{
		for(int i=0;i<x.length();i++)
		{
		    if(x.charAt(i)=='\n')
		    {		       
		    	System.out.println("******************* Next Line Found **************************** ");
		        String result = x.substring(0, i) + ' ' + x.substring(i+1);
                x=result;          
		    }
		}
		
		return x;
	}
	public String removeQuotesLineInString(String x)
	{
		for(int i=0;i<x.length();i++)
		{
		    if(x.charAt(i)=='"')
		    {		       
		    	System.out.println("******************* Quotes Found **************************** ");
		        String result = x.substring(0, i) + ' ' + x.substring(i+1);
                x=result;          
		    }
		}
		
		return x;
	}
}