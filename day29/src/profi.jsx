import Card from "./component/card";

function Profi() {
  let user = [
    {
      name: "kumar",
      age: 24,
      img: "https://via.placeholder.com/150",
    },
    {
      name: "swamy",
      age: 24,
      img: "https://via.placeholder.com/150",
    },
    {
      name: "abc",
      age: 24,
      img: "https://via.placeholder.com/150",
    },
    {
      name: "manoj",
      age: 24,
      img: "https://via.placeholder.com/150",
    },
  ];

  return (
    <div className="w-screen h-screen flex items-center justify-center bg-slate-800">
      <div className="grid grid-cols-4 gap-6">
        {user.map((person, index) => (
          <Card key={index} name={person.name} age={person.age} img={person.img} />
        ))}
      </div>
    </div>
  );
}

export default Profi;
