const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootg15ia/",
            name: "springbootg15ia",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootg15ia/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "医院医疗预约服务管理信息系统"
        } 
    }
}
export default base
