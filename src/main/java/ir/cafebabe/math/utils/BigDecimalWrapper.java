package ir.cafebabe.math.utils;

import java.math.BigDecimal;

/**
 * wrapper of {@link BigDecimal} simplifies {@link BigDecimal} comparison
 * 
 * 
 * @author adigozalpour
 *
 */
final class BigDecimalWrapper {

	private static final int ZERO = 0;
	private final BigDecimal bigDecimal;

	BigDecimalWrapper(BigDecimal bigDecimal) {
		this.bigDecimal = bigDecimal;
	}

	/**
	 * Checks whether input argument is <i><b> equal </b></i> to the provided
	 * {@link BigDecimal} or not;
	 * 
	 * @param decimal value to compare
	 * @return {@link Boolean} true if two are equal.
	 */
	public boolean eq(BigDecimal decimal) {
		return bigDecimal.compareTo(decimal) == ZERO;
	}

	/**
	 * Checks whether input argument is <i><b> equal </b></i> to the provided
	 * {@link Double} or not;
	 * 
	 * @param decimal value to compare
	 * @return {@link Boolean} true if two are equal.
	 */
	public boolean eq(double decimal) {
		return eq(BigDecimal.valueOf(decimal));
	}

	/**
	 * Checks whether input argument is <i><b> greater than </b></i> to the provided
	 * {@link BigDecimal} or not;
	 * 
	 * @param decimal value to compare
	 * @return {@link Boolean} value
	 */
	public boolean gt(BigDecimal decimal) {
		return bigDecimal.compareTo(decimal) > ZERO;
	}

	/**
	 * Checks whether input argument is <i><b> greater than </b></i> to the provided
	 * {@link Double} or not;
	 * 
	 * @param decimal value to compare
	 * @return {@link Boolean} value
	 */
	public boolean gt(double decimal) {
		return gt(BigDecimal.valueOf(decimal));
	}

	/**
	 * Checks whether input argument is <i><b> greater than equal </b></i> to the provided
	 * {@link BigDecimal} or not;
	 * 
	 * @param decimal value to compare
	 * @return {@link Boolean} value
	 */
	public boolean gte(BigDecimal decimal) {
		return bigDecimal.compareTo(decimal) >= ZERO;
	}

	/**
	 * Checks whether input argument is <i><b> greater than equal </b></i> to the provided
	 * {@link BigDecimal} or not;
	 * 
	 * @param decimal value to compare
	 * @return {@link Boolean} value
	 */
	public boolean gte(double decimal) {
		return gte(BigDecimal.valueOf(decimal));
	}

	/**
	 * Checks whether input argument is <i><b> less than </b></i> to the provided
	 * {@link BigDecimal} or not;
	 * 
	 * @param decimal value to compare
	 * @return {@link Boolean} value
	 */
	public boolean lt(BigDecimal decimal) {
		return bigDecimal.compareTo(decimal) < ZERO;
	}

	/**
	 * Checks whether input argument is <i><b> less than </b></i> to the provided
	 * {@link BigDecimal} or not;
	 * 
	 * @param decimal value to compare
	 * @return {@link Boolean} value
	 */
	public boolean lt(double decimal) {
		return lt(BigDecimal.valueOf(decimal));
	}

	/**
	 * Checks whether input argument is <i><b> less than equal </b></i> to the provided
	 * {@link BigDecimal} or not;
	 * 
	 * @param decimal value to compare
	 * @return {@link Boolean} value
	 */
	public boolean lte(BigDecimal decimal) {
		return bigDecimal.compareTo(decimal) <= ZERO;
	}

	/**
	 * Checks whether input argument is <i><b> less than equal </b></i> to the provided
	 * {@link BigDecimal} or not;
	 * 
	 * @param decimal value to compare
	 * @return {@link Boolean} value
	 */
	public boolean lte(double decimal) {
		return lte(BigDecimal.valueOf(decimal));
	}
	
