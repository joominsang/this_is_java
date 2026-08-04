import React, { useState, useEffect } from 'react';

const PetForm = ({ initialData, onSubmit, buttonText }) => {
  const [pet, setPet] = useState({
    name: '',
    species: '',
    breed: '',
    gender: 'M',
    birth: '',
    imgFile: ''
  });

  useEffect(() => {
    if (initialData) {
      setPet(initialData);
    }
  }, [initialData]);

  const handleChange = (e) => {
    const { name, value } = e.target;
    setPet(prev => ({ ...prev, [name]: value }));
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    onSubmit(pet);
  };

  return (
    <form onSubmit={handleSubmit} style={{ display: 'flex', flexDirection: 'column', gap: '10px', maxWidth: '400px' }}>
      <label>이름: <input name="name" value={pet.name} onChange={handleChange} required /></label>
      <label>종(Species): <input name="species" value={pet.species} onChange={handleChange} required /></label>
      <label>품종(Breed): <input name="breed" value={pet.breed} onChange={handleChange} /></label>
      <label>성별: 
        <select name="gender" value={pet.gender} onChange={handleChange}>
          <option value="M">수컷(M)</option>
          <option value="F">암컷(F)</option>
        </select>
      </label>
      <label>생일: <input type="date" name="birth" value={pet.birth} onChange={handleChange} /></label>
      <label>이미지 경로: <input name="imgFile" value={pet.imgFile} onChange={handleChange} /></label>
      
      <button type="submit" style={{ padding: '10px', backgroundColor: '#007bff', color: 'white', border: 'none', borderRadius: '4px', cursor: 'pointer' }}>
        {buttonText}
      </button>
    </form>
  );
};

export default PetForm;