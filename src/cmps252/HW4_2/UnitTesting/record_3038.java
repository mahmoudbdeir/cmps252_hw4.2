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

@Tag("41")
class Record_3038 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3038: FirstName is Jeremiah")
	void FirstNameOfRecord3038() {
		assertEquals("Jeremiah", customers.get(3037).getFirstName());
	}

	@Test
	@DisplayName("Record 3038: LastName is Kinson")
	void LastNameOfRecord3038() {
		assertEquals("Kinson", customers.get(3037).getLastName());
	}

	@Test
	@DisplayName("Record 3038: Company is Bank One")
	void CompanyOfRecord3038() {
		assertEquals("Bank One", customers.get(3037).getCompany());
	}

	@Test
	@DisplayName("Record 3038: Address is 7123 Interstate 30")
	void AddressOfRecord3038() {
		assertEquals("7123 Interstate 30", customers.get(3037).getAddress());
	}

	@Test
	@DisplayName("Record 3038: City is Little Rock")
	void CityOfRecord3038() {
		assertEquals("Little Rock", customers.get(3037).getCity());
	}

	@Test
	@DisplayName("Record 3038: County is Pulaski")
	void CountyOfRecord3038() {
		assertEquals("Pulaski", customers.get(3037).getCounty());
	}

	@Test
	@DisplayName("Record 3038: State is AR")
	void StateOfRecord3038() {
		assertEquals("AR", customers.get(3037).getState());
	}

	@Test
	@DisplayName("Record 3038: ZIP is 72209")
	void ZIPOfRecord3038() {
		assertEquals("72209", customers.get(3037).getZIP());
	}

	@Test
	@DisplayName("Record 3038: Phone is 501-562-7369")
	void PhoneOfRecord3038() {
		assertEquals("501-562-7369", customers.get(3037).getPhone());
	}

	@Test
	@DisplayName("Record 3038: Fax is 501-562-7354")
	void FaxOfRecord3038() {
		assertEquals("501-562-7354", customers.get(3037).getFax());
	}

	@Test
	@DisplayName("Record 3038: Email is jeremiah@kinson.com")
	void EmailOfRecord3038() {
		assertEquals("jeremiah@kinson.com", customers.get(3037).getEmail());
	}

	@Test
	@DisplayName("Record 3038: Web is http://www.jeremiahkinson.com")
	void WebOfRecord3038() {
		assertEquals("http://www.jeremiahkinson.com", customers.get(3037).getWeb());
	}
}
