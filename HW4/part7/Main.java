/* *** This file is given as part of the programming assignment. *** */

public class Main {

    public static void main(String [] args) {

    // instantiate some elements
    IntSeq i1 = new IntSeq();
    IntSeq i2 = new IntSeq();
    IntSeq i3 = new IntSeq(88);
    IntSeq i4 = new IntSeq(97, 55);
    IntSeq i5 = new IntSeq(102, 103, 101, 107, 109);
    IntSeq i6 = new IntSeq(41, 42, 43, 44);
    IntSeq i9 = new IntSeq(3, 14, 9, 9, 3, 14, 11, 3, 99, 11, -6);
    CharSeq s1 = new CharSeq("abc");
    CharSeq s2 = new CharSeq("");
    CharSeq s3 = new CharSeq("abcdefghijklmnopqrstuvwxyz0123456789");
    CharSeq s4 = new CharSeq("abcdefghijklmnopqrstuvwx");
    CharSeq s5 = new CharSeq("XYZ");
    CharSeq s6 = new CharSeq("a123b");
    CharSeq s7 = new CharSeq("hohoho");
    CharSeq s8 = new CharSeq("h");
    CharSeq s9 = new CharSeq("a!@#$%^&*()_+=-=+-_)(*&^%$#@!h");
        // do everything twice just to double check
        for( int i = 0; i < 2; i++) {
            
             System.out.print( "i1" + ":"); 
             System.out.print(i1); 
             System.out.println(":"); 
             System.out.println( "(Seq)i1 instanceof CharSeq" + ":" + ((Seq)i1 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)i1 instanceof IntSeq" + ":" + ((Seq)i1 instanceof IntSeq) + ":");
            
             System.out.print( "i2" + ":"); 
             System.out.print(i2); 
             System.out.println(":"); 
             System.out.println( "(Seq)i2 instanceof CharSeq" + ":" + ((Seq)i2 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)i2 instanceof IntSeq" + ":" + ((Seq)i2 instanceof IntSeq) + ":");
            
             System.out.print( "i3" + ":"); 
             System.out.print(i3); 
             System.out.println(":"); 
             System.out.println( "(Seq)i3 instanceof CharSeq" + ":" + ((Seq)i3 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)i3 instanceof IntSeq" + ":" + ((Seq)i3 instanceof IntSeq) + ":");
            
             System.out.print( "i4" + ":"); 
             System.out.print(i4); 
             System.out.println(":"); 
             System.out.println( "(Seq)i4 instanceof CharSeq" + ":" + ((Seq)i4 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)i4 instanceof IntSeq" + ":" + ((Seq)i4 instanceof IntSeq) + ":");
            
             System.out.print( "i5" + ":"); 
             System.out.print(i5); 
             System.out.println(":"); 
             System.out.println( "(Seq)i5 instanceof CharSeq" + ":" + ((Seq)i5 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)i5 instanceof IntSeq" + ":" + ((Seq)i5 instanceof IntSeq) + ":");
            
             System.out.print( "i6" + ":"); 
             System.out.print(i6); 
             System.out.println(":"); 
             System.out.println( "(Seq)i6 instanceof CharSeq" + ":" + ((Seq)i6 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)i6 instanceof IntSeq" + ":" + ((Seq)i6 instanceof IntSeq) + ":");
            
             System.out.print( "s1" + ":"); 
             System.out.print(s1); 
             System.out.println(":"); 
             System.out.println( "(Seq)s1 instanceof CharSeq" + ":" + ((Seq)s1 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)s1 instanceof IntSeq" + ":" + ((Seq)s1 instanceof IntSeq) + ":");
            
             System.out.print( "s2" + ":"); 
             System.out.print(s2); 
             System.out.println(":"); 
             System.out.println( "(Seq)s2 instanceof CharSeq" + ":" + ((Seq)s2 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)s2 instanceof IntSeq" + ":" + ((Seq)s2 instanceof IntSeq) + ":");
            
             System.out.print( "s3" + ":"); 
             System.out.print(s3); 
             System.out.println(":"); 
             System.out.println( "(Seq)s3 instanceof CharSeq" + ":" + ((Seq)s3 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)s3 instanceof IntSeq" + ":" + ((Seq)s3 instanceof IntSeq) + ":");
            
             System.out.print( "s4" + ":"); 
             System.out.print(s4); 
             System.out.println(":"); 
             System.out.println( "(Seq)s4 instanceof CharSeq" + ":" + ((Seq)s4 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)s4 instanceof IntSeq" + ":" + ((Seq)s4 instanceof IntSeq) + ":");
            
             System.out.print( "s5" + ":"); 
             System.out.print(s5); 
             System.out.println(":"); 
             System.out.println( "(Seq)s5 instanceof CharSeq" + ":" + ((Seq)s5 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)s5 instanceof IntSeq" + ":" + ((Seq)s5 instanceof IntSeq) + ":");
            
             System.out.print( "s6" + ":"); 
             System.out.print(s6); 
             System.out.println(":"); 
             System.out.println( "(Seq)s6 instanceof CharSeq" + ":" + ((Seq)s6 instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)s6 instanceof IntSeq" + ":" + ((Seq)s6 instanceof IntSeq) + ":");
        }
        //check a bit more
        Seq x;
        x = s3;
        
             System.out.print( "x" + ":"); 
             System.out.print(x); 
             System.out.println(":"); 
             System.out.println( "(Seq)x instanceof CharSeq" + ":" + ((Seq)x instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)x instanceof IntSeq" + ":" + ((Seq)x instanceof IntSeq) + ":");
        x = i4;
        
             System.out.print( "x" + ":"); 
             System.out.print(x); 
             System.out.println(":"); 
             System.out.println( "(Seq)x instanceof CharSeq" + ":" + ((Seq)x instanceof CharSeq) + ":"); 
             System.out.println( "(Seq)x instanceof IntSeq" + ":" + ((Seq)x instanceof IntSeq) + ":");
        // okay, if you're still not convinced ...
        Seq [] b = new Seq[8];
        b[0] = new CharSeq("first");
        b[1] = new IntSeq(77, 78, 79);
        b[2] = new IntSeq(81, 82);
        b[3] = new CharSeq("middle");
        b[4] = new IntSeq();
        b[5] = new IntSeq(10, 1, 2, 3, 4, 5, 10, -1, -2, -3, -4);
        b[6] = new CharSeq("");
        b[7] = new CharSeq("last");
        for (int k = 0; k < 2*b.length; k++) {
            System.out.println( "b[k%b.length]" + ":" + (b[k%b.length]) + ":");
        }
        // check out copying --
        // this should work w/o any effort b/c a String is immutable
        String m = "abcde";
        CharSeq s11 = new CharSeq(m);
        System.out.println( "s11" + ":" + (s11) + ":");
        m = "fghij";
        System.out.println( "s11" + ":" + (s11) + ":"); // should show "abcde", not "fghij"
        CharSeq s12 = new CharSeq(m);
        System.out.println( "s12" + ":" + (s12) + ":");
        System.out.println( "s11" + ":" + (s11) + ":"); // should still show "abcde"
        System.out.println( "i1.posMax()" + ":" + (i1.posMax()) + ":");
        System.out.println( "i2.posMax()" + ":" + (i2.posMax()) + ":");
        System.out.println( "i3.posMax()" + ":" + (i3.posMax()) + ":");
        System.out.println( "i4.posMax()" + ":" + (i4.posMax()) + ":");
        System.out.println( "i5.posMax()" + ":" + (i5.posMax()) + ":");
        System.out.println( "i6.posMax()" + ":" + (i6.posMax()) + ":");
        System.out.println( "s1.posMax()" + ":" + (s1.posMax()) + ":");
        System.out.println( "s2.posMax()" + ":" + (s2.posMax()) + ":");
        System.out.println( "s3.posMax()" + ":" + (s3.posMax()) + ":");
        System.out.println( "s4.posMax()" + ":" + (s4.posMax()) + ":");
        System.out.println( "s5.posMax()" + ":" + (s5.posMax()) + ":");
        System.out.println( "s6.posMax()" + ":" + (s6.posMax()) + ":");
        for (int k = 0; k < 2*b.length; k++) {
            System.out.println( "b[k%b.length].posMax()" + ":" + (b[k%b.length].posMax()) + ":");
        }
        System.out.println( "(new CharSeq( \"abcbabababababdbababdbadbaddbabad\" )).posMax()" + ":" + ((new CharSeq( "abcbabababababdbababdbadbaddbabad" )).posMax()) + ":");
        System.out.println( "(new CharSeq( \"abcbabababababdbababdbadbaddbabade\")).posMax()" + ":" + ((new CharSeq( "abcbabababababdbababdbadbaddbabade")).posMax()) + ":");
        System.out.println( "(new CharSeq(\"fabcbabababababdbababdbadbaddbabade\")).posMax()" + ":" + ((new CharSeq("fabcbabababababdbababdbadbaddbabade")).posMax()) + ":");
        System.out.println( "(new IntSeq( 1, 2, 2, 6, 3, 4, 3, 2, 2, 5, 6) ).posMax()" + ":" + ((new IntSeq( 1, 2, 2, 6, 3, 4, 3, 2, 2, 5, 6) ).posMax()) + ":");
        System.out.println( "(new IntSeq( 1, 2, 2, 6, 3, 4, 3, 2, 2, 5, 6, 7)).posMax()" + ":" + ((new IntSeq( 1, 2, 2, 6, 3, 4, 3, 2, 2, 5, 6, 7)).posMax()) + ":");
        System.out.println( "(new IntSeq(9, 1, 2, 2, 6, 3, 4, 3, 2, 2, 5, 6, 7)).posMax()" + ":" + ((new IntSeq(9, 1, 2, 2, 6, 3, 4, 3, 2, 2, 5, 6, 7)).posMax()) + ":");
        // iterators
        System.out.print( "myprints(s1)" + ":"); 
             myprints(s1); 
             System.out.println(":");
        System.out.print( "myprints(s2)" + ":"); 
             myprints(s2); 
             System.out.println(":");
        System.out.print( "myprints(s3)" + ":"); 
             myprints(s3); 
             System.out.println(":");
        System.out.print( "myprints(s4)" + ":"); 
             myprints(s4); 
             System.out.println(":");
        System.out.print( "myprints(s5)" + ":"); 
             myprints(s5); 
             System.out.println(":");
        System.out.print( "myprints(s6)" + ":"); 
             myprints(s6); 
             System.out.println(":");
        System.out.print( "myprinti(i1)" + ":"); 
             myprinti(i1); 
             System.out.println(":");
        System.out.print( "myprinti(i2)" + ":"); 
             myprinti(i2); 
             System.out.println(":");
        System.out.print( "myprinti(i3)" + ":"); 
             myprinti(i3); 
             System.out.println(":");
        System.out.print( "myprinti(i4)" + ":"); 
             myprinti(i4); 
             System.out.println(":");
        System.out.print( "myprinti(i5)" + ":"); 
             myprinti(i5); 
             System.out.println(":");
        System.out.print( "myprinti(i6)" + ":"); 
             myprinti(i6); 
             System.out.println(":");
        System.out.print( "mycrosss(s1,s1)" + ":"); 
             mycrosss(s1,s1); 
             System.out.println(":");
        System.out.print( "mycrosss(s1,s2)" + ":"); 
             mycrosss(s1,s2); 
             System.out.println(":");
        System.out.print( "mycrosss(s2,s2)" + ":"); 
             mycrosss(s2,s2); 
             System.out.println(":");
        System.out.print( "mycrosss(s5,s4)" + ":"); 
             mycrosss(s5,s4); 
             System.out.println(":");
        System.out.print( "mycrosss(s5,s6)" + ":"); 
             mycrosss(s5,s6); 
             System.out.println(":");
        System.out.print( "mycrosss(s6,s6)" + ":"); 
             mycrosss(s6,s6); 
             System.out.println(":");
        System.out.print( "mycrosss(s1,s3)" + ":"); 
             mycrosss(s1,s3); 
             System.out.println(":");
        System.out.print( "mycrosss(s3,s3)" + ":"); 
             mycrosss(s3,s3); 
             System.out.println(":");
        System.out.print( "mycrosss(s3,s3)" + ":"); 
             mycrosss(s3,s3); 
             System.out.println(":");
        System.out.print( "mycrossi(i1,i3)" + ":"); 
             mycrossi(i1,i3); 
             System.out.println(":");
        System.out.print( "mycrossi(i3,i1)" + ":"); 
             mycrossi(i3,i1); 
             System.out.println(":");
        System.out.print( "mycrossi(i1,i1)" + ":"); 
             mycrossi(i1,i1); 
             System.out.println(":");
        System.out.print( "mycrossi(i6,i1)" + ":"); 
             mycrossi(i6,i1); 
             System.out.println(":");
        System.out.print( "mycrossi(i1,i6)" + ":"); 
             mycrossi(i1,i6); 
             System.out.println(":");
        System.out.print( "mycrossi(i2,i3)" + ":"); 
             mycrossi(i2,i3); 
             System.out.println(":");
        System.out.print( "mycrossi(i3,i2)" + ":"); 
             mycrossi(i3,i2); 
             System.out.println(":");
        System.out.print( "mycrossi(i1,i5)" + ":"); 
             mycrossi(i1,i5); 
             System.out.println(":");
        System.out.print( "mycrossi(i4,i5)" + ":"); 
             mycrossi(i4,i5); 
             System.out.println(":");
        System.out.print( "mycrossi(i4,i4)" + ":"); 
             mycrossi(i4,i4); 
             System.out.println(":");
        System.out.print( "mycrossi(i5,i5)" + ":"); 
             mycrossi(i5,i5); 
             System.out.println(":");
 try {
     System.out.println("test of calling CharSeqIt"
               +" too many times");
         CharSeqIt si = new CharSeqIt(new CharSeq("cat"));
     System.out.println( "si.next()" + ":" + (si.next()) + ":");
     System.out.println( "si.next()" + ":" + (si.next()) + ":");
     System.out.println( "si.next()" + ":" + (si.next()) + ":");
     System.out.println( "si.next()" + ":" + (si.next()) + ":");
     System.out.println( "si.next()" + ":" + (si.next()) + ":");
     System.out.println( "si.next()" + ":" + (si.next()) + ":");
 }
        catch (UsingIteratorPastEndException e) {
            System.out.println("= caught UsingIteratorPastEndException from CharSeqIt");
        }
        try {
            System.out.println("test of calling IntSeqIt"
                  +" too many times");
        IntSeqIt ii = new IntSeqIt(new IntSeq(51, 52));
     System.out.println( "ii.next()" + ":" + (ii.next()) + ":");
     System.out.println( "ii.next()" + ":" + (ii.next()) + ":");
     System.out.println( "ii.next()" + ":" + (ii.next()) + ":");
     System.out.println( "ii.next()" + ":" + (ii.next()) + ":");
 }
        catch (UsingIteratorPastEndException e) {
            System.out.println("= caught UsingIteratorPastEndException from IntSeqIt");
        }
        System.out.println( "CharSeqUser.posMax1(s1)" + ":" + (CharSeqUser.posMax1(s1)) + ":");
        System.out.println( "CharSeqUser.posMax1(s2)" + ":" + (CharSeqUser.posMax1(s2)) + ":");
        System.out.println( "CharSeqUser.posMax1(s3)" + ":" + (CharSeqUser.posMax1(s3)) + ":");
        System.out.println( "CharSeqUser.posMax1(s4)" + ":" + (CharSeqUser.posMax1(s4)) + ":");
        System.out.println( "CharSeqUser.posMax1(s5)" + ":" + (CharSeqUser.posMax1(s5)) + ":");
        System.out.println( "CharSeqUser.posMax1(s6)" + ":" + (CharSeqUser.posMax1(s6)) + ":");
        System.out.println( "CharSeqUser.posMax2(s1)" + ":" + (CharSeqUser.posMax2(s1)) + ":");
        System.out.println( "CharSeqUser.posMax2(s2)" + ":" + (CharSeqUser.posMax2(s2)) + ":");
        System.out.println( "CharSeqUser.posMax2(s3)" + ":" + (CharSeqUser.posMax2(s3)) + ":");
        System.out.println( "CharSeqUser.posMax2(s4)" + ":" + (CharSeqUser.posMax2(s4)) + ":");
        System.out.println( "CharSeqUser.posMax2(s5)" + ":" + (CharSeqUser.posMax2(s5)) + ":");
        System.out.println( "CharSeqUser.posMax2(s6)" + ":" + (CharSeqUser.posMax2(s6)) + ":");
        // test minus
        System.out.println( "Minus.minus(s1,s1)" + ":" + (Minus.minus(s1,s1)) + ":");
        System.out.println( "Minus.minus(s2,s2)" + ":" + (Minus.minus(s2,s2)) + ":");
        System.out.println( "Minus.minus(s3,s3)" + ":" + (Minus.minus(s3,s3)) + ":");
        System.out.println( "Minus.minus(s4,s4)" + ":" + (Minus.minus(s4,s4)) + ":");
        System.out.println( "Minus.minus(s1,s2)" + ":" + (Minus.minus(s1,s2)) + ":");
        System.out.println( "Minus.minus(s2,s1)" + ":" + (Minus.minus(s2,s1)) + ":");
        System.out.println( "Minus.minus(s3,s4)" + ":" + (Minus.minus(s3,s4)) + ":");
        System.out.println( "Minus.minus(s4,s3)" + ":" + (Minus.minus(s4,s3)) + ":");
        System.out.println( "Minus.minus(s6,s1)" + ":" + (Minus.minus(s6,s1)) + ":");
        System.out.println( "Minus.minus(s1,s6)" + ":" + (Minus.minus(s1,s6)) + ":");
        System.out.println( "Minus.minus(new CharSeq(\"abcdef\"),new CharSeq(\"ebca\"))" + ":" + (Minus.minus(new CharSeq("abcdef"),new CharSeq("ebca"))) + ":");
        System.out.println( "Minus.minus(i1,i1)" + ":" + (Minus.minus(i1,i1)) + ":");
        System.out.println( "Minus.minus(i2,i2)" + ":" + (Minus.minus(i2,i2)) + ":");
        System.out.println( "Minus.minus(i1,i2)" + ":" + (Minus.minus(i1,i2)) + ":");
        System.out.println( "Minus.minus(i2,i1)" + ":" + (Minus.minus(i2,i1)) + ":");
        IntSeq j0 = new IntSeq(0, 1, 2, 3);
        IntSeq j1 = new IntSeq(1, 2, 3, 4);
        IntSeq j2 = new IntSeq(1, 11, -5, 3, 4);
        IntSeq j3 = new IntSeq();
        IntSeq j4 = new IntSeq(1, 11, -6, -3, 4);
        System.out.println( "Minus.minus(j1,j2)" + ":" + (Minus.minus(j1,j2)) + ":");
        System.out.println( "Minus.minus(j2,j1)" + ":" + (Minus.minus(j2,j1)) + ":");
        System.out.println( "Minus.minus(j2,j4)" + ":" + (Minus.minus(j2,j4)) + ":");
        System.out.println( "Minus.minus(j4,j2)" + ":" + (Minus.minus(j4,j2)) + ":");
        System.out.println( "Minus.minus(j1,j3)" + ":" + (Minus.minus(j1,j3)) + ":");
        System.out.println( "Minus.minus(j3,j1)" + ":" + (Minus.minus(j3,j1)) + ":");
        System.out.println( "Minus.minus(j0,s1)" + ":" + (Minus.minus(j0,s1)) + ":");
        System.out.println( "Minus.minus(j1,s1)" + ":" + (Minus.minus(j1,s1)) + ":");
        System.out.println( "Minus.minus(j2,s2)" + ":" + (Minus.minus(j2,s2)) + ":");
        System.out.println( "Minus.minus(s1,j0)" + ":" + (Minus.minus(s1,j0)) + ":");
        System.out.println( "Minus.minus(s1,j1)" + ":" + (Minus.minus(s1,j1)) + ":");
        System.out.println( "Minus.minus(s2,j2)" + ":" + (Minus.minus(s2,j2)) + ":");
        System.out.println( "Minus.minus(j1,s4)" + ":" + (Minus.minus(j1,s4)) + ":");
        System.out.println( "Minus.minus(j2,s3)" + ":" + (Minus.minus(j2,s3)) + ":");
        System.out.println( "Minus.minus(j3,s6)" + ":" + (Minus.minus(j3,s6)) + ":");
        System.out.println( "Minus.minus(j3,s3)" + ":" + (Minus.minus(j3,s3)) + ":");
        System.out.println( "Minus.minus(s6,j3)" + ":" + (Minus.minus(s6,j3)) + ":");
        System.out.println( "Minus.minus(s3,j3)" + ":" + (Minus.minus(s3,j3)) + ":");
        System.out.println( "s9" + ":" + (s9) + ":");
        System.out.println( "i9" + ":" + (i9) + ":");
        System.out.println( "Minus.minus(s9,s9)" + ":" + (Minus.minus(s9,s9)) + ":");
        System.out.println( "Minus.minus(s9,i9)" + ":" + (Minus.minus(s9,i9)) + ":");
        System.out.println( "Minus.minus(i9,s9)" + ":" + (Minus.minus(i9,s9)) + ":");
        System.out.println( "Minus.minus(i9,i9)" + ":" + (Minus.minus(i9,i9)) + ":");
        IntSeq i10 = new IntSeq(-88, 3, 18, 14, 11, 3, 18, 11, -6, -88, -88);
 System.out.println( "i10" + ":" + (i10) + ":");
 System.out.println( "Minus.minus(i9,i10)" + ":" + (Minus.minus(i9,i10)) + ":");
 System.out.println( "Minus.minus(i10,i9)" + ":" + (Minus.minus(i10,i9)) + ":");
        IntSeq w = Minus.minus(i5,i3);
        System.out.println( "w" + ":" + (w) + ":");
        IntSeq u = Minus.minus(i3,i4);
        System.out.println( "u" + ":" + (u) + ":");
        System.out.println( "w" + ":" + (w) + ":");
        System.out.println( "Minus.minus(s7,s8)" + ":" + (Minus.minus(s7,s8)) + ":");
        System.out.println( "Minus.minus(s4,s7)" + ":" + (Minus.minus(s4,s7)) + ":");
        System.out.println( "Minus.minus(Minus.minus(s7,s8),s7)" + ":" + (Minus.minus(Minus.minus(s7,s8),s7)) + ":");
        System.out.println( "Minus.minus(Minus.minus(i5,i3),i4)" + ":" + (Minus.minus(Minus.minus(i5,i3),i4)) + ":");
        System.out.println( "Minus.minus(Minus.minus(i3,i5),i4)" + ":" + (Minus.minus(Minus.minus(i3,i5),i4)) + ":");
        System.out.println( "Minus.minus(Minus.minus(s1,s3),s2)" + ":" + (Minus.minus(Minus.minus(s1,s3),s2)) + ":");
        System.out.println( "Minus.minus(Minus.minus(s6,s1),s2)" + ":" + (Minus.minus(Minus.minus(s6,s1),s2)) + ":");
        System.out.println( "Minus.minus(Minus.minus(s3,s4),s6)" + ":" + (Minus.minus(Minus.minus(s3,s4),s6)) + ":");
        System.out.println( "Minus.minus(Minus.minus(s3,i1),s6)" + ":" + (Minus.minus(Minus.minus(s3,i1),s6)) + ":");
        System.out.println( "Minus.minus(Minus.minus(s3,s6),Minus.minus(s3,s4))" + ":" + (Minus.minus(Minus.minus(s3,s6),Minus.minus(s3,s4))) + ":");
        System.out.println( "F1.ApplyToAll1( upcase, s2 )" + ":" + (F1.ApplyToAll1( upcase, s2 )) + ":");
        System.out.println( "F1.ApplyToAll1( upcase, s1 )" + ":" + (F1.ApplyToAll1( upcase, s1 )) + ":");
        System.out.println( "F1.ApplyToAll1( upcase, s3 )" + ":" + (F1.ApplyToAll1( upcase, s3 )) + ":");
        System.out.println( "F1.ApplyToAll1( upcase, s5 )" + ":" + (F1.ApplyToAll1( upcase, s5 )) + ":");
        System.out.println( "F1.ApplyToAll1( downcase, s2 )" + ":" + (F1.ApplyToAll1( downcase, s2 )) + ":");
        System.out.println( "F1.ApplyToAll1( downcase, s1 )" + ":" + (F1.ApplyToAll1( downcase, s1 )) + ":");
        System.out.println( "F1.ApplyToAll1( downcase, s3 )" + ":" + (F1.ApplyToAll1( downcase, s3 )) + ":");
        System.out.println( "F1.ApplyToAll1( downcase, s5 )" + ":" + (F1.ApplyToAll1( downcase, s5 )) + ":");
        System.out.println( "F2.ApplyToAll2( mydiff, i4, i5 )" + ":" + (F2.ApplyToAll2( mydiff, i4, i5 )) + ":");
        System.out.println( "F2.ApplyToAll2( mydiff, i1, i5 )" + ":" + (F2.ApplyToAll2( mydiff, i1, i5 )) + ":");
        System.out.println( "F2.ApplyToAll2( mydiff, i6, i4 )" + ":" + (F2.ApplyToAll2( mydiff, i6, i4 )) + ":");
        System.out.println( "F2.ApplyToAll2( mydiff, j1, i6 )" + ":" + (F2.ApplyToAll2( mydiff, j1, i6 )) + ":");
        System.out.println( "F2.ApplyToAll2( mydiff, i5, j4 )" + ":" + (F2.ApplyToAll2( mydiff, i5, j4 )) + ":");
        System.out.println( "F2.ApplyToAll2( mymax, i4, i5 )" + ":" + (F2.ApplyToAll2( mymax, i4, i5 )) + ":");
        System.out.println( "F2.ApplyToAll2( mymax, i1, i5 )" + ":" + (F2.ApplyToAll2( mymax, i1, i5 )) + ":");
        System.out.println( "F2.ApplyToAll2( mymax, i6, i4 )" + ":" + (F2.ApplyToAll2( mymax, i6, i4 )) + ":");
        System.out.println( "F2.ApplyToAll2( mymax, j1, i6 )" + ":" + (F2.ApplyToAll2( mymax, j1, i6 )) + ":");
        System.out.println( "F2.ApplyToAll2( mymax, j2, j4 )" + ":" + (F2.ApplyToAll2( mymax, j2, j4 )) + ":");
        System.exit(0);
    }
    private static void myprints(CharSeq s) {
        CharSeqIt si = new CharSeqIt(s);
        while( si.hasNext() ) {
     try {
                System.out.print(si.next() + " ");
     }
            catch (UsingIteratorPastEndException e) {
                System.out.println("myprints oops! caught UsingIteratorPastEndException");
            }
        }
    }
    private static void myprinti(IntSeq i) {
        IntSeqIt ii = new IntSeqIt(i);
        while( ii.hasNext() ) {
     try {
                System.out.print(ii.next() + " ");
     }
            catch (UsingIteratorPastEndException e) {
                System.out.println("myprinti oops! caught UsingIteratorPastEndException");
            }
        }
    }
    private static void mycrosss(CharSeq s1, CharSeq s2) {
        CharSeqIt si1 = new CharSeqIt(s1);
        boolean first = true;
        while ( si1.hasNext() ) {
     try {
                char p1 = si1.next();
                CharSeqIt si2 = new CharSeqIt(s2);
                while ( si2.hasNext() ) {
                    char p2 = si2.next();
                    if ( first ) {
                        first = false;
                        System.out.println();
                    }
                    System.out.println("   " + p1 + " " + p2);
                }
     }
            catch (UsingIteratorPastEndException e) {
                System.out.println("mycrosss oops! caught UsingIteratorPastEndException");
            }
        }
    }
    private static void mycrossi(IntSeq i1, IntSeq i2) {
        IntSeqIt ii1 = new IntSeqIt(i1);
        boolean first = true;
        while ( ii1.hasNext() ) {
            try {
                int p1 = ii1.next();
                IntSeqIt ii2 = new IntSeqIt(i2);
                while ( ii2.hasNext() ) {
                    int p2 = ii2.next();
                    if ( first ) {
                        first = false;
                        System.out.println();
                    }
                    System.out.println("   " + p1 + " " + p2);
                }
     }
            catch (UsingIteratorPastEndException e) {
                System.out.println("mycrossi oops! caught UsingIteratorPastEndException");
            }
        }
    }
    // effect function pointers.
    // each function is represented by an instance of
    // a subclass of AA1 or AA2 class.
    // the AA1 or AA2 class contains just a go method,
    // which is redefined in each subclass.
    public static abstract class AA1 {
        public abstract char go(char c);
    }
    private static AA1 upcase = new AA1Upcase();
    private static class AA1Upcase extends AA1 {
        public char go(char c) {
            return Character.toUpperCase(c);
        }
    }
    private static AA1 downcase = new AA1Downcase();
    private static class AA1Downcase extends AA1 {
        public char go(char c) {
            return Character.toLowerCase(c);
        }
    }
    public static abstract class AA2 {
        public abstract int go(int a, int b);
    }
    private static AA2 mydiff = new AA2Mydiff();
    private static class AA2Mydiff extends AA2 {
        public int go(int a, int b) {
            return a-b;
        }
    }
    // above structure (define object as instance of new subclass of AA2)
    // can be simplified by using anonymous inner class.
    private static AA2 mymax = new AA2() {
        public int go(int a, int b) {
            return (a>b)?a:b;
        }
    };
}
