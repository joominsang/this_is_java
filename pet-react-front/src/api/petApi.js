import axios from 'axios';

const api = axios.create({
  baseURL: 'http://localhost:8084/api',
  headers: { 'Content-Type': 'application/json' }
});

export const petApi = {
  create: (data) => api.post('/pet', data),
  fetchList: (params) => api.get('/pet/search', { params }),
  fetchById: (id) => api.get(`/pet/${id}`),
  update: (data) => api.patch('/pet', data),
  delete: (id) => api.delete(`/pet?id=${id}`),
};