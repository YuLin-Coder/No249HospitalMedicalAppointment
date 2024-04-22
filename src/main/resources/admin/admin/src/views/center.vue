<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
	  style="background: transparent;"
    >  
     <el-row>
      <el-col :span="12">
        <el-form-item   v-if="flag=='huiyuan'"  label="账号" prop="zhanghao">
          <el-input v-model="ruleForm.zhanghao" readonly              placeholder="账号" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='huiyuan'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming"               placeholder="姓名" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='huiyuan'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie"  placeholder="请选择性别">
            <el-option
                v-for="(item,index) in huiyuanxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='huiyuan'"  label="身份证" prop="shenfenzheng">
          <el-input v-model="ruleForm.shenfenzheng"               placeholder="身份证" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='huiyuan'"  label="手机号码" prop="shoujihaoma">
          <el-input v-model="ruleForm.shoujihaoma"               placeholder="手机号码" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="24">  
        <el-form-item v-if="flag=='huiyuan'" label="相片" prop="xiangpian">
          <file-upload
          tip="点击上传相片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.xiangpian?ruleForm.xiangpian:''"
          @change="huiyuanxiangpianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='yisheng'"  label="工号" prop="gonghao">
          <el-input v-model="ruleForm.gonghao" readonly              placeholder="工号" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='yisheng'"  label="医生姓名" prop="yishengxingming">
          <el-input v-model="ruleForm.yishengxingming"               placeholder="医生姓名" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='yisheng'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie"  placeholder="请选择性别">
            <el-option
                v-for="(item,index) in yishengxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='yisheng'"  label="身份证" prop="shenfenzheng">
          <el-input v-model="ruleForm.shenfenzheng"               placeholder="身份证" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='yisheng'"  label="手机号码" prop="shoujihaoma">
          <el-input v-model="ruleForm.shoujihaoma"               placeholder="手机号码" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="24">  
        <el-form-item v-if="flag=='yisheng'" label="相片" prop="xiangpian">
          <file-upload
          tip="点击上传相片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.xiangpian?ruleForm.xiangpian:''"
          @change="yishengxiangpianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='yisheng'" label="医院名称" prop="yiyuanmingcheng">
          <el-select  @change="yishengyiyuanmingchengChange"  v-model="ruleForm.yiyuanmingcheng" placeholder="请选择医院名称">
            <el-option
                v-for="(item,index) in yishengyiyuanmingchengOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='yisheng'"  label="医院地址" prop="yiyuandizhi">
          <el-input v-model="ruleForm.yiyuandizhi"               placeholder="医院地址" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='yisheng'" label="科室名称" prop="keshimingcheng">
          <el-select  @change="yishengkeshimingchengChange"  v-model="ruleForm.keshimingcheng" placeholder="请选择科室名称">
            <el-option
                v-for="(item,index) in yishengkeshimingchengOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='yisheng'"  label="科室地址" prop="keshidizhi">
          <el-input v-model="ruleForm.keshidizhi"               placeholder="科室地址" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
      huiyuanxingbieOptions: [],
      yishengxingbieOptions: [],
      yishengyiyuanmingchengOptions: [],
      yishengkeshimingchengOptions: [],
    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.huiyuanxingbieOptions = "男,女".split(',')
    this.yishengxingbieOptions = "男,女".split(',')
    this.$http({
      url: `option/yiyuanxinxi/yiyuanmingcheng`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.yishengyiyuanmingchengOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.$http({
      url: `option/keshixinxi/keshimingcheng`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.yishengkeshimingchengOptions = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
  },
  methods: {
    // 下二随
    yishengyiyuanmingchengChange () {
      this.$http({
        url: `follow/yiyuanxinxi/yiyuanmingcheng?columnValue=`+ this.ruleForm.yiyuanmingcheng,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          console.log('下2随')
              if(data.data.yiyuandizhi){
                this.ruleForm.yiyuandizhi = data.data.yiyuandizhi
              }
              if(data.data.keshidizhi){
                this.ruleForm.keshidizhi = data.data.keshidizhi
              }
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    // 下二随
    yishengkeshimingchengChange () {
      this.$http({
        url: `follow/keshixinxi/keshimingcheng?columnValue=`+ this.ruleForm.keshimingcheng,
        method: "get"
      }).then(({ data }) => {
        if (data && data.code === 0) {
          console.log('下2随')
              if(data.data.yiyuandizhi){
                this.ruleForm.yiyuandizhi = data.data.yiyuandizhi
              }
              if(data.data.keshidizhi){
                this.ruleForm.keshidizhi = data.data.keshidizhi
              }
        } else {
          this.$message.error(data.msg);
        }
      });
    },
    huiyuanxiangpianUploadChange(fileUrls) {
        this.ruleForm.xiangpian = fileUrls;
    },
    yishengxiangpianUploadChange(fileUrls) {
        this.ruleForm.xiangpian = fileUrls;
    },
    onUpdateHandler() {
      if((!this.ruleForm.zhanghao)&& 'huiyuan'==this.flag){
        this.$message.error('账号不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'huiyuan'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
      if((!this.ruleForm.xingming)&& 'huiyuan'==this.flag){
        this.$message.error('姓名不能为空');
        return
      }
      if( 'huiyuan' ==this.flag && this.ruleForm.shenfenzheng&&(!checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`身份证应输入身份证格式`);
        return
      }
      if( 'huiyuan' ==this.flag && this.ruleForm.shoujihaoma&&(!isMobile(this.ruleForm.shoujihaoma))){
        this.$message.error(`手机号码应输入手机格式`);
        return
      }
        if(this.ruleForm.xiangpian!=null) {
                this.ruleForm.xiangpian = this.ruleForm.xiangpian.replace(new RegExp(this.$base.url,"g"),"");
        }
      if((!this.ruleForm.gonghao)&& 'yisheng'==this.flag){
        this.$message.error('工号不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'yisheng'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
      if((!this.ruleForm.yishengxingming)&& 'yisheng'==this.flag){
        this.$message.error('医生姓名不能为空');
        return
      }
      if( 'yisheng' ==this.flag && this.ruleForm.shenfenzheng&&(!checkIdCard(this.ruleForm.shenfenzheng))){
        this.$message.error(`身份证应输入身份证格式`);
        return
      }
      if( 'yisheng' ==this.flag && this.ruleForm.shoujihaoma&&(!isMobile(this.ruleForm.shoujihaoma))){
        this.$message.error(`手机号码应输入手机格式`);
        return
      }
        if(this.ruleForm.xiangpian!=null) {
                this.ruleForm.xiangpian = this.ruleForm.xiangpian.replace(new RegExp(this.$base.url,"g"),"");
        }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
	this.$message.error(`用户名不能为空`);
        return	
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
