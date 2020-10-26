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

@Tag("46")
class Record_2969 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2969: FirstName is Evangeline")
	void FirstNameOfRecord2969() {
		assertEquals("Evangeline", customers.get(2968).getFirstName());
	}

	@Test
	@DisplayName("Record 2969: LastName is Monserrat")
	void LastNameOfRecord2969() {
		assertEquals("Monserrat", customers.get(2968).getLastName());
	}

	@Test
	@DisplayName("Record 2969: Company is Jesinger, Robert E Esq")
	void CompanyOfRecord2969() {
		assertEquals("Jesinger, Robert E Esq", customers.get(2968).getCompany());
	}

	@Test
	@DisplayName("Record 2969: Address is 8954 W Pico Blvd")
	void AddressOfRecord2969() {
		assertEquals("8954 W Pico Blvd", customers.get(2968).getAddress());
	}

	@Test
	@DisplayName("Record 2969: City is Los Angeles")
	void CityOfRecord2969() {
		assertEquals("Los Angeles", customers.get(2968).getCity());
	}

	@Test
	@DisplayName("Record 2969: County is Los Angeles")
	void CountyOfRecord2969() {
		assertEquals("Los Angeles", customers.get(2968).getCounty());
	}

	@Test
	@DisplayName("Record 2969: State is CA")
	void StateOfRecord2969() {
		assertEquals("CA", customers.get(2968).getState());
	}

	@Test
	@DisplayName("Record 2969: ZIP is 90035")
	void ZIPOfRecord2969() {
		assertEquals("90035", customers.get(2968).getZIP());
	}

	@Test
	@DisplayName("Record 2969: Phone is 310-276-9649")
	void PhoneOfRecord2969() {
		assertEquals("310-276-9649", customers.get(2968).getPhone());
	}

	@Test
	@DisplayName("Record 2969: Fax is 310-276-9859")
	void FaxOfRecord2969() {
		assertEquals("310-276-9859", customers.get(2968).getFax());
	}

	@Test
	@DisplayName("Record 2969: Email is evangeline@monserrat.com")
	void EmailOfRecord2969() {
		assertEquals("evangeline@monserrat.com", customers.get(2968).getEmail());
	}

	@Test
	@DisplayName("Record 2969: Web is http://www.evangelinemonserrat.com")
	void WebOfRecord2969() {
		assertEquals("http://www.evangelinemonserrat.com", customers.get(2968).getWeb());
	}
}
