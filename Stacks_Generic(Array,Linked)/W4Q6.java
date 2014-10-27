package practical3;
import java.util.Stack;
// Sai-keerthi-chandu Seshadri
// 13205471
public class W4Q6 {
	public static void main(String[] args) {
		String s = "SEQ(PAR(boil kettle, wash cup), add teabag, WAIT({kettle boiled}, add water, add milk)";
		char[] ch = s.toCharArray();
		boolean p = ParenMatch(ch, s.length());
		System.out.println(p);
	}
	public static boolean ParenMatch(char[] ch,int n){
		Stack<Object> s = new Stack<Object>();
		int count=0;
		for (int i = 0; i < n; i++) {
			if(ch[i] == '(' || ch[i] == '{' || ch[i] == '['){
				s.push(ch[i]);
				count++;
			}
			else if(ch[i] == ')' || ch[i] == '}' || ch[i] == ']'){
				if(s.isEmpty()){
					return false;
				}
				char check = (char)s.pop();
				if ((ch[i] == '}'&& check == '{') || (ch[i] == ']' && check == '[') || (ch[i] == ')' && check == '(')){
					count--;
				}
			}
		}
		if(count == 0)
			return true;
		else
			return false;
	}
	

}
