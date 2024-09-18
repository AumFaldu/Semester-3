function property(props) {
  let temp = "";
  for (let i = 0; i < props.count; i++) {
    temp += props.by;
  }
  return <>{temp}</>;
}
export default property;
