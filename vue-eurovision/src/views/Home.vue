<template>
  <div class="home container">
    <div class="row">
      <CountDown name="1ª Semifinal" :date="new Date('May 12, 2020 21:00:00')" link="1" />
      <CountDown name="2ª Semifinal" :date="new Date('May 14, 2020 21:00:00')" link="2" />
      <CountDown name="Final" :date="new Date('May 16, 2020 21:00:00')" link="3" />
    </div>
  </div>
</template>

<script>
// @ is an alias to /src
import CountDown from "@/components/CountDown.vue";

export default {
  name: "home",
  components: {
    CountDown
  }
};
</script>
