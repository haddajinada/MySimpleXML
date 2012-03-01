package dcll.nhad.mysimplexml;

import java.util.Vector;
import java.util.StringTokenizer;
// c simple: cette classe saisie une chaine de carac,
// saisie un carac qui va jouer le role de separateur
// analyse la chaine en generant des jeton ,
// ces jeton etait relier par le carac separateur
// dison qu'on a a=5 et qu'on veut obtenir des jetons
// en ayant comme separateiur =
// cette classe nous renvoie un tab [a,5]
// et basta

public class Tokeniser {
	Vector v;
	String[] V;

	public String[] Tokenizer(String chaine, String separateur) {
		v = new Vector();
		StringTokenizer t = new StringTokenizer(chaine, separateur);
		while (t.hasMoreTokens()) {
			v.add(t.nextToken());
		}
		V = new String[v.size()];
		for (int i = 0; i < v.size(); i++) {
			V[i] = v.get(i).toString();
		}
		return V;
	}

}