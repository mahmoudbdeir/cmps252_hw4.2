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

@Tag("49")
class Record_4016 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4016: FirstName is Douglass")
	void FirstNameOfRecord4016() {
		assertEquals("Douglass", customers.get(4015).getFirstName());
	}

	@Test
	@DisplayName("Record 4016: LastName is Denardi")
	void LastNameOfRecord4016() {
		assertEquals("Denardi", customers.get(4015).getLastName());
	}

	@Test
	@DisplayName("Record 4016: Company is M & M Direct Marketing")
	void CompanyOfRecord4016() {
		assertEquals("M & M Direct Marketing", customers.get(4015).getCompany());
	}

	@Test
	@DisplayName("Record 4016: Address is 1020 Butternut St")
	void AddressOfRecord4016() {
		assertEquals("1020 Butternut St", customers.get(4015).getAddress());
	}

	@Test
	@DisplayName("Record 4016: City is Abilene")
	void CityOfRecord4016() {
		assertEquals("Abilene", customers.get(4015).getCity());
	}

	@Test
	@DisplayName("Record 4016: County is Taylor")
	void CountyOfRecord4016() {
		assertEquals("Taylor", customers.get(4015).getCounty());
	}

	@Test
	@DisplayName("Record 4016: State is TX")
	void StateOfRecord4016() {
		assertEquals("TX", customers.get(4015).getState());
	}

	@Test
	@DisplayName("Record 4016: ZIP is 79602")
	void ZIPOfRecord4016() {
		assertEquals("79602", customers.get(4015).getZIP());
	}

	@Test
	@DisplayName("Record 4016: Phone is 325-677-2245")
	void PhoneOfRecord4016() {
		assertEquals("325-677-2245", customers.get(4015).getPhone());
	}

	@Test
	@DisplayName("Record 4016: Fax is 325-677-5367")
	void FaxOfRecord4016() {
		assertEquals("325-677-5367", customers.get(4015).getFax());
	}

	@Test
	@DisplayName("Record 4016: Email is douglass@denardi.com")
	void EmailOfRecord4016() {
		assertEquals("douglass@denardi.com", customers.get(4015).getEmail());
	}

	@Test
	@DisplayName("Record 4016: Web is http://www.douglassdenardi.com")
	void WebOfRecord4016() {
		assertEquals("http://www.douglassdenardi.com", customers.get(4015).getWeb());
	}
}
