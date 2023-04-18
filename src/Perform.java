class Perform{
public class PerformMethed<Icon_hinten, Geld_Stand, Flag_io_1,  Flag_io_2,  Feld_x1,  Feld_y1,  Feld_z1,  Feld_x2,  Feld_y2,  Feld_z2,  String_Pos_2,  text_Pos_2>() {
// io
    private Object Feld_x1;
    private Object Feld_x2;
    private Object Feld_y1;
    private Object Feld_y2;
    private Object Feld_z1;
    private Object Feld_z2;
        String[] String_Pos_1;
        String icon_Pos_1;
        String text_Pos_1;
        String icon_Pos_2;
        if (Flag_io_1 != Flag_io_2){
        if (Feld_z1 == "2"){
                System.out.println("man kann nicht in das intere Regal direkt einlagern oder auslagern");
        }else if (Feld_z2 == "2"){
                System.out.println("man kann nicht in das intere Regal direkt einlagern oder auslagern");
        }else {

        }
            if (Feld_y2 >= 2 && String_Pos_1[4] = "Schwer") {
            System.out.println("man kann schere steine nue in der untersten reihe lagern");
        }else if (String_Pos_2[4] = "Balken" && "" != "String_" + Feld_x2 + Feld_y2 + "2"){
            System.out.println("Der hintere platz muss für balpen frei sein");
        }else if (String_Pos_1[1] == "Auslagerung"){
            System.out.println("Das gesgewählte gegenstand ist nicht identisch mit dem Auftrag");
        }else if (icon_Pos_1 != icon_Pos_2) {
            System.out.println("Das gesgewählte gegenstand ist nicht identisch mit dem Auftrag");
        }else {
            //To do fow io
                if (Flag_io_1 = true) {
                    String icon_R2 = icon_Pos_1;
                    String text_R2 = text_Pos_1;
                    String[] String_R2 = String_Pos_1;
                String icon_R1 = " ";
                String text_AR1 = " ";
                String[] String_R1;
                         String_R1[0] = "";
                         String_R1[1] = "";
                         String_R1[2] = "";
                         String_R1[3] = "";
                         String_R1[4] = "";
                         String_R1[5] = "";
                Geld_Stand += String_Pos_1[5];
                icon_Pos_1 = "";
                icon_Pos_2 = "";
                text_Pos_1 = "";
                text_Pos_2 = "";
                String_Pos_1 [0] = "";
                String_Pos_1 [1] = "";
                String_Pos_1 [2] = "";
                String_Pos_1 [3] = "";
                String_Pos_1 [4] = "";
                String_Pos_1 [5] = "";
                String_Pos_2 [0] = "";
                String_Pos_2 [1] = "";
                String_Pos_2 [2] = "";
                String_Pos_2 [3] = "";
                String_Pos_2 [4] = "";
                String_Pos_2 [5] = "";
                Flag_io_1 = false;
                Flag_io_2 = false;
            }else {
                    String icon_R2 = "";
                    String text_R2 = "";
                    String[] String_R2[];
                    String_R2[0] = "";
                    String_R2[1] = "";
                    String_R2[2] = "";
                    String_R2[3] = "";
                    String_R2[4] = "";
                    String_R2[5] = "";
                    String icon_R1 = " ";
                    String text_AR1 = " ";
                    String[] String_R1[];
                    String_R1[0] = "";
                    String_R1[1] = "";
                    String_R1[2] = "";
                    String_R1[3] = "";
                    String_R1[4] = "";
                    String_R1[5] = "";
                Geld_Stand += String_Pos_2[5];
                icon_Pos_1 = "";
                icon_Pos_2 = "";
                text_Pos_1 = "";
                text_Pos_2 = "";
                String_Pos_1[0] = "";
                String_Pos_1[1] = "";
                String_Pos_1[2] = "";
                String_Pos_1[3] = "";
                String_Pos_1[4] = "";
                String_Pos_1[5] = "";
                String_Pos_2[0] = "";
                String_Pos_2[1] = "";
                String_Pos_2[2] = "";
                String_Pos_2[3] = "";
                String_Pos_2[4] = "";
                String_Pos_2[5] = "";
                Flag_io_1  = false;
                Flag_io_2 = false;
            }
        }}else



    {
        // move
        if (!icon_Pos_2.equals("")) {
            System.out.println("Die ziposition ist bereits belegt");
        }else if (Feld_y2 !="2" && String_Pos_1[4] = "Schwer") {
            System.out.println("Die ziposition kann das Giwicht nicht aushalten");
        }else if (Feld_x1 != Feld_x2 && Feld_y1 != Feld_y2
                | Feld_x1 != Feld_x2  && Feld_z1 != Feld_z2
                | Feld_y1 != Feld_y2  && Feld_z1 != Feld_z2){
            System.out.println("Gegenstände könen unr ein Feld auf einmal bewegt werden");
        }else if (String_Pos_1[4] == "Balken" && Icon_hinten != ""){
            System.out.println("Der hintere platz muss für balpen frei sein");
        }else{
// To do for move
            String icon_R2 = icon_Pos_1;
            String text_R2 = text_Pos_1;
            String[] String_R2 = String_Pos_1;
            String icon_R1 = " ";
            String text_AR1 = " ";
            String[] String_R1[];
            String_R1[0] = "";
            String_R1[1] = "";
            String_R1[2] = "";
            String_R1[3] = "";
            String_R1[4] = "";
            String_R1[5] = "";
            Geld_Stand -= 50;
            icon_Pos_1 = "";
            icon_Pos_2 = "";
            Flag_io_1  = false;
            Flag_io_2 = false;
        }}}}