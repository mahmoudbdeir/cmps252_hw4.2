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

@Tag("47")
class Record_3987 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3987: FirstName is Elena")
	void FirstNameOfRecord3987() {
		assertEquals("Elena", customers.get(3986).getFirstName());
	}

	@Test
	@DisplayName("Record 3987: LastName is Hebner")
	void LastNameOfRecord3987() {
		assertEquals("Hebner", customers.get(3986).getLastName());
	}

	@Test
	@DisplayName("Record 3987: Company is Celebrity China Company")
	void CompanyOfRecord3987() {
		assertEquals("Celebrity China Company", customers.get(3986).getCompany());
	}

	@Test
	@DisplayName("Record 3987: Address is 210 Industrial Rd")
	void AddressOfRecord3987() {
		assertEquals("210 Industrial Rd", customers.get(3986).getAddress());
	}

	@Test
	@DisplayName("Record 3987: City is Sedalia")
	void CityOfRecord3987() {
		assertEquals("Sedalia", customers.get(3986).getCity());
	}

	@Test
	@DisplayName("Record 3987: County is Pettis")
	void CountyOfRecord3987() {
		assertEquals("Pettis", customers.get(3986).getCounty());
	}

	@Test
	@DisplayName("Record 3987: State is MO")
	void StateOfRecord3987() {
		assertEquals("MO", customers.get(3986).getState());
	}

	@Test
	@DisplayName("Record 3987: ZIP is 65301")
	void ZIPOfRecord3987() {
		assertEquals("65301", customers.get(3986).getZIP());
	}

	@Test
	@DisplayName("Record 3987: Phone is 660-826-2710")
	void PhoneOfRecord3987() {
		assertEquals("660-826-2710", customers.get(3986).getPhone());
	}

	@Test
	@DisplayName("Record 3987: Fax is 660-826-0023")
	void FaxOfRecord3987() {
		assertEquals("660-826-0023", customers.get(3986).getFax());
	}

	@Test
	@DisplayName("Record 3987: Email is elena@hebner.com")
	void EmailOfRecord3987() {
		assertEquals("elena@hebner.com", customers.get(3986).getEmail());
	}

	@Test
	@DisplayName("Record 3987: Web is http://www.elenahebner.com")
	void WebOfRecord3987() {
		assertEquals("http://www.elenahebner.com", customers.get(3986).getWeb());
	}
}
