package impl;

import java.util.List;

import Dao.DBUtil;
import Dao.WebDao;
import entiy.Web;

public class WebDaoImpl extends DBUtil implements WebDao {

	@Override
	public List getAll() {
		String sql = "select * from info";
		List<Web> list = super.getObjects(sql, Web.class);
		return list;
	}

	@Override
	public Web getOnly(int id) {
		String sql = "select * from info where id=?";
		Web web = super.getObject(sql, Web.class, id);
		return web;
	}

	@Override
	public int addInfo(Web web) {
		String sql = "insert into info values(default,?,?,?,?,?,?)";
		int num = super.executeUpdate(sql, web.getName(),web.getBirthday(),web.getSex(),web.getWork(),web.getAddress(),web.getPhone());
		return num;
	}

	@Override
	public int updateInfo(Web web) {
		String sql = "update info set name=?,birthday=?,sex=?,work=?,address=?,phone=? where id=?";
		int num = super.executeUpdate(sql, web.getName(),web.getBirthday(),web.getSex(),web.getWork(),web.getAddress(),web.getPhone(),web.getId());
		return num;
	}

	@Override
	public int deleInfo(int id) {
		String sql = "delete from info where id=?";
		int num = super.executeUpdate(sql, id);
		return num;
	}

}
