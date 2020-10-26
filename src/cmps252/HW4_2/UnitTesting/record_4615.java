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

@Tag("15")
class Record_4615 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4615: FirstName is Dorothea")
	void FirstNameOfRecord4615() {
		assertEquals("Dorothea", customers.get(4614).getFirstName());
	}

	@Test
	@DisplayName("Record 4615: LastName is Nethkin")
	void LastNameOfRecord4615() {
		assertEquals("Nethkin", customers.get(4614).getLastName());
	}

	@Test
	@DisplayName("Record 4615: Company is Multitone Plastics Engrv Corp")
	void CompanyOfRecord4615() {
		assertEquals("Multitone Plastics Engrv Corp", customers.get(4614).getCompany());
	}

	@Test
	@DisplayName("Record 4615: Address is 10101 Academy Rd")
	void AddressOfRecord4615() {
		assertEquals("10101 Academy Rd", customers.get(4614).getAddress());
	}

	@Test
	@DisplayName("Record 4615: City is Philadelphia")
	void CityOfRecord4615() {
		assertEquals("Philadelphia", customers.get(4614).getCity());
	}

	@Test
	@DisplayName("Record 4615: County is Philadelphia")
	void CountyOfRecord4615() {
		assertEquals("Philadelphia", customers.get(4614).getCounty());
	}

	@Test
	@DisplayName("Record 4615: State is PA")
	void StateOfRecord4615() {
		assertEquals("PA", customers.get(4614).getState());
	}

	@Test
	@DisplayName("Record 4615: ZIP is 19114")
	void ZIPOfRecord4615() {
		assertEquals("19114", customers.get(4614).getZIP());
	}

	@Test
	@DisplayName("Record 4615: Phone is 215-632-7264")
	void PhoneOfRecord4615() {
		assertEquals("215-632-7264", customers.get(4614).getPhone());
	}

	@Test
	@DisplayName("Record 4615: Fax is 215-632-5663")
	void FaxOfRecord4615() {
		assertEquals("215-632-5663", customers.get(4614).getFax());
	}

	@Test
	@DisplayName("Record 4615: Email is dorothea@nethkin.com")
	void EmailOfRecord4615() {
		assertEquals("dorothea@nethkin.com", customers.get(4614).getEmail());
	}

	@Test
	@DisplayName("Record 4615: Web is http://www.dorotheanethkin.com")
	void WebOfRecord4615() {
		assertEquals("http://www.dorotheanethkin.com", customers.get(4614).getWeb());
	}
}
