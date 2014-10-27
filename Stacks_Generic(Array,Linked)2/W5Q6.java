package practical4;
//Sai-keerthi-chandu Seshadri
//13205471
public class W5Q6 {
	public static void main(String[] args) {
		String s = "(}";
		char[] ch = s.toCharArray();
		boolean p = ParenMatch(ch, s.length());
		System.out.println(p);
	}
	public static boolean ParenMatch(char[] ch,int n){
		Stack<Character> s = new ArrayStack<Character>();
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
