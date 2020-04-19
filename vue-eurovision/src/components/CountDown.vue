<template>
  <div class="col-sm-12 col-md-12 col lg-12">
    <div class="alert alert-primary" role="alert">
      <h1 class="display-4 alert-heading">
        {{name}}
        {{date.getDate() + ' / ' + (date.getMonth() + 1)}}
      </h1>
      <h1 class="alert-heading">{{days}}d {{hours}}h {{minutes}}m {{seconds}}s</h1>
      <hr>
      <router-link :to="'/listCountryVote#' + link">
        <a
          class="btn btn-light btn-lg btn-block"
          v-bind:class="{disabled: this.distance > 0}"
          role="button"
        >Vota!</a>
      </router-link>
    </div>

    <!-- <div class="alert alert-primary" role="alert">
      <p>
        Cuenta atrás para la
        <b>{{name}}</b>
        {{date.getDate() + ' / ' + (date.getMonth() + 1)}}
      </p>
      <p>{{days}}d {{hours}}h {{minutes}}m {{seconds}}s</p>
      <router-link :to="'/listCountryVote#' + link">
        <a class="btn btn-light" v-bind:class="{disabled: this.distance > 0}" role="button">Vota!</a>
      </router-link>
    </div>-->
  </div>
</template>

<script>
export default {
  name: "CountDown",
  props: {
    name: String,
    date: Date,
    link: String
  },
  data() {
    return {
      days: 0,
      hours: 0,
      minutes: 0,
      seconds: 0,
      distance: 0,
      interval: null
    };
  },
  mounted() {
    this.interval = setInterval(() => {
      // Get todays date and time
      let now = new Date().getTime();
      // Find the distance between now and the count down date
      this.distance = this.date.getTime() - now;

      if (this.distance < 0) {
        clearInterval(this.interval);
      } else {
        // Time calculations for days, hours, minutes and seconds
        this.days = Math.floor(this.distance / (1000 * 60 * 60 * 24));
        this.hours = Math.floor(
          (this.distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60)
        );
        this.minutes = Math.floor(
          (this.distance % (1000 * 60 * 60)) / (1000 * 60)
        );
        this.seconds = Math.floor((this.distance % (1000 * 60)) / 1000);
      }
    }, 1000);
  },
  destroyed() {
    clearInterval(this.interval);
  }
};
</script>

<style scoped>
.center {
  margin-left: 20%;
}

h1 {
  color: #2b4078;
}

p {
  color: #293e77;
}
</style>