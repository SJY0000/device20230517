
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MachineManager from "./components/listers/MachineCards"
import MachineDetail from "./components/listers/MachineDetail"
import SizeManager from "./components/listers/SizeCards"
import SizeDetail from "./components/listers/SizeDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/machines',
                name: 'MachineManager',
                component: MachineManager
            },
            {
                path: '/machines/:id',
                name: 'MachineDetail',
                component: MachineDetail
            },
            {
                path: '/sizes',
                name: 'SizeManager',
                component: SizeManager
            },
            {
                path: '/sizes/:id',
                name: 'SizeDetail',
                component: SizeDetail
            },



    ]
})
