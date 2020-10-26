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

@Tag("4")
class Record_176 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 176: FirstName is Agustin")
	void FirstNameOfRecord176() {
		assertEquals("Agustin", customers.get(175).getFirstName());
	}

	@Test
	@DisplayName("Record 176: LastName is Rief")
	void LastNameOfRecord176() {
		assertEquals("Rief", customers.get(175).getLastName());
	}

	@Test
	@DisplayName("Record 176: Company is S D Warren Federal Credit Un")
	void CompanyOfRecord176() {
		assertEquals("S D Warren Federal Credit Un", customers.get(175).getCompany());
	}

	@Test
	@DisplayName("Record 176: Address is 7307 88th St")
	void AddressOfRecord176() {
		assertEquals("7307 88th St", customers.get(175).getAddress());
	}

	@Test
	@DisplayName("Record 176: City is Ridgewood")
	void CityOfRecord176() {
		assertEquals("Ridgewood", customers.get(175).getCity());
	}

	@Test
	@DisplayName("Record 176: County is Queens")
	void CountyOfRecord176() {
		assertEquals("Queens", customers.get(175).getCounty());
	}

	@Test
	@DisplayName("Record 176: State is NY")
	void StateOfRecord176() {
		assertEquals("NY", customers.get(175).getState());
	}

	@Test
	@DisplayName("Record 176: ZIP is 11385")
	void ZIPOfRecord176() {
		assertEquals("11385", customers.get(175).getZIP());
	}

	@Test
	@DisplayName("Record 176: Phone is 718-275-5746")
	void PhoneOfRecord176() {
		assertEquals("718-275-5746", customers.get(175).getPhone());
	}

	@Test
	@DisplayName("Record 176: Fax is 718-275-5433")
	void FaxOfRecord176() {
		assertEquals("718-275-5433", customers.get(175).getFax());
	}

	@Test
	@DisplayName("Record 176: Email is agustin@rief.com")
	void EmailOfRecord176() {
		assertEquals("agustin@rief.com", customers.get(175).getEmail());
	}

	@Test
	@DisplayName("Record 176: Web is http://www.agustinrief.com")
	void WebOfRecord176() {
		assertEquals("http://www.agustinrief.com", customers.get(175).getWeb());
	}
}
