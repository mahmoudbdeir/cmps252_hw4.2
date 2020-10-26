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

@Tag("22")
class Record_4169 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4169: FirstName is Liz")
	void FirstNameOfRecord4169() {
		assertEquals("Liz", customers.get(4168).getFirstName());
	}

	@Test
	@DisplayName("Record 4169: LastName is Fiumara")
	void LastNameOfRecord4169() {
		assertEquals("Fiumara", customers.get(4168).getLastName());
	}

	@Test
	@DisplayName("Record 4169: Company is Warren Ctr Ln Strlng Hts")
	void CompanyOfRecord4169() {
		assertEquals("Warren Ctr Ln Strlng Hts", customers.get(4168).getCompany());
	}

	@Test
	@DisplayName("Record 4169: Address is 2799 S Belt W")
	void AddressOfRecord4169() {
		assertEquals("2799 S Belt W", customers.get(4168).getAddress());
	}

	@Test
	@DisplayName("Record 4169: City is Belleville")
	void CityOfRecord4169() {
		assertEquals("Belleville", customers.get(4168).getCity());
	}

	@Test
	@DisplayName("Record 4169: County is Saint Clair")
	void CountyOfRecord4169() {
		assertEquals("Saint Clair", customers.get(4168).getCounty());
	}

	@Test
	@DisplayName("Record 4169: State is IL")
	void StateOfRecord4169() {
		assertEquals("IL", customers.get(4168).getState());
	}

	@Test
	@DisplayName("Record 4169: ZIP is 62223")
	void ZIPOfRecord4169() {
		assertEquals("62223", customers.get(4168).getZIP());
	}

	@Test
	@DisplayName("Record 4169: Phone is 618-277-7905")
	void PhoneOfRecord4169() {
		assertEquals("618-277-7905", customers.get(4168).getPhone());
	}

	@Test
	@DisplayName("Record 4169: Fax is 618-277-3375")
	void FaxOfRecord4169() {
		assertEquals("618-277-3375", customers.get(4168).getFax());
	}

	@Test
	@DisplayName("Record 4169: Email is liz@fiumara.com")
	void EmailOfRecord4169() {
		assertEquals("liz@fiumara.com", customers.get(4168).getEmail());
	}

	@Test
	@DisplayName("Record 4169: Web is http://www.lizfiumara.com")
	void WebOfRecord4169() {
		assertEquals("http://www.lizfiumara.com", customers.get(4168).getWeb());
	}
}
