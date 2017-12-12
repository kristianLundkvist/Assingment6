package p6;

/**
 * A class that holds several 2D-integerarray representing characters A-Z, 0-9, +, -, /, *, %, comma, dot, underscore, @ and space.
 * 
 * @author Markus
 * @author Christoffer
 * @author Daniel
 */
public class Chars
{	
	public static int[][] charA(int color)
	{
		int[][] charA = {
				{0,0,color,color,color,0,0},
				{0,color,color,0,color,color,0},
				{color,color,0,0,0,color,color},
				{color,color,color,color,color,color,color},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color}};
		
		return charA;
	}
	
	public static int[][] charB(int color)
	{
		int[][] charB = {
				{color,color,color,color,color,color,0},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{color,color,color,color,color,color,0},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{color,color,color,color,color,color,0}};
		
		return charB;
	}
	
	public static int[][] charC(int color)
	{
		int[][] charC = {
				{0,0,color,color,color,color,0},
				{0,color,color,0,0,0,color},
				{color,color,0,0,0,0,0},
				{color,color,0,0,0,0,0},
				{color,color,0,0,0,0,0},
				{0,color,color,0,0,0,color},
				{0,0,color,color,color,color,0}};
		
		return charC;
	}
	
	public static int[][] charD(int color)
	{
		int[][] charD = {
				{color,color,color,color,color,color,0},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,0,color},
				{color,color,0,0,0,0,color},
				{color,color,0,0,0,0,color},
				{color,color,0,0,0,color,color},
				{color,color,color,color,color,color,0}};
		
		return charD;
	}
	
	public static int[][] charE(int color)
	{
		int[][] charE = {
				{color,color,color,color,color,color,color},
				{color,color,0,0,0,0,color},
				{color,color,0,0,0,0,0},
				{color,color,color,color,color,0,0},
				{color,color,0,0,0,0,0},
				{color,color,0,0,0,0,color},
				{color,color,color,color,color,color,color}};
		
		return charE;
	}
	
	public static int[][] charF(int color)
	{
		int[][] charF = {
				{color,color,color,color,color,color,color},
				{color,color,0,0,0,0,color},
				{color,color,0,0,0,0,0},
				{color,color,color,color,color,0,0},
				{color,color,0,0,0,0,0},
				{color,color,0,0,0,0,0},
				{color,color,0,0,0,0,0}};
		
		return charF;
	}
	
	public static int[][] charG(int color)
	{
		int[][] charG = {
				{0,0,color,color,color,color,0},
				{0,color,color,0,0,color,color},
				{color,color,0,0,0,0,0},
				{color,color,0,0,color,color,color},
				{color,color,0,0,0,0,color},
				{0,color,color,0,0,color,color},
				{0,0,color,color,color,color,0}};
		
		return charG;
	}
	
	public static int[][] charH(int color)
	{
		int[][] charH = {
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{color,color,color,color,color,color,color},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color}};
		
		return charH;
	}
	
	public static int[][] charI(int color)
	{
		int[][] charI = {
				{0,0,color,color,color,0,0},
				{0,0,0,color,0,0,0},
				{0,0,0,color,0,0,0},
				{0,0,0,color,0,0,0},
				{0,0,0,color,0,0,0},
				{0,0,0,color,0,0,0},
				{0,0,color,color,color,0,0}};
		
		return charI;
	}
	
	public static int[][] charJ(int color)
	{
		int[][] charJ = {
				{0,0,0,0,0,color,color},
				{0,0,0,0,0,color,color},
				{0,0,0,0,0,color,color},
				{0,0,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{0,color,0,0,0,color,color},
				{0,0,color,color,color,0,0}};
		
		return charJ;
	}
	
	public static int[][] charK(int color)
	{
		int[][] charK = {
				{color,color,0,0,0,color,color},
				{color,color,0,0,color,color,0},
				{color,color,color,color,color,0,0},
				{color,color,color,color,color,0,0},
				{color,color,0,0,color,color,0},
				{color,color,0,0,0,color,0},
				{color,color,0,0,0,color,color}};
		
		return charK;
	}
	
	public static int[][] charL(int color)
	{
		int[][] charL = {
				{color,color,0,0,0,0,0},
				{color,color,0,0,0,0,0},
				{color,color,0,0,0,0,0},
				{color,color,0,0,0,0,0},
				{color,color,0,0,0,0,0},
				{color,color,0,0,0,color,color},
				{color,color,color,color,color,color,color}};
		
		return charL;
	}
	
	public static int[][] charM(int color)
	{
		int[][] charM = {
				{color,color,0,0,0,color,color},
				{color,color,color,0,color,color,color},
				{color,color,color,color,color,color,color},
				{color,color,0,color,0,color,color},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color}};
		
		return charM;
	}
	
	public static int[][] charN(int color)
	{
		int[][] charN = {
				{color,color,0,0,0,color,color},
				{color,color,color,0,0,color,color},
				{color,color,color,color,0,color,color},
				{color,color,0,color,color,color,color},
				{color,color,0,0,color,color,color},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color}};
		
		return charN;
	}
	
	public static int[][] charO(int color)
	{
		int[][] charO = {
				{0,0,color,color,color,0,0},
				{0,color,color,0,color,color,0},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{0,color,color,0,color,color,0},
				{0,0,color,color,color,0,0}};
		
		return charO;
	}
	
	public static int[][] charP(int color)
	{
		int[][] charP = {
				{color,color,color,color,color,color,0},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{color,color,color,color,color,color,0},
				{color,color,0,0,0,0,0},
				{color,color,0,0,0,0,0},
				{color,color,0,0,0,0,0}};
		
		return charP;
	}
	
	public static int[][] charQ(int color)
	{
		int[][] charQ = {
				{0,0,color,color,color,0,0},
				{0,color,color,0,color,color,0},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{0,color,color,0,color,color,0},
				{0,0,color,color,color,color,color}};
		
		return charQ;
	}
	
	public static int[][] charR(int color)
	{
		int[][] charR = {
				{color,color,color,color,color,color,0},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{color,color,color,color,color,color,0},
				{color,color,0,color,color,0,0},
				{color,color,0,0,color,color,0},
				{color,color,0,0,0,color,color}};
		
		return charR;
	}
	
	public static int[][] charS(int color)
	{
		int[][] charS = {
				{0,color,color,color,color,color,0},
				{color,color,0,0,0,color,color},
				{0,color,color,0,0,0,0},
				{0,0,color,color,color,0,0},
				{0,0,0,0,color,color,0},
				{color,color,0,0,0,color,color},
				{0,color,color,color,color,color,0}};
		
		return charS;
	}
	
	public static int[][] charT(int color)
	{
		int[][] charT = {
				{color,color,color,color,color,color,color},
				{color,0,0,color,0,0,color},
				{0,0,0,color,0,0,0},
				{0,0,0,color,0,0,0},
				{0,0,0,color,0,0,0},
				{0,0,0,color,0,0,0},
				{0,0,color,color,color,0,0}};
		
		return charT;
	}
	
	public static int[][] charU(int color)
	{
		int[][] charU = {
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{0,color,color,color,color,color,0}};
		
		return charU;
	}
	
	public static int[][] charV(int color)
	{
		int[][] charV = {
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{0,color,color,0,color,color,0},
				{0,color,color,0,color,color,0},
				{0,0,color,color,color,0,0},
				{0,0,color,color,color,0,0},
				{0,0,0,color,0,0,0}};
		
		return charV;
	}
	
	public static int[][] charW(int color)
	{
		int[][] charW = {
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{color,color,0,color,0,color,color},
				{color,color,color,color,color,color,color},
				{0,color,color,0,color,color,0},
				{0,color,color,0,color,color,0}};
		
		return charW;
	}
	
	public static int[][] charX(int color)
	{
		int[][] charX = {
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{0,color,color,0,color,color,0},
				{0,0,color,color,color,0,0},
				{0,color,color,0,color,color,0},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color}};
		
		return charX;
	}
	
	public static int[][] charY(int color)
	{
		int[][] charY = {
				{color,color,0,0,0,color,color},
				{0,color,0,0,0,color,0},
				{0,0,color,0,color,0,0},
				{0,0,0,color,0,0,0},
				{0,0,0,color,0,0,0},
				{0,0,0,color,0,0,0},
				{0,0,color,color,color,0,0}};
		
		return charY;
	}
	
	public static int[][] charZ(int color)
	{
		int[][] charZ = {
				{color,color,color,color,color,color,color},
				{color,color,0,0,color,color,color},
				{0,0,0,color,color,color,0},
				{0,0,color,color,color,0,0},
				{0,color,color,color,0,0,0},
				{color,color,color,0,0,color,color},
				{color,color,color,color,color,color,color}};
		
		return charZ;
	}
	
	public static int[][] nbr0(int color)
	{
		int[][] nbr0 = {
				{0,color,color,color,color,color,0},
				{color,color,0,0,0,color,color},
				{color,color,0,0,color,color,color},
				{color,color,0,color,0,color,color},
				{color,color,color,0,0,color,color},
				{color,color,0,0,0,color,color},
				{0,color,color,color,color,color,0}};
		
		return nbr0;
	}
	
	public static int[][] nbr1(int color)
	{
		int[][] nbrcolor = {
				{0,0,0,color,0,0,0},
				{0,0,color,color,0,0,0},
				{0,0,0,color,0,0,0},
				{0,0,0,color,0,0,0},
				{0,0,0,color,0,0,0},
				{0,0,0,color,0,0,0},
				{0,0,color,color,color,0,0}};
		
		return nbrcolor;
	}
	
	public static int[][] nbr2(int color)
	{
		int[][] nbr2 = {
				{0,color,color,color,color,0,0},
				{color,color,0,0,color,color,0},
				{0,0,0,color,color,0,0},
				{0,0,color,color,0,0,0},
				{0,color,color,0,0,0,0},
				{color,color,0,0,0,0,color},
				{color,color,color,color,color,color,color}};
		
		return nbr2;
	}
	
	public static int[][] nbr3(int color)
	{
		int[][] nbr3 = {
				{0,color,color,color,color,color,0},
				{color,0,0,0,0,color,color},
				{0,0,0,0,0,color,color},
				{0,0,color,color,color,color,0},
				{0,0,0,0,0,color,color},
				{color,0,0,0,0,color,color},
				{0,color,color,color,color,color,0}};
		
		return nbr3;
	}
	
	public static int[][] nbr4(int color)
	{
		int[][] nbr4 = {
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{color,color,color,color,color,color,color},
				{0,0,0,0,0,color,color},
				{0,0,0,0,0,color,color},
				{0,0,0,0,0,color,color}};
		
		return nbr4;
	}
	
	public static int[][] nbr5(int color)
	{
		int[][] nbr5 = {
				{0,color,color,color,color,color,0},
				{0,color,color,0,0,0,0},
				{0,color,color,0,0,0,0},
				{0,color,color,color,color,0,0},
				{0,0,0,0,color,color,0},
				{0,color,color,0,color,color,0},
				{0,0,color,color,color,0,0}};
		
		return nbr5;
	}
	
	public static int[][] nbr6(int color)
	{
		int[][] nbr6 = {
				{color,color,color,color,color,color,0},
				{color,color,0,0,0,0,0},
				{color,color,0,0,0,0,0},
				{color,color,color,color,color,color,0},
				{color,color,0,0,color,color,0},
				{color,color,0,0,color,color,0},
				{color,color,color,color,color,color,0}};
		
		return nbr6;
	}
	
	public static int[][] nbr7(int color)
	{
		int[][] nbr7 = {
				{color,color,color,color,color,color,color},
				{color,color,color,color,color,color,color},
				{0,0,0,0,color,color,0},
				{0,0,0,color,color,0,0},
				{0,0,color,color,0,0,0},
				{0,color,color,0,0,0,0},
				{color,color,0,0,0,0,0}};
		
		return nbr7;
	}
	
	public static int[][] nbr8(int color)
	{
		int[][] nbr8 = {
				{0,color,color,color,color,color,0},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{0,color,color,color,color,color,0},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{0,color,color,color,color,color,0}};
		
		return nbr8;
	}
	
	public static int[][] nbr9(int color)
	{
		int[][] nbr9 = {
				{0,color,color,color,color,color,0},
				{color,color,0,0,0,color,color},
				{color,color,0,0,0,color,color},
				{0,color,color,color,color,color,0},
				{0,0,0,0,0,color,color},
				{0,0,0,0,0,color,color},
				{0,color,color,color,color,color,0}};
		
		return nbr9;
	}
	
	public static int[][] space(int color)
	{
		int[][] space = {
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0}};
		
		return space;
	}
	
	public static int[][] underscore(int color)
	{
		int[][] underscore = {
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{color,color,color,color,color,color,color}};
		
		return underscore;
	}
	
	public static int[][] plus(int color)
	{
		int[][] plus = {
				{0,0,0,0,0,0,0},
				{0,0,0,color,0,0,0},
				{0,0,0,color,0,0,0},
				{0,color,color,color,color,color,0},
				{0,0,0,color,0,0,0},
				{0,0,0,color,0,0,0},
				{0,0,0,0,0,0,0}};
		
		return plus;
	}
	
	public static int[][] minus(int color)
	{
		int[][] minus = {
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,color,color,color,color,color,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0}};
		
		return minus;
	}
	
	public static int[][] division(int color)
	{
		int[][] division = {
				{0,0,0,0,0,0,color},
				{0,0,0,0,0,color,0},
				{0,0,0,0,color,0,0},
				{0,0,0,color,0,0,0},
				{0,0,color,0,0,0,0},
				{0,color,0,0,0,0,0},
				{color,0,0,0,0,0,0}};
		
		return division;
	}
	
	public static int[][] multiplication(int color)
	{
		int[][] multiplication = {
				{0,0,0,0,0,0,0},
				{0,color,0,0,0,color,0},
				{0,0,color,0,color,0,0},
				{0,0,0,color,0,0,0},
				{0,0,color,0,color,0,0},
				{0,color,0,0,0,color,0},
				{0,0,0,0,0,0,0}};
		
		return multiplication;
	}
	
	public static int[][] percentage(int color)
	{
		int[][] percentage = {
				{0,color,0,0,0,0,color},
				{color,0,color,0,0,color,0},
				{0,color,0,0,color,0,0},
				{0,0,0,color,0,0,0},
				{0,0,color,0,0,color,0},
				{0,color,0,0,color,0,color},
				{color,0,0,0,0,color,0}};
		
		return percentage;
	}
	
	public static int[][] at(int color)
	{
		int[][] at = {
				{0,0,color,color,color,0,0},
				{0,color,0,0,0,color,0},
				{color,0,color,color,color,0,color},
				{color,0,color,0,color,0,color},
				{color,0,color,color,color,color,color},
				{0,color,0,0,0,0,0},
				{0,0,color,color,color,color,color}};
		
		return at;
	}
	
	public static int[][] dot(int color)
	{
		int[][] dot = {
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,color,color,0,0,0},
				{0,0,color,color,0,0,0}};
		
		return dot;
	}
	
	public static int[][] comma(int color)
	{
		int[][] comma = {
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0},
				{0,0,color,color,0,0,0},
				{0,0,0,color,0,0,0}};
		
		return comma;
	}
	
	public static Array7x7 getChar(char chr, int color) 
	{
		Array7x7 res;
		switch(chr) 
		{
		case 'A': res = new Array7x7(charA(color));
		break;
		case 'B': res = new Array7x7(charB(color));
		break;
		case 'C': res = new Array7x7(charC(color));
		break;
		case 'D': res = new Array7x7(charD(color));
		break;
		case 'E': res = new Array7x7(charE(color));
		break;
		case 'F': res = new Array7x7(charF(color));
		break;
		case 'G': res = new Array7x7(charG(color));
		break;
		case 'H': res = new Array7x7(charH(color));
		break;
		case 'I': res = new Array7x7(charI(color));
		break;
		case 'J': res = new Array7x7(charJ(color));
		break;
		case 'K': res = new Array7x7(charK(color));
		break;
		case 'L': res = new Array7x7(charL(color));
		break;
		case 'M': res = new Array7x7(charM(color));
		break;
		case 'N': res = new Array7x7(charN(color));
		break;
		case 'O': res = new Array7x7(charO(color));
		break;
		case 'P': res = new Array7x7(charP(color));
		break;
		case 'Q': res = new Array7x7(charQ(color));
		break;
		case 'R': res = new Array7x7(charR(color));
		break;
		case 'S': res = new Array7x7(charS(color));
		break;
		case 'T': res = new Array7x7(charT(color));
		break;
		case 'U': res = new Array7x7(charU(color));
		break;
		case 'V': res = new Array7x7(charV(color));
		break;
		case 'W': res = new Array7x7(charW(color));
		break;
		case 'X': res = new Array7x7(charX(color));
		break;
		case 'Y': res = new Array7x7(charY(color));
		break;
		case 'Z': res = new Array7x7(charZ(color));
		break;
		case '0': res = new Array7x7(nbr0(color));
		break;
		case '1': res = new Array7x7(nbr1(color));
		break;
		case '2': res = new Array7x7(nbr2(color));
		break;
		case '3': res = new Array7x7(nbr3(color));
		break;
		case '4': res = new Array7x7(nbr4(color));
		break;
		case '5': res = new Array7x7(nbr5(color));
		break;
		case '6': res = new Array7x7(nbr6(color));
		break;
		case '7': res = new Array7x7(nbr7(color));
		break;
		case '8': res = new Array7x7(nbr8(color));
		break;
		case '9': res = new Array7x7(nbr9(color));
		break;
		case ' ': res = new Array7x7(space(color));
		break;
		case '_': res = new Array7x7(underscore(color));
		break;
		case '+': res = new Array7x7(plus(color));
		break;
		case '-': res = new Array7x7(minus(color));
		break;
		case '/': res = new Array7x7(division(color));
		break;
		case '*': res = new Array7x7(multiplication(color));
		break;
		case '%': res = new Array7x7(percentage(color));
		break;
		case '@': res = new Array7x7(at(color));
		break;
		case '.': res = new Array7x7(dot(color));
		break;
		case ',': res = new Array7x7(comma(color));
		break;
		default : res = new Array7x7(space(color));
		break;
		}
		return res;
	}
}