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
class Record_3472 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3472: FirstName is Diann")
	void FirstNameOfRecord3472() {
		assertEquals("Diann", customers.get(3471).getFirstName());
	}

	@Test
	@DisplayName("Record 3472: LastName is Kofler")
	void LastNameOfRecord3472() {
		assertEquals("Kofler", customers.get(3471).getLastName());
	}

	@Test
	@DisplayName("Record 3472: Company is N Bros Co Div Natl Svc Ind Inc")
	void CompanyOfRecord3472() {
		assertEquals("N Bros Co Div Natl Svc Ind Inc", customers.get(3471).getCompany());
	}

	@Test
	@DisplayName("Record 3472: Address is 22310 20th Ave Se")
	void AddressOfRecord3472() {
		assertEquals("22310 20th Ave Se", customers.get(3471).getAddress());
	}

	@Test
	@DisplayName("Record 3472: City is Bothell")
	void CityOfRecord3472() {
		assertEquals("Bothell", customers.get(3471).getCity());
	}

	@Test
	@DisplayName("Record 3472: County is Snohomish")
	void CountyOfRecord3472() {
		assertEquals("Snohomish", customers.get(3471).getCounty());
	}

	@Test
	@DisplayName("Record 3472: State is WA")
	void StateOfRecord3472() {
		assertEquals("WA", customers.get(3471).getState());
	}

	@Test
	@DisplayName("Record 3472: ZIP is 98021")
	void ZIPOfRecord3472() {
		assertEquals("98021", customers.get(3471).getZIP());
	}

	@Test
	@DisplayName("Record 3472: Phone is 425-483-4955")
	void PhoneOfRecord3472() {
		assertEquals("425-483-4955", customers.get(3471).getPhone());
	}

	@Test
	@DisplayName("Record 3472: Fax is 425-483-4611")
	void FaxOfRecord3472() {
		assertEquals("425-483-4611", customers.get(3471).getFax());
	}

	@Test
	@DisplayName("Record 3472: Email is diann@kofler.com")
	void EmailOfRecord3472() {
		assertEquals("diann@kofler.com", customers.get(3471).getEmail());
	}

	@Test
	@DisplayName("Record 3472: Web is http://www.diannkofler.com")
	void WebOfRecord3472() {
		assertEquals("http://www.diannkofler.com", customers.get(3471).getWeb());
	}
}
