import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'
import Participants from './views/Participants.vue'
import Votes from './views/Votes.vue'
import VoteParticipant from './views/VoteParticipant.vue'
import About from './views/About.vue'
import Rotterdam from './views/Rotterdam.vue'

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
      component: About
    },
    {
      path: '/rotterdam',
      name: 'rotterdam',
      component: Rotterdam
    }
  ]
})