
public class Test {
	public static void main(String[] args) {
		TestUserDAO dao = new TestUserDAO();

		dao.updateUserNameByUserName("taro","saburo");
		dao.insert(4,"taro","012");
		dao.delete("jiro");
		dao.select("taro","123");
		dao.selectAll();
		dao.selectByName("taro");
		dao.selectByPassword("123");


	}

}
