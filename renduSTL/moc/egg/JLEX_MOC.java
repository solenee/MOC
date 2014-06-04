package moc.egg;
import mg.egg.eggc.runtime.libjava.lex.*;

public class JLEX_MOC implements  LEX_ANALYZER  {
	private final int YY_BUFFER_SIZE = 512;
	private final int YY_F = -1;
	private final int YY_NO_STATE = -1;
	private final int YY_NOT_ACCEPT = 0;
	private final int YY_START = 1;
	private final int YY_END = 2;
	private final int YY_NO_ANCHOR = 4;
	private final int YY_BOL = 256;
	private final int YY_EOF = 257;

	private java.io.BufferedReader yy_reader;
	private int yy_buffer_index;
	private int yy_buffer_read;
	private int yy_buffer_start;
	private int yy_buffer_end;
	private char yy_buffer[];
	private int yychar;
	private int yyline;
	private boolean yy_at_bol;
	private int yy_lexical_state;

	public JLEX_MOC (java.io.Reader reader) {
		this ();
		if (null == reader) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(reader);
	}

	public JLEX_MOC (java.io.InputStream instream) {
		this ();
		if (null == instream) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(new java.io.InputStreamReader(instream));
	}

	public JLEX_MOC () {
		yy_buffer = new char[YY_BUFFER_SIZE];
		yy_buffer_read = 0;
		yy_buffer_index = 0;
		yy_buffer_start = 0;
		yy_buffer_end = 0;
		yychar = 0;
		yyline = 0;
		yy_at_bol = true;
		yy_lexical_state = YYINITIAL;
	}

