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

@Tag("45")
class Record_3791 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3791: FirstName is Carter")
	void FirstNameOfRecord3791() {
		assertEquals("Carter", customers.get(3790).getFirstName());
	}

	@Test
	@DisplayName("Record 3791: LastName is Ranum")
	void LastNameOfRecord3791() {
		assertEquals("Ranum", customers.get(3790).getLastName());
	}

	@Test
	@DisplayName("Record 3791: Company is United Societies")
	void CompanyOfRecord3791() {
		assertEquals("United Societies", customers.get(3790).getCompany());
	}

	@Test
	@DisplayName("Record 3791: Address is 412 Governors Dr Sw")
	void AddressOfRecord3791() {
		assertEquals("412 Governors Dr Sw", customers.get(3790).getAddress());
	}

	@Test
	@DisplayName("Record 3791: City is Huntsville")
	void CityOfRecord3791() {
		assertEquals("Huntsville", customers.get(3790).getCity());
	}

	@Test
	@DisplayName("Record 3791: County is Madison")
	void CountyOfRecord3791() {
		assertEquals("Madison", customers.get(3790).getCounty());
	}

	@Test
	@DisplayName("Record 3791: State is AL")
	void StateOfRecord3791() {
		assertEquals("AL", customers.get(3790).getState());
	}

	@Test
	@DisplayName("Record 3791: ZIP is 35801")
	void ZIPOfRecord3791() {
		assertEquals("35801", customers.get(3790).getZIP());
	}

	@Test
	@DisplayName("Record 3791: Phone is 256-539-4679")
	void PhoneOfRecord3791() {
		assertEquals("256-539-4679", customers.get(3790).getPhone());
	}

	@Test
	@DisplayName("Record 3791: Fax is 256-539-4382")
	void FaxOfRecord3791() {
		assertEquals("256-539-4382", customers.get(3790).getFax());
	}

	@Test
	@DisplayName("Record 3791: Email is carter@ranum.com")
	void EmailOfRecord3791() {
		assertEquals("carter@ranum.com", customers.get(3790).getEmail());
	}

	@Test
	@DisplayName("Record 3791: Web is http://www.carterranum.com")
	void WebOfRecord3791() {
		assertEquals("http://www.carterranum.com", customers.get(3790).getWeb());
	}
}
