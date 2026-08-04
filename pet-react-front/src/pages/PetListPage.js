import React, { useEffect } from 'react';
import { useDispatch, useSelector } from 'react-redux';
import { getPets, removePet } from '../features/pet/petSlice';
import { Link } from 'react-router-dom';

const PetListPage = () => {
  const dispatch = useDispatch();
  const { list, loading } = useSelector((state) => state.pet);

  useEffect(() => {
    dispatch(getPets({ sort: 'id,desc', size: 5, page: 0 }));
  }, [dispatch]);

  const handleDelete = (id) => {
    if (window.confirm('정말 삭제하시겠습니까?')) {
      dispatch(removePet(id));
    }
  };

  return (
    <div>
      <h2>반려동물 목록</h2>
      <Link to="/add"><button>새로 등록</button></Link>
      <table border="1" style={{ width: '100%', marginTop: '10px', borderCollapse: 'collapse' }}>
        <thead>
          <tr>
            <th>ID</th><th>이름</th><th>종</th><th>생일</th><th>관리</th>
          </tr>
        </thead>
        <tbody>
          {list.map((pet) => (
            <tr key={pet.id}>
              <td>{pet.id}</td>
              <td><Link to={`/pet/${pet.id}`}>{pet.name}</Link></td>
              <td>{pet.species}</td>
              <td>{pet.birth}</td>
              <td>
                <Link to={`/edit/${pet.id}`}><button>수정</button></Link>
                <button onClick={() => handleDelete(pet.id)}>삭제</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default PetListPage;