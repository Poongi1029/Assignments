function Q22() {
    var arr = [1, 2, 3, 4, 5];
    var rotation = parseInt(prompt("Enter the Number oF rotations"));
    var i = 0;
    while (i <= rotation - 1) {
        leftRotatebyOne(arr);
        i++;
    }
    document.write("hello").innerHTML = "The Array after " + rotation + " rotations  is: " + arr;

}
