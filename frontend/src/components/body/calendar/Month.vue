<template>
	<div class="month">
		<div class="header">
			<DayOfWeek/>
		</div>
		<Day class="day" v-for="day in days" :key="day" v-bind:day="day"/>
	</div>
</template>

<script>
	import Day from './Day'
	import DayOfWeek from "./DayOfWeek";

	export default {
		props: {
			daysCount: {
				type: Number,
				required: true
			}
		},
		name: "Month",
		data() {
			return {
				days: [],
			}
		},
		components: {
			Day,
			DayOfWeek
		},
		beforeMount() {
			this.days = Array.from(Array(this.daysCount).keys());
			this.days = this.days.map(key => key + 1);
		}
	}
</script>

<style scoped>
	.day {
		margin: 5px;
	}

	.month {
		display: inline-table;

		width: 330px;
		height: 335px;

		border: 1px solid black;
		border-radius: 5px;
		text-align: left;

		background: #FAF3EB;
	}

	.header {
		height: 50px;
		border-radius: 5px;
		background: #C9ECF3;
	}
</style>