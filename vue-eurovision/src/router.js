import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'
import Participants from './views/Participants.vue'
import Votes from './views/Votes.vue'
import VoteParticipant from './views/VoteParticipant.vue'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [{
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/singers',
      name: 'singers',
      component: Participants
    },
    {
      path: '/listCountryVote',
      name: 'listCountryVote',
      component: VoteParticipant
    },
    {
      path: '/votes',
      name: 'votes',
      component: Votes
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: () =>
        import( /* webpackChunkName: "about" */ './views/About.vue')
    }
  ]
})