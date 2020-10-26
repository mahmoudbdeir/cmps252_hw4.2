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
class Record_3638 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3638: FirstName is Jake")
	void FirstNameOfRecord3638() {
		assertEquals("Jake", customers.get(3637).getFirstName());
	}

	@Test
	@DisplayName("Record 3638: LastName is Humbel")
	void LastNameOfRecord3638() {
		assertEquals("Humbel", customers.get(3637).getLastName());
	}

	@Test
	@DisplayName("Record 3638: Company is Central Texas Home Rentals")
	void CompanyOfRecord3638() {
		assertEquals("Central Texas Home Rentals", customers.get(3637).getCompany());
	}

	@Test
	@DisplayName("Record 3638: Address is 624 Pittsford Victor Rd")
	void AddressOfRecord3638() {
		assertEquals("624 Pittsford Victor Rd", customers.get(3637).getAddress());
	}

	@Test
	@DisplayName("Record 3638: City is Pittsford")
	void CityOfRecord3638() {
		assertEquals("Pittsford", customers.get(3637).getCity());
	}

	@Test
	@DisplayName("Record 3638: County is Monroe")
	void CountyOfRecord3638() {
		assertEquals("Monroe", customers.get(3637).getCounty());
	}

	@Test
	@DisplayName("Record 3638: State is NY")
	void StateOfRecord3638() {
		assertEquals("NY", customers.get(3637).getState());
	}

	@Test
	@DisplayName("Record 3638: ZIP is 14534")
	void ZIPOfRecord3638() {
		assertEquals("14534", customers.get(3637).getZIP());
	}

	@Test
	@DisplayName("Record 3638: Phone is 585-865-0730")
	void PhoneOfRecord3638() {
		assertEquals("585-865-0730", customers.get(3637).getPhone());
	}

	@Test
	@DisplayName("Record 3638: Fax is 585-865-0063")
	void FaxOfRecord3638() {
		assertEquals("585-865-0063", customers.get(3637).getFax());
	}

	@Test
	@DisplayName("Record 3638: Email is jake@humbel.com")
	void EmailOfRecord3638() {
		assertEquals("jake@humbel.com", customers.get(3637).getEmail());
	}

	@Test
	@DisplayName("Record 3638: Web is http://www.jakehumbel.com")
	void WebOfRecord3638() {
		assertEquals("http://www.jakehumbel.com", customers.get(3637).getWeb());
	}
}
