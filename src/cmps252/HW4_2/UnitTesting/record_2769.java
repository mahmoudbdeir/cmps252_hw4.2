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

@Tag("10")
class Record_2769 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2769: FirstName is Kyth")
	void FirstNameOfRecord2769() {
		assertEquals("Kyth", customers.get(2768).getFirstName());
	}

	@Test
	@DisplayName("Record 2769: LastName is Tourtellotte")
	void LastNameOfRecord2769() {
		assertEquals("Tourtellotte", customers.get(2768).getLastName());
	}

	@Test
	@DisplayName("Record 2769: Company is Ryan Robeson Staley St")
	void CompanyOfRecord2769() {
		assertEquals("Ryan Robeson Staley St", customers.get(2768).getCompany());
	}

	@Test
	@DisplayName("Record 2769: Address is 1050 Se Bishop Ave")
	void AddressOfRecord2769() {
		assertEquals("1050 Se Bishop Ave", customers.get(2768).getAddress());
	}

	@Test
	@DisplayName("Record 2769: City is Pullman")
	void CityOfRecord2769() {
		assertEquals("Pullman", customers.get(2768).getCity());
	}

	@Test
	@DisplayName("Record 2769: County is Whitman")
	void CountyOfRecord2769() {
		assertEquals("Whitman", customers.get(2768).getCounty());
	}

	@Test
	@DisplayName("Record 2769: State is WA")
	void StateOfRecord2769() {
		assertEquals("WA", customers.get(2768).getState());
	}

	@Test
	@DisplayName("Record 2769: ZIP is 99163")
	void ZIPOfRecord2769() {
		assertEquals("99163", customers.get(2768).getZIP());
	}

	@Test
	@DisplayName("Record 2769: Phone is 509-334-0638")
	void PhoneOfRecord2769() {
		assertEquals("509-334-0638", customers.get(2768).getPhone());
	}

	@Test
	@DisplayName("Record 2769: Fax is 509-334-0977")
	void FaxOfRecord2769() {
		assertEquals("509-334-0977", customers.get(2768).getFax());
	}

	@Test
	@DisplayName("Record 2769: Email is kyth@tourtellotte.com")
	void EmailOfRecord2769() {
		assertEquals("kyth@tourtellotte.com", customers.get(2768).getEmail());
	}

	@Test
	@DisplayName("Record 2769: Web is http://www.kythtourtellotte.com")
	void WebOfRecord2769() {
		assertEquals("http://www.kythtourtellotte.com", customers.get(2768).getWeb());
	}
}
