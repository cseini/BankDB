package view;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import controller.AdminController;
import controller.MemberController;
import domain.*;
import service.*;
import serviceImpl.*;

public class Register extends JFrame{
	private static final long serialVersionUID = 1L;
	JLabel topLab, idLab,passLab, nameLab, phoneLab, 
		addrLab, ssnLab, emailLab;
	JTextField idTxt, passTxt, nameTxt, phoneTxt, addrTxt, 
		ssnTxt, emailTxt;
	JButton addBtn;
	JPanel bottomPan, centerPan, idPan, passPan, 
		namePan, phonePan, addrPan, ssnPan, emailPan;
	JComboBox<?> combo;
	String[] menu = {"사용자 등록","직원 추가"};
	public Register() {
		makeGui(); //화면구성
		this.setSize(400, 300);
		this.setVisible(true);
	}
	// uid,pass,name,ssn,phone,email,addr;
	public void makeGui() {
		topLab = new JLabel("회원가입", JLabel.CENTER);
		
		combo = new JComboBox<>(menu);
		idLab = new JLabel("I D : ", JLabel.CENTER);
		idTxt = new JTextField(15);
		idPan = new JPanel();
		idPan.add(idLab);
		idPan.add(idTxt);
		
		passLab = new JLabel("비밀번호 : ");
		passTxt = new JTextField(15);
		passPan = new JPanel();
		passPan.add(passLab);
		passPan.add(passTxt);

		nameLab = new JLabel("이 름 : ");
		nameTxt = new JTextField(15);
		namePan = new JPanel();
		namePan.add(nameLab);
		namePan.add(nameTxt);
		
		ssnLab = new JLabel("주민번호 : ");
		ssnTxt = new JTextField(15);
		ssnPan = new JPanel();
		ssnPan.add(ssnLab);
		ssnPan.add(ssnTxt);

		phoneLab = new JLabel("전 화 : ");
		phoneTxt = new JTextField(15);
		phonePan = new JPanel();
		phonePan.add(phoneLab);
		phonePan.add(phoneTxt);
		
		emailLab = new JLabel("이메일 : ");
		emailTxt = new JTextField(15);
		emailPan = new JPanel();
		emailPan.add(emailLab);
		emailPan.add(emailTxt);

		addrLab = new JLabel("주 소 : ");
		addrTxt = new JTextField(15);
		addrPan = new JPanel();
		addrPan.add(addrLab);
		addrPan.add(addrTxt);


		centerPan = new JPanel();
		centerPan.setLayout(new GridLayout(8, 1));
		centerPan.add(combo);
		centerPan.add(idPan);
		centerPan.add(passPan);
		centerPan.add(namePan);
		centerPan.add(ssnPan);
		centerPan.add(phonePan);
		centerPan.add(emailPan);
		centerPan.add(addrPan);
		

		addBtn = new JButton("추가");
		addBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MemberBean user=new UserBean();
				user.setName(nameTxt.getText());
				user.setUserId(idTxt.getText());
				user.setPassword(passTxt.getText());
				user.setSsn(ssnTxt.getText());
				user.setAddr(addrTxt.getText());
				user.setPhone(phoneTxt.getText());
				user.setEmail(emailTxt.getText());
				MemberBean staff=new StaffBean();
				staff.setName(nameTxt.getText());
				staff.setUserId(idTxt.getText());
				staff.setPassword(passTxt.getText());
				staff.setSsn(ssnTxt.getText());
				staff.setAddr(addrTxt.getText());
				staff.setPhone(phoneTxt.getText());
				staff.setEmail(emailTxt.getText());
				if(((String) combo.getSelectedItem()).equals(menu[0])) {
					MemberController.getInstance().join((UserBean) user);
				}else {
					AdminController.getInstance().add((StaffBean) staff);
				}
			}
		});
		

		bottomPan = new JPanel();
		bottomPan.add(addBtn);
		
		add(topLab, "North");
		add(centerPan, "Center");
		add(bottomPan, "South");
	}
}