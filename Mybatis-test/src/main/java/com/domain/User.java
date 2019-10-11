    /**
     * 查询优惠券领取数量（实例单表查询）
     * @param couponReceiveNumberQuery
     * @return 优惠券领取数量
     **/
    @PostMapping("/list-receive")
    @ApiOperation("查询优惠券领取列表")
    public ResponseMsg<List<CouponReceiveRecordsDTO>> listReceive(@RequestBody CouponReceiveListQuery couponReceiveListQuery) {
        PageInfo<CouponReceiveRecordsDTO> pageInfo = couponService.pageReceive(couponReceiveListQuery);
        return CommonFunctions.runSupplierByPage(() -> pageInfo, "查询列表失败");
    }

    couponStatus 优惠券-优惠券状态:[0]设计中,[1]启用,[2]作废

    /**
     * @Description 查询优惠券领取列表
     * @Author yangshaoxin
     * @Date 2019/4/17 17:44
     * @Param [couponReceiveListQuery]
     * @return com.github.pagehelper.PageInfo<CouponReceiveRecordsDTO>
     **/
    PageInfo<CouponReceiveRecordsDTO> pageReceive(CouponReceiveListQuery couponReceiveListQuery);
