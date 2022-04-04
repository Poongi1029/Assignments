var array = [1,2,3,4,5,6,8];
document.write(array.filter(function(el, ind){
  return ind % 2 === 0;
}));