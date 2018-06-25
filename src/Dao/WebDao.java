package Dao;

import java.util.List;

import entiy.Web;

public interface WebDao {
	public int deleInfo(int id);
	public int addInfo(Web web);
	public int updateInfo(Web web);
	public List getAll();
	public Web getOnly(int id);

}
