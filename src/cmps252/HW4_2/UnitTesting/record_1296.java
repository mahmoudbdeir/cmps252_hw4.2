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

@Tag("33")
class Record_1296 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1296: FirstName is Earnest")
	void FirstNameOfRecord1296() {
		assertEquals("Earnest", customers.get(1295).getFirstName());
	}

	@Test
	@DisplayName("Record 1296: LastName is Roenigk")
	void LastNameOfRecord1296() {
		assertEquals("Roenigk", customers.get(1295).getLastName());
	}

	@Test
	@DisplayName("Record 1296: Company is Yng Men Chrstn Assn")
	void CompanyOfRecord1296() {
		assertEquals("Yng Men Chrstn Assn", customers.get(1295).getCompany());
	}

	@Test
	@DisplayName("Record 1296: Address is 1229 Forest Ave")
	void AddressOfRecord1296() {
		assertEquals("1229 Forest Ave", customers.get(1295).getAddress());
	}

	@Test
	@DisplayName("Record 1296: City is Staten Island")
	void CityOfRecord1296() {
		assertEquals("Staten Island", customers.get(1295).getCity());
	}

	@Test
	@DisplayName("Record 1296: County is Richmond")
	void CountyOfRecord1296() {
		assertEquals("Richmond", customers.get(1295).getCounty());
	}

	@Test
	@DisplayName("Record 1296: State is NY")
	void StateOfRecord1296() {
		assertEquals("NY", customers.get(1295).getState());
	}

	@Test
	@DisplayName("Record 1296: ZIP is 10310")
	void ZIPOfRecord1296() {
		assertEquals("10310", customers.get(1295).getZIP());
	}

	@Test
	@DisplayName("Record 1296: Phone is 718-273-7338")
	void PhoneOfRecord1296() {
		assertEquals("718-273-7338", customers.get(1295).getPhone());
	}

	@Test
	@DisplayName("Record 1296: Fax is 718-273-5869")
	void FaxOfRecord1296() {
		assertEquals("718-273-5869", customers.get(1295).getFax());
	}

	@Test
	@DisplayName("Record 1296: Email is earnest@roenigk.com")
	void EmailOfRecord1296() {
		assertEquals("earnest@roenigk.com", customers.get(1295).getEmail());
	}

	@Test
	@DisplayName("Record 1296: Web is http://www.earnestroenigk.com")
	void WebOfRecord1296() {
		assertEquals("http://www.earnestroenigk.com", customers.get(1295).getWeb());
	}
}
