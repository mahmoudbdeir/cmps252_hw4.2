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

@Tag("1")
class Record_1993 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1993: FirstName is Liz")
	void FirstNameOfRecord1993() {
		assertEquals("Liz", customers.get(1992).getFirstName());
	}

	@Test
	@DisplayName("Record 1993: LastName is Dinunzio")
	void LastNameOfRecord1993() {
		assertEquals("Dinunzio", customers.get(1992).getLastName());
	}

	@Test
	@DisplayName("Record 1993: Company is Farmers Credit Union")
	void CompanyOfRecord1993() {
		assertEquals("Farmers Credit Union", customers.get(1992).getCompany());
	}

	@Test
	@DisplayName("Record 1993: Address is 1811 Stout Dr")
	void AddressOfRecord1993() {
		assertEquals("1811 Stout Dr", customers.get(1992).getAddress());
	}

	@Test
	@DisplayName("Record 1993: City is Warminster")
	void CityOfRecord1993() {
		assertEquals("Warminster", customers.get(1992).getCity());
	}

	@Test
	@DisplayName("Record 1993: County is Bucks")
	void CountyOfRecord1993() {
		assertEquals("Bucks", customers.get(1992).getCounty());
	}

	@Test
	@DisplayName("Record 1993: State is PA")
	void StateOfRecord1993() {
		assertEquals("PA", customers.get(1992).getState());
	}

	@Test
	@DisplayName("Record 1993: ZIP is 18974")
	void ZIPOfRecord1993() {
		assertEquals("18974", customers.get(1992).getZIP());
	}

	@Test
	@DisplayName("Record 1993: Phone is 215-675-4247")
	void PhoneOfRecord1993() {
		assertEquals("215-675-4247", customers.get(1992).getPhone());
	}

	@Test
	@DisplayName("Record 1993: Fax is 215-675-7332")
	void FaxOfRecord1993() {
		assertEquals("215-675-7332", customers.get(1992).getFax());
	}

	@Test
	@DisplayName("Record 1993: Email is liz@dinunzio.com")
	void EmailOfRecord1993() {
		assertEquals("liz@dinunzio.com", customers.get(1992).getEmail());
	}

	@Test
	@DisplayName("Record 1993: Web is http://www.lizdinunzio.com")
	void WebOfRecord1993() {
		assertEquals("http://www.lizdinunzio.com", customers.get(1992).getWeb());
	}
}
