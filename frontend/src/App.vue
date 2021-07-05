<template>
	<div>
		<Header/>
		<Calendar/>
		<Footer/>
	</div>
</template>

<script>
	import Header from './components/common/Header'
	import Calendar from './components/body/calendar/Calendar'
	import Footer from './components/common/Footer'

	export default {
		name: 'App',
		components: {
			Header,
			Calendar,
			Footer
		}
	}
</script>

<style>
	#app {
		font-family: Avenir, Helvetica, Arial, sans-serif;
		-webkit-font-smoothing: antialiased;
		-moz-osx-font-smoothing: grayscale;
		text-align: center;
		color: #2c3e50;
		margin-top: 60px;

		overflow-x: hidden;
	}
</style>
