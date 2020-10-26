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

@Tag("17")
class Record_3656 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3656: FirstName is Douglas")
	void FirstNameOfRecord3656() {
		assertEquals("Douglas", customers.get(3655).getFirstName());
	}

	@Test
	@DisplayName("Record 3656: LastName is Herny")
	void LastNameOfRecord3656() {
		assertEquals("Herny", customers.get(3655).getLastName());
	}

	@Test
	@DisplayName("Record 3656: Company is Mets Software")
	void CompanyOfRecord3656() {
		assertEquals("Mets Software", customers.get(3655).getCompany());
	}

	@Test
	@DisplayName("Record 3656: Address is Route 23")
	void AddressOfRecord3656() {
		assertEquals("Route 23", customers.get(3655).getAddress());
	}

	@Test
	@DisplayName("Record 3656: City is Oneonta")
	void CityOfRecord3656() {
		assertEquals("Oneonta", customers.get(3655).getCity());
	}

	@Test
	@DisplayName("Record 3656: County is Otsego")
	void CountyOfRecord3656() {
		assertEquals("Otsego", customers.get(3655).getCounty());
	}

	@Test
	@DisplayName("Record 3656: State is NY")
	void StateOfRecord3656() {
		assertEquals("NY", customers.get(3655).getState());
	}

	@Test
	@DisplayName("Record 3656: ZIP is 13820")
	void ZIPOfRecord3656() {
		assertEquals("13820", customers.get(3655).getZIP());
	}

	@Test
	@DisplayName("Record 3656: Phone is 607-432-4743")
	void PhoneOfRecord3656() {
		assertEquals("607-432-4743", customers.get(3655).getPhone());
	}

	@Test
	@DisplayName("Record 3656: Fax is 607-432-2361")
	void FaxOfRecord3656() {
		assertEquals("607-432-2361", customers.get(3655).getFax());
	}

	@Test
	@DisplayName("Record 3656: Email is douglas@herny.com")
	void EmailOfRecord3656() {
		assertEquals("douglas@herny.com", customers.get(3655).getEmail());
	}

	@Test
	@DisplayName("Record 3656: Web is http://www.douglasherny.com")
	void WebOfRecord3656() {
		assertEquals("http://www.douglasherny.com", customers.get(3655).getWeb());
	}
}
