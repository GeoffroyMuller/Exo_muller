
public class Television {
		/**
		 * l'intensite du son de la television on suppose que la television est eteinte si
		 * le son vaut 0
		 */
		private int son = 0;

		/**
		 * permet d'allumer ou d'augmenter le son de la television
		 */
		public void allumer() {
			this.son += 10;
			// son maximum
			if (this.son > 100)
				this.son = 100;
		}

		/**
		 * permet d'eteindre la television (son mis a 0)
		 */
		public void eteindre() {
			this.son = 0;

		}

		/**
		 * surcharge de la methode affichage sous la forme "television:10"
		 * 
		 * @return descriptif sous forme de chaine
		 */
		public String toString() {
			String r = "";
			r += "Television:" + son;
			return (r);
		}
	
	}


