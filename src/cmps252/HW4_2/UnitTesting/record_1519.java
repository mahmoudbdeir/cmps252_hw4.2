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

@Tag("23")
class Record_1519 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1519: FirstName is Eula")
	void FirstNameOfRecord1519() {
		assertEquals("Eula", customers.get(1518).getFirstName());
	}

	@Test
	@DisplayName("Record 1519: LastName is Ranmar")
	void LastNameOfRecord1519() {
		assertEquals("Ranmar", customers.get(1518).getLastName());
	}

	@Test
	@DisplayName("Record 1519: Company is Fleming Mcloughlin Agency Inc")
	void CompanyOfRecord1519() {
		assertEquals("Fleming Mcloughlin Agency Inc", customers.get(1518).getCompany());
	}

	@Test
	@DisplayName("Record 1519: Address is 351 Salem Church Rd")
	void AddressOfRecord1519() {
		assertEquals("351 Salem Church Rd", customers.get(1518).getAddress());
	}

	@Test
	@DisplayName("Record 1519: City is Newark")
	void CityOfRecord1519() {
		assertEquals("Newark", customers.get(1518).getCity());
	}

	@Test
	@DisplayName("Record 1519: County is New Castle")
	void CountyOfRecord1519() {
		assertEquals("New Castle", customers.get(1518).getCounty());
	}

	@Test
	@DisplayName("Record 1519: State is DE")
	void StateOfRecord1519() {
		assertEquals("DE", customers.get(1518).getState());
	}

	@Test
	@DisplayName("Record 1519: ZIP is 19702")
	void ZIPOfRecord1519() {
		assertEquals("19702", customers.get(1518).getZIP());
	}

	@Test
	@DisplayName("Record 1519: Phone is 302-453-3250")
	void PhoneOfRecord1519() {
		assertEquals("302-453-3250", customers.get(1518).getPhone());
	}

	@Test
	@DisplayName("Record 1519: Fax is 302-453-2164")
	void FaxOfRecord1519() {
		assertEquals("302-453-2164", customers.get(1518).getFax());
	}

	@Test
	@DisplayName("Record 1519: Email is eula@ranmar.com")
	void EmailOfRecord1519() {
		assertEquals("eula@ranmar.com", customers.get(1518).getEmail());
	}

	@Test
	@DisplayName("Record 1519: Web is http://www.eularanmar.com")
	void WebOfRecord1519() {
		assertEquals("http://www.eularanmar.com", customers.get(1518).getWeb());
	}
}
