// Works; Imperative delayed async import
new Promise((r) => {
  import("./modules/module/index.mjs");
});

console.log("Loaded main.mjs");
