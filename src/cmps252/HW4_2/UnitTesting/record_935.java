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

@Tag("48")
class Record_935 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 935: FirstName is Claire")
	void FirstNameOfRecord935() {
		assertEquals("Claire", customers.get(934).getFirstName());
	}

	@Test
	@DisplayName("Record 935: LastName is Plumbar")
	void LastNameOfRecord935() {
		assertEquals("Plumbar", customers.get(934).getLastName());
	}

	@Test
	@DisplayName("Record 935: Company is Wayne Steel Co Inc")
	void CompanyOfRecord935() {
		assertEquals("Wayne Steel Co Inc", customers.get(934).getCompany());
	}

	@Test
	@DisplayName("Record 935: Address is 175 W Jackson Blvd")
	void AddressOfRecord935() {
		assertEquals("175 W Jackson Blvd", customers.get(934).getAddress());
	}

	@Test
	@DisplayName("Record 935: City is Chicago")
	void CityOfRecord935() {
		assertEquals("Chicago", customers.get(934).getCity());
	}

	@Test
	@DisplayName("Record 935: County is Cook")
	void CountyOfRecord935() {
		assertEquals("Cook", customers.get(934).getCounty());
	}

	@Test
	@DisplayName("Record 935: State is IL")
	void StateOfRecord935() {
		assertEquals("IL", customers.get(934).getState());
	}

	@Test
	@DisplayName("Record 935: ZIP is 60604")
	void ZIPOfRecord935() {
		assertEquals("60604", customers.get(934).getZIP());
	}

	@Test
	@DisplayName("Record 935: Phone is 312-408-4328")
	void PhoneOfRecord935() {
		assertEquals("312-408-4328", customers.get(934).getPhone());
	}

	@Test
	@DisplayName("Record 935: Fax is 312-408-7523")
	void FaxOfRecord935() {
		assertEquals("312-408-7523", customers.get(934).getFax());
	}

	@Test
	@DisplayName("Record 935: Email is claire@plumbar.com")
	void EmailOfRecord935() {
		assertEquals("claire@plumbar.com", customers.get(934).getEmail());
	}

	@Test
	@DisplayName("Record 935: Web is http://www.claireplumbar.com")
	void WebOfRecord935() {
		assertEquals("http://www.claireplumbar.com", customers.get(934).getWeb());
	}
}
