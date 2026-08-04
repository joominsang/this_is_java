import React, { useEffect, useState } from 'react';
import { useParams, useNavigate, Link } from 'react-router-dom';
import { petApi } from '../api/petApi';

const PetDetailPage = () => {
  const { id } = useParams();
  const navigate = useNavigate();
  const [pet, setPet] = useState(null);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    const fetchPet = async () => {
      try {
        const response = await petApi.fetchById(id);
        if (response.data.code === 0) {
          setPet(response.data.data);
        }
      } catch (error) {
        alert('데이터를 불러오는 중 오류가 발생했습니다.');
        navigate('/');
      } finally {
        setLoading(false);
      }
    };
    fetchPet();
  }, [id, navigate]);

  if (loading) return <div>로딩 중...</div>;
  if (!pet) return <div>데이터가 없습니다.</div>;

  return (
    <div style={{ padding: '20px', border: '1px solid #ddd', borderRadius: '8px' }}>
      <h2>{pet.name}의 상세 정보</h2>
      <div style={{ marginBottom: '20px' }}>
        {pet.imgFile && <img src={pet.imgFile} alt={pet.name} style={{ width: '200px', borderRadius: '10px' }} />}
      </div>
      <p><strong>ID:</strong> {pet.id}</p>
      <p><strong>종:</strong> {pet.species}</p>
      <p><strong>품종:</strong> {pet.breed}</p>
      <p><strong>성별:</strong> {pet.gender === 'F' ? '암컷' : '수컷'}</p>
      <p><strong>생일:</strong> {pet.birth}</p>
      
      <div style={{ marginTop: '20px', display: 'flex', gap: '10px' }}>
        <button onClick={() => navigate('/')}>목록으로</button>
        <Link to={`/edit/${pet.id}`}><button style={{ backgroundColor: '#ffc107' }}>수정하기</button></Link>
      </div>
    </div>
  );
};

export default PetDetailPage;