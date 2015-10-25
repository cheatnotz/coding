import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Created by LAB203-28 on 10/25/2015.
 */
public class Problem3 extends JFrame{
   public static void main(String[] args) {
       ArrayList<Student> studentList = new ArrayList<Student>();

       studentList.add(new Student(56070106,"มารุต","นนท์ขุนทด"));
       studentList.add(new Student(57070035,"ณัฐนันท์","กุลโชควณิช"));
       studentList.add(new Student(56070013,"จันทนีย์","แซ่เลี่ยว"));
       studentList.add(new Student(57070134,"สุทธินัย","บุญยิ่งยงชัย"));
       studentList.add(new Student(57070067,"ปรีชาชาญ","ชอบชน"));
       studentList.add(new Student(57070002,"กฤษฎา","อิงอาน"));
       studentList.add(new Student(57070052,"ธรรศ","แสงสมเรือง"));
       studentList.add(new Student(57070082,"พิสิฐ","ไตรอังกูร"));
       studentList.add(new Student(57070044,"ธนกฤต","ตั้งดำรงทรัพย์"));
       studentList.add(new Student(57070120,"สถาพร","แดงน้อย"));
       studentList.add(new Student(56070085,"ปองพล","จันทโพธิ์"));
       studentList.add(new Student(57070026,"ชยุต","รักสมยา"));
       studentList.add(new Student(57070078,"พัชรพล","โสภณ"));
       studentList.add(new Student(57070021,"จิระพัฒน์","กึ่งวงษ์"));
       studentList.add(new Student(57070075,"พชร","ไชยเจริญ"));
       studentList.add(new Student(57070039,"ต้นสาย","สิงห์กังวาน"));
       studentList.add(new Student(57070030,"ชุติภา","บุญประเสริฐ"));
       studentList.add(new Student(57070150,"เอื้อมพร","รักกำเหนิด"));
       studentList.add(new Student(57070065,"ปทิตตา","สุวรรณฤกษ์"));
       studentList.add(new Student(57070012,"เขมทัต","บุตรฉิม"));
       studentList.add(new Student(57070125,"สัฟวัน","แปเราะ"));
       studentList.add(new Student(57070010,"กุลธิดา","ขันแก้ว"));
       studentList.add(new Student(56070067,"ธีรฉัตร","ต้นแก้ว"));
       studentList.add(new Student(57070020,"จิรสิน","ปัญญาวิสุทธิชัย"));
       studentList.add(new Student(57070046,"ธนพรรธน์","ธนวัฒน์ปัญญา"));
       studentList.add(new Student(56070019,"จุฑาทิพย์","บุญเฉื่อย"));
       studentList.add(new Student(57070080,"พิพัฒน์","เสวย"));
       studentList.add(new Student(57070027,"ชัญญานุช","กิ่มเปี่ยม"));
       studentList.add(new Student(57070057,"ธีระวัฒน์","ธีระธำรงรักษ์"));
       studentList.add(new Student(57070114,"ศุภกิตติ์","เจิ้ง"));
       studentList.add(new Student(57070123,"สรัล","แขดวง"));
       studentList.add(new Student(57070086,"ภัทรพล","แก้วกุศลวิวัฒน์"));
       studentList.add(new Student(57070117,"ศุภวิชญ์","เกตุมาก"));
       studentList.add(new Student(57070113,"ศุทธินี","จันทรศิริ"));
       studentList.add(new Student(57070124,"สรัลดา","ฝูงใหญ่"));
       studentList.add(new Student(57070105,"วรุตม์","วัฒนกิจรุ่งโรจน์"));
       studentList.add(new Student(57070066,"ปรัชญาวิช","เรามานะ"));
       studentList.add(new Student(57070040,"ไตรปฎก","อินทสุวรรณ"));
       studentList.add(new Student(57070029,"ชานิวัฒน์","แสงไชย"));
       studentList.add(new Student(57070126,"สาธิกา","ลิมะวิรัชพงษ์"));
       studentList.add(new Student(57070063,"เบญจรัตน์","รอดกร"));
       studentList.add(new Student(56070116,"วรพล","บุญทรัพย์"));
       studentList.add(new Student(57070017,"จิธารา","วิจิตรบุญชูวงศ์"));
       studentList.add(new Student(57070085,"ภฤศ","วิบูลฤทธิ์"));
       studentList.add(new Student(56070031,"ฐิติพงศ์","นนทะโคตร"));
       studentList.add(new Student(56070084,"ประดับดาว","เพชรพลายงาม"));
       studentList.add(new Student(57070135,"สุภัสกรณ์","จิรโชคนุเคราะห์"));
       studentList.add(new Student(57070076,"พชร","ลีละวงศ์พานิช"));
       studentList.add(new Student(57070133,"สุชานันท์","ฉันท์เรืองวณิชย์"));
       studentList.add(new Student(56070081,"ปกรณ์","เมฆศิรินภาพงศ์"));
       studentList.add(new Student(57070101,"วรดี","สันติวโรทัย"));
       studentList.add(new Student(57070004,"กานต์","เนียมจันทร์"));
       studentList.add(new Student(57070015,"จักรภัทร","แก้วทอง"));
       studentList.add(new Student(57070022,"จิรัฏฐ์","อัครสุวรรณชัย"));
       studentList.add(new Student(57070129,"สาลินี","ทีอำไพ"));
       studentList.add(new Student(57070028,"ชาตรี","ฐิตานุวงศ์"));
       studentList.add(new Student(57070148,"อิทธิพัทธ์","ฉิมหิรัญ"));
       studentList.add(new Student(56070074,"นราวิทย์","ศรพลทัน"));
       studentList.add(new Student(57070143,"อภิชา","อินทรพรห์ม"));
       studentList.add(new Student(57070073,"พงศ์ณเรศ","ชูทอง"));
       studentList.add(new Student(57070009,"กิตติศักดิ์","เตชะเรืองสุวรรณ"));
       studentList.add(new Student(57070037,"ณัฐวุฒิ","กรวิศิษฎ์วาทิน"));
       studentList.add(new Student(57070111,"ศาสตรา","ตัณฑ์ศุภศิริ"));
       studentList.add(new Student(57070094,"มธุริน","สังขวิจิตร"));
       studentList.add(new Student(57070008,"กิตติศักดิ์","แก้วน่าน"));
       studentList.add(new Student(57070050,"ธนาวัฒน์","รักสมบัติ"));
       studentList.add(new Student(57070061,"บุณฑริกา","โพชฌงค์เดช"));
       studentList.add(new Student(57070054,"ธาราทิพย์","มาลัยมาลย์"));
       studentList.add(new Student(57070056,"ธีรโชติ","จิวะรังสินี"));
       studentList.add(new Student(57070001,"กนกพล","นิลเพชร"));
       studentList.add(new Student(57070059,"นวพร","พ่วงสายกิ่ม"));
       studentList.add(new Student(57070139,"อชิรญา","ทรงพุฒิ"));
       studentList.add(new Student(57070115,"ศุภณัฐ","สวนทวี"));
       studentList.add(new Student(57070055,"ธิปก","ลายรัศมี"));
       studentList.add(new Student(56070046,"ณิธยาน์","สกลพิสิษฐ์"));
       studentList.add(new Student(57070099,"รังสิมันต์","แสนประเสริฐ"));
       studentList.add(new Student(56070115,"วณัฐพงศ์","เชาวน์รัตนะ"));
       studentList.add(new Student(57070006,"กิจธนา","ชยางศุ"));
       studentList.add(new Student(57070110,"ศกานต์","พรหมลายนาค"));
       studentList.add(new Student(57070045,"ธนกฤต","ปิ่นทะนา"));
       studentList.add(new Student(57070048,"ธนัญญา","ธำรงธัญวงศ์"));
       studentList.add(new Student(57070091,"ภานุวัต","หัวใจ"));
       studentList.add(new Student(57070031,"ฐิติ","จันทมงคลเลิศ"));
       studentList.add(new Student(57070145,"อมิตา","มงคลปรีดาไชย"));
       studentList.add(new Student(57070047,"ธนรัช","ตะสาริกา"));
       studentList.add(new Student(57070074,"พงศธร","สังข์ยิ้ม"));
       studentList.add(new Student(57070132,"สุชัจจ์","จงประสิทธิ์"));
       studentList.add(new Student(57070088,"ภาคภูมิ","จรัสพันธุ์"));
       studentList.add(new Student(57070060,"นัชชา","โรจนประเสริฐ"));
       studentList.add(new Student(57070130,"สิทธิชัย","มะศิริ"));
       studentList.add(new Student(57070121,"สยามรัฐ","สุภาวะกุล"));
       studentList.add(new Student(57070127,"สาธิต","ศิริหงษ์ทอง"));
       studentList.add(new Student(57070018,"จิรทีปต์","ทาทิพย์"));
       studentList.add(new Student(57070068,"ปวริศา","ทองเงิน"));
       studentList.add(new Student(57070096,"เมธิชัย","อรัญชราธร"));
       studentList.add(new Student(57070007,"กิตติทัต","ภวรัญชนกุล"));
       studentList.add(new Student(57070142,"อภิชัย","ตันตสิรินทร์"));
       studentList.add(new Student(57070033,"ณัฐกิตติ์","วัยวัฒน์ภัทรกุล"));
       studentList.add(new Student(57070025,"ธนวัฒน์","กุสูงเนิน"));
       studentList.add(new Student(57070042,"ทศพล","อยู่สุข"));
       studentList.add(new Student(57070049,"ธนาภา","ธำรงธัญวงศ์"));
       studentList.add(new Student(57070053,"ธัชกร","จอมอุตม์"));
       studentList.add(new Student(57070149,"อินทุภรณ์","อินทรสุวรรณ"));
       studentList.add(new Student(57070038,"ณัฐวุฒิ","วรกิจลาวัลย์"));
       studentList.add(new Student(57070136,"สุมณฑา","สุขพลำ"));
       studentList.add(new Student(57070093,"มงคล","อุ่มออง"));
       studentList.add(new Student(57070041,"ไตรศักดิ์","ไตรเสนีย์"));
       studentList.add(new Student(57070071,"ปยณัฐ","เพ็งชัย"));
       studentList.add(new Student(57070077,"พศวัต","พฤกษ์พนาสันต์"));
       studentList.add(new Student(57070146,"อรรคพล","ไชยณรงค์"));
       studentList.add(new Student(57070103,"วรพงษ์","มาลัยวงษ์"));
       studentList.add(new Student(57070098,"รเมศ","ยังดำ"));
       studentList.add(new Student(57070087,"ภัทรภูมิ","ศิริคำ"));
       studentList.add(new Student(57070107,"วิรุฬห์","ลีลาชัย"));
       studentList.add(new Student(57070137,"เสกสรรค์","เนรมิตธนสมบัติ"));
       studentList.add(new Student(57070083,"พีรณัฐ","ฤกษ์ศุภสมพล"));
       studentList.add(new Student(57070062,"บุษกร","ยวงเงิน"));
       studentList.add(new Student(57070011,"ขนิษฐา","วิเศษถวัลย์"));
       studentList.add(new Student(57070079,"พิชัย","สิวะวัฒน์"));
       studentList.add(new Student(57070128,"สาริศ","สิทธิชอบธรรม"));
       studentList.add(new Student(57070019,"จิรวัฒน์","บุญกำเหนิด"));
       studentList.add(new Student(57070051,"ธนู","ชมญาติ"));
       studentList.add(new Student(56070154,"อุกกฤษฏ์","ธีรคุณากร"));
       studentList.add(new Student(57070064,"ปฏิภาณ","ขุนแขวง"));
       studentList.add(new Student(57070013,"คณาธิป","แซ่แพ"));
       studentList.add(new Student(57070084,"พีระพล","กุลธรรมโยธิน"));
       studentList.add(new Student(57070140,"อดิศร","ศรีภัคไพสิฐ"));
       studentList.add(new Student(57070109,"วิสรรทูร","แจ้งวงษ์วรัศ"));
       studentList.add(new Student(57070141,"อธิวัฒน์","วรศักดิ์สิริกุล"));
       studentList.add(new Student(57070119,"ศุภาวรรณ","คีรินทร์นนท์"));
       studentList.add(new Student(57070144,"อภิสิทธิ์","บุญรัตน์"));
       studentList.add(new Student(57070036,"ณัฐวีร์","ชุติอนุสรณ์ชัย"));
       studentList.add(new Student(57070104,"วรเวทน์","ศิรพัฒน์พงค์"));
       studentList.add(new Student(57070014,"คุณัญญา","ศรีวงษ์"));
       studentList.add(new Student(57070138,"หฤษฏ์","ลีละบรรยงค์"));
       studentList.add(new Student(57070106,"วัฒกร","มะลิขาว"));
       studentList.add(new Student(57070058,"นภัส","ตั้งหลักมงคล"));
       studentList.add(new Student(57070112,"ศิริราช","จันตา"));
       studentList.add(new Student(57070005,"กิ่งกาญจน์","แพรอด"));
       studentList.add(new Student(57070102,"วรพงษ์","บูรณ์พงษ์ทอง"));

        // Create frame
       JFrame frame = new JFrame();
       frame.setTitle("Lab10: Problem3");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setBounds(150, 150, 350, 250);
       frame.setLayout(null);

       // Crate component
       JLabel label1 = new JLabel("Input :");
       frame.add(label1);
       label1.setBounds(20, 20, 60, 20);

       JTextField inputBox = new JTextField();
       frame.add(inputBox);
       inputBox.setBounds(80, 22, 120, 20);

       JButton submitButton = new JButton("Submit");
       frame.add(submitButton);
       submitButton.setBounds(220, 20, 100, 54);

       JLabel label2 = new JLabel("Search by:");
       frame.add(label2);
       label2.setBounds(20, 50, 120, 20);

       JRadioButton oneIncrement = new JRadioButton("First Name");
       frame.add(oneIncrement);
       oneIncrement.setBounds(100, 50, 100, 50);

       JRadioButton twoIncrement = new JRadioButton("Last Name");
       frame.add(twoIncrement);
       twoIncrement.setBounds(100, 90, 100, 50);

       ButtonGroup incrementGroup = new ButtonGroup();
       incrementGroup.add(oneIncrement);
       incrementGroup.add(twoIncrement);
       oneIncrement.setSelected(true);


       // Action
       submitButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               int choose = 1;
               int found = 0;
               if(twoIncrement.isSelected()) choose = 2;
               String message = inputBox.getText();
               if(choose == 1) {
                   for(int i = 0; i < studentList.size(); i++){
                       if(message.equals(studentList.get(i).getFirstname())) {
                           JOptionPane.showMessageDialog(
                                   frame,
                                   String.format("%d: %s %s", studentList.get(i).getId(), studentList.get(i).getFirstname(), studentList.get(i).getLastname()),
                                   "Foundasd",
                                   JOptionPane.INFORMATION_MESSAGE
                           );
                           found = 1;
                           break;
                       }
                   }
               }
               else if(choose == 2){
                   for(int i = 0; i < studentList.size(); i++){
                       if(message.equals(studentList.get(i).getLastname())) {
                           JOptionPane.showMessageDialog(
                                   frame,
                                   String.format("%d: %s %s", studentList.get(i).getId(), studentList.get(i).getFirstname(), studentList.get(i).getLastname()),
                                   "Found",
                                   JOptionPane.INFORMATION_MESSAGE
                           );
                           found = 1;
                           break;
                       }
                   }
               }

               if(found != 1) {
                   JOptionPane.showMessageDialog(
                           frame,
                           "ค้นหาไม่พบ",
                           "Not Found",
                           JOptionPane.ERROR_MESSAGE
                   );
               }



           }
           }

           );

           // Show
           frame.setVisible(true);

       }


   }
