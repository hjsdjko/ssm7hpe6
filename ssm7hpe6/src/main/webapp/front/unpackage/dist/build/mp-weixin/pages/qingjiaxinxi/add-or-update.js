(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/qingjiaxinxi/add-or-update"],{"080c":function(e,n,i){"use strict";(function(e){Object.defineProperty(n,"__esModule",{value:!0}),n.default=void 0;var r=t(i("a34a"));function t(e){return e&&e.__esModule?e:{default:e}}function a(e,n,i,r,t,a,o){try{var u=e[a](o),s=u.value}catch(c){return void i(c)}u.done?n(s):Promise.resolve(s).then(r,t)}function o(e){return function(){var n=this,i=arguments;return new Promise((function(r,t){var o=e.apply(n,i);function u(e){a(o,r,t,u,s,"next",e)}function s(e){a(o,r,t,u,s,"throw",e)}u(void 0)}))}}var u=function(){Promise.all([i.e("common/vendor"),i.e("components/w-picker/w-picker")]).then(function(){return resolve(i("9d39"))}.bind(null,i)).catch(i.oe)},s={data:function(){return{ruleForm:{bianhao:this.getUUID(),biaoti:"",gonghao:"",jiaoshixingming:"",qingjianeirong:"",qingjiariqi:"",jieshuriqi:"",xuehao:"",xueshengxingming:"",sfsh:"",shhf:"",userid:""},gonghaoOptions:[],gonghaoIndex:0,user:{},ro:{bianhao:!1,biaoti:!1,gonghao:!1,jiaoshixingming:!1,qingjianeirong:!1,qingjiariqi:!1,jieshuriqi:!1,xuehao:!1,xueshengxingming:!1,sfsh:!1,shhf:!1,userid:!1}}},components:{wPicker:u},computed:{},onLoad:function(n){var i=this;return o(r.default.mark((function t(){var a,o,u,s;return r.default.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return a=e.getStorageSync("nowTable"),t.next=3,i.$api.session(a);case 3:return o=t.sent,i.user=o.data,i.ruleForm.xuehao=i.user.xuehao,i.ruleForm.xueshengxingming=i.user.xueshengxingming,t.next=9,i.$api.option("jiaoshi","gonghao",{});case 9:if(o=t.sent,i.gonghaoOptions=o.data,i.ruleForm.userid=e.getStorageSync("userid"),n.refid&&(i.ruleForm.refid=n.refid,i.ruleForm.nickname=e.getStorageSync("nickname")),!n.id){t.next=19;break}return i.ruleForm.id=n.id,t.next=17,i.$api.info("qingjiaxinxi",i.ruleForm.id);case 17:o=t.sent,i.ruleForm=o.data;case 19:if(!n.cross){t.next=66;break}u=e.getStorageSync("crossObj"),t.t0=r.default.keys(u);case 22:if((t.t1=t.t0()).done){t.next=66;break}if(s=t.t1.value,"bianhao"!=s){t.next=28;break}return i.ruleForm.bianhao=u[s],i.ro.bianhao=!0,t.abrupt("continue",22);case 28:if("biaoti"!=s){t.next=32;break}return i.ruleForm.biaoti=u[s],i.ro.biaoti=!0,t.abrupt("continue",22);case 32:if("gonghao"!=s){t.next=36;break}return i.ruleForm.gonghao=u[s],i.ro.gonghao=!0,t.abrupt("continue",22);case 36:if("jiaoshixingming"!=s){t.next=40;break}return i.ruleForm.jiaoshixingming=u[s],i.ro.jiaoshixingming=!0,t.abrupt("continue",22);case 40:if("qingjianeirong"!=s){t.next=44;break}return i.ruleForm.qingjianeirong=u[s],i.ro.qingjianeirong=!0,t.abrupt("continue",22);case 44:if("qingjiariqi"!=s){t.next=48;break}return i.ruleForm.qingjiariqi=u[s],i.ro.qingjiariqi=!0,t.abrupt("continue",22);case 48:if("jieshuriqi"!=s){t.next=52;break}return i.ruleForm.jieshuriqi=u[s],i.ro.jieshuriqi=!0,t.abrupt("continue",22);case 52:if("xuehao"!=s){t.next=56;break}return i.ruleForm.xuehao=u[s],i.ro.xuehao=!0,t.abrupt("continue",22);case 56:if("xueshengxingming"!=s){t.next=60;break}return i.ruleForm.xueshengxingming=u[s],i.ro.xueshengxingming=!0,t.abrupt("continue",22);case 60:if("userid"!=s){t.next=64;break}return i.ruleForm.userid=u[s],i.ro.userid=!0,t.abrupt("continue",22);case 64:t.next=22;break;case 66:i.styleChange();case 67:case"end":return t.stop()}}),t)})))()},methods:{styleChange:function(){this.$nextTick((function(){}))},gonghaoChange:function(e){var n=this;return o(r.default.mark((function i(){var t;return r.default.wrap((function(i){while(1)switch(i.prev=i.next){case 0:return n.gonghaoIndex=e.target.value,n.ruleForm.gonghao=n.gonghaoOptions[n.gonghaoIndex],i.next=4,n.$api.follow("jiaoshi","gonghao",{columnValue:n.ruleForm.gonghao});case 4:t=i.sent,t.data.jiaoshixingming&&(n.ruleForm.jiaoshixingming=t.data.jiaoshixingming);case 6:case"end":return i.stop()}}),i)})))()},qingjiariqiChange:function(e){this.ruleForm.qingjiariqi=e.target.value,this.$forceUpdate()},jieshuriqiChange:function(e){this.ruleForm.jieshuriqi=e.target.value,this.$forceUpdate()},getUUID:function(){return(new Date).getTime()},onSubmitTap:function(){var e=this;return o(r.default.mark((function n(){return r.default.wrap((function(n){while(1)switch(n.prev=n.next){case 0:if(e.ruleForm.biaoti){n.next=3;break}return e.$utils.msg("标题不能为空"),n.abrupt("return");case 3:if(e.ruleForm.userid){n.next=6;break}return e.$utils.msg("用户id不能为空"),n.abrupt("return");case 6:if(!e.ruleForm.id){n.next=11;break}return n.next=9,e.$api.update("qingjiaxinxi",e.ruleForm);case 9:n.next=13;break;case 11:return n.next=13,e.$api.add("qingjiaxinxi",e.ruleForm);case 13:e.$utils.msgBack("提交成功");case 14:case"end":return n.stop()}}),n)})))()},optionsChange:function(e){this.index=e.target.value},bindDateChange:function(e){this.date=e.target.value},getDate:function(e){var n=new Date,i=n.getFullYear(),r=n.getMonth()+1,t=n.getDate();return"start"===e?i-=60:"end"===e&&(i+=2),r=r>9?r:"0"+r,t=t>9?t:"0"+t,"".concat(i,"-").concat(r,"-").concat(t)},toggleTab:function(e){this.$refs[e].show()}}};n.default=s}).call(this,i("543d")["default"])},"726d":function(e,n,i){"use strict";i.r(n);var r=i("080c"),t=i.n(r);for(var a in r)"default"!==a&&function(e){i.d(n,e,(function(){return r[e]}))}(a);n["default"]=t.a},"78d3":function(e,n,i){},"81d2":function(e,n,i){"use strict";(function(e){i("f4a8");r(i("66fd"));var n=r(i("e762"));function r(e){return e&&e.__esModule?e:{default:e}}e(n.default)}).call(this,i("543d")["createPage"])},ae63:function(e,n,i){"use strict";var r=i("78d3"),t=i.n(r);t.a},e762:function(e,n,i){"use strict";i.r(n);var r=i("f468"),t=i("726d");for(var a in t)"default"!==a&&function(e){i.d(n,e,(function(){return t[e]}))}(a);i("ae63");var o,u=i("f0c5"),s=Object(u["a"])(t["default"],r["b"],r["c"],!1,null,"5cba789e",null,!1,r["a"],o);n["default"]=s.exports},f468:function(e,n,i){"use strict";var r;i.d(n,"b",(function(){return t})),i.d(n,"c",(function(){return a})),i.d(n,"a",(function(){return r}));var t=function(){var e=this,n=e.$createElement;e._self._c},a=[]}},[["81d2","common/runtime","common/vendor"]]]);