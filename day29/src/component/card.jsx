
function Card({name,age,img}) {
      return (
        <div className="max-w-xs mx-auto bg-white rounded-xl shadow-md overflow-hidden">
          <img
            className="w-full h-48 object-cover"
            src={img}
            alt="Profile"
          />
          <div className="p-6">
            <h2 className="text-2xl font-bold text-gray-800">{name}</h2>
            <p className="text-gray-600 text-sm">Age: {age}</p>
          </div>
        </div>
      );
    
}

export default Card;
