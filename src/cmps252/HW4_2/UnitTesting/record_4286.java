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

@Tag("0")
class Record_4286 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4286: FirstName is Leroy")
	void FirstNameOfRecord4286() {
		assertEquals("Leroy", customers.get(4285).getFirstName());
	}

	@Test
	@DisplayName("Record 4286: LastName is Imbach")
	void LastNameOfRecord4286() {
		assertEquals("Imbach", customers.get(4285).getLastName());
	}

	@Test
	@DisplayName("Record 4286: Company is Ajv Auto Mall")
	void CompanyOfRecord4286() {
		assertEquals("Ajv Auto Mall", customers.get(4285).getCompany());
	}

	@Test
	@DisplayName("Record 4286: Address is 8712 W Dodge Rd")
	void AddressOfRecord4286() {
		assertEquals("8712 W Dodge Rd", customers.get(4285).getAddress());
	}

	@Test
	@DisplayName("Record 4286: City is Omaha")
	void CityOfRecord4286() {
		assertEquals("Omaha", customers.get(4285).getCity());
	}

	@Test
	@DisplayName("Record 4286: County is Douglas")
	void CountyOfRecord4286() {
		assertEquals("Douglas", customers.get(4285).getCounty());
	}

	@Test
	@DisplayName("Record 4286: State is NE")
	void StateOfRecord4286() {
		assertEquals("NE", customers.get(4285).getState());
	}

	@Test
	@DisplayName("Record 4286: ZIP is 68114")
	void ZIPOfRecord4286() {
		assertEquals("68114", customers.get(4285).getZIP());
	}

	@Test
	@DisplayName("Record 4286: Phone is 402-392-4304")
	void PhoneOfRecord4286() {
		assertEquals("402-392-4304", customers.get(4285).getPhone());
	}

	@Test
	@DisplayName("Record 4286: Fax is 402-392-2105")
	void FaxOfRecord4286() {
		assertEquals("402-392-2105", customers.get(4285).getFax());
	}

	@Test
	@DisplayName("Record 4286: Email is leroy@imbach.com")
	void EmailOfRecord4286() {
		assertEquals("leroy@imbach.com", customers.get(4285).getEmail());
	}

	@Test
	@DisplayName("Record 4286: Web is http://www.leroyimbach.com")
	void WebOfRecord4286() {
		assertEquals("http://www.leroyimbach.com", customers.get(4285).getWeb());
	}
}
