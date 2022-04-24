/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duLieu;

/**
 *
 * @author hung
 */
public class ChuanHoaDuLieu {
     public boolean checkEmail(String email){
	String regexEmail = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        return email.matches(regexEmail);
  }	

  public final boolean  checkPhoneNumber(String phoneNumber){
	String regexPN = "0[0-9\\s.-]{9,13}";
	return phoneNumber.matches(regexPN);
  }

 public final boolean checkDate(String date){
	String regexDate = "^\\d{2}[-|/]\\d{2}[-|/]\\d{4}$";
        return date.matches(regexDate);
}
 public final String chuanHoa(String str) {
    str = str.trim(); 
    str = str.replaceAll("\\s+", " ");
      return str;
  }

 public final String chuanHoaDanhTuRieng(String str) {
      str = chuanHoa(str);
      String temp[] = str.split(" ");
      str = ""; // ? ^-^
      for (int i = 0; i < temp.length; i++) {
          str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
          if (i < temp.length - 1) // ? ^-^
              str += " ";
      }
      return str;
 }
}
