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
class Record_3294 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3294: FirstName is Jarod")
	void FirstNameOfRecord3294() {
		assertEquals("Jarod", customers.get(3293).getFirstName());
	}

	@Test
	@DisplayName("Record 3294: LastName is Tilmon")
	void LastNameOfRecord3294() {
		assertEquals("Tilmon", customers.get(3293).getLastName());
	}

	@Test
	@DisplayName("Record 3294: Company is Medcon Financial Services")
	void CompanyOfRecord3294() {
		assertEquals("Medcon Financial Services", customers.get(3293).getCompany());
	}

	@Test
	@DisplayName("Record 3294: Address is Convention")
	void AddressOfRecord3294() {
		assertEquals("Convention", customers.get(3293).getAddress());
	}

	@Test
	@DisplayName("Record 3294: City is Buffalo")
	void CityOfRecord3294() {
		assertEquals("Buffalo", customers.get(3293).getCity());
	}

	@Test
	@DisplayName("Record 3294: County is Erie")
	void CountyOfRecord3294() {
		assertEquals("Erie", customers.get(3293).getCounty());
	}

	@Test
	@DisplayName("Record 3294: State is NY")
	void StateOfRecord3294() {
		assertEquals("NY", customers.get(3293).getState());
	}

	@Test
	@DisplayName("Record 3294: ZIP is 14202")
	void ZIPOfRecord3294() {
		assertEquals("14202", customers.get(3293).getZIP());
	}

	@Test
	@DisplayName("Record 3294: Phone is 716-854-2687")
	void PhoneOfRecord3294() {
		assertEquals("716-854-2687", customers.get(3293).getPhone());
	}

	@Test
	@DisplayName("Record 3294: Fax is 716-854-7588")
	void FaxOfRecord3294() {
		assertEquals("716-854-7588", customers.get(3293).getFax());
	}

	@Test
	@DisplayName("Record 3294: Email is jarod@tilmon.com")
	void EmailOfRecord3294() {
		assertEquals("jarod@tilmon.com", customers.get(3293).getEmail());
	}

	@Test
	@DisplayName("Record 3294: Web is http://www.jarodtilmon.com")
	void WebOfRecord3294() {
		assertEquals("http://www.jarodtilmon.com", customers.get(3293).getWeb());
	}
}