	public void fromContext(LEX_CONTEXTE cont) {
		yy_reader = cont.source;
		yy_buffer = cont.buffer;
		yy_buffer_read = cont.b_read;
		yy_buffer_index = cont.b_index;
		yy_buffer_start = cont.b_start;
		yy_buffer_end = cont.b_end;
		yychar = cont.car;
		yyline = cont.ligne;
		yy_at_bol = true;
		yy_lexical_state = YYINITIAL;
	}
	public void toContext(LEX_CONTEXTE cont) {		cont.source = yy_reader;
		cont.buffer = yy_buffer;
		cont.b_read = yy_buffer_read;
		cont.b_index = yy_buffer_index;
		cont.b_start = yy_buffer_start;
		cont.b_end = yy_buffer_end;
		cont.ligne = yyline;
		cont.car = yychar;
	}
	public void setReader(java.io.BufferedReader r) {
		yy_reader = r;
	}
	private boolean yy_eof_done = false;
	private final int YYINITIAL = 0;
	private final int yy_state_dtrans[] = {
		0
	};
	private void yybegin (int state) {
		yy_lexical_state = state;
	}
	private int yy_advance ()
		throws java.io.IOException {
		int next_read;
		int i;
		int j;

		if (yy_buffer_index < yy_buffer_read) {
			return yy_buffer[yy_buffer_index++];
		}

		if (0 != yy_buffer_start) {
			i = yy_buffer_start;
			j = 0;
			while (i < yy_buffer_read) {
				yy_buffer[j] = yy_buffer[i];
				++i;
				++j;
			}
			yy_buffer_end = yy_buffer_end - yy_buffer_start;
			yy_buffer_start = 0;
			yy_buffer_read = j;
			yy_buffer_index = j;
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}

		while (yy_buffer_index >= yy_buffer_read) {
			if (yy_buffer_index >= yy_buffer.length) {
				yy_buffer = yy_double(yy_buffer);
			}
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YY_EOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}
		return yy_buffer[yy_buffer_index++];
	}
	private void yy_move_end () {
		if (yy_buffer_end > yy_buffer_start &&
		    '\n' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
		if (yy_buffer_end > yy_buffer_start &&
		    '\r' == yy_buffer[yy_buffer_end-1])
			yy_buffer_end--;
	}
	private boolean yy_last_was_cr=false;
	private void yy_mark_start () {
		int i;
		for (i = yy_buffer_start; i < yy_buffer_index; ++i) {
			if ('\n' == yy_buffer[i] && !yy_last_was_cr) {
				++yyline;
			}
			if ('\r' == yy_buffer[i]) {
				++yyline;
				yy_last_was_cr=true;
			} else yy_last_was_cr=false;
		}
		yychar = yychar
			+ yy_buffer_index - yy_buffer_start;
		yy_buffer_start = yy_buffer_index;
	}
	private void yy_mark_end () {
		yy_buffer_end = yy_buffer_index;
	}
	private void yy_to_mark () {
		yy_buffer_index = yy_buffer_end;
		yy_at_bol = (yy_buffer_end > yy_buffer_start) &&
		            ('\r' == yy_buffer[yy_buffer_end-1] ||
		             '\n' == yy_buffer[yy_buffer_end-1] ||
		             2028/*LS*/ == yy_buffer[yy_buffer_end-1] ||
		             2029/*PS*/ == yy_buffer[yy_buffer_end-1]);
	}
	private java.lang.String yytext () {
		return (new java.lang.String(yy_buffer,
			yy_buffer_start,
			yy_buffer_end - yy_buffer_start));
	}
	private int yylength () {
		return yy_buffer_end - yy_buffer_start;
	}
	private char[] yy_double (char buf[]) {
		int i;
		char newbuf[];
		newbuf = new char[2*buf.length];
		for (i = 0; i < buf.length; ++i) {
			newbuf[i] = buf[i];
		}
		return newbuf;
	}
	private final int YY_E_INTERNAL = 0;
	private final int YY_E_MATCH = 1;
	private java.lang.String yy_error_string[] = {
		"Error: Internal error.\n",
		"Error: Unmatched input.\n"
	};
	private void yy_error (int code,boolean fatal) {
		java.lang.System.out.print(yy_error_string[code]);
		java.lang.System.out.flush();
		if (fatal) {
			throw new Error("Fatal Error.\n");
		}
	}
	private int[][] unpackFromString(int size1, int size2, String st) {
		int colonIndex = -1;
		String lengthString;
		int sequenceLength = 0;
		int sequenceInteger = 0;

		int commaIndex;
		String workString;

		int res[][] = new int[size1][size2];
		for (int i= 0; i < size1; i++) {
			for (int j= 0; j < size2; j++) {
				if (sequenceLength != 0) {
					res[i][j] = sequenceInteger;
					sequenceLength--;
					continue;
				}
				commaIndex = st.indexOf(',');
				workString = (commaIndex==-1) ? st :
					st.substring(0, commaIndex);
				st = st.substring(commaIndex+1);
				colonIndex = workString.indexOf(':');
				if (colonIndex == -1) {
					res[i][j]=Integer.parseInt(workString);
					continue;
				}
				lengthString =
					workString.substring(colonIndex+1);
				sequenceLength=Integer.parseInt(lengthString);
				workString=workString.substring(0,colonIndex);
				sequenceInteger=Integer.parseInt(workString);
				res[i][j] = sequenceInteger;
				sequenceLength--;
			}
		}
		return res;
	}
	private int yy_acpt[] = {
		/* 0 */ YY_NOT_ACCEPT,
		/* 1 */ YY_NO_ANCHOR,
		/* 2 */ YY_NO_ANCHOR,
		/* 3 */ YY_NO_ANCHOR,
		/* 4 */ YY_NO_ANCHOR,
		/* 5 */ YY_NO_ANCHOR,
		/* 6 */ YY_NO_ANCHOR,
		/* 7 */ YY_NO_ANCHOR,
		/* 8 */ YY_NO_ANCHOR,
		/* 9 */ YY_NO_ANCHOR,
		/* 10 */ YY_NO_ANCHOR,
		/* 11 */ YY_NO_ANCHOR,
		/* 12 */ YY_NO_ANCHOR,
		/* 13 */ YY_NO_ANCHOR,
		/* 14 */ YY_NO_ANCHOR,
		/* 15 */ YY_NO_ANCHOR,
		/* 16 */ YY_NO_ANCHOR,
		/* 17 */ YY_NO_ANCHOR,
		/* 18 */ YY_NO_ANCHOR,
		/* 19 */ YY_NO_ANCHOR,
		/* 20 */ YY_NO_ANCHOR,
		/* 21 */ YY_NO_ANCHOR,
		/* 22 */ YY_NO_ANCHOR,
		/* 23 */ YY_NO_ANCHOR,
		/* 24 */ YY_NO_ANCHOR,
		/* 25 */ YY_NO_ANCHOR,
		/* 26 */ YY_NO_ANCHOR,
		/* 27 */ YY_NO_ANCHOR,
		/* 28 */ YY_NO_ANCHOR,
		/* 29 */ YY_NO_ANCHOR,
		/* 30 */ YY_NO_ANCHOR,
		/* 31 */ YY_NO_ANCHOR,
		/* 32 */ YY_NO_ANCHOR,
		/* 33 */ YY_NO_ANCHOR,
		/* 34 */ YY_NO_ANCHOR,
		/* 35 */ YY_NO_ANCHOR,
		/* 36 */ YY_NO_ANCHOR,
		/* 37 */ YY_NO_ANCHOR,
		/* 38 */ YY_NO_ANCHOR,
		/* 39 */ YY_NO_ANCHOR,
		/* 40 */ YY_NO_ANCHOR,
		/* 41 */ YY_NO_ANCHOR,
		/* 42 */ YY_NO_ANCHOR,
		/* 43 */ YY_NO_ANCHOR,
		/* 44 */ YY_NO_ANCHOR,
		/* 45 */ YY_NO_ANCHOR,
		/* 46 */ YY_NO_ANCHOR,
		/* 47 */ YY_NO_ANCHOR,
		/* 48 */ YY_NO_ANCHOR,
		/* 49 */ YY_NO_ANCHOR,
		/* 50 */ YY_NO_ANCHOR,
		/* 51 */ YY_NO_ANCHOR,
		/* 52 */ YY_NOT_ACCEPT,
		/* 53 */ YY_NO_ANCHOR,
		/* 54 */ YY_NO_ANCHOR,
		/* 55 */ YY_NO_ANCHOR,
		/* 56 */ YY_NOT_ACCEPT,
		/* 57 */ YY_NO_ANCHOR,
		/* 58 */ YY_NO_ANCHOR,
		/* 59 */ YY_NO_ANCHOR,
		/* 60 */ YY_NOT_ACCEPT,
		/* 61 */ YY_NO_ANCHOR,
		/* 62 */ YY_NO_ANCHOR,
		/* 63 */ YY_NO_ANCHOR,
		/* 64 */ YY_NOT_ACCEPT,
		/* 65 */ YY_NO_ANCHOR,
		/* 66 */ YY_NO_ANCHOR,
		/* 67 */ YY_NO_ANCHOR,
		/* 68 */ YY_NOT_ACCEPT,
		/* 69 */ YY_NO_ANCHOR,
		/* 70 */ YY_NO_ANCHOR,
		/* 71 */ YY_NOT_ACCEPT,
		/* 72 */ YY_NO_ANCHOR,
		/* 73 */ YY_NOT_ACCEPT,
		/* 74 */ YY_NO_ANCHOR,
		/* 75 */ YY_NOT_ACCEPT,
		/* 76 */ YY_NO_ANCHOR,
		/* 77 */ YY_NOT_ACCEPT,
		/* 78 */ YY_NO_ANCHOR,
		/* 79 */ YY_NOT_ACCEPT,
		/* 80 */ YY_NO_ANCHOR,
		/* 81 */ YY_NO_ANCHOR,
		/* 82 */ YY_NO_ANCHOR,
		/* 83 */ YY_NO_ANCHOR,
		/* 84 */ YY_NO_ANCHOR,
		/* 85 */ YY_NO_ANCHOR,
		/* 86 */ YY_NO_ANCHOR,
		/* 87 */ YY_NO_ANCHOR,
		/* 88 */ YY_NO_ANCHOR,
		/* 89 */ YY_NO_ANCHOR,
		/* 90 */ YY_NO_ANCHOR,
		/* 91 */ YY_NO_ANCHOR,
		/* 92 */ YY_NO_ANCHOR,
		/* 93 */ YY_NO_ANCHOR,
		/* 94 */ YY_NO_ANCHOR,
		/* 95 */ YY_NO_ANCHOR,
		/* 96 */ YY_NO_ANCHOR,
		/* 97 */ YY_NO_ANCHOR,
		/* 98 */ YY_NO_ANCHOR,
		/* 99 */ YY_NO_ANCHOR,
		/* 100 */ YY_NO_ANCHOR
	};
	private int yy_cmap[] = unpackFromString(1,258,
"3:9,4,1,3:2,4,3:18,4,33,52,3:2,38,39,51,5,6,37,34,9,35,3,2,50:10,40,10,31,1" +"1,32,3,43,55,44,55:2,48,55:6,30,55,28,45,55:3,49,55,29,55:3,47,55,41,3,42,3" +",54,3,20,53,24,19,14,13,53,25,12,53:2,15,21,22,18,46,53,26,16,23,27,17,53:4" +",7,36,8,3:130,0:2")[0];

	private int yy_rmap[] = unpackFromString(1,101,
"0,1,2,3,1:7,4,5,6,7,8,9,1:7,10,1,11:2,12,1:7,11:3,1,12,1,11:4,12,1,12,11:2," +"1,13,14,11,12,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,28,30,31,32,33,3" +"4,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58")[0];

	private int yy_nxt[][] = unpackFromString(59,56,
"1,2,3,4,2,5,6,7,8,9,10,11,12,54,92,54,94,95,54:2,81,54,83,54,96,54,100,54,1" +"3,55:2,14,15,16,17,18,53,19,20,57,21,22,23,61,93,55,54,82,55:2,24,65,69,54," +"4,55,-1:57,2,-1:2,2,-1:53,52,-1:64,25,-1:56,54,26,54:5,27,54:2,58,54:8,-1:1" +"3,54:7,-1:2,54:3,-1:12,55:17,84,55,-1:13,55,28,55:5,-1:2,55:3,-1:11,29,-1:5" +"5,30,-1:55,31,-1:94,24,-1:17,54:19,-1:13,54:7,-1:2,54:3,-1:12,55:19,-1:13,5" +"5:7,-1:2,55:3,-1,35,52:54,-1:36,32,-1:41,73,-1:72,33,-1:28,54:11,36,54:7,-1" +":13,54:7,-1:2,54:3,-1:12,55:19,-1:13,55:5,40,55,-1:2,55:3,-1:15,75,-1:54,56" +",-1:9,60,-1:27,64,-1:15,54:9,37,54:9,-1:13,54:7,-1:2,54:3,-1:12,55:18,46,-1" +":13,55:7,-1:2,55:3,-1,64:51,39,64:3,-1,68:50,-1,68:4,-1:12,54:3,38,54:15,-1" +":13,54:7,-1:2,54:3,-1:12,55:18,48,-1:13,55:7,-1:2,55:3,-1:51,41,-1:5,71:51," +"34,71:3,-1:12,54:2,42,54:16,-1:13,54:7,-1:2,54:3,-1:12,54,43,54:17,-1:13,54" +":7,-1:2,54:3,-1:19,47,-1:48,54:7,44,54:11,-1:13,54:7,-1:2,54:3,-1:20,77,-1:" +"47,54:14,45,54:4,-1:13,54:7,-1:2,54:3,-1:16,79,-1:51,54:14,49,54:4,-1:13,54" +":7,-1:2,54:3,-1:16,51,-1:51,54:10,50,54:8,-1:13,54:7,-1:2,54:3,-1:12,54:4,6" +"2,54:14,-1:13,54:7,-1:2,54:3,-1:12,55:19,-1:13,55:4,59,55:2,-1:2,55:3,-1:12" +",66,54:18,-1:13,54:7,-1:2,54:3,-1:12,55:18,63,-1:13,55:7,-1:2,55:3,-1:12,54" +":4,70,54:14,-1:13,54:7,-1:2,54:3,-1:12,55:19,-1:13,55,67,55:5,-1:2,55:3,-1:" +"12,54:3,72,54:15,-1:13,54:7,-1:2,54:3,-1:12,74,54:18,-1:13,54:7,-1:2,54:3,-" +"1:12,54:8,76,54:10,-1:13,54:7,-1:2,54:3,-1:12,54:2,78,54:16,-1:13,54:7,-1:2" +",54:3,-1:12,54:14,80,54:4,-1:13,54:7,-1:2,54:3,-1:12,54:3,85,54:15,-1:13,54" +":7,-1:2,54:3,-1:12,55:19,-1:13,55,86,55:5,-1:2,55:3,-1:12,54:2,87,54:12,97," +"54:3,-1:13,54:7,-1:2,54:3,-1:12,54:6,88,54:12,-1:13,54:7,-1:2,54:3,-1:12,54" +":13,89,54:5,-1:13,54:7,-1:2,54:3,-1:12,54:19,-1:13,54:2,90,54:4,-1:2,54:3,-" +"1:12,54:15,91,54:3,-1:13,54:7,-1:2,54:3,-1:12,54:11,98,54:7,-1:13,54:7,-1:2" +",54:3,-1:12,54:2,99,54:16,-1:13,54:7,-1:2,54:3");

	public Yytoken yylex ()
		throws java.io.IOException {
		int yy_lookahead;
		int yy_anchor = YY_NO_ANCHOR;
		int yy_state = yy_state_dtrans[yy_lexical_state];
		int yy_next_state = YY_NO_STATE;
		int yy_last_accept_state = YY_NO_STATE;
		boolean yy_initial = true;
		int yy_this_accept;

		yy_mark_start();
		yy_this_accept = yy_acpt[yy_state];
		if (YY_NOT_ACCEPT != yy_this_accept) {
			yy_last_accept_state = yy_state;
			yy_mark_end();
		}
		while (true) {
			if (yy_initial && yy_at_bol) yy_lookahead = YY_BOL;
			else yy_lookahead = yy_advance();
			yy_next_state = YY_F;
			yy_next_state = yy_nxt[yy_rmap[yy_state]][yy_cmap[yy_lookahead]];
			if (YY_EOF == yy_lookahead && true == yy_initial) {

	return new Yytoken(LEX_MOC.EOF , "EOF" , yyline , yychar , yychar+1 ) ;
			}
			if (YY_F != yy_next_state) {
				yy_state = yy_next_state;
				yy_initial = false;
				yy_this_accept = yy_acpt[yy_state];
				if (YY_NOT_ACCEPT != yy_this_accept) {
					yy_last_accept_state = yy_state;
					yy_mark_end();
				}
			}
			else {
				if (YY_NO_STATE == yy_last_accept_state) {
					throw (new Error("Lexical Error: Unmatched Input."));
				}
				else {
					yy_anchor = yy_acpt[yy_last_accept_state];
					if (0 != (YY_END & yy_anchor)) {
						yy_move_end();
					}
					yy_to_mark();
					switch (yy_last_accept_state) {
					
case 1:
					
	
					
case -2:
					
	break;
					
case 2:
					
	{return new Yytoken(LEX_MOC.token_separateur, yytext(), yyline, yychar, yychar+1);}
					
case -3:
					
	break;
					
case 3:
					
	{return new Yytoken(LEX_MOC.token_div, yytext(), yyline, yychar, yychar+1);}
					
case -4:
					
	break;
					
case 4:
					
	{return new Yytoken(LEX_MOC.token_autre, yytext(), yyline, yychar, yychar+1);}
					
case -5:
					
	break;
					
case 5:
					
	{return new Yytoken(LEX_MOC.token_paro, yytext(), yyline, yychar, yychar+1);}
					
case -6:
					
	break;
					
case 6:
					
	{return new Yytoken(LEX_MOC.token_parf, yytext(), yyline, yychar, yychar+1);}
					
case -7:
					
	break;
					
case 7:
					
	{return new Yytoken(LEX_MOC.token_aco, yytext(), yyline, yychar, yychar+1);}
					
case -8:
					
	break;
					
case 8:
					
	{return new Yytoken(LEX_MOC.token_acf, yytext(), yyline, yychar, yychar+1);}
					
case -9:
					
	break;
					
case 9:
					
	{return new Yytoken(LEX_MOC.token_virg, yytext(), yyline, yychar, yychar+1);}
					
case -10:
					
	break;
					
case 10:
					
	{return new Yytoken(LEX_MOC.token_pv, yytext(), yyline, yychar, yychar+1);}
					
case -11:
					
	break;
					
case 11:
					
	{return new Yytoken(LEX_MOC.token_affect, yytext(), yyline, yychar, yychar+1);}
					
case -12:
					
	break;
					
case 12:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -13:
					
	break;
					
case 13:
					
	{return new Yytoken(LEX_MOC.token_identc, yytext(), yyline, yychar, yychar+1);}
					
case -14:
					
	break;
					
case 14:
					
	{return new Yytoken(LEX_MOC.token_inf, yytext(), yyline, yychar, yychar+1);}
					
case -15:
					
	break;
					
case 15:
					
	{return new Yytoken(LEX_MOC.token_sup, yytext(), yyline, yychar, yychar+1);}
					
case -16:
					
	break;
					
case 16:
					
	{return new Yytoken(LEX_MOC.token_non, yytext(), yyline, yychar, yychar+1);}
					
case -17:
					
	break;
					
case 17:
					
	{return new Yytoken(LEX_MOC.token_plus, yytext(), yyline, yychar, yychar+1);}
					
case -18:
					
	break;
					
case 18:
					
	{return new Yytoken(LEX_MOC.token_moins, yytext(), yyline, yychar, yychar+1);}
					
case -19:
					
	break;
					
case 19:
					
	{return new Yytoken(LEX_MOC.token_mult, yytext(), yyline, yychar, yychar+1);}
					
case -20:
					
	break;
					
case 20:
					
	{return new Yytoken(LEX_MOC.token_mod, yytext(), yyline, yychar, yychar+1);}
					
case -21:
					
	break;
					
case 21:
					
	{return new Yytoken(LEX_MOC.token_dpts, yytext(), yyline, yychar, yychar+1);}
					
case -22:
					
	break;
					
case 22:
					
	{return new Yytoken(LEX_MOC.token_cro, yytext(), yyline, yychar, yychar+1);}
					
case -23:
					
	break;
					
case 23:
					
	{return new Yytoken(LEX_MOC.token_crf, yytext(), yyline, yychar, yychar+1);}
					
case -24:
					
	break;
					
case 24:
					
	{return new Yytoken(LEX_MOC.token_entier, yytext(), yyline, yychar, yychar+1);}
					
case -25:
					
	break;
					
case 25:
					
	{return new Yytoken(LEX_MOC.token_eg, yytext(), yyline, yychar, yychar+1);}
					
case -26:
					
	break;
					
case 26:
					
	{return new Yytoken(LEX_MOC.token_si, yytext(), yyline, yychar, yychar+1);}
					
case -27:
					
	break;
					
case 27:
					
	{return new Yytoken(LEX_MOC.token_id, yytext(), yyline, yychar, yychar+1);}
					
case -28:
					
	break;
					
case 28:
					
	{return new Yytoken(LEX_MOC.token_no, yytext(), yyline, yychar, yychar+1);}
					
case -29:
					
	break;
					
case 29:
					
	{return new Yytoken(LEX_MOC.token_infeg, yytext(), yyline, yychar, yychar+1);}
					
case -30:
					
	break;
					
case 30:
					
	{return new Yytoken(LEX_MOC.token_supeg, yytext(), yyline, yychar, yychar+1);}
					
case -31:
					
	break;
					
case 31:
					
	{return new Yytoken(LEX_MOC.token_neg, yytext(), yyline, yychar, yychar+1);}
					
case -32:
					
	break;
					
case 32:
					
	{return new Yytoken(LEX_MOC.token_ou, yytext(), yyline, yychar, yychar+1);}
					
case -33:
					
	break;
					
case 33:
					
	{return new Yytoken(LEX_MOC.token_et, yytext(), yyline, yychar, yychar+1);}
					
case -34:
					
	break;
					
case 34:
					
	{return new Yytoken(LEX_MOC.token_chaine, yytext(), yyline, yychar, yychar+1);}
					
case -35:
					
	break;
					
case 35:
					
	{return new Yytoken(LEX_MOC.token_comm, yytext(), yyline, yychar, yychar+1);}
					
case -36:
					
	break;
					
case 36:
					
	{return new Yytoken(LEX_MOC.token_int, yytext(), yyline, yychar, yychar+1);}
					
case -37:
					
	break;
					
case 37:
					
	{return new Yytoken(LEX_MOC.token_asm, yytext(), yyline, yychar, yychar+1);}
					
case -38:
					
	break;
					
case 38:
					
	{return new Yytoken(LEX_MOC.token_nil, yytext(), yyline, yychar, yychar+1);}
					
case -39:
					
	break;
					
case 39:
					
	{return new Yytoken(LEX_MOC.token_chaineo, yytext(), yyline, yychar, yychar+1);}
					
case -40:
					
	break;
					
case 40:
					
	{return new Yytoken(LEX_MOC.token_yes, yytext(), yyline, yychar, yychar+1);}
					
case -41:
					
	break;
					
case 41:
					
	{return new Yytoken(LEX_MOC.token_caractere, yytext(), yyline, yychar, yychar+1);}
					
case -42:
					
	break;
					
case 42:
					
	{return new Yytoken(LEX_MOC.token_sinon, yytext(), yyline, yychar, yychar+1);}
					
case -43:
					
	break;
					
case 43:
					
	{return new Yytoken(LEX_MOC.token_self, yytext(), yyline, yychar, yychar+1);}
					
case -44:
					
	break;
					
case 44:
					
	{return new Yytoken(LEX_MOC.token_void, yytext(), yyline, yychar, yychar+1);}
					
case -45:
					
	break;
					
case 45:
					
	{return new Yytoken(LEX_MOC.token_char, yytext(), yyline, yychar, yychar+1);}
					
case -46:
					
	break;
					
case 46:
					
	{return new Yytoken(LEX_MOC.token_null, yytext(), yyline, yychar, yychar+1);}
					
case -47:
					
	break;
					
case 47:
					
	{return new Yytoken(LEX_MOC.token_fin, yytext(), yyline, yychar, yychar+1);}
					
case -48:
					
	break;
					
case 48:
					
	{return new Yytoken(LEX_MOC.token_bool, yytext(), yyline, yychar, yychar+1);}
					
case -49:
					
	break;
					
case 49:
					
	{return new Yytoken(LEX_MOC.token_super, yytext(), yyline, yychar, yychar+1);}
					
case -50:
					
	break;
					
case 50:
					
	{return new Yytoken(LEX_MOC.token_retour, yytext(), yyline, yychar, yychar+1);}
					
case -51:
					
	break;
					
case 51:
					
	{return new Yytoken(LEX_MOC.token_classe, yytext(), yyline, yychar, yychar+1);}
					
case -52:
					
	break;
					
case 53:
					
	{return new Yytoken(LEX_MOC.token_autre, yytext(), yyline, yychar, yychar+1);}
					
case -53:
					
	break;
					
case 54:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -54:
					
	break;
					
case 55:
					
	{return new Yytoken(LEX_MOC.token_identc, yytext(), yyline, yychar, yychar+1);}
					
case -55:
					
	break;
					
case 57:
					
	{return new Yytoken(LEX_MOC.token_autre, yytext(), yyline, yychar, yychar+1);}
					
case -56:
					
	break;
					
case 58:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -57:
					
	break;
					
case 59:
					
	{return new Yytoken(LEX_MOC.token_identc, yytext(), yyline, yychar, yychar+1);}
					
case -58:
					
	break;
					
case 61:
					
	{return new Yytoken(LEX_MOC.token_autre, yytext(), yyline, yychar, yychar+1);}
					
case -59:
					
	break;
					
case 62:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -60:
					
	break;
					
case 63:
					
	{return new Yytoken(LEX_MOC.token_identc, yytext(), yyline, yychar, yychar+1);}
					
case -61:
					
	break;
					
case 65:
					
	{return new Yytoken(LEX_MOC.token_autre, yytext(), yyline, yychar, yychar+1);}
					
case -62:
					
	break;
					
case 66:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -63:
					
	break;
					
case 67:
					
	{return new Yytoken(LEX_MOC.token_identc, yytext(), yyline, yychar, yychar+1);}
					
case -64:
					
	break;
					
case 69:
					
	{return new Yytoken(LEX_MOC.token_autre, yytext(), yyline, yychar, yychar+1);}
					
case -65:
					
	break;
					
case 70:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -66:
					
	break;
					
case 72:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -67:
					
	break;
					
case 74:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -68:
					
	break;
					
case 76:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -69:
					
	break;
					
case 78:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -70:
					
	break;
					
case 80:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -71:
					
	break;
					
case 81:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -72:
					
	break;
					
case 82:
					
	{return new Yytoken(LEX_MOC.token_identc, yytext(), yyline, yychar, yychar+1);}
					
case -73:
					
	break;
					
case 83:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -74:
					
	break;
					
case 84:
					
	{return new Yytoken(LEX_MOC.token_identc, yytext(), yyline, yychar, yychar+1);}
					
case -75:
					
	break;
					
case 85:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -76:
					
	break;
					
case 86:
					
	{return new Yytoken(LEX_MOC.token_identc, yytext(), yyline, yychar, yychar+1);}
					
case -77:
					
	break;
					
case 87:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -78:
					
	break;
					
case 88:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -79:
					
	break;
					
case 89:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -80:
					
	break;
					
case 90:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -81:
					
	break;
					
case 91:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -82:
					
	break;
					
case 92:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -83:
					
	break;
					
case 93:
					
	{return new Yytoken(LEX_MOC.token_identc, yytext(), yyline, yychar, yychar+1);}
					
case -84:
					
	break;
					
case 94:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -85:
					
	break;
					
case 95:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -86:
					
	break;
					
case 96:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -87:
					
	break;
					
case 97:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -88:
					
	break;
					
case 98:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -89:
					
	break;
					
case 99:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -90:
					
	break;
					
case 100:
					
	{return new Yytoken(LEX_MOC.token_ident, yytext(), yyline, yychar, yychar+1);}
					
case -91:
					
	break;
					default:
						yy_error(YY_E_INTERNAL,false);
					case -1:
					}
					yy_initial = true;
					yy_state = yy_state_dtrans[yy_lexical_state];
					yy_next_state = YY_NO_STATE;
					yy_last_accept_state = YY_NO_STATE;
					yy_mark_start();
					yy_this_accept = yy_acpt[yy_state];
					if (YY_NOT_ACCEPT != yy_this_accept) {
						yy_last_accept_state = yy_state;
						yy_mark_end();
					}
				}
			}
		}
	}
}
