import javax.swing.JOptionPane;
public class UserPass {
public static void main(String[] args) {
// TODO Auto-generated method stub 
String[] uInput = {"Admin","Student", "Staff"};
String[] pInput = {"NotAdmin", "Stoodunt", "Janitor"};
String userPut = JOptionPane.showInputDialog("Enter account type");
String passPut;
int tries = 0;
int posi = 0;
while (tries<3){
switch (userPut) {
case "Admin":
passPut = JOptionPane.showInputDialog("Enter Password");
if (passPut.equals("NotAdmin")) {
JOptionPane.showMessageDialog(null, "Welome Admin! You can read and update files.");
tries = 4;
break; }
else {
while (passPut!="NotAdmin") {
tries++;
																																																																							JOptionPane.showMessageDialog(null, "Wrong password.");
																																																																													if (tries==3){
																																																																																				break;
																																																																																										}
																																																																																																break;
																																																																																																					}
																																																																																																										break;
																																																																																																														}
																																																																																																																	case "Student":
																																																																																																																					passPut = JOptionPane.showInputDialog("Enter Password");
																																																																																																																									if (passPut.equals("Stoodunt")) {
																																																																																																																														JOptionPane.showMessageDialog(null, "Welome Student! You can read files.");
																																																																																																																																			tries = 4;
																																																																																																																																								break;
																																																																																																																																												}
																																																																																																																																																else {
																																																																																																																																																					while (passPut!="Stoodunt") {
																																																																																																																																																										tries++;
																																																																																																																																																															JOptionPane.showMessageDialog(null, "Wrong password.");
																																																																																																																																																																				if (tries==3){
																																																																																																																																																																										break;
																																																																																																																																																																															}
																																																																																																																																																																																				break;
																																																																																																																																																																																									}
																																																																																																																																																																																														break;
																																																																																																																																																																																																		}
																																																																																																																																																																																																					case "Staff":
																																																																																																																																																																																																									passPut = JOptionPane.showInputDialog("Enter Password");
																																																																																																																																																																																																													if (passPut.equals("Janitor")) {
																																																																																																																																																																																																																		JOptionPane.showMessageDialog(null, "Welome Staff! You can read, update, add, and delete files.");
																																																																																																																																																																																																																							tries = 4;
																																																																																																																																																																																																																												break;
																																																																																																																																																																																																																																}
																																																																																																																																																																																																																																				else {
																																																																																																																																																																																																																																									while (passPut!="Janitor"){
																																																																																																																																																																																																																																														tries++;
																																																																																																																																																																																																																																																			JOptionPane.showMessageDialog(null, "Wrong password.");
																																																																																																																																																																																																																																																								if (tries==3){
																																																																																																																																																																																																																																																														break;
																																																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																																																								break;
																																																																																																																																																																																																																																																																													}
																																																																																																																																																																																																																																																																																		break;
																																																																																																																																																																																																																																																																																						}
																																																																																																																																																																																																																																																																																									default:
																																																																																																																																																																																																																																																																																													tries++;
																																																																																																																																																																																																																																																																																																	userPut = JOptionPane.showInputDialog("Invalid account type. Enter account type.");
																																																																																																																																																																																																																																																																																																				}
																																																																																																																																																																																																																																																																																																						
																																																																																																																																																																																																																																																																																																								if (tries==3){
																																																																																																																																																																																																																																																																																																											JOptionPane.showMessageDialog(null, "Contact Administrator");
																																																																																																																																																																																																																																																																																																														break;
																																																																																																																																																																																																																																																																																																																}
																																																																																																																																																																																																																																																																																																																			}
																																																																																																																																																																																																																																																																																																																					}
																																																																																																																																																																																																																																																																																																																					}
