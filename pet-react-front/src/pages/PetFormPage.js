import React, { useState, useEffect } from 'react';
import { useNavigate, useParams } from 'react-router-dom';
import { petApi } from '../api/petApi';

const PetFormPage = () => {
  const { id } = useParams();
  const navigate = useNavigate();
  const [formData, setFormData] = useState({
    name: '', species: '', breed: '', gender: 'M', birth: '', imgFile: ''
  });

  useEffect(() => {
    if (id) {
      petApi.fetchById(id).then(res => setFormData(res.data.data));
    }
  }, [id]);

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      if (id) {
        await petApi.update({ ...formData, id: parseInt(id) });
      } else {
        await petApi.create(formData);
      }
      navigate('/');
    } catch (err) {
      alert('저장 실패');
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <h2>{id ? '정보 수정' : '신규 등록'}</h2>
      <input placeholder="이름" value={formData.name} onChange={e => setFormData({...formData, name: e.target.value})} required /><br/>
      <input placeholder="종" value={formData.species} onChange={e => setFormData({...formData, species: e.target.value})} /><br/>
      <input type="date" value={formData.birth} onChange={e => setFormData({...formData, birth: e.target.value})} /><br/>
      <button type="submit">저장</button>
    </form>
  );
};

export default PetFormPage;