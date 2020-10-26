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

@Tag("19")
class Record_4465 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4465: FirstName is Bertram")
	void FirstNameOfRecord4465() {
		assertEquals("Bertram", customers.get(4464).getFirstName());
	}

	@Test
	@DisplayName("Record 4465: LastName is beambach")
	void LastNameOfRecord4465() {
		assertEquals("beambach", customers.get(4464).getLastName());
	}

	@Test
	@DisplayName("Record 4465: Company is Alaska Laminated Signs")
	void CompanyOfRecord4465() {
		assertEquals("Alaska Laminated Signs", customers.get(4464).getCompany());
	}

	@Test
	@DisplayName("Record 4465: Address is 5715 32nd Ave")
	void AddressOfRecord4465() {
		assertEquals("5715 32nd Ave", customers.get(4464).getAddress());
	}

	@Test
	@DisplayName("Record 4465: City is Woodside")
	void CityOfRecord4465() {
		assertEquals("Woodside", customers.get(4464).getCity());
	}

	@Test
	@DisplayName("Record 4465: County is Queens")
	void CountyOfRecord4465() {
		assertEquals("Queens", customers.get(4464).getCounty());
	}

	@Test
	@DisplayName("Record 4465: State is NY")
	void StateOfRecord4465() {
		assertEquals("NY", customers.get(4464).getState());
	}

	@Test
	@DisplayName("Record 4465: ZIP is 11377")
	void ZIPOfRecord4465() {
		assertEquals("11377", customers.get(4464).getZIP());
	}

	@Test
	@DisplayName("Record 4465: Phone is 718-278-9288")
	void PhoneOfRecord4465() {
		assertEquals("718-278-9288", customers.get(4464).getPhone());
	}

	@Test
	@DisplayName("Record 4465: Fax is 718-278-9297")
	void FaxOfRecord4465() {
		assertEquals("718-278-9297", customers.get(4464).getFax());
	}

	@Test
	@DisplayName("Record 4465: Email is bertram@beambach.com")
	void EmailOfRecord4465() {
		assertEquals("bertram@beambach.com", customers.get(4464).getEmail());
	}

	@Test
	@DisplayName("Record 4465: Web is http://www.bertrambeambach.com")
	void WebOfRecord4465() {
		assertEquals("http://www.bertrambeambach.com", customers.get(4464).getWeb());
	}
}
