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

@Tag("48")
class Record_1988 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1988: FirstName is Toby")
	void FirstNameOfRecord1988() {
		assertEquals("Toby", customers.get(1987).getFirstName());
	}

	@Test
	@DisplayName("Record 1988: LastName is Moraitis")
	void LastNameOfRecord1988() {
		assertEquals("Moraitis", customers.get(1987).getLastName());
	}

	@Test
	@DisplayName("Record 1988: Company is Stefanelli, James L Md")
	void CompanyOfRecord1988() {
		assertEquals("Stefanelli, James L Md", customers.get(1987).getCompany());
	}

	@Test
	@DisplayName("Record 1988: Address is 105 Dempsey Rd")
	void AddressOfRecord1988() {
		assertEquals("105 Dempsey Rd", customers.get(1987).getAddress());
	}

	@Test
	@DisplayName("Record 1988: City is Madison")
	void CityOfRecord1988() {
		assertEquals("Madison", customers.get(1987).getCity());
	}

	@Test
	@DisplayName("Record 1988: County is Dane")
	void CountyOfRecord1988() {
		assertEquals("Dane", customers.get(1987).getCounty());
	}

	@Test
	@DisplayName("Record 1988: State is WI")
	void StateOfRecord1988() {
		assertEquals("WI", customers.get(1987).getState());
	}

	@Test
	@DisplayName("Record 1988: ZIP is 53714")
	void ZIPOfRecord1988() {
		assertEquals("53714", customers.get(1987).getZIP());
	}

	@Test
	@DisplayName("Record 1988: Phone is 608-249-7240")
	void PhoneOfRecord1988() {
		assertEquals("608-249-7240", customers.get(1987).getPhone());
	}

	@Test
	@DisplayName("Record 1988: Fax is 608-249-0105")
	void FaxOfRecord1988() {
		assertEquals("608-249-0105", customers.get(1987).getFax());
	}

	@Test
	@DisplayName("Record 1988: Email is toby@moraitis.com")
	void EmailOfRecord1988() {
		assertEquals("toby@moraitis.com", customers.get(1987).getEmail());
	}

	@Test
	@DisplayName("Record 1988: Web is http://www.tobymoraitis.com")
	void WebOfRecord1988() {
		assertEquals("http://www.tobymoraitis.com", customers.get(1987).getWeb());
	}
}
