<template>
	<div>
		<Month v-for="monthNumber in monthNumberArray" :key="monthNumber" v-bind:month-number="monthNumber"
			v-bind:year-number="year"/>
	</div>
</template>

<script>
import Month from "./Month";

export default {
	props: {
		year: {
			type: Number,
			required: true
		}
	},
	name: "Year",
	components: {
		Month
	},
	data() {
		return {
			monthNumberArray: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
		}
	}
}
</script>

<style scoped>
div {
	margin: 10px;
}
</style>