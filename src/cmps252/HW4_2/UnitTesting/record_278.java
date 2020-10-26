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

@Tag("27")
class Record_278 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 278: FirstName is Dianna")
	void FirstNameOfRecord278() {
		assertEquals("Dianna", customers.get(277).getFirstName());
	}

	@Test
	@DisplayName("Record 278: LastName is Istorico")
	void LastNameOfRecord278() {
		assertEquals("Istorico", customers.get(277).getLastName());
	}

	@Test
	@DisplayName("Record 278: Company is Rubin Eagan & Feder")
	void CompanyOfRecord278() {
		assertEquals("Rubin Eagan & Feder", customers.get(277).getCompany());
	}

	@Test
	@DisplayName("Record 278: Address is 9 Parade St")
	void AddressOfRecord278() {
		assertEquals("9 Parade St", customers.get(277).getAddress());
	}

	@Test
	@DisplayName("Record 278: City is Providence")
	void CityOfRecord278() {
		assertEquals("Providence", customers.get(277).getCity());
	}

	@Test
	@DisplayName("Record 278: County is Providence")
	void CountyOfRecord278() {
		assertEquals("Providence", customers.get(277).getCounty());
	}

	@Test
	@DisplayName("Record 278: State is RI")
	void StateOfRecord278() {
		assertEquals("RI", customers.get(277).getState());
	}

	@Test
	@DisplayName("Record 278: ZIP is 2909")
	void ZIPOfRecord278() {
		assertEquals("2909", customers.get(277).getZIP());
	}

	@Test
	@DisplayName("Record 278: Phone is 401-421-6794")
	void PhoneOfRecord278() {
		assertEquals("401-421-6794", customers.get(277).getPhone());
	}

	@Test
	@DisplayName("Record 278: Fax is 401-421-0762")
	void FaxOfRecord278() {
		assertEquals("401-421-0762", customers.get(277).getFax());
	}

	@Test
	@DisplayName("Record 278: Email is dianna@istorico.com")
	void EmailOfRecord278() {
		assertEquals("dianna@istorico.com", customers.get(277).getEmail());
	}

	@Test
	@DisplayName("Record 278: Web is http://www.diannaistorico.com")
	void WebOfRecord278() {
		assertEquals("http://www.diannaistorico.com", customers.get(277).getWeb());
	}
}
