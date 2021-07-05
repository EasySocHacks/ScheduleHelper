<template>
	<div>
		<YearPage v-bind:year="2021"/>
	</div>
</template>

<script>
	import YearPage from "./pages/YearPage";

	export default {
		components: {
			YearPage
		}
	}
</script>