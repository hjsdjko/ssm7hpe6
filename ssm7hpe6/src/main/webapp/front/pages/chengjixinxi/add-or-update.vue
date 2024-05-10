<template>
	<view class="content">
		<form class="app-update-pv">
			
									<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">编号</view>
				<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="right-input">
					{{ruleForm.bianhao}}
				</view>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">名称</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.mingcheng" v-model="ruleForm.mingcheng" placeholder="名称"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">学号</view>
				<picker @change="xuehaoChange" :value="xuehaoIndex" :range="xuehaoOptions">
					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{xuehaoOptions[xuehaoIndex]}}</view>
				</picker>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">学生姓名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xueshengxingming" v-model="ruleForm.xueshengxingming" placeholder="学生姓名"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">科目</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.kemu" v-model="ruleForm.kemu" placeholder="科目"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">成绩</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.chengji" v-model="ruleForm.chengji" placeholder="成绩"></input>
			</view>
																					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">工号</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.gonghao" v-model="ruleForm.gonghao" placeholder="工号"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">教师姓名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.19)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.jiaoshixingming" v-model="ruleForm.jiaoshixingming" placeholder="教师姓名"></input>
			</view>
																		
			<!-- 否 -->
 
			
			          				          				          				          				          				          				          				<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(51, 153, 153, 1)","margin":"0 0 10rpx 0","borderWidth":"2rpx","borderStyle":"solid","height":"308rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(51, 153, 153, 1)","textAlign":"left"}' class="title">点评</view>
				<textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"280rpx"}' v-model="ruleForm.dianping" placeholder="点评"></textarea>
			</view>
						          				          				          							
			          				          				          				          				          				          				          				          				          				          							
			<view class="btn">
				<button :style='{"boxShadow":"0 0 0px rgba(0,0,0,0) inset","backgroundColor":"rgba(51, 153, 153, 1)","borderColor":"rgba(51, 153, 153, 1)","borderRadius":"8rpx","color":"#fff","borderWidth":"1","width":"80%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

																																													
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
												bianhao: this.getUUID(),
																mingcheng: '',
																xuehao: '',
																xueshengxingming: '',
																kemu: '',
																chengji: '',
																dianping: '',
																gonghao: '',
																jiaoshixingming: '',
																userid: '',
												},
																												xuehaoOptions: [],
				xuehaoIndex: 0,
																																																																				// 登陆用户信息
				user: {},
                                ro:{
                                   bianhao : false,
                                   mingcheng : false,
                                   xuehao : false,
                                   xueshengxingming : false,
                                   kemu : false,
                                   chengji : false,
                                   dianping : false,
                                   gonghao : false,
                                   jiaoshixingming : false,
                                   userid : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
						// ss读取
																																																			this.ruleForm.gonghao = this.user.gonghao
												this.ruleForm.jiaoshixingming = this.user.jiaoshixingming
															
																								// 下2
			res = await this.$api.option(`xuesheng`,`xuehao`,{});
			this.xuehaoOptions = res.data;
																																																			
			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`chengjixinxi`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='bianhao'){
					this.ruleForm.bianhao = obj[o];
					this.ro.bianhao = true;
					continue;
					}
					if(o=='mingcheng'){
					this.ruleForm.mingcheng = obj[o];
					this.ro.mingcheng = true;
					continue;
					}
					if(o=='xuehao'){
					this.ruleForm.xuehao = obj[o];
					this.ro.xuehao = true;
					continue;
					}
					if(o=='xueshengxingming'){
					this.ruleForm.xueshengxingming = obj[o];
					this.ro.xueshengxingming = true;
					continue;
					}
					if(o=='kemu'){
					this.ruleForm.kemu = obj[o];
					this.ro.kemu = true;
					continue;
					}
					if(o=='chengji'){
					this.ruleForm.chengji = obj[o];
					this.ro.chengji = true;
					continue;
					}
					if(o=='dianping'){
					this.ruleForm.dianping = obj[o];
					this.ro.dianping = true;
					continue;
					}
					if(o=='gonghao'){
					this.ruleForm.gonghao = obj[o];
					this.ro.gonghao = true;
					continue;
					}
					if(o=='jiaoshixingming'){
					this.ruleForm.jiaoshixingming = obj[o];
					this.ro.jiaoshixingming = true;
					continue;
					}
					if(o=='userid'){
					this.ruleForm.userid = obj[o];
					this.ro.userid = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
																								// 下二随
			async xuehaoChange (e) {
				this.xuehaoIndex = e.target.value
				this.ruleForm.xuehao = this.xuehaoOptions[this.xuehaoIndex]
				let res = await this.$api.follow(`xuesheng`, `xuehao`,{
					columnValue: this.ruleForm.xuehao
				});
																																				if(res.data.xueshengxingming){
					this.ruleForm.xueshengxingming = res.data.xueshengxingming
				}
																																																											},
																																																
			// 多级联动参数
																																																																		
																																																															
																																																															
																																																															
																																																																																													
			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
																																																																																																																																																																																																																																																																																																																																																																																																																																				if((!this.ruleForm.mingcheng)){
					this.$utils.msg(`名称不能为空`);
					return
				}
																																																																																																								if((!this.ruleForm.kemu)){
					this.$utils.msg(`科目不能为空`);
					return
				}
																																								if((!this.ruleForm.chengji)){
					this.$utils.msg(`成绩不能为空`);
					return
				}
																																																																																																																																								if((!this.ruleForm.userid)){
					this.$utils.msg(`用户id不能为空`);
					return
				}
																																				if(this.ruleForm.id){
					await this.$api.update(`chengjixinxi`, this.ruleForm);
				}else{
					await this.$api.add(`chengjixinxi`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 88rpx;
	}
	
	.select .uni-input {
		line-height: 88rpx;
	}
	
	.input .right-input {
		line-height: 88rpx;
	}
</style>
