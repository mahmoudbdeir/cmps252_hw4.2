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

@Tag("20")
class Record_403 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 403: FirstName is Nettie")
	void FirstNameOfRecord403() {
		assertEquals("Nettie", customers.get(402).getFirstName());
	}

	@Test
	@DisplayName("Record 403: LastName is Toczek")
	void LastNameOfRecord403() {
		assertEquals("Toczek", customers.get(402).getLastName());
	}

	@Test
	@DisplayName("Record 403: Company is Pozorski, Joseph M Jr")
	void CompanyOfRecord403() {
		assertEquals("Pozorski, Joseph M Jr", customers.get(402).getCompany());
	}

	@Test
	@DisplayName("Record 403: Address is 515 W 19th St")
	void AddressOfRecord403() {
		assertEquals("515 W 19th St", customers.get(402).getAddress());
	}

	@Test
	@DisplayName("Record 403: City is Idaho Falls")
	void CityOfRecord403() {
		assertEquals("Idaho Falls", customers.get(402).getCity());
	}

	@Test
	@DisplayName("Record 403: County is Bonneville")
	void CountyOfRecord403() {
		assertEquals("Bonneville", customers.get(402).getCounty());
	}

	@Test
	@DisplayName("Record 403: State is ID")
	void StateOfRecord403() {
		assertEquals("ID", customers.get(402).getState());
	}

	@Test
	@DisplayName("Record 403: ZIP is 83402")
	void ZIPOfRecord403() {
		assertEquals("83402", customers.get(402).getZIP());
	}

	@Test
	@DisplayName("Record 403: Phone is 208-529-1915")
	void PhoneOfRecord403() {
		assertEquals("208-529-1915", customers.get(402).getPhone());
	}

	@Test
	@DisplayName("Record 403: Fax is 208-529-6714")
	void FaxOfRecord403() {
		assertEquals("208-529-6714", customers.get(402).getFax());
	}

	@Test
	@DisplayName("Record 403: Email is nettie@toczek.com")
	void EmailOfRecord403() {
		assertEquals("nettie@toczek.com", customers.get(402).getEmail());
	}

	@Test
	@DisplayName("Record 403: Web is http://www.nettietoczek.com")
	void WebOfRecord403() {
		assertEquals("http://www.nettietoczek.com", customers.get(402).getWeb());
	}
}
