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

@Tag("16")
class Record_3584 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3584: FirstName is Evelyn")
	void FirstNameOfRecord3584() {
		assertEquals("Evelyn", customers.get(3583).getFirstName());
	}

	@Test
	@DisplayName("Record 3584: LastName is Stefanelli")
	void LastNameOfRecord3584() {
		assertEquals("Stefanelli", customers.get(3583).getLastName());
	}

	@Test
	@DisplayName("Record 3584: Company is Beloit City")
	void CompanyOfRecord3584() {
		assertEquals("Beloit City", customers.get(3583).getCompany());
	}

	@Test
	@DisplayName("Record 3584: Address is 2626 Abbott Rd")
	void AddressOfRecord3584() {
		assertEquals("2626 Abbott Rd", customers.get(3583).getAddress());
	}

	@Test
	@DisplayName("Record 3584: City is Anchorage")
	void CityOfRecord3584() {
		assertEquals("Anchorage", customers.get(3583).getCity());
	}

	@Test
	@DisplayName("Record 3584: County is Anchorage")
	void CountyOfRecord3584() {
		assertEquals("Anchorage", customers.get(3583).getCounty());
	}

	@Test
	@DisplayName("Record 3584: State is AK")
	void StateOfRecord3584() {
		assertEquals("AK", customers.get(3583).getState());
	}

	@Test
	@DisplayName("Record 3584: ZIP is 99507")
	void ZIPOfRecord3584() {
		assertEquals("99507", customers.get(3583).getZIP());
	}

	@Test
	@DisplayName("Record 3584: Phone is 907-349-2838")
	void PhoneOfRecord3584() {
		assertEquals("907-349-2838", customers.get(3583).getPhone());
	}

	@Test
	@DisplayName("Record 3584: Fax is 907-349-7302")
	void FaxOfRecord3584() {
		assertEquals("907-349-7302", customers.get(3583).getFax());
	}

	@Test
	@DisplayName("Record 3584: Email is evelyn@stefanelli.com")
	void EmailOfRecord3584() {
		assertEquals("evelyn@stefanelli.com", customers.get(3583).getEmail());
	}

	@Test
	@DisplayName("Record 3584: Web is http://www.evelynstefanelli.com")
	void WebOfRecord3584() {
		assertEquals("http://www.evelynstefanelli.com", customers.get(3583).getWeb());
	}
}
