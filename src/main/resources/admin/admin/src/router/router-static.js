import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import jiankangdangan from '@/views/modules/jiankangdangan/list'
    import guahaoyuyue from '@/views/modules/guahaoyuyue/list'
    import yaopinxinxi from '@/views/modules/yaopinxinxi/list'
    import storeup from '@/views/modules/storeup/list'
    import jiancejieguo from '@/views/modules/jiancejieguo/list'
    import zhenduanxinxi from '@/views/modules/zhenduanxinxi/list'
    import chufangxinxi from '@/views/modules/chufangxinxi/list'
    import hesuanjiance from '@/views/modules/hesuanjiance/list'
    import zhuyuanxinxi from '@/views/modules/zhuyuanxinxi/list'
    import yisheng from '@/views/modules/yisheng/list'
    import news from '@/views/modules/news/list'
    import yiyuanxinxi from '@/views/modules/yiyuanxinxi/list'
    import tijianxinxi from '@/views/modules/tijianxinxi/list'
    import jikongtongzhi from '@/views/modules/jikongtongzhi/list'
    import shiyongxuzhi from '@/views/modules/shiyongxuzhi/list'
    import huiyuan from '@/views/modules/huiyuan/list'
    import tijianbaogao from '@/views/modules/tijianbaogao/list'
    import keshixinxi from '@/views/modules/keshixinxi/list'
    import zixunhuifu from '@/views/modules/zixunhuifu/list'
    import zuozhenxinxi from '@/views/modules/zuozhenxinxi/list'
    import hesuanyuyue from '@/views/modules/hesuanyuyue/list'
    import zaixianzixun from '@/views/modules/zaixianzixun/list'
    import tiaoxingmaji from '@/views/modules/tiaoxingmaji/list'
    import config from '@/views/modules/config/list'
    import jiankangzixun from '@/views/modules/jiankangzixun/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/jiankangdangan',
        name: '健康档案',
        component: jiankangdangan
      }
      ,{
	path: '/guahaoyuyue',
        name: '挂号预约',
        component: guahaoyuyue
      }
      ,{
	path: '/yaopinxinxi',
        name: '药品信息',
        component: yaopinxinxi
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/jiancejieguo',
        name: '检测结果',
        component: jiancejieguo
      }
      ,{
	path: '/zhenduanxinxi',
        name: '诊断信息',
        component: zhenduanxinxi
      }
      ,{
	path: '/chufangxinxi',
        name: '处方信息',
        component: chufangxinxi
      }
      ,{
	path: '/hesuanjiance',
        name: '核酸检测',
        component: hesuanjiance
      }
      ,{
	path: '/zhuyuanxinxi',
        name: '住院信息',
        component: zhuyuanxinxi
      }
      ,{
	path: '/yisheng',
        name: '医生',
        component: yisheng
      }
      ,{
	path: '/news',
        name: '就诊引导',
        component: news
      }
      ,{
	path: '/yiyuanxinxi',
        name: '医院信息',
        component: yiyuanxinxi
      }
      ,{
	path: '/tijianxinxi',
        name: '体检信息',
        component: tijianxinxi
      }
      ,{
	path: '/jikongtongzhi',
        name: '疾控通知',
        component: jikongtongzhi
      }
      ,{
	path: '/shiyongxuzhi',
        name: '使用须知',
        component: shiyongxuzhi
      }
      ,{
	path: '/huiyuan',
        name: '会员',
        component: huiyuan
      }
      ,{
	path: '/tijianbaogao',
        name: '体检报告',
        component: tijianbaogao
      }
      ,{
	path: '/keshixinxi',
        name: '科室信息',
        component: keshixinxi
      }
      ,{
	path: '/zixunhuifu',
        name: '咨询回复',
        component: zixunhuifu
      }
      ,{
	path: '/zuozhenxinxi',
        name: '坐诊信息',
        component: zuozhenxinxi
      }
      ,{
	path: '/hesuanyuyue',
        name: '核酸预约',
        component: hesuanyuyue
      }
      ,{
	path: '/zaixianzixun',
        name: '在线咨询',
        component: zaixianzixun
      }
      ,{
	path: '/tiaoxingmaji',
        name: '条形码机',
        component: tiaoxingmaji
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/jiankangzixun',
        name: '健康资讯',
        component: jiankangzixun
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
