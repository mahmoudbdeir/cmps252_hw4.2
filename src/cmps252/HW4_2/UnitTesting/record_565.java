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

@Tag("28")
class Record_565 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 565: FirstName is Migdalia")
	void FirstNameOfRecord565() {
		assertEquals("Migdalia", customers.get(564).getFirstName());
	}

	@Test
	@DisplayName("Record 565: LastName is Schuppenhauer")
	void LastNameOfRecord565() {
		assertEquals("Schuppenhauer", customers.get(564).getLastName());
	}

	@Test
	@DisplayName("Record 565: Company is Champion Home Builders Co")
	void CompanyOfRecord565() {
		assertEquals("Champion Home Builders Co", customers.get(564).getCompany());
	}

	@Test
	@DisplayName("Record 565: Address is 3438 Gary Ln")
	void AddressOfRecord565() {
		assertEquals("3438 Gary Ln", customers.get(564).getAddress());
	}

	@Test
	@DisplayName("Record 565: City is Spring")
	void CityOfRecord565() {
		assertEquals("Spring", customers.get(564).getCity());
	}

	@Test
	@DisplayName("Record 565: County is Montgomery")
	void CountyOfRecord565() {
		assertEquals("Montgomery", customers.get(564).getCounty());
	}

	@Test
	@DisplayName("Record 565: State is TX")
	void StateOfRecord565() {
		assertEquals("TX", customers.get(564).getState());
	}

	@Test
	@DisplayName("Record 565: ZIP is 77380")
	void ZIPOfRecord565() {
		assertEquals("77380", customers.get(564).getZIP());
	}

	@Test
	@DisplayName("Record 565: Phone is 281-367-0021")
	void PhoneOfRecord565() {
		assertEquals("281-367-0021", customers.get(564).getPhone());
	}

	@Test
	@DisplayName("Record 565: Fax is 281-367-3413")
	void FaxOfRecord565() {
		assertEquals("281-367-3413", customers.get(564).getFax());
	}

	@Test
	@DisplayName("Record 565: Email is migdalia@schuppenhauer.com")
	void EmailOfRecord565() {
		assertEquals("migdalia@schuppenhauer.com", customers.get(564).getEmail());
	}

	@Test
	@DisplayName("Record 565: Web is http://www.migdaliaschuppenhauer.com")
	void WebOfRecord565() {
		assertEquals("http://www.migdaliaschuppenhauer.com", customers.get(564).getWeb());
	}
}
