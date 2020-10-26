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

@Tag("12")
class Record_2387 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2387: FirstName is Mark")
	void FirstNameOfRecord2387() {
		assertEquals("Mark", customers.get(2386).getFirstName());
	}

	@Test
	@DisplayName("Record 2387: LastName is Marchal")
	void LastNameOfRecord2387() {
		assertEquals("Marchal", customers.get(2386).getLastName());
	}

	@Test
	@DisplayName("Record 2387: Company is Continental Association")
	void CompanyOfRecord2387() {
		assertEquals("Continental Association", customers.get(2386).getCompany());
	}

	@Test
	@DisplayName("Record 2387: Address is 770 A St")
	void AddressOfRecord2387() {
		assertEquals("770 A St", customers.get(2386).getAddress());
	}

	@Test
	@DisplayName("Record 2387: City is Hayward")
	void CityOfRecord2387() {
		assertEquals("Hayward", customers.get(2386).getCity());
	}

	@Test
	@DisplayName("Record 2387: County is Alameda")
	void CountyOfRecord2387() {
		assertEquals("Alameda", customers.get(2386).getCounty());
	}

	@Test
	@DisplayName("Record 2387: State is CA")
	void StateOfRecord2387() {
		assertEquals("CA", customers.get(2386).getState());
	}

	@Test
	@DisplayName("Record 2387: ZIP is 94541")
	void ZIPOfRecord2387() {
		assertEquals("94541", customers.get(2386).getZIP());
	}

	@Test
	@DisplayName("Record 2387: Phone is 510-582-8673")
	void PhoneOfRecord2387() {
		assertEquals("510-582-8673", customers.get(2386).getPhone());
	}

	@Test
	@DisplayName("Record 2387: Fax is 510-582-9133")
	void FaxOfRecord2387() {
		assertEquals("510-582-9133", customers.get(2386).getFax());
	}

	@Test
	@DisplayName("Record 2387: Email is mark@marchal.com")
	void EmailOfRecord2387() {
		assertEquals("mark@marchal.com", customers.get(2386).getEmail());
	}

	@Test
	@DisplayName("Record 2387: Web is http://www.markmarchal.com")
	void WebOfRecord2387() {
		assertEquals("http://www.markmarchal.com", customers.get(2386).getWeb());
	}
}
