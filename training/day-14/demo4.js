console.log(Intl.supportedValuesOf('timeZone'));
let currenttime = new Intl.DateTimeFormat("en-US", { timeZone: "Asia/kolkata", timeStyle: "medium", dateStyle: "long" }).format(new Date());

console.log(currenttime);