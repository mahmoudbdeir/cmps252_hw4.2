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

@Tag("7")
class Record_1182 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1182: FirstName is Santo")
	void FirstNameOfRecord1182() {
		assertEquals("Santo", customers.get(1181).getFirstName());
	}

	@Test
	@DisplayName("Record 1182: LastName is Poltrock")
	void LastNameOfRecord1182() {
		assertEquals("Poltrock", customers.get(1181).getLastName());
	}

	@Test
	@DisplayName("Record 1182: Company is Mere Cie Imports")
	void CompanyOfRecord1182() {
		assertEquals("Mere Cie Imports", customers.get(1181).getCompany());
	}

	@Test
	@DisplayName("Record 1182: Address is 311 Stephens St")
	void AddressOfRecord1182() {
		assertEquals("311 Stephens St", customers.get(1181).getAddress());
	}

	@Test
	@DisplayName("Record 1182: City is Belleville")
	void CityOfRecord1182() {
		assertEquals("Belleville", customers.get(1181).getCity());
	}

	@Test
	@DisplayName("Record 1182: County is Essex")
	void CountyOfRecord1182() {
		assertEquals("Essex", customers.get(1181).getCounty());
	}

	@Test
	@DisplayName("Record 1182: State is NJ")
	void StateOfRecord1182() {
		assertEquals("NJ", customers.get(1181).getState());
	}

	@Test
	@DisplayName("Record 1182: ZIP is 7109")
	void ZIPOfRecord1182() {
		assertEquals("7109", customers.get(1181).getZIP());
	}

	@Test
	@DisplayName("Record 1182: Phone is 973-759-5954")
	void PhoneOfRecord1182() {
		assertEquals("973-759-5954", customers.get(1181).getPhone());
	}

	@Test
	@DisplayName("Record 1182: Fax is 973-759-7916")
	void FaxOfRecord1182() {
		assertEquals("973-759-7916", customers.get(1181).getFax());
	}

	@Test
	@DisplayName("Record 1182: Email is santo@poltrock.com")
	void EmailOfRecord1182() {
		assertEquals("santo@poltrock.com", customers.get(1181).getEmail());
	}

	@Test
	@DisplayName("Record 1182: Web is http://www.santopoltrock.com")
	void WebOfRecord1182() {
		assertEquals("http://www.santopoltrock.com", customers.get(1181).getWeb());
	}
}
