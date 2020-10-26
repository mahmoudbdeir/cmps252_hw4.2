package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("13")
class Record_155 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 155: FirstName is Latasha")
	void FirstNameOfRecord155() {
		assertEquals("Latasha", customers.get(154).getFirstName());
	}

	@Test
	@DisplayName("Record 155: LastName is Cackett")
	void LastNameOfRecord155() {
		assertEquals("Cackett", customers.get(154).getLastName());
	}

	@Test
	@DisplayName("Record 155: Company is Caldwell, G Wade Esq")
	void CompanyOfRecord155() {
		assertEquals("Caldwell, G Wade Esq", customers.get(154).getCompany());
	}

	@Test
	@DisplayName("Record 155: Address is 57 N Day St")
	void AddressOfRecord155() {
		assertEquals("57 N Day St", customers.get(154).getAddress());
	}

	@Test
	@DisplayName("Record 155: City is Orange")
	void CityOfRecord155() {
		assertEquals("Orange", customers.get(154).getCity());
	}

	@Test
	@DisplayName("Record 155: County is Essex")
	void CountyOfRecord155() {
		assertEquals("Essex", customers.get(154).getCounty());
	}

	@Test
	@DisplayName("Record 155: State is NJ")
	void StateOfRecord155() {
		assertEquals("NJ", customers.get(154).getState());
	}

	@Test
	@DisplayName("Record 155: ZIP is 7050")
	void ZIPOfRecord155() {
		assertEquals("7050", customers.get(154).getZIP());
	}

	@Test
	@DisplayName("Record 155: Phone is 973-675-6414")
	void PhoneOfRecord155() {
		assertEquals("973-675-6414", customers.get(154).getPhone());
	}

	@Test
	@DisplayName("Record 155: Fax is 973-675-6778")
	void FaxOfRecord155() {
		assertEquals("973-675-6778", customers.get(154).getFax());
	}

	@Test
	@DisplayName("Record 155: Email is latasha@cackett.com")
	void EmailOfRecord155() {
		assertEquals("latasha@cackett.com", customers.get(154).getEmail());
	}

	@Test
	@DisplayName("Record 155: Web is http://www.latashacackett.com")
	void WebOfRecord155() {
		assertEquals("http://www.latashacackett.com", customers.get(154).getWeb());
	}
}
