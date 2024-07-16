const path = require("path");
console.log(path.basename('C:\\Users\\student\\Desktop\\NodeProject\\Lab-17-2.js'));
console.log(path.dirname('/foo/bar/baz/asdf/quux'));
console.log(path.normalize('C:\\Users\\student\\Desktop\\NodeProject\\Lab-17-2.js'));
console.log(path.join('/foo','bar','abc'));
console.log(path.resolve('/foo/abc','/foo/abc/xyz'));
console.log(path.relative('/foo/bar','/foo/abc'));
console.log(path.extname('Lab-17-2.js'));
