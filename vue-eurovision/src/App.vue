<template>
  <div id="app">
    <Header />
    <imgHeader />
    <div class="margin">
      <router-view />
    </div>
    <Footer />
  </div>
</template>

<script>
// @ is an alias to /src
import Header from "@/components/Header.vue";
import Footer from "@/components/Footer.vue";
import imgHeader from "@/components/imgHeader.vue";

export default {
  name: "main",
  components: {
    Header,
    imgHeader,
    Footer,
  },
};
</script>

<style>
@import "./assets/style.css";
</style>
