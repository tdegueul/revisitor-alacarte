/**
 */
package ifstatement.impl;

import ifstatement.If;
import ifstatement.IfstatementPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import simpleimp.Block;
import simpleimp.Condition;

import simpleimp.impl.StatementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ifstatement.impl.IfImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link ifstatement.impl.IfImpl#getThn <em>Thn</em>}</li>
 *   <li>{@link ifstatement.impl.IfImpl#getEls <em>Els</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfImpl extends StatementImpl implements If {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The cached value of the '{@link #getThn() <em>Thn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThn()
	 * @generated
	 * @ordered
	 */
	protected Block thn;

	/**
	 * The cached value of the '{@link #getEls() <em>Els</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEls()
	 * @generated
	 * @ordered
	 */
	protected Block els;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IfstatementPackage.Literals.IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IfstatementPackage.IF__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IfstatementPackage.IF__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IfstatementPackage.IF__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IfstatementPackage.IF__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getThn() {
		return thn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThn(Block newThn, NotificationChain msgs) {
		Block oldThn = thn;
		thn = newThn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IfstatementPackage.IF__THN, oldThn, newThn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThn(Block newThn) {
		if (newThn != thn) {
			NotificationChain msgs = null;
			if (thn != null)
				msgs = ((InternalEObject)thn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IfstatementPackage.IF__THN, null, msgs);
			if (newThn != null)
				msgs = ((InternalEObject)newThn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IfstatementPackage.IF__THN, null, msgs);
			msgs = basicSetThn(newThn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IfstatementPackage.IF__THN, newThn, newThn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getEls() {
		return els;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEls(Block newEls, NotificationChain msgs) {
		Block oldEls = els;
		els = newEls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IfstatementPackage.IF__ELS, oldEls, newEls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEls(Block newEls) {
		if (newEls != els) {
			NotificationChain msgs = null;
			if (els != null)
				msgs = ((InternalEObject)els).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IfstatementPackage.IF__ELS, null, msgs);
			if (newEls != null)
				msgs = ((InternalEObject)newEls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IfstatementPackage.IF__ELS, null, msgs);
			msgs = basicSetEls(newEls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IfstatementPackage.IF__ELS, newEls, newEls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IfstatementPackage.IF__CONDITION:
				return basicSetCondition(null, msgs);
			case IfstatementPackage.IF__THN:
				return basicSetThn(null, msgs);
			case IfstatementPackage.IF__ELS:
				return basicSetEls(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IfstatementPackage.IF__CONDITION:
				return getCondition();
			case IfstatementPackage.IF__THN:
				return getThn();
			case IfstatementPackage.IF__ELS:
				return getEls();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IfstatementPackage.IF__CONDITION:
				setCondition((Condition)newValue);
				return;
			case IfstatementPackage.IF__THN:
				setThn((Block)newValue);
				return;
			case IfstatementPackage.IF__ELS:
				setEls((Block)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IfstatementPackage.IF__CONDITION:
				setCondition((Condition)null);
				return;
			case IfstatementPackage.IF__THN:
				setThn((Block)null);
				return;
			case IfstatementPackage.IF__ELS:
				setEls((Block)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IfstatementPackage.IF__CONDITION:
				return condition != null;
			case IfstatementPackage.IF__THN:
				return thn != null;
			case IfstatementPackage.IF__ELS:
				return els != null;
		}
		return super.eIsSet(featureID);
	}

} //IfImpl
