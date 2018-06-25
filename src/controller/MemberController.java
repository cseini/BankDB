package controller;
import javax.swing.JOptionPane;
import service.*;
import serviceImpl.*;
import domain.*;
public class MemberController {
	private static MemberController instance = new MemberController();
	public static MemberController getInstance() {return instance;}
	private MemberController() {}
	public void join(UserBean member) {
		MemberServiceImpl.getInstance().createUser(member);
	}
	public void updatePass() {
		MemberBean member=new MemberBean();
//		member.setUid(JOptionPane.showInputDialog("아이디"));
//		member.setPass(JOptionPane.showInputDialog("비밀번호"));
		MemberServiceImpl.getInstance().updatePassword(member);
	}
	public void withdrawal() {
		MemberBean member=new MemberBean();
//		member.setUid(JOptionPane.showInputDialog("아이디"));
//		member.setPass(JOptionPane.showInputDialog("비밀번호"));
		MemberServiceImpl.getInstance().deleteMember(member);
	}
	public static void main(String[] args) {

	}
}
