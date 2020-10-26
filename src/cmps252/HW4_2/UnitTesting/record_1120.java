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
class Record_1120 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1120: FirstName is Debby")
	void FirstNameOfRecord1120() {
		assertEquals("Debby", customers.get(1119).getFirstName());
	}

	@Test
	@DisplayName("Record 1120: LastName is Belshaw")
	void LastNameOfRecord1120() {
		assertEquals("Belshaw", customers.get(1119).getLastName());
	}

	@Test
	@DisplayName("Record 1120: Company is Stuber Jensen Equipment Inc")
	void CompanyOfRecord1120() {
		assertEquals("Stuber Jensen Equipment Inc", customers.get(1119).getCompany());
	}

	@Test
	@DisplayName("Record 1120: Address is 929 N Church St")
	void AddressOfRecord1120() {
		assertEquals("929 N Church St", customers.get(1119).getAddress());
	}

	@Test
	@DisplayName("Record 1120: City is Wilmington")
	void CityOfRecord1120() {
		assertEquals("Wilmington", customers.get(1119).getCity());
	}

	@Test
	@DisplayName("Record 1120: County is New Castle")
	void CountyOfRecord1120() {
		assertEquals("New Castle", customers.get(1119).getCounty());
	}

	@Test
	@DisplayName("Record 1120: State is DE")
	void StateOfRecord1120() {
		assertEquals("DE", customers.get(1119).getState());
	}

	@Test
	@DisplayName("Record 1120: ZIP is 19801")
	void ZIPOfRecord1120() {
		assertEquals("19801", customers.get(1119).getZIP());
	}

	@Test
	@DisplayName("Record 1120: Phone is 302-652-1398")
	void PhoneOfRecord1120() {
		assertEquals("302-652-1398", customers.get(1119).getPhone());
	}

	@Test
	@DisplayName("Record 1120: Fax is 302-652-6407")
	void FaxOfRecord1120() {
		assertEquals("302-652-6407", customers.get(1119).getFax());
	}

	@Test
	@DisplayName("Record 1120: Email is debby@belshaw.com")
	void EmailOfRecord1120() {
		assertEquals("debby@belshaw.com", customers.get(1119).getEmail());
	}

	@Test
	@DisplayName("Record 1120: Web is http://www.debbybelshaw.com")
	void WebOfRecord1120() {
		assertEquals("http://www.debbybelshaw.com", customers.get(1119).getWeb());
	}
}
