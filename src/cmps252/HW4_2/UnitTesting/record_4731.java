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

@Tag("26")
class Record_4731 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4731: FirstName is Ezequiel")
	void FirstNameOfRecord4731() {
		assertEquals("Ezequiel", customers.get(4730).getFirstName());
	}

	@Test
	@DisplayName("Record 4731: LastName is Reguyra")
	void LastNameOfRecord4731() {
		assertEquals("Reguyra", customers.get(4730).getLastName());
	}

	@Test
	@DisplayName("Record 4731: Company is Osmon Chism & Ethredge Pa")
	void CompanyOfRecord4731() {
		assertEquals("Osmon Chism & Ethredge Pa", customers.get(4730).getCompany());
	}

	@Test
	@DisplayName("Record 4731: Address is 316 Tiger Ln")
	void AddressOfRecord4731() {
		assertEquals("316 Tiger Ln", customers.get(4730).getAddress());
	}

	@Test
	@DisplayName("Record 4731: City is Columbia")
	void CityOfRecord4731() {
		assertEquals("Columbia", customers.get(4730).getCity());
	}

	@Test
	@DisplayName("Record 4731: County is Boone")
	void CountyOfRecord4731() {
		assertEquals("Boone", customers.get(4730).getCounty());
	}

	@Test
	@DisplayName("Record 4731: State is MO")
	void StateOfRecord4731() {
		assertEquals("MO", customers.get(4730).getState());
	}

	@Test
	@DisplayName("Record 4731: ZIP is 65203")
	void ZIPOfRecord4731() {
		assertEquals("65203", customers.get(4730).getZIP());
	}

	@Test
	@DisplayName("Record 4731: Phone is 573-446-0973")
	void PhoneOfRecord4731() {
		assertEquals("573-446-0973", customers.get(4730).getPhone());
	}

	@Test
	@DisplayName("Record 4731: Fax is 573-446-4075")
	void FaxOfRecord4731() {
		assertEquals("573-446-4075", customers.get(4730).getFax());
	}

	@Test
	@DisplayName("Record 4731: Email is ezequiel@reguyra.com")
	void EmailOfRecord4731() {
		assertEquals("ezequiel@reguyra.com", customers.get(4730).getEmail());
	}

	@Test
	@DisplayName("Record 4731: Web is http://www.ezequielreguyra.com")
	void WebOfRecord4731() {
		assertEquals("http://www.ezequielreguyra.com", customers.get(4730).getWeb());
	}
}
