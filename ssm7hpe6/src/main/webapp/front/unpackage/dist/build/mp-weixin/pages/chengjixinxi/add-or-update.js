(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/chengjixinxi/add-or-update"],{"1afd":function(e,n,r){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var t=a(r("a34a"));function a(e){return e&&e.__esModule?e:{default:e}}function u(e,n,r,t,a,u,i){try{var o=e[u](i),c=o.value}catch(s){return void r(s)}o.done?n(c):Promise.resolve(c).then(t,a)}function i(e){return function(){var n=this,r=arguments;return new Promise((function(t,a){var i=e.apply(n,r);function o(e){u(i,t,a,o,c,"next",e)}function c(e){u(i,t,a,o,c,"throw",e)}o(void 0)}))}}var o=function(){Promise.all([r.e("common/vendor"),r.e("components/w-picker/w-picker")]).then(function(){return resolve(r("9d39"))}.bind(null,r)).catch(r.oe)},c={data:function(){return{ruleForm:{bianhao:this.getUUID(),mingcheng:"",xuehao:"",xueshengxingming:"",kemu:"",chengji:"",dianping:"",gonghao:"",jiaoshixingming:"",userid:""},xuehaoOptions:[],xuehaoIndex:0,user:{},ro:{bianhao:!1,mingcheng:!1,xuehao:!1,xueshengxingming:!1,kemu:!1,chengji:!1,dianping:!1,gonghao:!1,jiaoshixingming:!1,userid:!1}}},components:{wPicker:o},computed:{},onLoad:function(n){var r=this;return i(t.default.mark((function a(){var u,i,o,c;return t.default.wrap((function(a){while(1)switch(a.prev=a.next){case 0:return u=e.getStorageSync("nowTable"),a.next=3,r.$api.session(u);case 3:return i=a.sent,r.user=i.data,r.ruleForm.gonghao=r.user.gonghao,r.ruleForm.jiaoshixingming=r.user.jiaoshixingming,a.next=9,r.$api.option("xuesheng","xuehao",{});case 9:if(i=a.sent,r.xuehaoOptions=i.data,r.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(r.ruleForm.refid=n.refid,r.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){a.next=19;break}return r.ruleForm.id=n.id,a.next=17,r.$api.info("chengjixinxi",r.ruleForm.id);case 17:i=a.sent,r.ruleForm=i.data;case 19:if(!n.cross){a.next=66;break}o=e.getStorageSync("crossObj"),a.t0=t.default.keys(o);case 22:if((a.t1=a.t0()).done){a.next=66;break}if(c=a.t1.value,"bianhao"!=c){a.next=28;break}return r.ruleForm.bianhao=o[c],r.ro.bianhao=!0,a.abrupt("continue",22);case 28:if("mingcheng"!=c){a.next=32;break}return r.ruleForm.mingcheng=o[c],r.ro.mingcheng=!0,a.abrupt("continue",22);case 32:if("xuehao"!=c){a.next=36;break}return r.ruleForm.xuehao=o[c],r.ro.xuehao=!0,a.abrupt("continue",22);case 36:if("xueshengxingming"!=c){a.next=40;break}return r.ruleForm.xueshengxingming=o[c],r.ro.xueshengxingming=!0,a.abrupt("continue",22);case 40:if("kemu"!=c){a.next=44;break}return r.ruleForm.kemu=o[c],r.ro.kemu=!0,a.abrupt("continue",22);case 44:if("chengji"!=c){a.next=48;break}return r.ruleForm.chengji=o[c],r.ro.chengji=!0,a.abrupt("continue",22);case 48:if("dianping"!=c){a.next=52;break}return r.ruleForm.dianping=o[c],r.ro.dianping=!0,a.abrupt("continue",22);case 52:if("gonghao"!=c){a.next=56;break}return r.ruleForm.gonghao=o[c],r.ro.gonghao=!0,a.abrupt("continue",22);case 56:if("jiaoshixingming"!=c){a.next=60;break}return r.ruleForm.jiaoshixingming=o[c],r.ro.jiaoshixingming=!0,a.abrupt("continue",22);case 60:if("userid"!=c){a.next=64;break}return r.ruleForm.userid=o[c],r.ro.userid=!0,a.abrupt("continue",22);case 64:a.next=22;break;case 66:r.styleChange();case 67:case"end":return a.stop()}}),a)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},xuehaoChange:function(e){var n=this;return i(t.default.mark((function r(){var a;return t.default.wrap((function(r){while(1)switch(r.prev=r.next){case 0:return n.xuehaoIndex=e.target.value,n.ruleForm.xuehao=n.xuehaoOptions[n.xuehaoIndex],r.next=4,n.$api.follow("xuesheng","xuehao",{columnValue:n.ruleForm.xuehao});case 4:a=r.sent,a.data.xueshengxingming&&(n.ruleForm.xueshengxingming=a.data.xueshengxingming);case 6:case"end":return r.stop()}}),r)})))()},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=this;return i(t.default.mark((function n(){return t.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:if(e.ruleForm.mingcheng){n.next=3;break}return e.$utils.msg("名称不能为空"),n.abrupt("return");case 3:if(e.ruleForm.kemu){n.next=6;break}return e.$utils.msg("科目不能为空"),n.abrupt("return");case 6:if(e.ruleForm.chengji){n.next=9;break}return e.$utils.msg("成绩不能为空"),n.abrupt("return");case 9:if(e.ruleForm.userid){n.next=12;break}return e.$utils.msg("用户id不能为空"),n.abrupt("return");case 12:if(!e.ruleForm.id){n.next=17;break}return n.next=15,e.$api.update("chengjixinxi",e.ruleForm);case 15:n.next=19;break;case 17:return n.next=19,e.$api.add("chengjixinxi",e.ruleForm);case 19:e.$utils.msgBack("提交成功");case 20:case"end":return n.stop()}}),n)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,r=n.getFullYear(),t=n.getMonth()+1,a=n.getDate();return"start"===e?r-=60:"end"===e&&(r+=2),t=t>9?t:"0"+t,a=a>9?a:"0"+a,"".concat(r,"-").concat(t,"-").concat(a)},toggleTab:function(e){this.$refs[e].show()}}};n.default=c}).call(this,r("543d")["default"])},"38d7":function(e,n,r){"use strict";(function(e){r("f4a8");t(r("66fd"));var n=t(r("aa24"));function t(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,r("543d")["createPage"])},"4d2a":function(e,n,r){"use strict";var t;r.d(n,"b",(function(){return a})),r.d(n,"c",(function(){return u})),r.d(n,"a",(function(){return t}));var a=function(){var e=this,n=e.$createElement;e._self._c},u=[]},"547f":function(e,n,r){"use strict";r.r(n);var t=r("1afd"),a=r.n(t);for(var u in t)"default"!==u&&function(e){r.d(n,e,(function(){return t[e]}))}(u);n["default"]=a.a},"8e51":function(e,n,r){"use strict";var t=r("e1d0"),a=r.n(t);a.a},aa24:function(e,n,r){"use strict";r.r(n);var t=r("4d2a"),a=r("547f");for(var u in a)"default"!==u&&function(e){r.d(n,e,(function(){return a[e]}))}(u);r("8e51");var i,o=r("f0c5"),c=Object(o["a"])(a["default"],t["b"],t["c"],!1,null,"c3a8d6c0",null,!1,t["a"],i);n["default"]=c.exports},e1d0:function(e,n,r){}},[["38d7","common/runtime","common/vendor"]]]);