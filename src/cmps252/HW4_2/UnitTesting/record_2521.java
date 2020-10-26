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

@Tag("26")
class Record_2521 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2521: FirstName is Rubin")
	void FirstNameOfRecord2521() {
		assertEquals("Rubin", customers.get(2520).getFirstName());
	}

	@Test
	@DisplayName("Record 2521: LastName is Gathers")
	void LastNameOfRecord2521() {
		assertEquals("Gathers", customers.get(2520).getLastName());
	}

	@Test
	@DisplayName("Record 2521: Company is Wolf, Edward L Esq")
	void CompanyOfRecord2521() {
		assertEquals("Wolf, Edward L Esq", customers.get(2520).getCompany());
	}

	@Test
	@DisplayName("Record 2521: Address is 2008 Victory Blvd")
	void AddressOfRecord2521() {
		assertEquals("2008 Victory Blvd", customers.get(2520).getAddress());
	}

	@Test
	@DisplayName("Record 2521: City is Staten Island")
	void CityOfRecord2521() {
		assertEquals("Staten Island", customers.get(2520).getCity());
	}

	@Test
	@DisplayName("Record 2521: County is Richmond")
	void CountyOfRecord2521() {
		assertEquals("Richmond", customers.get(2520).getCounty());
	}

	@Test
	@DisplayName("Record 2521: State is NY")
	void StateOfRecord2521() {
		assertEquals("NY", customers.get(2520).getState());
	}

	@Test
	@DisplayName("Record 2521: ZIP is 10314")
	void ZIPOfRecord2521() {
		assertEquals("10314", customers.get(2520).getZIP());
	}

	@Test
	@DisplayName("Record 2521: Phone is 718-876-5208")
	void PhoneOfRecord2521() {
		assertEquals("718-876-5208", customers.get(2520).getPhone());
	}

	@Test
	@DisplayName("Record 2521: Fax is 718-876-6654")
	void FaxOfRecord2521() {
		assertEquals("718-876-6654", customers.get(2520).getFax());
	}

	@Test
	@DisplayName("Record 2521: Email is rubin@gathers.com")
	void EmailOfRecord2521() {
		assertEquals("rubin@gathers.com", customers.get(2520).getEmail());
	}

	@Test
	@DisplayName("Record 2521: Web is http://www.rubingathers.com")
	void WebOfRecord2521() {
		assertEquals("http://www.rubingathers.com", customers.get(2520).getWeb());
	}
}
