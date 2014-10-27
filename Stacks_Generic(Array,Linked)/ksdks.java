package practical3;

public class ksdks {

		public static void main(String[] args) {
			String makeTea = "(}";
			char[] teaArray = new char[makeTea.length()];
			for (int i = 0; i < makeTea.length(); i++) {
				teaArray[i] = makeTea.charAt(i);
			}
			System.out.println(isParenMatch(teaArray, makeTea.length()));
		}

		public static boolean isParenMatch(char[] X, int n) {
			LinkedStack Stack = new LinkedStack();

			for (int i = 0; i < X.length; i++) {
				if (X[i] == '{' | X[i] == '[' | X[i] == '(') {
					Stack.push(X[i]);
				} else if (X[i] == '}' | X[i] == ']' | X[i] == ')') {
					if (Stack.isEmpty()) {
						return false;
					}
					char match = (char) Stack.pop();
					if ((X[i] == '{' && match == '}' | X[i] == '[' && match == ']'
							| X[i] == '(' && match == ')' | X[i] == '}'
							&& match == '{' | X[i] == ']' && match == '['
							| X[i] == ')' && match == '('))
						
					{
						return true;
					}
				}
			}
			if (Stack.isEmpty()) {
				return true;
			} else {
				return false;
			}

		}
	}