	/**
	 * Checks whether input argument is <i><b> not equal </b></i> to the provided
	 * {@link BigDecimal} or not;
	 * 
	 * @param decimal value to compare
	 * @return {@link Boolean} true if two are not equal.
	 */
	public boolean notEq(BigDecimal decimal) {
		return !eq(decimal);
	}

	/**
	 * Checks whether input argument is <i><b> not equal </b></i> to the provided
	 * {@link Double} or not;
	 * 
	 * @param decimal value to compare
	 * @return {@link Boolean} true if two are not equal.
	 */
	public boolean notEq(double decimal) {
		return !eq(decimal);
	}

	/**
	 * Checks whether input argument is <i><b> not greater than </b></i> to the provided
	 * {@link BigDecimal} or not;
	 * 
	 * @param decimal value to compare
	 * @return {@link Boolean} value
	 */
	public boolean notGt(BigDecimal decimal) {
		return !gt(decimal);
	}

	/**
	 * Checks whether input argument is <i><b> not greater than </b></i> to the provided
	 * {@link Double} or not;
	 * 
	 * @param decimal value to compare
	 * @return {@link Boolean} value
	 */
	public boolean notGt(double decimal) {
		return !gt(decimal);
	}

	/**
	 * Checks whether input argument is <i><b> not greater than or equal </b></i> to the provided
	 * {@link BigDecimal} or not;
	 * 
	 * @param decimal value to compare
	 * @return {@link Boolean} value
	 */
	public boolean notGte(BigDecimal decimal) {
		return !gte(decimal);
	}

	/**
	 * Checks whether input argument is <i><b> not greater than or equal </b></i> to the provided
	 * {@link Double} or not;
	 * 
	 * @param decimal value to compare
	 * @return {@link Boolean} value
	 */
	public boolean notGte(double decimal) {
		return !gte(decimal);
	}

	/**
	 * Checks whether input argument is <i><b> not less than </b></i> to the provided
	 * {@link BigDecimal} or not;
	 * 
	 * @param decimal value to compare
	 * @return {@link Boolean} value
	 */
	public boolean notLt(BigDecimal decimal) {
		return !lt(decimal);
	}

	/**
	 * Checks whether input argument is <i><b> not less than </b></i> to the provided
	 * {@link Double} or not;
	 * 
	 * @param decimal value to compare
	 * @return {@link Boolean} value
	 */
	public boolean notLt(double decimal) {
		return !lt(decimal);
	}

	/**
	 * Checks whether input argument is <i><b> not less than equal </b></i> to the provided
	 * {@link BigDecimal} or not;
	 * 
	 * @param decimal value to compare
	 * @return {@link Boolean} value
	 */
	public boolean notLte(BigDecimal decimal) {
		return !lte(decimal);
	}

	/**
	 * Checks whether input argument is <i><b> not less than equal </b></i> to the provided
	 * {@link Double} or not;
	 * 
	 * @param decimal value to compare
	 * @return {@link Boolean} value
	 */
	public boolean notLte(double decimal) {
		return !lte(decimal);
	}
	
	/**
	 * 
	 * @return true if the value is greater than zero
	 */
	public boolean isPositive() {
		return gt(ZERO);
	}
	
	/**
	 * 
	 * @return true if the value is less than zero
	 */
	public boolean isNegative() {
		return lt(ZERO);
	}

	/**
	 * 
	 * @return true if the value is less than or equal with zero
	 */
	public boolean isNonPositive() {
		return lte(ZERO);
	}
	
	/**
	 * 
	 * @return true if the value is greater than or equal with zero
	 */
	public boolean isNonNegetive() {
		return gte(ZERO);
	}
	
	/**
	 * 
	 * @return true if the value is equal with zero
	 */
	public boolean isZero() {
		return eq(ZERO);
	}
	
	/**
	 * 
	 * @return true if the value is greater than or less than zero
	 */
	public boolean isNotZero() {
		return notEq(ZERO);
	}
}