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

@Tag("40")
class Record_4300 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4300: FirstName is Christian")
	void FirstNameOfRecord4300() {
		assertEquals("Christian", customers.get(4299).getFirstName());
	}

	@Test
	@DisplayName("Record 4300: LastName is Topliffe")
	void LastNameOfRecord4300() {
		assertEquals("Topliffe", customers.get(4299).getLastName());
	}

	@Test
	@DisplayName("Record 4300: Company is Rockford Midland")
	void CompanyOfRecord4300() {
		assertEquals("Rockford Midland", customers.get(4299).getCompany());
	}

	@Test
	@DisplayName("Record 4300: Address is Box #-801")
	void AddressOfRecord4300() {
		assertEquals("Box #-801", customers.get(4299).getAddress());
	}

	@Test
	@DisplayName("Record 4300: City is Hanford")
	void CityOfRecord4300() {
		assertEquals("Hanford", customers.get(4299).getCity());
	}

	@Test
	@DisplayName("Record 4300: County is Kings")
	void CountyOfRecord4300() {
		assertEquals("Kings", customers.get(4299).getCounty());
	}

	@Test
	@DisplayName("Record 4300: State is CA")
	void StateOfRecord4300() {
		assertEquals("CA", customers.get(4299).getState());
	}

	@Test
	@DisplayName("Record 4300: ZIP is 93232")
	void ZIPOfRecord4300() {
		assertEquals("93232", customers.get(4299).getZIP());
	}

	@Test
	@DisplayName("Record 4300: Phone is 559-583-0856")
	void PhoneOfRecord4300() {
		assertEquals("559-583-0856", customers.get(4299).getPhone());
	}

	@Test
	@DisplayName("Record 4300: Fax is 559-583-6367")
	void FaxOfRecord4300() {
		assertEquals("559-583-6367", customers.get(4299).getFax());
	}

	@Test
	@DisplayName("Record 4300: Email is christian@topliffe.com")
	void EmailOfRecord4300() {
		assertEquals("christian@topliffe.com", customers.get(4299).getEmail());
	}

	@Test
	@DisplayName("Record 4300: Web is http://www.christiantopliffe.com")
	void WebOfRecord4300() {
		assertEquals("http://www.christiantopliffe.com", customers.get(4299).getWeb());
	}
}
