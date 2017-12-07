package cn.javaer.wechat.sdk.pay.model;

import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link WeChatPayOrderQueryResponse} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public abstract class AbstractWeChatPayOrderQueryResponseAssert<S extends AbstractWeChatPayOrderQueryResponseAssert<S, A>, A extends WeChatPayOrderQueryResponse> extends AbstractAbstractWeChatPayResponseAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractWeChatPayOrderQueryResponseAssert}</code> to make assertions on actual WeChatPayOrderQueryResponse.
   * @param actual the WeChatPayOrderQueryResponse we want to make assertions on.
   */
  protected AbstractWeChatPayOrderQueryResponseAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's attach is equal to the given one.
   * @param attach the given attach to compare the actual WeChatPayOrderQueryResponse's attach to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's attach is not equal to the given one.
   */
  public S hasAttach(String attach) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting attach of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualAttach = actual.getAttach();
    if (!Objects.areEqual(actualAttach, attach)) {
      failWithMessage(assertjErrorMessage, actual, attach, actualAttach);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's bankType is equal to the given one.
   * @param bankType the given bankType to compare the actual WeChatPayOrderQueryResponse's bankType to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's bankType is not equal to the given one.
   */
  public S hasBankType(String bankType) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting bankType of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualBankType = actual.getBankType();
    if (!Objects.areEqual(actualBankType, bankType)) {
      failWithMessage(assertjErrorMessage, actual, bankType, actualBankType);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's cashFee is equal to the given one.
   * @param cashFee the given cashFee to compare the actual WeChatPayOrderQueryResponse's cashFee to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's cashFee is not equal to the given one.
   */
  public S hasCashFee(String cashFee) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting cashFee of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCashFee = actual.getCashFee();
    if (!Objects.areEqual(actualCashFee, cashFee)) {
      failWithMessage(assertjErrorMessage, actual, cashFee, actualCashFee);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's cashFeeType is equal to the given one.
   * @param cashFeeType the given cashFeeType to compare the actual WeChatPayOrderQueryResponse's cashFeeType to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's cashFeeType is not equal to the given one.
   */
  public S hasCashFeeType(String cashFeeType) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting cashFeeType of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCashFeeType = actual.getCashFeeType();
    if (!Objects.areEqual(actualCashFeeType, cashFeeType)) {
      failWithMessage(assertjErrorMessage, actual, cashFeeType, actualCashFeeType);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's couponCount is equal to the given one.
   * @param couponCount the given couponCount to compare the actual WeChatPayOrderQueryResponse's couponCount to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's couponCount is not equal to the given one.
   */
  public S hasCouponCount(String couponCount) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting couponCount of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCouponCount = actual.getCouponCount();
    if (!Objects.areEqual(actualCouponCount, couponCount)) {
      failWithMessage(assertjErrorMessage, actual, couponCount, actualCouponCount);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's couponFee is equal to the given one.
   * @param couponFee the given couponFee to compare the actual WeChatPayOrderQueryResponse's couponFee to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's couponFee is not equal to the given one.
   */
  public S hasCouponFee(String couponFee) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting couponFee of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCouponFee = actual.getCouponFee();
    if (!Objects.areEqual(actualCouponFee, couponFee)) {
      failWithMessage(assertjErrorMessage, actual, couponFee, actualCouponFee);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's couponFee0 is equal to the given one.
   * @param couponFee0 the given couponFee0 to compare the actual WeChatPayOrderQueryResponse's couponFee0 to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's couponFee0 is not equal to the given one.
   */
  public S hasCouponFee0(String couponFee0) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting couponFee0 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCouponFee0 = actual.getCouponFee0();
    if (!Objects.areEqual(actualCouponFee0, couponFee0)) {
      failWithMessage(assertjErrorMessage, actual, couponFee0, actualCouponFee0);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's couponFee1 is equal to the given one.
   * @param couponFee1 the given couponFee1 to compare the actual WeChatPayOrderQueryResponse's couponFee1 to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's couponFee1 is not equal to the given one.
   */
  public S hasCouponFee1(String couponFee1) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting couponFee1 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCouponFee1 = actual.getCouponFee1();
    if (!Objects.areEqual(actualCouponFee1, couponFee1)) {
      failWithMessage(assertjErrorMessage, actual, couponFee1, actualCouponFee1);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's couponFee2 is equal to the given one.
   * @param couponFee2 the given couponFee2 to compare the actual WeChatPayOrderQueryResponse's couponFee2 to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's couponFee2 is not equal to the given one.
   */
  public S hasCouponFee2(String couponFee2) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting couponFee2 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCouponFee2 = actual.getCouponFee2();
    if (!Objects.areEqual(actualCouponFee2, couponFee2)) {
      failWithMessage(assertjErrorMessage, actual, couponFee2, actualCouponFee2);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's couponFee3 is equal to the given one.
   * @param couponFee3 the given couponFee3 to compare the actual WeChatPayOrderQueryResponse's couponFee3 to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's couponFee3 is not equal to the given one.
   */
  public S hasCouponFee3(String couponFee3) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting couponFee3 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCouponFee3 = actual.getCouponFee3();
    if (!Objects.areEqual(actualCouponFee3, couponFee3)) {
      failWithMessage(assertjErrorMessage, actual, couponFee3, actualCouponFee3);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's couponFee4 is equal to the given one.
   * @param couponFee4 the given couponFee4 to compare the actual WeChatPayOrderQueryResponse's couponFee4 to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's couponFee4 is not equal to the given one.
   */
  public S hasCouponFee4(String couponFee4) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting couponFee4 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCouponFee4 = actual.getCouponFee4();
    if (!Objects.areEqual(actualCouponFee4, couponFee4)) {
      failWithMessage(assertjErrorMessage, actual, couponFee4, actualCouponFee4);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's couponId0 is equal to the given one.
   * @param couponId0 the given couponId0 to compare the actual WeChatPayOrderQueryResponse's couponId0 to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's couponId0 is not equal to the given one.
   */
  public S hasCouponId0(String couponId0) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting couponId0 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCouponId0 = actual.getCouponId0();
    if (!Objects.areEqual(actualCouponId0, couponId0)) {
      failWithMessage(assertjErrorMessage, actual, couponId0, actualCouponId0);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's couponId1 is equal to the given one.
   * @param couponId1 the given couponId1 to compare the actual WeChatPayOrderQueryResponse's couponId1 to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's couponId1 is not equal to the given one.
   */
  public S hasCouponId1(String couponId1) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting couponId1 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCouponId1 = actual.getCouponId1();
    if (!Objects.areEqual(actualCouponId1, couponId1)) {
      failWithMessage(assertjErrorMessage, actual, couponId1, actualCouponId1);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's couponId2 is equal to the given one.
   * @param couponId2 the given couponId2 to compare the actual WeChatPayOrderQueryResponse's couponId2 to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's couponId2 is not equal to the given one.
   */
  public S hasCouponId2(String couponId2) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting couponId2 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCouponId2 = actual.getCouponId2();
    if (!Objects.areEqual(actualCouponId2, couponId2)) {
      failWithMessage(assertjErrorMessage, actual, couponId2, actualCouponId2);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's couponId3 is equal to the given one.
   * @param couponId3 the given couponId3 to compare the actual WeChatPayOrderQueryResponse's couponId3 to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's couponId3 is not equal to the given one.
   */
  public S hasCouponId3(String couponId3) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting couponId3 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCouponId3 = actual.getCouponId3();
    if (!Objects.areEqual(actualCouponId3, couponId3)) {
      failWithMessage(assertjErrorMessage, actual, couponId3, actualCouponId3);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's couponId4 is equal to the given one.
   * @param couponId4 the given couponId4 to compare the actual WeChatPayOrderQueryResponse's couponId4 to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's couponId4 is not equal to the given one.
   */
  public S hasCouponId4(String couponId4) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting couponId4 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCouponId4 = actual.getCouponId4();
    if (!Objects.areEqual(actualCouponId4, couponId4)) {
      failWithMessage(assertjErrorMessage, actual, couponId4, actualCouponId4);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's couponType0 is equal to the given one.
   * @param couponType0 the given couponType0 to compare the actual WeChatPayOrderQueryResponse's couponType0 to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's couponType0 is not equal to the given one.
   */
  public S hasCouponType0(String couponType0) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting couponType0 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCouponType0 = actual.getCouponType0();
    if (!Objects.areEqual(actualCouponType0, couponType0)) {
      failWithMessage(assertjErrorMessage, actual, couponType0, actualCouponType0);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's couponType1 is equal to the given one.
   * @param couponType1 the given couponType1 to compare the actual WeChatPayOrderQueryResponse's couponType1 to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's couponType1 is not equal to the given one.
   */
  public S hasCouponType1(String couponType1) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting couponType1 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCouponType1 = actual.getCouponType1();
    if (!Objects.areEqual(actualCouponType1, couponType1)) {
      failWithMessage(assertjErrorMessage, actual, couponType1, actualCouponType1);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's couponType2 is equal to the given one.
   * @param couponType2 the given couponType2 to compare the actual WeChatPayOrderQueryResponse's couponType2 to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's couponType2 is not equal to the given one.
   */
  public S hasCouponType2(String couponType2) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting couponType2 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCouponType2 = actual.getCouponType2();
    if (!Objects.areEqual(actualCouponType2, couponType2)) {
      failWithMessage(assertjErrorMessage, actual, couponType2, actualCouponType2);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's couponType3 is equal to the given one.
   * @param couponType3 the given couponType3 to compare the actual WeChatPayOrderQueryResponse's couponType3 to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's couponType3 is not equal to the given one.
   */
  public S hasCouponType3(String couponType3) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting couponType3 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCouponType3 = actual.getCouponType3();
    if (!Objects.areEqual(actualCouponType3, couponType3)) {
      failWithMessage(assertjErrorMessage, actual, couponType3, actualCouponType3);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's couponType4 is equal to the given one.
   * @param couponType4 the given couponType4 to compare the actual WeChatPayOrderQueryResponse's couponType4 to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's couponType4 is not equal to the given one.
   */
  public S hasCouponType4(String couponType4) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting couponType4 of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualCouponType4 = actual.getCouponType4();
    if (!Objects.areEqual(actualCouponType4, couponType4)) {
      failWithMessage(assertjErrorMessage, actual, couponType4, actualCouponType4);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's detail is equal to the given one.
   * @param detail the given detail to compare the actual WeChatPayOrderQueryResponse's detail to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's detail is not equal to the given one.
   */
  public S hasDetail(String detail) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting detail of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualDetail = actual.getDetail();
    if (!Objects.areEqual(actualDetail, detail)) {
      failWithMessage(assertjErrorMessage, actual, detail, actualDetail);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's feeType is equal to the given one.
   * @param feeType the given feeType to compare the actual WeChatPayOrderQueryResponse's feeType to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's feeType is not equal to the given one.
   */
  public S hasFeeType(String feeType) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting feeType of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualFeeType = actual.getFeeType();
    if (!Objects.areEqual(actualFeeType, feeType)) {
      failWithMessage(assertjErrorMessage, actual, feeType, actualFeeType);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's isSubscribe is equal to the given one.
   * @param isSubscribe the given isSubscribe to compare the actual WeChatPayOrderQueryResponse's isSubscribe to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's isSubscribe is not equal to the given one.
   */
  public S hasIsSubscribe(String isSubscribe) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting isSubscribe of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualIsSubscribe = actual.getIsSubscribe();
    if (!Objects.areEqual(actualIsSubscribe, isSubscribe)) {
      failWithMessage(assertjErrorMessage, actual, isSubscribe, actualIsSubscribe);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's openid is equal to the given one.
   * @param openid the given openid to compare the actual WeChatPayOrderQueryResponse's openid to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's openid is not equal to the given one.
   */
  public S hasOpenid(String openid) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting openid of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualOpenid = actual.getOpenid();
    if (!Objects.areEqual(actualOpenid, openid)) {
      failWithMessage(assertjErrorMessage, actual, openid, actualOpenid);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's outTradeNo is equal to the given one.
   * @param outTradeNo the given outTradeNo to compare the actual WeChatPayOrderQueryResponse's outTradeNo to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's outTradeNo is not equal to the given one.
   */
  public S hasOutTradeNo(String outTradeNo) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting outTradeNo of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualOutTradeNo = actual.getOutTradeNo();
    if (!Objects.areEqual(actualOutTradeNo, outTradeNo)) {
      failWithMessage(assertjErrorMessage, actual, outTradeNo, actualOutTradeNo);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's settlementTotalFee is equal to the given one.
   * @param settlementTotalFee the given settlementTotalFee to compare the actual WeChatPayOrderQueryResponse's settlementTotalFee to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's settlementTotalFee is not equal to the given one.
   */
  public S hasSettlementTotalFee(String settlementTotalFee) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting settlementTotalFee of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualSettlementTotalFee = actual.getSettlementTotalFee();
    if (!Objects.areEqual(actualSettlementTotalFee, settlementTotalFee)) {
      failWithMessage(assertjErrorMessage, actual, settlementTotalFee, actualSettlementTotalFee);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's subIsSubscribe is equal to the given one.
   * @param subIsSubscribe the given subIsSubscribe to compare the actual WeChatPayOrderQueryResponse's subIsSubscribe to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's subIsSubscribe is not equal to the given one.
   */
  public S hasSubIsSubscribe(String subIsSubscribe) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting subIsSubscribe of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualSubIsSubscribe = actual.getSubIsSubscribe();
    if (!Objects.areEqual(actualSubIsSubscribe, subIsSubscribe)) {
      failWithMessage(assertjErrorMessage, actual, subIsSubscribe, actualSubIsSubscribe);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's subOpenid is equal to the given one.
   * @param subOpenid the given subOpenid to compare the actual WeChatPayOrderQueryResponse's subOpenid to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's subOpenid is not equal to the given one.
   */
  public S hasSubOpenid(String subOpenid) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting subOpenid of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualSubOpenid = actual.getSubOpenid();
    if (!Objects.areEqual(actualSubOpenid, subOpenid)) {
      failWithMessage(assertjErrorMessage, actual, subOpenid, actualSubOpenid);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's timeEnd is equal to the given one.
   * @param timeEnd the given timeEnd to compare the actual WeChatPayOrderQueryResponse's timeEnd to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's timeEnd is not equal to the given one.
   */
  public S hasTimeEnd(String timeEnd) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting timeEnd of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualTimeEnd = actual.getTimeEnd();
    if (!Objects.areEqual(actualTimeEnd, timeEnd)) {
      failWithMessage(assertjErrorMessage, actual, timeEnd, actualTimeEnd);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's totalFee is equal to the given one.
   * @param totalFee the given totalFee to compare the actual WeChatPayOrderQueryResponse's totalFee to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's totalFee is not equal to the given one.
   */
  public S hasTotalFee(String totalFee) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting totalFee of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualTotalFee = actual.getTotalFee();
    if (!Objects.areEqual(actualTotalFee, totalFee)) {
      failWithMessage(assertjErrorMessage, actual, totalFee, actualTotalFee);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's tradeState is equal to the given one.
   * @param tradeState the given tradeState to compare the actual WeChatPayOrderQueryResponse's tradeState to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's tradeState is not equal to the given one.
   */
  public S hasTradeState(String tradeState) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting tradeState of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualTradeState = actual.getTradeState();
    if (!Objects.areEqual(actualTradeState, tradeState)) {
      failWithMessage(assertjErrorMessage, actual, tradeState, actualTradeState);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's tradeStateDesc is equal to the given one.
   * @param tradeStateDesc the given tradeStateDesc to compare the actual WeChatPayOrderQueryResponse's tradeStateDesc to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's tradeStateDesc is not equal to the given one.
   */
  public S hasTradeStateDesc(String tradeStateDesc) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting tradeStateDesc of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualTradeStateDesc = actual.getTradeStateDesc();
    if (!Objects.areEqual(actualTradeStateDesc, tradeStateDesc)) {
      failWithMessage(assertjErrorMessage, actual, tradeStateDesc, actualTradeStateDesc);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's tradeType is equal to the given one.
   * @param tradeType the given tradeType to compare the actual WeChatPayOrderQueryResponse's tradeType to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's tradeType is not equal to the given one.
   */
  public S hasTradeType(String tradeType) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting tradeType of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualTradeType = actual.getTradeType();
    if (!Objects.areEqual(actualTradeType, tradeType)) {
      failWithMessage(assertjErrorMessage, actual, tradeType, actualTradeType);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WeChatPayOrderQueryResponse's transactionId is equal to the given one.
   * @param transactionId the given transactionId to compare the actual WeChatPayOrderQueryResponse's transactionId to.
   * @return this assertion object.
   * @throws AssertionError - if the actual WeChatPayOrderQueryResponse's transactionId is not equal to the given one.
   */
  public S hasTransactionId(String transactionId) {
    // check that actual WeChatPayOrderQueryResponse we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting transactionId of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    String actualTransactionId = actual.getTransactionId();
    if (!Objects.areEqual(actualTransactionId, transactionId)) {
      failWithMessage(assertjErrorMessage, actual, transactionId, actualTransactionId);
    }

    // return the current assertion for method chaining
    return myself;
  }

}
