package prototype;

/**
 * Links two data sets according to two predicates.
 * 
 * @author Thibaud Colas
 * @version 01042012
 * @see Liaison
 */
public class LiaisonSimple extends Liaison {
	
	/**
	 * Default constructor.
	 * @param s : The source data set.
	 * @param c : The target data set.
	 * @param ps : The source predicate.
	 * @param pc : The target predicate.
	 */
	public LiaisonSimple(Jeu s, Jeu c, String ps, String pc) {
		nom = ps + "-" + pc;
		
		maxliens = 0;
		
		source = s;
		cible = c;
		propsource = ps;
		propcible = pc;
		
		querysource = writeQuery(ps);
		querycible = writeQuery(pc);
	}
	
	/**
	 * Useless constructor.
	 * @param s : The source data set.
	 * @param c : The target data set.
	 * @param ps : The source predicate.
	 * @param pc : The target predicate.
	 * @param ml : The max number of links updated.
	 */
	public LiaisonSimple(Jeu s, Jeu c, String ps, String pc, int ml) {
		nom = ps + "-" + pc;
		
		maxliens = Math.max(ml, 0);
		
		source = s;
		cible = c;
		propsource = ps;
		propcible = pc;
		
		querysource = writeQuery(ps);
		querycible = writeQuery(pc);
	}
}
